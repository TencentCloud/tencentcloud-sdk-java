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

public class CreateConsoleLoginUrlRequest extends AbstractModel {

    /**
    * 应用信息
此接口Agent.AppId、Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 子客企业名称，最大长度64个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。
2、该名称需要与Agent.ProxyOrganizationOpenId相匹配。
    */
    @SerializedName("ProxyOrganizationName")
    @Expose
    private String ProxyOrganizationName;

    /**
    * 子客企业统一社会信用代码，最大长度200个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 子客企业经办人的姓名，最大长度50个字符
注意：
1、若经办人已经实名，这里修改经办人名字传入将不会生效。
2、该名称需要和Agent. ProxyOperator.OpenId相匹配
    */
    @SerializedName("ProxyOperatorName")
    @Expose
    private String ProxyOperatorName;

    /**
    * PC控制台登录后进入该参数指定的模块，如果不传递，将默认进入控制台首页。支持的模块包括：
1、DOCUMENT:合同管理模块，
2、TEMPLATE:企业模板管理模块，
3、SEAL:印章管理模块，
4、OPERATOR:组织管理模块，
默认将进入企业中心模块
注意：
1、如果EndPoint选择"CHANNEL"或"APP"，该参数仅支持传递"SEAL"，进入印章管理模块
2、该参数仅在企业和员工激活完成，登录控制台场景才生效。
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 该参数和Module参数配合使用，用于指定模块下的资源Id，指定后链接登录将展示该资源的详情。
根据Module参数的不同所代表的含义不同。当前支持：
1、如果Module="SEAL"，ModuleId代表印章Id, 登录链接将直接查看指定印章的详情。
2、如果Module="TEMPLATE"，ModuleId代表模版Id，登录链接将直接查看指定模版的详情。
3、如果Module="1、DOCUMENT"，ModuleId代表合同Id，登录链接将直接查看指定合同的详情。
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。
2、ModuleId需要和Module对应，ModuleId可以通过API或者控制台获取到。
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 是否展示左侧菜单栏 
"ENABLE": 是，展示 
“DISABLE”: 否，不展示
默认值为ENABLE
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。
    */
    @SerializedName("MenuStatus")
    @Expose
    private String MenuStatus;

    /**
    * 生成链接的类型：
"PC"：PC控制台链接
"CHANNEL"：H5跳转到电子签小程序链接
"APP"：第三方APP或小程序跳转电子签小程序链接
默认将生成PC控制台链接
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 触发自动跳转事件，仅对EndPoint为App类型有效，可选值包括：
"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序
    */
    @SerializedName("AutoJumpBackEvent")
    @Expose
    private String AutoJumpBackEvent;

    /**
    * 可选的企业授权方式: 
1：上传授权书 
2：转法定代表人授权
4：企业实名认证（信任第三方认证源）（此项仅支持单选）
未选择信任第三方认证源时，如果是法人进行企业激活，仅支持法人扫脸直接授权，该配置不生效；选择信任第三方认证源时，请先通过“同步企业信息”接口同步信息。
该参数仅在企业激活场景生效
    */
    @SerializedName("AuthorizationTypes")
    @Expose
    private Long [] AuthorizationTypes;

    /**
    * 暂未开放
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 应用信息
此接口Agent.AppId、Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填 
     * @return Agent 应用信息
此接口Agent.AppId、Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用信息
此接口Agent.AppId、Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填
     * @param Agent 应用信息
此接口Agent.AppId、Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 子客企业名称，最大长度64个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。
2、该名称需要与Agent.ProxyOrganizationOpenId相匹配。 
     * @return ProxyOrganizationName 子客企业名称，最大长度64个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。
2、该名称需要与Agent.ProxyOrganizationOpenId相匹配。
     */
    public String getProxyOrganizationName() {
        return this.ProxyOrganizationName;
    }

    /**
     * Set 子客企业名称，最大长度64个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。
2、该名称需要与Agent.ProxyOrganizationOpenId相匹配。
     * @param ProxyOrganizationName 子客企业名称，最大长度64个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。
2、该名称需要与Agent.ProxyOrganizationOpenId相匹配。
     */
    public void setProxyOrganizationName(String ProxyOrganizationName) {
        this.ProxyOrganizationName = ProxyOrganizationName;
    }

    /**
     * Get 子客企业统一社会信用代码，最大长度200个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。 
     * @return UniformSocialCreditCode 子客企业统一社会信用代码，最大长度200个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 子客企业统一社会信用代码，最大长度200个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。
     * @param UniformSocialCreditCode 子客企业统一社会信用代码，最大长度200个字符
注意：
1、如果您的企业已经在认证授权中或者激活完成，这里修改子客企业名字将不会生效。
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 子客企业经办人的姓名，最大长度50个字符
注意：
1、若经办人已经实名，这里修改经办人名字传入将不会生效。
2、该名称需要和Agent. ProxyOperator.OpenId相匹配 
     * @return ProxyOperatorName 子客企业经办人的姓名，最大长度50个字符
注意：
1、若经办人已经实名，这里修改经办人名字传入将不会生效。
2、该名称需要和Agent. ProxyOperator.OpenId相匹配
     */
    public String getProxyOperatorName() {
        return this.ProxyOperatorName;
    }

    /**
     * Set 子客企业经办人的姓名，最大长度50个字符
注意：
1、若经办人已经实名，这里修改经办人名字传入将不会生效。
2、该名称需要和Agent. ProxyOperator.OpenId相匹配
     * @param ProxyOperatorName 子客企业经办人的姓名，最大长度50个字符
注意：
1、若经办人已经实名，这里修改经办人名字传入将不会生效。
2、该名称需要和Agent. ProxyOperator.OpenId相匹配
     */
    public void setProxyOperatorName(String ProxyOperatorName) {
        this.ProxyOperatorName = ProxyOperatorName;
    }

    /**
     * Get PC控制台登录后进入该参数指定的模块，如果不传递，将默认进入控制台首页。支持的模块包括：
1、DOCUMENT:合同管理模块，
2、TEMPLATE:企业模板管理模块，
3、SEAL:印章管理模块，
4、OPERATOR:组织管理模块，
默认将进入企业中心模块
注意：
1、如果EndPoint选择"CHANNEL"或"APP"，该参数仅支持传递"SEAL"，进入印章管理模块
2、该参数仅在企业和员工激活完成，登录控制台场景才生效。 
     * @return Module PC控制台登录后进入该参数指定的模块，如果不传递，将默认进入控制台首页。支持的模块包括：
1、DOCUMENT:合同管理模块，
2、TEMPLATE:企业模板管理模块，
3、SEAL:印章管理模块，
4、OPERATOR:组织管理模块，
默认将进入企业中心模块
注意：
1、如果EndPoint选择"CHANNEL"或"APP"，该参数仅支持传递"SEAL"，进入印章管理模块
2、该参数仅在企业和员工激活完成，登录控制台场景才生效。
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set PC控制台登录后进入该参数指定的模块，如果不传递，将默认进入控制台首页。支持的模块包括：
1、DOCUMENT:合同管理模块，
2、TEMPLATE:企业模板管理模块，
3、SEAL:印章管理模块，
4、OPERATOR:组织管理模块，
默认将进入企业中心模块
注意：
1、如果EndPoint选择"CHANNEL"或"APP"，该参数仅支持传递"SEAL"，进入印章管理模块
2、该参数仅在企业和员工激活完成，登录控制台场景才生效。
     * @param Module PC控制台登录后进入该参数指定的模块，如果不传递，将默认进入控制台首页。支持的模块包括：
1、DOCUMENT:合同管理模块，
2、TEMPLATE:企业模板管理模块，
3、SEAL:印章管理模块，
4、OPERATOR:组织管理模块，
默认将进入企业中心模块
注意：
1、如果EndPoint选择"CHANNEL"或"APP"，该参数仅支持传递"SEAL"，进入印章管理模块
2、该参数仅在企业和员工激活完成，登录控制台场景才生效。
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 该参数和Module参数配合使用，用于指定模块下的资源Id，指定后链接登录将展示该资源的详情。
根据Module参数的不同所代表的含义不同。当前支持：
1、如果Module="SEAL"，ModuleId代表印章Id, 登录链接将直接查看指定印章的详情。
2、如果Module="TEMPLATE"，ModuleId代表模版Id，登录链接将直接查看指定模版的详情。
3、如果Module="1、DOCUMENT"，ModuleId代表合同Id，登录链接将直接查看指定合同的详情。
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。
2、ModuleId需要和Module对应，ModuleId可以通过API或者控制台获取到。 
     * @return ModuleId 该参数和Module参数配合使用，用于指定模块下的资源Id，指定后链接登录将展示该资源的详情。
根据Module参数的不同所代表的含义不同。当前支持：
1、如果Module="SEAL"，ModuleId代表印章Id, 登录链接将直接查看指定印章的详情。
2、如果Module="TEMPLATE"，ModuleId代表模版Id，登录链接将直接查看指定模版的详情。
3、如果Module="1、DOCUMENT"，ModuleId代表合同Id，登录链接将直接查看指定合同的详情。
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。
2、ModuleId需要和Module对应，ModuleId可以通过API或者控制台获取到。
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 该参数和Module参数配合使用，用于指定模块下的资源Id，指定后链接登录将展示该资源的详情。
根据Module参数的不同所代表的含义不同。当前支持：
1、如果Module="SEAL"，ModuleId代表印章Id, 登录链接将直接查看指定印章的详情。
2、如果Module="TEMPLATE"，ModuleId代表模版Id，登录链接将直接查看指定模版的详情。
3、如果Module="1、DOCUMENT"，ModuleId代表合同Id，登录链接将直接查看指定合同的详情。
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。
2、ModuleId需要和Module对应，ModuleId可以通过API或者控制台获取到。
     * @param ModuleId 该参数和Module参数配合使用，用于指定模块下的资源Id，指定后链接登录将展示该资源的详情。
根据Module参数的不同所代表的含义不同。当前支持：
1、如果Module="SEAL"，ModuleId代表印章Id, 登录链接将直接查看指定印章的详情。
2、如果Module="TEMPLATE"，ModuleId代表模版Id，登录链接将直接查看指定模版的详情。
3、如果Module="1、DOCUMENT"，ModuleId代表合同Id，登录链接将直接查看指定合同的详情。
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。
2、ModuleId需要和Module对应，ModuleId可以通过API或者控制台获取到。
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 是否展示左侧菜单栏 
"ENABLE": 是，展示 
“DISABLE”: 否，不展示
默认值为ENABLE
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。 
     * @return MenuStatus 是否展示左侧菜单栏 
"ENABLE": 是，展示 
“DISABLE”: 否，不展示
默认值为ENABLE
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。
     */
    public String getMenuStatus() {
        return this.MenuStatus;
    }

    /**
     * Set 是否展示左侧菜单栏 
"ENABLE": 是，展示 
“DISABLE”: 否，不展示
默认值为ENABLE
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。
     * @param MenuStatus 是否展示左侧菜单栏 
"ENABLE": 是，展示 
“DISABLE”: 否，不展示
默认值为ENABLE
注意：
1、该参数仅在企业和员工激活完成，登录控制台场景才生效。
     */
    public void setMenuStatus(String MenuStatus) {
        this.MenuStatus = MenuStatus;
    }

    /**
     * Get 生成链接的类型：
"PC"：PC控制台链接
"CHANNEL"：H5跳转到电子签小程序链接
"APP"：第三方APP或小程序跳转电子签小程序链接
默认将生成PC控制台链接 
     * @return Endpoint 生成链接的类型：
"PC"：PC控制台链接
"CHANNEL"：H5跳转到电子签小程序链接
"APP"：第三方APP或小程序跳转电子签小程序链接
默认将生成PC控制台链接
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 生成链接的类型：
"PC"：PC控制台链接
"CHANNEL"：H5跳转到电子签小程序链接
"APP"：第三方APP或小程序跳转电子签小程序链接
默认将生成PC控制台链接
     * @param Endpoint 生成链接的类型：
"PC"：PC控制台链接
"CHANNEL"：H5跳转到电子签小程序链接
"APP"：第三方APP或小程序跳转电子签小程序链接
默认将生成PC控制台链接
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 触发自动跳转事件，仅对EndPoint为App类型有效，可选值包括：
"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序 
     * @return AutoJumpBackEvent 触发自动跳转事件，仅对EndPoint为App类型有效，可选值包括：
"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序
     */
    public String getAutoJumpBackEvent() {
        return this.AutoJumpBackEvent;
    }

    /**
     * Set 触发自动跳转事件，仅对EndPoint为App类型有效，可选值包括：
"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序
     * @param AutoJumpBackEvent 触发自动跳转事件，仅对EndPoint为App类型有效，可选值包括：
"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序
     */
    public void setAutoJumpBackEvent(String AutoJumpBackEvent) {
        this.AutoJumpBackEvent = AutoJumpBackEvent;
    }

    /**
     * Get 可选的企业授权方式: 
1：上传授权书 
2：转法定代表人授权
4：企业实名认证（信任第三方认证源）（此项仅支持单选）
未选择信任第三方认证源时，如果是法人进行企业激活，仅支持法人扫脸直接授权，该配置不生效；选择信任第三方认证源时，请先通过“同步企业信息”接口同步信息。
该参数仅在企业激活场景生效 
     * @return AuthorizationTypes 可选的企业授权方式: 
1：上传授权书 
2：转法定代表人授权
4：企业实名认证（信任第三方认证源）（此项仅支持单选）
未选择信任第三方认证源时，如果是法人进行企业激活，仅支持法人扫脸直接授权，该配置不生效；选择信任第三方认证源时，请先通过“同步企业信息”接口同步信息。
该参数仅在企业激活场景生效
     */
    public Long [] getAuthorizationTypes() {
        return this.AuthorizationTypes;
    }

    /**
     * Set 可选的企业授权方式: 
1：上传授权书 
2：转法定代表人授权
4：企业实名认证（信任第三方认证源）（此项仅支持单选）
未选择信任第三方认证源时，如果是法人进行企业激活，仅支持法人扫脸直接授权，该配置不生效；选择信任第三方认证源时，请先通过“同步企业信息”接口同步信息。
该参数仅在企业激活场景生效
     * @param AuthorizationTypes 可选的企业授权方式: 
1：上传授权书 
2：转法定代表人授权
4：企业实名认证（信任第三方认证源）（此项仅支持单选）
未选择信任第三方认证源时，如果是法人进行企业激活，仅支持法人扫脸直接授权，该配置不生效；选择信任第三方认证源时，请先通过“同步企业信息”接口同步信息。
该参数仅在企业激活场景生效
     */
    public void setAuthorizationTypes(Long [] AuthorizationTypes) {
        this.AuthorizationTypes = AuthorizationTypes;
    }

    /**
     * Get 暂未开放 
     * @return Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 暂未开放
     * @param Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public CreateConsoleLoginUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsoleLoginUrlRequest(CreateConsoleLoginUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ProxyOrganizationName != null) {
            this.ProxyOrganizationName = new String(source.ProxyOrganizationName);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
        }
        if (source.ProxyOperatorName != null) {
            this.ProxyOperatorName = new String(source.ProxyOperatorName);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.MenuStatus != null) {
            this.MenuStatus = new String(source.MenuStatus);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.AutoJumpBackEvent != null) {
            this.AutoJumpBackEvent = new String(source.AutoJumpBackEvent);
        }
        if (source.AuthorizationTypes != null) {
            this.AuthorizationTypes = new Long[source.AuthorizationTypes.length];
            for (int i = 0; i < source.AuthorizationTypes.length; i++) {
                this.AuthorizationTypes[i] = new Long(source.AuthorizationTypes[i]);
            }
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
        this.setParamSimple(map, prefix + "ProxyOrganizationName", this.ProxyOrganizationName);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "ProxyOperatorName", this.ProxyOperatorName);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "MenuStatus", this.MenuStatus);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "AutoJumpBackEvent", this.AutoJumpBackEvent);
        this.setParamArraySimple(map, prefix + "AuthorizationTypes.", this.AuthorizationTypes);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

