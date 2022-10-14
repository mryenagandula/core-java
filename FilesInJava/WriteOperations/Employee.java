package FilesInJava.WriteOperations;

import java.io.Serializable;

/**
 * For writing operations we need to implement Serializable
 */
public class Employee<T, E, K, V> implements Serializable {

    private T id;
    private E name;
    private K sal;
    private V company;

    public Employee() {
        System.out.println("Employee.Employee()");
    }

    public Employee(T id, E name, K sal, V company) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.company = company;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setName(E name) {
        this.name = name;
    }

    public void setSal(K sal) {
        this.sal = sal;
    }

    public void setCompany(V company) {
        this.company = company;
    }

    public T getId() {
        return id;
    }

    public E getName() {
        return name;
    }

    public K getSal() {
        return sal;
    }

    public V getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", company=" + company + "]";
    }
}
