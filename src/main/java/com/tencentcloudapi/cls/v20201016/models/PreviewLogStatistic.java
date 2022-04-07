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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewLogStatistic extends AbstractModel{

    /**
    * 日志内容
    */
    @SerializedName("LogContent")
    @Expose
    private String LogContent;

    /**
    * 行号
    */
    @SerializedName("LineNum")
    @Expose
    private Long LineNum;

    /**
    * 目标日志主题
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

    /**
    * 失败错误码， 空字符串""表示正常
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 日志时间戳
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 目标topic-name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstTopicName")
    @Expose
    private String DstTopicName;

    /**
     * Get 日志内容 
     * @return LogContent 日志内容
     */
    public String getLogContent() {
        return this.LogContent;
    }

    /**
     * Set 日志内容
     * @param LogContent 日志内容
     */
    public void setLogContent(String LogContent) {
        this.LogContent = LogContent;
    }

    /**
     * Get 行号 
     * @return LineNum 行号
     */
    public Long getLineNum() {
        return this.LineNum;
    }

    /**
     * Set 行号
     * @param LineNum 行号
     */
    public void setLineNum(Long LineNum) {
        this.LineNum = LineNum;
    }

    /**
     * Get 目标日志主题 
     * @return DstTopicId 目标日志主题
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set 目标日志主题
     * @param DstTopicId 目标日志主题
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
    }

    /**
     * Get 失败错误码， 空字符串""表示正常 
     * @return FailReason 失败错误码， 空字符串""表示正常
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败错误码， 空字符串""表示正常
     * @param FailReason 失败错误码， 空字符串""表示正常
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 日志时间戳 
     * @return Time 日志时间戳
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 日志时间戳
     * @param Time 日志时间戳
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 目标topic-name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstTopicName 目标topic-name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstTopicName() {
        return this.DstTopicName;
    }

    /**
     * Set 目标topic-name
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstTopicName 目标topic-name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstTopicName(String DstTopicName) {
        this.DstTopicName = DstTopicName;
    }

    public PreviewLogStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewLogStatistic(PreviewLogStatistic source) {
        if (source.LogContent != null) {
            this.LogContent = new String(source.LogContent);
        }
        if (source.LineNum != null) {
            this.LineNum = new Long(source.LineNum);
        }
        if (source.DstTopicId != null) {
            this.DstTopicId = new String(source.DstTopicId);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.DstTopicName != null) {
            this.DstTopicName = new String(source.DstTopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogContent", this.LogContent);
        this.setParamSimple(map, prefix + "LineNum", this.LineNum);
        this.setParamSimple(map, prefix + "DstTopicId", this.DstTopicId);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "DstTopicName", this.DstTopicName);

    }
}

