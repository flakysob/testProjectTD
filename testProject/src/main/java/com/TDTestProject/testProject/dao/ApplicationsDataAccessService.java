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
    public int deleteApplicationById(UUID id) { //Id ile kayıdı bulmalı ve eğer kayıt verilen id ile eşit ise kayıt silinmeli.
        Optional<Applications> xApplication = SelectApplicationById(id); //Daha önceden hazırlanan id seçme metodunu kullandık.
        if(xApplication.isEmpty()) //Eğer kayıt boş döner ise (yani kayıt bulunamaz ise)
        {
            return 0;
        }
        DB.remove(xApplication.get());  //Eğer kayıt var ise örneği al ve kaldır.
        return 1;
    }



    //Belirli bir kimlikle (UUID) belirli bir başvuruyu güncellemek için kullanılır. İlk olarak, başvurunun mevcut olup olmadığını kontrol eder ve bulunursa, başvurunun koleksiyon içindeki indeksini alır. Daha sonra, başvuruyu günceller ve işlem başarılıysa 1, başarısızsa 0 döndürür.
    @Override
    public int updateApplicationById(UUID id, Applications update) {
        return SelectApplicationById(id)
                .map(a -> {
                    int indexOfApplicationToUpdate = DB.indexOf(a); //Kaydın bulunamaması durumunda -1 döner, boş ise 0 döner ve kayıdın bulunması durumunda index döner
                    if(indexOfApplicationToUpdate >= 0){ //Eğer istenen index ile eşlenirse
                        DB.set(indexOfApplicationToUpdate, new Applications(id, update.getFullName(), update.getTcIdentityNumber(), update.getAddress(), update.getPhoneNumber(), update.getEmail(), update.getBirthDate(), update.isHasRetailExperience(), update.getReasonForChoosingLokumcuBaba(), update.getLocation(), update.getInvestmentAmount(), update.getAdditionalNotes()));
                        return 1; //İşler yolunda gitti demektir.
                    }
                    return 0; //if koşulu sağlanamadı, index eşleşmedi, işler yolunda gitmedi.
                })
                .orElse( 0); //Exception
    }
}
