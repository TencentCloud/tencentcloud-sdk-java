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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamMonitorInfo extends AbstractModel{

    /**
    * 监播任务ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorId")
    @Expose
    private String MonitorId;

    /**
    * 监播任务名称。128字节以内。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorName")
    @Expose
    private String MonitorName;

    /**
    * 监播任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputInfo")
    @Expose
    private LiveStreamMonitorOutputInfo OutputInfo;

    /**
    * 待监播的输入流信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputList")
    @Expose
    private LiveStreamMonitorInputInfo [] InputList;

    /**
    * 监播任务状态。
0： 代表空闲
1： 代表监播中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 上一次的启动时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 上一次的停止时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopTime")
    @Expose
    private Long StopTime;

    /**
    * 监播任务创建时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 监播任务更新时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 监播事件通知策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyPolicy")
    @Expose
    private LiveStreamMonitorNotifyPolicy NotifyPolicy;

    /**
    * 输出音频的输入Index列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudibleInputIndexList")
    @Expose
    private Long [] AudibleInputIndexList;

    /**
    * 开启智能语音识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiAsrInputIndexList")
    @Expose
    private Long [] AiAsrInputIndexList;

    /**
    * 是否开启断流检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckStreamBroken")
    @Expose
    private Long CheckStreamBroken;

    /**
    * 是否开启低帧率检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckStreamLowFrameRate")
    @Expose
    private Long CheckStreamLowFrameRate;

    /**
    * 智能语音识别语种：
0 关闭 1 中文 2 英文 3日文 4 韩文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrLanguage")
    @Expose
    private Long AsrLanguage;

    /**
    * 智能文字识别语种：
0 关闭 1 中、英文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrLanguage")
    @Expose
    private Long OcrLanguage;

    /**
    * 开启智能文字识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiOcrInputIndexList")
    @Expose
    private Long [] AiOcrInputIndexList;

    /**
    * 是否存储监播事件到监播报告，以及是否允许查询监播报告
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowMonitorReport")
    @Expose
    private Long AllowMonitorReport;

    /**
    * 是否开启格式诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiFormatDiagnose")
    @Expose
    private Long AiFormatDiagnose;

    /**
     * Get 监播任务ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorId 监播任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监播任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorId 监播任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorId(String MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get 监播任务名称。128字节以内。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorName 监播任务名称。128字节以内。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorName() {
        return this.MonitorName;
    }

    /**
     * Set 监播任务名称。128字节以内。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorName 监播任务名称。128字节以内。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorName(String MonitorName) {
        this.MonitorName = MonitorName;
    }

    /**
     * Get 监播任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputInfo 监播任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamMonitorOutputInfo getOutputInfo() {
        return this.OutputInfo;
    }

    /**
     * Set 监播任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputInfo 监播任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputInfo(LiveStreamMonitorOutputInfo OutputInfo) {
        this.OutputInfo = OutputInfo;
    }

    /**
     * Get 待监播的输入流信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputList 待监播的输入流信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamMonitorInputInfo [] getInputList() {
        return this.InputList;
    }

    /**
     * Set 待监播的输入流信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputList 待监播的输入流信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputList(LiveStreamMonitorInputInfo [] InputList) {
        this.InputList = InputList;
    }

    /**
     * Get 监播任务状态。
0： 代表空闲
1： 代表监播中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 监播任务状态。
0： 代表空闲
1： 代表监播中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 监播任务状态。
0： 代表空闲
1： 代表监播中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 监播任务状态。
0： 代表空闲
1： 代表监播中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 上一次的启动时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 上一次的启动时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 上一次的启动时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 上一次的启动时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 上一次的停止时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopTime 上一次的停止时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStopTime() {
        return this.StopTime;
    }

    /**
     * Set 上一次的停止时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopTime 上一次的停止时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopTime(Long StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get 监播任务创建时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 监播任务创建时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 监播任务创建时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 监播任务创建时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 监播任务更新时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 监播任务更新时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 监播任务更新时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 监播任务更新时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 监播事件通知策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyPolicy 监播事件通知策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamMonitorNotifyPolicy getNotifyPolicy() {
        return this.NotifyPolicy;
    }

    /**
     * Set 监播事件通知策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyPolicy 监播事件通知策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyPolicy(LiveStreamMonitorNotifyPolicy NotifyPolicy) {
        this.NotifyPolicy = NotifyPolicy;
    }

    /**
     * Get 输出音频的输入Index列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudibleInputIndexList 输出音频的输入Index列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAudibleInputIndexList() {
        return this.AudibleInputIndexList;
    }

    /**
     * Set 输出音频的输入Index列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudibleInputIndexList 输出音频的输入Index列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudibleInputIndexList(Long [] AudibleInputIndexList) {
        this.AudibleInputIndexList = AudibleInputIndexList;
    }

    /**
     * Get 开启智能语音识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiAsrInputIndexList 开启智能语音识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAiAsrInputIndexList() {
        return this.AiAsrInputIndexList;
    }

    /**
     * Set 开启智能语音识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiAsrInputIndexList 开启智能语音识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiAsrInputIndexList(Long [] AiAsrInputIndexList) {
        this.AiAsrInputIndexList = AiAsrInputIndexList;
    }

    /**
     * Get 是否开启断流检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckStreamBroken 是否开启断流检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckStreamBroken() {
        return this.CheckStreamBroken;
    }

    /**
     * Set 是否开启断流检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckStreamBroken 是否开启断流检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckStreamBroken(Long CheckStreamBroken) {
        this.CheckStreamBroken = CheckStreamBroken;
    }

    /**
     * Get 是否开启低帧率检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckStreamLowFrameRate 是否开启低帧率检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckStreamLowFrameRate() {
        return this.CheckStreamLowFrameRate;
    }

    /**
     * Set 是否开启低帧率检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckStreamLowFrameRate 是否开启低帧率检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckStreamLowFrameRate(Long CheckStreamLowFrameRate) {
        this.CheckStreamLowFrameRate = CheckStreamLowFrameRate;
    }

    /**
     * Get 智能语音识别语种：
0 关闭 1 中文 2 英文 3日文 4 韩文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrLanguage 智能语音识别语种：
0 关闭 1 中文 2 英文 3日文 4 韩文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAsrLanguage() {
        return this.AsrLanguage;
    }

    /**
     * Set 智能语音识别语种：
0 关闭 1 中文 2 英文 3日文 4 韩文
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrLanguage 智能语音识别语种：
0 关闭 1 中文 2 英文 3日文 4 韩文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrLanguage(Long AsrLanguage) {
        this.AsrLanguage = AsrLanguage;
    }

    /**
     * Get 智能文字识别语种：
0 关闭 1 中、英文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrLanguage 智能文字识别语种：
0 关闭 1 中、英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOcrLanguage() {
        return this.OcrLanguage;
    }

    /**
     * Set 智能文字识别语种：
0 关闭 1 中、英文
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrLanguage 智能文字识别语种：
0 关闭 1 中、英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrLanguage(Long OcrLanguage) {
        this.OcrLanguage = OcrLanguage;
    }

    /**
     * Get 开启智能文字识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiOcrInputIndexList 开启智能文字识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAiOcrInputIndexList() {
        return this.AiOcrInputIndexList;
    }

    /**
     * Set 开启智能文字识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiOcrInputIndexList 开启智能文字识别的输入Index列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiOcrInputIndexList(Long [] AiOcrInputIndexList) {
        this.AiOcrInputIndexList = AiOcrInputIndexList;
    }

    /**
     * Get 是否存储监播事件到监播报告，以及是否允许查询监播报告
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowMonitorReport 是否存储监播事件到监播报告，以及是否允许查询监播报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAllowMonitorReport() {
        return this.AllowMonitorReport;
    }

    /**
     * Set 是否存储监播事件到监播报告，以及是否允许查询监播报告
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowMonitorReport 是否存储监播事件到监播报告，以及是否允许查询监播报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowMonitorReport(Long AllowMonitorReport) {
        this.AllowMonitorReport = AllowMonitorReport;
    }

    /**
     * Get 是否开启格式诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiFormatDiagnose 是否开启格式诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAiFormatDiagnose() {
        return this.AiFormatDiagnose;
    }

    /**
     * Set 是否开启格式诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiFormatDiagnose 是否开启格式诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiFormatDiagnose(Long AiFormatDiagnose) {
        this.AiFormatDiagnose = AiFormatDiagnose;
    }

    public LiveStreamMonitorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamMonitorInfo(LiveStreamMonitorInfo source) {
        if (source.MonitorId != null) {
            this.MonitorId = new String(source.MonitorId);
        }
        if (source.MonitorName != null) {
            this.MonitorName = new String(source.MonitorName);
        }
        if (source.OutputInfo != null) {
            this.OutputInfo = new LiveStreamMonitorOutputInfo(source.OutputInfo);
        }
        if (source.InputList != null) {
            this.InputList = new LiveStreamMonitorInputInfo[source.InputList.length];
            for (int i = 0; i < source.InputList.length; i++) {
                this.InputList[i] = new LiveStreamMonitorInputInfo(source.InputList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.StopTime != null) {
            this.StopTime = new Long(source.StopTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.NotifyPolicy != null) {
            this.NotifyPolicy = new LiveStreamMonitorNotifyPolicy(source.NotifyPolicy);
        }
        if (source.AudibleInputIndexList != null) {
            this.AudibleInputIndexList = new Long[source.AudibleInputIndexList.length];
            for (int i = 0; i < source.AudibleInputIndexList.length; i++) {
                this.AudibleInputIndexList[i] = new Long(source.AudibleInputIndexList[i]);
            }
        }
        if (source.AiAsrInputIndexList != null) {
            this.AiAsrInputIndexList = new Long[source.AiAsrInputIndexList.length];
            for (int i = 0; i < source.AiAsrInputIndexList.length; i++) {
                this.AiAsrInputIndexList[i] = new Long(source.AiAsrInputIndexList[i]);
            }
        }
        if (source.CheckStreamBroken != null) {
            this.CheckStreamBroken = new Long(source.CheckStreamBroken);
        }
        if (source.CheckStreamLowFrameRate != null) {
            this.CheckStreamLowFrameRate = new Long(source.CheckStreamLowFrameRate);
        }
        if (source.AsrLanguage != null) {
            this.AsrLanguage = new Long(source.AsrLanguage);
        }
        if (source.OcrLanguage != null) {
            this.OcrLanguage = new Long(source.OcrLanguage);
        }
        if (source.AiOcrInputIndexList != null) {
            this.AiOcrInputIndexList = new Long[source.AiOcrInputIndexList.length];
            for (int i = 0; i < source.AiOcrInputIndexList.length; i++) {
                this.AiOcrInputIndexList[i] = new Long(source.AiOcrInputIndexList[i]);
            }
        }
        if (source.AllowMonitorReport != null) {
            this.AllowMonitorReport = new Long(source.AllowMonitorReport);
        }
        if (source.AiFormatDiagnose != null) {
            this.AiFormatDiagnose = new Long(source.AiFormatDiagnose);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamSimple(map, prefix + "MonitorName", this.MonitorName);
        this.setParamObj(map, prefix + "OutputInfo.", this.OutputInfo);
        this.setParamArrayObj(map, prefix + "InputList.", this.InputList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "NotifyPolicy.", this.NotifyPolicy);
        this.setParamArraySimple(map, prefix + "AudibleInputIndexList.", this.AudibleInputIndexList);
        this.setParamArraySimple(map, prefix + "AiAsrInputIndexList.", this.AiAsrInputIndexList);
        this.setParamSimple(map, prefix + "CheckStreamBroken", this.CheckStreamBroken);
        this.setParamSimple(map, prefix + "CheckStreamLowFrameRate", this.CheckStreamLowFrameRate);
        this.setParamSimple(map, prefix + "AsrLanguage", this.AsrLanguage);
        this.setParamSimple(map, prefix + "OcrLanguage", this.OcrLanguage);
        this.setParamArraySimple(map, prefix + "AiOcrInputIndexList.", this.AiOcrInputIndexList);
        this.setParamSimple(map, prefix + "AllowMonitorReport", this.AllowMonitorReport);
        this.setParamSimple(map, prefix + "AiFormatDiagnose", this.AiFormatDiagnose);

    }
}

