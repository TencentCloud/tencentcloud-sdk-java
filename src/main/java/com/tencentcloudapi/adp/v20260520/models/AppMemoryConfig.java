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

public class AppMemoryConfig extends AbstractModel {

    /**
    * 是否开启长记忆
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 长记忆时长
    */
    @SerializedName("LongMemoryDay")
    @Expose
    private Long LongMemoryDay;

    /**
    * 模型配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private ModelDetailInfo Model;

    /**
    * prompt内容
    */
    @SerializedName("PromptContent")
    @Expose
    private String PromptContent;

    /**
    * 提示词模式。枚举值: 1:自定义
    */
    @SerializedName("PromptMode")
    @Expose
    private Long PromptMode;

    /**
     * Get 是否开启长记忆 
     * @return Enabled 是否开启长记忆
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启长记忆
     * @param Enabled 是否开启长记忆
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 长记忆时长 
     * @return LongMemoryDay 长记忆时长
     */
    public Long getLongMemoryDay() {
        return this.LongMemoryDay;
    }

    /**
     * Set 长记忆时长
     * @param LongMemoryDay 长记忆时长
     */
    public void setLongMemoryDay(Long LongMemoryDay) {
        this.LongMemoryDay = LongMemoryDay;
    }

    /**
     * Get 模型配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelDetailInfo getModel() {
        return this.Model;
    }

    /**
     * Set 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(ModelDetailInfo Model) {
        this.Model = Model;
    }

    /**
     * Get prompt内容 
     * @return PromptContent prompt内容
     */
    public String getPromptContent() {
        return this.PromptContent;
    }

    /**
     * Set prompt内容
     * @param PromptContent prompt内容
     */
    public void setPromptContent(String PromptContent) {
        this.PromptContent = PromptContent;
    }

    /**
     * Get 提示词模式。枚举值: 1:自定义 
     * @return PromptMode 提示词模式。枚举值: 1:自定义
     */
    public Long getPromptMode() {
        return this.PromptMode;
    }

    /**
     * Set 提示词模式。枚举值: 1:自定义
     * @param PromptMode 提示词模式。枚举值: 1:自定义
     */
    public void setPromptMode(Long PromptMode) {
        this.PromptMode = PromptMode;
    }

    public AppMemoryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppMemoryConfig(AppMemoryConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.LongMemoryDay != null) {
            this.LongMemoryDay = new Long(source.LongMemoryDay);
        }
        if (source.Model != null) {
            this.Model = new ModelDetailInfo(source.Model);
        }
        if (source.PromptContent != null) {
            this.PromptContent = new String(source.PromptContent);
        }
        if (source.PromptMode != null) {
            this.PromptMode = new Long(source.PromptMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "LongMemoryDay", this.LongMemoryDay);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamSimple(map, prefix + "PromptContent", this.PromptContent);
        this.setParamSimple(map, prefix + "PromptMode", this.PromptMode);

    }
}

