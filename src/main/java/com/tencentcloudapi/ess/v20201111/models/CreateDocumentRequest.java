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
    * 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同流程ID，为32位字符串。
此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow" target="_blank">创建签署流程</a>接口创建得到。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。
可登录腾讯电子签控制台，在 "模板"->"模板中心"->"列表展示设置"选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。
    */
    @SerializedName("FileNames")
    @Expose
    private String [] FileNames;

    /**
    * 电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield" target="_blank">FormField</a>结构体的定义。
    */
    @SerializedName("FormFields")
    @Expose
    private FormField [] FormFields;

    /**
    * 是否为预览模式，取值如下：
<ul><li> **false**：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li>
<li> **true**：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。</li></ul>
    */
    @SerializedName("NeedPreview")
    @Expose
    private Boolean NeedPreview;

    /**
    * 预览模式下产生的预览链接类型 
<ul><li> **0** :(默认) 文件流 ,点开后后下载预览的合同PDF文件 </li>
<li> **1** :H5链接 ,点开后在浏览器中展示合同的样子</li></ul>
注: `此参数在NeedPreview 为true时有效`

    */
    @SerializedName("PreviewType")
    @Expose
    private Long PreviewType;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 已废弃字段，客户端Token，保持接口幂等性,最大长度64个字符
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。 
     * @return Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     * @param Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同流程ID，为32位字符串。
此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow" target="_blank">创建签署流程</a>接口创建得到。 
     * @return FlowId 合同流程ID，为32位字符串。
此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow" target="_blank">创建签署流程</a>接口创建得到。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID，为32位字符串。
此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow" target="_blank">创建签署流程</a>接口创建得到。
     * @param FlowId 合同流程ID，为32位字符串。
此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow" target="_blank">创建签署流程</a>接口创建得到。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。
可登录腾讯电子签控制台，在 "模板"->"模板中心"->"列表展示设置"选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。 
     * @return TemplateId 用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。
可登录腾讯电子签控制台，在 "模板"->"模板中心"->"列表展示设置"选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。
可登录腾讯电子签控制台，在 "模板"->"模板中心"->"列表展示设置"选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。
     * @param TemplateId 用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。
可登录腾讯电子签控制台，在 "模板"->"模板中心"->"列表展示设置"选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。 
     * @return FileNames 文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。
     */
    public String [] getFileNames() {
        return this.FileNames;
    }

    /**
     * Set 文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。
     * @param FileNames 文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。
     */
    public void setFileNames(String [] FileNames) {
        this.FileNames = FileNames;
    }

    /**
     * Get 电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield" target="_blank">FormField</a>结构体的定义。 
     * @return FormFields 电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield" target="_blank">FormField</a>结构体的定义。
     */
    public FormField [] getFormFields() {
        return this.FormFields;
    }

    /**
     * Set 电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield" target="_blank">FormField</a>结构体的定义。
     * @param FormFields 电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield" target="_blank">FormField</a>结构体的定义。
     */
    public void setFormFields(FormField [] FormFields) {
        this.FormFields = FormFields;
    }

    /**
     * Get 是否为预览模式，取值如下：
<ul><li> **false**：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li>
<li> **true**：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。</li></ul> 
     * @return NeedPreview 是否为预览模式，取值如下：
<ul><li> **false**：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li>
<li> **true**：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。</li></ul>
     */
    public Boolean getNeedPreview() {
        return this.NeedPreview;
    }

    /**
     * Set 是否为预览模式，取值如下：
<ul><li> **false**：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li>
<li> **true**：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。</li></ul>
     * @param NeedPreview 是否为预览模式，取值如下：
<ul><li> **false**：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li>
<li> **true**：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。</li></ul>
     */
    public void setNeedPreview(Boolean NeedPreview) {
        this.NeedPreview = NeedPreview;
    }

    /**
     * Get 预览模式下产生的预览链接类型 
<ul><li> **0** :(默认) 文件流 ,点开后后下载预览的合同PDF文件 </li>
<li> **1** :H5链接 ,点开后在浏览器中展示合同的样子</li></ul>
注: `此参数在NeedPreview 为true时有效`
 
     * @return PreviewType 预览模式下产生的预览链接类型 
<ul><li> **0** :(默认) 文件流 ,点开后后下载预览的合同PDF文件 </li>
<li> **1** :H5链接 ,点开后在浏览器中展示合同的样子</li></ul>
注: `此参数在NeedPreview 为true时有效`

     */
    public Long getPreviewType() {
        return this.PreviewType;
    }

    /**
     * Set 预览模式下产生的预览链接类型 
<ul><li> **0** :(默认) 文件流 ,点开后后下载预览的合同PDF文件 </li>
<li> **1** :H5链接 ,点开后在浏览器中展示合同的样子</li></ul>
注: `此参数在NeedPreview 为true时有效`

     * @param PreviewType 预览模式下产生的预览链接类型 
<ul><li> **0** :(默认) 文件流 ,点开后后下载预览的合同PDF文件 </li>
<li> **1** :H5链接 ,点开后在浏览器中展示合同的样子</li></ul>
注: `此参数在NeedPreview 为true时有效`

     */
    public void setPreviewType(Long PreviewType) {
        this.PreviewType = PreviewType;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 已废弃字段，客户端Token，保持接口幂等性,最大长度64个字符 
     * @return ClientToken 已废弃字段，客户端Token，保持接口幂等性,最大长度64个字符
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 已废弃字段，客户端Token，保持接口幂等性,最大长度64个字符
     * @param ClientToken 已废弃字段，客户端Token，保持接口幂等性,最大长度64个字符
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
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
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
        if (source.FormFields != null) {
            this.FormFields = new FormField[source.FormFields.length];
            for (int i = 0; i < source.FormFields.length; i++) {
                this.FormFields[i] = new FormField(source.FormFields[i]);
            }
        }
        if (source.NeedPreview != null) {
            this.NeedPreview = new Boolean(source.NeedPreview);
        }
        if (source.PreviewType != null) {
            this.PreviewType = new Long(source.PreviewType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "FileNames.", this.FileNames);
        this.setParamArrayObj(map, prefix + "FormFields.", this.FormFields);
        this.setParamSimple(map, prefix + "NeedPreview", this.NeedPreview);
        this.setParamSimple(map, prefix + "PreviewType", this.PreviewType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

