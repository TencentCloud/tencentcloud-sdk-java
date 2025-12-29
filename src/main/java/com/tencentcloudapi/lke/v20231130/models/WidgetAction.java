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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WidgetAction extends AbstractModel {

    /**
    * Widget配置ID
    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
    * Widget实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WidgetRunId")
    @Expose
    private String WidgetRunId;

    /**
    * Widget动作
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Widget动作提交的数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
     * Get Widget配置ID 
     * @return WidgetId Widget配置ID
     */
    public String getWidgetId() {
        return this.WidgetId;
    }

    /**
     * Set Widget配置ID
     * @param WidgetId Widget配置ID
     */
    public void setWidgetId(String WidgetId) {
        this.WidgetId = WidgetId;
    }

    /**
     * Get Widget实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WidgetRunId Widget实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWidgetRunId() {
        return this.WidgetRunId;
    }

    /**
     * Set Widget实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WidgetRunId Widget实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidgetRunId(String WidgetRunId) {
        this.WidgetRunId = WidgetRunId;
    }

    /**
     * Get Widget动作 
     * @return ActionType Widget动作
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Widget动作
     * @param ActionType Widget动作
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Widget动作提交的数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Payload Widget动作提交的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set Widget动作提交的数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Payload Widget动作提交的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    public WidgetAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WidgetAction(WidgetAction source) {
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.WidgetRunId != null) {
            this.WidgetRunId = new String(source.WidgetRunId);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);
        this.setParamSimple(map, prefix + "WidgetRunId", this.WidgetRunId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Payload", this.Payload);

    }
}

