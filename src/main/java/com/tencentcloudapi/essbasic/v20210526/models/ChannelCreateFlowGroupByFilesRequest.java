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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateFlowGroupByFilesRequest extends AbstractModel{

    /**
    * 每个子合同的发起所需的信息，数量限制2-50
    */
    @SerializedName("FlowFileInfos")
    @Expose
    private FlowFileInfo [] FlowFileInfos;

    /**
    * 合同组名称，长度不超过200个字符
    */
    @SerializedName("FlowGroupName")
    @Expose
    private String FlowGroupName;

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：若选择后者，未实名的个人签署方查看合同时，无需进行人脸识别实名认证（但签署合同时仍然需要人脸实名），该能力仅适用于个人签署方。
    */
    @SerializedName("ApproverVerifyType")
    @Expose
    private String ApproverVerifyType;

    /**
    * 合同组的配置项信息包括：在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。
    */
    @SerializedName("FlowGroupOptions")
    @Expose
    private FlowGroupOptions FlowGroupOptions;

    /**
    * 操作者的信息，此参数不用传
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 每个子合同的发起所需的信息，数量限制2-50 
     * @return FlowFileInfos 每个子合同的发起所需的信息，数量限制2-50
     */
    public FlowFileInfo [] getFlowFileInfos() {
        return this.FlowFileInfos;
    }

    /**
     * Set 每个子合同的发起所需的信息，数量限制2-50
     * @param FlowFileInfos 每个子合同的发起所需的信息，数量限制2-50
     */
    public void setFlowFileInfos(FlowFileInfo [] FlowFileInfos) {
        this.FlowFileInfos = FlowFileInfos;
    }

    /**
     * Get 合同组名称，长度不超过200个字符 
     * @return FlowGroupName 合同组名称，长度不超过200个字符
     */
    public String getFlowGroupName() {
        return this.FlowGroupName;
    }

    /**
     * Set 合同组名称，长度不超过200个字符
     * @param FlowGroupName 合同组名称，长度不超过200个字符
     */
    public void setFlowGroupName(String FlowGroupName) {
        this.FlowGroupName = FlowGroupName;
    }

    /**
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：若选择后者，未实名的个人签署方查看合同时，无需进行人脸识别实名认证（但签署合同时仍然需要人脸实名），该能力仅适用于个人签署方。 
     * @return ApproverVerifyType 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：若选择后者，未实名的个人签署方查看合同时，无需进行人脸识别实名认证（但签署合同时仍然需要人脸实名），该能力仅适用于个人签署方。
     */
    public String getApproverVerifyType() {
        return this.ApproverVerifyType;
    }

    /**
     * Set 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：若选择后者，未实名的个人签署方查看合同时，无需进行人脸识别实名认证（但签署合同时仍然需要人脸实名），该能力仅适用于个人签署方。
     * @param ApproverVerifyType 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：若选择后者，未实名的个人签署方查看合同时，无需进行人脸识别实名认证（但签署合同时仍然需要人脸实名），该能力仅适用于个人签署方。
     */
    public void setApproverVerifyType(String ApproverVerifyType) {
        this.ApproverVerifyType = ApproverVerifyType;
    }

    /**
     * Get 合同组的配置项信息包括：在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。 
     * @return FlowGroupOptions 合同组的配置项信息包括：在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。
     */
    public FlowGroupOptions getFlowGroupOptions() {
        return this.FlowGroupOptions;
    }

    /**
     * Set 合同组的配置项信息包括：在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。
     * @param FlowGroupOptions 合同组的配置项信息包括：在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。
     */
    public void setFlowGroupOptions(FlowGroupOptions FlowGroupOptions) {
        this.FlowGroupOptions = FlowGroupOptions;
    }

    /**
     * Get 操作者的信息，此参数不用传 
     * @return Operator 操作者的信息，此参数不用传
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息，此参数不用传
     * @param Operator 操作者的信息，此参数不用传
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelCreateFlowGroupByFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowGroupByFilesRequest(ChannelCreateFlowGroupByFilesRequest source) {
        if (source.FlowFileInfos != null) {
            this.FlowFileInfos = new FlowFileInfo[source.FlowFileInfos.length];
            for (int i = 0; i < source.FlowFileInfos.length; i++) {
                this.FlowFileInfos[i] = new FlowFileInfo(source.FlowFileInfos[i]);
            }
        }
        if (source.FlowGroupName != null) {
            this.FlowGroupName = new String(source.FlowGroupName);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ApproverVerifyType != null) {
            this.ApproverVerifyType = new String(source.ApproverVerifyType);
        }
        if (source.FlowGroupOptions != null) {
            this.FlowGroupOptions = new FlowGroupOptions(source.FlowGroupOptions);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FlowFileInfos.", this.FlowFileInfos);
        this.setParamSimple(map, prefix + "FlowGroupName", this.FlowGroupName);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ApproverVerifyType", this.ApproverVerifyType);
        this.setParamObj(map, prefix + "FlowGroupOptions.", this.FlowGroupOptions);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

