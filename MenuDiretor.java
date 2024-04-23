import java.util.Scanner;

public class MenuDiretor extends MenuGerente {

  private Scanner scanner = new Scanner(System.in);

  public MenuDiretor() {
    super();
  }

  public void menu(String cabecalho){
      super.menu(cabecalho);
      System.out.println("|       5 - Gerenciar financeiro     |");
      System.out.println("|------------------------------------|");
      System.out.println("|       6 - Emitir relatorio         |");
      System.out.println("|------------------------------------|");
  }

  public void subMenu() {
    System.out.println("\n");
    System.out.println("|--------------- Emitir Relatório -------------|");
    System.out.println("|                                              |");
    System.out.println("|       1 - Generico                           |");
    System.out.println("|----------------------------------------------|");
    System.out.println("|       2 - Filtro por produto                 |");
    System.out.println("|----------------------------------------------|");
    System.out.println("|       3 - Filtro produto e cliente           |");
    System.out.println("|----------------------------------------------|");
    System.out.println("|       4 - Filtro produto, cliente e vendedor |");
    System.out.println("|----------------------------------------------|");
    System.out.println("\n");
  }

  @Override
  public void renderMenu() {
    super.renderMenu();
    boolean renderMenu = true;
    
    while (renderMenu) {
      menu("Diretor");
      int choice = scanner.nextInt();
      
      switch (choice) {
        case 5:
          System.out.println("Gerenciando financeiro....");
          break;
        
        case 6:
          renderSubMenu();
          break;
      
        default:
          renderMenu = false;
          break;
      }
    }
  }

  public void renderSubMenu() {
    boolean renderSubMenu = true;
    int choice = 0;

    while (renderSubMenu) {
      subMenu();
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          emitirRelatorio();
          break;
        case 2:
          emitirRelatorio("Produto 1");
          break;
        case 3:
          emitirRelatorio("Produto 1", "Cliente 1");
          break;
        case 4:
          emitirRelatorio("Produto 1", "Cliente 1", "Vendedor 1");
          break;
    
        default:
          renderSubMenu = false;
          break;
      }
    } 
  }

  public void emitirRelatorio() {
    System.out.println("Emitindo relatório genérico...");
  }

  // Método para emitir relatório com filtro por produto
  public void emitirRelatorio(String produto) {
    System.out.println("Emitindo relatório com filtro por produto: " + produto);
  }

  // Método para emitir relatório com filtro por produto e cliente
  public void emitirRelatorio(String produto, String cliente) {
    System.out.println("Emitindo relatório com filtro por produto: " + produto + " e cliente: " + cliente);
  }

  // Método para emitir relatório com filtro por produto, cliente e vendedor
  public void emitirRelatorio(String produto, String cliente, String vendedor) {
    System.out.println("Emitindo relatório com filtro por produto: " + produto + ", cliente: " + cliente + " e vendedor: " + vendedor);
  }

}
