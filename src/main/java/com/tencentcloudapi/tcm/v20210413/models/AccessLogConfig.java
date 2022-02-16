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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessLogConfig extends AbstractModel{

    /**
    * 是否启用
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 采用的模板，可选值：istio（默认）、trace
    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
    * 选中的范围
    */
    @SerializedName("SelectedRange")
    @Expose
    private SelectedRange SelectedRange;

    /**
    * 腾讯云日志服务相关参数
    */
    @SerializedName("CLS")
    @Expose
    private CLS CLS;

    /**
    * 编码格式，可选值：TEXT、JSON
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * 日志格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 是否启用 
     * @return Enable 是否启用
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用
     * @param Enable 是否启用
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 采用的模板，可选值：istio（默认）、trace 
     * @return Template 采用的模板，可选值：istio（默认）、trace
     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set 采用的模板，可选值：istio（默认）、trace
     * @param Template 采用的模板，可选值：istio（默认）、trace
     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    /**
     * Get 选中的范围 
     * @return SelectedRange 选中的范围
     */
    public SelectedRange getSelectedRange() {
        return this.SelectedRange;
    }

    /**
     * Set 选中的范围
     * @param SelectedRange 选中的范围
     */
    public void setSelectedRange(SelectedRange SelectedRange) {
        this.SelectedRange = SelectedRange;
    }

    /**
     * Get 腾讯云日志服务相关参数 
     * @return CLS 腾讯云日志服务相关参数
     */
    public CLS getCLS() {
        return this.CLS;
    }

    /**
     * Set 腾讯云日志服务相关参数
     * @param CLS 腾讯云日志服务相关参数
     */
    public void setCLS(CLS CLS) {
        this.CLS = CLS;
    }

    /**
     * Get 编码格式，可选值：TEXT、JSON 
     * @return Encoding 编码格式，可选值：TEXT、JSON
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set 编码格式，可选值：TEXT、JSON
     * @param Encoding 编码格式，可选值：TEXT、JSON
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 日志格式 
     * @return Format 日志格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 日志格式
     * @param Format 日志格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public AccessLogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessLogConfig(AccessLogConfig source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Template != null) {
            this.Template = new String(source.Template);
        }
        if (source.SelectedRange != null) {
            this.SelectedRange = new SelectedRange(source.SelectedRange);
        }
        if (source.CLS != null) {
            this.CLS = new CLS(source.CLS);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamObj(map, prefix + "SelectedRange.", this.SelectedRange);
        this.setParamObj(map, prefix + "CLS.", this.CLS);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

