package pro.ofitserov.stepik.functionalprogramming.practicallessons.t24;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
class Transaction {
    private  String uuid;
    private Long sum;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy.MM.dd HH:mm:ss", timezone="CET")
    private Date created;
    private State state;
}
