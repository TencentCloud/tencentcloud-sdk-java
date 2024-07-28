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

public class CreatePartnerAutoSignAuthUrlRequest extends AbstractModel {

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
    * 被授企业id，和AuthorizedOrganizationName二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下`
    */
    @SerializedName("AuthorizedOrganizationId")
    @Expose
    private String AuthorizedOrganizationId;

    /**
    * 被授权企业名，和AuthorizedOrganizationId二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下`
    */
    @SerializedName("AuthorizedOrganizationName")
    @Expose
    private String AuthorizedOrganizationName;

    /**
    * 是否给平台应用授权:
- true: 是（无需设置AuthorizedOrganizationId和AuthorizedOrganizationName）
- false: 否（默认）
 注：该参数需要开通“基于子客授权第三方应用可文件发起子客自动签署”，请联系运营经理开通

    */
    @SerializedName("PlatformAppAuthorization")
    @Expose
    private Boolean PlatformAppAuthorization;

    /**
    * 指定印章类型，指定后只能选择该类型的印章进行授权
支持以下印章类型：
- OFFICIAL : 企业公章
- CONTRACT : 合同专用章
- FINANCE : 财务专用章
- PERSONNEL : 人事专用章
    */
    @SerializedName("SealTypes")
    @Expose
    private String [] SealTypes;

    /**
    * 他方授权给我方：- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称
    */
    @SerializedName("AuthToMe")
    @Expose
    private Boolean AuthToMe;

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
     * Get 被授企业id，和AuthorizedOrganizationName二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下` 
     * @return AuthorizedOrganizationId 被授企业id，和AuthorizedOrganizationName二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下`
     */
    public String getAuthorizedOrganizationId() {
        return this.AuthorizedOrganizationId;
    }

    /**
     * Set 被授企业id，和AuthorizedOrganizationName二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下`
     * @param AuthorizedOrganizationId 被授企业id，和AuthorizedOrganizationName二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下`
     */
    public void setAuthorizedOrganizationId(String AuthorizedOrganizationId) {
        this.AuthorizedOrganizationId = AuthorizedOrganizationId;
    }

    /**
     * Get 被授权企业名，和AuthorizedOrganizationId二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下` 
     * @return AuthorizedOrganizationName 被授权企业名，和AuthorizedOrganizationId二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下`
     */
    public String getAuthorizedOrganizationName() {
        return this.AuthorizedOrganizationName;
    }

    /**
     * Set 被授权企业名，和AuthorizedOrganizationId二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下`
     * @param AuthorizedOrganizationName 被授权企业名，和AuthorizedOrganizationId二选一，不能同时为空
注：`被授权企业必须和当前企业在同一应用号下`
     */
    public void setAuthorizedOrganizationName(String AuthorizedOrganizationName) {
        this.AuthorizedOrganizationName = AuthorizedOrganizationName;
    }

    /**
     * Get 是否给平台应用授权:
- true: 是（无需设置AuthorizedOrganizationId和AuthorizedOrganizationName）
- false: 否（默认）
 注：该参数需要开通“基于子客授权第三方应用可文件发起子客自动签署”，请联系运营经理开通
 
     * @return PlatformAppAuthorization 是否给平台应用授权:
- true: 是（无需设置AuthorizedOrganizationId和AuthorizedOrganizationName）
- false: 否（默认）
 注：该参数需要开通“基于子客授权第三方应用可文件发起子客自动签署”，请联系运营经理开通

     */
    public Boolean getPlatformAppAuthorization() {
        return this.PlatformAppAuthorization;
    }

    /**
     * Set 是否给平台应用授权:
- true: 是（无需设置AuthorizedOrganizationId和AuthorizedOrganizationName）
- false: 否（默认）
 注：该参数需要开通“基于子客授权第三方应用可文件发起子客自动签署”，请联系运营经理开通

     * @param PlatformAppAuthorization 是否给平台应用授权:
- true: 是（无需设置AuthorizedOrganizationId和AuthorizedOrganizationName）
- false: 否（默认）
 注：该参数需要开通“基于子客授权第三方应用可文件发起子客自动签署”，请联系运营经理开通

     */
    public void setPlatformAppAuthorization(Boolean PlatformAppAuthorization) {
        this.PlatformAppAuthorization = PlatformAppAuthorization;
    }

    /**
     * Get 指定印章类型，指定后只能选择该类型的印章进行授权
支持以下印章类型：
- OFFICIAL : 企业公章
- CONTRACT : 合同专用章
- FINANCE : 财务专用章
- PERSONNEL : 人事专用章 
     * @return SealTypes 指定印章类型，指定后只能选择该类型的印章进行授权
支持以下印章类型：
- OFFICIAL : 企业公章
- CONTRACT : 合同专用章
- FINANCE : 财务专用章
- PERSONNEL : 人事专用章
     */
    public String [] getSealTypes() {
        return this.SealTypes;
    }

    /**
     * Set 指定印章类型，指定后只能选择该类型的印章进行授权
支持以下印章类型：
- OFFICIAL : 企业公章
- CONTRACT : 合同专用章
- FINANCE : 财务专用章
- PERSONNEL : 人事专用章
     * @param SealTypes 指定印章类型，指定后只能选择该类型的印章进行授权
支持以下印章类型：
- OFFICIAL : 企业公章
- CONTRACT : 合同专用章
- FINANCE : 财务专用章
- PERSONNEL : 人事专用章
     */
    public void setSealTypes(String [] SealTypes) {
        this.SealTypes = SealTypes;
    }

    /**
     * Get 他方授权给我方：- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称 
     * @return AuthToMe 他方授权给我方：- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称
     */
    public Boolean getAuthToMe() {
        return this.AuthToMe;
    }

    /**
     * Set 他方授权给我方：- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称
     * @param AuthToMe 他方授权给我方：- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称
     */
    public void setAuthToMe(Boolean AuthToMe) {
        this.AuthToMe = AuthToMe;
    }

    public CreatePartnerAutoSignAuthUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePartnerAutoSignAuthUrlRequest(CreatePartnerAutoSignAuthUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.AuthorizedOrganizationId != null) {
            this.AuthorizedOrganizationId = new String(source.AuthorizedOrganizationId);
        }
        if (source.AuthorizedOrganizationName != null) {
            this.AuthorizedOrganizationName = new String(source.AuthorizedOrganizationName);
        }
        if (source.PlatformAppAuthorization != null) {
            this.PlatformAppAuthorization = new Boolean(source.PlatformAppAuthorization);
        }
        if (source.SealTypes != null) {
            this.SealTypes = new String[source.SealTypes.length];
            for (int i = 0; i < source.SealTypes.length; i++) {
                this.SealTypes[i] = new String(source.SealTypes[i]);
            }
        }
        if (source.AuthToMe != null) {
            this.AuthToMe = new Boolean(source.AuthToMe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "AuthorizedOrganizationId", this.AuthorizedOrganizationId);
        this.setParamSimple(map, prefix + "AuthorizedOrganizationName", this.AuthorizedOrganizationName);
        this.setParamSimple(map, prefix + "PlatformAppAuthorization", this.PlatformAppAuthorization);
        this.setParamArraySimple(map, prefix + "SealTypes.", this.SealTypes);
        this.setParamSimple(map, prefix + "AuthToMe", this.AuthToMe);

    }
}

