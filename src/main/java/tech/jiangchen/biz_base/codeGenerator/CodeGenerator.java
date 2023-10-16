package tech.jiangchen.biz_base.codeGenerator;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {

    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String projectPath = userDir;
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/biz?charset=UTF8&useSSL=false",
                        "root",
                        "123456")
                .globalConfig(builder -> {
                    builder.author("jiangchen") // 设置作者
                            .outputDir(projectPath + "/src/main/java") // 指定输出目录
                            .disableOpenDir();
                })
                .packageConfig(builder -> {
                    builder.parent("tech.jiangchen.biz_base") // 设置父包名
                            .entity("entity")
                            .mapper("dao")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, projectPath + "/src/main/resources/mapper")); // 设置xml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .entityBuilder().enableLombok().idType(IdType.ASSIGN_ID).enableFileOverride() //允许实体类文件覆盖
                            .serviceBuilder().formatServiceFileName("%sService") // 设置生成的service接口文件名称的规则
                            .controllerBuilder().enableRestStyle();//开启Rest Controller
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}