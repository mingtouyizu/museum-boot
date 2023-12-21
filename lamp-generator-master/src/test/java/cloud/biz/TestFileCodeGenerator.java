package cloud.biz;

import top.tangyh.lamp.generator.CodeGenerator;
import top.tangyh.lamp.generator.config.CodeGeneratorConfig;
import top.tangyh.lamp.generator.config.FileCreateConfig;
import top.tangyh.lamp.generator.type.EntityFiledType;
import top.tangyh.lamp.generator.type.EntityType;
import top.tangyh.lamp.generator.type.GenerateType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 测试代码生成权限系统的代码
 *
 * @author zuihou
 * @date 2019/05/25
 */
public class TestFileCodeGenerator {
    public static void main(String[] args) {
        CodeGeneratorConfig build = buildFileEntity();
        // 项目、配置文件的前缀
        build.setProjectPrefix("lamp");
        // lamp-cloud 或者 lamp-boot 项目的 包
        build.setGroupId("top.tangyh.lamp");
        // lamp-util 项目的 包
        build.setUtilPackage("top.tangyh.basic");

        //mysql 账号密码
        build.setUsername("root");
        build.setPassword("root");
        build.setIsBoot(false);

        String path = "/Users/tangyh/gitlab/lamp-cloud-plus/lamp-file";
        System.out.println("输出路径：" + path);
        build.setProjectRootPath(path);

        // 指定全部代码的生成策略
        GenerateType generate = GenerateType.OVERRIDE;
        generate = null;
        // 构造器传入null，下面设置的策略（setGenerate*）才会生效， 构造器传入不为null时，下面设置的策略（setGenerate*）无效，将全部使用构造器传入的策略
        FileCreateConfig fileCreateConfig = new FileCreateConfig(generate);
        fileCreateConfig.setGenerateEntity(GenerateType.OVERRIDE);
        fileCreateConfig.setGenerateEnum(GenerateType.OVERRIDE);
        fileCreateConfig.setGenerateDto(GenerateType.OVERRIDE);
        fileCreateConfig.setGenerateXml(GenerateType.OVERRIDE);
        fileCreateConfig.setGenerateDao(GenerateType.IGNORE);
        fileCreateConfig.setGenerateServiceImpl(GenerateType.IGNORE);
        fileCreateConfig.setGenerateService(GenerateType.IGNORE);
        fileCreateConfig.setGenerateController(GenerateType.IGNORE);
        build.setFileCreateConfig(fileCreateConfig);

        //手动指定枚举类 生成的路径
        Set<EntityFiledType> filedTypes = new HashSet<>();
        filedTypes.addAll(Arrays.asList(
//                EntityFiledType.builder().name("httpMethod").table("c_common_opt_log")
//                        .packagePath("top.tangyh.lamp.common.enums.HttpMethod").gen(GenerateType.IGNORE).build()
        ));
        build.setFiledTypes(filedTypes);

        build.setPackageBase(build.getGroupId() + "." + build.getChildModuleName());

        // 运行
        CodeGenerator.run(build);
    }


    private static CodeGeneratorConfig buildFileEntity() {
        List<String> tables = Arrays.asList(
                "c_attachment"
        );
        CodeGeneratorConfig build = CodeGeneratorConfig.
                build("file", "", "zuihou", "c_", tables);

        build.setSuperEntity(EntityType.ENTITY);
        build.setChildPackageName("");
        build.setUrl("jdbc:mysql://127.0.0.1:3306/lamp_base_0000?serverTimezone=CTT&characterEncoding=utf8&useUnicode=true&useSSL=false&autoReconnect=true&zeroDateTimeBehavior=convertToNull");
        return build;
    }
}
