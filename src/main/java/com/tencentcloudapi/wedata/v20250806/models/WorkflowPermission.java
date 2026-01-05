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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowPermission extends AbstractModel {

    /**
    * 授权目标类型（用户：user，角色：role）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PermissionTargetType")
    @Expose
    private String PermissionTargetType;

    /**
    * 授权目标id数组(userId/roleId)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PermissionTargetId")
    @Expose
    private String PermissionTargetId;

    /**
    * 授权权限类型数组(CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE，当前仅支持CAN_MANAGE)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PermissionTypeList")
    @Expose
    private String [] PermissionTypeList;

    /**
     * Get 授权目标类型（用户：user，角色：role）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PermissionTargetType 授权目标类型（用户：user，角色：role）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPermissionTargetType() {
        return this.PermissionTargetType;
    }

    /**
     * Set 授权目标类型（用户：user，角色：role）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PermissionTargetType 授权目标类型（用户：user，角色：role）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissionTargetType(String PermissionTargetType) {
        this.PermissionTargetType = PermissionTargetType;
    }

    /**
     * Get 授权目标id数组(userId/roleId)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PermissionTargetId 授权目标id数组(userId/roleId)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPermissionTargetId() {
        return this.PermissionTargetId;
    }

    /**
     * Set 授权目标id数组(userId/roleId)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PermissionTargetId 授权目标id数组(userId/roleId)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissionTargetId(String PermissionTargetId) {
        this.PermissionTargetId = PermissionTargetId;
    }

    /**
     * Get 授权权限类型数组(CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE，当前仅支持CAN_MANAGE)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PermissionTypeList 授权权限类型数组(CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE，当前仅支持CAN_MANAGE)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPermissionTypeList() {
        return this.PermissionTypeList;
    }

    /**
     * Set 授权权限类型数组(CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE，当前仅支持CAN_MANAGE)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PermissionTypeList 授权权限类型数组(CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE，当前仅支持CAN_MANAGE)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissionTypeList(String [] PermissionTypeList) {
        this.PermissionTypeList = PermissionTypeList;
    }

    public WorkflowPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowPermission(WorkflowPermission source) {
        if (source.PermissionTargetType != null) {
            this.PermissionTargetType = new String(source.PermissionTargetType);
        }
        if (source.PermissionTargetId != null) {
            this.PermissionTargetId = new String(source.PermissionTargetId);
        }
        if (source.PermissionTypeList != null) {
            this.PermissionTypeList = new String[source.PermissionTypeList.length];
            for (int i = 0; i < source.PermissionTypeList.length; i++) {
                this.PermissionTypeList[i] = new String(source.PermissionTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PermissionTargetType", this.PermissionTargetType);
        this.setParamSimple(map, prefix + "PermissionTargetId", this.PermissionTargetId);
        this.setParamArraySimple(map, prefix + "PermissionTypeList.", this.PermissionTypeList);

    }
}

