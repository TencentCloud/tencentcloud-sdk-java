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
    * 要生成WEB嵌入界面的类型, 可以选择的值如下: 

- CREATE_SEAL: 生成创建印章的嵌入页面
- CREATE_TEMPLATE：生成创建模板的嵌入页面
- MODIFY_TEMPLATE：生成修改模板的嵌入页面
- PREVIEW_TEMPLATE：生成预览模板的嵌入页面
- PREVIEW_FLOW：生成预览合同文档的嵌入页面
- PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面
- PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
- PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
- EXTEND_SERVICE：生成扩展服务的嵌入页面
    */
    @SerializedName("EmbedType")
    @Expose
    private String EmbedType;

    /**
    * WEB嵌入的业务资源ID

- 当EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时需要填写模板id作为BusinessId
- 当EmbedType取值PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时需要填写合同id作为BusinessId
- 当EmbedType取值PREVIEW_SEAL_DETAIL需要填写印章id作为BusinessId
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
     * Get 要生成WEB嵌入界面的类型, 可以选择的值如下: 

- CREATE_SEAL: 生成创建印章的嵌入页面
- CREATE_TEMPLATE：生成创建模板的嵌入页面
- MODIFY_TEMPLATE：生成修改模板的嵌入页面
- PREVIEW_TEMPLATE：生成预览模板的嵌入页面
- PREVIEW_FLOW：生成预览合同文档的嵌入页面
- PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面
- PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
- PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
- EXTEND_SERVICE：生成扩展服务的嵌入页面 
     * @return EmbedType 要生成WEB嵌入界面的类型, 可以选择的值如下: 

- CREATE_SEAL: 生成创建印章的嵌入页面
- CREATE_TEMPLATE：生成创建模板的嵌入页面
- MODIFY_TEMPLATE：生成修改模板的嵌入页面
- PREVIEW_TEMPLATE：生成预览模板的嵌入页面
- PREVIEW_FLOW：生成预览合同文档的嵌入页面
- PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面
- PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
- PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
- EXTEND_SERVICE：生成扩展服务的嵌入页面
     */
    public String getEmbedType() {
        return this.EmbedType;
    }

    /**
     * Set 要生成WEB嵌入界面的类型, 可以选择的值如下: 

- CREATE_SEAL: 生成创建印章的嵌入页面
- CREATE_TEMPLATE：生成创建模板的嵌入页面
- MODIFY_TEMPLATE：生成修改模板的嵌入页面
- PREVIEW_TEMPLATE：生成预览模板的嵌入页面
- PREVIEW_FLOW：生成预览合同文档的嵌入页面
- PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面
- PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
- PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
- EXTEND_SERVICE：生成扩展服务的嵌入页面
     * @param EmbedType 要生成WEB嵌入界面的类型, 可以选择的值如下: 

- CREATE_SEAL: 生成创建印章的嵌入页面
- CREATE_TEMPLATE：生成创建模板的嵌入页面
- MODIFY_TEMPLATE：生成修改模板的嵌入页面
- PREVIEW_TEMPLATE：生成预览模板的嵌入页面
- PREVIEW_FLOW：生成预览合同文档的嵌入页面
- PREVIEW_FLOW_DETAIL：生成预览合同详情的嵌入页面
- PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
- PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
- EXTEND_SERVICE：生成扩展服务的嵌入页面
     */
    public void setEmbedType(String EmbedType) {
        this.EmbedType = EmbedType;
    }

    /**
     * Get WEB嵌入的业务资源ID

- 当EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时需要填写模板id作为BusinessId
- 当EmbedType取值PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时需要填写合同id作为BusinessId
- 当EmbedType取值PREVIEW_SEAL_DETAIL需要填写印章id作为BusinessId 
     * @return BusinessId WEB嵌入的业务资源ID

- 当EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时需要填写模板id作为BusinessId
- 当EmbedType取值PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时需要填写合同id作为BusinessId
- 当EmbedType取值PREVIEW_SEAL_DETAIL需要填写印章id作为BusinessId
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set WEB嵌入的业务资源ID

- 当EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时需要填写模板id作为BusinessId
- 当EmbedType取值PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时需要填写合同id作为BusinessId
- 当EmbedType取值PREVIEW_SEAL_DETAIL需要填写印章id作为BusinessId
     * @param BusinessId WEB嵌入的业务资源ID

- 当EmbedType取值MODIFY_TEMPLATE，PREVIEW_TEMPLATE时需要填写模板id作为BusinessId
- 当EmbedType取值PREVIEW_FLOW，PREVIEW_FLOW_DETAIL时需要填写合同id作为BusinessId
- 当EmbedType取值PREVIEW_SEAL_DETAIL需要填写印章id作为BusinessId
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

