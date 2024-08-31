package com.view;

import java.util.List;
import java.util.Scanner;
import com.model.Patient;
import com.service.PatientService;
import com.service.PatientServiceImp;

public class PatientTest {
    
    public static void main(String[] args) {
        
        addPatient();
        getAllPatients();
        deletePatient();
        updatePatient();
    }
    
   
    static void addPatient() {
        
        PatientService service = new PatientServiceImp();
        char flag = 'y';
        Scanner sc = new Scanner(System.in);
        
        do {    
            Patient p = new Patient();
            
            System.out.println("Enter Name: ");
            p.setName(sc.next());
            
            System.out.println("Enter Age: ");
            p.setAge(sc.nextInt());
            
            System.out.println("Enter Address: ");
            p.setAddress(sc.next());
            
            service.addPatient(p);
            
            System.out.println("Do you want to add more patients? [y/n]");
            flag = sc.next().charAt(0);
            
        } while(flag == 'y');
        
        sc.close();
    }
    
   
    static void getAllPatients() {
        
        PatientService service = new PatientServiceImp();
        List<Patient> pList = service.getAllPatients();
                
        System.out.println(pList);
    }
    static void updatePatient() {
        PatientService service = new PatientServiceImp();
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Patient ID to update: ");
        int id = sc.nextInt();
        Patient p = new Patient();
        p.setId(id);
        System.out.println("Enter new Patient Name: ");
        p.setName(sc.next());
        System.out.println("Enter new Patient Age: ");
        p.setAge(sc.nextInt());
        System.out.println("Enter new Patient Address: ");
        p.setAddress(sc.next());
        service.updatePatient(p);
        System.out.println("Patient updated successfully.");
        getAllPatients(); 
        sc.close();
    }
    
   
    static void deletePatient() {
        PatientService service = new PatientServiceImp();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Patient ID to delete: ");
        int id = sc.nextInt();
        
        service.deletePatient(id);
        
        getAllPatients();
        
        sc.close();
    }
}
