import javax.swing.*;

public class InvoiceGUI {
    public static void main(String[] args) {

        String title = JOptionPane.showInputDialog("Invoice Title");
        String address = JOptionPane.showInputDialog("Customer Address");

        String productName = JOptionPane.showInputDialog("Product Name");
        double unitPrice = Double.parseDouble(
                JOptionPane.showInputDialog("Unit Price"));

        int quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Quantity"));

        Product product = new Product(productName, unitPrice);
        LineItem item = new LineItem(product, quantity);

        Invoice invoice = new Invoice(title, address);
        invoice.addLineItem(item);

        String output =
                "Invoice: " + title + "\n" +
                        "Address: " + address + "\n\n" +
                        "Product: " + product.getName() + "\n" +
                        "Unit Price: $" + product.getUnitPrice() + "\n" +
                        "Quantity: " + quantity + "\n" +
                        "Line Total: $" + item.getLineTotal() + "\n\n" +
                        "Total Due: $" + invoice.getTotalDue();

        JTextArea area = new JTextArea(output);
        JOptionPane.showMessageDialog(null,
                new JScrollPane(area),
                "Invoice Display",
                JOptionPane.INFORMATION_MESSAGE);
    }
}