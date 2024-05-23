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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamObjectRecognitionResult extends AbstractModel {

    /**
    * 识别的物体名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 识别片段起始的 PTS 时间，单位：秒。
    */
    @SerializedName("StartPtsOffset")
    @Expose
    private Float StartPtsOffset;

    /**
    * 识别片段终止的 PTS 时间，单位：秒。
    */
    @SerializedName("EndPtsOffset")
    @Expose
    private Float EndPtsOffset;

    /**
    * 识别片段置信度。取值：0~100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
     * Get 识别的物体名称。 
     * @return Name 识别的物体名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 识别的物体名称。
     * @param Name 识别的物体名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 识别片段起始的 PTS 时间，单位：秒。 
     * @return StartPtsOffset 识别片段起始的 PTS 时间，单位：秒。
     */
    public Float getStartPtsOffset() {
        return this.StartPtsOffset;
    }

    /**
     * Set 识别片段起始的 PTS 时间，单位：秒。
     * @param StartPtsOffset 识别片段起始的 PTS 时间，单位：秒。
     */
    public void setStartPtsOffset(Float StartPtsOffset) {
        this.StartPtsOffset = StartPtsOffset;
    }

    /**
     * Get 识别片段终止的 PTS 时间，单位：秒。 
     * @return EndPtsOffset 识别片段终止的 PTS 时间，单位：秒。
     */
    public Float getEndPtsOffset() {
        return this.EndPtsOffset;
    }

    /**
     * Set 识别片段终止的 PTS 时间，单位：秒。
     * @param EndPtsOffset 识别片段终止的 PTS 时间，单位：秒。
     */
    public void setEndPtsOffset(Float EndPtsOffset) {
        this.EndPtsOffset = EndPtsOffset;
    }

    /**
     * Get 识别片段置信度。取值：0~100。 
     * @return Confidence 识别片段置信度。取值：0~100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 识别片段置信度。取值：0~100。
     * @param Confidence 识别片段置信度。取值：0~100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。 
     * @return AreaCoordSet 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
     * @param AreaCoordSet 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    public LiveStreamObjectRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamObjectRecognitionResult(LiveStreamObjectRecognitionResult source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartPtsOffset != null) {
            this.StartPtsOffset = new Float(source.StartPtsOffset);
        }
        if (source.EndPtsOffset != null) {
            this.EndPtsOffset = new Float(source.EndPtsOffset);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartPtsOffset", this.StartPtsOffset);
        this.setParamSimple(map, prefix + "EndPtsOffset", this.EndPtsOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);

    }
}

