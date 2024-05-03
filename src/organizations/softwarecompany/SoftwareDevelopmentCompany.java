package organizations.softwarecompany;

import commons.Organization;
import commons.Contactable;

import java.util.ArrayList;
import java.util.List;

public class SoftwareDevelopmentCompany extends Organization implements Contactable {
    private String email;
    private String address;
    private String phoneNumber;
    private List<Project> projects;

    public SoftwareDevelopmentCompany(String name) {
        setName(name);
        projects = new ArrayList<>();
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public boolean removeProject(Project project) {
        return projects.remove(project);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
