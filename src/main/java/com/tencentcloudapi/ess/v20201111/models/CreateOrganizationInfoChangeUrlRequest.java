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

public class CreateOrganizationInfoChangeUrlRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>企业信息变更类型，可选类型如下：</p><ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul>
    */
    @SerializedName("ChangeType")
    @Expose
    private Long ChangeType;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>他方企业的统一社会信用代码，如果不传默认生成当前企业信息变更链接</p>
    */
    @SerializedName("UnifiedSocialCreditCode")
    @Expose
    private String UnifiedSocialCreditCode;

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
     * Get <p>企业信息变更类型，可选类型如下：</p><ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul> 
     * @return ChangeType <p>企业信息变更类型，可选类型如下：</p><ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul>
     */
    public Long getChangeType() {
        return this.ChangeType;
    }

    /**
     * Set <p>企业信息变更类型，可选类型如下：</p><ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul>
     * @param ChangeType <p>企业信息变更类型，可选类型如下：</p><ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul>
     */
    public void setChangeType(Long ChangeType) {
        this.ChangeType = ChangeType;
    }

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
     * Get <p>他方企业的统一社会信用代码，如果不传默认生成当前企业信息变更链接</p> 
     * @return UnifiedSocialCreditCode <p>他方企业的统一社会信用代码，如果不传默认生成当前企业信息变更链接</p>
     */
    public String getUnifiedSocialCreditCode() {
        return this.UnifiedSocialCreditCode;
    }

    /**
     * Set <p>他方企业的统一社会信用代码，如果不传默认生成当前企业信息变更链接</p>
     * @param UnifiedSocialCreditCode <p>他方企业的统一社会信用代码，如果不传默认生成当前企业信息变更链接</p>
     */
    public void setUnifiedSocialCreditCode(String UnifiedSocialCreditCode) {
        this.UnifiedSocialCreditCode = UnifiedSocialCreditCode;
    }

    public CreateOrganizationInfoChangeUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationInfoChangeUrlRequest(CreateOrganizationInfoChangeUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ChangeType != null) {
            this.ChangeType = new Long(source.ChangeType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.UnifiedSocialCreditCode != null) {
            this.UnifiedSocialCreditCode = new String(source.UnifiedSocialCreditCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ChangeType", this.ChangeType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "UnifiedSocialCreditCode", this.UnifiedSocialCreditCode);

    }
}

