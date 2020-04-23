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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeechTranslateResponse extends AbstractModel{

    /**
    * 请求的SessionUuid直接返回
    */
    @SerializedName("SessionUuid")
    @Expose
    private String SessionUuid;

    /**
    * 语音识别状态 1-进行中 0-完成
    */
    @SerializedName("RecognizeStatus")
    @Expose
    private Long RecognizeStatus;

    /**
    * 识别出的原文
    */
    @SerializedName("SourceText")
    @Expose
    private String SourceText;

    /**
    * 翻译出的译文
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * 第几个语音分片
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
    * 原语言
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 当请求的Mode参数填写bvad是，启动VadSeq。此时Seq会被设置为后台vad（静音检测）后的新序号，而VadSeq代表客户端原始Seq值
    */
    @SerializedName("VadSeq")
    @Expose
    private Long VadSeq;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求的SessionUuid直接返回 
     * @return SessionUuid 请求的SessionUuid直接返回
     */
    public String getSessionUuid() {
        return this.SessionUuid;
    }

    /**
     * Set 请求的SessionUuid直接返回
     * @param SessionUuid 请求的SessionUuid直接返回
     */
    public void setSessionUuid(String SessionUuid) {
        this.SessionUuid = SessionUuid;
    }

    /**
     * Get 语音识别状态 1-进行中 0-完成 
     * @return RecognizeStatus 语音识别状态 1-进行中 0-完成
     */
    public Long getRecognizeStatus() {
        return this.RecognizeStatus;
    }

    /**
     * Set 语音识别状态 1-进行中 0-完成
     * @param RecognizeStatus 语音识别状态 1-进行中 0-完成
     */
    public void setRecognizeStatus(Long RecognizeStatus) {
        this.RecognizeStatus = RecognizeStatus;
    }

    /**
     * Get 识别出的原文 
     * @return SourceText 识别出的原文
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * Set 识别出的原文
     * @param SourceText 识别出的原文
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * Get 翻译出的译文 
     * @return TargetText 翻译出的译文
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set 翻译出的译文
     * @param TargetText 翻译出的译文
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get 第几个语音分片 
     * @return Seq 第几个语音分片
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * Set 第几个语音分片
     * @param Seq 第几个语音分片
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 原语言 
     * @return Source 原语言
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 原语言
     * @param Source 原语言
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标语言 
     * @return Target 目标语言
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言
     * @param Target 目标语言
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 当请求的Mode参数填写bvad是，启动VadSeq。此时Seq会被设置为后台vad（静音检测）后的新序号，而VadSeq代表客户端原始Seq值 
     * @return VadSeq 当请求的Mode参数填写bvad是，启动VadSeq。此时Seq会被设置为后台vad（静音检测）后的新序号，而VadSeq代表客户端原始Seq值
     */
    public Long getVadSeq() {
        return this.VadSeq;
    }

    /**
     * Set 当请求的Mode参数填写bvad是，启动VadSeq。此时Seq会被设置为后台vad（静音检测）后的新序号，而VadSeq代表客户端原始Seq值
     * @param VadSeq 当请求的Mode参数填写bvad是，启动VadSeq。此时Seq会被设置为后台vad（静音检测）后的新序号，而VadSeq代表客户端原始Seq值
     */
    public void setVadSeq(Long VadSeq) {
        this.VadSeq = VadSeq;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionUuid", this.SessionUuid);
        this.setParamSimple(map, prefix + "RecognizeStatus", this.RecognizeStatus);
        this.setParamSimple(map, prefix + "SourceText", this.SourceText);
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "VadSeq", this.VadSeq);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

