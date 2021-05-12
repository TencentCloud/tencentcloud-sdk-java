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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordInfo extends AbstractModel{

    /**
    * 任务Id
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 任务名称
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
    * 任务日期
    */
    @SerializedName("BizDate")
    @Expose
    private String BizDate;

    /**
    * 被叫号码
    */
    @SerializedName("CalledPhone")
    @Expose
    private String CalledPhone;

    /**
    * 开始通话时间
    */
    @SerializedName("CallStartTime")
    @Expose
    private String CallStartTime;

    /**
    * 通话时长
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 录音文件地址
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * 对话日志。JSON格式
    */
    @SerializedName("DialogueLog")
    @Expose
    private String DialogueLog;

    /**
    * 录音文件名
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
     * Get 任务Id 
     * @return BotId 任务Id
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 任务Id
     * @param BotId 任务Id
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 任务名称 
     * @return BotName 任务名称
     */
    public String getBotName() {
        return this.BotName;
    }

    /**
     * Set 任务名称
     * @param BotName 任务名称
     */
    public void setBotName(String BotName) {
        this.BotName = BotName;
    }

    /**
     * Get 任务日期 
     * @return BizDate 任务日期
     */
    public String getBizDate() {
        return this.BizDate;
    }

    /**
     * Set 任务日期
     * @param BizDate 任务日期
     */
    public void setBizDate(String BizDate) {
        this.BizDate = BizDate;
    }

    /**
     * Get 被叫号码 
     * @return CalledPhone 被叫号码
     */
    public String getCalledPhone() {
        return this.CalledPhone;
    }

    /**
     * Set 被叫号码
     * @param CalledPhone 被叫号码
     */
    public void setCalledPhone(String CalledPhone) {
        this.CalledPhone = CalledPhone;
    }

    /**
     * Get 开始通话时间 
     * @return CallStartTime 开始通话时间
     */
    public String getCallStartTime() {
        return this.CallStartTime;
    }

    /**
     * Set 开始通话时间
     * @param CallStartTime 开始通话时间
     */
    public void setCallStartTime(String CallStartTime) {
        this.CallStartTime = CallStartTime;
    }

    /**
     * Get 通话时长 
     * @return Duration 通话时长
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 通话时长
     * @param Duration 通话时长
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 录音文件地址 
     * @return CosUrl 录音文件地址
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set 录音文件地址
     * @param CosUrl 录音文件地址
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get 对话日志。JSON格式 
     * @return DialogueLog 对话日志。JSON格式
     */
    public String getDialogueLog() {
        return this.DialogueLog;
    }

    /**
     * Set 对话日志。JSON格式
     * @param DialogueLog 对话日志。JSON格式
     */
    public void setDialogueLog(String DialogueLog) {
        this.DialogueLog = DialogueLog;
    }

    /**
     * Get 录音文件名 
     * @return CosFileName 录音文件名
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set 录音文件名
     * @param CosFileName 录音文件名
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.BotName != null) {
            this.BotName = new String(source.BotName);
        }
        if (source.BizDate != null) {
            this.BizDate = new String(source.BizDate);
        }
        if (source.CalledPhone != null) {
            this.CalledPhone = new String(source.CalledPhone);
        }
        if (source.CallStartTime != null) {
            this.CallStartTime = new String(source.CallStartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.DialogueLog != null) {
            this.DialogueLog = new String(source.DialogueLog);
        }
        if (source.CosFileName != null) {
            this.CosFileName = new String(source.CosFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "BotName", this.BotName);
        this.setParamSimple(map, prefix + "BizDate", this.BizDate);
        this.setParamSimple(map, prefix + "CalledPhone", this.CalledPhone);
        this.setParamSimple(map, prefix + "CallStartTime", this.CallStartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "DialogueLog", this.DialogueLog);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

