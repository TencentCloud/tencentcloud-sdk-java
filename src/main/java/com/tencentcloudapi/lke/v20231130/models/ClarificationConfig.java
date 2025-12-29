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

public class ClarificationConfig extends AbstractModel {

    /**
    * 输出类型，1-文本 3-widget
    */
    @SerializedName("OutputType")
    @Expose
    private Long OutputType;

    /**
    * 澄清widget配置
    */
    @SerializedName("WidgetConfigs")
    @Expose
    private ClarificationWidgetConfig [] WidgetConfigs;

    /**
     * Get 输出类型，1-文本 3-widget 
     * @return OutputType 输出类型，1-文本 3-widget
     */
    public Long getOutputType() {
        return this.OutputType;
    }

    /**
     * Set 输出类型，1-文本 3-widget
     * @param OutputType 输出类型，1-文本 3-widget
     */
    public void setOutputType(Long OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get 澄清widget配置 
     * @return WidgetConfigs 澄清widget配置
     */
    public ClarificationWidgetConfig [] getWidgetConfigs() {
        return this.WidgetConfigs;
    }

    /**
     * Set 澄清widget配置
     * @param WidgetConfigs 澄清widget配置
     */
    public void setWidgetConfigs(ClarificationWidgetConfig [] WidgetConfigs) {
        this.WidgetConfigs = WidgetConfigs;
    }

    public ClarificationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClarificationConfig(ClarificationConfig source) {
        if (source.OutputType != null) {
            this.OutputType = new Long(source.OutputType);
        }
        if (source.WidgetConfigs != null) {
            this.WidgetConfigs = new ClarificationWidgetConfig[source.WidgetConfigs.length];
            for (int i = 0; i < source.WidgetConfigs.length; i++) {
                this.WidgetConfigs[i] = new ClarificationWidgetConfig(source.WidgetConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamArrayObj(map, prefix + "WidgetConfigs.", this.WidgetConfigs);

    }
}

