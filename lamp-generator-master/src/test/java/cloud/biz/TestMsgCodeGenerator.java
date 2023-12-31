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
public class TestMsgCodeGenerator {
    /***
     * 注意，想要在这里直接运行，需要手动增加 mysql 驱动
     * @param args
     */
    public static void main(String[] args) {
//        CodeGeneratorConfig build = buildSmsEntity();
        CodeGeneratorConfig build = buildMsgEntity();
        // 项目、配置文件的前缀
        build.setProjectPrefix("lamp");
        // lamp-cloud 或者 lamp-boot 项目的 包
        build.setGroupId("top.tangyh.lamp");
        // lamp-util 项目的 包
        build.setUtilPackage("top.tangyh.basic");

        build.setUsername("root");
        build.setPassword("root");

        String path = "/Users/tangyh/gitlab/lamp-cloud-plus/lamp-msg";
        System.err.println("输出路径：" + path);
        build.setProjectRootPath(path);

        FileCreateConfig fileCreateConfig = new FileCreateConfig(null);
//        FileCreateConfig fileCreateConfig = new FileCreateConfig(GenerateType.OVERRIDE);
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
                EntityFiledType.builder().name("providerType").table("e_sms_template")
                        .packagePath("top.tangyh.lamp.sms.enumeration.ProviderType").gen(GenerateType.IGNORE).build()
        ));
        build.setFiledTypes(filedTypes);

        build.setPackageBase(build.getGroupId() + "." + build.getChildModuleName());

        CodeGenerator.run(build);
    }


    public static CodeGeneratorConfig buildSmsEntity() {
        List<String> tables = Arrays.asList(
                "e_sms_template",
                "e_sms_send_status",
                "e_sms_task"
        );
        CodeGeneratorConfig build = CodeGeneratorConfig.
                build("msg", "sms", "zuihou", "e_", tables);
        build.setSuperEntity(EntityType.ENTITY);
        build.setChildPackageName("");
        build.setUrl("jdbc:mysql://127.0.0.1:3306/lamp_extend_0000?serverTimezone=CTT&characterEncoding=utf8&useUnicode=true&useSSL=false&autoReconnect=true&zeroDateTimeBehavior=convertToNull");
        return build;
    }

    private static CodeGeneratorConfig buildMsgEntity() {
        List<String> tables = Arrays.asList(
                "e_msg",
                "e_msg_receive"
        );
        CodeGeneratorConfig build = CodeGeneratorConfig.
                build("msg", "", "zuihou", "e_", tables);
        build.setSuperEntity(EntityType.ENTITY);
        build.setChildPackageName("");
        build.setUrl("jdbc:mysql://127.0.0.1:3306/lamp_extend_0000?serverTimezone=CTT&characterEncoding=utf8&useUnicode=true&useSSL=false&autoReconnect=true&zeroDateTimeBehavior=convertToNull");
        return build;
    }
}
