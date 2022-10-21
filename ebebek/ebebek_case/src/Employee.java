public class Employee {
    String name;
    int salary;
    int workHous;
    int hireYear;
    public Employee(String name,int salary,int workHous,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHous=workHous;
        this.hireYear=hireYear;
    }
    public double tax(){
       if(this.salary<1000){
           return 0;
       }
       else{
           return this.salary*0.03;
       }
    }

    public int bonus(){
        if(this.workHous>40){
            return (this.workHous-40)*30;
        }
        else {
            return 0;
        }
    }
    public double raiseSalary(){
        if(2021-this.hireYear<10){
          return ((this.salary-this.tax()+(this.bonus()))*5/100);
        }
        else if (2021-this.hireYear>=10 && 2021-this.hireYear<20) {
          return ((this.salary-this.tax()+(this.bonus()))*1/10);
        }
        else if (2021-this.hireYear>=20){
            return ((this.salary-this.tax()+(this.bonus()))*15/100);
        }

        return 0;
    }
    public float taxsumbonussalary(){
        return (float) (this.salary+this.bonus()-this.tax());
    }
    public float sumsalary(){
        return (float)(this.salary+this.raiseSalary()+this.bonus());
    }
    public void tostring(){
        System.out.println("Calisanin adi: "+ this.name+"\n"+"Maasi "+this.salary+"\n"+"Calisma saati: "+this.workHous+
                "\nBaslangic yili:"+this.hireYear+
                "\nVergi: "+this.tax()+"\nBonusu: "+this.bonus()+"\nMaas artisi: "+this.raiseSalary()+
                "\nVergi ve bonuslarla birlikte maas: "+this.taxsumbonussalary()+"\nToplam Maas: "+this.sumsalary());
    }
}
