package com.rrtx.shopdemolonghu.component;

import com.rrtx.security.domain.SecurityParams;
import com.rrtx.security.service.ISecurity;
import com.rrtx.security.service.impl.SecurityImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SecurityInit implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(SecurityInit.class);

    @Value("${pfx.path}")
    private String pfxPath;

    @Value("${cert.path}")
    private String certPath;

    @Value("${pfx.password}")
    private String pfxPassword;

    @Override
    public void run(ApplicationArguments applicationArguments) {
        logger.info("开始加载RSA证书");
        ISecurity security = new SecurityImpl();
        SecurityParams securityParams = new SecurityParams();
        securityParams.setRsaPrivateKeyFromType(0);
        securityParams.setRsaPublicKeyFromType(0);
        securityParams.setCertFilePath(certPath);
        securityParams.setPfxFilePath(pfxPath);
        securityParams.setPfxFileLoadPassword(pfxPassword);

        try {
            security.init(securityParams);
        } catch (Exception e) {
            logger.error("SecurityInit.run: {}", e);
        }

        logger.info("RSA证书加载完毕");
    }
}
