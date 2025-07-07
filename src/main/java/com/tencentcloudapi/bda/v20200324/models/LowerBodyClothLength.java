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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LowerBodyClothLength extends AbstractModel {

    /**
    * 下衣长度信息，返回值为以下集合中的一个，{长, 短} 。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Type识别概率值，[0.0,1.0],代表判断正确的概率。如0.8则代表有Type值有80%概率正确。
    */
    @SerializedName("Probability")
    @Expose
    private Float Probability;

    /**
     * Get 下衣长度信息，返回值为以下集合中的一个，{长, 短} 。 
     * @return Type 下衣长度信息，返回值为以下集合中的一个，{长, 短} 。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 下衣长度信息，返回值为以下集合中的一个，{长, 短} 。
     * @param Type 下衣长度信息，返回值为以下集合中的一个，{长, 短} 。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Type识别概率值，[0.0,1.0],代表判断正确的概率。如0.8则代表有Type值有80%概率正确。 
     * @return Probability Type识别概率值，[0.0,1.0],代表判断正确的概率。如0.8则代表有Type值有80%概率正确。
     */
    public Float getProbability() {
        return this.Probability;
    }

    /**
     * Set Type识别概率值，[0.0,1.0],代表判断正确的概率。如0.8则代表有Type值有80%概率正确。
     * @param Probability Type识别概率值，[0.0,1.0],代表判断正确的概率。如0.8则代表有Type值有80%概率正确。
     */
    public void setProbability(Float Probability) {
        this.Probability = Probability;
    }

    public LowerBodyClothLength() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LowerBodyClothLength(LowerBodyClothLength source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
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

