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

public class CommonMixOutputParams extends AbstractModel{

    /**
    * 输出流名称。
    */
    @SerializedName("OutputStreamName")
    @Expose
    private String OutputStreamName;

    /**
    * 输出流类型，取值范围[0,1]。
不填默认为0。
当输出流为输入流 list 中的一条时，填写0。
当期望生成的混流结果成为一条新流时，该值填为1。
该值为1时，output_stream_id 不能出现在 input_stram_list 中，且直播后台中，不能存在相同 ID 的流。
    */
    @SerializedName("OutputStreamType")
    @Expose
    private Long OutputStreamType;

    /**
    * 输出流比特率。取值范围[1，50000]。
不填的情况下，系统会自动判断。
    */
    @SerializedName("OutputStreamBitRate")
    @Expose
    private Long OutputStreamBitRate;

    /**
    * 输出流GOP大小。取值范围[1,10]。
不填的情况下，系统会自动判断。
    */
    @SerializedName("OutputStreamGop")
    @Expose
    private Long OutputStreamGop;

    /**
    * 输出流帧率大小。取值范围[1,60]。
不填的情况下，系统会自动判断。
    */
    @SerializedName("OutputStreamFrameRate")
    @Expose
    private Long OutputStreamFrameRate;

    /**
    * 输出流音频比特率。取值范围[1,500]
不填的情况下，系统会自动判断。
    */
    @SerializedName("OutputAudioBitRate")
    @Expose
    private Long OutputAudioBitRate;

    /**
    * 输出流音频采样率。取值范围[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。
不填的情况下，系统会自动判断。
    */
    @SerializedName("OutputAudioSampleRate")
    @Expose
    private Long OutputAudioSampleRate;

    /**
    * 输出流音频声道数。取值范围[1,2]。
不填的情况下，系统会自动判断。
    */
    @SerializedName("OutputAudioChannels")
    @Expose
    private Long OutputAudioChannels;

    /**
    * 输出流中的sei信息。如果无特殊需要，不填。
    */
    @SerializedName("MixSei")
    @Expose
    private String MixSei;

    /**
     * Get 输出流名称。 
     * @return OutputStreamName 输出流名称。
     */
    public String getOutputStreamName() {
        return this.OutputStreamName;
    }

    /**
     * Set 输出流名称。
     * @param OutputStreamName 输出流名称。
     */
    public void setOutputStreamName(String OutputStreamName) {
        this.OutputStreamName = OutputStreamName;
    }

    /**
     * Get 输出流类型，取值范围[0,1]。
不填默认为0。
当输出流为输入流 list 中的一条时，填写0。
当期望生成的混流结果成为一条新流时，该值填为1。
该值为1时，output_stream_id 不能出现在 input_stram_list 中，且直播后台中，不能存在相同 ID 的流。 
     * @return OutputStreamType 输出流类型，取值范围[0,1]。
不填默认为0。
当输出流为输入流 list 中的一条时，填写0。
当期望生成的混流结果成为一条新流时，该值填为1。
该值为1时，output_stream_id 不能出现在 input_stram_list 中，且直播后台中，不能存在相同 ID 的流。
     */
    public Long getOutputStreamType() {
        return this.OutputStreamType;
    }

    /**
     * Set 输出流类型，取值范围[0,1]。
不填默认为0。
当输出流为输入流 list 中的一条时，填写0。
当期望生成的混流结果成为一条新流时，该值填为1。
该值为1时，output_stream_id 不能出现在 input_stram_list 中，且直播后台中，不能存在相同 ID 的流。
     * @param OutputStreamType 输出流类型，取值范围[0,1]。
不填默认为0。
当输出流为输入流 list 中的一条时，填写0。
当期望生成的混流结果成为一条新流时，该值填为1。
该值为1时，output_stream_id 不能出现在 input_stram_list 中，且直播后台中，不能存在相同 ID 的流。
     */
    public void setOutputStreamType(Long OutputStreamType) {
        this.OutputStreamType = OutputStreamType;
    }

    /**
     * Get 输出流比特率。取值范围[1，50000]。
不填的情况下，系统会自动判断。 
     * @return OutputStreamBitRate 输出流比特率。取值范围[1，50000]。
不填的情况下，系统会自动判断。
     */
    public Long getOutputStreamBitRate() {
        return this.OutputStreamBitRate;
    }

    /**
     * Set 输出流比特率。取值范围[1，50000]。
不填的情况下，系统会自动判断。
     * @param OutputStreamBitRate 输出流比特率。取值范围[1，50000]。
不填的情况下，系统会自动判断。
     */
    public void setOutputStreamBitRate(Long OutputStreamBitRate) {
        this.OutputStreamBitRate = OutputStreamBitRate;
    }

    /**
     * Get 输出流GOP大小。取值范围[1,10]。
不填的情况下，系统会自动判断。 
     * @return OutputStreamGop 输出流GOP大小。取值范围[1,10]。
不填的情况下，系统会自动判断。
     */
    public Long getOutputStreamGop() {
        return this.OutputStreamGop;
    }

    /**
     * Set 输出流GOP大小。取值范围[1,10]。
不填的情况下，系统会自动判断。
     * @param OutputStreamGop 输出流GOP大小。取值范围[1,10]。
不填的情况下，系统会自动判断。
     */
    public void setOutputStreamGop(Long OutputStreamGop) {
        this.OutputStreamGop = OutputStreamGop;
    }

    /**
     * Get 输出流帧率大小。取值范围[1,60]。
不填的情况下，系统会自动判断。 
     * @return OutputStreamFrameRate 输出流帧率大小。取值范围[1,60]。
不填的情况下，系统会自动判断。
     */
    public Long getOutputStreamFrameRate() {
        return this.OutputStreamFrameRate;
    }

    /**
     * Set 输出流帧率大小。取值范围[1,60]。
不填的情况下，系统会自动判断。
     * @param OutputStreamFrameRate 输出流帧率大小。取值范围[1,60]。
不填的情况下，系统会自动判断。
     */
    public void setOutputStreamFrameRate(Long OutputStreamFrameRate) {
        this.OutputStreamFrameRate = OutputStreamFrameRate;
    }

    /**
     * Get 输出流音频比特率。取值范围[1,500]
不填的情况下，系统会自动判断。 
     * @return OutputAudioBitRate 输出流音频比特率。取值范围[1,500]
不填的情况下，系统会自动判断。
     */
    public Long getOutputAudioBitRate() {
        return this.OutputAudioBitRate;
    }

    /**
     * Set 输出流音频比特率。取值范围[1,500]
不填的情况下，系统会自动判断。
     * @param OutputAudioBitRate 输出流音频比特率。取值范围[1,500]
不填的情况下，系统会自动判断。
     */
    public void setOutputAudioBitRate(Long OutputAudioBitRate) {
        this.OutputAudioBitRate = OutputAudioBitRate;
    }

    /**
     * Get 输出流音频采样率。取值范围[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。
不填的情况下，系统会自动判断。 
     * @return OutputAudioSampleRate 输出流音频采样率。取值范围[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。
不填的情况下，系统会自动判断。
     */
    public Long getOutputAudioSampleRate() {
        return this.OutputAudioSampleRate;
    }

    /**
     * Set 输出流音频采样率。取值范围[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。
不填的情况下，系统会自动判断。
     * @param OutputAudioSampleRate 输出流音频采样率。取值范围[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。
不填的情况下，系统会自动判断。
     */
    public void setOutputAudioSampleRate(Long OutputAudioSampleRate) {
        this.OutputAudioSampleRate = OutputAudioSampleRate;
    }

    /**
     * Get 输出流音频声道数。取值范围[1,2]。
不填的情况下，系统会自动判断。 
     * @return OutputAudioChannels 输出流音频声道数。取值范围[1,2]。
不填的情况下，系统会自动判断。
     */
    public Long getOutputAudioChannels() {
        return this.OutputAudioChannels;
    }

    /**
     * Set 输出流音频声道数。取值范围[1,2]。
不填的情况下，系统会自动判断。
     * @param OutputAudioChannels 输出流音频声道数。取值范围[1,2]。
不填的情况下，系统会自动判断。
     */
    public void setOutputAudioChannels(Long OutputAudioChannels) {
        this.OutputAudioChannels = OutputAudioChannels;
    }

    /**
     * Get 输出流中的sei信息。如果无特殊需要，不填。 
     * @return MixSei 输出流中的sei信息。如果无特殊需要，不填。
     */
    public String getMixSei() {
        return this.MixSei;
    }

    /**
     * Set 输出流中的sei信息。如果无特殊需要，不填。
     * @param MixSei 输出流中的sei信息。如果无特殊需要，不填。
     */
    public void setMixSei(String MixSei) {
        this.MixSei = MixSei;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputStreamName", this.OutputStreamName);
        this.setParamSimple(map, prefix + "OutputStreamType", this.OutputStreamType);
        this.setParamSimple(map, prefix + "OutputStreamBitRate", this.OutputStreamBitRate);
        this.setParamSimple(map, prefix + "OutputStreamGop", this.OutputStreamGop);
        this.setParamSimple(map, prefix + "OutputStreamFrameRate", this.OutputStreamFrameRate);
        this.setParamSimple(map, prefix + "OutputAudioBitRate", this.OutputAudioBitRate);
        this.setParamSimple(map, prefix + "OutputAudioSampleRate", this.OutputAudioSampleRate);
        this.setParamSimple(map, prefix + "OutputAudioChannels", this.OutputAudioChannels);
        this.setParamSimple(map, prefix + "MixSei", this.MixSei);

    }
}

