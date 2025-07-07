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

public class ImportDataKeyRequest extends AbstractModel {

    /**
    * 数据密钥的名称
    */
    @SerializedName("DataKeyName")
    @Expose
    private String DataKeyName;

    /**
    * 如果导入的是明文数据密钥，则是base64 转换后的明文数据密钥，  如果导入的是密文数据密钥，则是由KMS GenerateDataKey接口生成的密文数据密钥。
    */
    @SerializedName("ImportKeyMaterial")
    @Expose
    private String ImportKeyMaterial;

    /**
    * 1:密文导入(由KMS接口生成的密文数据密钥)，2:明文导入。
    */
    @SerializedName("ImportType")
    @Expose
    private Long ImportType;

    /**
    * 数据密钥 的描述，最大100字节
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 当导入密文数据密钥时，无需传入根密钥,如果传入会校验此KeyId是否和密文中一致。
当导入明文数据密钥，KeyId 不能为空，会根据指定的根密钥加密数据密钥。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * KMS 独享版对应的 HSM 集群 ID。如果指定HsmClusterId，表明根密钥在此集群里，会校验KeyId是否和HsmClusterId对应。
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
     * Get 数据密钥的名称 
     * @return DataKeyName 数据密钥的名称
     */
    public String getDataKeyName() {
        return this.DataKeyName;
    }

    /**
     * Set 数据密钥的名称
     * @param DataKeyName 数据密钥的名称
     */
    public void setDataKeyName(String DataKeyName) {
        this.DataKeyName = DataKeyName;
    }

    /**
     * Get 如果导入的是明文数据密钥，则是base64 转换后的明文数据密钥，  如果导入的是密文数据密钥，则是由KMS GenerateDataKey接口生成的密文数据密钥。 
     * @return ImportKeyMaterial 如果导入的是明文数据密钥，则是base64 转换后的明文数据密钥，  如果导入的是密文数据密钥，则是由KMS GenerateDataKey接口生成的密文数据密钥。
     */
    public String getImportKeyMaterial() {
        return this.ImportKeyMaterial;
    }

    /**
     * Set 如果导入的是明文数据密钥，则是base64 转换后的明文数据密钥，  如果导入的是密文数据密钥，则是由KMS GenerateDataKey接口生成的密文数据密钥。
     * @param ImportKeyMaterial 如果导入的是明文数据密钥，则是base64 转换后的明文数据密钥，  如果导入的是密文数据密钥，则是由KMS GenerateDataKey接口生成的密文数据密钥。
     */
    public void setImportKeyMaterial(String ImportKeyMaterial) {
        this.ImportKeyMaterial = ImportKeyMaterial;
    }

    /**
     * Get 1:密文导入(由KMS接口生成的密文数据密钥)，2:明文导入。 
     * @return ImportType 1:密文导入(由KMS接口生成的密文数据密钥)，2:明文导入。
     */
    public Long getImportType() {
        return this.ImportType;
    }

    /**
     * Set 1:密文导入(由KMS接口生成的密文数据密钥)，2:明文导入。
     * @param ImportType 1:密文导入(由KMS接口生成的密文数据密钥)，2:明文导入。
     */
    public void setImportType(Long ImportType) {
        this.ImportType = ImportType;
    }

    /**
     * Get 数据密钥 的描述，最大100字节 
     * @return Description 数据密钥 的描述，最大100字节
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据密钥 的描述，最大100字节
     * @param Description 数据密钥 的描述，最大100字节
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 当导入密文数据密钥时，无需传入根密钥,如果传入会校验此KeyId是否和密文中一致。
当导入明文数据密钥，KeyId 不能为空，会根据指定的根密钥加密数据密钥。 
     * @return KeyId 当导入密文数据密钥时，无需传入根密钥,如果传入会校验此KeyId是否和密文中一致。
当导入明文数据密钥，KeyId 不能为空，会根据指定的根密钥加密数据密钥。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 当导入密文数据密钥时，无需传入根密钥,如果传入会校验此KeyId是否和密文中一致。
当导入明文数据密钥，KeyId 不能为空，会根据指定的根密钥加密数据密钥。
     * @param KeyId 当导入密文数据密钥时，无需传入根密钥,如果传入会校验此KeyId是否和密文中一致。
当导入明文数据密钥，KeyId 不能为空，会根据指定的根密钥加密数据密钥。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get KMS 独享版对应的 HSM 集群 ID。如果指定HsmClusterId，表明根密钥在此集群里，会校验KeyId是否和HsmClusterId对应。 
     * @return HsmClusterId KMS 独享版对应的 HSM 集群 ID。如果指定HsmClusterId，表明根密钥在此集群里，会校验KeyId是否和HsmClusterId对应。
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set KMS 独享版对应的 HSM 集群 ID。如果指定HsmClusterId，表明根密钥在此集群里，会校验KeyId是否和HsmClusterId对应。
     * @param HsmClusterId KMS 独享版对应的 HSM 集群 ID。如果指定HsmClusterId，表明根密钥在此集群里，会校验KeyId是否和HsmClusterId对应。
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    public ImportDataKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportDataKeyRequest(ImportDataKeyRequest source) {
        if (source.DataKeyName != null) {
            this.DataKeyName = new String(source.DataKeyName);
        }
        if (source.ImportKeyMaterial != null) {
            this.ImportKeyMaterial = new String(source.ImportKeyMaterial);
        }
        if (source.ImportType != null) {
            this.ImportType = new Long(source.ImportType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataKeyName", this.DataKeyName);
        this.setParamSimple(map, prefix + "ImportKeyMaterial", this.ImportKeyMaterial);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);

    }
}

