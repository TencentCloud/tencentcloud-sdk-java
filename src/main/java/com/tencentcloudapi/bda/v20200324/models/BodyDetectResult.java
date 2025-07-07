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

public class BodyDetectResult extends AbstractModel {

    /**
    * 检测出的人体置信度。 
误识率百分之十对应的阈值是0.14；误识率百分之五对应的阈值是0.32；误识率百分之二对应的阈值是0.62；误识率百分之一对应的阈值是0.81。 
通常情况建议使用阈值0.32，可适用大多数情况。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 图中检测出来的人体框
    */
    @SerializedName("BodyRect")
    @Expose
    private BodyRect BodyRect;

    /**
    * 图中检测出的人体属性信息。
    */
    @SerializedName("BodyAttributeInfo")
    @Expose
    private BodyAttributeInfo BodyAttributeInfo;

    /**
     * Get 检测出的人体置信度。 
误识率百分之十对应的阈值是0.14；误识率百分之五对应的阈值是0.32；误识率百分之二对应的阈值是0.62；误识率百分之一对应的阈值是0.81。 
通常情况建议使用阈值0.32，可适用大多数情况。 
     * @return Confidence 检测出的人体置信度。 
误识率百分之十对应的阈值是0.14；误识率百分之五对应的阈值是0.32；误识率百分之二对应的阈值是0.62；误识率百分之一对应的阈值是0.81。 
通常情况建议使用阈值0.32，可适用大多数情况。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 检测出的人体置信度。 
误识率百分之十对应的阈值是0.14；误识率百分之五对应的阈值是0.32；误识率百分之二对应的阈值是0.62；误识率百分之一对应的阈值是0.81。 
通常情况建议使用阈值0.32，可适用大多数情况。
     * @param Confidence 检测出的人体置信度。 
误识率百分之十对应的阈值是0.14；误识率百分之五对应的阈值是0.32；误识率百分之二对应的阈值是0.62；误识率百分之一对应的阈值是0.81。 
通常情况建议使用阈值0.32，可适用大多数情况。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 图中检测出来的人体框 
     * @return BodyRect 图中检测出来的人体框
     */
    public BodyRect getBodyRect() {
        return this.BodyRect;
    }

    /**
     * Set 图中检测出来的人体框
     * @param BodyRect 图中检测出来的人体框
     */
    public void setBodyRect(BodyRect BodyRect) {
        this.BodyRect = BodyRect;
    }

    /**
     * Get 图中检测出的人体属性信息。 
     * @return BodyAttributeInfo 图中检测出的人体属性信息。
     */
    public BodyAttributeInfo getBodyAttributeInfo() {
        return this.BodyAttributeInfo;
    }

    /**
     * Set 图中检测出的人体属性信息。
     * @param BodyAttributeInfo 图中检测出的人体属性信息。
     */
    public void setBodyAttributeInfo(BodyAttributeInfo BodyAttributeInfo) {
        this.BodyAttributeInfo = BodyAttributeInfo;
    }

    public BodyDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BodyDetectResult(BodyDetectResult source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.BodyRect != null) {
            this.BodyRect = new BodyRect(source.BodyRect);
        }
        if (source.BodyAttributeInfo != null) {
            this.BodyAttributeInfo = new BodyAttributeInfo(source.BodyAttributeInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamObj(map, prefix + "BodyRect.", this.BodyRect);
        this.setParamObj(map, prefix + "BodyAttributeInfo.", this.BodyAttributeInfo);

    }
}

