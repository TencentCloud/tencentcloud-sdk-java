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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskEncryptInfo extends AbstractModel {

    /**
    * <p>加密类型</p><p>枚举值：</p><ul><li>CUSTOMER_KMS： 客户自定义的KMS密钥信息</li><li>TENCENT_KEY： 使用腾讯云自动创建的KMS密钥信息</li></ul>
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

    /**
    * <p>KMS 根密钥ID</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>KMS密钥地域</p>
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * <p>KMS 根密钥 key 名</p>
    */
    @SerializedName("KmsKeyName")
    @Expose
    private String KmsKeyName;

    /**
     * Get <p>加密类型</p><p>枚举值：</p><ul><li>CUSTOMER_KMS： 客户自定义的KMS密钥信息</li><li>TENCENT_KEY： 使用腾讯云自动创建的KMS密钥信息</li></ul> 
     * @return EncryptType <p>加密类型</p><p>枚举值：</p><ul><li>CUSTOMER_KMS： 客户自定义的KMS密钥信息</li><li>TENCENT_KEY： 使用腾讯云自动创建的KMS密钥信息</li></ul>
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set <p>加密类型</p><p>枚举值：</p><ul><li>CUSTOMER_KMS： 客户自定义的KMS密钥信息</li><li>TENCENT_KEY： 使用腾讯云自动创建的KMS密钥信息</li></ul>
     * @param EncryptType <p>加密类型</p><p>枚举值：</p><ul><li>CUSTOMER_KMS： 客户自定义的KMS密钥信息</li><li>TENCENT_KEY： 使用腾讯云自动创建的KMS密钥信息</li></ul>
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
    }

    /**
     * Get <p>KMS 根密钥ID</p> 
     * @return KmsKeyId <p>KMS 根密钥ID</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>KMS 根密钥ID</p>
     * @param KmsKeyId <p>KMS 根密钥ID</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>KMS密钥地域</p> 
     * @return KmsRegion <p>KMS密钥地域</p>
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set <p>KMS密钥地域</p>
     * @param KmsRegion <p>KMS密钥地域</p>
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    /**
     * Get <p>KMS 根密钥 key 名</p> 
     * @return KmsKeyName <p>KMS 根密钥 key 名</p>
     */
    public String getKmsKeyName() {
        return this.KmsKeyName;
    }

    /**
     * Set <p>KMS 根密钥 key 名</p>
     * @param KmsKeyName <p>KMS 根密钥 key 名</p>
     */
    public void setKmsKeyName(String KmsKeyName) {
        this.KmsKeyName = KmsKeyName;
    }

    public DiskEncryptInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskEncryptInfo(DiskEncryptInfo source) {
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.KmsKeyName != null) {
            this.KmsKeyName = new String(source.KmsKeyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "KmsKeyName", this.KmsKeyName);

    }
}

