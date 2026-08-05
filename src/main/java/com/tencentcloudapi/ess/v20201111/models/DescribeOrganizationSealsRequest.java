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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationSealsRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 200。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 20000。</p>
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
    * <p>印章id，是否查询特定的印章（没有输入返回所有）</p>
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * <p>印章种类列表（均为组织机构印章）。 若无特定需求，将展示所有类型的印章。 目前支持以下几种：<ul> <li><strong>OFFICIAL</strong>：企业公章；</li> <li><strong>CONTRACT</strong>：合同专用章；</li> <li><strong>FINANCE</strong>：财务专用章；</li> <li><strong>PERSONNEL</strong>：人事专用章；</li><li><strong>INVOICE</strong>：发票专用章；</li><li><strong>LEGAL_PERSON_SEAL</strong>：法定代表人章。</li> <li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>：员工执业章。</li><li><strong>OTHER</strong>其他类型印章</li> <li><strong>OTHER_xx</strong>其他印章子类型</li> </ul><br>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p>
    */
    @SerializedName("SealTypes")
    @Expose
    private String [] SealTypes;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>需查询的印章状态列表。</p><ul><li>空：（默认）仅查询启用状态的印章；</li><li><strong>ALL</strong>：查询所有状态的印章；</li><li><strong>CHECKING</strong>：查询待审核的印章；</li><li><strong>SUCCESS</strong>：查询启用状态的印章；</li><li><strong>FAIL</strong>：查询印章审核拒绝的印章；</li><li><strong>DISABLE</strong>：查询已停用的印章；</li><li><strong>STOPPED</strong>：查询已终止的印章；</li><li><strong>VOID</strong>：查询已作废的印章；</li><li><strong>INVALID</strong>：查询已失效的印章。</li></ul>
    */
    @SerializedName("SealStatuses")
    @Expose
    private String [] SealStatuses;

    /**
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 200。</p> 
     * @return Limit <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 200。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 200。</p>
     * @param Limit <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 200。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 20000。</p> 
     * @return Offset <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 20000。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 20000。</p>
     * @param Offset <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 20000。</p>
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
     * Get <p>印章id，是否查询特定的印章（没有输入返回所有）</p> 
     * @return SealId <p>印章id，是否查询特定的印章（没有输入返回所有）</p>
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set <p>印章id，是否查询特定的印章（没有输入返回所有）</p>
     * @param SealId <p>印章id，是否查询特定的印章（没有输入返回所有）</p>
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get <p>印章种类列表（均为组织机构印章）。 若无特定需求，将展示所有类型的印章。 目前支持以下几种：<ul> <li><strong>OFFICIAL</strong>：企业公章；</li> <li><strong>CONTRACT</strong>：合同专用章；</li> <li><strong>FINANCE</strong>：财务专用章；</li> <li><strong>PERSONNEL</strong>：人事专用章；</li><li><strong>INVOICE</strong>：发票专用章；</li><li><strong>LEGAL_PERSON_SEAL</strong>：法定代表人章。</li> <li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>：员工执业章。</li><li><strong>OTHER</strong>其他类型印章</li> <li><strong>OTHER_xx</strong>其他印章子类型</li> </ul><br>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p> 
     * @return SealTypes <p>印章种类列表（均为组织机构印章）。 若无特定需求，将展示所有类型的印章。 目前支持以下几种：<ul> <li><strong>OFFICIAL</strong>：企业公章；</li> <li><strong>CONTRACT</strong>：合同专用章；</li> <li><strong>FINANCE</strong>：财务专用章；</li> <li><strong>PERSONNEL</strong>：人事专用章；</li><li><strong>INVOICE</strong>：发票专用章；</li><li><strong>LEGAL_PERSON_SEAL</strong>：法定代表人章。</li> <li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>：员工执业章。</li><li><strong>OTHER</strong>其他类型印章</li> <li><strong>OTHER_xx</strong>其他印章子类型</li> </ul><br>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p>
     */
    public String [] getSealTypes() {
        return this.SealTypes;
    }

    /**
     * Set <p>印章种类列表（均为组织机构印章）。 若无特定需求，将展示所有类型的印章。 目前支持以下几种：<ul> <li><strong>OFFICIAL</strong>：企业公章；</li> <li><strong>CONTRACT</strong>：合同专用章；</li> <li><strong>FINANCE</strong>：财务专用章；</li> <li><strong>PERSONNEL</strong>：人事专用章；</li><li><strong>INVOICE</strong>：发票专用章；</li><li><strong>LEGAL_PERSON_SEAL</strong>：法定代表人章。</li> <li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>：员工执业章。</li><li><strong>OTHER</strong>其他类型印章</li> <li><strong>OTHER_xx</strong>其他印章子类型</li> </ul><br>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p>
     * @param SealTypes <p>印章种类列表（均为组织机构印章）。 若无特定需求，将展示所有类型的印章。 目前支持以下几种：<ul> <li><strong>OFFICIAL</strong>：企业公章；</li> <li><strong>CONTRACT</strong>：合同专用章；</li> <li><strong>FINANCE</strong>：财务专用章；</li> <li><strong>PERSONNEL</strong>：人事专用章；</li><li><strong>INVOICE</strong>：发票专用章；</li><li><strong>LEGAL_PERSON_SEAL</strong>：法定代表人章。</li> <li><strong>EMPLOYEE_QUALIFICATION_SEAL</strong>：员工执业章。</li><li><strong>OTHER</strong>其他类型印章</li> <li><strong>OTHER_xx</strong>其他印章子类型</li> </ul><br>注:  <code>1.为空时查询所有类型的印章。</code><br>注:  <code>2.OTHER_XX该类型为其他印章子类型，如需使用，请联系对接客服申请开通。具体可传入的子类型值，需在申请开通后由客服提供。</code></p>
     */
    public void setSealTypes(String [] SealTypes) {
        this.SealTypes = SealTypes;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>需查询的印章状态列表。</p><ul><li>空：（默认）仅查询启用状态的印章；</li><li><strong>ALL</strong>：查询所有状态的印章；</li><li><strong>CHECKING</strong>：查询待审核的印章；</li><li><strong>SUCCESS</strong>：查询启用状态的印章；</li><li><strong>FAIL</strong>：查询印章审核拒绝的印章；</li><li><strong>DISABLE</strong>：查询已停用的印章；</li><li><strong>STOPPED</strong>：查询已终止的印章；</li><li><strong>VOID</strong>：查询已作废的印章；</li><li><strong>INVALID</strong>：查询已失效的印章。</li></ul> 
     * @return SealStatuses <p>需查询的印章状态列表。</p><ul><li>空：（默认）仅查询启用状态的印章；</li><li><strong>ALL</strong>：查询所有状态的印章；</li><li><strong>CHECKING</strong>：查询待审核的印章；</li><li><strong>SUCCESS</strong>：查询启用状态的印章；</li><li><strong>FAIL</strong>：查询印章审核拒绝的印章；</li><li><strong>DISABLE</strong>：查询已停用的印章；</li><li><strong>STOPPED</strong>：查询已终止的印章；</li><li><strong>VOID</strong>：查询已作废的印章；</li><li><strong>INVALID</strong>：查询已失效的印章。</li></ul>
     */
    public String [] getSealStatuses() {
        return this.SealStatuses;
    }

    /**
     * Set <p>需查询的印章状态列表。</p><ul><li>空：（默认）仅查询启用状态的印章；</li><li><strong>ALL</strong>：查询所有状态的印章；</li><li><strong>CHECKING</strong>：查询待审核的印章；</li><li><strong>SUCCESS</strong>：查询启用状态的印章；</li><li><strong>FAIL</strong>：查询印章审核拒绝的印章；</li><li><strong>DISABLE</strong>：查询已停用的印章；</li><li><strong>STOPPED</strong>：查询已终止的印章；</li><li><strong>VOID</strong>：查询已作废的印章；</li><li><strong>INVALID</strong>：查询已失效的印章。</li></ul>
     * @param SealStatuses <p>需查询的印章状态列表。</p><ul><li>空：（默认）仅查询启用状态的印章；</li><li><strong>ALL</strong>：查询所有状态的印章；</li><li><strong>CHECKING</strong>：查询待审核的印章；</li><li><strong>SUCCESS</strong>：查询启用状态的印章；</li><li><strong>FAIL</strong>：查询印章审核拒绝的印章；</li><li><strong>DISABLE</strong>：查询已停用的印章；</li><li><strong>STOPPED</strong>：查询已终止的印章；</li><li><strong>VOID</strong>：查询已作废的印章；</li><li><strong>INVALID</strong>：查询已失效的印章。</li></ul>
     */
    public void setSealStatuses(String [] SealStatuses) {
        this.SealStatuses = SealStatuses;
    }

    public DescribeOrganizationSealsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationSealsRequest(DescribeOrganizationSealsRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
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
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
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
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamArraySimple(map, prefix + "SealTypes.", this.SealTypes);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "SealStatuses.", this.SealStatuses);

    }
}

