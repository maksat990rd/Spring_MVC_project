package peaksoft.serviceImple.service;

import peaksoft.entity.Company;

import java.util.List;

public interface CompanyService {

    void saveCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(int id);

    void updateCompany(int id,Company company);

    void deleteCompanyById(int id);
}
