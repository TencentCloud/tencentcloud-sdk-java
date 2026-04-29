package com.tencentcloudapi.integration.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.provider.ProfileCredentialsProvider;
import org.junit.Test;
import java.nio.file.Path;
import java.nio.file.Files;

import static org.junit.Assert.*;

public class ProfileCredentialsProviderTest {

    @Test
    public void testGetCredentials() throws Exception {
        // 创建临时目录模拟用户主目录
        Path tempHomeDir = Files.createTempDirectory("tencentcloud-test-home");
        Path credentialsDir = tempHomeDir.resolve(".tencentcloud");
        Files.createDirectories(credentialsDir);
        Path credentialsFile = credentialsDir.resolve("credentials");

        // 保存原始user.home属性
        String originalUserHome = System.getProperty("user.home");
        
        try {
            // 设置临时目录为用户主目录
            System.setProperty("user.home", tempHomeDir.toString());
            
            // 写入配置文件内容
            String configContent = "[default]\n" +
                                 "secret_id = secret_id_test\n" +
                                 "secret_key = secret_key_test";
            Files.write(credentialsFile, configContent.getBytes());

            // 测试ProfileCredentialsProvider是否能正确读取
            ProfileCredentialsProvider provider = new ProfileCredentialsProvider();
            Credential cred = provider.getCredentials();
            
            // 验证读取的凭据是否正确
            assertEquals("secret_id_test", cred.getSecretId());
            assertEquals("secret_key_test", cred.getSecretKey());
            
        } finally {
            // 恢复原始user.home属性
            if (originalUserHome != null) {
                System.setProperty("user.home", originalUserHome);
            }
            
            // 清理临时文件
            Files.deleteIfExists(credentialsFile);
            Files.deleteIfExists(credentialsDir);
            Files.deleteIfExists(tempHomeDir);
        }
    }
}
