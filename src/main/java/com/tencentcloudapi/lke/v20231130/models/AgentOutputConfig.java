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

public class AgentOutputConfig extends AbstractModel {

    /**
    * 输出类型，1-文本 2-json 3-widget
    */
    @SerializedName("OutputType")
    @Expose
    private Long OutputType;

    /**
    * Json结构化输出参数列表
    */
    @SerializedName("StructuredOutputParams")
    @Expose
    private ParameterConfig [] StructuredOutputParams;

    /**
    * widget id
    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
     * Get 输出类型，1-文本 2-json 3-widget 
     * @return OutputType 输出类型，1-文本 2-json 3-widget
     */
    public Long getOutputType() {
        return this.OutputType;
    }

    /**
     * Set 输出类型，1-文本 2-json 3-widget
     * @param OutputType 输出类型，1-文本 2-json 3-widget
     */
    public void setOutputType(Long OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get Json结构化输出参数列表 
     * @return StructuredOutputParams Json结构化输出参数列表
     */
    public ParameterConfig [] getStructuredOutputParams() {
        return this.StructuredOutputParams;
    }

    /**
     * Set Json结构化输出参数列表
     * @param StructuredOutputParams Json结构化输出参数列表
     */
    public void setStructuredOutputParams(ParameterConfig [] StructuredOutputParams) {
        this.StructuredOutputParams = StructuredOutputParams;
    }

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

    public AgentOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentOutputConfig(AgentOutputConfig source) {
        if (source.OutputType != null) {
            this.OutputType = new Long(source.OutputType);
        }
        if (source.StructuredOutputParams != null) {
            this.StructuredOutputParams = new ParameterConfig[source.StructuredOutputParams.length];
            for (int i = 0; i < source.StructuredOutputParams.length; i++) {
                this.StructuredOutputParams[i] = new ParameterConfig(source.StructuredOutputParams[i]);
            }
        }
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamArrayObj(map, prefix + "StructuredOutputParams.", this.StructuredOutputParams);
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);

    }
}

