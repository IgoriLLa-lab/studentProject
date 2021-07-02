package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.register.Child;
import edu.javacourse.studentorder.domain.register.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;

import java.util.Iterator;
import java.util.List;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    public String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterCheckerResponse hans = personChecker.chekPerson(so.getHusband());
            CityRegisterCheckerResponse wans = personChecker.chekPerson(so.getWife());

            List<Child> children = so.getChildren();
            //по номеру
            for (int i = 0;i<so.getChildren().size(); i++ ){
                CityRegisterCheckerResponse cans =
                        personChecker.chekPerson(children.get(i));
            }
                // с помощью итерратора
            for (Iterator<Child> it = children.iterator(); it.hasNext(); ){
              Child child = it.next();
                CityRegisterCheckerResponse cans =
                        personChecker.chekPerson(child);
            }
            //фор цикл
            for (Child child: children) {
                CityRegisterCheckerResponse cans =
                        personChecker.chekPerson(child);
            }


        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
