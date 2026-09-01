package comparator;

import model.Product;

import java.util.Comparator;

public class ProductTitleComprator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int titleCompare = o1.getTitle().compareTo(o2.getTitle());
        if (titleCompare != 0) {
            return titleCompare;
        }
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
