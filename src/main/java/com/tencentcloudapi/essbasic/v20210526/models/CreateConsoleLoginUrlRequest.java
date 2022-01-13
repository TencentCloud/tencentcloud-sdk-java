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
此接口Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 渠道侧合作企业名称
    */
    @SerializedName("ProxyOrganizationName")
    @Expose
    private String ProxyOrganizationName;

    /**
    * 渠道侧合作企业统一社会信用代码
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 渠道侧合作企业经办人的姓名
    */
    @SerializedName("ProxyOperatorName")
    @Expose
    private String ProxyOperatorName;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

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
     * Get 应用信息
此接口Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填 
     * @return Agent 应用信息
此接口Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用信息
此接口Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填
     * @param Agent 应用信息
此接口Agent.ProxyOrganizationOpenId 和 Agent. ProxyOperator.OpenId 必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 渠道侧合作企业名称 
     * @return ProxyOrganizationName 渠道侧合作企业名称
     */
    public String getProxyOrganizationName() {
        return this.ProxyOrganizationName;
    }

    /**
     * Set 渠道侧合作企业名称
     * @param ProxyOrganizationName 渠道侧合作企业名称
     */
    public void setProxyOrganizationName(String ProxyOrganizationName) {
        this.ProxyOrganizationName = ProxyOrganizationName;
    }

    /**
     * Get 渠道侧合作企业统一社会信用代码 
     * @return UniformSocialCreditCode 渠道侧合作企业统一社会信用代码
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 渠道侧合作企业统一社会信用代码
     * @param UniformSocialCreditCode 渠道侧合作企业统一社会信用代码
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 渠道侧合作企业经办人的姓名 
     * @return ProxyOperatorName 渠道侧合作企业经办人的姓名
     */
    public String getProxyOperatorName() {
        return this.ProxyOperatorName;
    }

    /**
     * Set 渠道侧合作企业经办人的姓名
     * @param ProxyOperatorName 渠道侧合作企业经办人的姓名
     */
    public void setProxyOperatorName(String ProxyOperatorName) {
        this.ProxyOperatorName = ProxyOperatorName;
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
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
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
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);

    }
}

