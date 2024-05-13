package builder;

import java.util.Date;

public class FuncionarioBuilder {
    private Funcionario funcionario;

    public FuncionarioBuilder(){funcionario = new Funcionario();}

    public Funcionario build(){
    if (funcionario.getCodFuncionario() == 0){
    throw new IllegalArgumentException("Codigo de Funcionario Invalido");
    }
    if (funcionario.getNome().equals("")){
    throw new IllegalArgumentException("Nome Invalido");
    }
    if (funcionario.getCargo().equals("")){
    throw new IllegalArgumentException("Cargo Invalido");
    }
    return funcionario;
    }

    public FuncionarioBuilder setCodFuncionario(int codFuncionario){
    funcionario.setCodFuncionario(codFuncionario);
    return this;
    }

    public FuncionarioBuilder setNome( String nome){
        funcionario.setNome(nome);
        return this;
    }

    public FuncionarioBuilder setCargo(String cargo){
        funcionario.setCargo(cargo);
        return this;
    }

    public FuncionarioBuilder setDataNascimento(Date dataNascimento){
        funcionario.setDataNascimento(dataNascimento);
        return this;
    }

    public FuncionarioBuilder setEmail(String email){
        funcionario.setEmail(email);
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf){
        funcionario.setCpf(cpf);
        return this;
    }

    public FuncionarioBuilder setRg(String rg){
        funcionario.setRg(rg);
        return this;
    }

    public FuncionarioBuilder setCelular(String celular){
        funcionario.setCelular(celular);
        return this;
    }

    public FuncionarioBuilder setEnderecoLogadouro(String enderecoLoogadouro){
        funcionario.setEnderecoLogadouro(enderecoLoogadouro);
        return this;
    }

    public FuncionarioBuilder setEnderecoNumero(String enderecoNumero){
        funcionario.setEnderecoNumero(enderecoNumero);
        return this;
    }
}
