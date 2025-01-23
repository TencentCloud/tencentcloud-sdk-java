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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AICallExtractConfigElement extends AbstractModel {

    /**
    * 配置项类型，包括
Text 文本
Selector 选项
Boolean 布尔值
Number 数字
    */
    @SerializedName("InfoType")
    @Expose
    private String InfoType;

    /**
    * 配置项名称，不可重复
    */
    @SerializedName("InfoName")
    @Expose
    private String InfoName;

    /**
    * 配置项具体内容
    */
    @SerializedName("InfoContent")
    @Expose
    private String InfoContent;

    /**
    * 配置项提取内容示例
    */
    @SerializedName("Examples")
    @Expose
    private String [] Examples;

    /**
    * InfoType 为 Selector，需要配置此字段
    */
    @SerializedName("Choices")
    @Expose
    private String [] Choices;

    /**
     * Get 配置项类型，包括
Text 文本
Selector 选项
Boolean 布尔值
Number 数字 
     * @return InfoType 配置项类型，包括
Text 文本
Selector 选项
Boolean 布尔值
Number 数字
     */
    public String getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 配置项类型，包括
Text 文本
Selector 选项
Boolean 布尔值
Number 数字
     * @param InfoType 配置项类型，包括
Text 文本
Selector 选项
Boolean 布尔值
Number 数字
     */
    public void setInfoType(String InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 配置项名称，不可重复 
     * @return InfoName 配置项名称，不可重复
     */
    public String getInfoName() {
        return this.InfoName;
    }

    /**
     * Set 配置项名称，不可重复
     * @param InfoName 配置项名称，不可重复
     */
    public void setInfoName(String InfoName) {
        this.InfoName = InfoName;
    }

    /**
     * Get 配置项具体内容 
     * @return InfoContent 配置项具体内容
     */
    public String getInfoContent() {
        return this.InfoContent;
    }

    /**
     * Set 配置项具体内容
     * @param InfoContent 配置项具体内容
     */
    public void setInfoContent(String InfoContent) {
        this.InfoContent = InfoContent;
    }

    /**
     * Get 配置项提取内容示例 
     * @return Examples 配置项提取内容示例
     */
    public String [] getExamples() {
        return this.Examples;
    }

    /**
     * Set 配置项提取内容示例
     * @param Examples 配置项提取内容示例
     */
    public void setExamples(String [] Examples) {
        this.Examples = Examples;
    }

    /**
     * Get InfoType 为 Selector，需要配置此字段 
     * @return Choices InfoType 为 Selector，需要配置此字段
     */
    public String [] getChoices() {
        return this.Choices;
    }

    /**
     * Set InfoType 为 Selector，需要配置此字段
     * @param Choices InfoType 为 Selector，需要配置此字段
     */
    public void setChoices(String [] Choices) {
        this.Choices = Choices;
    }

    public AICallExtractConfigElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallExtractConfigElement(AICallExtractConfigElement source) {
        if (source.InfoType != null) {
            this.InfoType = new String(source.InfoType);
        }
        if (source.InfoName != null) {
            this.InfoName = new String(source.InfoName);
        }
        if (source.InfoContent != null) {
            this.InfoContent = new String(source.InfoContent);
        }
        if (source.Examples != null) {
            this.Examples = new String[source.Examples.length];
            for (int i = 0; i < source.Examples.length; i++) {
                this.Examples[i] = new String(source.Examples[i]);
            }
        }
        if (source.Choices != null) {
            this.Choices = new String[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new String(source.Choices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "InfoName", this.InfoName);
        this.setParamSimple(map, prefix + "InfoContent", this.InfoContent);
        this.setParamArraySimple(map, prefix + "Examples.", this.Examples);
        this.setParamArraySimple(map, prefix + "Choices.", this.Choices);

    }
}

