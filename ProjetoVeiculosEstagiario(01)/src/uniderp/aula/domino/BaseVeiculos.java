package uniderp.aula.domino;

public abstract class BaseVeiculos {
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String chassi;
    protected String placa; 
    protected int anomodelo;
    protected int anofabricação;
    protected int eixos;
    protected double pesoliquido;
    protected double pesototal;
    protected int assentos;
    protected int rodas;
    protected String fabricante;
    protected double potencia;
    protected String tipocombustivel;
    protected String codigorenavam;
    protected String nomeproprietario;
    protected String estadouf;
    protected String cidadeuf;
    protected String tipoveiculo;
    protected int qtdemotores;
    protected int qtdeocupantes;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAnomodelo() {
        return anomodelo;
    }
    public void setAnomodelo(int anomodelo) {
        this.anomodelo = anomodelo;
    }
    public int getAnofabricação() {
        return anofabricação;
    }
    public void setAnofabricação(int anofabricação) {
        this.anofabricação = anofabricação;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public double getPesoliquido() {
        return pesoliquido;
    }
    public void setPesoliquido(double pesoliquido) {
        this.pesoliquido = pesoliquido;
    }
    public double getPesototal() {
        return pesototal;
    }
    public void setPesototal(double pesototal) {
        this.pesototal = pesototal;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipocombustivel() {
        return tipocombustivel;
    }
    public void setTipocombustivel(String tipocombustivel) {
        this.tipocombustivel = tipocombustivel;
    }
    public String getCodigorenavam() {
        return codigorenavam;
    }
    public void setCodigorenavam(String codigorenavam) {
        this.codigorenavam = codigorenavam;
    }
    public String getNomeproprietario() {
        return nomeproprietario;
    }
    public void setNomeproprietario(String nomeproprietario) {
        this.nomeproprietario = nomeproprietario;
    }
    public String getEstadouf() {
        return estadouf;
    }
    public void setEstadouf(String estadouf) {
        this.estadouf = estadouf;
    }
    public String getCidadeuf() {
        return cidadeuf;
    }
    public void setCidadeuf(String cidadeuf) {
        this.cidadeuf = cidadeuf;
    }
    public String getTipoveiculo() {
        return tipoveiculo;
    }
    public void setTipoveiculo(String tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }
    public int getQtdemotores() {
        return qtdemotores;
    }
    public void setQtdemotores(int qtdemotores) {
        this.qtdemotores = qtdemotores;
    }
    public int getQtdeocupantes() {
        return qtdeocupantes;
    }
    public void setQtdeocupantes(int qtdeocupantes) {
        this.qtdeocupantes = qtdeocupantes;
    }
    public BaseVeiculos(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anomodelo,
            int anofabricação, int eixos, double pesoliquido, double pesototal, int assentos, int rodas,
            String fabricante, double potencia, String tipocombustivel, String codigorenavam, String nomeproprietario,
            String estadouf, String cidadeuf, String tipoveiculo, int qtdemotores, int qtdeocupantes) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.anomodelo = anomodelo;
        this.anofabricação = anofabricação;
        this.eixos = eixos;
        this.pesoliquido = pesoliquido;
        this.pesototal = pesototal;
        this.assentos = assentos;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipocombustivel = tipocombustivel;
        this.codigorenavam = codigorenavam;
        this.nomeproprietario = nomeproprietario;
        this.estadouf = estadouf;
        this.cidadeuf = cidadeuf;
        this.tipoveiculo = tipoveiculo;
        this.qtdemotores = qtdemotores;
        this.qtdeocupantes = qtdeocupantes;
    }
    
    
}

