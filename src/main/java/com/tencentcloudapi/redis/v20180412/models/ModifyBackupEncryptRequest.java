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

public class ModifyBackupEncryptRequest extends AbstractModel {

    /**
    * <p>实例 ID，请登录Redis控制台在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否开启备份加密。</p><p>默认值：false</p>
    */
    @SerializedName("BackupEncrypt")
    @Expose
    private Boolean BackupEncrypt;

    /**
    * <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul><p>默认值：0</p>
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
    * <p>地域信息。</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p>
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
     * Get <p>实例 ID，请登录Redis控制台在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID，请登录Redis控制台在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，请登录Redis控制台在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID，请登录Redis控制台在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否开启备份加密。</p><p>默认值：false</p> 
     * @return BackupEncrypt <p>是否开启备份加密。</p><p>默认值：false</p>
     */
    public Boolean getBackupEncrypt() {
        return this.BackupEncrypt;
    }

    /**
     * Set <p>是否开启备份加密。</p><p>默认值：false</p>
     * @param BackupEncrypt <p>是否开启备份加密。</p><p>默认值：false</p>
     */
    public void setBackupEncrypt(Boolean BackupEncrypt) {
        this.BackupEncrypt = BackupEncrypt;
    }

    /**
     * Get <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul><p>默认值：0</p> 
     * @return EncryptKeyType <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul><p>默认值：0</p>
     */
    public Long getEncryptKeyType() {
        return this.EncryptKeyType;
    }

    /**
     * Set <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul><p>默认值：0</p>
     * @param EncryptKeyType <p>加密密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云托管（默认）</li><li>1： 用户自定义 KMS 密钥</li></ul><p>默认值：0</p>
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
     * Get <p>地域信息。</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p> 
     * @return KmsRegion <p>地域信息。</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p>
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set <p>地域信息。</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p>
     * @param KmsRegion <p>地域信息。</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p>
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    public ModifyBackupEncryptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupEncryptRequest(ModifyBackupEncryptRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupEncrypt", this.BackupEncrypt);
        this.setParamSimple(map, prefix + "EncryptKeyType", this.EncryptKeyType);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);

    }
}

