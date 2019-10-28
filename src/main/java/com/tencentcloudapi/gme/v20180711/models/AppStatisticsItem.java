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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppStatisticsItem  extends AbstractModel{

    /**
    * 实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealtimeSpeechStatisticsItem")
    @Expose
    private RealTimeSpeechStatisticsItem RealtimeSpeechStatisticsItem;

    /**
    * 语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceMessageStatisticsItem")
    @Expose
    private VoiceMessageStatisticsItem VoiceMessageStatisticsItem;

    /**
    * 语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceFilterStatisticsItem")
    @Expose
    private VoiceFilterStatisticsItem VoiceFilterStatisticsItem;

    /**
    * 统计时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * 获取实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @return RealtimeSpeechStatisticsItem 实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RealTimeSpeechStatisticsItem getRealtimeSpeechStatisticsItem() {
        return this.RealtimeSpeechStatisticsItem;
    }

    /**
     * 设置实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealtimeSpeechStatisticsItem 实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealtimeSpeechStatisticsItem(RealTimeSpeechStatisticsItem RealtimeSpeechStatisticsItem) {
        this.RealtimeSpeechStatisticsItem = RealtimeSpeechStatisticsItem;
    }

    /**
     * 获取语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @return VoiceMessageStatisticsItem 语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VoiceMessageStatisticsItem getVoiceMessageStatisticsItem() {
        return this.VoiceMessageStatisticsItem;
    }

    /**
     * 设置语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceMessageStatisticsItem 语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceMessageStatisticsItem(VoiceMessageStatisticsItem VoiceMessageStatisticsItem) {
        this.VoiceMessageStatisticsItem = VoiceMessageStatisticsItem;
    }

    /**
     * 获取语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @return VoiceFilterStatisticsItem 语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VoiceFilterStatisticsItem getVoiceFilterStatisticsItem() {
        return this.VoiceFilterStatisticsItem;
    }

    /**
     * 设置语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceFilterStatisticsItem 语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceFilterStatisticsItem(VoiceFilterStatisticsItem VoiceFilterStatisticsItem) {
        this.VoiceFilterStatisticsItem = VoiceFilterStatisticsItem;
    }

    /**
     * 获取统计时间
     * @return Date 统计时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置统计时间
     * @param Date 统计时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RealtimeSpeechStatisticsItem.", this.RealtimeSpeechStatisticsItem);
        this.setParamObj(map, prefix + "VoiceMessageStatisticsItem.", this.VoiceMessageStatisticsItem);
        this.setParamObj(map, prefix + "VoiceFilterStatisticsItem.", this.VoiceFilterStatisticsItem);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

