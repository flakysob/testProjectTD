package com.TDTestProject.testProject.dao;

import com.TDTestProject.testProject.model.Applications;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("AppDAO")
public class ApplicationsDataAccessService implements ApplicationsDAO{
    private static List<Applications> DB = new ArrayList<>();


    @Override
    public int insertApplication(UUID id,
                                 String fullName,
                                 String tcIdentityNumber,
                                 String address,
                                 String phoneNumber,
                                 String email,
                                 String birthDate,
                                 boolean hasRetailExperience,
                                 String reasonForChoosingLokumcuBaba,
                                 String location,
                                 double investmentAmount,
                                 String additionalNotes) {
        DB.add(new Applications(id, fullName, tcIdentityNumber, address, phoneNumber , email, birthDate, hasRetailExperience, reasonForChoosingLokumcuBaba, location, investmentAmount, additionalNotes));
        return 1;
    }

    @Override
    public List<Applications> SelectAllApplications() {
        return DB;
    }

    @Override
    public Optional<Applications> SelectApplicationById(UUID id) { //Id'yi veritabanında bulur ve seçer.
        return DB.stream() //C#'daki LINQ gibi düşünülebilir. Koleksiyon içerisinde fonksiyonellik sunar. Burada id parametresi ile verilen değeri veritabanındaki id değeri ile eşler.
                .filter(applications -> applications.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteApplicationById(UUID id) {
        return 0;
    }

    @Override
    public int updateApplicationById(UUID id, Applications applications) {
        return 0;
    }
}
