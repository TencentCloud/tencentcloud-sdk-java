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
package com.tencentcloudapi.tsi.v20210325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayInfo extends AbstractModel {

    /**
    * 句子 ID
    */
    @SerializedName("SeId")
    @Expose
    private String SeId;

    /**
    * 句子版本号
    */
    @SerializedName("SeVer")
    @Expose
    private Long SeVer;

    /**
    * 识别结果
    */
    @SerializedName("SourceText")
    @Expose
    private String SourceText;

    /**
    *  翻译结果
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * 句子开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 句子结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    *  当前句子是否已结束
    */
    @SerializedName("IsEnd")
    @Expose
    private Boolean IsEnd;

    /**
     * Get 句子 ID 
     * @return SeId 句子 ID
     */
    public String getSeId() {
        return this.SeId;
    }

    /**
     * Set 句子 ID
     * @param SeId 句子 ID
     */
    public void setSeId(String SeId) {
        this.SeId = SeId;
    }

    /**
     * Get 句子版本号 
     * @return SeVer 句子版本号
     */
    public Long getSeVer() {
        return this.SeVer;
    }

    /**
     * Set 句子版本号
     * @param SeVer 句子版本号
     */
    public void setSeVer(Long SeVer) {
        this.SeVer = SeVer;
    }

    /**
     * Get 识别结果 
     * @return SourceText 识别结果
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * Set 识别结果
     * @param SourceText 识别结果
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * Get  翻译结果 
     * @return TargetText  翻译结果
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set  翻译结果
     * @param TargetText  翻译结果
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get 句子开始时间 
     * @return StartTime 句子开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 句子开始时间
     * @param StartTime 句子开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 句子结束时间 
     * @return EndTime 句子结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 句子结束时间
     * @param EndTime 句子结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  当前句子是否已结束 
     * @return IsEnd  当前句子是否已结束
     */
    public Boolean getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set  当前句子是否已结束
     * @param IsEnd  当前句子是否已结束
     */
    public void setIsEnd(Boolean IsEnd) {
        this.IsEnd = IsEnd;
    }

    public DisplayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayInfo(DisplayInfo source) {
        if (source.SeId != null) {
            this.SeId = new String(source.SeId);
        }
        if (source.SeVer != null) {
            this.SeVer = new Long(source.SeVer);
        }
        if (source.SourceText != null) {
            this.SourceText = new String(source.SourceText);
        }
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.IsEnd != null) {
            this.IsEnd = new Boolean(source.IsEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SeId", this.SeId);
        this.setParamSimple(map, prefix + "SeVer", this.SeVer);
        this.setParamSimple(map, prefix + "SourceText", this.SourceText);
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);

    }
}

