package com.macnss.app.Models.Abstract;

import java.sql.Timestamp;

import com.macnss.app.Models.Abstract.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class employee extends User {

    private Timestamp email_verified_at = null;

}
