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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKeyRequest extends AbstractModel {

    /**
    * <p>作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。以 kms- 作为前缀的用于云产品使用，Alias 不可重复。</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>CMK 的描述，最大1024字节</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>指定key的用途，默认为  &quot;ENCRYPT_DECRYPT&quot; 表示创建对称加解密密钥，其它支持用途 “ASYMMETRIC_DECRYPT_RSA_2048” 表示创建用于加解密的RSA2048非对称密钥，“ASYMMETRIC_DECRYPT_RSA_3072”表示创建用于加解密的RSA3072非对称密钥，“ASYMMETRIC_DECRYPT_RSA_4096”表示创建用于加解密的RSA4096非对称密钥，“ASYMMETRIC_DECRYPT_SM2” 表示创建用于加解密的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_SM2” 表示创建用于签名验签的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECC” 表示创建用于签名验签的ECC非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_2048” 表示创建用于签名验签的RSA_2048非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_3072” 表示创建用于签名验签的RSA_3072非对称密钥，<br>“ASYMMETRIC_SIGN_VERIFY_RSA_4096” 表示创建用于签名验签的RSA_4096非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECDSA384”表示创建用于签名验签的 ECDSA384 非对称密钥。完整的密钥用途与算法支持列表可通过 ListAlgorithms 接口获取。</p>
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * <p>指定key类型，默认为1，1表示默认类型，由KMS创建CMK密钥，2 表示EXTERNAL 类型，该类型需要用户导入密钥材料，参考 GetParametersForImport 和 ImportKeyMaterial 接口</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
     * Get <p>作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。以 kms- 作为前缀的用于云产品使用，Alias 不可重复。</p> 
     * @return Alias <p>作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。以 kms- 作为前缀的用于云产品使用，Alias 不可重复。</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。以 kms- 作为前缀的用于云产品使用，Alias 不可重复。</p>
     * @param Alias <p>作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。以 kms- 作为前缀的用于云产品使用，Alias 不可重复。</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>CMK 的描述，最大1024字节</p> 
     * @return Description <p>CMK 的描述，最大1024字节</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>CMK 的描述，最大1024字节</p>
     * @param Description <p>CMK 的描述，最大1024字节</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>指定key的用途，默认为  &quot;ENCRYPT_DECRYPT&quot; 表示创建对称加解密密钥，其它支持用途 “ASYMMETRIC_DECRYPT_RSA_2048” 表示创建用于加解密的RSA2048非对称密钥，“ASYMMETRIC_DECRYPT_RSA_3072”表示创建用于加解密的RSA3072非对称密钥，“ASYMMETRIC_DECRYPT_RSA_4096”表示创建用于加解密的RSA4096非对称密钥，“ASYMMETRIC_DECRYPT_SM2” 表示创建用于加解密的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_SM2” 表示创建用于签名验签的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECC” 表示创建用于签名验签的ECC非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_2048” 表示创建用于签名验签的RSA_2048非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_3072” 表示创建用于签名验签的RSA_3072非对称密钥，<br>“ASYMMETRIC_SIGN_VERIFY_RSA_4096” 表示创建用于签名验签的RSA_4096非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECDSA384”表示创建用于签名验签的 ECDSA384 非对称密钥。完整的密钥用途与算法支持列表可通过 ListAlgorithms 接口获取。</p> 
     * @return KeyUsage <p>指定key的用途，默认为  &quot;ENCRYPT_DECRYPT&quot; 表示创建对称加解密密钥，其它支持用途 “ASYMMETRIC_DECRYPT_RSA_2048” 表示创建用于加解密的RSA2048非对称密钥，“ASYMMETRIC_DECRYPT_RSA_3072”表示创建用于加解密的RSA3072非对称密钥，“ASYMMETRIC_DECRYPT_RSA_4096”表示创建用于加解密的RSA4096非对称密钥，“ASYMMETRIC_DECRYPT_SM2” 表示创建用于加解密的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_SM2” 表示创建用于签名验签的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECC” 表示创建用于签名验签的ECC非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_2048” 表示创建用于签名验签的RSA_2048非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_3072” 表示创建用于签名验签的RSA_3072非对称密钥，<br>“ASYMMETRIC_SIGN_VERIFY_RSA_4096” 表示创建用于签名验签的RSA_4096非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECDSA384”表示创建用于签名验签的 ECDSA384 非对称密钥。完整的密钥用途与算法支持列表可通过 ListAlgorithms 接口获取。</p>
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set <p>指定key的用途，默认为  &quot;ENCRYPT_DECRYPT&quot; 表示创建对称加解密密钥，其它支持用途 “ASYMMETRIC_DECRYPT_RSA_2048” 表示创建用于加解密的RSA2048非对称密钥，“ASYMMETRIC_DECRYPT_RSA_3072”表示创建用于加解密的RSA3072非对称密钥，“ASYMMETRIC_DECRYPT_RSA_4096”表示创建用于加解密的RSA4096非对称密钥，“ASYMMETRIC_DECRYPT_SM2” 表示创建用于加解密的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_SM2” 表示创建用于签名验签的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECC” 表示创建用于签名验签的ECC非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_2048” 表示创建用于签名验签的RSA_2048非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_3072” 表示创建用于签名验签的RSA_3072非对称密钥，<br>“ASYMMETRIC_SIGN_VERIFY_RSA_4096” 表示创建用于签名验签的RSA_4096非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECDSA384”表示创建用于签名验签的 ECDSA384 非对称密钥。完整的密钥用途与算法支持列表可通过 ListAlgorithms 接口获取。</p>
     * @param KeyUsage <p>指定key的用途，默认为  &quot;ENCRYPT_DECRYPT&quot; 表示创建对称加解密密钥，其它支持用途 “ASYMMETRIC_DECRYPT_RSA_2048” 表示创建用于加解密的RSA2048非对称密钥，“ASYMMETRIC_DECRYPT_RSA_3072”表示创建用于加解密的RSA3072非对称密钥，“ASYMMETRIC_DECRYPT_RSA_4096”表示创建用于加解密的RSA4096非对称密钥，“ASYMMETRIC_DECRYPT_SM2” 表示创建用于加解密的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_SM2” 表示创建用于签名验签的SM2非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECC” 表示创建用于签名验签的ECC非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_2048” 表示创建用于签名验签的RSA_2048非对称密钥，“ASYMMETRIC_SIGN_VERIFY_RSA_3072” 表示创建用于签名验签的RSA_3072非对称密钥，<br>“ASYMMETRIC_SIGN_VERIFY_RSA_4096” 表示创建用于签名验签的RSA_4096非对称密钥，“ASYMMETRIC_SIGN_VERIFY_ECDSA384”表示创建用于签名验签的 ECDSA384 非对称密钥。完整的密钥用途与算法支持列表可通过 ListAlgorithms 接口获取。</p>
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get <p>指定key类型，默认为1，1表示默认类型，由KMS创建CMK密钥，2 表示EXTERNAL 类型，该类型需要用户导入密钥材料，参考 GetParametersForImport 和 ImportKeyMaterial 接口</p> 
     * @return Type <p>指定key类型，默认为1，1表示默认类型，由KMS创建CMK密钥，2 表示EXTERNAL 类型，该类型需要用户导入密钥材料，参考 GetParametersForImport 和 ImportKeyMaterial 接口</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>指定key类型，默认为1，1表示默认类型，由KMS创建CMK密钥，2 表示EXTERNAL 类型，该类型需要用户导入密钥材料，参考 GetParametersForImport 和 ImportKeyMaterial 接口</p>
     * @param Type <p>指定key类型，默认为1，1表示默认类型，由KMS创建CMK密钥，2 表示EXTERNAL 类型，该类型需要用户导入密钥材料，参考 GetParametersForImport 和 ImportKeyMaterial 接口</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。</p> 
     * @return HsmClusterId <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。</p>
     * @param HsmClusterId <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。</p>
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    public CreateKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKeyRequest(CreateKeyRequest source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);

    }
}

