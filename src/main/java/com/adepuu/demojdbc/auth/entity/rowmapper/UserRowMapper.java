package com.adepuu.demojdbc.auth.entity.rowmapper;

import com.adepuu.demojdbc.auth.entity.User;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
     @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
         User user = new User();
         user.setId(rs.getLong("id"));
         user.setUsername(rs.getString("username"));
         user.setEmail(rs.getString("email"));
         user.setDisplayName(rs.getString("display_name"));
         user.setAvatar(rs.getString("avatar"));
         user.setQuotes(rs.getString("quotes"));
         user.setCreatedAt(rs.getTimestamp("created_at").toInstant());
         user.setUpdatedAt(rs.getTimestamp("updated_at").toInstant());
         user.setDeletedAt(rs.getTimestamp("deleted_at").toInstant());
         return user;
     }
}
