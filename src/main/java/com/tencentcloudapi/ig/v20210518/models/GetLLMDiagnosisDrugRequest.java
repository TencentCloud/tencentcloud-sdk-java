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

public class GetLLMDiagnosisDrugRequest extends AbstractModel {

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
    * <p>医院应用ID</p>
    */
    @SerializedName("HospitalAppId")
    @Expose
    private String HospitalAppId;

    /**
    * <p>对话ID，由接入方生成，相同对话ID会保持相同的上下文，接入方根据业务场景使用相同或新建对话ID（建议使用UUID值）</p><p>入参限制：长度限制10-50</p>
    */
    @SerializedName("DialogueId")
    @Expose
    private String DialogueId;

    /**
    * <p>本次问答用户输入的问题，（最大长度1000，传了图片链接，此参数可为空）</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>药品图片链接</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>返回类型：0:正常返回； 1:流式返回； 默认：0</p>
    */
    @SerializedName("ResultType")
    @Expose
    private Long ResultType;

    /**
    * <p>提示词</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

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
     * Get <p>医院应用ID</p> 
     * @return HospitalAppId <p>医院应用ID</p>
     */
    public String getHospitalAppId() {
        return this.HospitalAppId;
    }

    /**
     * Set <p>医院应用ID</p>
     * @param HospitalAppId <p>医院应用ID</p>
     */
    public void setHospitalAppId(String HospitalAppId) {
        this.HospitalAppId = HospitalAppId;
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
     * Get <p>本次问答用户输入的问题，（最大长度1000，传了图片链接，此参数可为空）</p> 
     * @return Message <p>本次问答用户输入的问题，（最大长度1000，传了图片链接，此参数可为空）</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>本次问答用户输入的问题，（最大长度1000，传了图片链接，此参数可为空）</p>
     * @param Message <p>本次问答用户输入的问题，（最大长度1000，传了图片链接，此参数可为空）</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>药品图片链接</p> 
     * @return ImageUrl <p>药品图片链接</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>药品图片链接</p>
     * @param ImageUrl <p>药品图片链接</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
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
     * Get <p>提示词</p> 
     * @return Prompt <p>提示词</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>提示词</p>
     * @param Prompt <p>提示词</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    public GetLLMDiagnosisDrugRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLLMDiagnosisDrugRequest(GetLLMDiagnosisDrugRequest source) {
        if (source.PartnerId != null) {
            this.PartnerId = new String(source.PartnerId);
        }
        if (source.PartnerSecret != null) {
            this.PartnerSecret = new String(source.PartnerSecret);
        }
        if (source.HospitalAppId != null) {
            this.HospitalAppId = new String(source.HospitalAppId);
        }
        if (source.DialogueId != null) {
            this.DialogueId = new String(source.DialogueId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ResultType != null) {
            this.ResultType = new Long(source.ResultType);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartnerId", this.PartnerId);
        this.setParamSimple(map, prefix + "PartnerSecret", this.PartnerSecret);
        this.setParamSimple(map, prefix + "HospitalAppId", this.HospitalAppId);
        this.setParamSimple(map, prefix + "DialogueId", this.DialogueId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);

    }
}

