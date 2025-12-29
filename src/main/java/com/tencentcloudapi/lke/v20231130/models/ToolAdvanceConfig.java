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

public class ToolAdvanceConfig extends AbstractModel {

    /**
    * 工具调用结果是否直接返回给用户
    */
    @SerializedName("EnableDirectResultReturn")
    @Expose
    private Boolean EnableDirectResultReturn;

    /**
    * 输出样式 1-文本 2-json 3-widget
    */
    @SerializedName("OutputType")
    @Expose
    private Long OutputType;

    /**
    * 原始结构化JSON输出
    */
    @SerializedName("RawStructuredOutput")
    @Expose
    private String RawStructuredOutput;

    /**
    * 自定义文本输出，多行展示
    */
    @SerializedName("CustomTextOutputs")
    @Expose
    private String CustomTextOutputs;

    /**
    * Widget输出配置
    */
    @SerializedName("OutputWidgetConfig")
    @Expose
    private OutputWidgetConfig OutputWidgetConfig;

    /**
     * Get 工具调用结果是否直接返回给用户 
     * @return EnableDirectResultReturn 工具调用结果是否直接返回给用户
     */
    public Boolean getEnableDirectResultReturn() {
        return this.EnableDirectResultReturn;
    }

    /**
     * Set 工具调用结果是否直接返回给用户
     * @param EnableDirectResultReturn 工具调用结果是否直接返回给用户
     */
    public void setEnableDirectResultReturn(Boolean EnableDirectResultReturn) {
        this.EnableDirectResultReturn = EnableDirectResultReturn;
    }

    /**
     * Get 输出样式 1-文本 2-json 3-widget 
     * @return OutputType 输出样式 1-文本 2-json 3-widget
     */
    public Long getOutputType() {
        return this.OutputType;
    }

    /**
     * Set 输出样式 1-文本 2-json 3-widget
     * @param OutputType 输出样式 1-文本 2-json 3-widget
     */
    public void setOutputType(Long OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get 原始结构化JSON输出 
     * @return RawStructuredOutput 原始结构化JSON输出
     */
    public String getRawStructuredOutput() {
        return this.RawStructuredOutput;
    }

    /**
     * Set 原始结构化JSON输出
     * @param RawStructuredOutput 原始结构化JSON输出
     */
    public void setRawStructuredOutput(String RawStructuredOutput) {
        this.RawStructuredOutput = RawStructuredOutput;
    }

    /**
     * Get 自定义文本输出，多行展示 
     * @return CustomTextOutputs 自定义文本输出，多行展示
     */
    public String getCustomTextOutputs() {
        return this.CustomTextOutputs;
    }

    /**
     * Set 自定义文本输出，多行展示
     * @param CustomTextOutputs 自定义文本输出，多行展示
     */
    public void setCustomTextOutputs(String CustomTextOutputs) {
        this.CustomTextOutputs = CustomTextOutputs;
    }

    /**
     * Get Widget输出配置 
     * @return OutputWidgetConfig Widget输出配置
     */
    public OutputWidgetConfig getOutputWidgetConfig() {
        return this.OutputWidgetConfig;
    }

    /**
     * Set Widget输出配置
     * @param OutputWidgetConfig Widget输出配置
     */
    public void setOutputWidgetConfig(OutputWidgetConfig OutputWidgetConfig) {
        this.OutputWidgetConfig = OutputWidgetConfig;
    }

    public ToolAdvanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolAdvanceConfig(ToolAdvanceConfig source) {
        if (source.EnableDirectResultReturn != null) {
            this.EnableDirectResultReturn = new Boolean(source.EnableDirectResultReturn);
        }
        if (source.OutputType != null) {
            this.OutputType = new Long(source.OutputType);
        }
        if (source.RawStructuredOutput != null) {
            this.RawStructuredOutput = new String(source.RawStructuredOutput);
        }
        if (source.CustomTextOutputs != null) {
            this.CustomTextOutputs = new String(source.CustomTextOutputs);
        }
        if (source.OutputWidgetConfig != null) {
            this.OutputWidgetConfig = new OutputWidgetConfig(source.OutputWidgetConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableDirectResultReturn", this.EnableDirectResultReturn);
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamSimple(map, prefix + "RawStructuredOutput", this.RawStructuredOutput);
        this.setParamSimple(map, prefix + "CustomTextOutputs", this.CustomTextOutputs);
        this.setParamObj(map, prefix + "OutputWidgetConfig.", this.OutputWidgetConfig);

    }
}

