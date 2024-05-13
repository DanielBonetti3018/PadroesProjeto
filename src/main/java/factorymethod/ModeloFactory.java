package factorymethod;

public class ModeloFactory {

    public static IModelo obterModelo(String modelo) {
        try {
            // Construct the fully qualified class name
            String className = "factorymethod." + modelo;

            // Load the class dynamically
            Class<?> clazz = Class.forName(className);

            // Check if the class implements IModelo
            if (!IModelo.class.isAssignableFrom(clazz)) {
                throw new IllegalArgumentException("Modelo inválido: " + modelo);
            }

            // Instantiate the class and cast it to IModelo
            return (IModelo) clazz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Modelo inexistente: " + modelo, e);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar instância do modelo: " + modelo, e);
        }
    }
}
