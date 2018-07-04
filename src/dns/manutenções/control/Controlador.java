/******************************************************************************/
/*                         DNS Manutenções - 2018                             */
/******************************************************************************/

package dns.manutenções.control;


import dns.manutenções.model.DNSmanutencoes;
import dns.manutenções.model.Servico;
import java.util.ArrayList;
/*
 * @author danie_000
 */
public class Controlador
{
    private ArrayList<Servico> servicos;
    
    private ControladorPecas pecas;
    private ControladorClientes clientes;
    private ControladorFuncionarios funcionarios;
    
    private DNSmanutencoes we;

    public Controlador()
    {
        this.we = DNSmanutencoes.newDNS();
        this.servicos = new ArrayList(0);
        this.pecas = new ControladorPecas();
        this.clientes = new ControladorClientes();
        this.funcionarios = new ControladorFuncionarios();
    }

    public ArrayList<Servico> getServicos()
    {
        return servicos;
    }
    
    public float realizarServico(Servico servico)
    {
        servico.setEstado(1);
        
        return servico.getValor();
    }
    
    public DNSmanutencoes getWe()
    {
        return this.we;
    }
    
    //Controllers --------------------------------------------------------------
    
    public ControladorPecas ctrlPecas()
    {
        return this.pecas;
    }
    
    public ControladorClientes ctrlClientes()
    {
        return this.clientes;
    }
    
    public ControladorFuncionarios ctrlFuncionarios()
    {
        return this.funcionarios;
    }
}
