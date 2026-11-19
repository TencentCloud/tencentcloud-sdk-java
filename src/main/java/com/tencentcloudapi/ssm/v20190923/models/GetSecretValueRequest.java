/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSecretValueRequest extends AbstractModel {

    /**
    * <p>指定凭据的名称。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>指定要读取的凭据版本号。仅传 VersionId 时按该版本号精确读取；云产品及 Redis/MongoDB 凭据可通过 SSM_Current 读取当前版本。</p><p>入参限制：同时指定 VersionStage 时，两者必须指向同一版本，否则返回 ResourceNotFound。</p><p>自定义、云产品及 Redis/MongoDB 凭据在 VersionId 和 VersionStage 均未指定时，默认读取 Stage_Current 标签指向的版本；未设置该标签返回 InvalidParameterValue，不回退到 SSM_Current。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>用于加密返回凭据值的 PEM 格式公钥，支持 RSA 2048 和 SM2。未指定时，凭据值按原有方式返回。</p>
    */
    @SerializedName("EncryptionPublicKey")
    @Expose
    private String EncryptionPublicKey;

    /**
    * <p>非对称加密算法，仅在指定 EncryptionPublicKey 时生效。支持 SM2、SM2_C1C3C2_ASN1、RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256，默认值为 SM2。</p>
    */
    @SerializedName("EncryptionAlgorithm")
    @Expose
    private String EncryptionAlgorithm;

    /**
    * <p>用于选择凭据版本的标签。支持自定义、云产品及 Redis/MongoDB 凭据。</p><p>枚举值：</p><ul><li>Stage_Current： 读取用户设置的当前版本标签所绑定的版本。标签不会自动设置，也不会跟随账号迁移。</li></ul><p>仅支持 Stage_Current，大小写敏感。仅传标签时按绑定关系取值；与 VersionId 同时传入时必须指向同一版本。两者均不传时默认解析 Stage_Current，未设置该标签返回 InvalidParameterValue。</p>
    */
    @SerializedName("VersionStage")
    @Expose
    private String VersionStage;

    /**
     * Get <p>指定凭据的名称。</p> 
     * @return SecretName <p>指定凭据的名称。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>指定凭据的名称。</p>
     * @param SecretName <p>指定凭据的名称。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>指定要读取的凭据版本号。仅传 VersionId 时按该版本号精确读取；云产品及 Redis/MongoDB 凭据可通过 SSM_Current 读取当前版本。</p><p>入参限制：同时指定 VersionStage 时，两者必须指向同一版本，否则返回 ResourceNotFound。</p><p>自定义、云产品及 Redis/MongoDB 凭据在 VersionId 和 VersionStage 均未指定时，默认读取 Stage_Current 标签指向的版本；未设置该标签返回 InvalidParameterValue，不回退到 SSM_Current。</p> 
     * @return VersionId <p>指定要读取的凭据版本号。仅传 VersionId 时按该版本号精确读取；云产品及 Redis/MongoDB 凭据可通过 SSM_Current 读取当前版本。</p><p>入参限制：同时指定 VersionStage 时，两者必须指向同一版本，否则返回 ResourceNotFound。</p><p>自定义、云产品及 Redis/MongoDB 凭据在 VersionId 和 VersionStage 均未指定时，默认读取 Stage_Current 标签指向的版本；未设置该标签返回 InvalidParameterValue，不回退到 SSM_Current。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>指定要读取的凭据版本号。仅传 VersionId 时按该版本号精确读取；云产品及 Redis/MongoDB 凭据可通过 SSM_Current 读取当前版本。</p><p>入参限制：同时指定 VersionStage 时，两者必须指向同一版本，否则返回 ResourceNotFound。</p><p>自定义、云产品及 Redis/MongoDB 凭据在 VersionId 和 VersionStage 均未指定时，默认读取 Stage_Current 标签指向的版本；未设置该标签返回 InvalidParameterValue，不回退到 SSM_Current。</p>
     * @param VersionId <p>指定要读取的凭据版本号。仅传 VersionId 时按该版本号精确读取；云产品及 Redis/MongoDB 凭据可通过 SSM_Current 读取当前版本。</p><p>入参限制：同时指定 VersionStage 时，两者必须指向同一版本，否则返回 ResourceNotFound。</p><p>自定义、云产品及 Redis/MongoDB 凭据在 VersionId 和 VersionStage 均未指定时，默认读取 Stage_Current 标签指向的版本；未设置该标签返回 InvalidParameterValue，不回退到 SSM_Current。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>用于加密返回凭据值的 PEM 格式公钥，支持 RSA 2048 和 SM2。未指定时，凭据值按原有方式返回。</p> 
     * @return EncryptionPublicKey <p>用于加密返回凭据值的 PEM 格式公钥，支持 RSA 2048 和 SM2。未指定时，凭据值按原有方式返回。</p>
     */
    public String getEncryptionPublicKey() {
        return this.EncryptionPublicKey;
    }

    /**
     * Set <p>用于加密返回凭据值的 PEM 格式公钥，支持 RSA 2048 和 SM2。未指定时，凭据值按原有方式返回。</p>
     * @param EncryptionPublicKey <p>用于加密返回凭据值的 PEM 格式公钥，支持 RSA 2048 和 SM2。未指定时，凭据值按原有方式返回。</p>
     */
    public void setEncryptionPublicKey(String EncryptionPublicKey) {
        this.EncryptionPublicKey = EncryptionPublicKey;
    }

    /**
     * Get <p>非对称加密算法，仅在指定 EncryptionPublicKey 时生效。支持 SM2、SM2_C1C3C2_ASN1、RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256，默认值为 SM2。</p> 
     * @return EncryptionAlgorithm <p>非对称加密算法，仅在指定 EncryptionPublicKey 时生效。支持 SM2、SM2_C1C3C2_ASN1、RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256，默认值为 SM2。</p>
     */
    public String getEncryptionAlgorithm() {
        return this.EncryptionAlgorithm;
    }

    /**
     * Set <p>非对称加密算法，仅在指定 EncryptionPublicKey 时生效。支持 SM2、SM2_C1C3C2_ASN1、RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256，默认值为 SM2。</p>
     * @param EncryptionAlgorithm <p>非对称加密算法，仅在指定 EncryptionPublicKey 时生效。支持 SM2、SM2_C1C3C2_ASN1、RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256，默认值为 SM2。</p>
     */
    public void setEncryptionAlgorithm(String EncryptionAlgorithm) {
        this.EncryptionAlgorithm = EncryptionAlgorithm;
    }

    /**
     * Get <p>用于选择凭据版本的标签。支持自定义、云产品及 Redis/MongoDB 凭据。</p><p>枚举值：</p><ul><li>Stage_Current： 读取用户设置的当前版本标签所绑定的版本。标签不会自动设置，也不会跟随账号迁移。</li></ul><p>仅支持 Stage_Current，大小写敏感。仅传标签时按绑定关系取值；与 VersionId 同时传入时必须指向同一版本。两者均不传时默认解析 Stage_Current，未设置该标签返回 InvalidParameterValue。</p> 
     * @return VersionStage <p>用于选择凭据版本的标签。支持自定义、云产品及 Redis/MongoDB 凭据。</p><p>枚举值：</p><ul><li>Stage_Current： 读取用户设置的当前版本标签所绑定的版本。标签不会自动设置，也不会跟随账号迁移。</li></ul><p>仅支持 Stage_Current，大小写敏感。仅传标签时按绑定关系取值；与 VersionId 同时传入时必须指向同一版本。两者均不传时默认解析 Stage_Current，未设置该标签返回 InvalidParameterValue。</p>
     */
    public String getVersionStage() {
        return this.VersionStage;
    }

    /**
     * Set <p>用于选择凭据版本的标签。支持自定义、云产品及 Redis/MongoDB 凭据。</p><p>枚举值：</p><ul><li>Stage_Current： 读取用户设置的当前版本标签所绑定的版本。标签不会自动设置，也不会跟随账号迁移。</li></ul><p>仅支持 Stage_Current，大小写敏感。仅传标签时按绑定关系取值；与 VersionId 同时传入时必须指向同一版本。两者均不传时默认解析 Stage_Current，未设置该标签返回 InvalidParameterValue。</p>
     * @param VersionStage <p>用于选择凭据版本的标签。支持自定义、云产品及 Redis/MongoDB 凭据。</p><p>枚举值：</p><ul><li>Stage_Current： 读取用户设置的当前版本标签所绑定的版本。标签不会自动设置，也不会跟随账号迁移。</li></ul><p>仅支持 Stage_Current，大小写敏感。仅传标签时按绑定关系取值；与 VersionId 同时传入时必须指向同一版本。两者均不传时默认解析 Stage_Current，未设置该标签返回 InvalidParameterValue。</p>
     */
    public void setVersionStage(String VersionStage) {
        this.VersionStage = VersionStage;
    }

    public GetSecretValueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSecretValueRequest(GetSecretValueRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.EncryptionPublicKey != null) {
            this.EncryptionPublicKey = new String(source.EncryptionPublicKey);
        }
        if (source.EncryptionAlgorithm != null) {
            this.EncryptionAlgorithm = new String(source.EncryptionAlgorithm);
        }
        if (source.VersionStage != null) {
            this.VersionStage = new String(source.VersionStage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "EncryptionPublicKey", this.EncryptionPublicKey);
        this.setParamSimple(map, prefix + "EncryptionAlgorithm", this.EncryptionAlgorithm);
        this.setParamSimple(map, prefix + "VersionStage", this.VersionStage);

    }
}

