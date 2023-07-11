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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowGroupByFilesRequest extends AbstractModel{

    /**
    * 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId 代发合同
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同（流程）组名称,最大长度200个字符
    */
    @SerializedName("FlowGroupName")
    @Expose
    private String FlowGroupName;

    /**
    * 合同（流程）组的子合同信息，支持2-50个子合同
    */
    @SerializedName("FlowGroupInfos")
    @Expose
    private FlowGroupInfo [] FlowGroupInfos;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同（流程）组的配置项信息。包括是否通知本企业签署方，是否通知其他签署方
    */
    @SerializedName("FlowGroupOptions")
    @Expose
    private FlowGroupOptions FlowGroupOptions;

    /**
     * Get 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId 代发合同 
     * @return Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId 代发合同
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId 代发合同
     * @param Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId 代发合同
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同（流程）组名称,最大长度200个字符 
     * @return FlowGroupName 合同（流程）组名称,最大长度200个字符
     */
    public String getFlowGroupName() {
        return this.FlowGroupName;
    }

    /**
     * Set 合同（流程）组名称,最大长度200个字符
     * @param FlowGroupName 合同（流程）组名称,最大长度200个字符
     */
    public void setFlowGroupName(String FlowGroupName) {
        this.FlowGroupName = FlowGroupName;
    }

    /**
     * Get 合同（流程）组的子合同信息，支持2-50个子合同 
     * @return FlowGroupInfos 合同（流程）组的子合同信息，支持2-50个子合同
     */
    public FlowGroupInfo [] getFlowGroupInfos() {
        return this.FlowGroupInfos;
    }

    /**
     * Set 合同（流程）组的子合同信息，支持2-50个子合同
     * @param FlowGroupInfos 合同（流程）组的子合同信息，支持2-50个子合同
     */
    public void setFlowGroupInfos(FlowGroupInfo [] FlowGroupInfos) {
        this.FlowGroupInfos = FlowGroupInfos;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 合同（流程）组的配置项信息。包括是否通知本企业签署方，是否通知其他签署方 
     * @return FlowGroupOptions 合同（流程）组的配置项信息。包括是否通知本企业签署方，是否通知其他签署方
     */
    public FlowGroupOptions getFlowGroupOptions() {
        return this.FlowGroupOptions;
    }

    /**
     * Set 合同（流程）组的配置项信息。包括是否通知本企业签署方，是否通知其他签署方
     * @param FlowGroupOptions 合同（流程）组的配置项信息。包括是否通知本企业签署方，是否通知其他签署方
     */
    public void setFlowGroupOptions(FlowGroupOptions FlowGroupOptions) {
        this.FlowGroupOptions = FlowGroupOptions;
    }

    public CreateFlowGroupByFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowGroupByFilesRequest(CreateFlowGroupByFilesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowGroupName != null) {
            this.FlowGroupName = new String(source.FlowGroupName);
        }
        if (source.FlowGroupInfos != null) {
            this.FlowGroupInfos = new FlowGroupInfo[source.FlowGroupInfos.length];
            for (int i = 0; i < source.FlowGroupInfos.length; i++) {
                this.FlowGroupInfos[i] = new FlowGroupInfo(source.FlowGroupInfos[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowGroupOptions != null) {
            this.FlowGroupOptions = new FlowGroupOptions(source.FlowGroupOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowGroupName", this.FlowGroupName);
        this.setParamArrayObj(map, prefix + "FlowGroupInfos.", this.FlowGroupInfos);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "FlowGroupOptions.", this.FlowGroupOptions);

    }
}

