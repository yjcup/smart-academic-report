package world.xuewei.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import world.xuewei.component.LoginHandlerInterceptor;

/**
 * 配置MVC相关信息
 *
 * <p>
 * ==========================================================================
 
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer, ErrorPageRegistrar {

    /**
     * 注册视图控制器
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 注册登录，忘记密码页面
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/reset.html").setViewName("reset");
        // 教师
        registry.addViewController("/publish").setViewName("teacher/publish");
        // 注册错误页面
        registry.addViewController("/error400Page").setViewName("error/400");
        registry.addViewController("/error401Page").setViewName("error/401");
        registry.addViewController("/error404Page").setViewName("error/404");
        registry.addViewController("/error500Page").setViewName("error/500");
        // 管理员
        registry.addViewController("/list-students").setViewName("admin/students");
        registry.addViewController("/list-teachers").setViewName("admin/teachers");
        registry.addViewController("/list-departments").setViewName("admin/departments");
        registry.addViewController("/list-colleges").setViewName("admin/colleges");

    }

    /**
     * 配置错误页面
     */
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage error400Page = new ErrorPage(HttpStatus.BAD_REQUEST, "/error400Page");
        ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/error401Page");
        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/error404Page");
        ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error500Page");
        registry.addErrorPages(error400Page, error401Page, error404Page, error500Page);
    }

    /**
     * 注册登录拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                // 拦截的请求
                .addPathPatterns("/**")
                // 不拦截的请求（放行）
                .excludePathPatterns(
                        "/", "/login",
                        "/error400Page", "/error401Page", "/error404Page", "/error500Page",
                        "/**/front/**", "/asserts/**", "/**/*.css", "/**/*.js", "/**/*.png ",
                        "/**/*.jpg", "/**/*.jpeg", "/**/*.gif", "/**/fonts/*", "/**/*.svg");
    }
}
