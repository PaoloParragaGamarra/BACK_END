package com.BookFlow.usuarios.iam.infrastructure.hashing.bcrypt;

import com.BookFlow.usuarios.iam.application.internal.outboundservices.hashing.HashingService;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface BCryptHashingService extends HashingService, PasswordEncoder {
}