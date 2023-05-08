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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceUser extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户角色 1所有者，0：其他分享者
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * 家庭ID，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FamilyId")
    @Expose
    private String FamilyId;

    /**
    * 家庭名称，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FamilyName")
    @Expose
    private String FamilyName;

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户角色 1所有者，0：其他分享者 
     * @return Role 用户角色 1所有者，0：其他分享者
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set 用户角色 1所有者，0：其他分享者
     * @param Role 用户角色 1所有者，0：其他分享者
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get 家庭ID，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FamilyId 家庭ID，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFamilyId() {
        return this.FamilyId;
    }

    /**
     * Set 家庭ID，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FamilyId 家庭ID，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFamilyId(String FamilyId) {
        this.FamilyId = FamilyId;
    }

    /**
     * Get 家庭名称，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FamilyName 家庭名称，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFamilyName() {
        return this.FamilyName;
    }

    /**
     * Set 家庭名称，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FamilyName 家庭名称，所有者带该参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    public DeviceUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceUser(DeviceUser source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
        if (source.FamilyId != null) {
            this.FamilyId = new String(source.FamilyId);
        }
        if (source.FamilyName != null) {
            this.FamilyName = new String(source.FamilyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "FamilyId", this.FamilyId);
        this.setParamSimple(map, prefix + "FamilyName", this.FamilyName);

    }
}

