import java.util.Scanner;

public class MenuGerente extends MenuVendedor {

  private Scanner scanner = new Scanner(System.in);

  public void menu(String cabecalho) {
    super.menu(cabecalho);
    System.out.println("|       3 - Cadastrar vendedor       |");
    System.out.println("|------------------------------------|");
    System.out.println("|       4 - Cadastrar produto        |");
    System.out.println("|------------------------------------|");
  }

  public void renderMenu() {
    super.renderMenu();
    boolean renderMenu = true;
    while (renderMenu) {
      menu("Diretor");
      int choice = scanner.nextInt();
      
      switch (choice) {
        case 3:
          System.out.println("Cadastrando vendedor....");
          break;
        
        case 4:
          System.out.println("Cadastrando produto....");
          break;
      
        default:
          renderMenu = false;
          break;
      }
    }
  }
  
}
