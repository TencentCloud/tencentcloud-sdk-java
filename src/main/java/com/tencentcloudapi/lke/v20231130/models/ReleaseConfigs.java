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

public class ReleaseConfigs extends AbstractModel {

    /**
    * 配置项描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigItem")
    @Expose
    private String ConfigItem;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 变更后的内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 变更前的内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastValue")
    @Expose
    private String LastValue;

    /**
    * 变更内容(优先级展示content内容,content为空取value内容)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 配置项描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigItem 配置项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigItem() {
        return this.ConfigItem;
    }

    /**
     * Set 配置项描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigItem 配置项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigItem(String ConfigItem) {
        this.ConfigItem = ConfigItem;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 变更后的内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 变更后的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 变更后的内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 变更后的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 变更前的内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastValue 变更前的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastValue() {
        return this.LastValue;
    }

    /**
     * Set 变更前的内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastValue 变更前的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastValue(String LastValue) {
        this.LastValue = LastValue;
    }

    /**
     * Get 变更内容(优先级展示content内容,content为空取value内容)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 变更内容(优先级展示content内容,content为空取value内容)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 变更内容(优先级展示content内容,content为空取value内容)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 变更内容(优先级展示content内容,content为空取value内容)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ReleaseConfigs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseConfigs(ReleaseConfigs source) {
        if (source.ConfigItem != null) {
            this.ConfigItem = new String(source.ConfigItem);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.LastValue != null) {
            this.LastValue = new String(source.LastValue);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigItem", this.ConfigItem);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "LastValue", this.LastValue);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

