public  abstract class Vehicle {
    protected double CIF;
    protected int seatingCpacity;
    protected double grosWeight;
    protected int engineCpacity;
    protected int yearOfproduction;
    protected String TypePlatenumber;
    protected double AgeoftheCar;
    protected double TotalTaxs;
    protected String TransportMode;
    protected int BondParkingFees;
    public Vehicle(double CIF, int seatingCpacity, double grosWeight, int engineCpacity, int yearOfproduction, String typePlatenumber, double ageoftheCar, double totalTaxs, String transportMode, int bondParkingFees) {
        this.CIF = CIF;
        this.seatingCpacity = seatingCpacity;
        this.grosWeight = grosWeight;
        this.engineCpacity = engineCpacity;
        this.yearOfproduction = yearOfproduction;
        TypePlatenumber = typePlatenumber;
        AgeoftheCar = ageoftheCar;
        TotalTaxs = totalTaxs;
        TransportMode = transportMode;
        BondParkingFees = bondParkingFees;
    }
    abstract void calcTotalTaxRates();
    abstract void calcTransportModeFee();
    abstract void printTotalTax();
    abstract void calcBondParkingFees();
    public abstract void calcTax();
}



class Ambulance extends Vehicle {
    public Ambulance(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfproduction,
                     String TypePlatenumber, double ageofTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfproduction, TypePlatenumber, ageofTheCar,
                TotalTax, transportMode, bondParkingFees);
    }
    @Override
    void calcTotalTaxRates() {
    }
    @Override
    void calcTransportModeFee() {
    }
    @Override
    void printTotalTax() {
    }
    @Override
    void calcBondParkingFees() {
    }
    @Override
    public void calcTax() {
    }
}



class Estate extends Vehicle{
    public Estate(double CIF, int seatingCpacity, double grosWeight, int engineCpacity, int yearOfproduction, String typePlatenumber, double ageoftheCar, double totalTaxs, String transportMode, int bondParkingFees) {
        super(CIF, seatingCpacity, grosWeight, engineCpacity, yearOfproduction, typePlatenumber, ageoftheCar, totalTaxs, transportMode, bondParkingFees);
    }
    @Override
    void calcTotalTaxRates() {
        TotalTaxs += 0.25 * CIF;
        TotalTaxs += 0.18 * CIF;
        TotalTaxs += 0.06 * CIF;
        TotalTaxs += 150000;
        TotalTaxs += 35000;
        TotalTaxs += 20000;
        TotalTaxs += 200000;
        if (seatingCpacity > 5) {
            TotalTaxs += 250000;
        }
        if (seatingCpacity > 5) {
            int extraSeatingCapacity = seatingCpacity - 5;
            TotalTaxs += extraSeatingCapacity*250000;
        }
        if (grosWeight >= 1500 && grosWeight <= 2000) {
            TotalTaxs += 0.15 * CIF;
        } else if (grosWeight > 2000) {
            TotalTaxs += 0.1 * CIF;
        } else {
            TotalTaxs += 0.02 * CIF;
        }
        if (engineCpacity > 1800) {
            TotalTaxs += 0.05 * CIF;
        } else {
            TotalTaxs += 0.025 * CIF;
        }
        if (AgeoftheCar >= 1 && AgeoftheCar <= 5) {
            TotalTaxs += 0.01 * CIF;
        } else if (AgeoftheCar >= 5 && AgeoftheCar <= 10) {
            TotalTaxs += 0.05 * CIF;
        } else {
            TotalTaxs += 0.15 * CIF;
        }
    }
    void calculateTransportModeFee() {
    }
    @Override
    void calcTransportModeFee() {
    }
    @Override
    void printTotalTax() {
    }
    @Override
    void calcBondParkingFees() {
    }
    @Override
    public void calcTax() {
    }
}


class Sedan extends Vehicle {
    public Sedan(double CIF, int seatingCpacity, double grosWeight, int engineCpacity, int yearOfproduction, String typePlatenumber, double ageoftheCar, double totalTaxs, String transportMode, int bondParkingFees) {
        super(CIF, seatingCpacity, grosWeight, engineCpacity, yearOfproduction, typePlatenumber, ageoftheCar, totalTaxs, transportMode, bondParkingFees);
    }
    @Override
    void calcTotalTaxRates() {

    }
    @Override
    void calcTransportModeFee() {
    }
    @Override
    void printTotalTax() {
    }
    @Override
    void calcBondParkingFees() {
    }
    @Override
    public void calcTax() {
        TotalTaxs += 0.25 * CIF;
        TotalTaxs += 0.18 * CIF;
        TotalTaxs += 0.06 * CIF;
        TotalTaxs += 150000;
        TotalTaxs += 35000;
        TotalTaxs += 20000;
        TotalTaxs += 200000;

        if (TypePlatenumber.equals("APS")) {
            TotalTaxs += 3000000;
        } else if (TypePlatenumber.equals("DPS")) {
            TotalTaxs += 7000000;
        }
    }
    public void calculateTransportModeFee() {
        if (TransportMode.equals("Carrier")) {
            TotalTaxs += 0.005 * CIF;
        } else if (TransportMode.equals("Driven")) {
            TotalTaxs += 0.015 * CIF;
            if (grosWeight >= 1500 && grosWeight <= 2000) {
                TotalTaxs += 0.10 * CIF;
            } else if (grosWeight >= 2000) {
                TotalTaxs += 0.15 * CIF;
            } else if (grosWeight <= 2000) {
                TotalTaxs += 0.02 * CIF;
            }
            if (grosWeight > 2000) {
                TotalTaxs += 0.1 * CIF;
            } else if (engineCpacity <= 2000 && engineCpacity <= 1500) {
                TotalTaxs += 0.05 * CIF;
            } else {
                TotalTaxs += 0.025 * CIF;
            }
            if (AgeoftheCar >= 15) {
                System.out.println("can not be imported in to the country ");
            } else if (AgeoftheCar >= 10 && AgeoftheCar <= 15) {
                TotalTaxs += 0.1 * CIF;
            } else if (AgeoftheCar >= 10 && AgeoftheCar <= 5) {
                TotalTaxs += 0.05 * CIF;
            } else {
                TotalTaxs += 0.015 * CIF;
            }
        }
    }
}



class Trailer extends Vehicle{
    public Trailer(double CIF, int seatingCpacity, double grosWeight, int engineCpacity, int yearOfproduction, String typePlatenumber, double ageoftheCar, double totalTaxs, String transportMode, int bondParkingFees) {
        super(CIF, seatingCpacity, grosWeight, engineCpacity, yearOfproduction, typePlatenumber, ageoftheCar, totalTaxs, transportMode, bondParkingFees);
    }
    @Override
    void calcTotalTaxRates() {
    }
    @Override
    void calcTransportModeFee() {
    }
    @Override
    void printTotalTax() {
    }
    @Override
    void calcBondParkingFees() {
    }
    @Override
    public void calcTax() {
        TotalTaxs += 0.25 * CIF;
        TotalTaxs += 0.18 * CIF;
        TotalTaxs += 0.06 * CIF;
        TotalTaxs += 150000;
        TotalTaxs += 35000;
        TotalTaxs += 20000;
        TotalTaxs += 200000;
        if (seatingCpacity > 5) {
            int extraSeatingCapacity = seatingCpacity - 5;
            TotalTaxs += extraSeatingCapacity*250000;
        }
        if (grosWeight >=1500 && grosWeight<=2000) {
            TotalTaxs += 0.15*CIF;
        }
        else  if (grosWeight>2000)
        {
            TotalTaxs+=0.25*CIF;
        }
        else if (grosWeight <=15000)
        {
            TotalTaxs+=0.05*CIF;
        }
        if (engineCpacity > 20000) {
            TotalTaxs = 0.10*CIF;
        } else if (engineCpacity >=15000 && engineCpacity <= 20000) {
            TotalTaxs = 0.05*CIF;
        } else {
            TotalTaxs = 0.025*CIF;
        }
        if (AgeoftheCar > 15 )
        {
            System.out.println("cannot imported in this counytry");
        }
        if (AgeoftheCar >= 10 && AgeoftheCar <= 15) {
            TotalTaxs = 0.10*CIF;
        } else if (AgeoftheCar >= 5 && AgeoftheCar <= 10) {
            TotalTaxs = 0.05*CIF;
        } else {
            TotalTaxs = 0.015*CIF;
        }
    }
}



class AnyVehicle extends Vehicle{
    public AnyVehicle(double CIF, int seatingCpacity, double grosWeight, int engineCpacity, int yearOfproduction, String typePlatenumber, double ageoftheCar, double totalTaxs, String transportMode, int bondParkingFees) {
        super(CIF, seatingCpacity, grosWeight, engineCpacity, yearOfproduction, typePlatenumber, ageoftheCar, totalTaxs, transportMode, bondParkingFees);
    }
    @Override
    void calcTotalTaxRates() {
    }
    @Override
    void calcTransportModeFee() {
    }
    @Override
    void printTotalTax() {
    }
    @Override
    void calcBondParkingFees() {
    }
    @Override
    public void calcTax() {
        if (TransportMode == "carrier") {
            TotalTaxs = 0.005 * CIF;
        } else if (TransportMode == "driven") {
            TotalTaxs = 0.015 * CIF;
        } else {
            TotalTaxs = 0;
        }
        if (TypePlatenumber =="APS"){
            return ;
        } else if (TypePlatenumber == "DPS") {
            return;
        }
        else {
            TotalTaxs = 0;
        }
        if (BondParkingFees==24);{
            TotalTaxs=15000;
        }
    }
}

class min {
    public static void main(String[] args) {
        Sedan sed = new Sedan(33.5,83,26,66,76,"87gt",66,625,"hks",90);
        sed.calcBondParkingFees();
        sed.calcTax();
        sed.calculateTransportModeFee();
        sed.calcTotalTaxRates();
        sed.printTotalTax();

        Ambulance amb =new Ambulance(726.0,65,83,77,20223,"WRk7",9,80,"kms",20);
        amb.calcTax();
        amb.printTotalTax();
        amb.calcBondParkingFees();
        amb.calcTransportModeFee();
        amb.calcTotalTaxRates();

        Estate est = new Estate(15000.50,100,1500,400,2010,"YTR",2010,5000000,"barrier",2300);
        est.calcTotalTaxRates();
        est.calcTax();
        est.calcTransportModeFee();
        est.calcBondParkingFees();

        Trailer trl = new Trailer(1500.50,25,1600,1700,2020,"DRT",2018,10000,"APS",5000);
        trl.calcTax();
        trl.calcTotalTaxRates();
        trl.calcTransportModeFee();
        trl.calcBondParkingFees();

        AnyVehicle anyV = new AnyVehicle(1000.50,10,4000,25000,2012,"LKN",10,100000,"barrier",15000);
        anyV.calcTax();
        anyV.calcTotalTaxRates();
        anyV.calcBondParkingFees();
        anyV.calcTransportModeFee();
        anyV.printTotalTax();
    }
}








