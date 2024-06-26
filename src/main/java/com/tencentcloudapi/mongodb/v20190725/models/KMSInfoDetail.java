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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 主密钥名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 实例与密钥绑定时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 密钥状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 密钥用途。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * 密钥来源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyOrigin")
    @Expose
    private String KeyOrigin;

    /**
     * Get 主密钥 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyId 主密钥 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 主密钥 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyId 主密钥 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 主密钥名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyName 主密钥名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 主密钥名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyName 主密钥名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 实例与密钥绑定时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 实例与密钥绑定时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例与密钥绑定时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 实例与密钥绑定时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 密钥状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 密钥状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 密钥状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 密钥状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 密钥用途。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyUsage 密钥用途。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set 密钥用途。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyUsage 密钥用途。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get 密钥来源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyOrigin 密钥来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyOrigin() {
        return this.KeyOrigin;
    }

    /**
     * Set 密钥来源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyOrigin 密钥来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyOrigin(String KeyOrigin) {
        this.KeyOrigin = KeyOrigin;
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

    }
}

