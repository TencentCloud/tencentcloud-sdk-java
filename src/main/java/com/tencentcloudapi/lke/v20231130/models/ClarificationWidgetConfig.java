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

public class ClarificationWidgetConfig extends AbstractModel {

    /**
    * widget id
    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
    * 澄清widget类型
    */
    @SerializedName("ClarificationWidgetType")
    @Expose
    private Long ClarificationWidgetType;

    /**
    * Widget名称
    */
    @SerializedName("WidgetName")
    @Expose
    private String WidgetName;

    /**
    * Widget预览
    */
    @SerializedName("WidgetPreview")
    @Expose
    private String WidgetPreview;

    /**
    * 是否启用该Widget作为澄清样式
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get widget id 
     * @return WidgetId widget id
     */
    public String getWidgetId() {
        return this.WidgetId;
    }

    /**
     * Set widget id
     * @param WidgetId widget id
     */
    public void setWidgetId(String WidgetId) {
        this.WidgetId = WidgetId;
    }

    /**
     * Get 澄清widget类型 
     * @return ClarificationWidgetType 澄清widget类型
     */
    public Long getClarificationWidgetType() {
        return this.ClarificationWidgetType;
    }

    /**
     * Set 澄清widget类型
     * @param ClarificationWidgetType 澄清widget类型
     */
    public void setClarificationWidgetType(Long ClarificationWidgetType) {
        this.ClarificationWidgetType = ClarificationWidgetType;
    }

    /**
     * Get Widget名称 
     * @return WidgetName Widget名称
     */
    public String getWidgetName() {
        return this.WidgetName;
    }

    /**
     * Set Widget名称
     * @param WidgetName Widget名称
     */
    public void setWidgetName(String WidgetName) {
        this.WidgetName = WidgetName;
    }

    /**
     * Get Widget预览 
     * @return WidgetPreview Widget预览
     */
    public String getWidgetPreview() {
        return this.WidgetPreview;
    }

    /**
     * Set Widget预览
     * @param WidgetPreview Widget预览
     */
    public void setWidgetPreview(String WidgetPreview) {
        this.WidgetPreview = WidgetPreview;
    }

    /**
     * Get 是否启用该Widget作为澄清样式 
     * @return Enabled 是否启用该Widget作为澄清样式
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用该Widget作为澄清样式
     * @param Enabled 是否启用该Widget作为澄清样式
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ClarificationWidgetConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClarificationWidgetConfig(ClarificationWidgetConfig source) {
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.ClarificationWidgetType != null) {
            this.ClarificationWidgetType = new Long(source.ClarificationWidgetType);
        }
        if (source.WidgetName != null) {
            this.WidgetName = new String(source.WidgetName);
        }
        if (source.WidgetPreview != null) {
            this.WidgetPreview = new String(source.WidgetPreview);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);
        this.setParamSimple(map, prefix + "ClarificationWidgetType", this.ClarificationWidgetType);
        this.setParamSimple(map, prefix + "WidgetName", this.WidgetName);
        this.setParamSimple(map, prefix + "WidgetPreview", this.WidgetPreview);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

