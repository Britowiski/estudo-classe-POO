public class Pessoa {
    private String nome;
    private String endereco;
    private int numeroResidencia;
    private long numeroCelular;
    private long numeroCpf;

    public Pessoa(String nome, String endereco, int numeroResidencia, long numeroCelular, long numeroCpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroResidencia = numeroResidencia;
        this.numeroCelular = numeroCelular;
        this.numeroCpf = numeroCpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(int numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public long getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(long numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public void mostrarInformacao() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Número da Residência: " + numeroResidencia);
        System.out.println("Telefone Celular: " + numeroCelular);
        System.out.println("CPF: " + numeroCpf);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Wendell", "Rua teste teste teste", 150, 19999554433L, 49933322100L);
        pessoa.mostrarInformacao();
    }
}
