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
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 指定分页每页返回的数据条数，单页最大支持 100。默认值为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页查询偏移量，默认为0，最大为20000
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询授权用户信息类型，取值如下：

<ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul>
    */
    @SerializedName("InfoType")
    @Expose
    private Long InfoType;

    /**
    * 印章id，是否查询特定的印章（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。`
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 电子印章类型 , 可选类型如下: <ul><li>**OFFICIAL**: 公章</li><li>**CONTRACT**: 合同专用章;</li><li>**FINANCE**: 财务专用章;</li><li>**PERSONNEL**: 人事专用章</li><li>**INVOICE**: 发票专用章</li><li>**LEGAL_PERSON_SEAL**: 法定代表人章;</li><li>**EMPLOYEE_QUALIFICATION_SEAL**: 员工执业章</li><li>**OTHER**: 其他类型印章</li></ul>注:  `1.为空时查询所有类型的印章。`
    */
    @SerializedName("SealTypes")
    @Expose
    private String [] SealTypes;

    /**
    * 
需查询的印章状态列表。

<ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul>
    */
    @SerializedName("SealStatuses")
    @Expose
    private String [] SealStatuses;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 指定分页每页返回的数据条数，单页最大支持 100。默认值为20 
     * @return Limit 指定分页每页返回的数据条数，单页最大支持 100。默认值为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定分页每页返回的数据条数，单页最大支持 100。默认值为20
     * @param Limit 指定分页每页返回的数据条数，单页最大支持 100。默认值为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页查询偏移量，默认为0，最大为20000 
     * @return Offset 分页查询偏移量，默认为0，最大为20000
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为0，最大为20000
     * @param Offset 分页查询偏移量，默认为0，最大为20000
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询授权用户信息类型，取值如下：

<ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul> 
     * @return InfoType 查询授权用户信息类型，取值如下：

<ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul>
     */
    public Long getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 查询授权用户信息类型，取值如下：

<ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul>
     * @param InfoType 查询授权用户信息类型，取值如下：

<ul> <li><b>0</b>：（默认）不返回授权用户信息</li> <li><b>1</b>：返回授权用户的信息</li> </ul>
     */
    public void setInfoType(Long InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 印章id，是否查询特定的印章（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。` 
     * @return SealId 印章id，是否查询特定的印章（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。`
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章id，是否查询特定的印章（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。`
     * @param SealId 印章id，是否查询特定的印章（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。`
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 电子印章类型 , 可选类型如下: <ul><li>**OFFICIAL**: 公章</li><li>**CONTRACT**: 合同专用章;</li><li>**FINANCE**: 财务专用章;</li><li>**PERSONNEL**: 人事专用章</li><li>**INVOICE**: 发票专用章</li><li>**LEGAL_PERSON_SEAL**: 法定代表人章;</li><li>**EMPLOYEE_QUALIFICATION_SEAL**: 员工执业章</li><li>**OTHER**: 其他类型印章</li></ul>注:  `1.为空时查询所有类型的印章。` 
     * @return SealTypes 电子印章类型 , 可选类型如下: <ul><li>**OFFICIAL**: 公章</li><li>**CONTRACT**: 合同专用章;</li><li>**FINANCE**: 财务专用章;</li><li>**PERSONNEL**: 人事专用章</li><li>**INVOICE**: 发票专用章</li><li>**LEGAL_PERSON_SEAL**: 法定代表人章;</li><li>**EMPLOYEE_QUALIFICATION_SEAL**: 员工执业章</li><li>**OTHER**: 其他类型印章</li></ul>注:  `1.为空时查询所有类型的印章。`
     */
    public String [] getSealTypes() {
        return this.SealTypes;
    }

    /**
     * Set 电子印章类型 , 可选类型如下: <ul><li>**OFFICIAL**: 公章</li><li>**CONTRACT**: 合同专用章;</li><li>**FINANCE**: 财务专用章;</li><li>**PERSONNEL**: 人事专用章</li><li>**INVOICE**: 发票专用章</li><li>**LEGAL_PERSON_SEAL**: 法定代表人章;</li><li>**EMPLOYEE_QUALIFICATION_SEAL**: 员工执业章</li><li>**OTHER**: 其他类型印章</li></ul>注:  `1.为空时查询所有类型的印章。`
     * @param SealTypes 电子印章类型 , 可选类型如下: <ul><li>**OFFICIAL**: 公章</li><li>**CONTRACT**: 合同专用章;</li><li>**FINANCE**: 财务专用章;</li><li>**PERSONNEL**: 人事专用章</li><li>**INVOICE**: 发票专用章</li><li>**LEGAL_PERSON_SEAL**: 法定代表人章;</li><li>**EMPLOYEE_QUALIFICATION_SEAL**: 员工执业章</li><li>**OTHER**: 其他类型印章</li></ul>注:  `1.为空时查询所有类型的印章。`
     */
    public void setSealTypes(String [] SealTypes) {
        this.SealTypes = SealTypes;
    }

    /**
     * Get 
需查询的印章状态列表。

<ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul> 
     * @return SealStatuses 
需查询的印章状态列表。

<ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul>
     */
    public String [] getSealStatuses() {
        return this.SealStatuses;
    }

    /**
     * Set 
需查询的印章状态列表。

<ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul>
     * @param SealStatuses 
需查询的印章状态列表。

<ul> <li>空，()仅查询启用状态的印章；</li> <li><strong>ALL</strong>，查询所有状态的印章；</li> <li><strong>CHECKING</strong>，查询待审核的印章；</li> <li><strong>SUCCESS</strong>，查询启用状态的印章；</li> <li><strong>FAIL</strong>，查询印章审核拒绝的印章；</li> <li><strong>DISABLE</strong>，查询已停用的印章；</li> <li><strong>STOPPED</strong>，查询已终止的印章；</li> <li><strong>VOID</strong>，查询已作废的印章；</li> <li><strong>INVALID</strong>，查询已失效的印章。</li> </ul>
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

