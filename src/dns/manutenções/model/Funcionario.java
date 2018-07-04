/*
 * SERVICOS DE MANUTENCAO
 */
package dns.manutenções.model;
/**
 *
 * @author danie_000
 */
public class Funcionario extends Registro
{
    private final String matricula;
    private float salario;

    public String getMatricula()
    {
        return matricula;
    }

    public float getSalario()
    {
        return salario;
    }

    public void setSalario(float salario)
    {
        this.salario = salario;
    }

    public Funcionario(String matricula, float salario, String nome, String endereco, String telefone)
    {
        super(nome, endereco, telefone);
        this.matricula = matricula;
        this.salario = salario;
    }
}
