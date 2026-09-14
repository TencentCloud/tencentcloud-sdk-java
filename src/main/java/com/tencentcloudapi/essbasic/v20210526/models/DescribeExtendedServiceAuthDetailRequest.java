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

public class DescribeExtendedServiceAuthDetailRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>要查询的扩展服务类型。<br>如下所示：</p><p>枚举值：</p><ul><li>AUTO_SIGN： 企业授权签署</li><li>BATCH_SIGN： 批量签署</li></ul>
    */
    @SerializedName("ExtendServiceType")
    @Expose
    private String ExtendServiceType;

    /**
    * <p>指定每页返回的数据条数，和Offset参数配合使用。 注：<code>1.默认值为20，单页做大值为200。</code></p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。 注：<code>1.offset从0开始，即第一页为0。</code> <code>2.默认从第一页返回。</code></p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>要查询的扩展服务类型。<br>如下所示：</p><p>枚举值：</p><ul><li>AUTO_SIGN： 企业授权签署</li><li>BATCH_SIGN： 批量签署</li></ul> 
     * @return ExtendServiceType <p>要查询的扩展服务类型。<br>如下所示：</p><p>枚举值：</p><ul><li>AUTO_SIGN： 企业授权签署</li><li>BATCH_SIGN： 批量签署</li></ul>
     */
    public String getExtendServiceType() {
        return this.ExtendServiceType;
    }

    /**
     * Set <p>要查询的扩展服务类型。<br>如下所示：</p><p>枚举值：</p><ul><li>AUTO_SIGN： 企业授权签署</li><li>BATCH_SIGN： 批量签署</li></ul>
     * @param ExtendServiceType <p>要查询的扩展服务类型。<br>如下所示：</p><p>枚举值：</p><ul><li>AUTO_SIGN： 企业授权签署</li><li>BATCH_SIGN： 批量签署</li></ul>
     */
    public void setExtendServiceType(String ExtendServiceType) {
        this.ExtendServiceType = ExtendServiceType;
    }

    /**
     * Get <p>指定每页返回的数据条数，和Offset参数配合使用。 注：<code>1.默认值为20，单页做大值为200。</code></p> 
     * @return Limit <p>指定每页返回的数据条数，和Offset参数配合使用。 注：<code>1.默认值为20，单页做大值为200。</code></p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定每页返回的数据条数，和Offset参数配合使用。 注：<code>1.默认值为20，单页做大值为200。</code></p>
     * @param Limit <p>指定每页返回的数据条数，和Offset参数配合使用。 注：<code>1.默认值为20，单页做大值为200。</code></p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。 注：<code>1.offset从0开始，即第一页为0。</code> <code>2.默认从第一页返回。</code></p> 
     * @return Offset <p>查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。 注：<code>1.offset从0开始，即第一页为0。</code> <code>2.默认从第一页返回。</code></p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。 注：<code>1.offset从0开始，即第一页为0。</code> <code>2.默认从第一页返回。</code></p>
     * @param Offset <p>查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。 注：<code>1.offset从0开始，即第一页为0。</code> <code>2.默认从第一页返回。</code></p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeExtendedServiceAuthDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExtendedServiceAuthDetailRequest(DescribeExtendedServiceAuthDetailRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ExtendServiceType != null) {
            this.ExtendServiceType = new String(source.ExtendServiceType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "ExtendServiceType", this.ExtendServiceType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

