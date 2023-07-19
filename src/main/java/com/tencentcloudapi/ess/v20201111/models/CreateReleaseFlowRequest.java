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

public class CreateReleaseFlowRequest extends AbstractModel{

    /**
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 待解除的签署流程编号（即原签署流程的编号）
    */
    @SerializedName("NeedRelievedFlowId")
    @Expose
    private String NeedRelievedFlowId;

    /**
    * 解除协议内容
    */
    @SerializedName("ReliveInfo")
    @Expose
    private RelieveInfo ReliveInfo;

    /**
    * 非必须，解除协议的本企业签署人列表，
默认使用原流程的签署人列表,当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业其他已实名员工来替换原流程中的原签署人，注意需要指明原签署人的编号(ReceiptId,通过DescribeFlowInfo接口获取)来代表需要替换哪一个签署人
解除协议的签署人数量不能多于原流程的签署人数量
    */
    @SerializedName("ReleasedApprovers")
    @Expose
    private ReleasedApprover [] ReleasedApprovers;

    /**
    * 签署流程的签署截止时间。 值为unix时间戳,精确到秒,不传默认为当前时间七天后
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 待解除的签署流程编号（即原签署流程的编号） 
     * @return NeedRelievedFlowId 待解除的签署流程编号（即原签署流程的编号）
     */
    public String getNeedRelievedFlowId() {
        return this.NeedRelievedFlowId;
    }

    /**
     * Set 待解除的签署流程编号（即原签署流程的编号）
     * @param NeedRelievedFlowId 待解除的签署流程编号（即原签署流程的编号）
     */
    public void setNeedRelievedFlowId(String NeedRelievedFlowId) {
        this.NeedRelievedFlowId = NeedRelievedFlowId;
    }

    /**
     * Get 解除协议内容 
     * @return ReliveInfo 解除协议内容
     */
    public RelieveInfo getReliveInfo() {
        return this.ReliveInfo;
    }

    /**
     * Set 解除协议内容
     * @param ReliveInfo 解除协议内容
     */
    public void setReliveInfo(RelieveInfo ReliveInfo) {
        this.ReliveInfo = ReliveInfo;
    }

    /**
     * Get 非必须，解除协议的本企业签署人列表，
默认使用原流程的签署人列表,当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业其他已实名员工来替换原流程中的原签署人，注意需要指明原签署人的编号(ReceiptId,通过DescribeFlowInfo接口获取)来代表需要替换哪一个签署人
解除协议的签署人数量不能多于原流程的签署人数量 
     * @return ReleasedApprovers 非必须，解除协议的本企业签署人列表，
默认使用原流程的签署人列表,当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业其他已实名员工来替换原流程中的原签署人，注意需要指明原签署人的编号(ReceiptId,通过DescribeFlowInfo接口获取)来代表需要替换哪一个签署人
解除协议的签署人数量不能多于原流程的签署人数量
     */
    public ReleasedApprover [] getReleasedApprovers() {
        return this.ReleasedApprovers;
    }

    /**
     * Set 非必须，解除协议的本企业签署人列表，
默认使用原流程的签署人列表,当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业其他已实名员工来替换原流程中的原签署人，注意需要指明原签署人的编号(ReceiptId,通过DescribeFlowInfo接口获取)来代表需要替换哪一个签署人
解除协议的签署人数量不能多于原流程的签署人数量
     * @param ReleasedApprovers 非必须，解除协议的本企业签署人列表，
默认使用原流程的签署人列表,当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业其他已实名员工来替换原流程中的原签署人，注意需要指明原签署人的编号(ReceiptId,通过DescribeFlowInfo接口获取)来代表需要替换哪一个签署人
解除协议的签署人数量不能多于原流程的签署人数量
     */
    public void setReleasedApprovers(ReleasedApprover [] ReleasedApprovers) {
        this.ReleasedApprovers = ReleasedApprovers;
    }

    /**
     * Get 签署流程的签署截止时间。 值为unix时间戳,精确到秒,不传默认为当前时间七天后 
     * @return Deadline 签署流程的签署截止时间。 值为unix时间戳,精确到秒,不传默认为当前时间七天后
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署流程的签署截止时间。 值为unix时间戳,精确到秒,不传默认为当前时间七天后
     * @param Deadline 签署流程的签署截止时间。 值为unix时间戳,精确到秒,不传默认为当前时间七天后
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
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

    public CreateReleaseFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReleaseFlowRequest(CreateReleaseFlowRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.NeedRelievedFlowId != null) {
            this.NeedRelievedFlowId = new String(source.NeedRelievedFlowId);
        }
        if (source.ReliveInfo != null) {
            this.ReliveInfo = new RelieveInfo(source.ReliveInfo);
        }
        if (source.ReleasedApprovers != null) {
            this.ReleasedApprovers = new ReleasedApprover[source.ReleasedApprovers.length];
            for (int i = 0; i < source.ReleasedApprovers.length; i++) {
                this.ReleasedApprovers[i] = new ReleasedApprover(source.ReleasedApprovers[i]);
            }
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
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
        this.setParamSimple(map, prefix + "NeedRelievedFlowId", this.NeedRelievedFlowId);
        this.setParamObj(map, prefix + "ReliveInfo.", this.ReliveInfo);
        this.setParamArrayObj(map, prefix + "ReleasedApprovers.", this.ReleasedApprovers);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

