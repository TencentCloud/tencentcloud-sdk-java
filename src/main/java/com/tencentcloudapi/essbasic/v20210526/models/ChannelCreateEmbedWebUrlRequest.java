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
    * 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * WEB嵌入资源类型。
CREATE_SEAL: 创建印章
CREATE_TEMPLATE：创建模板
MODIFY_TEMPLATE：修改模板
PREVIEW_TEMPLATE：预览模板
PREVIEW_FLOW：预览合同文档
PREVIEW_FLOW_DETAIL：预览合同详情
PREVIEW_SEAL_LIST：预览印章列表
PREVIEW_SEAL_DETAIL：预览印章详情
EXTEND_SERVICE：扩展服务
    */
    @SerializedName("EmbedType")
    @Expose
    private String EmbedType;

    /**
    * WEB嵌入的业务资源ID
EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时必填，取值为模板id
PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时必填，取值为合同id
PREVIEW_SEAL_DETAIL，必填，取值为印章id
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
    * 渠道操作者信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。 
     * @return Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     * @param Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get WEB嵌入资源类型。
CREATE_SEAL: 创建印章
CREATE_TEMPLATE：创建模板
MODIFY_TEMPLATE：修改模板
PREVIEW_TEMPLATE：预览模板
PREVIEW_FLOW：预览合同文档
PREVIEW_FLOW_DETAIL：预览合同详情
PREVIEW_SEAL_LIST：预览印章列表
PREVIEW_SEAL_DETAIL：预览印章详情
EXTEND_SERVICE：扩展服务 
     * @return EmbedType WEB嵌入资源类型。
CREATE_SEAL: 创建印章
CREATE_TEMPLATE：创建模板
MODIFY_TEMPLATE：修改模板
PREVIEW_TEMPLATE：预览模板
PREVIEW_FLOW：预览合同文档
PREVIEW_FLOW_DETAIL：预览合同详情
PREVIEW_SEAL_LIST：预览印章列表
PREVIEW_SEAL_DETAIL：预览印章详情
EXTEND_SERVICE：扩展服务
     */
    public String getEmbedType() {
        return this.EmbedType;
    }

    /**
     * Set WEB嵌入资源类型。
CREATE_SEAL: 创建印章
CREATE_TEMPLATE：创建模板
MODIFY_TEMPLATE：修改模板
PREVIEW_TEMPLATE：预览模板
PREVIEW_FLOW：预览合同文档
PREVIEW_FLOW_DETAIL：预览合同详情
PREVIEW_SEAL_LIST：预览印章列表
PREVIEW_SEAL_DETAIL：预览印章详情
EXTEND_SERVICE：扩展服务
     * @param EmbedType WEB嵌入资源类型。
CREATE_SEAL: 创建印章
CREATE_TEMPLATE：创建模板
MODIFY_TEMPLATE：修改模板
PREVIEW_TEMPLATE：预览模板
PREVIEW_FLOW：预览合同文档
PREVIEW_FLOW_DETAIL：预览合同详情
PREVIEW_SEAL_LIST：预览印章列表
PREVIEW_SEAL_DETAIL：预览印章详情
EXTEND_SERVICE：扩展服务
     */
    public void setEmbedType(String EmbedType) {
        this.EmbedType = EmbedType;
    }

    /**
     * Get WEB嵌入的业务资源ID
EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时必填，取值为模板id
PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时必填，取值为合同id
PREVIEW_SEAL_DETAIL，必填，取值为印章id 
     * @return BusinessId WEB嵌入的业务资源ID
EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时必填，取值为模板id
PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时必填，取值为合同id
PREVIEW_SEAL_DETAIL，必填，取值为印章id
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set WEB嵌入的业务资源ID
EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时必填，取值为模板id
PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时必填，取值为合同id
PREVIEW_SEAL_DETAIL，必填，取值为印章id
     * @param BusinessId WEB嵌入的业务资源ID
EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时必填，取值为模板id
PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时必填，取值为合同id
PREVIEW_SEAL_DETAIL，必填，取值为印章id
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

    /**
     * Get 渠道操作者信息 
     * @return Operator 渠道操作者信息
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 渠道操作者信息
     * @param Operator 渠道操作者信息
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelCreateEmbedWebUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateEmbedWebUrlRequest(ChannelCreateEmbedWebUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.EmbedType != null) {
            this.EmbedType = new String(source.EmbedType);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.HiddenComponents != null) {
            this.HiddenComponents = new Boolean(source.HiddenComponents);
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
        this.setParamSimple(map, prefix + "EmbedType", this.EmbedType);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "HiddenComponents", this.HiddenComponents);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

