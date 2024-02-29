// Dupla
// Alisson Chaves Ferreira
// Francisco Lucas Benvindo da Silva

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
        static Scanner leitor1 = new Scanner(System.in);
        static Scanner leitor2 = new Scanner(System.in);
        static ArrayList<Livro> livros = new ArrayList<>();

    public static void main(String[] args) {
        int opc=0, tipoLivro=0;

        menu();
        do {
            
            System.out.print("Escolha uma opção: ");
            opc = leitor2.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Adicionar");
                    System.out.println("1 - Físico");
                    System.out.println("2 - Ebook");
                    tipoLivro = leitor2.nextInt();

                    if (tipoLivro == 1){
                        addFisico();
                    } else if (tipoLivro == 2) {
                        addEbook();
                    }else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2: 
                    System.out.println("Excluir"); 
                    excluir();
                    break;

                case 3: 
                    System.out.println("Exibir"); 
                    exibir(); 
                    break;

                case 4:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        menu();
        }while(opc!=4);
    }

    public static void addFisico(){
        String titulo, isbn, autor;
        int ano, qtdPaginas;
        float preco;

        System.out.print("Autor: ");
        autor = leitor1.nextLine();
        System.out.print("Titulo: ");
        titulo = leitor1.nextLine();
        System.out.print("ISBN: ");
        isbn = leitor1.nextLine();
        System.out.print("Ano: ");
        ano = leitor2.nextInt();
        System.out.print("Preço: ");
        preco = leitor2.nextFloat();
        System.out.print("Quantidade de páginas: ");
        qtdPaginas = leitor2.nextInt();

        Livro livro1 = new LivroFisico(titulo, ano, isbn, preco, autor, qtdPaginas);
        livros.add(livro1);
    }

    public static void addEbook(){
        String titulo, isbn, autor;
        int ano;
        float preco, tamanho;

        System.out.print("Autor: ");
        autor = leitor1.nextLine();
        System.out.print("Titulo: ");
        titulo = leitor1.nextLine();
        System.out.print("ISBN: ");
        isbn = leitor1.nextLine();
        System.out.print("Ano: ");
        ano = leitor2.nextInt();
        System.out.print("Preço: ");
        preco = leitor2.nextFloat();
        System.out.print("Tamanho: ");
        tamanho = leitor2.nextFloat();

        Livro livro1 = new Ebook(titulo, ano, isbn, preco, autor, tamanho);
        livros.add(livro1);
    }

    public static void excluir(){
        Boolean achou = false;
        System.out.print("ISBN do livro: ");
        String isbn = leitor1.nextLine();

        if (vazio()) {
            System.out.println("Lista vazia!"); 
        }else{
            for(Livro item:livros){
                if(item.getIsbn().equals(isbn)){
                    achou = true;
                    String titulo = item.getTitulo();
                    livros.remove(item);
                    System.out.println(titulo+" removido.");
                    break;
                }
            }
            if(!achou){
                System.out.println("O livro não foi encontrado.\n");
            }
        }
    }

    public static void exibir(){

        if(vazio()){
            System.out.println("Lista vazia!");
        }else{
            for(Livro item:livros){
                System.out.println("------------------");
                item.exibirLivro();
                System.out.println("------------------");
            }
        }   
    }

    public static void menu(){
        System.out.println("==================");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Excluir");
        System.out.println("3- Exibir");
        System.out.println("4 - Sair");
        System.out.println("==================");
    }

    public static boolean vazio(){
        if (livros.size() == 0)
            return true;
        else
            return false;
    }
}