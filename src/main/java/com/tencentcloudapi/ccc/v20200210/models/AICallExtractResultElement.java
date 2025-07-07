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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AICallExtractResultElement extends AbstractModel {

    /**
    * 提取信息的类型
Text 文本
Selector 选项
Boolean 布尔值
Number 数字
    */
    @SerializedName("InfoType")
    @Expose
    private String InfoType;

    /**
    * 提取信息的名称
    */
    @SerializedName("InfoName")
    @Expose
    private String InfoName;

    /**
    * 提取信息的具体描述
    */
    @SerializedName("InfoContent")
    @Expose
    private String InfoContent;

    /**
    * 提取信息的具体结果
    */
    @SerializedName("Result")
    @Expose
    private AICallExtractResultInfo Result;

    /**
     * Get 提取信息的类型
Text 文本
Selector 选项
Boolean 布尔值
Number 数字 
     * @return InfoType 提取信息的类型
Text 文本
Selector 选项
Boolean 布尔值
Number 数字
     */
    public String getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 提取信息的类型
Text 文本
Selector 选项
Boolean 布尔值
Number 数字
     * @param InfoType 提取信息的类型
Text 文本
Selector 选项
Boolean 布尔值
Number 数字
     */
    public void setInfoType(String InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 提取信息的名称 
     * @return InfoName 提取信息的名称
     */
    public String getInfoName() {
        return this.InfoName;
    }

    /**
     * Set 提取信息的名称
     * @param InfoName 提取信息的名称
     */
    public void setInfoName(String InfoName) {
        this.InfoName = InfoName;
    }

    /**
     * Get 提取信息的具体描述 
     * @return InfoContent 提取信息的具体描述
     */
    public String getInfoContent() {
        return this.InfoContent;
    }

    /**
     * Set 提取信息的具体描述
     * @param InfoContent 提取信息的具体描述
     */
    public void setInfoContent(String InfoContent) {
        this.InfoContent = InfoContent;
    }

    /**
     * Get 提取信息的具体结果 
     * @return Result 提取信息的具体结果
     */
    public AICallExtractResultInfo getResult() {
        return this.Result;
    }

    /**
     * Set 提取信息的具体结果
     * @param Result 提取信息的具体结果
     */
    public void setResult(AICallExtractResultInfo Result) {
        this.Result = Result;
    }

    public AICallExtractResultElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallExtractResultElement(AICallExtractResultElement source) {
        if (source.InfoType != null) {
            this.InfoType = new String(source.InfoType);
        }
        if (source.InfoName != null) {
            this.InfoName = new String(source.InfoName);
        }
        if (source.InfoContent != null) {
            this.InfoContent = new String(source.InfoContent);
        }
        if (source.Result != null) {
            this.Result = new AICallExtractResultInfo(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "InfoName", this.InfoName);
        this.setParamSimple(map, prefix + "InfoContent", this.InfoContent);
        this.setParamObj(map, prefix + "Result.", this.Result);

    }
}

