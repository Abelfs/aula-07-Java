/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author Abel F. da Silva
 */
public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria, derrotas, empates;
    
    //MÉTODOS PÚBLICOS
    public void apresentar(){
        System.out.println("LUTADOR: " + this.getNome());
        System.out.println("ORIGEM: " + this.getNacionalidade());
        System.out.println("IDADE: " + this.getIdade()+ "anos");
        System.out.println("ALTURA: " + this.getAltura() + "metros de altura");
        System.out.println("PESO: " + this.getPeso() + "Kg");
        System.out.println("GANHOU: " + this.getVitoria());
        System.out.println("PERDEU:" + this.getDerrotas());
        System.out.println("EMPATOU:" + this.getEmpates());     
    }
    public void Status(){
        System.out.println("O lutador " + this.getNome() + "é um peso " + this.getCategoria()
                + "com " + this.getVitoria() + "vitórias "+ ", " + this.getDerrotas() +"derrotas "
                + "e " + this.getEmpates() + "empates");        
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria()+1);        
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);        
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);        
    }
    //MÉTODOS ESPECIAIS

    public Lutador(String nome, String nacionalidade, int idade, float altura, 
            float peso, int vitoria, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso <52.2){
            this.categoria="INVÁLIDO";
    }else if (this.peso<=70.3){
        this.categoria="LEVE";
    } else if (this.peso<=83.9){
        this.categoria="MÉDIO";
    } else if (this.peso<=120.2){
        this.categoria="PESADO";
    } else {
            this.categoria="INVÁLIDO";
        }             
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
     
    
}
