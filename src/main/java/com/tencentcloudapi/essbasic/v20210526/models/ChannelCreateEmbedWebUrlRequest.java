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

public class ChannelCreateEmbedWebUrlRequest extends AbstractModel {

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
    * 要生成WEB嵌入界面的类型, 可以选择的值如下: 

<ul>
<li>CREATE_SEAL: 生成创建印章的嵌入页面</li>
<li>CREATE_TEMPLATE：生成创建模板的嵌入页面</li>
<li>MODIFY_TEMPLATE：生成修改模板的嵌入页面</li>
<li>PREVIEW_TEMPLATE：生成预览模板的嵌入页面</li>
<li>PREVIEW_FLOW：生成预览合同文档的嵌入页面（支持移动端）</li>
<li>PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面（仅支持PC端）</li>
<li>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面</li>
<li>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面</li>
<li>EXTEND_SERVICE：生成扩展服务的嵌入页面</li>
</ul>
    */
    @SerializedName("EmbedType")
    @Expose
    private String EmbedType;

    /**
    * WEB嵌入的业务资源ID

当EmbedType取值
<ul>
<li>为MODIFY_TEMPLATE，PREVIEW_TEMPLATE必填，取值为模板id</li>
<li>为CREATE_TEMPLATE，非必填，取值为资源id。*资源Id获取可使用接口[上传文件](https://qian.tencent.com/developers/partnerApis/files/UploadFiles)*</li>
<li>为PREVIEW_FLOW，PREVIEW_FLOW_DETAIL必填，取值为合同id</li>
<li>为PREVIEW_SEAL_DETAIL必填，取值为印章id</li>
</ul>


注意：
 1. CREATE_TEMPLATE中的BusinessId仅支持PDF文件类型， 如果您的文件不是PDF， 请使用接口[创建文件转换任务](https://qian.tencent.com/developers/partnerApis/files/ChannelCreateConvertTaskApi) 和[查询转换任务状态](https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi) 来进行转换成PDF资源。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 是否隐藏控件，只有预览模板时生效
    */
    @SerializedName("HiddenComponents")
    @Expose
    private Boolean HiddenComponents;

    /**
    * 渠道操作者信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 用户自定义参数
<ul>
<li>目前仅支持EmbedType=CREATE_TEMPLATE时传入</li>
<li>指定后，创建，编辑，删除模板时，回调都会携带该userData</li>
<li>支持的格式：json字符串的BASE64编码字符串</li>
<li>示例：<ul>
                 <li>json字符串：{"ComeFrom":"xxx"}，BASE64编码：eyJDb21lRnJvbSI6Inh4eCJ9</li>
                 <li>eyJDb21lRnJvbSI6Inh4eCJ9，为符合要求的userData数据格式</li>
</ul>
</li>
</ul>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 个性化参数，用于控制页面展示内容
    */
    @SerializedName("Option")
    @Expose
    private EmbedUrlOption Option;

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
     * Get 要生成WEB嵌入界面的类型, 可以选择的值如下: 

<ul>
<li>CREATE_SEAL: 生成创建印章的嵌入页面</li>
<li>CREATE_TEMPLATE：生成创建模板的嵌入页面</li>
<li>MODIFY_TEMPLATE：生成修改模板的嵌入页面</li>
<li>PREVIEW_TEMPLATE：生成预览模板的嵌入页面</li>
<li>PREVIEW_FLOW：生成预览合同文档的嵌入页面（支持移动端）</li>
<li>PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面（仅支持PC端）</li>
<li>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面</li>
<li>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面</li>
<li>EXTEND_SERVICE：生成扩展服务的嵌入页面</li>
</ul> 
     * @return EmbedType 要生成WEB嵌入界面的类型, 可以选择的值如下: 

<ul>
<li>CREATE_SEAL: 生成创建印章的嵌入页面</li>
<li>CREATE_TEMPLATE：生成创建模板的嵌入页面</li>
<li>MODIFY_TEMPLATE：生成修改模板的嵌入页面</li>
<li>PREVIEW_TEMPLATE：生成预览模板的嵌入页面</li>
<li>PREVIEW_FLOW：生成预览合同文档的嵌入页面（支持移动端）</li>
<li>PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面（仅支持PC端）</li>
<li>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面</li>
<li>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面</li>
<li>EXTEND_SERVICE：生成扩展服务的嵌入页面</li>
</ul>
     */
    public String getEmbedType() {
        return this.EmbedType;
    }

    /**
     * Set 要生成WEB嵌入界面的类型, 可以选择的值如下: 

<ul>
<li>CREATE_SEAL: 生成创建印章的嵌入页面</li>
<li>CREATE_TEMPLATE：生成创建模板的嵌入页面</li>
<li>MODIFY_TEMPLATE：生成修改模板的嵌入页面</li>
<li>PREVIEW_TEMPLATE：生成预览模板的嵌入页面</li>
<li>PREVIEW_FLOW：生成预览合同文档的嵌入页面（支持移动端）</li>
<li>PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面（仅支持PC端）</li>
<li>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面</li>
<li>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面</li>
<li>EXTEND_SERVICE：生成扩展服务的嵌入页面</li>
</ul>
     * @param EmbedType 要生成WEB嵌入界面的类型, 可以选择的值如下: 

<ul>
<li>CREATE_SEAL: 生成创建印章的嵌入页面</li>
<li>CREATE_TEMPLATE：生成创建模板的嵌入页面</li>
<li>MODIFY_TEMPLATE：生成修改模板的嵌入页面</li>
<li>PREVIEW_TEMPLATE：生成预览模板的嵌入页面</li>
<li>PREVIEW_FLOW：生成预览合同文档的嵌入页面（支持移动端）</li>
<li>PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面（仅支持PC端）</li>
<li>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面</li>
<li>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面</li>
<li>EXTEND_SERVICE：生成扩展服务的嵌入页面</li>
</ul>
     */
    public void setEmbedType(String EmbedType) {
        this.EmbedType = EmbedType;
    }

    /**
     * Get WEB嵌入的业务资源ID

当EmbedType取值
<ul>
<li>为MODIFY_TEMPLATE，PREVIEW_TEMPLATE必填，取值为模板id</li>
<li>为CREATE_TEMPLATE，非必填，取值为资源id。*资源Id获取可使用接口[上传文件](https://qian.tencent.com/developers/partnerApis/files/UploadFiles)*</li>
<li>为PREVIEW_FLOW，PREVIEW_FLOW_DETAIL必填，取值为合同id</li>
<li>为PREVIEW_SEAL_DETAIL必填，取值为印章id</li>
</ul>


注意：
 1. CREATE_TEMPLATE中的BusinessId仅支持PDF文件类型， 如果您的文件不是PDF， 请使用接口[创建文件转换任务](https://qian.tencent.com/developers/partnerApis/files/ChannelCreateConvertTaskApi) 和[查询转换任务状态](https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi) 来进行转换成PDF资源。 
     * @return BusinessId WEB嵌入的业务资源ID

当EmbedType取值
<ul>
<li>为MODIFY_TEMPLATE，PREVIEW_TEMPLATE必填，取值为模板id</li>
<li>为CREATE_TEMPLATE，非必填，取值为资源id。*资源Id获取可使用接口[上传文件](https://qian.tencent.com/developers/partnerApis/files/UploadFiles)*</li>
<li>为PREVIEW_FLOW，PREVIEW_FLOW_DETAIL必填，取值为合同id</li>
<li>为PREVIEW_SEAL_DETAIL必填，取值为印章id</li>
</ul>


注意：
 1. CREATE_TEMPLATE中的BusinessId仅支持PDF文件类型， 如果您的文件不是PDF， 请使用接口[创建文件转换任务](https://qian.tencent.com/developers/partnerApis/files/ChannelCreateConvertTaskApi) 和[查询转换任务状态](https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi) 来进行转换成PDF资源。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set WEB嵌入的业务资源ID

当EmbedType取值
<ul>
<li>为MODIFY_TEMPLATE，PREVIEW_TEMPLATE必填，取值为模板id</li>
<li>为CREATE_TEMPLATE，非必填，取值为资源id。*资源Id获取可使用接口[上传文件](https://qian.tencent.com/developers/partnerApis/files/UploadFiles)*</li>
<li>为PREVIEW_FLOW，PREVIEW_FLOW_DETAIL必填，取值为合同id</li>
<li>为PREVIEW_SEAL_DETAIL必填，取值为印章id</li>
</ul>


注意：
 1. CREATE_TEMPLATE中的BusinessId仅支持PDF文件类型， 如果您的文件不是PDF， 请使用接口[创建文件转换任务](https://qian.tencent.com/developers/partnerApis/files/ChannelCreateConvertTaskApi) 和[查询转换任务状态](https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi) 来进行转换成PDF资源。
     * @param BusinessId WEB嵌入的业务资源ID

当EmbedType取值
<ul>
<li>为MODIFY_TEMPLATE，PREVIEW_TEMPLATE必填，取值为模板id</li>
<li>为CREATE_TEMPLATE，非必填，取值为资源id。*资源Id获取可使用接口[上传文件](https://qian.tencent.com/developers/partnerApis/files/UploadFiles)*</li>
<li>为PREVIEW_FLOW，PREVIEW_FLOW_DETAIL必填，取值为合同id</li>
<li>为PREVIEW_SEAL_DETAIL必填，取值为印章id</li>
</ul>


注意：
 1. CREATE_TEMPLATE中的BusinessId仅支持PDF文件类型， 如果您的文件不是PDF， 请使用接口[创建文件转换任务](https://qian.tencent.com/developers/partnerApis/files/ChannelCreateConvertTaskApi) 和[查询转换任务状态](https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi) 来进行转换成PDF资源。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 是否隐藏控件，只有预览模板时生效 
     * @return HiddenComponents 是否隐藏控件，只有预览模板时生效
     */
    public Boolean getHiddenComponents() {
        return this.HiddenComponents;
    }

    /**
     * Set 是否隐藏控件，只有预览模板时生效
     * @param HiddenComponents 是否隐藏控件，只有预览模板时生效
     */
    public void setHiddenComponents(Boolean HiddenComponents) {
        this.HiddenComponents = HiddenComponents;
    }

    /**
     * Get 渠道操作者信息 
     * @return Operator 渠道操作者信息
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 渠道操作者信息
     * @param Operator 渠道操作者信息
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 用户自定义参数
<ul>
<li>目前仅支持EmbedType=CREATE_TEMPLATE时传入</li>
<li>指定后，创建，编辑，删除模板时，回调都会携带该userData</li>
<li>支持的格式：json字符串的BASE64编码字符串</li>
<li>示例：<ul>
                 <li>json字符串：{"ComeFrom":"xxx"}，BASE64编码：eyJDb21lRnJvbSI6Inh4eCJ9</li>
                 <li>eyJDb21lRnJvbSI6Inh4eCJ9，为符合要求的userData数据格式</li>
</ul>
</li>
</ul> 
     * @return UserData 用户自定义参数
<ul>
<li>目前仅支持EmbedType=CREATE_TEMPLATE时传入</li>
<li>指定后，创建，编辑，删除模板时，回调都会携带该userData</li>
<li>支持的格式：json字符串的BASE64编码字符串</li>
<li>示例：<ul>
                 <li>json字符串：{"ComeFrom":"xxx"}，BASE64编码：eyJDb21lRnJvbSI6Inh4eCJ9</li>
                 <li>eyJDb21lRnJvbSI6Inh4eCJ9，为符合要求的userData数据格式</li>
</ul>
</li>
</ul>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 用户自定义参数
<ul>
<li>目前仅支持EmbedType=CREATE_TEMPLATE时传入</li>
<li>指定后，创建，编辑，删除模板时，回调都会携带该userData</li>
<li>支持的格式：json字符串的BASE64编码字符串</li>
<li>示例：<ul>
                 <li>json字符串：{"ComeFrom":"xxx"}，BASE64编码：eyJDb21lRnJvbSI6Inh4eCJ9</li>
                 <li>eyJDb21lRnJvbSI6Inh4eCJ9，为符合要求的userData数据格式</li>
</ul>
</li>
</ul>
     * @param UserData 用户自定义参数
<ul>
<li>目前仅支持EmbedType=CREATE_TEMPLATE时传入</li>
<li>指定后，创建，编辑，删除模板时，回调都会携带该userData</li>
<li>支持的格式：json字符串的BASE64编码字符串</li>
<li>示例：<ul>
                 <li>json字符串：{"ComeFrom":"xxx"}，BASE64编码：eyJDb21lRnJvbSI6Inh4eCJ9</li>
                 <li>eyJDb21lRnJvbSI6Inh4eCJ9，为符合要求的userData数据格式</li>
</ul>
</li>
</ul>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 个性化参数，用于控制页面展示内容 
     * @return Option 个性化参数，用于控制页面展示内容
     */
    public EmbedUrlOption getOption() {
        return this.Option;
    }

    /**
     * Set 个性化参数，用于控制页面展示内容
     * @param Option 个性化参数，用于控制页面展示内容
     */
    public void setOption(EmbedUrlOption Option) {
        this.Option = Option;
    }

    public ChannelCreateEmbedWebUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateEmbedWebUrlRequest(ChannelCreateEmbedWebUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.EmbedType != null) {
            this.EmbedType = new String(source.EmbedType);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.HiddenComponents != null) {
            this.HiddenComponents = new Boolean(source.HiddenComponents);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.Option != null) {
            this.Option = new EmbedUrlOption(source.Option);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "EmbedType", this.EmbedType);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "HiddenComponents", this.HiddenComponents);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamObj(map, prefix + "Option.", this.Option);

    }
}

