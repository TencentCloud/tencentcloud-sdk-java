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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationWidgetAction extends AbstractModel {

    /**
    * <p>动作类型，非枚举类型，用户自定义</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>动作载荷</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>组件 ID</p>
    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
    * <p>组件运行 ID</p>
    */
    @SerializedName("WidgetRunId")
    @Expose
    private String WidgetRunId;

    /**
     * Get <p>动作类型，非枚举类型，用户自定义</p> 
     * @return ActionType <p>动作类型，非枚举类型，用户自定义</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>动作类型，非枚举类型，用户自定义</p>
     * @param ActionType <p>动作类型，非枚举类型，用户自定义</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>动作载荷</p> 
     * @return Payload <p>动作载荷</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>动作载荷</p>
     * @param Payload <p>动作载荷</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>组件 ID</p> 
     * @return WidgetId <p>组件 ID</p>
     */
    public String getWidgetId() {
        return this.WidgetId;
    }

    /**
     * Set <p>组件 ID</p>
     * @param WidgetId <p>组件 ID</p>
     */
    public void setWidgetId(String WidgetId) {
        this.WidgetId = WidgetId;
    }

    /**
     * Get <p>组件运行 ID</p> 
     * @return WidgetRunId <p>组件运行 ID</p>
     */
    public String getWidgetRunId() {
        return this.WidgetRunId;
    }

    /**
     * Set <p>组件运行 ID</p>
     * @param WidgetRunId <p>组件运行 ID</p>
     */
    public void setWidgetRunId(String WidgetRunId) {
        this.WidgetRunId = WidgetRunId;
    }

    public ConversationWidgetAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationWidgetAction(ConversationWidgetAction source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.WidgetRunId != null) {
            this.WidgetRunId = new String(source.WidgetRunId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);
        this.setParamSimple(map, prefix + "WidgetRunId", this.WidgetRunId);

    }
}

