package firstlab;

public class Store implements Quarters {
    private String name;
    private String address;
    private double area;
    private int quantityRack;
    private int[] quantityShelf;

    public Store() {
    } // default builder

    public Store(String name,String address,double area,int quantityRack,int[] quantityShelf ) {
        this.name = name;
        this.address = address;
        this.area = area;
        this.quantityRack = quantityRack;
        this.quantityShelf = quantityShelf;
    } //builder with arguments

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getQuantityRack() {
        return quantityRack;
    }

    public void setQuantityRack(int quantityRack ) {
        this.quantityRack = quantityRack;
    }

    public int[] getQuantityShelf() {
        return quantityShelf;
    }

    public void setQuantityShelf(int[] quantityShelf) {
        this.quantityShelf = quantityShelf;
    }

    public double getAverageQuantityShelf() {
        int total = 0;
        double result;
        for (int i = 0; i < quantityShelf.length; i++) {
            total = total + quantityShelf[i];
        }
        result = total/quantityRack;
        return result;
    }

    public String toString() {
        String s = name +" "+address + " " + area + " " + quantityShelf.length + " ";
        for (int i = 0; i<quantityShelf.length-1; i++) {
            s+= quantityShelf[i] + " ";
        }
        s+= quantityShelf[quantityShelf.length-1];
        return s;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
          return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public QuartersDTO searchByArea (double area, Quarters[] quarters) {

        for (int i = 0; i < quarters.length; i++){
            if (quarters[i].getArea() == area) {
                return new QuartersDTO(quarters[i].getName(),quarters[i].getAddress());

            }
        }

        return null;

    }

}
