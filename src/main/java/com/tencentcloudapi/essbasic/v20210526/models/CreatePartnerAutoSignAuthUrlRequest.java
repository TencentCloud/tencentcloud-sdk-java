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

public class CreatePartnerAutoSignAuthUrlRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationName二选一传入。</p><p>注：<code>被授权企业必须和当前企业在同一应用号下</code></p>
    */
    @SerializedName("AuthorizedOrganizationId")
    @Expose
    private String AuthorizedOrganizationId;

    /**
    * <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。</p><p>注: </p><ol><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>被授权企业必须和当前企业在同一应用号下</li></ol>
    */
    @SerializedName("AuthorizedOrganizationName")
    @Expose
    private String AuthorizedOrganizationName;

    /**
    * <p>是否给平台应用授权</p><ul><li><strong>true</strong>: 表示是，授权平台应用。在此情况下，无需设置<code>AuthorizedOrganizationIds</code>和<code>AuthorizedOrganizationNames</code>。</li><li><strong>false</strong>: （默认）表示否，不是授权平台应用。</li></ul><p> 注：授权给平台应用需要开通【基于子客授权第三方应用可文件发起子客自动签署】白名单，请联系运营经理开通。</p>
    */
    @SerializedName("PlatformAppAuthorization")
    @Expose
    private Boolean PlatformAppAuthorization;

    /**
    * <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证。</li><li>CONTRACT： 合同专用章，专门用于签署各类合同</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证。</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul>
    */
    @SerializedName("SealTypes")
    @Expose
    private String [] SealTypes;

    /**
    * <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【授权方】的企业名称，即提供授权的企业。此场景下不支持批量</li></ul>
    */
    @SerializedName("AuthToMe")
    @Expose
    private Boolean AuthToMe;

    /**
    * <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationNames二选一传入，最大支持50个，注：<code>被授权企业必须和当前企业在同一应用号下</code></p>
    */
    @SerializedName("AuthorizedOrganizationIds")
    @Expose
    private String [] AuthorizedOrganizationIds;

    /**
    * <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationIds二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。注: 1. 如果名称中包含英文括号()，请使用中文括号（）代替。2. 被授权企业必须和当前企业在同一应用号下 3. 数组最大长度50</p>
    */
    @SerializedName("AuthorizedOrganizationNames")
    @Expose
    private String [] AuthorizedOrganizationNames;

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
     * Get <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationName二选一传入。</p><p>注：<code>被授权企业必须和当前企业在同一应用号下</code></p> 
     * @return AuthorizedOrganizationId <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationName二选一传入。</p><p>注：<code>被授权企业必须和当前企业在同一应用号下</code></p>
     * @deprecated
     */
    @Deprecated
    public String getAuthorizedOrganizationId() {
        return this.AuthorizedOrganizationId;
    }

    /**
     * Set <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationName二选一传入。</p><p>注：<code>被授权企业必须和当前企业在同一应用号下</code></p>
     * @param AuthorizedOrganizationId <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationName二选一传入。</p><p>注：<code>被授权企业必须和当前企业在同一应用号下</code></p>
     * @deprecated
     */
    @Deprecated
    public void setAuthorizedOrganizationId(String AuthorizedOrganizationId) {
        this.AuthorizedOrganizationId = AuthorizedOrganizationId;
    }

    /**
     * Get <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。</p><p>注: </p><ol><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>被授权企业必须和当前企业在同一应用号下</li></ol> 
     * @return AuthorizedOrganizationName <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。</p><p>注: </p><ol><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>被授权企业必须和当前企业在同一应用号下</li></ol>
     * @deprecated
     */
    @Deprecated
    public String getAuthorizedOrganizationName() {
        return this.AuthorizedOrganizationName;
    }

    /**
     * Set <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。</p><p>注: </p><ol><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>被授权企业必须和当前企业在同一应用号下</li></ol>
     * @param AuthorizedOrganizationName <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。</p><p>注: </p><ol><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>被授权企业必须和当前企业在同一应用号下</li></ol>
     * @deprecated
     */
    @Deprecated
    public void setAuthorizedOrganizationName(String AuthorizedOrganizationName) {
        this.AuthorizedOrganizationName = AuthorizedOrganizationName;
    }

    /**
     * Get <p>是否给平台应用授权</p><ul><li><strong>true</strong>: 表示是，授权平台应用。在此情况下，无需设置<code>AuthorizedOrganizationIds</code>和<code>AuthorizedOrganizationNames</code>。</li><li><strong>false</strong>: （默认）表示否，不是授权平台应用。</li></ul><p> 注：授权给平台应用需要开通【基于子客授权第三方应用可文件发起子客自动签署】白名单，请联系运营经理开通。</p> 
     * @return PlatformAppAuthorization <p>是否给平台应用授权</p><ul><li><strong>true</strong>: 表示是，授权平台应用。在此情况下，无需设置<code>AuthorizedOrganizationIds</code>和<code>AuthorizedOrganizationNames</code>。</li><li><strong>false</strong>: （默认）表示否，不是授权平台应用。</li></ul><p> 注：授权给平台应用需要开通【基于子客授权第三方应用可文件发起子客自动签署】白名单，请联系运营经理开通。</p>
     */
    public Boolean getPlatformAppAuthorization() {
        return this.PlatformAppAuthorization;
    }

    /**
     * Set <p>是否给平台应用授权</p><ul><li><strong>true</strong>: 表示是，授权平台应用。在此情况下，无需设置<code>AuthorizedOrganizationIds</code>和<code>AuthorizedOrganizationNames</code>。</li><li><strong>false</strong>: （默认）表示否，不是授权平台应用。</li></ul><p> 注：授权给平台应用需要开通【基于子客授权第三方应用可文件发起子客自动签署】白名单，请联系运营经理开通。</p>
     * @param PlatformAppAuthorization <p>是否给平台应用授权</p><ul><li><strong>true</strong>: 表示是，授权平台应用。在此情况下，无需设置<code>AuthorizedOrganizationIds</code>和<code>AuthorizedOrganizationNames</code>。</li><li><strong>false</strong>: （默认）表示否，不是授权平台应用。</li></ul><p> 注：授权给平台应用需要开通【基于子客授权第三方应用可文件发起子客自动签署】白名单，请联系运营经理开通。</p>
     */
    public void setPlatformAppAuthorization(Boolean PlatformAppAuthorization) {
        this.PlatformAppAuthorization = PlatformAppAuthorization;
    }

    /**
     * Get <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证。</li><li>CONTRACT： 合同专用章，专门用于签署各类合同</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证。</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul> 
     * @return SealTypes <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证。</li><li>CONTRACT： 合同专用章，专门用于签署各类合同</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证。</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul>
     */
    public String [] getSealTypes() {
        return this.SealTypes;
    }

    /**
     * Set <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证。</li><li>CONTRACT： 合同专用章，专门用于签署各类合同</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证。</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul>
     * @param SealTypes <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证。</li><li>CONTRACT： 合同专用章，专门用于签署各类合同</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证。</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul>
     */
    public void setSealTypes(String [] SealTypes) {
        this.SealTypes = SealTypes;
    }

    /**
     * Get <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【授权方】的企业名称，即提供授权的企业。此场景下不支持批量</li></ul> 
     * @return AuthToMe <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【授权方】的企业名称，即提供授权的企业。此场景下不支持批量</li></ul>
     */
    public Boolean getAuthToMe() {
        return this.AuthToMe;
    }

    /**
     * Set <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【授权方】的企业名称，即提供授权的企业。此场景下不支持批量</li></ul>
     * @param AuthToMe <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationNames</code> 代表的是【授权方】的企业名称，即提供授权的企业。此场景下不支持批量</li></ul>
     */
    public void setAuthToMe(Boolean AuthToMe) {
        this.AuthToMe = AuthToMe;
    }

    /**
     * Get <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationNames二选一传入，最大支持50个，注：<code>被授权企业必须和当前企业在同一应用号下</code></p> 
     * @return AuthorizedOrganizationIds <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationNames二选一传入，最大支持50个，注：<code>被授权企业必须和当前企业在同一应用号下</code></p>
     */
    public String [] getAuthorizedOrganizationIds() {
        return this.AuthorizedOrganizationIds;
    }

    /**
     * Set <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationNames二选一传入，最大支持50个，注：<code>被授权企业必须和当前企业在同一应用号下</code></p>
     * @param AuthorizedOrganizationIds <p>被授企业id/授权方企业id（即OrganizationId），如果是企业之间授权和AuthorizedOrganizationNames二选一传入，最大支持50个，注：<code>被授权企业必须和当前企业在同一应用号下</code></p>
     */
    public void setAuthorizedOrganizationIds(String [] AuthorizedOrganizationIds) {
        this.AuthorizedOrganizationIds = AuthorizedOrganizationIds;
    }

    /**
     * Get <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationIds二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。注: 1. 如果名称中包含英文括号()，请使用中文括号（）代替。2. 被授权企业必须和当前企业在同一应用号下 3. 数组最大长度50</p> 
     * @return AuthorizedOrganizationNames <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationIds二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。注: 1. 如果名称中包含英文括号()，请使用中文括号（）代替。2. 被授权企业必须和当前企业在同一应用号下 3. 数组最大长度50</p>
     */
    public String [] getAuthorizedOrganizationNames() {
        return this.AuthorizedOrganizationNames;
    }

    /**
     * Set <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationIds二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。注: 1. 如果名称中包含英文括号()，请使用中文括号（）代替。2. 被授权企业必须和当前企业在同一应用号下 3. 数组最大长度50</p>
     * @param AuthorizedOrganizationNames <p>被授企业名称/授权方企业的名字，如果是企业之间授权和AuthorizedOrganizationIds二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。注: 1. 如果名称中包含英文括号()，请使用中文括号（）代替。2. 被授权企业必须和当前企业在同一应用号下 3. 数组最大长度50</p>
     */
    public void setAuthorizedOrganizationNames(String [] AuthorizedOrganizationNames) {
        this.AuthorizedOrganizationNames = AuthorizedOrganizationNames;
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
        if (source.AuthorizedOrganizationIds != null) {
            this.AuthorizedOrganizationIds = new String[source.AuthorizedOrganizationIds.length];
            for (int i = 0; i < source.AuthorizedOrganizationIds.length; i++) {
                this.AuthorizedOrganizationIds[i] = new String(source.AuthorizedOrganizationIds[i]);
            }
        }
        if (source.AuthorizedOrganizationNames != null) {
            this.AuthorizedOrganizationNames = new String[source.AuthorizedOrganizationNames.length];
            for (int i = 0; i < source.AuthorizedOrganizationNames.length; i++) {
                this.AuthorizedOrganizationNames[i] = new String(source.AuthorizedOrganizationNames[i]);
            }
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
        this.setParamArraySimple(map, prefix + "AuthorizedOrganizationIds.", this.AuthorizedOrganizationIds);
        this.setParamArraySimple(map, prefix + "AuthorizedOrganizationNames.", this.AuthorizedOrganizationNames);

    }
}

