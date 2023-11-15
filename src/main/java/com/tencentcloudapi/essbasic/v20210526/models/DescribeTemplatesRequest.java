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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplatesRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同模板ID，为32位字符串。

可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 查询模板的内容

<ul><li>**0**：（默认）模板列表及详情</li>
<li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul>
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * 合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持200个模板的批量查询。

注意: 
1.` 此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。`
2. `请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。`
4. `若传递此参数，分页参数(Limit,Offset)无效`

    */
    @SerializedName("TemplateIds")
    @Expose
    private String [] TemplateIds;

    /**
    * 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。`
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。
    */
    @SerializedName("ChannelTemplateId")
    @Expose
    private String ChannelTemplateId;

    /**
    * 返回控件的范围, 是只返回发起方自己的还是所有参与方的

<ul><li>**false**：（默认）只返回发起方控件</li>
<li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul>
    */
    @SerializedName("QueryAllComponents")
    @Expose
    private Boolean QueryAllComponents;

    /**
    * 是否获取模板预览链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。`
    */
    @SerializedName("WithPreviewUrl")
    @Expose
    private Boolean WithPreviewUrl;

    /**
    * 是否获取模板的PDF文件链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。`
    */
    @SerializedName("WithPdfUrl")
    @Expose
    private Boolean WithPdfUrl;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 合同模板ID，为32位字符串。

可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。 
     * @return TemplateId 合同模板ID，为32位字符串。

可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 合同模板ID，为32位字符串。

可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。
     * @param TemplateId 合同模板ID，为32位字符串。

可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录企业控制台, 在企业模板中得到合同模板ID。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 查询模板的内容

<ul><li>**0**：（默认）模板列表及详情</li>
<li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul> 
     * @return ContentType 查询模板的内容

<ul><li>**0**：（默认）模板列表及详情</li>
<li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul>
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 查询模板的内容

<ul><li>**0**：（默认）模板列表及详情</li>
<li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul>
     * @param ContentType 查询模板的内容

<ul><li>**0**：（默认）模板列表及详情</li>
<li>**1**：仅模板列表, 不会返回模板中的签署控件, 填写控件, 参与方角色列表等信息</li></ul>
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持200个模板的批量查询。

注意: 
1.` 此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。`
2. `请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。`
4. `若传递此参数，分页参数(Limit,Offset)无效`
 
     * @return TemplateIds 合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持200个模板的批量查询。

注意: 
1.` 此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。`
2. `请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。`
4. `若传递此参数，分页参数(Limit,Offset)无效`

     */
    public String [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set 合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持200个模板的批量查询。

注意: 
1.` 此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。`
2. `请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。`
4. `若传递此参数，分页参数(Limit,Offset)无效`

     * @param TemplateIds 合同模板ID数组，每一个合同模板ID为32位字符串,  最多支持200个模板的批量查询。

注意: 
1.` 此参数TemplateIds与TemplateId互为独立，若两者均传入，以TemplateId为准。`
2. `请确保每个模板均正确且属于当前企业，若有任一模板不存在，则返回错误。`
4. `若传递此参数，分页参数(Limit,Offset)无效`

     */
    public void setTemplateIds(String [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    /**
     * Get 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。` 
     * @return Limit 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。`
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。`
     * @param Limit 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。`
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。` 
     * @return Offset 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。`
     * @param Offset 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。 
     * @return TemplateName 模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。
     * @param TemplateName 模糊搜索的模板名称，注意是模板名的连续部分，长度不能超过200，可支持由中文、字母、数字和下划线组成字符串。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。 
     * @return ChannelTemplateId 对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。
     */
    public String getChannelTemplateId() {
        return this.ChannelTemplateId;
    }

    /**
     * Set 对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。
     * @param ChannelTemplateId 对应第三方应用平台企业的模板ID，通过此值可以搜索由第三方应用平台模板ID下发或领取得到的子客模板列表。
     */
    public void setChannelTemplateId(String ChannelTemplateId) {
        this.ChannelTemplateId = ChannelTemplateId;
    }

    /**
     * Get 返回控件的范围, 是只返回发起方自己的还是所有参与方的

<ul><li>**false**：（默认）只返回发起方控件</li>
<li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul> 
     * @return QueryAllComponents 返回控件的范围, 是只返回发起方自己的还是所有参与方的

<ul><li>**false**：（默认）只返回发起方控件</li>
<li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul>
     */
    public Boolean getQueryAllComponents() {
        return this.QueryAllComponents;
    }

    /**
     * Set 返回控件的范围, 是只返回发起方自己的还是所有参与方的

<ul><li>**false**：（默认）只返回发起方控件</li>
<li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul>
     * @param QueryAllComponents 返回控件的范围, 是只返回发起方自己的还是所有参与方的

<ul><li>**false**：（默认）只返回发起方控件</li>
<li>**true**：返回所有参与方(包括发起方和签署方)控件</li></ul>
     */
    public void setQueryAllComponents(Boolean QueryAllComponents) {
        this.QueryAllComponents = QueryAllComponents;
    }

    /**
     * Get 是否获取模板预览链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。` 
     * @return WithPreviewUrl 是否获取模板预览链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public Boolean getWithPreviewUrl() {
        return this.WithPreviewUrl;
    }

    /**
     * Set 是否获取模板预览链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。`
     * @param WithPreviewUrl 是否获取模板预览链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PreviewUrl，为模板的H5预览链接,  有效期5分钟。可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public void setWithPreviewUrl(Boolean WithPreviewUrl) {
        this.WithPreviewUrl = WithPreviewUrl;
    }

    /**
     * Get 是否获取模板的PDF文件链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。` 
     * @return WithPdfUrl 是否获取模板的PDF文件链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public Boolean getWithPdfUrl() {
        return this.WithPdfUrl;
    }

    /**
     * Set 是否获取模板的PDF文件链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。`
     * @param WithPdfUrl 是否获取模板的PDF文件链接。

<ul><li>**false**：不获取（默认）</li>
<li>**true**：获取</li></ul>

设置为true之后， 返回参数PdfUrl，为模板PDF文件链接，有效期5分钟, 可以用于将PDF文件下载到本地

注: `此功能为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public void setWithPdfUrl(Boolean WithPdfUrl) {
        this.WithPdfUrl = WithPdfUrl;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
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

    }
}

