/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horse;

import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author cstuser
 */
public class ComparingHorse implements Comparator <Horse>{

    @Override
    public int compare(Horse t, Horse t1) {
        int presentYear = LocalDate.now().getYear();
        return (presentYear - t.getBirthYear()) - (presentYear - t1.getBirthYear());
    }  
}
