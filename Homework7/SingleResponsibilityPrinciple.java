/*1) Переписать код в соответствии с Single Responsibility Principle:
public class Employee {
private String name;
private Date dob;
private int baseSalary;
public Employee(String name, Date dob, int baseSalary) {
this.name = name;
this.dob = dob;
this.baseSalary = baseSalary;
}
public String getEmpInfo() {
return "name - " + name + " , dob - " + dob.toString();
}
public int calculateNetSalary() {
int tax = (int) (baseSalary * 0.25);//calculate in otherway
return baseSalary - tax;
}
}

Подсказка: вынесите метод calculateNetSalary() в отдельный класс */

package for_HW_Java.Homework7;

import java.util.Date;

public class SingleResponsibilityPrinciple {

    //Класс Employee обозначает Сотрудника и влючает информацию о нем (имя, д.р., базовый оклад)
    public class Employee {
        private String name;
        private Date dob;
        private int baseSalary;

        //Конструктор класса Employee
        public Employee(String name, Date dob, int baseSalary) {
            this.name = name;
            this.dob = dob;
            this.baseSalary = baseSalary;
        }

        //Получаем инфомацию о сотруднике
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }

        //Класс для расчета заработной платы
        private class SalaryCalculator {
            public int calculateNetSalary() {
                int tax = (int) (baseSalary * 0.25); //calculate in otherway
                return baseSalary - tax;
            }
        }
    }
}

