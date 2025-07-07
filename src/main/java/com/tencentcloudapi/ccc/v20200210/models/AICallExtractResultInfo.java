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

public class AICallExtractResultInfo extends AbstractModel {

    /**
    * 提取的类型是文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 提取的内型是选项
    */
    @SerializedName("Chosen")
    @Expose
    private String [] Chosen;

    /**
    * 提取类型是布尔值
    */
    @SerializedName("Boolean")
    @Expose
    private Boolean Boolean;

    /**
    * 提取类型是数字
    */
    @SerializedName("Number")
    @Expose
    private Float Number;

    /**
     * Get 提取的类型是文本 
     * @return Text 提取的类型是文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 提取的类型是文本
     * @param Text 提取的类型是文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 提取的内型是选项 
     * @return Chosen 提取的内型是选项
     */
    public String [] getChosen() {
        return this.Chosen;
    }

    /**
     * Set 提取的内型是选项
     * @param Chosen 提取的内型是选项
     */
    public void setChosen(String [] Chosen) {
        this.Chosen = Chosen;
    }

    /**
     * Get 提取类型是布尔值 
     * @return Boolean 提取类型是布尔值
     */
    public Boolean getBoolean() {
        return this.Boolean;
    }

    /**
     * Set 提取类型是布尔值
     * @param Boolean 提取类型是布尔值
     */
    public void setBoolean(Boolean Boolean) {
        this.Boolean = Boolean;
    }

    /**
     * Get 提取类型是数字 
     * @return Number 提取类型是数字
     */
    public Float getNumber() {
        return this.Number;
    }

    /**
     * Set 提取类型是数字
     * @param Number 提取类型是数字
     */
    public void setNumber(Float Number) {
        this.Number = Number;
    }

    public AICallExtractResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallExtractResultInfo(AICallExtractResultInfo source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Chosen != null) {
            this.Chosen = new String[source.Chosen.length];
            for (int i = 0; i < source.Chosen.length; i++) {
                this.Chosen[i] = new String(source.Chosen[i]);
            }
        }
        if (source.Boolean != null) {
            this.Boolean = new Boolean(source.Boolean);
        }
        if (source.Number != null) {
            this.Number = new Float(source.Number);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArraySimple(map, prefix + "Chosen.", this.Chosen);
        this.setParamSimple(map, prefix + "Boolean", this.Boolean);
        this.setParamSimple(map, prefix + "Number", this.Number);

    }
}

