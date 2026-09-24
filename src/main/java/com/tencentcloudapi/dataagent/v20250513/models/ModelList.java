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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelList extends AbstractModel {

    /**
    * <p>模型版本名称</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>模型厂商</p>
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * <p>展示名称</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>模型描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>上下文窗口大小，单位 token</p>
    */
    @SerializedName("ContextWindow")
    @Expose
    private Long ContextWindow;

    /**
    * <p>模型图标 URL</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>计费倍率</p>
    */
    @SerializedName("CreditMultiplier")
    @Expose
    private Float CreditMultiplier;

    /**
    * <p>思考配置</p>
    */
    @SerializedName("Thinking")
    @Expose
    private Thinking Thinking;

    /**
     * Get <p>模型版本名称</p> 
     * @return Model <p>模型版本名称</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型版本名称</p>
     * @param Model <p>模型版本名称</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>模型厂商</p> 
     * @return Vendor <p>模型厂商</p>
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>模型厂商</p>
     * @param Vendor <p>模型厂商</p>
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>展示名称</p> 
     * @return DisplayName <p>展示名称</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>展示名称</p>
     * @param DisplayName <p>展示名称</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>模型描述</p> 
     * @return Description <p>模型描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模型描述</p>
     * @param Description <p>模型描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>上下文窗口大小，单位 token</p> 
     * @return ContextWindow <p>上下文窗口大小，单位 token</p>
     */
    public Long getContextWindow() {
        return this.ContextWindow;
    }

    /**
     * Set <p>上下文窗口大小，单位 token</p>
     * @param ContextWindow <p>上下文窗口大小，单位 token</p>
     */
    public void setContextWindow(Long ContextWindow) {
        this.ContextWindow = ContextWindow;
    }

    /**
     * Get <p>模型图标 URL</p> 
     * @return IconUrl <p>模型图标 URL</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>模型图标 URL</p>
     * @param IconUrl <p>模型图标 URL</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>计费倍率</p> 
     * @return CreditMultiplier <p>计费倍率</p>
     */
    public Float getCreditMultiplier() {
        return this.CreditMultiplier;
    }

    /**
     * Set <p>计费倍率</p>
     * @param CreditMultiplier <p>计费倍率</p>
     */
    public void setCreditMultiplier(Float CreditMultiplier) {
        this.CreditMultiplier = CreditMultiplier;
    }

    /**
     * Get <p>思考配置</p> 
     * @return Thinking <p>思考配置</p>
     */
    public Thinking getThinking() {
        return this.Thinking;
    }

    /**
     * Set <p>思考配置</p>
     * @param Thinking <p>思考配置</p>
     */
    public void setThinking(Thinking Thinking) {
        this.Thinking = Thinking;
    }

    public ModelList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelList(ModelList source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ContextWindow != null) {
            this.ContextWindow = new Long(source.ContextWindow);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.CreditMultiplier != null) {
            this.CreditMultiplier = new Float(source.CreditMultiplier);
        }
        if (source.Thinking != null) {
            this.Thinking = new Thinking(source.Thinking);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ContextWindow", this.ContextWindow);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "CreditMultiplier", this.CreditMultiplier);
        this.setParamObj(map, prefix + "Thinking.", this.Thinking);

    }
}

