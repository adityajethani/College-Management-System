package org.example.repository.impl;

import org.example.model.Admin;
import org.example.model.Management;

import java.util.List;

public interface AdminRepositoryImpl {
    public String registerManagement(Management management);
    Management readSingleManagement(int id);
    List<Management> readAllManagement();
    String updateSingleManagement(Management managements);
    String deleteSingleManagement(int id);
    String deleteAllManagement();

    public String registerAdmin(Admin admin);
    Admin readSingleAdmin(int id);
    List<Admin> readAllAdmin();
    String updateSingleAdmin(Admin admins);
    String deleteSingleAdmin(int id);
    String deleteAllAdmin();
}
