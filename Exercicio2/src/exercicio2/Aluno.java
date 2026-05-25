package exercicio2;

public class Aluno {

    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;
    private double criatividade;
    private String casa;

    public Aluno(String nome, int idade, double coragem,
                 double inteligencia, double ambicao,
                 double lealdade, double estrategia,
                 double criatividade) {

        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
    }

    public void calcularCasa() {

        double grifinoria = (2 * coragem) + lealdade;

        double sonserina = (2 * ambicao) + estrategia;

        double corvinal = (2 * inteligencia) + criatividade;

        double lufalufa = ((2 * lealdade) + coragem) / 3;

        if (grifinoria >= sonserina &&
            grifinoria >= corvinal &&
            grifinoria >= lufalufa) {

            casa = "Grifinória";
        }

        else if (sonserina >= grifinoria &&
                 sonserina >= corvinal &&
                 sonserina >= lufalufa) {

            casa = "Sonserina";
        }

        else if (corvinal >= grifinoria &&
                 corvinal >= sonserina &&
                 corvinal >= lufalufa) {

            casa = "Corvinal";
        }

        else {
            casa = "Lufa-Lufa";
        }
    }

    public void exibirInformacoes() {

        System.out.println("\n===== DADOS DO ALUNO =====");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        System.out.println("Coragem: " + coragem);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Ambição: " + ambicao);
        System.out.println("Lealdade: " + lealdade);

        System.out.println("Casa escolhida: " + casa);
    }
}