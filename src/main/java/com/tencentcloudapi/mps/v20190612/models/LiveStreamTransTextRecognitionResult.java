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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamTransTextRecognitionResult extends AbstractModel{

    /**
    * 识别文本。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 翻译片段起始的 PTS 时间，单位：秒。
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * 翻译片段终止的 PTS 时间，单位：秒。
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * 翻译片段置信度。取值：0~100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 翻译文本。
    */
    @SerializedName("Trans")
    @Expose
    private String Trans;

    /**
    * 翻译开始UTC时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 翻译结束UTC时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 稳态标记。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SteadyState")
    @Expose
    private Boolean SteadyState;

    /**
     * Get 识别文本。 
     * @return Text 识别文本。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 识别文本。
     * @param Text 识别文本。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 翻译片段起始的 PTS 时间，单位：秒。 
     * @return StartPtsTime 翻译片段起始的 PTS 时间，单位：秒。
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set 翻译片段起始的 PTS 时间，单位：秒。
     * @param StartPtsTime 翻译片段起始的 PTS 时间，单位：秒。
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get 翻译片段终止的 PTS 时间，单位：秒。 
     * @return EndPtsTime 翻译片段终止的 PTS 时间，单位：秒。
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set 翻译片段终止的 PTS 时间，单位：秒。
     * @param EndPtsTime 翻译片段终止的 PTS 时间，单位：秒。
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get 翻译片段置信度。取值：0~100。 
     * @return Confidence 翻译片段置信度。取值：0~100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 翻译片段置信度。取值：0~100。
     * @param Confidence 翻译片段置信度。取值：0~100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 翻译文本。 
     * @return Trans 翻译文本。
     */
    public String getTrans() {
        return this.Trans;
    }

    /**
     * Set 翻译文本。
     * @param Trans 翻译文本。
     */
    public void setTrans(String Trans) {
        this.Trans = Trans;
    }

    /**
     * Get 翻译开始UTC时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 翻译开始UTC时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 翻译开始UTC时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 翻译开始UTC时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 翻译结束UTC时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 翻译结束UTC时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 翻译结束UTC时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 翻译结束UTC时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 稳态标记。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SteadyState 稳态标记。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSteadyState() {
        return this.SteadyState;
    }

    /**
     * Set 稳态标记。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SteadyState 稳态标记。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSteadyState(Boolean SteadyState) {
        this.SteadyState = SteadyState;
    }

    public LiveStreamTransTextRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamTransTextRecognitionResult(LiveStreamTransTextRecognitionResult source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.StartPtsTime != null) {
            this.StartPtsTime = new Float(source.StartPtsTime);
        }
        if (source.EndPtsTime != null) {
            this.EndPtsTime = new Float(source.EndPtsTime);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Trans != null) {
            this.Trans = new String(source.Trans);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SteadyState != null) {
            this.SteadyState = new Boolean(source.SteadyState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Trans", this.Trans);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SteadyState", this.SteadyState);

    }
}

