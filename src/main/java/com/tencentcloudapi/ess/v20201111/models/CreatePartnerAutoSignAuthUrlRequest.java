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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePartnerAutoSignAuthUrlRequest extends AbstractModel {

    /**
    * 代理企业和员工的信息。<br/>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 被授企业id/授权方企业id，和AuthorizedOrganizationName二选一传入
    */
    @SerializedName("AuthorizedOrganizationId")
    @Expose
    private String AuthorizedOrganizationId;

    /**
    * 被授企业名称/授权方企业名称，和AuthorizedOrganizationId二选一传入
    */
    @SerializedName("AuthorizedOrganizationName")
    @Expose
    private String AuthorizedOrganizationName;

    /**
    * 指定印章类型，指定后只能选择该类型的印章进行授权支持以下印章类型：- OFFICIAL : 企业公章- CONTRACT : 合同专用章- FINANCE : 财务专用章- PERSONNEL : 人事专用章
    */
    @SerializedName("SealTypes")
    @Expose
    private String [] SealTypes;

    /**
    * 他方授权给我方：
- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称
- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称
    */
    @SerializedName("AuthToMe")
    @Expose
    private Boolean AuthToMe;

    /**
     * Get 代理企业和员工的信息。<br/>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。<br/>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。<br/>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。<br/>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 被授企业id/授权方企业id，和AuthorizedOrganizationName二选一传入 
     * @return AuthorizedOrganizationId 被授企业id/授权方企业id，和AuthorizedOrganizationName二选一传入
     */
    public String getAuthorizedOrganizationId() {
        return this.AuthorizedOrganizationId;
    }

    /**
     * Set 被授企业id/授权方企业id，和AuthorizedOrganizationName二选一传入
     * @param AuthorizedOrganizationId 被授企业id/授权方企业id，和AuthorizedOrganizationName二选一传入
     */
    public void setAuthorizedOrganizationId(String AuthorizedOrganizationId) {
        this.AuthorizedOrganizationId = AuthorizedOrganizationId;
    }

    /**
     * Get 被授企业名称/授权方企业名称，和AuthorizedOrganizationId二选一传入 
     * @return AuthorizedOrganizationName 被授企业名称/授权方企业名称，和AuthorizedOrganizationId二选一传入
     */
    public String getAuthorizedOrganizationName() {
        return this.AuthorizedOrganizationName;
    }

    /**
     * Set 被授企业名称/授权方企业名称，和AuthorizedOrganizationId二选一传入
     * @param AuthorizedOrganizationName 被授企业名称/授权方企业名称，和AuthorizedOrganizationId二选一传入
     */
    public void setAuthorizedOrganizationName(String AuthorizedOrganizationName) {
        this.AuthorizedOrganizationName = AuthorizedOrganizationName;
    }

    /**
     * Get 指定印章类型，指定后只能选择该类型的印章进行授权支持以下印章类型：- OFFICIAL : 企业公章- CONTRACT : 合同专用章- FINANCE : 财务专用章- PERSONNEL : 人事专用章 
     * @return SealTypes 指定印章类型，指定后只能选择该类型的印章进行授权支持以下印章类型：- OFFICIAL : 企业公章- CONTRACT : 合同专用章- FINANCE : 财务专用章- PERSONNEL : 人事专用章
     */
    public String [] getSealTypes() {
        return this.SealTypes;
    }

    /**
     * Set 指定印章类型，指定后只能选择该类型的印章进行授权支持以下印章类型：- OFFICIAL : 企业公章- CONTRACT : 合同专用章- FINANCE : 财务专用章- PERSONNEL : 人事专用章
     * @param SealTypes 指定印章类型，指定后只能选择该类型的印章进行授权支持以下印章类型：- OFFICIAL : 企业公章- CONTRACT : 合同专用章- FINANCE : 财务专用章- PERSONNEL : 人事专用章
     */
    public void setSealTypes(String [] SealTypes) {
        this.SealTypes = SealTypes;
    }

    /**
     * Get 他方授权给我方：
- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称
- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称 
     * @return AuthToMe 他方授权给我方：
- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称
- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称
     */
    public Boolean getAuthToMe() {
        return this.AuthToMe;
    }

    /**
     * Set 他方授权给我方：
- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称
- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称
     * @param AuthToMe 他方授权给我方：
- false：我方授权他方，AuthorizedOrganizationName代表【被授权方】企业名称
- true：他方授权我方，AuthorizedOrganizationName代表【授权方】企业名称
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

