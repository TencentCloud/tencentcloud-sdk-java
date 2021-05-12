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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Eyebrow extends AbstractModel{

    /**
    * 眉毛浓密。
AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。
    */
    @SerializedName("EyebrowDensity")
    @Expose
    private AttributeItem EyebrowDensity;

    /**
    * 眉毛弯曲。
AttributeItem对应的Type为 —— 0：不弯，1：弯眉。
    */
    @SerializedName("EyebrowCurve")
    @Expose
    private AttributeItem EyebrowCurve;

    /**
    * 眉毛长短。
AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。
    */
    @SerializedName("EyebrowLength")
    @Expose
    private AttributeItem EyebrowLength;

    /**
     * Get 眉毛浓密。
AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。 
     * @return EyebrowDensity 眉毛浓密。
AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。
     */
    public AttributeItem getEyebrowDensity() {
        return this.EyebrowDensity;
    }

    /**
     * Set 眉毛浓密。
AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。
     * @param EyebrowDensity 眉毛浓密。
AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。
     */
    public void setEyebrowDensity(AttributeItem EyebrowDensity) {
        this.EyebrowDensity = EyebrowDensity;
    }

    /**
     * Get 眉毛弯曲。
AttributeItem对应的Type为 —— 0：不弯，1：弯眉。 
     * @return EyebrowCurve 眉毛弯曲。
AttributeItem对应的Type为 —— 0：不弯，1：弯眉。
     */
    public AttributeItem getEyebrowCurve() {
        return this.EyebrowCurve;
    }

    /**
     * Set 眉毛弯曲。
AttributeItem对应的Type为 —— 0：不弯，1：弯眉。
     * @param EyebrowCurve 眉毛弯曲。
AttributeItem对应的Type为 —— 0：不弯，1：弯眉。
     */
    public void setEyebrowCurve(AttributeItem EyebrowCurve) {
        this.EyebrowCurve = EyebrowCurve;
    }

    /**
     * Get 眉毛长短。
AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。 
     * @return EyebrowLength 眉毛长短。
AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。
     */
    public AttributeItem getEyebrowLength() {
        return this.EyebrowLength;
    }

    /**
     * Set 眉毛长短。
AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。
     * @param EyebrowLength 眉毛长短。
AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。
     */
    public void setEyebrowLength(AttributeItem EyebrowLength) {
        this.EyebrowLength = EyebrowLength;
    }

    public Eyebrow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Eyebrow(Eyebrow source) {
        if (source.EyebrowDensity != null) {
            this.EyebrowDensity = new AttributeItem(source.EyebrowDensity);
        }
        if (source.EyebrowCurve != null) {
            this.EyebrowCurve = new AttributeItem(source.EyebrowCurve);
        }
        if (source.EyebrowLength != null) {
            this.EyebrowLength = new AttributeItem(source.EyebrowLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EyebrowDensity.", this.EyebrowDensity);
        this.setParamObj(map, prefix + "EyebrowCurve.", this.EyebrowCurve);
        this.setParamObj(map, prefix + "EyebrowLength.", this.EyebrowLength);

    }
}

