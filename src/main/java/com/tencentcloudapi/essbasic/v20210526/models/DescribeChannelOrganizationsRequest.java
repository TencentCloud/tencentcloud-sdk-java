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

public class DescribeChannelOrganizationsRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><p>渠道应用标识: Agent.AppId<br>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId<br>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</p><p>第三方平台子客企业和员工必须已经经过实名认证</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>指定分页每页返回的数据条数，单页最大支持 200。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>该字段是指第三方平台子客企业的唯一标识，用于查询单独某个子客的企业数据。</p><p><strong>注</strong>：<code>如果需要批量查询本应用下的所有企业的信息，则该字段不需要赋值</code></p>
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * <p>可以按照当前企业的认证状态进行过滤。可值如下：</p><ul><li>**"UNVERIFIED"**： 未认证的企业</li>  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>  <li>**"VERIFYING"**： 认证进行中的企业</li>  <li>**"VERIFIED"**： 已认证完成的企业</li></ul>
    */
    @SerializedName("AuthorizationStatusList")
    @Expose
    private String [] AuthorizationStatusList;

    /**
    * <p>偏移量:从 0 开始，最大20000。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><p>渠道应用标识: Agent.AppId<br>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId<br>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</p><p>第三方平台子客企业和员工必须已经经过实名认证</p> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><p>渠道应用标识: Agent.AppId<br>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId<br>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</p><p>第三方平台子客企业和员工必须已经经过实名认证</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><p>渠道应用标识: Agent.AppId<br>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId<br>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</p><p>第三方平台子客企业和员工必须已经经过实名认证</p>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><p>渠道应用标识: Agent.AppId<br>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId<br>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</p><p>第三方平台子客企业和员工必须已经经过实名认证</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>指定分页每页返回的数据条数，单页最大支持 200。</p> 
     * @return Limit <p>指定分页每页返回的数据条数，单页最大支持 200。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定分页每页返回的数据条数，单页最大支持 200。</p>
     * @param Limit <p>指定分页每页返回的数据条数，单页最大支持 200。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>该字段是指第三方平台子客企业的唯一标识，用于查询单独某个子客的企业数据。</p><p><strong>注</strong>：<code>如果需要批量查询本应用下的所有企业的信息，则该字段不需要赋值</code></p> 
     * @return OrganizationOpenId <p>该字段是指第三方平台子客企业的唯一标识，用于查询单独某个子客的企业数据。</p><p><strong>注</strong>：<code>如果需要批量查询本应用下的所有企业的信息，则该字段不需要赋值</code></p>
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set <p>该字段是指第三方平台子客企业的唯一标识，用于查询单独某个子客的企业数据。</p><p><strong>注</strong>：<code>如果需要批量查询本应用下的所有企业的信息，则该字段不需要赋值</code></p>
     * @param OrganizationOpenId <p>该字段是指第三方平台子客企业的唯一标识，用于查询单独某个子客的企业数据。</p><p><strong>注</strong>：<code>如果需要批量查询本应用下的所有企业的信息，则该字段不需要赋值</code></p>
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get <p>可以按照当前企业的认证状态进行过滤。可值如下：</p><ul><li>**"UNVERIFIED"**： 未认证的企业</li>  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>  <li>**"VERIFYING"**： 认证进行中的企业</li>  <li>**"VERIFIED"**： 已认证完成的企业</li></ul> 
     * @return AuthorizationStatusList <p>可以按照当前企业的认证状态进行过滤。可值如下：</p><ul><li>**"UNVERIFIED"**： 未认证的企业</li>  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>  <li>**"VERIFYING"**： 认证进行中的企业</li>  <li>**"VERIFIED"**： 已认证完成的企业</li></ul>
     */
    public String [] getAuthorizationStatusList() {
        return this.AuthorizationStatusList;
    }

    /**
     * Set <p>可以按照当前企业的认证状态进行过滤。可值如下：</p><ul><li>**"UNVERIFIED"**： 未认证的企业</li>  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>  <li>**"VERIFYING"**： 认证进行中的企业</li>  <li>**"VERIFIED"**： 已认证完成的企业</li></ul>
     * @param AuthorizationStatusList <p>可以按照当前企业的认证状态进行过滤。可值如下：</p><ul><li>**"UNVERIFIED"**： 未认证的企业</li>  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>  <li>**"VERIFYING"**： 认证进行中的企业</li>  <li>**"VERIFIED"**： 已认证完成的企业</li></ul>
     */
    public void setAuthorizationStatusList(String [] AuthorizationStatusList) {
        this.AuthorizationStatusList = AuthorizationStatusList;
    }

    /**
     * Get <p>偏移量:从 0 开始，最大20000。</p> 
     * @return Offset <p>偏移量:从 0 开始，最大20000。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量:从 0 开始，最大20000。</p>
     * @param Offset <p>偏移量:从 0 开始，最大20000。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeChannelOrganizationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChannelOrganizationsRequest(DescribeChannelOrganizationsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.AuthorizationStatusList != null) {
            this.AuthorizationStatusList = new String[source.AuthorizationStatusList.length];
            for (int i = 0; i < source.AuthorizationStatusList.length; i++) {
                this.AuthorizationStatusList[i] = new String(source.AuthorizationStatusList[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamArraySimple(map, prefix + "AuthorizationStatusList.", this.AuthorizationStatusList);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

