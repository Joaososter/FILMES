public class Filme {
    public String titulo;     //atributos da classe 
    public int duracao;
    public String genero;

    public Filme(String titulo, int duracao, String genero) {

        setTitulo (titulo);   //"set" para fazer a avaliacao
        setDuracao(duracao);
        setGenero(genero);

    }

    public void setTitulo(String titulo) {    // definir titulo
        if (titulo.isEmpty()) {
            System.out.println("Erro: O titulo nao pode estar vazio.");

        } else {
            this.titulo = titulo;
        }

    }


    public void setDuracao(int duracao){ // definir duracao
        if (duracao <= 0) {
            System.out.println("Erro: A duracao deve ser maior que zero.");

        } else {
            this.duracao = duracao;
        }
    }


    public void setGenero(String genero) {  //definir genero 
        if (genero.equalsIgnoreCase("Romance") || 
            genero.equalsIgnoreCase("Terror") || 
            genero.equalsIgnoreCase("Comedia")) {
            this.genero = genero; 
        } else {
            System.out.println("Erro: O gênero deve ser Romance, Terror ou Comédia.");
        }
    }


    public void exibirInformacoes() {   
        System.out.println("Titulo: " + titulo);
        System.out.println("Duracao: " + duracao + "minutos");
        System.out.println("Genero: " + genero);
    }

    public static void main(String[] args) {
        Filme filme = new Filme("Harry Potter", 180, "terror");
        filme.exibirInformacoes();
    }










}