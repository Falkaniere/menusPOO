import java.util.Scanner;

public class MenuVendedor {

  private Scanner scanner = new Scanner(System.in);

  public String formatCabecalho(String titulo) {
    StringBuilder sb = new StringBuilder();
    sb.append("Menu");
    sb.append(" ");
    sb.append(titulo);
    
    
    return sb.toString();
  }
  
  public void menu(String cabecalho) {
    String title = formatCabecalho(cabecalho);

    System.out.println("|-------------"+ title +"-----------|");
    System.out.println("|                                    |");
    System.out.println("|       1 - Vender                   |");
    System.out.println("|------------------------------------|");
    System.out.println("|       2 - Imprimir comprovante     |");
    System.out.println("|------------------------------------|");
  }

  public void renderMenu() {
    boolean renderMenu = true;
    while (renderMenu) {
      menu("Diretor");
      int choice = scanner.nextInt();
      
      switch (choice) {
        case 1:
          System.out.println("Venda....");
          break;
        
        case 2:
          System.out.println("Imprimento comprovante....");
          break;
      
        default:
          renderMenu = false;
          break;
      }
    }
  }
}
