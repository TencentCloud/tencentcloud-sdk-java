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

public class LiveSmartSubtitleResult extends AbstractModel {

    /**
    * 识别文本。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 翻译片段起始的 PTS 时间，单位：秒。
    */
    @SerializedName("StartPTSTime")
    @Expose
    private Float StartPTSTime;

    /**
    * 翻译片段终止的 PTS 时间，单位：秒。
    */
    @SerializedName("EndPTSTime")
    @Expose
    private Float EndPTSTime;

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
    * websocket与trtc实时翻译的UserId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

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
     * @return StartPTSTime 翻译片段起始的 PTS 时间，单位：秒。
     */
    public Float getStartPTSTime() {
        return this.StartPTSTime;
    }

    /**
     * Set 翻译片段起始的 PTS 时间，单位：秒。
     * @param StartPTSTime 翻译片段起始的 PTS 时间，单位：秒。
     */
    public void setStartPTSTime(Float StartPTSTime) {
        this.StartPTSTime = StartPTSTime;
    }

    /**
     * Get 翻译片段终止的 PTS 时间，单位：秒。 
     * @return EndPTSTime 翻译片段终止的 PTS 时间，单位：秒。
     */
    public Float getEndPTSTime() {
        return this.EndPTSTime;
    }

    /**
     * Set 翻译片段终止的 PTS 时间，单位：秒。
     * @param EndPTSTime 翻译片段终止的 PTS 时间，单位：秒。
     */
    public void setEndPTSTime(Float EndPTSTime) {
        this.EndPTSTime = EndPTSTime;
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

    /**
     * Get websocket与trtc实时翻译的UserId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId websocket与trtc实时翻译的UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set websocket与trtc实时翻译的UserId
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId websocket与trtc实时翻译的UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public LiveSmartSubtitleResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveSmartSubtitleResult(LiveSmartSubtitleResult source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.StartPTSTime != null) {
            this.StartPTSTime = new Float(source.StartPTSTime);
        }
        if (source.EndPTSTime != null) {
            this.EndPTSTime = new Float(source.EndPTSTime);
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
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "StartPTSTime", this.StartPTSTime);
        this.setParamSimple(map, prefix + "EndPTSTime", this.EndPTSTime);
        this.setParamSimple(map, prefix + "Trans", this.Trans);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SteadyState", this.SteadyState);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

