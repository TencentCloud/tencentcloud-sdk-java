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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KMSInfoDetail extends AbstractModel {

    /**
    * 主密钥 ID。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 主密钥名称。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 实例与密钥绑定时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 密钥状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 密钥用途。
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * 密钥来源。
    */
    @SerializedName("KeyOrigin")
    @Expose
    private String KeyOrigin;

    /**
    * kms所在地域。
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
     * Get 主密钥 ID。 
     * @return KeyId 主密钥 ID。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 主密钥 ID。
     * @param KeyId 主密钥 ID。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 主密钥名称。 
     * @return KeyName 主密钥名称。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 主密钥名称。
     * @param KeyName 主密钥名称。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 实例与密钥绑定时间。 
     * @return CreateTime 实例与密钥绑定时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例与密钥绑定时间。
     * @param CreateTime 实例与密钥绑定时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 密钥状态。 
     * @return Status 密钥状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 密钥状态。
     * @param Status 密钥状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 密钥用途。 
     * @return KeyUsage 密钥用途。
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set 密钥用途。
     * @param KeyUsage 密钥用途。
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get 密钥来源。 
     * @return KeyOrigin 密钥来源。
     */
    public String getKeyOrigin() {
        return this.KeyOrigin;
    }

    /**
     * Set 密钥来源。
     * @param KeyOrigin 密钥来源。
     */
    public void setKeyOrigin(String KeyOrigin) {
        this.KeyOrigin = KeyOrigin;
    }

    /**
     * Get kms所在地域。 
     * @return KmsRegion kms所在地域。
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set kms所在地域。
     * @param KmsRegion kms所在地域。
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    public KMSInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KMSInfoDetail(KMSInfoDetail source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.KeyOrigin != null) {
            this.KeyOrigin = new String(source.KeyOrigin);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "KeyOrigin", this.KeyOrigin);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);

    }
}

