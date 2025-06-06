package org.example.service;

import org.example.model.Admin;
import org.example.model.Management;
import org.example.repository.impl.AdminRepositoryImpl;
import org.example.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AdminService implements AdminServiceImpl {
    @Autowired
    AdminRepositoryImpl repository;
    @Override
    public String registerManagement(Management management){
        return repository.registerManagement(management);
    }
    @Override
    public String createMultipleManagement(List<Management> managements) {
        String[] results=new String[managements.size()];
        for (int i=0;i< managements.size();i++) {
            results[i]=repository.registerManagement(managements.get(i));
        }
        String result=null;
        if(results.length>0){
            result="you have successfully registerd";
        }
        return result;
    }

    @Override
    public Management readSingleManagement(int id) {
        return repository.readSingleManagement(id);
    }

    @Override
    public List<Management> readMultipleManagement(List<Integer> ids) {
        List<Management> managementList=new ArrayList<>();
        for(int i=0;i< ids.size();i++){
            managementList.add(repository.readSingleManagement(ids.get(i)));
        }
        return managementList;
    }
    @Override
    public List<Management> readAllManagement() {
        return repository.readAllManagement();
    }

    @Override
    public String updateSingleManagement(Management managements) {
        return repository.updateSingleManagement(managements);
    }

    @Override
    public String updateMultipleManagement(List<Management> managementList) {
        List<String> results=new ArrayList<>();
        for(int i=0;i<managementList.size();i++){
            results.add(repository.updateSingleManagement(managementList.get(i)));
        }
        String result=null;
        if (results.size()>0){
            result="You have successfully updated";
        }
        return result;
    }

    @Override
    public String deleteSingleManagement(int id) {
        return repository.deleteSingleManagement(id);
    }

    @Override
    public String deleteMultipleManagement(List<Integer> ids) {
        List<String> results=new ArrayList<>();
        for(int i=0;i<ids.size();i++){
            results.add(repository.deleteSingleManagement(ids.get(i)));
        }
        String result=null;
        if (results.size()>0){
            result="You have successfully deleted";
        }
        return result;
    }

    @Override
    public String deleteAllManagement() {
        return repository.deleteAllManagement();
    }

    @Autowired
    AdminRepositoryImpl repository1;
    @Override
    public String registerAdmin(Admin admin){
        return repository1.registerAdmin(admin);
    }
    @Override
    public String createMultipleAdmin(List<Admin> admins) {
        String[] results=new String[admins.size()];
        for (int i=0;i< admins.size();i++) {
            results[i]=repository1.registerAdmin(admins.get(i));
        }
        String result=null;
        if(results.length>0){
            result="you have successfully registerd";
        }
        return result;
    }

    @Override
    public Admin readSingleAdmin(int id) {
        return repository1.readSingleAdmin(id);
    }

    @Override
    public List<Admin> readMultipleAdmin(List<Integer> ids) {
        List<Admin> adminList=new ArrayList<>();
        for(int i=0;i< ids.size();i++){
            adminList.add(repository1.readSingleAdmin(ids.get(i)));
        }
        return adminList;
    }
    @Override
    public List<Admin> readAllAdmin() {
        return repository1.readAllAdmin();
    }

    @Override
    public String updateSingleAdmin(Admin admins) {
        return repository1.updateSingleAdmin(admins);
    }

    @Override
    public String updateMultipleAdmin(List<Admin> adminList) {
        List<String> results=new ArrayList<>();
        for(int i=0;i<adminList.size();i++){
            results.add(repository1.updateSingleAdmin(adminList.get(i)));
        }
        String result=null;
        if (results.size()>0){
            result="You have successfully updated";
        }
        return result;
    }

    @Override
    public String deleteSingleAdmin(int id) {
        return repository1.deleteSingleAdmin(id);
    }

    @Override
    public String deleteMultipleAdmin(List<Integer> ids) {
        List<String> results=new ArrayList<>();
        for(int i=0;i<ids.size();i++){
            results.add(repository1.deleteSingleAdmin(ids.get(i)));
        }
        String result=null;
        if (results.size()>0){
            result="You have successfully deleted";
        }
        return result;
    }

    @Override
    public String deleteAllAdmin() {
        return repository1.deleteAllAdmin();
    }
}
