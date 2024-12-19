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

public class CreateOrganizationAuthFileRequest extends AbstractModel {

    /**
    * 企业授权书信息参数， 需要自行保证这些参数跟营业执照中的信息一致。
    */
    @SerializedName("OrganizationCommonInfo")
    @Expose
    private OrganizationCommonInfo OrganizationCommonInfo;

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
    * 授权书类型：
- 0: 企业认证超管授权书
- 1: 超管变更授权书
- 2: 企业注销授权书
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 企业授权书信息参数， 需要自行保证这些参数跟营业执照中的信息一致。 
     * @return OrganizationCommonInfo 企业授权书信息参数， 需要自行保证这些参数跟营业执照中的信息一致。
     */
    public OrganizationCommonInfo getOrganizationCommonInfo() {
        return this.OrganizationCommonInfo;
    }

    /**
     * Set 企业授权书信息参数， 需要自行保证这些参数跟营业执照中的信息一致。
     * @param OrganizationCommonInfo 企业授权书信息参数， 需要自行保证这些参数跟营业执照中的信息一致。
     */
    public void setOrganizationCommonInfo(OrganizationCommonInfo OrganizationCommonInfo) {
        this.OrganizationCommonInfo = OrganizationCommonInfo;
    }

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
     * Get 授权书类型：
- 0: 企业认证超管授权书
- 1: 超管变更授权书
- 2: 企业注销授权书 
     * @return Type 授权书类型：
- 0: 企业认证超管授权书
- 1: 超管变更授权书
- 2: 企业注销授权书
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 授权书类型：
- 0: 企业认证超管授权书
- 1: 超管变更授权书
- 2: 企业注销授权书
     * @param Type 授权书类型：
- 0: 企业认证超管授权书
- 1: 超管变更授权书
- 2: 企业注销授权书
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public CreateOrganizationAuthFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationAuthFileRequest(CreateOrganizationAuthFileRequest source) {
        if (source.OrganizationCommonInfo != null) {
            this.OrganizationCommonInfo = new OrganizationCommonInfo(source.OrganizationCommonInfo);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OrganizationCommonInfo.", this.OrganizationCommonInfo);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

