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

public class CreateFlowForwardsRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>合同对应参与方需要修改的目标经办人。其UserId可在企业控制台中组织管理里面找到。或者使用获取员工信息接口得到。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p>
    */
    @SerializedName("TargetUserId")
    @Expose
    private String TargetUserId;

    /**
    * <p>企业签署方的合同及对应签署方</p>
    */
    @SerializedName("FlowForwardInfos")
    @Expose
    private FlowForwardInfo [] FlowForwardInfos;

    /**
    * <p>代理企业和员工的信息。在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>合同对应参与方需要修改的目标经办人。其UserId可在企业控制台中组织管理里面找到。或者使用获取员工信息接口得到。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p> 
     * @return TargetUserId <p>合同对应参与方需要修改的目标经办人。其UserId可在企业控制台中组织管理里面找到。或者使用获取员工信息接口得到。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p>
     */
    public String getTargetUserId() {
        return this.TargetUserId;
    }

    /**
     * Set <p>合同对应参与方需要修改的目标经办人。其UserId可在企业控制台中组织管理里面找到。或者使用获取员工信息接口得到。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p>
     * @param TargetUserId <p>合同对应参与方需要修改的目标经办人。其UserId可在企业控制台中组织管理里面找到。或者使用获取员工信息接口得到。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p>
     */
    public void setTargetUserId(String TargetUserId) {
        this.TargetUserId = TargetUserId;
    }

    /**
     * Get <p>企业签署方的合同及对应签署方</p> 
     * @return FlowForwardInfos <p>企业签署方的合同及对应签署方</p>
     */
    public FlowForwardInfo [] getFlowForwardInfos() {
        return this.FlowForwardInfos;
    }

    /**
     * Set <p>企业签署方的合同及对应签署方</p>
     * @param FlowForwardInfos <p>企业签署方的合同及对应签署方</p>
     */
    public void setFlowForwardInfos(FlowForwardInfo [] FlowForwardInfos) {
        this.FlowForwardInfos = FlowForwardInfos;
    }

    /**
     * Get <p>代理企业和员工的信息。在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public CreateFlowForwardsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowForwardsRequest(CreateFlowForwardsRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.TargetUserId != null) {
            this.TargetUserId = new String(source.TargetUserId);
        }
        if (source.FlowForwardInfos != null) {
            this.FlowForwardInfos = new FlowForwardInfo[source.FlowForwardInfos.length];
            for (int i = 0; i < source.FlowForwardInfos.length; i++) {
                this.FlowForwardInfos[i] = new FlowForwardInfo(source.FlowForwardInfos[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TargetUserId", this.TargetUserId);
        this.setParamArrayObj(map, prefix + "FlowForwardInfos.", this.FlowForwardInfos);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

