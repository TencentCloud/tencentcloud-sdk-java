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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleItem extends AbstractModel{

    /**
    * 语音识别结果
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 中文翻译结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zh")
    @Expose
    private String Zh;

    /**
    * 英文翻译结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("En")
    @Expose
    private String En;

    /**
    * 语句起始时间戳PTS(ms)
    */
    @SerializedName("StartPts")
    @Expose
    private Long StartPts;

    /**
    * 语句结束时间戳PTS(ms)
    */
    @SerializedName("EndPts")
    @Expose
    private Long EndPts;

    /**
    * 字符串形式的起始结束时间
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * 结果的置信度（百分制）
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 当前语句是否结束
    */
    @SerializedName("EndFlag")
    @Expose
    private Boolean EndFlag;

    /**
    * 语句分割时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PuncEndTs")
    @Expose
    private String PuncEndTs;

    /**
     * Get 语音识别结果 
     * @return Id 语音识别结果
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 语音识别结果
     * @param Id 语音识别结果
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 中文翻译结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zh 中文翻译结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZh() {
        return this.Zh;
    }

    /**
     * Set 中文翻译结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zh 中文翻译结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZh(String Zh) {
        this.Zh = Zh;
    }

    /**
     * Get 英文翻译结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return En 英文翻译结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEn() {
        return this.En;
    }

    /**
     * Set 英文翻译结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param En 英文翻译结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEn(String En) {
        this.En = En;
    }

    /**
     * Get 语句起始时间戳PTS(ms) 
     * @return StartPts 语句起始时间戳PTS(ms)
     */
    public Long getStartPts() {
        return this.StartPts;
    }

    /**
     * Set 语句起始时间戳PTS(ms)
     * @param StartPts 语句起始时间戳PTS(ms)
     */
    public void setStartPts(Long StartPts) {
        this.StartPts = StartPts;
    }

    /**
     * Get 语句结束时间戳PTS(ms) 
     * @return EndPts 语句结束时间戳PTS(ms)
     */
    public Long getEndPts() {
        return this.EndPts;
    }

    /**
     * Set 语句结束时间戳PTS(ms)
     * @param EndPts 语句结束时间戳PTS(ms)
     */
    public void setEndPts(Long EndPts) {
        this.EndPts = EndPts;
    }

    /**
     * Get 字符串形式的起始结束时间 
     * @return Period 字符串形式的起始结束时间
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 字符串形式的起始结束时间
     * @param Period 字符串形式的起始结束时间
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get 结果的置信度（百分制） 
     * @return Confidence 结果的置信度（百分制）
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 结果的置信度（百分制）
     * @param Confidence 结果的置信度（百分制）
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 当前语句是否结束 
     * @return EndFlag 当前语句是否结束
     */
    public Boolean getEndFlag() {
        return this.EndFlag;
    }

    /**
     * Set 当前语句是否结束
     * @param EndFlag 当前语句是否结束
     */
    public void setEndFlag(Boolean EndFlag) {
        this.EndFlag = EndFlag;
    }

    /**
     * Get 语句分割时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PuncEndTs 语句分割时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPuncEndTs() {
        return this.PuncEndTs;
    }

    /**
     * Set 语句分割时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param PuncEndTs 语句分割时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPuncEndTs(String PuncEndTs) {
        this.PuncEndTs = PuncEndTs;
    }

    public SubtitleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleItem(SubtitleItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Zh != null) {
            this.Zh = new String(source.Zh);
        }
        if (source.En != null) {
            this.En = new String(source.En);
        }
        if (source.StartPts != null) {
            this.StartPts = new Long(source.StartPts);
        }
        if (source.EndPts != null) {
            this.EndPts = new Long(source.EndPts);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.EndFlag != null) {
            this.EndFlag = new Boolean(source.EndFlag);
        }
        if (source.PuncEndTs != null) {
            this.PuncEndTs = new String(source.PuncEndTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Zh", this.Zh);
        this.setParamSimple(map, prefix + "En", this.En);
        this.setParamSimple(map, prefix + "StartPts", this.StartPts);
        this.setParamSimple(map, prefix + "EndPts", this.EndPts);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "EndFlag", this.EndFlag);
        this.setParamSimple(map, prefix + "PuncEndTs", this.PuncEndTs);

    }
}

