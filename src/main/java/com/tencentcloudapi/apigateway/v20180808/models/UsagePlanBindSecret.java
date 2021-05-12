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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsagePlanBindSecret extends AbstractModel{

    /**
    * 密钥ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * 密钥名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 密钥状态，0表示已禁用，1表示启用中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 密钥ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessKeyId 密钥ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set 密钥ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessKeyId 密钥ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get 密钥名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretName 密钥名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 密钥名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretName 密钥名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 密钥状态，0表示已禁用，1表示启用中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 密钥状态，0表示已禁用，1表示启用中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 密钥状态，0表示已禁用，1表示启用中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 密钥状态，0表示已禁用，1表示启用中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UsagePlanBindSecret() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlanBindSecret(UsagePlanBindSecret source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

