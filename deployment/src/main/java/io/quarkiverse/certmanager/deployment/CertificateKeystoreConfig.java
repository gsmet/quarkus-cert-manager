package io.quarkiverse.certmanager.deployment;

import io.quarkus.runtime.annotations.ConfigGroup;

@ConfigGroup
public interface CertificateKeystoreConfig {
    /**
     * Create enables keystore creation for the Certificate.
     */
    boolean create();

    /**
     * The reference to a key in a Secret resource containing the password used to encrypt the keystore.
     */
    LocalObjectReferenceConfig passwordSecretRef();
}
