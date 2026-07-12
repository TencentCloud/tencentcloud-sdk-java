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

public class ImportKeyMaterialRequest extends AbstractModel {

    /**
    * <p>使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS 140-2版本region的KMS， 导入的密钥材料长度要求为 256 bit。</p>
    */
    @SerializedName("EncryptedKeyMaterial")
    @Expose
    private String EncryptedKeyMaterial;

    /**
    * <p>通过调用GetParametersForImport获得的导入令牌。</p>
    */
    @SerializedName("ImportToken")
    @Expose
    private String ImportToken;

    /**
    * <p>指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。</p>
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
     * Get <p>使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS 140-2版本region的KMS， 导入的密钥材料长度要求为 256 bit。</p> 
     * @return EncryptedKeyMaterial <p>使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS 140-2版本region的KMS， 导入的密钥材料长度要求为 256 bit。</p>
     */
    public String getEncryptedKeyMaterial() {
        return this.EncryptedKeyMaterial;
    }

    /**
     * Set <p>使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS 140-2版本region的KMS， 导入的密钥材料长度要求为 256 bit。</p>
     * @param EncryptedKeyMaterial <p>使用GetParametersForImport 返回的PublicKey加密后的密钥材料base64编码。对于国密版本region的KMS，导入的密钥材料长度要求为 128 bit，FIPS 140-2版本region的KMS， 导入的密钥材料长度要求为 256 bit。</p>
     */
    public void setEncryptedKeyMaterial(String EncryptedKeyMaterial) {
        this.EncryptedKeyMaterial = EncryptedKeyMaterial;
    }

    /**
     * Get <p>通过调用GetParametersForImport获得的导入令牌。</p> 
     * @return ImportToken <p>通过调用GetParametersForImport获得的导入令牌。</p>
     */
    public String getImportToken() {
        return this.ImportToken;
    }

    /**
     * Set <p>通过调用GetParametersForImport获得的导入令牌。</p>
     * @param ImportToken <p>通过调用GetParametersForImport获得的导入令牌。</p>
     */
    public void setImportToken(String ImportToken) {
        this.ImportToken = ImportToken;
    }

    /**
     * Get <p>指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。</p> 
     * @return KeyId <p>指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。</p>
     * @param KeyId <p>指定导入密钥材料的CMK，需要和GetParametersForImport 指定的CMK相同。</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。</p> 
     * @return ValidTo <p>密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。</p>
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set <p>密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。</p>
     * @param ValidTo <p>密钥材料过期时间 unix 时间戳，不指定或者 0 表示密钥材料不会过期，若指定过期时间，需要大于当前时间点，最大支持 2147443200。</p>
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    public ImportKeyMaterialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportKeyMaterialRequest(ImportKeyMaterialRequest source) {
        if (source.EncryptedKeyMaterial != null) {
            this.EncryptedKeyMaterial = new String(source.EncryptedKeyMaterial);
        }
        if (source.ImportToken != null) {
            this.ImportToken = new String(source.ImportToken);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.ValidTo != null) {
            this.ValidTo = new Long(source.ValidTo);
        }
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

