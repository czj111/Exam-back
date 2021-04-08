package cn.itcast.ex.controller;

import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
public class NoPermission {

    @Autowired
    Producer producer;
    @GetMapping("checkcode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response){
        
        try {
        //设置页面不缓存
            response.setDateHeader("Expires",0);
            response.setHeader("Cache-Control","no-store,no-chche,must-revalidate");
            response.addHeader("Cache-Control","post-check=0,pre-check=0");
            response.setHeader("Pragma","no-cache");
        //生成验证码
            String text=producer.createText();
        //创建图片
            BufferedImage image = producer.createImage(text);
        //设置输出格式
            response.setHeader("content-type","image/jpeg");
            ServletOutputStream outputStream = response.getOutputStream();
            ImageIO.write(image,"jpg",outputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
