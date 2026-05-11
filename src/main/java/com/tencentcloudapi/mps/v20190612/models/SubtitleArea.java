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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleArea extends AbstractModel {

    /**
    * <p>检测到的字幕区域</p>
    */
    @SerializedName("Area")
    @Expose
    private EraseArea Area;

    /**
    * <p>检测区域的置信度</p><p>取值范围：[0, 100]</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get <p>检测到的字幕区域</p> 
     * @return Area <p>检测到的字幕区域</p>
     */
    public EraseArea getArea() {
        return this.Area;
    }

    /**
     * Set <p>检测到的字幕区域</p>
     * @param Area <p>检测到的字幕区域</p>
     */
    public void setArea(EraseArea Area) {
        this.Area = Area;
    }

    /**
     * Get <p>检测区域的置信度</p><p>取值范围：[0, 100]</p> 
     * @return Confidence <p>检测区域的置信度</p><p>取值范围：[0, 100]</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>检测区域的置信度</p><p>取值范围：[0, 100]</p>
     * @param Confidence <p>检测区域的置信度</p><p>取值范围：[0, 100]</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public SubtitleArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleArea(SubtitleArea source) {
        if (source.Area != null) {
            this.Area = new EraseArea(source.Area);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Area.", this.Area);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

