package ru.ponomarev.jsonb.contract;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import ru.ponomarev.jsonb.GeneralContract;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Data
@TypeDefs({@TypeDef(name = "jsonb", typeClass = ContractParams.class)})
public class Contract extends GeneralContract {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

////    @Type(type = "jsonb")
//    private ContractParams params;

    private String value;

    @Transient
    public String getNamedStringParam() {
//        return params.getStringParam();
        return null;
    }

    @Transient
    public void setNamedStringParam(String s) {
//        if (params == null) {
//            params = new ContractParams();
//        }
//        params.setStringParam(s);
    }

}
