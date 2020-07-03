/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportKeyMaterialRequest extends AbstractModel{

    /**
    * 使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS版本region的KMS， 导入的密钥材料长度要求为 256 bit。
    */
    @SerializedName("EncryptedKeyMaterial")
    @Expose
    private String EncryptedKeyMaterial;

    /**
    * 通过调用GetParametersForImport获得的导入令牌。
    */
    @SerializedName("ImportToken")
    @Expose
    private String ImportToken;

    /**
    * 指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
     * Get 使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS版本region的KMS， 导入的密钥材料长度要求为 256 bit。 
     * @return EncryptedKeyMaterial 使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS版本region的KMS， 导入的密钥材料长度要求为 256 bit。
     */
    public String getEncryptedKeyMaterial() {
        return this.EncryptedKeyMaterial;
    }

    /**
     * Set 使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS版本region的KMS， 导入的密钥材料长度要求为 256 bit。
     * @param EncryptedKeyMaterial 使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS版本region的KMS， 导入的密钥材料长度要求为 256 bit。
     */
    public void setEncryptedKeyMaterial(String EncryptedKeyMaterial) {
        this.EncryptedKeyMaterial = EncryptedKeyMaterial;
    }

    /**
     * Get 通过调用GetParametersForImport获得的导入令牌。 
     * @return ImportToken 通过调用GetParametersForImport获得的导入令牌。
     */
    public String getImportToken() {
        return this.ImportToken;
    }

    /**
     * Set 通过调用GetParametersForImport获得的导入令牌。
     * @param ImportToken 通过调用GetParametersForImport获得的导入令牌。
     */
    public void setImportToken(String ImportToken) {
        this.ImportToken = ImportToken;
    }

    /**
     * Get 指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。 
     * @return KeyId 指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。
     * @param KeyId 指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。 
     * @return ValidTo 密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set 密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。
     * @param ValidTo 密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptedKeyMaterial", this.EncryptedKeyMaterial);
        this.setParamSimple(map, prefix + "ImportToken", this.ImportToken);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);

    }
}

