package com.itheibai.order.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Collections;

public class MybatisPlusGenerator {
    public static void main(String[] args) {
        //获取项目父路径
        String fuPath = System.getProperty("user.dir");
        //获取项目路径
        String projectPath = fuPath + "/order-service";
        System.out.println(projectPath);
        // 需要构建一个 代码自动生成器 对象
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/cloud-order?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8",
                        "root",
                        "123456")
                .globalConfig(builder -> {
                    builder.author("itheibai") // 作者名
                            .enableSwagger() // 开启 swagger 模式
                            .commentDate("yyyy-MM-dd") // 注释日期
                            .outputDir(projectPath + "/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.itheibai.order") // 父包名
                            .moduleName("sys") // 父包模块名,生成的代码在这个包下
                            .entity("pojo") // Entity 包名
                            .service("service") // Service 包名
                            .serviceImpl("service.impl") // Service Impl 包名
                            .mapper("dao") // mapper 包名
                            .xml("mapper") // Xml 包名，默认包名 mapper.xml
                            .controller("controller") // Controller 包名
                            .other("other") // other 包名
                            .pathInfo(Collections.singletonMap(OutputFile.mapper,projectPath + "/src/main/java/com/itheibai/order/sys/dao")) // 配置mapper生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.xml,projectPath + "/src/main/resources/mapper")); // 配置mapper.xml生成路径,springboot会默认扫描
                })
                .strategyConfig(builder -> {
                    builder.addInclude("tb_order") // 增加表匹配
                            .addTablePrefix("tb_") // 过滤表前缀，如：生成的实体类名UserPojo
                            .entityBuilder()
                            .disableSerialVersionUID() // 禁用生成
                            .enableLombok()
                            .enableTableFieldAnnotation() // 开启生成实体时生成字段注解
                            .versionColumnName("version") // 乐观锁字段名（数据库）
                            .versionPropertyName("version") // 乐观锁属性名（实体）
                            .logicDeleteColumnName("deleted") // 逻辑删除字段名（数据库）
                            .logicDeletePropertyName("deleted") // 逻辑删除属性名（实体）
                            .addIgnoreColumns("age") // 添加忽略字段
                            .addTableFills(new Column("create_time", FieldFill.INSERT))
                            .addTableFills(new Column("update_time",FieldFill.INSERT_UPDATE))
                            .idType(IdType.AUTO) // 全局主键类型
                            .serviceBuilder()
                            //.superServiceClass(BaseService.class) // 设置接口类的父类
                            //.superServiceImplClass(BaseServiceImpl.class) // 设置接口实现类的父类
                            .formatServiceFileName("%sService") // 格式化Service接口文件名称
                            .formatServiceImplFileName("%sServiceImpl") // 格式化 ServiceImpl 实现类文件名称
                            .mapperBuilder()
                            .superClass(BaseMapper.class) // 设置mapper接口的父类
                            .enableMapperAnnotation() // 开启 @mapper 注解
                            .formatMapperFileName("%sDao") // 格式化 mapper 文件名称
                            .controllerBuilder()
                            .enableRestStyle(); // 开启生成 @RestController
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
