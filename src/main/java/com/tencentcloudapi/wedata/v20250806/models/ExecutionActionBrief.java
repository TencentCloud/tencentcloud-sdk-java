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

public class ExecutionActionBrief extends AbstractModel {

    /**
    * 操作实体 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 操作实体名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * 操作 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionActionId")
    @Expose
    private String ExecutionActionId;

    /**
    * 失败信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 操作状态，true：成功，false：失败
    */
    @SerializedName("OpStatus")
    @Expose
    private Boolean OpStatus;

    /**
     * Get 操作实体 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemId 操作实体 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 操作实体 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemId 操作实体 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 操作实体名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemName 操作实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set 操作实体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemName 操作实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get 操作 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionActionId 操作 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionActionId() {
        return this.ExecutionActionId;
    }

    /**
     * Set 操作 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionActionId 操作 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionActionId(String ExecutionActionId) {
        this.ExecutionActionId = ExecutionActionId;
    }

    /**
     * Get 失败信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 失败信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 失败信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 失败信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 操作状态，true：成功，false：失败 
     * @return OpStatus 操作状态，true：成功，false：失败
     */
    public Boolean getOpStatus() {
        return this.OpStatus;
    }

    /**
     * Set 操作状态，true：成功，false：失败
     * @param OpStatus 操作状态，true：成功，false：失败
     */
    public void setOpStatus(Boolean OpStatus) {
        this.OpStatus = OpStatus;
    }

    public ExecutionActionBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutionActionBrief(ExecutionActionBrief source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.ExecutionActionId != null) {
            this.ExecutionActionId = new String(source.ExecutionActionId);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.OpStatus != null) {
            this.OpStatus = new Boolean(source.OpStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "ExecutionActionId", this.ExecutionActionId);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "OpStatus", this.OpStatus);

    }
}

