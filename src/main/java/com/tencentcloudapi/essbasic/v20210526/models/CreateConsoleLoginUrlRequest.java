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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConsoleLoginUrlRequest extends AbstractModel{

    /**
    * 应用信息
此接口Agent.AppId、Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 渠道子客企业名称，最大长度64个字符
    */
    @SerializedName("ProxyOrganizationName")
    @Expose
    private String ProxyOrganizationName;

    /**
    * 渠道子客企业经办人的姓名，最大长度50个字符
    */
    @SerializedName("ProxyOperatorName")
    @Expose
    private String ProxyOperatorName;

    /**
    * 控制台指定模块，文件/合同管理:"DOCUMENT"，模板管理:"TEMPLATE"，印章管理:"SEAL"，组织架构/人员:"OPERATOR"，空字符串："账号信息"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 控制台指定模块Id
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 渠道子客企业统一社会信用代码，最大长度200个字符
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 是否展示左侧菜单栏 是：ENABLE（默认） 否：DISABLE
    */
    @SerializedName("MenuStatus")
    @Expose
    private String MenuStatus;

    /**
    * 链接跳转类型："PC"-PC控制台，“CHANNEL”-H5跳转到电子签小程序；“APP”-第三方APP或小程序跳转电子签小程序，默认为PC控制台
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 触发自动跳转事件，仅对App类型有效，"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序
    */
    @SerializedName("AutoJumpBackEvent")
    @Expose
    private String AutoJumpBackEvent;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 支持的授权方式,授权方式: "1" - 上传授权书认证  "2" - 法定代表人认证
    */
    @SerializedName("AuthorizationTypes")
    @Expose
    private Long [] AuthorizationTypes;

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
     * Get 渠道子客企业名称，最大长度64个字符 
     * @return ProxyOrganizationName 渠道子客企业名称，最大长度64个字符
     */
    public String getProxyOrganizationName() {
        return this.ProxyOrganizationName;
    }

    /**
     * Set 渠道子客企业名称，最大长度64个字符
     * @param ProxyOrganizationName 渠道子客企业名称，最大长度64个字符
     */
    public void setProxyOrganizationName(String ProxyOrganizationName) {
        this.ProxyOrganizationName = ProxyOrganizationName;
    }

    /**
     * Get 渠道子客企业经办人的姓名，最大长度50个字符 
     * @return ProxyOperatorName 渠道子客企业经办人的姓名，最大长度50个字符
     */
    public String getProxyOperatorName() {
        return this.ProxyOperatorName;
    }

    /**
     * Set 渠道子客企业经办人的姓名，最大长度50个字符
     * @param ProxyOperatorName 渠道子客企业经办人的姓名，最大长度50个字符
     */
    public void setProxyOperatorName(String ProxyOperatorName) {
        this.ProxyOperatorName = ProxyOperatorName;
    }

    /**
     * Get 控制台指定模块，文件/合同管理:"DOCUMENT"，模板管理:"TEMPLATE"，印章管理:"SEAL"，组织架构/人员:"OPERATOR"，空字符串："账号信息" 
     * @return Module 控制台指定模块，文件/合同管理:"DOCUMENT"，模板管理:"TEMPLATE"，印章管理:"SEAL"，组织架构/人员:"OPERATOR"，空字符串："账号信息"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 控制台指定模块，文件/合同管理:"DOCUMENT"，模板管理:"TEMPLATE"，印章管理:"SEAL"，组织架构/人员:"OPERATOR"，空字符串："账号信息"
     * @param Module 控制台指定模块，文件/合同管理:"DOCUMENT"，模板管理:"TEMPLATE"，印章管理:"SEAL"，组织架构/人员:"OPERATOR"，空字符串："账号信息"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 控制台指定模块Id 
     * @return ModuleId 控制台指定模块Id
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 控制台指定模块Id
     * @param ModuleId 控制台指定模块Id
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 渠道子客企业统一社会信用代码，最大长度200个字符 
     * @return UniformSocialCreditCode 渠道子客企业统一社会信用代码，最大长度200个字符
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 渠道子客企业统一社会信用代码，最大长度200个字符
     * @param UniformSocialCreditCode 渠道子客企业统一社会信用代码，最大长度200个字符
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 是否展示左侧菜单栏 是：ENABLE（默认） 否：DISABLE 
     * @return MenuStatus 是否展示左侧菜单栏 是：ENABLE（默认） 否：DISABLE
     */
    public String getMenuStatus() {
        return this.MenuStatus;
    }

    /**
     * Set 是否展示左侧菜单栏 是：ENABLE（默认） 否：DISABLE
     * @param MenuStatus 是否展示左侧菜单栏 是：ENABLE（默认） 否：DISABLE
     */
    public void setMenuStatus(String MenuStatus) {
        this.MenuStatus = MenuStatus;
    }

    /**
     * Get 链接跳转类型："PC"-PC控制台，“CHANNEL”-H5跳转到电子签小程序；“APP”-第三方APP或小程序跳转电子签小程序，默认为PC控制台 
     * @return Endpoint 链接跳转类型："PC"-PC控制台，“CHANNEL”-H5跳转到电子签小程序；“APP”-第三方APP或小程序跳转电子签小程序，默认为PC控制台
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 链接跳转类型："PC"-PC控制台，“CHANNEL”-H5跳转到电子签小程序；“APP”-第三方APP或小程序跳转电子签小程序，默认为PC控制台
     * @param Endpoint 链接跳转类型："PC"-PC控制台，“CHANNEL”-H5跳转到电子签小程序；“APP”-第三方APP或小程序跳转电子签小程序，默认为PC控制台
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 触发自动跳转事件，仅对App类型有效，"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序 
     * @return AutoJumpBackEvent 触发自动跳转事件，仅对App类型有效，"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序
     */
    public String getAutoJumpBackEvent() {
        return this.AutoJumpBackEvent;
    }

    /**
     * Set 触发自动跳转事件，仅对App类型有效，"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序
     * @param AutoJumpBackEvent 触发自动跳转事件，仅对App类型有效，"VERIFIED":企业认证完成/员工认证完成后跳回原App/小程序
     */
    public void setAutoJumpBackEvent(String AutoJumpBackEvent) {
        this.AutoJumpBackEvent = AutoJumpBackEvent;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 支持的授权方式,授权方式: "1" - 上传授权书认证  "2" - 法定代表人认证 
     * @return AuthorizationTypes 支持的授权方式,授权方式: "1" - 上传授权书认证  "2" - 法定代表人认证
     */
    public Long [] getAuthorizationTypes() {
        return this.AuthorizationTypes;
    }

    /**
     * Set 支持的授权方式,授权方式: "1" - 上传授权书认证  "2" - 法定代表人认证
     * @param AuthorizationTypes 支持的授权方式,授权方式: "1" - 上传授权书认证  "2" - 法定代表人认证
     */
    public void setAuthorizationTypes(Long [] AuthorizationTypes) {
        this.AuthorizationTypes = AuthorizationTypes;
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
        if (source.ProxyOperatorName != null) {
            this.ProxyOperatorName = new String(source.ProxyOperatorName);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
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
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.AuthorizationTypes != null) {
            this.AuthorizationTypes = new Long[source.AuthorizationTypes.length];
            for (int i = 0; i < source.AuthorizationTypes.length; i++) {
                this.AuthorizationTypes[i] = new Long(source.AuthorizationTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ProxyOrganizationName", this.ProxyOrganizationName);
        this.setParamSimple(map, prefix + "ProxyOperatorName", this.ProxyOperatorName);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "MenuStatus", this.MenuStatus);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "AutoJumpBackEvent", this.AutoJumpBackEvent);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "AuthorizationTypes.", this.AuthorizationTypes);

    }
}

