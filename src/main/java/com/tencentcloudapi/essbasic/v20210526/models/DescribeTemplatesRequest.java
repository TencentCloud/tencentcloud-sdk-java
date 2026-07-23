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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplatesRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>合同模板ID，为32位字符串。</p><p>可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>查询模板的内容</p><ul><li>**0**：（默认）模板列表及详情</li><li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul>
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * <p>合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持100个模板的批量查询。</p><p>注意:<br>1.<code>此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。</code></p><ol start="2"><li><code>请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。</code></li><li><code>若传递此参数，分页参数(Limit,Offset)无效</code></li></ol><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p>
    */
    @SerializedName("TemplateIds")
    @Expose
    private String [] TemplateIds;

    /**
    * <p>指定每页返回的数据条数，和Offset参数配合使用。</p><p>注：<code>1.默认值为20，单页做大值为100。</code></p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量:从 0 开始，最大20000。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。</p>
    */
    @SerializedName("ChannelTemplateId")
    @Expose
    private String ChannelTemplateId;

    /**
    * <p>返回控件的范围, 是只返回发起方自己的还是所有参与方的</p><ul><li>**false**：（默认）只返回发起方控件</li><li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul>
    */
    @SerializedName("QueryAllComponents")
    @Expose
    private Boolean QueryAllComponents;

    /**
    * <p>是否获取模板预览链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。</p>
    */
    @SerializedName("WithPreviewUrl")
    @Expose
    private Boolean WithPreviewUrl;

    /**
    * <p>是否获取模板的PDF文件链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地</p><p>注: <code>此功能需要开通功能白名单【第三方应用集成企业获取模板PDF下载链接】，使用前请联系对接的客户经理沟通。</code></p>
    */
    @SerializedName("WithPdfUrl")
    @Expose
    private Boolean WithPdfUrl;

    /**
    * <p>操作者的信息</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>用户合同类型id</p>
    */
    @SerializedName("UserFlowTypeId")
    @Expose
    private String UserFlowTypeId;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>合同模板ID，为32位字符串。</p><p>可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p> 
     * @return TemplateId <p>合同模板ID，为32位字符串。</p><p>可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>合同模板ID，为32位字符串。</p><p>可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p>
     * @param TemplateId <p>合同模板ID，为32位字符串。</p><p>可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>查询模板的内容</p><ul><li>**0**：（默认）模板列表及详情</li><li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul> 
     * @return ContentType <p>查询模板的内容</p><ul><li>**0**：（默认）模板列表及详情</li><li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul>
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>查询模板的内容</p><ul><li>**0**：（默认）模板列表及详情</li><li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul>
     * @param ContentType <p>查询模板的内容</p><ul><li>**0**：（默认）模板列表及详情</li><li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul>
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持100个模板的批量查询。</p><p>注意:<br>1.<code>此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。</code></p><ol start="2"><li><code>请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。</code></li><li><code>若传递此参数，分页参数(Limit,Offset)无效</code></li></ol><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p> 
     * @return TemplateIds <p>合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持100个模板的批量查询。</p><p>注意:<br>1.<code>此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。</code></p><ol start="2"><li><code>请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。</code></li><li><code>若传递此参数，分页参数(Limit,Offset)无效</code></li></ol><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p>
     */
    public String [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set <p>合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持100个模板的批量查询。</p><p>注意:<br>1.<code>此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。</code></p><ol start="2"><li><code>请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。</code></li><li><code>若传递此参数，分页参数(Limit,Offset)无效</code></li></ol><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p>
     * @param TemplateIds <p>合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持100个模板的批量查询。</p><p>注意:<br>1.<code>此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。</code></p><ol start="2"><li><code>请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。</code></li><li><code>若传递此参数，分页参数(Limit,Offset)无效</code></li></ol><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e988be12bf28a89b4716aed4502c2e02.png">点击查看模板Id在控制台上的位置</a></p>
     */
    public void setTemplateIds(String [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    /**
     * Get <p>指定每页返回的数据条数，和Offset参数配合使用。</p><p>注：<code>1.默认值为20，单页做大值为100。</code></p> 
     * @return Limit <p>指定每页返回的数据条数，和Offset参数配合使用。</p><p>注：<code>1.默认值为20，单页做大值为100。</code></p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定每页返回的数据条数，和Offset参数配合使用。</p><p>注：<code>1.默认值为20，单页做大值为100。</code></p>
     * @param Limit <p>指定每页返回的数据条数，和Offset参数配合使用。</p><p>注：<code>1.默认值为20，单页做大值为100。</code></p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量:从 0 开始，最大20000。</p> 
     * @return Offset <p>偏移量:从 0 开始，最大20000。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量:从 0 开始，最大20000。</p>
     * @param Offset <p>偏移量:从 0 开始，最大20000。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。</p> 
     * @return TemplateName <p>模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。</p>
     * @param TemplateName <p>模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。</p> 
     * @return ChannelTemplateId <p>对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。</p>
     */
    public String getChannelTemplateId() {
        return this.ChannelTemplateId;
    }

    /**
     * Set <p>对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。</p>
     * @param ChannelTemplateId <p>对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。</p>
     */
    public void setChannelTemplateId(String ChannelTemplateId) {
        this.ChannelTemplateId = ChannelTemplateId;
    }

    /**
     * Get <p>返回控件的范围, 是只返回发起方自己的还是所有参与方的</p><ul><li>**false**：（默认）只返回发起方控件</li><li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul> 
     * @return QueryAllComponents <p>返回控件的范围, 是只返回发起方自己的还是所有参与方的</p><ul><li>**false**：（默认）只返回发起方控件</li><li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul>
     */
    public Boolean getQueryAllComponents() {
        return this.QueryAllComponents;
    }

    /**
     * Set <p>返回控件的范围, 是只返回发起方自己的还是所有参与方的</p><ul><li>**false**：（默认）只返回发起方控件</li><li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul>
     * @param QueryAllComponents <p>返回控件的范围, 是只返回发起方自己的还是所有参与方的</p><ul><li>**false**：（默认）只返回发起方控件</li><li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul>
     */
    public void setQueryAllComponents(Boolean QueryAllComponents) {
        this.QueryAllComponents = QueryAllComponents;
    }

    /**
     * Get <p>是否获取模板预览链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。</p> 
     * @return WithPreviewUrl <p>是否获取模板预览链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。</p>
     */
    public Boolean getWithPreviewUrl() {
        return this.WithPreviewUrl;
    }

    /**
     * Set <p>是否获取模板预览链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。</p>
     * @param WithPreviewUrl <p>是否获取模板预览链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。</p>
     */
    public void setWithPreviewUrl(Boolean WithPreviewUrl) {
        this.WithPreviewUrl = WithPreviewUrl;
    }

    /**
     * Get <p>是否获取模板的PDF文件链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地</p><p>注: <code>此功能需要开通功能白名单【第三方应用集成企业获取模板PDF下载链接】，使用前请联系对接的客户经理沟通。</code></p> 
     * @return WithPdfUrl <p>是否获取模板的PDF文件链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地</p><p>注: <code>此功能需要开通功能白名单【第三方应用集成企业获取模板PDF下载链接】，使用前请联系对接的客户经理沟通。</code></p>
     */
    public Boolean getWithPdfUrl() {
        return this.WithPdfUrl;
    }

    /**
     * Set <p>是否获取模板的PDF文件链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地</p><p>注: <code>此功能需要开通功能白名单【第三方应用集成企业获取模板PDF下载链接】，使用前请联系对接的客户经理沟通。</code></p>
     * @param WithPdfUrl <p>是否获取模板的PDF文件链接。</p><ul><li>**false**：不获取（默认）</li><li>**true**：获取</li></ul><p>设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地</p><p>注: <code>此功能需要开通功能白名单【第三方应用集成企业获取模板PDF下载链接】，使用前请联系对接的客户经理沟通。</code></p>
     */
    public void setWithPdfUrl(Boolean WithPdfUrl) {
        this.WithPdfUrl = WithPdfUrl;
    }

    /**
     * Get <p>操作者的信息</p> 
     * @return Operator <p>操作者的信息</p>
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者的信息</p>
     * @param Operator <p>操作者的信息</p>
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>用户合同类型id</p> 
     * @return UserFlowTypeId <p>用户合同类型id</p>
     */
    public String getUserFlowTypeId() {
        return this.UserFlowTypeId;
    }

    /**
     * Set <p>用户合同类型id</p>
     * @param UserFlowTypeId <p>用户合同类型id</p>
     */
    public void setUserFlowTypeId(String UserFlowTypeId) {
        this.UserFlowTypeId = UserFlowTypeId;
    }

    public DescribeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTemplatesRequest(DescribeTemplatesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
        if (source.TemplateIds != null) {
            this.TemplateIds = new String[source.TemplateIds.length];
            for (int i = 0; i < source.TemplateIds.length; i++) {
                this.TemplateIds[i] = new String(source.TemplateIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.ChannelTemplateId != null) {
            this.ChannelTemplateId = new String(source.ChannelTemplateId);
        }
        if (source.QueryAllComponents != null) {
            this.QueryAllComponents = new Boolean(source.QueryAllComponents);
        }
        if (source.WithPreviewUrl != null) {
            this.WithPreviewUrl = new Boolean(source.WithPreviewUrl);
        }
        if (source.WithPdfUrl != null) {
            this.WithPdfUrl = new Boolean(source.WithPdfUrl);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.UserFlowTypeId != null) {
            this.UserFlowTypeId = new String(source.UserFlowTypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "ChannelTemplateId", this.ChannelTemplateId);
        this.setParamSimple(map, prefix + "QueryAllComponents", this.QueryAllComponents);
        this.setParamSimple(map, prefix + "WithPreviewUrl", this.WithPreviewUrl);
        this.setParamSimple(map, prefix + "WithPdfUrl", this.WithPdfUrl);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "UserFlowTypeId", this.UserFlowTypeId);

    }
}

