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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDocumentRequest extends AbstractModel {

    /**
    * <p>本合同的发起人，<a href="https://qcloudimg.tencent-cloud.cn/raw/f850cfbe163a1cb38439a9f551c2505c.png" target="_blank">点击查看合同发起人展示的位置</a></p><p>注：支持填入集团子公司经办人 userId代发合同。</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/253071cc2f7becb063c7cf71b37b7861.png">点击查看模板Id在控制台上的位置</a></p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>合同流程ID，为32位字符串。<br>此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow">创建签署流程</a>接口创建得到。</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。</p>
    */
    @SerializedName("FileNames")
    @Expose
    private String [] FileNames;

    /**
    * <p>电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield">FormField</a>结构体的定义。</p><ul><li>支持自动签传递印章，可通过指定自动签控件id，指定印章id来完成</li><li>附件控件支持传入图片、文件资源id，并将内容合成到合同文件中。支持的文件类型有doc、docx、xls、xlsx、html、jpg、jpeg、png、bmp、txt、pdf。需要注意如果传入的资源类型都是图片类型，图片资源会放置在合同文件的末尾，如果传入的资源有非图片类型资源，会将资源放置在附件控件所在页面的下一页。</li></ul>注：只有在控制台编辑模板时，<font color="red">归属给发起方</font>的填写控件（如下图）才能在创建文档的时候进行内容填充。![image](https://qcloudimg.tencent-cloud.cn/raw/a54a76a58c454593d06d8e9883ecc9b3.png)
    */
    @SerializedName("FormFields")
    @Expose
    private FormField [] FormFields;

    /**
    * <p>是否为预览模式，取值如下：<ul><li> <strong>false</strong>：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li> <li> <strong>true</strong>：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。 <font color="red">注意： 1.以预览模式创建的合同仅供查看，因此参与方无法进行签署操作;；2.以预览模式调用该接口返回的FlowId为临时Flowld，无法用于发起和拉取信息。</font> </li></ul></p><p><strong>注1</strong>: <code>当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容，动态表格合成完后会触发文档合成完成的回调通知</code><br><strong>注2</strong>: 预览服务按照合同份额 1:2的比例赠送预览次数。例如：购买 100 份合同，将赠送 200 次合同预览额度。当赠送的预览额度使用完后，如需继续使用预览服务，则需要单独购买预览服务额度。</p>
    */
    @SerializedName("NeedPreview")
    @Expose
    private Boolean NeedPreview;

    /**
    * <p>预览模式下产生的预览链接类型 <ul><li> <strong>0</strong> :(默认) 文件流 ,点开后下载预览的合同PDF文件 </li><li> <strong>1</strong> :H5链接 ,点开后在浏览器中展示合同的样子。</li></ul>注: <code>1.此参数在NeedPreview 为true时有效</code></p>
    */
    @SerializedName("PreviewType")
    @Expose
    private Long PreviewType;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>该字段已不再使用</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get <p>本合同的发起人，<a href="https://qcloudimg.tencent-cloud.cn/raw/f850cfbe163a1cb38439a9f551c2505c.png" target="_blank">点击查看合同发起人展示的位置</a></p><p>注：支持填入集团子公司经办人 userId代发合同。</p> 
     * @return Operator <p>本合同的发起人，<a href="https://qcloudimg.tencent-cloud.cn/raw/f850cfbe163a1cb38439a9f551c2505c.png" target="_blank">点击查看合同发起人展示的位置</a></p><p>注：支持填入集团子公司经办人 userId代发合同。</p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>本合同的发起人，<a href="https://qcloudimg.tencent-cloud.cn/raw/f850cfbe163a1cb38439a9f551c2505c.png" target="_blank">点击查看合同发起人展示的位置</a></p><p>注：支持填入集团子公司经办人 userId代发合同。</p>
     * @param Operator <p>本合同的发起人，<a href="https://qcloudimg.tencent-cloud.cn/raw/f850cfbe163a1cb38439a9f551c2505c.png" target="_blank">点击查看合同发起人展示的位置</a></p><p>注：支持填入集团子公司经办人 userId代发合同。</p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/253071cc2f7becb063c7cf71b37b7861.png">点击查看模板Id在控制台上的位置</a></p> 
     * @return TemplateId <p>用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/253071cc2f7becb063c7cf71b37b7861.png">点击查看模板Id在控制台上的位置</a></p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/253071cc2f7becb063c7cf71b37b7861.png">点击查看模板Id在控制台上的位置</a></p>
     * @param TemplateId <p>用户配置的合同模板ID，会基于此模板创建合同文档，为32位字符串。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/253071cc2f7becb063c7cf71b37b7861.png">点击查看模板Id在控制台上的位置</a></p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>合同流程ID，为32位字符串。<br>此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow">创建签署流程</a>接口创建得到。</p> 
     * @return FlowId <p>合同流程ID，为32位字符串。<br>此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow">创建签署流程</a>接口创建得到。</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同流程ID，为32位字符串。<br>此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow">创建签署流程</a>接口创建得到。</p>
     * @param FlowId <p>合同流程ID，为32位字符串。<br>此接口的合同流程ID需要由<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateFlow">创建签署流程</a>接口创建得到。</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。</p> 
     * @return FileNames <p>文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。</p>
     */
    public String [] getFileNames() {
        return this.FileNames;
    }

    /**
     * Set <p>文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。</p>
     * @param FileNames <p>文件名列表，单个文件名最大长度200个字符，暂时仅支持单文件发起。设置后流程对应的文件名称当前设置的值。</p>
     */
    public void setFileNames(String [] FileNames) {
        this.FileNames = FileNames;
    }

    /**
     * Get <p>电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield">FormField</a>结构体的定义。</p><ul><li>支持自动签传递印章，可通过指定自动签控件id，指定印章id来完成</li><li>附件控件支持传入图片、文件资源id，并将内容合成到合同文件中。支持的文件类型有doc、docx、xls、xlsx、html、jpg、jpeg、png、bmp、txt、pdf。需要注意如果传入的资源类型都是图片类型，图片资源会放置在合同文件的末尾，如果传入的资源有非图片类型资源，会将资源放置在附件控件所在页面的下一页。</li></ul>注：只有在控制台编辑模板时，<font color="red">归属给发起方</font>的填写控件（如下图）才能在创建文档的时候进行内容填充。![image](https://qcloudimg.tencent-cloud.cn/raw/a54a76a58c454593d06d8e9883ecc9b3.png) 
     * @return FormFields <p>电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield">FormField</a>结构体的定义。</p><ul><li>支持自动签传递印章，可通过指定自动签控件id，指定印章id来完成</li><li>附件控件支持传入图片、文件资源id，并将内容合成到合同文件中。支持的文件类型有doc、docx、xls、xlsx、html、jpg、jpeg、png、bmp、txt、pdf。需要注意如果传入的资源类型都是图片类型，图片资源会放置在合同文件的末尾，如果传入的资源有非图片类型资源，会将资源放置在附件控件所在页面的下一页。</li></ul>注：只有在控制台编辑模板时，<font color="red">归属给发起方</font>的填写控件（如下图）才能在创建文档的时候进行内容填充。![image](https://qcloudimg.tencent-cloud.cn/raw/a54a76a58c454593d06d8e9883ecc9b3.png)
     */
    public FormField [] getFormFields() {
        return this.FormFields;
    }

    /**
     * Set <p>电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield">FormField</a>结构体的定义。</p><ul><li>支持自动签传递印章，可通过指定自动签控件id，指定印章id来完成</li><li>附件控件支持传入图片、文件资源id，并将内容合成到合同文件中。支持的文件类型有doc、docx、xls、xlsx、html、jpg、jpeg、png、bmp、txt、pdf。需要注意如果传入的资源类型都是图片类型，图片资源会放置在合同文件的末尾，如果传入的资源有非图片类型资源，会将资源放置在附件控件所在页面的下一页。</li></ul>注：只有在控制台编辑模板时，<font color="red">归属给发起方</font>的填写控件（如下图）才能在创建文档的时候进行内容填充。![image](https://qcloudimg.tencent-cloud.cn/raw/a54a76a58c454593d06d8e9883ecc9b3.png)
     * @param FormFields <p>电子文档的填写控件的填充内容。具体方式可以参考<a href="https://qian.tencent.com/developers/companyApis/dataTypes/#formfield">FormField</a>结构体的定义。</p><ul><li>支持自动签传递印章，可通过指定自动签控件id，指定印章id来完成</li><li>附件控件支持传入图片、文件资源id，并将内容合成到合同文件中。支持的文件类型有doc、docx、xls、xlsx、html、jpg、jpeg、png、bmp、txt、pdf。需要注意如果传入的资源类型都是图片类型，图片资源会放置在合同文件的末尾，如果传入的资源有非图片类型资源，会将资源放置在附件控件所在页面的下一页。</li></ul>注：只有在控制台编辑模板时，<font color="red">归属给发起方</font>的填写控件（如下图）才能在创建文档的时候进行内容填充。![image](https://qcloudimg.tencent-cloud.cn/raw/a54a76a58c454593d06d8e9883ecc9b3.png)
     */
    public void setFormFields(FormField [] FormFields) {
        this.FormFields = FormFields;
    }

    /**
     * Get <p>是否为预览模式，取值如下：<ul><li> <strong>false</strong>：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li> <li> <strong>true</strong>：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。 <font color="red">注意： 1.以预览模式创建的合同仅供查看，因此参与方无法进行签署操作;；2.以预览模式调用该接口返回的FlowId为临时Flowld，无法用于发起和拉取信息。</font> </li></ul></p><p><strong>注1</strong>: <code>当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容，动态表格合成完后会触发文档合成完成的回调通知</code><br><strong>注2</strong>: 预览服务按照合同份额 1:2的比例赠送预览次数。例如：购买 100 份合同，将赠送 200 次合同预览额度。当赠送的预览额度使用完后，如需继续使用预览服务，则需要单独购买预览服务额度。</p> 
     * @return NeedPreview <p>是否为预览模式，取值如下：<ul><li> <strong>false</strong>：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li> <li> <strong>true</strong>：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。 <font color="red">注意： 1.以预览模式创建的合同仅供查看，因此参与方无法进行签署操作;；2.以预览模式调用该接口返回的FlowId为临时Flowld，无法用于发起和拉取信息。</font> </li></ul></p><p><strong>注1</strong>: <code>当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容，动态表格合成完后会触发文档合成完成的回调通知</code><br><strong>注2</strong>: 预览服务按照合同份额 1:2的比例赠送预览次数。例如：购买 100 份合同，将赠送 200 次合同预览额度。当赠送的预览额度使用完后，如需继续使用预览服务，则需要单独购买预览服务额度。</p>
     */
    public Boolean getNeedPreview() {
        return this.NeedPreview;
    }

    /**
     * Set <p>是否为预览模式，取值如下：<ul><li> <strong>false</strong>：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li> <li> <strong>true</strong>：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。 <font color="red">注意： 1.以预览模式创建的合同仅供查看，因此参与方无法进行签署操作;；2.以预览模式调用该接口返回的FlowId为临时Flowld，无法用于发起和拉取信息。</font> </li></ul></p><p><strong>注1</strong>: <code>当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容，动态表格合成完后会触发文档合成完成的回调通知</code><br><strong>注2</strong>: 预览服务按照合同份额 1:2的比例赠送预览次数。例如：购买 100 份合同，将赠送 200 次合同预览额度。当赠送的预览额度使用完后，如需继续使用预览服务，则需要单独购买预览服务额度。</p>
     * @param NeedPreview <p>是否为预览模式，取值如下：<ul><li> <strong>false</strong>：非预览模式（默认），会产生合同流程并返回合同流程编号FlowId。</li> <li> <strong>true</strong>：预览模式，不产生合同流程，不返回合同流程编号FlowId，而是返回预览链接PreviewUrl，有效期为300秒，用于查看真实发起后合同的样子。 <font color="red">注意： 1.以预览模式创建的合同仅供查看，因此参与方无法进行签署操作;；2.以预览模式调用该接口返回的FlowId为临时Flowld，无法用于发起和拉取信息。</font> </li></ul></p><p><strong>注1</strong>: <code>当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容，动态表格合成完后会触发文档合成完成的回调通知</code><br><strong>注2</strong>: 预览服务按照合同份额 1:2的比例赠送预览次数。例如：购买 100 份合同，将赠送 200 次合同预览额度。当赠送的预览额度使用完后，如需继续使用预览服务，则需要单独购买预览服务额度。</p>
     */
    public void setNeedPreview(Boolean NeedPreview) {
        this.NeedPreview = NeedPreview;
    }

    /**
     * Get <p>预览模式下产生的预览链接类型 <ul><li> <strong>0</strong> :(默认) 文件流 ,点开后下载预览的合同PDF文件 </li><li> <strong>1</strong> :H5链接 ,点开后在浏览器中展示合同的样子。</li></ul>注: <code>1.此参数在NeedPreview 为true时有效</code></p> 
     * @return PreviewType <p>预览模式下产生的预览链接类型 <ul><li> <strong>0</strong> :(默认) 文件流 ,点开后下载预览的合同PDF文件 </li><li> <strong>1</strong> :H5链接 ,点开后在浏览器中展示合同的样子。</li></ul>注: <code>1.此参数在NeedPreview 为true时有效</code></p>
     */
    public Long getPreviewType() {
        return this.PreviewType;
    }

    /**
     * Set <p>预览模式下产生的预览链接类型 <ul><li> <strong>0</strong> :(默认) 文件流 ,点开后下载预览的合同PDF文件 </li><li> <strong>1</strong> :H5链接 ,点开后在浏览器中展示合同的样子。</li></ul>注: <code>1.此参数在NeedPreview 为true时有效</code></p>
     * @param PreviewType <p>预览模式下产生的预览链接类型 <ul><li> <strong>0</strong> :(默认) 文件流 ,点开后下载预览的合同PDF文件 </li><li> <strong>1</strong> :H5链接 ,点开后在浏览器中展示合同的样子。</li></ul>注: <code>1.此参数在NeedPreview 为true时有效</code></p>
     */
    public void setPreviewType(Long PreviewType) {
        this.PreviewType = PreviewType;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>该字段已不再使用</p> 
     * @return ClientToken <p>该字段已不再使用</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>该字段已不再使用</p>
     * @param ClientToken <p>该字段已不再使用</p>
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
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
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
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "FileNames.", this.FileNames);
        this.setParamArrayObj(map, prefix + "FormFields.", this.FormFields);
        this.setParamSimple(map, prefix + "NeedPreview", this.NeedPreview);
        this.setParamSimple(map, prefix + "PreviewType", this.PreviewType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

