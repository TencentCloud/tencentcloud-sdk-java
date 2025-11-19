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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VisionDetectedObject extends AbstractModel {

    /**
    * 目标出现的媒体时间戳（以图片为输入时始终取值 0）
    */
    @SerializedName("Time")
    @Expose
    private Float Time;

    /**
    * 目标类别名
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 目标边界框（坐标顺序为 x1, y1, x2, y2）
    */
    @SerializedName("BoundingBox")
    @Expose
    private Float [] BoundingBox;

    /**
    * 置信度（取值范围 0.0 至 1.0）
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get 目标出现的媒体时间戳（以图片为输入时始终取值 0） 
     * @return Time 目标出现的媒体时间戳（以图片为输入时始终取值 0）
     */
    public Float getTime() {
        return this.Time;
    }

    /**
     * Set 目标出现的媒体时间戳（以图片为输入时始终取值 0）
     * @param Time 目标出现的媒体时间戳（以图片为输入时始终取值 0）
     */
    public void setTime(Float Time) {
        this.Time = Time;
    }

    /**
     * Get 目标类别名 
     * @return ClassName 目标类别名
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 目标类别名
     * @param ClassName 目标类别名
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get 目标边界框（坐标顺序为 x1, y1, x2, y2） 
     * @return BoundingBox 目标边界框（坐标顺序为 x1, y1, x2, y2）
     */
    public Float [] getBoundingBox() {
        return this.BoundingBox;
    }

    /**
     * Set 目标边界框（坐标顺序为 x1, y1, x2, y2）
     * @param BoundingBox 目标边界框（坐标顺序为 x1, y1, x2, y2）
     */
    public void setBoundingBox(Float [] BoundingBox) {
        this.BoundingBox = BoundingBox;
    }

    /**
     * Get 置信度（取值范围 0.0 至 1.0） 
     * @return Confidence 置信度（取值范围 0.0 至 1.0）
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度（取值范围 0.0 至 1.0）
     * @param Confidence 置信度（取值范围 0.0 至 1.0）
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public VisionDetectedObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VisionDetectedObject(VisionDetectedObject source) {
        if (source.Time != null) {
            this.Time = new Float(source.Time);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.BoundingBox != null) {
            this.BoundingBox = new Float[source.BoundingBox.length];
            for (int i = 0; i < source.BoundingBox.length; i++) {
                this.BoundingBox[i] = new Float(source.BoundingBox[i]);
            }
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamArraySimple(map, prefix + "BoundingBox.", this.BoundingBox);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

