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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveStreamMonitorRequest extends AbstractModel {

    /**
    * 监播任务ID。
    */
    @SerializedName("MonitorId")
    @Expose
    private String MonitorId;

    /**
    * 监播任务的名称。长度128字节以内（一个汉字两个字节）。
    */
    @SerializedName("MonitorName")
    @Expose
    private String MonitorName;

    /**
    * 监播任务输出信息。
    */
    @SerializedName("OutputInfo")
    @Expose
    private LiveStreamMonitorOutputInfo OutputInfo;

    /**
    * 待监播的输入流信息。
    */
    @SerializedName("InputList")
    @Expose
    private LiveStreamMonitorInputInfo [] InputList;

    /**
    * 监播事件通知策略。
    */
    @SerializedName("NotifyPolicy")
    @Expose
    private LiveStreamMonitorNotifyPolicy NotifyPolicy;

    /**
    * 智能语音识别语种：
0 关闭 1 中文 2 英文 3 日文 4 韩文。
    */
    @SerializedName("AsrLanguage")
    @Expose
    private Long AsrLanguage;

    /**
    * 智能文字识别语种：
0 关闭 1 中、英文。
    */
    @SerializedName("OcrLanguage")
    @Expose
    private Long OcrLanguage;

    /**
    * 语音识别输入流列表，1代表第一条输入流。
    */
    @SerializedName("AiAsrInputIndexList")
    @Expose
    private Long [] AiAsrInputIndexList;

    /**
    * 文字识别输入流列表，1代表第一条输入流。
    */
    @SerializedName("AiOcrInputIndexList")
    @Expose
    private Long [] AiOcrInputIndexList;

    /**
    * 是否开启断流检测。
    */
    @SerializedName("CheckStreamBroken")
    @Expose
    private Long CheckStreamBroken;

    /**
    * 是否开启低帧率检测。
    */
    @SerializedName("CheckStreamLowFrameRate")
    @Expose
    private Long CheckStreamLowFrameRate;

    /**
    * 是否存储监播事件到监播报告，以及是否允许查询监播报告。
    */
    @SerializedName("AllowMonitorReport")
    @Expose
    private Long AllowMonitorReport;

    /**
    * 是否开启格式诊断。
    */
    @SerializedName("AiFormatDiagnose")
    @Expose
    private Long AiFormatDiagnose;

    /**
    * 是否开启内容质检。
    */
    @SerializedName("AiQualityControl")
    @Expose
    private Long AiQualityControl;

    /**
     * Get 监播任务ID。 
     * @return MonitorId 监播任务ID。
     */
    public String getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监播任务ID。
     * @param MonitorId 监播任务ID。
     */
    public void setMonitorId(String MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get 监播任务的名称。长度128字节以内（一个汉字两个字节）。 
     * @return MonitorName 监播任务的名称。长度128字节以内（一个汉字两个字节）。
     */
    public String getMonitorName() {
        return this.MonitorName;
    }

    /**
     * Set 监播任务的名称。长度128字节以内（一个汉字两个字节）。
     * @param MonitorName 监播任务的名称。长度128字节以内（一个汉字两个字节）。
     */
    public void setMonitorName(String MonitorName) {
        this.MonitorName = MonitorName;
    }

    /**
     * Get 监播任务输出信息。 
     * @return OutputInfo 监播任务输出信息。
     */
    public LiveStreamMonitorOutputInfo getOutputInfo() {
        return this.OutputInfo;
    }

    /**
     * Set 监播任务输出信息。
     * @param OutputInfo 监播任务输出信息。
     */
    public void setOutputInfo(LiveStreamMonitorOutputInfo OutputInfo) {
        this.OutputInfo = OutputInfo;
    }

    /**
     * Get 待监播的输入流信息。 
     * @return InputList 待监播的输入流信息。
     */
    public LiveStreamMonitorInputInfo [] getInputList() {
        return this.InputList;
    }

    /**
     * Set 待监播的输入流信息。
     * @param InputList 待监播的输入流信息。
     */
    public void setInputList(LiveStreamMonitorInputInfo [] InputList) {
        this.InputList = InputList;
    }

    /**
     * Get 监播事件通知策略。 
     * @return NotifyPolicy 监播事件通知策略。
     */
    public LiveStreamMonitorNotifyPolicy getNotifyPolicy() {
        return this.NotifyPolicy;
    }

    /**
     * Set 监播事件通知策略。
     * @param NotifyPolicy 监播事件通知策略。
     */
    public void setNotifyPolicy(LiveStreamMonitorNotifyPolicy NotifyPolicy) {
        this.NotifyPolicy = NotifyPolicy;
    }

    /**
     * Get 智能语音识别语种：
0 关闭 1 中文 2 英文 3 日文 4 韩文。 
     * @return AsrLanguage 智能语音识别语种：
0 关闭 1 中文 2 英文 3 日文 4 韩文。
     */
    public Long getAsrLanguage() {
        return this.AsrLanguage;
    }

    /**
     * Set 智能语音识别语种：
0 关闭 1 中文 2 英文 3 日文 4 韩文。
     * @param AsrLanguage 智能语音识别语种：
0 关闭 1 中文 2 英文 3 日文 4 韩文。
     */
    public void setAsrLanguage(Long AsrLanguage) {
        this.AsrLanguage = AsrLanguage;
    }

    /**
     * Get 智能文字识别语种：
0 关闭 1 中、英文。 
     * @return OcrLanguage 智能文字识别语种：
0 关闭 1 中、英文。
     */
    public Long getOcrLanguage() {
        return this.OcrLanguage;
    }

    /**
     * Set 智能文字识别语种：
0 关闭 1 中、英文。
     * @param OcrLanguage 智能文字识别语种：
0 关闭 1 中、英文。
     */
    public void setOcrLanguage(Long OcrLanguage) {
        this.OcrLanguage = OcrLanguage;
    }

    /**
     * Get 语音识别输入流列表，1代表第一条输入流。 
     * @return AiAsrInputIndexList 语音识别输入流列表，1代表第一条输入流。
     */
    public Long [] getAiAsrInputIndexList() {
        return this.AiAsrInputIndexList;
    }

    /**
     * Set 语音识别输入流列表，1代表第一条输入流。
     * @param AiAsrInputIndexList 语音识别输入流列表，1代表第一条输入流。
     */
    public void setAiAsrInputIndexList(Long [] AiAsrInputIndexList) {
        this.AiAsrInputIndexList = AiAsrInputIndexList;
    }

    /**
     * Get 文字识别输入流列表，1代表第一条输入流。 
     * @return AiOcrInputIndexList 文字识别输入流列表，1代表第一条输入流。
     */
    public Long [] getAiOcrInputIndexList() {
        return this.AiOcrInputIndexList;
    }

    /**
     * Set 文字识别输入流列表，1代表第一条输入流。
     * @param AiOcrInputIndexList 文字识别输入流列表，1代表第一条输入流。
     */
    public void setAiOcrInputIndexList(Long [] AiOcrInputIndexList) {
        this.AiOcrInputIndexList = AiOcrInputIndexList;
    }

    /**
     * Get 是否开启断流检测。 
     * @return CheckStreamBroken 是否开启断流检测。
     */
    public Long getCheckStreamBroken() {
        return this.CheckStreamBroken;
    }

    /**
     * Set 是否开启断流检测。
     * @param CheckStreamBroken 是否开启断流检测。
     */
    public void setCheckStreamBroken(Long CheckStreamBroken) {
        this.CheckStreamBroken = CheckStreamBroken;
    }

    /**
     * Get 是否开启低帧率检测。 
     * @return CheckStreamLowFrameRate 是否开启低帧率检测。
     */
    public Long getCheckStreamLowFrameRate() {
        return this.CheckStreamLowFrameRate;
    }

    /**
     * Set 是否开启低帧率检测。
     * @param CheckStreamLowFrameRate 是否开启低帧率检测。
     */
    public void setCheckStreamLowFrameRate(Long CheckStreamLowFrameRate) {
        this.CheckStreamLowFrameRate = CheckStreamLowFrameRate;
    }

    /**
     * Get 是否存储监播事件到监播报告，以及是否允许查询监播报告。 
     * @return AllowMonitorReport 是否存储监播事件到监播报告，以及是否允许查询监播报告。
     */
    public Long getAllowMonitorReport() {
        return this.AllowMonitorReport;
    }

    /**
     * Set 是否存储监播事件到监播报告，以及是否允许查询监播报告。
     * @param AllowMonitorReport 是否存储监播事件到监播报告，以及是否允许查询监播报告。
     */
    public void setAllowMonitorReport(Long AllowMonitorReport) {
        this.AllowMonitorReport = AllowMonitorReport;
    }

    /**
     * Get 是否开启格式诊断。 
     * @return AiFormatDiagnose 是否开启格式诊断。
     */
    public Long getAiFormatDiagnose() {
        return this.AiFormatDiagnose;
    }

    /**
     * Set 是否开启格式诊断。
     * @param AiFormatDiagnose 是否开启格式诊断。
     */
    public void setAiFormatDiagnose(Long AiFormatDiagnose) {
        this.AiFormatDiagnose = AiFormatDiagnose;
    }

    /**
     * Get 是否开启内容质检。 
     * @return AiQualityControl 是否开启内容质检。
     */
    public Long getAiQualityControl() {
        return this.AiQualityControl;
    }

    /**
     * Set 是否开启内容质检。
     * @param AiQualityControl 是否开启内容质检。
     */
    public void setAiQualityControl(Long AiQualityControl) {
        this.AiQualityControl = AiQualityControl;
    }

    public ModifyLiveStreamMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveStreamMonitorRequest(ModifyLiveStreamMonitorRequest source) {
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
        if (source.NotifyPolicy != null) {
            this.NotifyPolicy = new LiveStreamMonitorNotifyPolicy(source.NotifyPolicy);
        }
        if (source.AsrLanguage != null) {
            this.AsrLanguage = new Long(source.AsrLanguage);
        }
        if (source.OcrLanguage != null) {
            this.OcrLanguage = new Long(source.OcrLanguage);
        }
        if (source.AiAsrInputIndexList != null) {
            this.AiAsrInputIndexList = new Long[source.AiAsrInputIndexList.length];
            for (int i = 0; i < source.AiAsrInputIndexList.length; i++) {
                this.AiAsrInputIndexList[i] = new Long(source.AiAsrInputIndexList[i]);
            }
        }
        if (source.AiOcrInputIndexList != null) {
            this.AiOcrInputIndexList = new Long[source.AiOcrInputIndexList.length];
            for (int i = 0; i < source.AiOcrInputIndexList.length; i++) {
                this.AiOcrInputIndexList[i] = new Long(source.AiOcrInputIndexList[i]);
            }
        }
        if (source.CheckStreamBroken != null) {
            this.CheckStreamBroken = new Long(source.CheckStreamBroken);
        }
        if (source.CheckStreamLowFrameRate != null) {
            this.CheckStreamLowFrameRate = new Long(source.CheckStreamLowFrameRate);
        }
        if (source.AllowMonitorReport != null) {
            this.AllowMonitorReport = new Long(source.AllowMonitorReport);
        }
        if (source.AiFormatDiagnose != null) {
            this.AiFormatDiagnose = new Long(source.AiFormatDiagnose);
        }
        if (source.AiQualityControl != null) {
            this.AiQualityControl = new Long(source.AiQualityControl);
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
        this.setParamObj(map, prefix + "NotifyPolicy.", this.NotifyPolicy);
        this.setParamSimple(map, prefix + "AsrLanguage", this.AsrLanguage);
        this.setParamSimple(map, prefix + "OcrLanguage", this.OcrLanguage);
        this.setParamArraySimple(map, prefix + "AiAsrInputIndexList.", this.AiAsrInputIndexList);
        this.setParamArraySimple(map, prefix + "AiOcrInputIndexList.", this.AiOcrInputIndexList);
        this.setParamSimple(map, prefix + "CheckStreamBroken", this.CheckStreamBroken);
        this.setParamSimple(map, prefix + "CheckStreamLowFrameRate", this.CheckStreamLowFrameRate);
        this.setParamSimple(map, prefix + "AllowMonitorReport", this.AllowMonitorReport);
        this.setParamSimple(map, prefix + "AiFormatDiagnose", this.AiFormatDiagnose);
        this.setParamSimple(map, prefix + "AiQualityControl", this.AiQualityControl);

    }
}

