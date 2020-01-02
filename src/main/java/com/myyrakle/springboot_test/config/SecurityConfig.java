package com.myyrakle.springboot_test.config;

/*import com.myyrakle.springboot_test.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@AllArgsConstructor*/
public class SecurityConfig// extends WebSecurityConfigurerAdapter
{
   /* @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(WebSecurity webSecurity) throws Exception
    {
        //static 디렉터리의 이 하위 디렉터리들은 인증 필요없음
        webSecurity.ignoring().antMatchers("/css/**", "/js/**", "/images/**");
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception
    {
        httpSecurity.authorizeRequests()
                //이 페이지는 ADMIN만 접근 가능
                .antMatchers("/templates/index.html").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/admin_page").hasRole("ADMIN")
                //나머지는 전부 접근가능
            .and()
                .formLogin()
                //로그인 성공 시 이동할 페이지
                .defaultSuccessUrl("/admin_page")
                .permitAll()
            .and()
                .logout()
                .permitAll()
            .and()
                .exceptionHandling()
                .accessDeniedPage("/failed");
    }

    @Autowired
    private LoginService loginService;

    @Override
    public void configure(AuthenticationManagerBuilder authentication) throws Exception
    {
        authentication.userDetailsService(loginService).passwordEncoder(passwordEncoder());
    }*/
}
