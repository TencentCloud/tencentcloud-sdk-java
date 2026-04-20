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

public class CreateFlowRemindsRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>需执行催办的签署流程ID数组，最多包含100个。</p>
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>指定通知方式，枚举值：SMS / EMAIL；为空则按签署人原始 NotifyType 处理</p>
    */
    @SerializedName("RemindTypes")
    @Expose
    private String [] RemindTypes;

    /**
    * <p>邮箱覆盖列表，为指定签署人使用特定邮箱发送邮件催办</p>
    */
    @SerializedName("RemindEmailInfos")
    @Expose
    private RemindEmailInfo [] RemindEmailInfos;

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
     * Get <p>需执行催办的签署流程ID数组，最多包含100个。</p> 
     * @return FlowIds <p>需执行催办的签署流程ID数组，最多包含100个。</p>
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set <p>需执行催办的签署流程ID数组，最多包含100个。</p>
     * @param FlowIds <p>需执行催办的签署流程ID数组，最多包含100个。</p>
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
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
     * Get <p>指定通知方式，枚举值：SMS / EMAIL；为空则按签署人原始 NotifyType 处理</p> 
     * @return RemindTypes <p>指定通知方式，枚举值：SMS / EMAIL；为空则按签署人原始 NotifyType 处理</p>
     */
    public String [] getRemindTypes() {
        return this.RemindTypes;
    }

    /**
     * Set <p>指定通知方式，枚举值：SMS / EMAIL；为空则按签署人原始 NotifyType 处理</p>
     * @param RemindTypes <p>指定通知方式，枚举值：SMS / EMAIL；为空则按签署人原始 NotifyType 处理</p>
     */
    public void setRemindTypes(String [] RemindTypes) {
        this.RemindTypes = RemindTypes;
    }

    /**
     * Get <p>邮箱覆盖列表，为指定签署人使用特定邮箱发送邮件催办</p> 
     * @return RemindEmailInfos <p>邮箱覆盖列表，为指定签署人使用特定邮箱发送邮件催办</p>
     */
    public RemindEmailInfo [] getRemindEmailInfos() {
        return this.RemindEmailInfos;
    }

    /**
     * Set <p>邮箱覆盖列表，为指定签署人使用特定邮箱发送邮件催办</p>
     * @param RemindEmailInfos <p>邮箱覆盖列表，为指定签署人使用特定邮箱发送邮件催办</p>
     */
    public void setRemindEmailInfos(RemindEmailInfo [] RemindEmailInfos) {
        this.RemindEmailInfos = RemindEmailInfos;
    }

    public CreateFlowRemindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowRemindsRequest(CreateFlowRemindsRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.RemindTypes != null) {
            this.RemindTypes = new String[source.RemindTypes.length];
            for (int i = 0; i < source.RemindTypes.length; i++) {
                this.RemindTypes[i] = new String(source.RemindTypes[i]);
            }
        }
        if (source.RemindEmailInfos != null) {
            this.RemindEmailInfos = new RemindEmailInfo[source.RemindEmailInfos.length];
            for (int i = 0; i < source.RemindEmailInfos.length; i++) {
                this.RemindEmailInfos[i] = new RemindEmailInfo(source.RemindEmailInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "RemindTypes.", this.RemindTypes);
        this.setParamArrayObj(map, prefix + "RemindEmailInfos.", this.RemindEmailInfos);

    }
}

