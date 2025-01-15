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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateFlowGroupByFilesRequest extends AbstractModel {

    /**
    * 合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。
    */
    @SerializedName("FlowFileInfos")
    @Expose
    private FlowFileInfo [] FlowFileInfos;

    /**
    * 合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
    */
    @SerializedName("FlowGroupName")
    @Expose
    private String FlowGroupName;

    /**
    * 合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a>

此接口下面信息必填。
<ul>
<li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li>
</ul>

合同的发起企业和发起人必需已经完成实名，并加入企业
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同组中签署人校验和认证的方式：
<ul><li>**VerifyCheck**：人脸识别（默认）</li>
<li>**MobileCheck**：手机号验证</li></ul>
注意：
`1. MobileCheck 方式，未实名的个人/自然人签署方无需进行人脸识别实名认证即可查看合同（但签署合同时仍然需要人脸实名），企业签署方需经过人脸认证。`
`2. 合同组的校验和认证的方式会优先使用，会覆盖合同组中单个合同和合同签署方认证方式的限制配置。`
    */
    @SerializedName("ApproverVerifyType")
    @Expose
    private String ApproverVerifyType;

    /**
    * 合同组的签署配置项信息，例如在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。
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
     * Get 合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。 
     * @return FlowFileInfos 合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。
     */
    public FlowFileInfo [] getFlowFileInfos() {
        return this.FlowFileInfos;
    }

    /**
     * Set 合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。
     * @param FlowFileInfos 合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。
     */
    public void setFlowFileInfos(FlowFileInfo [] FlowFileInfos) {
        this.FlowFileInfos = FlowFileInfos;
    }

    /**
     * Get 合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。 
     * @return FlowGroupName 合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     */
    public String getFlowGroupName() {
        return this.FlowGroupName;
    }

    /**
     * Set 合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     * @param FlowGroupName 合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     */
    public void setFlowGroupName(String FlowGroupName) {
        this.FlowGroupName = FlowGroupName;
    }

    /**
     * Get 合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a>

此接口下面信息必填。
<ul>
<li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li>
</ul>

合同的发起企业和发起人必需已经完成实名，并加入企业 
     * @return Agent 合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a>

此接口下面信息必填。
<ul>
<li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li>
</ul>

合同的发起企业和发起人必需已经完成实名，并加入企业
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a>

此接口下面信息必填。
<ul>
<li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li>
</ul>

合同的发起企业和发起人必需已经完成实名，并加入企业
     * @param Agent 合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a>

此接口下面信息必填。
<ul>
<li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li>
</ul>

合同的发起企业和发起人必需已经完成实名，并加入企业
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 合同组中签署人校验和认证的方式：
<ul><li>**VerifyCheck**：人脸识别（默认）</li>
<li>**MobileCheck**：手机号验证</li></ul>
注意：
`1. MobileCheck 方式，未实名的个人/自然人签署方无需进行人脸识别实名认证即可查看合同（但签署合同时仍然需要人脸实名），企业签署方需经过人脸认证。`
`2. 合同组的校验和认证的方式会优先使用，会覆盖合同组中单个合同和合同签署方认证方式的限制配置。` 
     * @return ApproverVerifyType 合同组中签署人校验和认证的方式：
<ul><li>**VerifyCheck**：人脸识别（默认）</li>
<li>**MobileCheck**：手机号验证</li></ul>
注意：
`1. MobileCheck 方式，未实名的个人/自然人签署方无需进行人脸识别实名认证即可查看合同（但签署合同时仍然需要人脸实名），企业签署方需经过人脸认证。`
`2. 合同组的校验和认证的方式会优先使用，会覆盖合同组中单个合同和合同签署方认证方式的限制配置。`
     */
    public String getApproverVerifyType() {
        return this.ApproverVerifyType;
    }

    /**
     * Set 合同组中签署人校验和认证的方式：
<ul><li>**VerifyCheck**：人脸识别（默认）</li>
<li>**MobileCheck**：手机号验证</li></ul>
注意：
`1. MobileCheck 方式，未实名的个人/自然人签署方无需进行人脸识别实名认证即可查看合同（但签署合同时仍然需要人脸实名），企业签署方需经过人脸认证。`
`2. 合同组的校验和认证的方式会优先使用，会覆盖合同组中单个合同和合同签署方认证方式的限制配置。`
     * @param ApproverVerifyType 合同组中签署人校验和认证的方式：
<ul><li>**VerifyCheck**：人脸识别（默认）</li>
<li>**MobileCheck**：手机号验证</li></ul>
注意：
`1. MobileCheck 方式，未实名的个人/自然人签署方无需进行人脸识别实名认证即可查看合同（但签署合同时仍然需要人脸实名），企业签署方需经过人脸认证。`
`2. 合同组的校验和认证的方式会优先使用，会覆盖合同组中单个合同和合同签署方认证方式的限制配置。`
     */
    public void setApproverVerifyType(String ApproverVerifyType) {
        this.ApproverVerifyType = ApproverVerifyType;
    }

    /**
     * Get 合同组的签署配置项信息，例如在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。 
     * @return FlowGroupOptions 合同组的签署配置项信息，例如在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。
     */
    public FlowGroupOptions getFlowGroupOptions() {
        return this.FlowGroupOptions;
    }

    /**
     * Set 合同组的签署配置项信息，例如在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。
     * @param FlowGroupOptions 合同组的签署配置项信息，例如在合同组签署过程中，是否需要对每个子合同进行独立的意愿确认。
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

