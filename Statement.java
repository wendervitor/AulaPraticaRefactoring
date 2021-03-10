public class Statement {
    public abstract String getResult(Customer aCustomer);
    public abstract String getFiguresResult(Rental aRental);
    public abstract String getFooterLines(Customer aCustomer);
    
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        
        String result = getResult(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += getFiguresResult(each);
        }
        //add footer lines
        result += getFooterLines(aCustomer);
        return result;
    }
}