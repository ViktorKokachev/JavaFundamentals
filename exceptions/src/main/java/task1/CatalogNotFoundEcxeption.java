package task1;

public class CatalogNotFoundEcxeption extends Throwable {
    public CatalogNotFoundEcxeption(String string) {
        System.out.printf("Catalog %s wasn't found. \nType correct path\n", string);
    }
}
