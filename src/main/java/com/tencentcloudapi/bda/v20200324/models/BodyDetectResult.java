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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BodyDetectResult extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamObj(map, prefix + "BodyRect.", this.BodyRect);

    }
}

