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

public class CreateLiveStreamMonitorRequest extends AbstractModel{

    /**
    * 监播任务的输出信息。
    */
    @SerializedName("OutputInfo")
    @Expose
    private LiveStreamMonitorOutputInfo OutputInfo;

    /**
    * 待监播的输入流信息列表。
    */
    @SerializedName("InputList")
    @Expose
    private LiveStreamMonitorInputInfo [] InputList;

    /**
    * 监播任务名称。字段长度小于128字节（一个汉字两个字节）。
    */
    @SerializedName("MonitorName")
    @Expose
    private String MonitorName;

    /**
    * 监播事件通知策略。
不填默认为没有任何通知。
    */
    @SerializedName("NotifyPolicy")
    @Expose
    private LiveStreamMonitorNotifyPolicy NotifyPolicy;

    /**
    * 智能语音识别语种设置：
0 关闭 1 中文 2 英文 3 日文 4 韩文。
    */
    @SerializedName("AsrLanguage")
    @Expose
    private Long AsrLanguage;

    /**
    * 智能文字识别语种设置：
0 关闭 1 中、英文。
    */
    @SerializedName("OcrLanguage")
    @Expose
    private Long OcrLanguage;

    /**
    * 智能语音识别的输入列表，若开启语音识别则必填。
（第1条输入流index为1）
    */
    @SerializedName("AiAsrInputIndexList")
    @Expose
    private Long [] AiAsrInputIndexList;

    /**
    * 智能文字识别的输入列表，若开启文字识别则必填。
（第1条输入流index为1）
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
     * Get 监播任务的输出信息。 
     * @return OutputInfo 监播任务的输出信息。
     */
    public LiveStreamMonitorOutputInfo getOutputInfo() {
        return this.OutputInfo;
    }

    /**
     * Set 监播任务的输出信息。
     * @param OutputInfo 监播任务的输出信息。
     */
    public void setOutputInfo(LiveStreamMonitorOutputInfo OutputInfo) {
        this.OutputInfo = OutputInfo;
    }

    /**
     * Get 待监播的输入流信息列表。 
     * @return InputList 待监播的输入流信息列表。
     */
    public LiveStreamMonitorInputInfo [] getInputList() {
        return this.InputList;
    }

    /**
     * Set 待监播的输入流信息列表。
     * @param InputList 待监播的输入流信息列表。
     */
    public void setInputList(LiveStreamMonitorInputInfo [] InputList) {
        this.InputList = InputList;
    }

    /**
     * Get 监播任务名称。字段长度小于128字节（一个汉字两个字节）。 
     * @return MonitorName 监播任务名称。字段长度小于128字节（一个汉字两个字节）。
     */
    public String getMonitorName() {
        return this.MonitorName;
    }

    /**
     * Set 监播任务名称。字段长度小于128字节（一个汉字两个字节）。
     * @param MonitorName 监播任务名称。字段长度小于128字节（一个汉字两个字节）。
     */
    public void setMonitorName(String MonitorName) {
        this.MonitorName = MonitorName;
    }

    /**
     * Get 监播事件通知策略。
不填默认为没有任何通知。 
     * @return NotifyPolicy 监播事件通知策略。
不填默认为没有任何通知。
     */
    public LiveStreamMonitorNotifyPolicy getNotifyPolicy() {
        return this.NotifyPolicy;
    }

    /**
     * Set 监播事件通知策略。
不填默认为没有任何通知。
     * @param NotifyPolicy 监播事件通知策略。
不填默认为没有任何通知。
     */
    public void setNotifyPolicy(LiveStreamMonitorNotifyPolicy NotifyPolicy) {
        this.NotifyPolicy = NotifyPolicy;
    }

    /**
     * Get 智能语音识别语种设置：
0 关闭 1 中文 2 英文 3 日文 4 韩文。 
     * @return AsrLanguage 智能语音识别语种设置：
0 关闭 1 中文 2 英文 3 日文 4 韩文。
     */
    public Long getAsrLanguage() {
        return this.AsrLanguage;
    }

    /**
     * Set 智能语音识别语种设置：
0 关闭 1 中文 2 英文 3 日文 4 韩文。
     * @param AsrLanguage 智能语音识别语种设置：
0 关闭 1 中文 2 英文 3 日文 4 韩文。
     */
    public void setAsrLanguage(Long AsrLanguage) {
        this.AsrLanguage = AsrLanguage;
    }

    /**
     * Get 智能文字识别语种设置：
0 关闭 1 中、英文。 
     * @return OcrLanguage 智能文字识别语种设置：
0 关闭 1 中、英文。
     */
    public Long getOcrLanguage() {
        return this.OcrLanguage;
    }

    /**
     * Set 智能文字识别语种设置：
0 关闭 1 中、英文。
     * @param OcrLanguage 智能文字识别语种设置：
0 关闭 1 中、英文。
     */
    public void setOcrLanguage(Long OcrLanguage) {
        this.OcrLanguage = OcrLanguage;
    }

    /**
     * Get 智能语音识别的输入列表，若开启语音识别则必填。
（第1条输入流index为1） 
     * @return AiAsrInputIndexList 智能语音识别的输入列表，若开启语音识别则必填。
（第1条输入流index为1）
     */
    public Long [] getAiAsrInputIndexList() {
        return this.AiAsrInputIndexList;
    }

    /**
     * Set 智能语音识别的输入列表，若开启语音识别则必填。
（第1条输入流index为1）
     * @param AiAsrInputIndexList 智能语音识别的输入列表，若开启语音识别则必填。
（第1条输入流index为1）
     */
    public void setAiAsrInputIndexList(Long [] AiAsrInputIndexList) {
        this.AiAsrInputIndexList = AiAsrInputIndexList;
    }

    /**
     * Get 智能文字识别的输入列表，若开启文字识别则必填。
（第1条输入流index为1） 
     * @return AiOcrInputIndexList 智能文字识别的输入列表，若开启文字识别则必填。
（第1条输入流index为1）
     */
    public Long [] getAiOcrInputIndexList() {
        return this.AiOcrInputIndexList;
    }

    /**
     * Set 智能文字识别的输入列表，若开启文字识别则必填。
（第1条输入流index为1）
     * @param AiOcrInputIndexList 智能文字识别的输入列表，若开启文字识别则必填。
（第1条输入流index为1）
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

    public CreateLiveStreamMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveStreamMonitorRequest(CreateLiveStreamMonitorRequest source) {
        if (source.OutputInfo != null) {
            this.OutputInfo = new LiveStreamMonitorOutputInfo(source.OutputInfo);
        }
        if (source.InputList != null) {
            this.InputList = new LiveStreamMonitorInputInfo[source.InputList.length];
            for (int i = 0; i < source.InputList.length; i++) {
                this.InputList[i] = new LiveStreamMonitorInputInfo(source.InputList[i]);
            }
        }
        if (source.MonitorName != null) {
            this.MonitorName = new String(source.MonitorName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OutputInfo.", this.OutputInfo);
        this.setParamArrayObj(map, prefix + "InputList.", this.InputList);
        this.setParamSimple(map, prefix + "MonitorName", this.MonitorName);
        this.setParamObj(map, prefix + "NotifyPolicy.", this.NotifyPolicy);
        this.setParamSimple(map, prefix + "AsrLanguage", this.AsrLanguage);
        this.setParamSimple(map, prefix + "OcrLanguage", this.OcrLanguage);
        this.setParamArraySimple(map, prefix + "AiAsrInputIndexList.", this.AiAsrInputIndexList);
        this.setParamArraySimple(map, prefix + "AiOcrInputIndexList.", this.AiOcrInputIndexList);
        this.setParamSimple(map, prefix + "CheckStreamBroken", this.CheckStreamBroken);
        this.setParamSimple(map, prefix + "CheckStreamLowFrameRate", this.CheckStreamLowFrameRate);
        this.setParamSimple(map, prefix + "AllowMonitorReport", this.AllowMonitorReport);
        this.setParamSimple(map, prefix + "AiFormatDiagnose", this.AiFormatDiagnose);

    }
}

