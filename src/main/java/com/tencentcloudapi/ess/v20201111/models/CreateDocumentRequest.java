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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDocumentRequest extends AbstractModel{

    /**
    * 签署流程编号,由CreateFlow接口返回
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 用户上传的模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 文件名列表,单个文件名最大长度200个字符
    */
    @SerializedName("FileNames")
    @Expose
    private String [] FileNames;

    /**
    * 无
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 内容控件信息数组
    */
    @SerializedName("FormFields")
    @Expose
    private FormField [] FormFields;

    /**
    * 是否需要生成预览文件 默认不生成；
预览链接有效期300秒；
    */
    @SerializedName("NeedPreview")
    @Expose
    private Boolean NeedPreview;

    /**
    * 客户端Token，保持接口幂等性,最大长度64个字符
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get 签署流程编号,由CreateFlow接口返回 
     * @return FlowId 签署流程编号,由CreateFlow接口返回
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 签署流程编号,由CreateFlow接口返回
     * @param FlowId 签署流程编号,由CreateFlow接口返回
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 用户上传的模板ID 
     * @return TemplateId 用户上传的模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 用户上传的模板ID
     * @param TemplateId 用户上传的模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 文件名列表,单个文件名最大长度200个字符 
     * @return FileNames 文件名列表,单个文件名最大长度200个字符
     */
    public String [] getFileNames() {
        return this.FileNames;
    }

    /**
     * Set 文件名列表,单个文件名最大长度200个字符
     * @param FileNames 文件名列表,单个文件名最大长度200个字符
     */
    public void setFileNames(String [] FileNames) {
        this.FileNames = FileNames;
    }

    /**
     * Get 无 
     * @return Operator 无
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 无
     * @param Operator 无
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 应用相关信息 
     * @return Agent 应用相关信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息
     * @param Agent 应用相关信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 内容控件信息数组 
     * @return FormFields 内容控件信息数组
     */
    public FormField [] getFormFields() {
        return this.FormFields;
    }

    /**
     * Set 内容控件信息数组
     * @param FormFields 内容控件信息数组
     */
    public void setFormFields(FormField [] FormFields) {
        this.FormFields = FormFields;
    }

    /**
     * Get 是否需要生成预览文件 默认不生成；
预览链接有效期300秒； 
     * @return NeedPreview 是否需要生成预览文件 默认不生成；
预览链接有效期300秒；
     */
    public Boolean getNeedPreview() {
        return this.NeedPreview;
    }

    /**
     * Set 是否需要生成预览文件 默认不生成；
预览链接有效期300秒；
     * @param NeedPreview 是否需要生成预览文件 默认不生成；
预览链接有效期300秒；
     */
    public void setNeedPreview(Boolean NeedPreview) {
        this.NeedPreview = NeedPreview;
    }

    /**
     * Get 客户端Token，保持接口幂等性,最大长度64个字符 
     * @return ClientToken 客户端Token，保持接口幂等性,最大长度64个字符
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端Token，保持接口幂等性,最大长度64个字符
     * @param ClientToken 客户端Token，保持接口幂等性,最大长度64个字符
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDocumentRequest(CreateDocumentRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FileNames != null) {
            this.FileNames = new String[source.FileNames.length];
            for (int i = 0; i < source.FileNames.length; i++) {
                this.FileNames[i] = new String(source.FileNames[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FormFields != null) {
            this.FormFields = new FormField[source.FormFields.length];
            for (int i = 0; i < source.FormFields.length; i++) {
                this.FormFields[i] = new FormField(source.FormFields[i]);
            }
        }
        if (source.NeedPreview != null) {
            this.NeedPreview = new Boolean(source.NeedPreview);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "FileNames.", this.FileNames);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "FormFields.", this.FormFields);
        this.setParamSimple(map, prefix + "NeedPreview", this.NeedPreview);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

