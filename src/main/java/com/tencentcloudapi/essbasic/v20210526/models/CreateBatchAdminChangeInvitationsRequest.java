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

public class CreateBatchAdminChangeInvitationsRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>组织机构超管变更信息。 一次最多支持10条超管变更信息。</p>
    */
    @SerializedName("AdminChangeInvitationInfos")
    @Expose
    private AdminChangeInvitationInfo [] AdminChangeInvitationInfos;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>组织机构超管变更信息。 一次最多支持10条超管变更信息。</p> 
     * @return AdminChangeInvitationInfos <p>组织机构超管变更信息。 一次最多支持10条超管变更信息。</p>
     */
    public AdminChangeInvitationInfo [] getAdminChangeInvitationInfos() {
        return this.AdminChangeInvitationInfos;
    }

    /**
     * Set <p>组织机构超管变更信息。 一次最多支持10条超管变更信息。</p>
     * @param AdminChangeInvitationInfos <p>组织机构超管变更信息。 一次最多支持10条超管变更信息。</p>
     */
    public void setAdminChangeInvitationInfos(AdminChangeInvitationInfo [] AdminChangeInvitationInfos) {
        this.AdminChangeInvitationInfos = AdminChangeInvitationInfos;
    }

    public CreateBatchAdminChangeInvitationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchAdminChangeInvitationsRequest(CreateBatchAdminChangeInvitationsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.AdminChangeInvitationInfos != null) {
            this.AdminChangeInvitationInfos = new AdminChangeInvitationInfo[source.AdminChangeInvitationInfos.length];
            for (int i = 0; i < source.AdminChangeInvitationInfos.length; i++) {
                this.AdminChangeInvitationInfos[i] = new AdminChangeInvitationInfo(source.AdminChangeInvitationInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "AdminChangeInvitationInfos.", this.AdminChangeInvitationInfos);

    }
}

