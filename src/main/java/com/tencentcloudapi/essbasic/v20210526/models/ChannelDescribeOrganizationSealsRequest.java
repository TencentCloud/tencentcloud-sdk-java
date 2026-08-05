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

public class ChannelDescribeOrganizationSealsRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>指定分页每页返回的数据条数，单页最大支持 100。默认值为20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页查询偏移量，默认为0，最大为20000</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>查询授权用户信息类型，取值如下：</p><ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul>
    */
    @SerializedName("InfoType")
    @Expose
    private Long InfoType;

    /**
    * <p>印章id，是否查询特定的印章（没有输入返回所有）</p><p>注:  <code>没有输入返回所有记录，最大返回100条。</code></p>
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: 公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>LEGAL_PERSON_SEAL</strong>: 法定代表人章;</li><li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>: 员工执业章</li><li><strong>OTHER</strong>: 其他类型印章</li><li><strong>OTHER_XX</strong>: 其他印章子类型</li></ul>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p>
    */
    @SerializedName("SealTypes")
    @Expose
    private String [] SealTypes;

    /**
    * <p>需查询的印章状态列表。</p><ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul>
    */
    @SerializedName("SealStatuses")
    @Expose
    private String [] SealStatuses;

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
     * Get <p>指定分页每页返回的数据条数，单页最大支持 100。默认值为20</p> 
     * @return Limit <p>指定分页每页返回的数据条数，单页最大支持 100。默认值为20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定分页每页返回的数据条数，单页最大支持 100。默认值为20</p>
     * @param Limit <p>指定分页每页返回的数据条数，单页最大支持 100。默认值为20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页查询偏移量，默认为0，最大为20000</p> 
     * @return Offset <p>分页查询偏移量，默认为0，最大为20000</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询偏移量，默认为0，最大为20000</p>
     * @param Offset <p>分页查询偏移量，默认为0，最大为20000</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>查询授权用户信息类型，取值如下：</p><ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul> 
     * @return InfoType <p>查询授权用户信息类型，取值如下：</p><ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul>
     */
    public Long getInfoType() {
        return this.InfoType;
    }

    /**
     * Set <p>查询授权用户信息类型，取值如下：</p><ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul>
     * @param InfoType <p>查询授权用户信息类型，取值如下：</p><ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul>
     */
    public void setInfoType(Long InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get <p>印章id，是否查询特定的印章（没有输入返回所有）</p><p>注:  <code>没有输入返回所有记录，最大返回100条。</code></p> 
     * @return SealId <p>印章id，是否查询特定的印章（没有输入返回所有）</p><p>注:  <code>没有输入返回所有记录，最大返回100条。</code></p>
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set <p>印章id，是否查询特定的印章（没有输入返回所有）</p><p>注:  <code>没有输入返回所有记录，最大返回100条。</code></p>
     * @param SealId <p>印章id，是否查询特定的印章（没有输入返回所有）</p><p>注:  <code>没有输入返回所有记录，最大返回100条。</code></p>
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: 公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>LEGAL_PERSON_SEAL</strong>: 法定代表人章;</li><li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>: 员工执业章</li><li><strong>OTHER</strong>: 其他类型印章</li><li><strong>OTHER_XX</strong>: 其他印章子类型</li></ul>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p> 
     * @return SealTypes <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: 公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>LEGAL_PERSON_SEAL</strong>: 法定代表人章;</li><li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>: 员工执业章</li><li><strong>OTHER</strong>: 其他类型印章</li><li><strong>OTHER_XX</strong>: 其他印章子类型</li></ul>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p>
     */
    public String [] getSealTypes() {
        return this.SealTypes;
    }

    /**
     * Set <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: 公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>LEGAL_PERSON_SEAL</strong>: 法定代表人章;</li><li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>: 员工执业章</li><li><strong>OTHER</strong>: 其他类型印章</li><li><strong>OTHER_XX</strong>: 其他印章子类型</li></ul>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p>
     * @param SealTypes <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: 公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>LEGAL_PERSON_SEAL</strong>: 法定代表人章;</li><li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>: 员工执业章</li><li><strong>OTHER</strong>: 其他类型印章</li><li><strong>OTHER_XX</strong>: 其他印章子类型</li></ul>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p>
     */
    public void setSealTypes(String [] SealTypes) {
        this.SealTypes = SealTypes;
    }

    /**
     * Get <p>需查询的印章状态列表。</p><ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul> 
     * @return SealStatuses <p>需查询的印章状态列表。</p><ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul>
     */
    public String [] getSealStatuses() {
        return this.SealStatuses;
    }

    /**
     * Set <p>需查询的印章状态列表。</p><ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul>
     * @param SealStatuses <p>需查询的印章状态列表。</p><ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul>
     */
    public void setSealStatuses(String [] SealStatuses) {
        this.SealStatuses = SealStatuses;
    }

    public ChannelDescribeOrganizationSealsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeOrganizationSealsRequest(ChannelDescribeOrganizationSealsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InfoType != null) {
            this.InfoType = new Long(source.InfoType);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.SealTypes != null) {
            this.SealTypes = new String[source.SealTypes.length];
            for (int i = 0; i < source.SealTypes.length; i++) {
                this.SealTypes[i] = new String(source.SealTypes[i]);
            }
        }
        if (source.SealStatuses != null) {
            this.SealStatuses = new String[source.SealStatuses.length];
            for (int i = 0; i < source.SealStatuses.length; i++) {
                this.SealStatuses[i] = new String(source.SealStatuses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamArraySimple(map, prefix + "SealTypes.", this.SealTypes);
        this.setParamArraySimple(map, prefix + "SealStatuses.", this.SealStatuses);

    }
}

