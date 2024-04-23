import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menuPrincipal = new Menu();
        MenuDiretor menuDiretor = new MenuDiretor();
        MenuGerente menuGerente = new MenuGerente();
        MenuVendedor menuVendedor = new MenuVendedor();
        int escolha = 0;
  
        while (true) {
            menuPrincipal.getMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    menuDiretor.renderMenu();
                    break;
                case 2:
                    menuGerente.renderMenu();
                    break;
                case 3:
                    menuVendedor.renderMenu();
                    break;
            
                default:
                System.out.println("Escolha um menu válido");
                    break;
            }
        }
    }
}
