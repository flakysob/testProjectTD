package com.TDTestProject.testProject.dao;

import com.TDTestProject.testProject.model.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;

@Repository("MySQL")
public class ApplicationsDataAccessService implements ApplicationsDAO{
    private final JdbcTemplate jdbcTemplate; //Spring'in JdbcTemplate'i kullanarak veri kaynağına erişim

    @Autowired
    public ApplicationsDataAccessService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(String id,
                      String full_name,
                      String tc_identity_number,
                      String address,
                      String phone_number,
                      String email,
                      Date birth_date,
                      boolean has_retail_experience,
                      String reason_for_choosing_lokumcu_baba,
                      String location,
                      BigDecimal investment_amount,
                      String additional_notes) {
        // Veritabanına yeni kayıt ekleme işlemi
        String sql = "INSERT INTO applications (id, full_name, tc_identity_number, address, phone_number, email, birth_date, has_retail_experience, reason_for_choosing_lokumcu_baba, location, investment_amount, additional_notes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(
                sql,
                id,
                full_name,
                tc_identity_number,
                address,
                phone_number,
                email,
                birth_date,
                has_retail_experience,
                reason_for_choosing_lokumcu_baba,
                location,
                investment_amount,
                additional_notes
        );
    }

    @Override
    public List<Applications> SelectAllApplications() {
        // Tüm başvuruları veritabanından seçme işlemi
        String sql = "SELECT * FROM applications";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Applications.class));
    }

    @Override
    public Optional<Applications> SelectApplicationById(String id) { //Id'yi veritabanında bulur ve seçer.
        // Belirli bir kimliğe sahip başvuruyu seçme işlemi
        String sql = "SELECT * FROM applications WHERE id = ?";
        Applications application = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Applications.class));
        return Optional.ofNullable(application);
    }

    @Override
    public int deleteApplicationById(String id) { //Id ile kayıdı bulmalı ve eğer kayıt verilen id ile eşit ise kayıt silinmeli.
        // Belirli bir kimliğe sahip başvuruyu silme işlemi
        String sql = "DELETE FROM applications WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateApplicationById(String id, Applications update) {
        // Belirli bir kimliğe sahip başvuruyu güncelleme işlemi
        String sql = "UPDATE applications SET full_name = ?, tc_identity_number = ?, address = ?, phone_number = ?, email = ?, birth_date = ?, has_retail_experience = ?, reason_for_choosing_lokumcu_baba = ?, location = ?, investment_amount = ?, additional_notes = ? WHERE id = ?";
        return jdbcTemplate.update(
                sql,
                update.getFullName(),
                update.getTcIdentityNumber(),
                update.getAddress(),
                update.getPhoneNumber(),
                update.getEmail(),
                update.getBirthDate(),
                update.isHasRetailExperience(),
                update.getReasonForChoosingLokumcuBaba(),
                update.getLocation(),
                update.getInvestmentAmount(),
                update.getAdditionalNotes(),
                id
        );
    }
}
