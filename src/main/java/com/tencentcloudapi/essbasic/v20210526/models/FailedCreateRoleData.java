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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailedCreateRoleData extends AbstractModel{

    /**
    * 用户userId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 角色RoleId列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
     * Get 用户userId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户userId
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 角色RoleId列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleIds 角色RoleId列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set 角色RoleId列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleIds 角色RoleId列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    public FailedCreateRoleData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailedCreateRoleData(FailedCreateRoleData source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);

    }
}

