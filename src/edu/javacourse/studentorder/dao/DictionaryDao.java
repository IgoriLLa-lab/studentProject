package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.CountryArea;
import edu.javacourse.studentorder.domain.PassportOffice;
import edu.javacourse.studentorder.domain.RegisterOffice;
import edu.javacourse.studentorder.domain.Street;

import java.util.List;

public interface DictionaryDao {
    public List<Street> findStreets(String pattern) throws Exception;
    List<PassportOffice> findPassportOffices(String areaId) throws Exception;
    List<RegisterOffice> findRegisterOffices(String areaId) throws Exception;
    List<CountryArea> findAreas(String areaId) throws Exception;
}
