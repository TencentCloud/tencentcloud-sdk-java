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
    * <p>提取的类型是文本</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>提取的类型是选项</p>
    */
    @SerializedName("Chosen")
    @Expose
    private String [] Chosen;

    /**
    * <p>提取类型是布尔值</p>
    */
    @SerializedName("Boolean")
    @Expose
    private Boolean Boolean;

    /**
    * <p>提取类型是数字</p>
    */
    @SerializedName("Number")
    @Expose
    private Float Number;

    /**
     * Get <p>提取的类型是文本</p> 
     * @return Text <p>提取的类型是文本</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>提取的类型是文本</p>
     * @param Text <p>提取的类型是文本</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>提取的类型是选项</p> 
     * @return Chosen <p>提取的类型是选项</p>
     */
    public String [] getChosen() {
        return this.Chosen;
    }

    /**
     * Set <p>提取的类型是选项</p>
     * @param Chosen <p>提取的类型是选项</p>
     */
    public void setChosen(String [] Chosen) {
        this.Chosen = Chosen;
    }

    /**
     * Get <p>提取类型是布尔值</p> 
     * @return Boolean <p>提取类型是布尔值</p>
     */
    public Boolean getBoolean() {
        return this.Boolean;
    }

    /**
     * Set <p>提取类型是布尔值</p>
     * @param Boolean <p>提取类型是布尔值</p>
     */
    public void setBoolean(Boolean Boolean) {
        this.Boolean = Boolean;
    }

    /**
     * Get <p>提取类型是数字</p> 
     * @return Number <p>提取类型是数字</p>
     */
    public Float getNumber() {
        return this.Number;
    }

    /**
     * Set <p>提取类型是数字</p>
     * @param Number <p>提取类型是数字</p>
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

