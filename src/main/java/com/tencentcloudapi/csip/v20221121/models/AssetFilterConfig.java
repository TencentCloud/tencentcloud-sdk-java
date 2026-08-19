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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetFilterConfig extends AbstractModel {

    /**
    * <p>查询属性</p>
    */
    @SerializedName("Attr")
    @Expose
    private String Attr;

    /**
    * <p>展示</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>样式</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * <p>值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>英文展示</p>
    */
    @SerializedName("LabelEn")
    @Expose
    private String LabelEn;

    /**
    * <p>资产私有字段过滤器</p>
    */
    @SerializedName("Options")
    @Expose
    private AssetFilterOptions [] Options;

    /**
     * Get <p>查询属性</p> 
     * @return Attr <p>查询属性</p>
     */
    public String getAttr() {
        return this.Attr;
    }

    /**
     * Set <p>查询属性</p>
     * @param Attr <p>查询属性</p>
     */
    public void setAttr(String Attr) {
        this.Attr = Attr;
    }

    /**
     * Get <p>展示</p> 
     * @return Label <p>展示</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>展示</p>
     * @param Label <p>展示</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>样式</p> 
     * @return Style <p>样式</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>样式</p>
     * @param Style <p>样式</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get <p>值</p> 
     * @return Value <p>值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>值</p>
     * @param Value <p>值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>英文展示</p> 
     * @return LabelEn <p>英文展示</p>
     */
    public String getLabelEn() {
        return this.LabelEn;
    }

    /**
     * Set <p>英文展示</p>
     * @param LabelEn <p>英文展示</p>
     */
    public void setLabelEn(String LabelEn) {
        this.LabelEn = LabelEn;
    }

    /**
     * Get <p>资产私有字段过滤器</p> 
     * @return Options <p>资产私有字段过滤器</p>
     */
    public AssetFilterOptions [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>资产私有字段过滤器</p>
     * @param Options <p>资产私有字段过滤器</p>
     */
    public void setOptions(AssetFilterOptions [] Options) {
        this.Options = Options;
    }

    public AssetFilterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetFilterConfig(AssetFilterConfig source) {
        if (source.Attr != null) {
            this.Attr = new String(source.Attr);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.LabelEn != null) {
            this.LabelEn = new String(source.LabelEn);
        }
        if (source.Options != null) {
            this.Options = new AssetFilterOptions[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new AssetFilterOptions(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Attr", this.Attr);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "LabelEn", this.LabelEn);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);

    }
}

