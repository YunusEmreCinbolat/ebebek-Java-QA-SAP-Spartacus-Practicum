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
          return ((this.salary-this.tax()+(this.bonus()*4))*5/100);
        }
        else if (2021-this.hireYear>=10 && 2021-this.hireYear<20) {
          return ((this.salary-this.tax()+(this.bonus()*4))*1/10);
        }
        else if (2021-this.hireYear>=20){
            return ((this.salary-this.tax()+(this.bonus()*4))*15/100);
        }

        return 0;
    }
    public void tostring(){
        System.out.println("Calisanin adi: "+ this.name+"\n"+"Haftalik calisma saati: "+this.workHous+"\n"+"Ise giris tarihi: "+
                this.hireYear+"\n"+"Maasi: "+this.salary+"\nVergi: "+this.tax()+"\nHaftalik bonusu: "+this.bonus()+"\nMaas artisi: "+this.raiseSalary());
    }
}
