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

public class ChannelCreateEmbedWebUrlRequest extends AbstractModel{

    /**
    * WEB嵌入资源类型，取值范围：CREATE_SEAL创建印章，CREATE_TEMPLATE创建模板，MODIFY_TEMPLATE修改模板，PREVIEW_TEMPLATE预览模板，PREVIEW_FLOW预览流程
    */
    @SerializedName("EmbedType")
    @Expose
    private String EmbedType;

    /**
    * 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 渠道操作者信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * WEB嵌入的业务资源ID，EmbedType取值MODIFY_TEMPLATE或PREVIEW_TEMPLATE或 PREVIEW_FLOW时BusinessId必填
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 是否隐藏控件，只有预览模板时生效
    */
    @SerializedName("HiddenComponents")
    @Expose
    private Boolean HiddenComponents;

    /**
     * Get WEB嵌入资源类型，取值范围：CREATE_SEAL创建印章，CREATE_TEMPLATE创建模板，MODIFY_TEMPLATE修改模板，PREVIEW_TEMPLATE预览模板，PREVIEW_FLOW预览流程 
     * @return EmbedType WEB嵌入资源类型，取值范围：CREATE_SEAL创建印章，CREATE_TEMPLATE创建模板，MODIFY_TEMPLATE修改模板，PREVIEW_TEMPLATE预览模板，PREVIEW_FLOW预览流程
     */
    public String getEmbedType() {
        return this.EmbedType;
    }

    /**
     * Set WEB嵌入资源类型，取值范围：CREATE_SEAL创建印章，CREATE_TEMPLATE创建模板，MODIFY_TEMPLATE修改模板，PREVIEW_TEMPLATE预览模板，PREVIEW_FLOW预览流程
     * @param EmbedType WEB嵌入资源类型，取值范围：CREATE_SEAL创建印章，CREATE_TEMPLATE创建模板，MODIFY_TEMPLATE修改模板，PREVIEW_TEMPLATE预览模板，PREVIEW_FLOW预览流程
     */
    public void setEmbedType(String EmbedType) {
        this.EmbedType = EmbedType;
    }

    /**
     * Get 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。 
     * @return Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     * @param Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 渠道操作者信息 
     * @return Operator 渠道操作者信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 渠道操作者信息
     * @param Operator 渠道操作者信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get WEB嵌入的业务资源ID，EmbedType取值MODIFY_TEMPLATE或PREVIEW_TEMPLATE或 PREVIEW_FLOW时BusinessId必填 
     * @return BusinessId WEB嵌入的业务资源ID，EmbedType取值MODIFY_TEMPLATE或PREVIEW_TEMPLATE或 PREVIEW_FLOW时BusinessId必填
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set WEB嵌入的业务资源ID，EmbedType取值MODIFY_TEMPLATE或PREVIEW_TEMPLATE或 PREVIEW_FLOW时BusinessId必填
     * @param BusinessId WEB嵌入的业务资源ID，EmbedType取值MODIFY_TEMPLATE或PREVIEW_TEMPLATE或 PREVIEW_FLOW时BusinessId必填
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 是否隐藏控件，只有预览模板时生效 
     * @return HiddenComponents 是否隐藏控件，只有预览模板时生效
     */
    public Boolean getHiddenComponents() {
        return this.HiddenComponents;
    }

    /**
     * Set 是否隐藏控件，只有预览模板时生效
     * @param HiddenComponents 是否隐藏控件，只有预览模板时生效
     */
    public void setHiddenComponents(Boolean HiddenComponents) {
        this.HiddenComponents = HiddenComponents;
    }

    public ChannelCreateEmbedWebUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateEmbedWebUrlRequest(ChannelCreateEmbedWebUrlRequest source) {
        if (source.EmbedType != null) {
            this.EmbedType = new String(source.EmbedType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.HiddenComponents != null) {
            this.HiddenComponents = new Boolean(source.HiddenComponents);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmbedType", this.EmbedType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "HiddenComponents", this.HiddenComponents);

    }
}

