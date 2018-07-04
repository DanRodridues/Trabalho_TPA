/*
 * SERVICOS DE MANUTENCAO
 */
package dns.manutenções.model;
/**
 *
 * @author danie_000
 */
public class Peca
{
    private final String codigo;
    private final String nome;
    private final float preco;
    private float valor;

    public String getCodigo()
    {
        return codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public float getPreco()
    {
        return preco;
    }

    public float getValor()
    {
        return valor;
    }

    public void setValor(float valor)
    {
        this.valor = valor;
    }

    public Peca(String codigo, String nome, float preco, float valor)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.valor = valor;
    }
}
