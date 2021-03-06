/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Bhabani
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OrganTissueDonationOrganization.getValue())){
            organization = new OrganTissueDonationOrganization();
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.DonorOrganization.getValue())){
            organization = new OrganTissueDonationOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.AwarnessEventManagementOrganization.getValue())){
             organization = new AwarnessEventManagementOrganization();
            organizationList.add(organization);
        
        }
        else if(type.getValue().equals(Type.Patient.getValue())){
             organization = new PatientOrganization();
            organizationList.add(organization);
        
        }
        return organization;
    }
}
