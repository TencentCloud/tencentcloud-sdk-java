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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributeItem extends AbstractModel{

    /**
    * 属性值
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Type识别概率值，【0,1】,代表判断正确的概率。
    */
    @SerializedName("Probability")
    @Expose
    private Float Probability;

    /**
     * Get 属性值 
     * @return Type 属性值
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 属性值
     * @param Type 属性值
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Type识别概率值，【0,1】,代表判断正确的概率。 
     * @return Probability Type识别概率值，【0,1】,代表判断正确的概率。
     */
    public Float getProbability() {
        return this.Probability;
    }

    /**
     * Set Type识别概率值，【0,1】,代表判断正确的概率。
     * @param Probability Type识别概率值，【0,1】,代表判断正确的概率。
     */
    public void setProbability(Float Probability) {
        this.Probability = Probability;
    }

    public AttributeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributeItem(AttributeItem source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Probability != null) {
            this.Probability = new Float(source.Probability);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Probability", this.Probability);

    }
}

