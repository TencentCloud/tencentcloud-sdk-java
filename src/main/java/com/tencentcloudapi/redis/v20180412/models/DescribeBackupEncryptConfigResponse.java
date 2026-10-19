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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupEncryptConfigResponse extends AbstractModel {

    /**
    * <p>备份是否加密</p><p>枚举值：</p><ul><li>true： 加密</li><li>false： 不加密</li></ul>
    */
    @SerializedName("BackupEncrypt")
    @Expose
    private Boolean BackupEncrypt;

    /**
    * <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul>
    */
    @SerializedName("EncryptKeyType")
    @Expose
    private Long EncryptKeyType;

    /**
    * <p>KMS的密钥ID。</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>KMS地域信息。</p><p>参数格式：ap-xxxx</p>
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>备份是否加密</p><p>枚举值：</p><ul><li>true： 加密</li><li>false： 不加密</li></ul> 
     * @return BackupEncrypt <p>备份是否加密</p><p>枚举值：</p><ul><li>true： 加密</li><li>false： 不加密</li></ul>
     */
    public Boolean getBackupEncrypt() {
        return this.BackupEncrypt;
    }

    /**
     * Set <p>备份是否加密</p><p>枚举值：</p><ul><li>true： 加密</li><li>false： 不加密</li></ul>
     * @param BackupEncrypt <p>备份是否加密</p><p>枚举值：</p><ul><li>true： 加密</li><li>false： 不加密</li></ul>
     */
    public void setBackupEncrypt(Boolean BackupEncrypt) {
        this.BackupEncrypt = BackupEncrypt;
    }

    /**
     * Get <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul> 
     * @return EncryptKeyType <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul>
     */
    public Long getEncryptKeyType() {
        return this.EncryptKeyType;
    }

    /**
     * Set <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul>
     * @param EncryptKeyType <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul>
     */
    public void setEncryptKeyType(Long EncryptKeyType) {
        this.EncryptKeyType = EncryptKeyType;
    }

    /**
     * Get <p>KMS的密钥ID。</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p> 
     * @return KmsKeyId <p>KMS的密钥ID。</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>KMS的密钥ID。</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
     * @param KmsKeyId <p>KMS的密钥ID。</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>KMS地域信息。</p><p>参数格式：ap-xxxx</p> 
     * @return KmsRegion <p>KMS地域信息。</p><p>参数格式：ap-xxxx</p>
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set <p>KMS地域信息。</p><p>参数格式：ap-xxxx</p>
     * @param KmsRegion <p>KMS地域信息。</p><p>参数格式：ap-xxxx</p>
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupEncryptConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupEncryptConfigResponse(DescribeBackupEncryptConfigResponse source) {
        if (source.BackupEncrypt != null) {
            this.BackupEncrypt = new Boolean(source.BackupEncrypt);
        }
        if (source.EncryptKeyType != null) {
            this.EncryptKeyType = new Long(source.EncryptKeyType);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupEncrypt", this.BackupEncrypt);
        this.setParamSimple(map, prefix + "EncryptKeyType", this.EncryptKeyType);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

