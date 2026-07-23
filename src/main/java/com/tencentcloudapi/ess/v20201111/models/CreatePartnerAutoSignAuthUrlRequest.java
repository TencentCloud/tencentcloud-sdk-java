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

public class CreatePartnerAutoSignAuthUrlRequest extends AbstractModel {

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>被授企业id/授权方企业id（即OrganizationId），和AuthorizedOrganizationName二选一传入</p>
    */
    @SerializedName("AuthorizedOrganizationId")
    @Expose
    private String AuthorizedOrganizationId;

    /**
    * <p>被授企业名称/授权方企业的名字，和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p>
    */
    @SerializedName("AuthorizedOrganizationName")
    @Expose
    private String AuthorizedOrganizationName;

    /**
    * <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证</li><li>CONTRACT： 合同专用章，专门用于签署各类合同。</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul>
    */
    @SerializedName("SealTypes")
    @Expose
    private String [] SealTypes;

    /**
    * <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【授权方】的企业名称，即提供授权的企业。</li></ul>
    */
    @SerializedName("AuthToMe")
    @Expose
    private Boolean AuthToMe;

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
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>被授企业id/授权方企业id（即OrganizationId），和AuthorizedOrganizationName二选一传入</p> 
     * @return AuthorizedOrganizationId <p>被授企业id/授权方企业id（即OrganizationId），和AuthorizedOrganizationName二选一传入</p>
     */
    public String getAuthorizedOrganizationId() {
        return this.AuthorizedOrganizationId;
    }

    /**
     * Set <p>被授企业id/授权方企业id（即OrganizationId），和AuthorizedOrganizationName二选一传入</p>
     * @param AuthorizedOrganizationId <p>被授企业id/授权方企业id（即OrganizationId），和AuthorizedOrganizationName二选一传入</p>
     */
    public void setAuthorizedOrganizationId(String AuthorizedOrganizationId) {
        this.AuthorizedOrganizationId = AuthorizedOrganizationId;
    }

    /**
     * Get <p>被授企业名称/授权方企业的名字，和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p> 
     * @return AuthorizedOrganizationName <p>被授企业名称/授权方企业的名字，和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p>
     */
    public String getAuthorizedOrganizationName() {
        return this.AuthorizedOrganizationName;
    }

    /**
     * Set <p>被授企业名称/授权方企业的名字，和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p>
     * @param AuthorizedOrganizationName <p>被授企业名称/授权方企业的名字，和AuthorizedOrganizationId二选一传入即可。请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p>
     */
    public void setAuthorizedOrganizationName(String AuthorizedOrganizationName) {
        this.AuthorizedOrganizationName = AuthorizedOrganizationName;
    }

    /**
     * Get <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证</li><li>CONTRACT： 合同专用章，专门用于签署各类合同。</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul> 
     * @return SealTypes <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证</li><li>CONTRACT： 合同专用章，专门用于签署各类合同。</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul>
     */
    public String [] getSealTypes() {
        return this.SealTypes;
    }

    /**
     * Set <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证</li><li>CONTRACT： 合同专用章，专门用于签署各类合同。</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul>
     * @param SealTypes <p>在设置印章授权时，可以指定特定的印章类型，以确保在授权过程中只使用相应类型的印章。</p><p>枚举值：</p><ul><li>OFFICIAL： 企业公章，用于代表企业对外的正式文件和重要事务的认证</li><li>CONTRACT： 合同专用章，专门用于签署各类合同。</li><li>FINANCE： 财务专用章，用于企业的财务相关文件，如发票、收据等财务凭证的认证</li><li>PERSONNEL： 人事专用章，用于人事管理相关文件，如劳动合同、人事任命等。</li><li>OTHER： 其他类型印章，包含子类型</li></ul>
     */
    public void setSealTypes(String [] SealTypes) {
        this.SealTypes = SealTypes;
    }

    /**
     * Get <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【授权方】的企业名称，即提供授权的企业。</li></ul> 
     * @return AuthToMe <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【授权方】的企业名称，即提供授权的企业。</li></ul>
     */
    public Boolean getAuthToMe() {
        return this.AuthToMe;
    }

    /**
     * Set <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【授权方】的企业名称，即提供授权的企业。</li></ul>
     * @param AuthToMe <p>在处理授权关系时，授权的方向</p><ul><li><strong>false</strong>（默认值）：表示我方授权他方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【被授权方】的企业名称，即接收授权的企业。</li><li><strong>true</strong>：表示他方授权我方。在这种情况下，<code>AuthorizedOrganizationName</code> 代表的是【授权方】的企业名称，即提供授权的企业。</li></ul>
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
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.AuthorizedOrganizationId != null) {
            this.AuthorizedOrganizationId = new String(source.AuthorizedOrganizationId);
        }
        if (source.AuthorizedOrganizationName != null) {
            this.AuthorizedOrganizationName = new String(source.AuthorizedOrganizationName);
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
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "AuthorizedOrganizationId", this.AuthorizedOrganizationId);
        this.setParamSimple(map, prefix + "AuthorizedOrganizationName", this.AuthorizedOrganizationName);
        this.setParamArraySimple(map, prefix + "SealTypes.", this.SealTypes);
        this.setParamSimple(map, prefix + "AuthToMe", this.AuthToMe);

    }
}

