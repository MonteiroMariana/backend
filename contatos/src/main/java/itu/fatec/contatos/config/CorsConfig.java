package itu.fatec.contatos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // libera CORS para todas as rotas
                        .allowedOrigins("http://localhost:4200", "https://master.d1imbbo311fsdx.amplifyapp.com", "https://javacontato.duckdns.org") // aqui você coloca as URLs do frontend permitidas
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // métodos HTTP permitidos
                        .allowedHeaders("*") // permite todos os headers
                        .allowCredentials(true); // permite cookies, autenticação, etc
            }
        };
    }
}
