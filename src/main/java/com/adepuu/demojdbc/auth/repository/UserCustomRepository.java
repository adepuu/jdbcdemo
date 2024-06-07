package com.adepuu.demojdbc.auth.repository;

import com.adepuu.demojdbc.auth.entity.User;
import com.adepuu.demojdbc.auth.entity.rowmapper.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserCustomRepository {
    private JdbcTemplate jdbcTemplate;

    public UserCustomRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAllUsers() {
        String sql = "SELECT * FROM users";
        RowMapper<User> rowMapper = new UserRowMapper();

        return jdbcTemplate.query(sql, rowMapper).stream().toList();
    }

    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username LIKE ?";
        RowMapper<User> rowMapper = new UserRowMapper();
        return jdbcTemplate.queryForObject(sql, rowMapper, username);
    }

    public void save(User user) {
        String sql = "INSERT INTO users (username, email, display_name, avatar, quotes, created_at, updated_at, deleted_at) VALUES (?, ?, ?, ?, ?, NOW(), NOW(), NULL)";
        jdbcTemplate.update(sql, user.getUsername(), user.getEmail(), user.getDisplayName(), user.getAvatar(),  user.getQuotes());
    }
}
