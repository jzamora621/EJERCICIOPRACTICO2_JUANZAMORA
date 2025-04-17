package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/index", "/login").permitAll() // Permite acceso sin autenticación a estas páginas
                .anyRequest().authenticated() // Requiere autenticación para otras páginas
            .and()
            .formLogin()
                .loginPage("/login") // Página personalizada de login
                .permitAll()
            .and()
            .logout()
                .permitAll();
    }
}

