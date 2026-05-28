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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLLMReportInterpretationRequest extends AbstractModel {

    /**
    * <p>合作方ID</p>
    */
    @SerializedName("PartnerId")
    @Expose
    private String PartnerId;

    /**
    * <p>合作方密钥</p>
    */
    @SerializedName("PartnerSecret")
    @Expose
    private String PartnerSecret;

    /**
    * <p>接入医院id</p>
    */
    @SerializedName("HospitalId")
    @Expose
    private String HospitalId;

    /**
    * <p>对话ID，由接入方生成，相同对话ID会保持相同的上下文，接入方根据业务场景使用相同或新建对话ID（建议使用UUID值）</p><p>入参限制：长度限制10-50</p>
    */
    @SerializedName("DialogueId")
    @Expose
    private String DialogueId;

    /**
    * <p>本次问答用户输入的问题</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>报告文件信息</p>
    */
    @SerializedName("ReportFileInfos")
    @Expose
    private ReportFileInfoReq [] ReportFileInfos;

    /**
    * <p>返回类型：0:正常返回； 1:流式返回； 默认：0</p>
    */
    @SerializedName("ResultType")
    @Expose
    private Long ResultType;

    /**
    * <p>报告解读提示词</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>无报告问答提示词</p>
    */
    @SerializedName("QaPrompt")
    @Expose
    private String QaPrompt;

    /**
     * Get <p>合作方ID</p> 
     * @return PartnerId <p>合作方ID</p>
     */
    public String getPartnerId() {
        return this.PartnerId;
    }

    /**
     * Set <p>合作方ID</p>
     * @param PartnerId <p>合作方ID</p>
     */
    public void setPartnerId(String PartnerId) {
        this.PartnerId = PartnerId;
    }

    /**
     * Get <p>合作方密钥</p> 
     * @return PartnerSecret <p>合作方密钥</p>
     */
    public String getPartnerSecret() {
        return this.PartnerSecret;
    }

    /**
     * Set <p>合作方密钥</p>
     * @param PartnerSecret <p>合作方密钥</p>
     */
    public void setPartnerSecret(String PartnerSecret) {
        this.PartnerSecret = PartnerSecret;
    }

    /**
     * Get <p>接入医院id</p> 
     * @return HospitalId <p>接入医院id</p>
     */
    public String getHospitalId() {
        return this.HospitalId;
    }

    /**
     * Set <p>接入医院id</p>
     * @param HospitalId <p>接入医院id</p>
     */
    public void setHospitalId(String HospitalId) {
        this.HospitalId = HospitalId;
    }

    /**
     * Get <p>对话ID，由接入方生成，相同对话ID会保持相同的上下文，接入方根据业务场景使用相同或新建对话ID（建议使用UUID值）</p><p>入参限制：长度限制10-50</p> 
     * @return DialogueId <p>对话ID，由接入方生成，相同对话ID会保持相同的上下文，接入方根据业务场景使用相同或新建对话ID（建议使用UUID值）</p><p>入参限制：长度限制10-50</p>
     */
    public String getDialogueId() {
        return this.DialogueId;
    }

    /**
     * Set <p>对话ID，由接入方生成，相同对话ID会保持相同的上下文，接入方根据业务场景使用相同或新建对话ID（建议使用UUID值）</p><p>入参限制：长度限制10-50</p>
     * @param DialogueId <p>对话ID，由接入方生成，相同对话ID会保持相同的上下文，接入方根据业务场景使用相同或新建对话ID（建议使用UUID值）</p><p>入参限制：长度限制10-50</p>
     */
    public void setDialogueId(String DialogueId) {
        this.DialogueId = DialogueId;
    }

    /**
     * Get <p>本次问答用户输入的问题</p> 
     * @return Message <p>本次问答用户输入的问题</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>本次问答用户输入的问题</p>
     * @param Message <p>本次问答用户输入的问题</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>报告文件信息</p> 
     * @return ReportFileInfos <p>报告文件信息</p>
     */
    public ReportFileInfoReq [] getReportFileInfos() {
        return this.ReportFileInfos;
    }

    /**
     * Set <p>报告文件信息</p>
     * @param ReportFileInfos <p>报告文件信息</p>
     */
    public void setReportFileInfos(ReportFileInfoReq [] ReportFileInfos) {
        this.ReportFileInfos = ReportFileInfos;
    }

    /**
     * Get <p>返回类型：0:正常返回； 1:流式返回； 默认：0</p> 
     * @return ResultType <p>返回类型：0:正常返回； 1:流式返回； 默认：0</p>
     */
    public Long getResultType() {
        return this.ResultType;
    }

    /**
     * Set <p>返回类型：0:正常返回； 1:流式返回； 默认：0</p>
     * @param ResultType <p>返回类型：0:正常返回； 1:流式返回； 默认：0</p>
     */
    public void setResultType(Long ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get <p>报告解读提示词</p> 
     * @return Prompt <p>报告解读提示词</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>报告解读提示词</p>
     * @param Prompt <p>报告解读提示词</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>无报告问答提示词</p> 
     * @return QaPrompt <p>无报告问答提示词</p>
     */
    public String getQaPrompt() {
        return this.QaPrompt;
    }

    /**
     * Set <p>无报告问答提示词</p>
     * @param QaPrompt <p>无报告问答提示词</p>
     */
    public void setQaPrompt(String QaPrompt) {
        this.QaPrompt = QaPrompt;
    }

    public GetLLMReportInterpretationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLLMReportInterpretationRequest(GetLLMReportInterpretationRequest source) {
        if (source.PartnerId != null) {
            this.PartnerId = new String(source.PartnerId);
        }
        if (source.PartnerSecret != null) {
            this.PartnerSecret = new String(source.PartnerSecret);
        }
        if (source.HospitalId != null) {
            this.HospitalId = new String(source.HospitalId);
        }
        if (source.DialogueId != null) {
            this.DialogueId = new String(source.DialogueId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ReportFileInfos != null) {
            this.ReportFileInfos = new ReportFileInfoReq[source.ReportFileInfos.length];
            for (int i = 0; i < source.ReportFileInfos.length; i++) {
                this.ReportFileInfos[i] = new ReportFileInfoReq(source.ReportFileInfos[i]);
            }
        }
        if (source.ResultType != null) {
            this.ResultType = new Long(source.ResultType);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.QaPrompt != null) {
            this.QaPrompt = new String(source.QaPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartnerId", this.PartnerId);
        this.setParamSimple(map, prefix + "PartnerSecret", this.PartnerSecret);
        this.setParamSimple(map, prefix + "HospitalId", this.HospitalId);
        this.setParamSimple(map, prefix + "DialogueId", this.DialogueId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "ReportFileInfos.", this.ReportFileInfos);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "QaPrompt", this.QaPrompt);

    }
}

