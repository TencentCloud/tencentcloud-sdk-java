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

public class CreateFlowsByTemplatesRequest extends AbstractModel{

    /**
    * 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 多个合同（签署流程）信息，最多支持20个
    */
    @SerializedName("FlowInfos")
    @Expose
    private FlowInfo [] FlowInfos;

    /**
    * 是否为预览模式；默认为false，即非预览模式，此时发起合同并返回FlowIds；若为预览模式，则返回PreviewUrls；
预览链接有效期300秒；
    */
    @SerializedName("NeedPreview")
    @Expose
    private Boolean NeedPreview;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。 
     * @return Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     * @param Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 多个合同（签署流程）信息，最多支持20个 
     * @return FlowInfos 多个合同（签署流程）信息，最多支持20个
     */
    public FlowInfo [] getFlowInfos() {
        return this.FlowInfos;
    }

    /**
     * Set 多个合同（签署流程）信息，最多支持20个
     * @param FlowInfos 多个合同（签署流程）信息，最多支持20个
     */
    public void setFlowInfos(FlowInfo [] FlowInfos) {
        this.FlowInfos = FlowInfos;
    }

    /**
     * Get 是否为预览模式；默认为false，即非预览模式，此时发起合同并返回FlowIds；若为预览模式，则返回PreviewUrls；
预览链接有效期300秒； 
     * @return NeedPreview 是否为预览模式；默认为false，即非预览模式，此时发起合同并返回FlowIds；若为预览模式，则返回PreviewUrls；
预览链接有效期300秒；
     */
    public Boolean getNeedPreview() {
        return this.NeedPreview;
    }

    /**
     * Set 是否为预览模式；默认为false，即非预览模式，此时发起合同并返回FlowIds；若为预览模式，则返回PreviewUrls；
预览链接有效期300秒；
     * @param NeedPreview 是否为预览模式；默认为false，即非预览模式，此时发起合同并返回FlowIds；若为预览模式，则返回PreviewUrls；
预览链接有效期300秒；
     */
    public void setNeedPreview(Boolean NeedPreview) {
        this.NeedPreview = NeedPreview;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public CreateFlowsByTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowsByTemplatesRequest(CreateFlowsByTemplatesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowInfos != null) {
            this.FlowInfos = new FlowInfo[source.FlowInfos.length];
            for (int i = 0; i < source.FlowInfos.length; i++) {
                this.FlowInfos[i] = new FlowInfo(source.FlowInfos[i]);
            }
        }
        if (source.NeedPreview != null) {
            this.NeedPreview = new Boolean(source.NeedPreview);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "FlowInfos.", this.FlowInfos);
        this.setParamSimple(map, prefix + "NeedPreview", this.NeedPreview);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

