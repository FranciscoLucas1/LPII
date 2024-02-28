//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
        static Scanner leitor1 = new Scanner(System.in);
        static Scanner leitor2 = new Scanner(System.in);
        static ArrayList<Livro> livros = new ArrayList<>();

    public static void main(String[] args) {

        int opc=0, tipoLivro=0;

        Livro livro = new Ebook("1984", 2019, "123123", 134, "Seu Jorge", 800);

        menu();
        do {
            System.out.println("Escolha uma opção");
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

        Livro livro1 = new LivroFisico("1984", 2019, "123123", 134, "Seu Jorge", 800);
        livros.add(livro1);
    }

    public static void addEbook(){

        String titulo, isbn, autor;
        int ano;
        float preco, tamanho;

        System.out.print("Autor: ");
        autor = leitor1.next();
        System.out.print("Titulo: ");
        titulo = leitor1.nextLine();
        System.out.print("ISBN: ");
        isbn = leitor1.nextLine();
        System.out.print("Ano: ");
        ano = leitor2.nextInt();
        System.out.print("Preço: ");
        preco = leitor2.nextFloat();
        System.out.print("Quantidade de páginas: ");
        tamanho = leitor2.nextInt();

        Livro livro1 = new Ebook(titulo, ano, isbn, preco, autor, tamanho);
        livros.add(livro1);
    }

    public static void excluir(Livro livro){
        livros.remove(livro);
    }

    public static void exibir(){
        for(Livro item:livros){
            item.exibirLivro();
        }
        System.out.println();

    }

    public static void menu(){
        System.out.println("1 - Adicionar");
        System.out.println("2 - Excluir");
        System.out.println("3- Exibir");
        System.out.println("4 - Sair");




    }

}




