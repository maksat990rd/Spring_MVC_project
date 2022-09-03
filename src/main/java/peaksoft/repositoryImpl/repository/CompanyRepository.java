package peaksoft.repositoryImpl.repository;

import peaksoft.entity.Company;

import java.util.List;

public interface CompanyRepository {


    void saveCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(int id);

    void updateCompany(int id, Company company);

    void deleteCompanyById(int id);



}
