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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserFlowTypeRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 此接口下面信息必填。 <ul> <li>渠道应用标识: Agent.AppId</li> <li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li> <li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li> </ul> 第三方平台子客企业和员工必须已经经过实名认证	
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 搜索过滤的条件，本字段允许您通过指定模板 ID 或模板名称来进行查询。 <ul><li><strong>模板的用户合同类型</strong>：<strong>Key</strong>设置为 <code>user-flow-type-id</code> ，<strong>Values</strong>为您想要查询的用户模板类型id列表。</li></ul>	
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询绑定了模板的用户合同类型<ul><li>false（默认值），查询用户合同类型</li><li>true，查询绑定了模板的用户合同类型</li></ul>
    */
    @SerializedName("QueryBindTemplate")
    @Expose
    private Boolean QueryBindTemplate;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 此接口下面信息必填。 <ul> <li>渠道应用标识: Agent.AppId</li> <li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li> <li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li> </ul> 第三方平台子客企业和员工必须已经经过实名认证	 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 此接口下面信息必填。 <ul> <li>渠道应用标识: Agent.AppId</li> <li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li> <li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li> </ul> 第三方平台子客企业和员工必须已经经过实名认证	
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 此接口下面信息必填。 <ul> <li>渠道应用标识: Agent.AppId</li> <li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li> <li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li> </ul> 第三方平台子客企业和员工必须已经经过实名认证	
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 此接口下面信息必填。 <ul> <li>渠道应用标识: Agent.AppId</li> <li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li> <li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li> </ul> 第三方平台子客企业和员工必须已经经过实名认证	
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 搜索过滤的条件，本字段允许您通过指定模板 ID 或模板名称来进行查询。 <ul><li><strong>模板的用户合同类型</strong>：<strong>Key</strong>设置为 <code>user-flow-type-id</code> ，<strong>Values</strong>为您想要查询的用户模板类型id列表。</li></ul>	 
     * @return Filters 搜索过滤的条件，本字段允许您通过指定模板 ID 或模板名称来进行查询。 <ul><li><strong>模板的用户合同类型</strong>：<strong>Key</strong>设置为 <code>user-flow-type-id</code> ，<strong>Values</strong>为您想要查询的用户模板类型id列表。</li></ul>	
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 搜索过滤的条件，本字段允许您通过指定模板 ID 或模板名称来进行查询。 <ul><li><strong>模板的用户合同类型</strong>：<strong>Key</strong>设置为 <code>user-flow-type-id</code> ，<strong>Values</strong>为您想要查询的用户模板类型id列表。</li></ul>	
     * @param Filters 搜索过滤的条件，本字段允许您通过指定模板 ID 或模板名称来进行查询。 <ul><li><strong>模板的用户合同类型</strong>：<strong>Key</strong>设置为 <code>user-flow-type-id</code> ，<strong>Values</strong>为您想要查询的用户模板类型id列表。</li></ul>	
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询绑定了模板的用户合同类型<ul><li>false（默认值），查询用户合同类型</li><li>true，查询绑定了模板的用户合同类型</li></ul> 
     * @return QueryBindTemplate 查询绑定了模板的用户合同类型<ul><li>false（默认值），查询用户合同类型</li><li>true，查询绑定了模板的用户合同类型</li></ul>
     */
    public Boolean getQueryBindTemplate() {
        return this.QueryBindTemplate;
    }

    /**
     * Set 查询绑定了模板的用户合同类型<ul><li>false（默认值），查询用户合同类型</li><li>true，查询绑定了模板的用户合同类型</li></ul>
     * @param QueryBindTemplate 查询绑定了模板的用户合同类型<ul><li>false（默认值），查询用户合同类型</li><li>true，查询绑定了模板的用户合同类型</li></ul>
     */
    public void setQueryBindTemplate(Boolean QueryBindTemplate) {
        this.QueryBindTemplate = QueryBindTemplate;
    }

    public DescribeUserFlowTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserFlowTypeRequest(DescribeUserFlowTypeRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.QueryBindTemplate != null) {
            this.QueryBindTemplate = new Boolean(source.QueryBindTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "QueryBindTemplate", this.QueryBindTemplate);

    }
}

