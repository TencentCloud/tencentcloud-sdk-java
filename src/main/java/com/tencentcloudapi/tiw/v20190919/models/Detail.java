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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Detail extends AbstractModel{

    /**
    * 用量指标
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 用量权重
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
    * 用量的值
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get 用量指标 
     * @return TagName 用量指标
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 用量指标
     * @param TagName 用量指标
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 用量权重 
     * @return Weight 用量权重
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set 用量权重
     * @param Weight 用量权重
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 用量的值 
     * @return Value 用量的值
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 用量的值
     * @param Value 用量的值
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public Detail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Detail(Detail source) {
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

