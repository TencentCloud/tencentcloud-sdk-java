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

public class DescribeExtendedServiceAuthDetailRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>要查询的扩展服务类型。<br>如下所示：</p><ul><li>OPEN_SERVER_SIGN：企业静默签署</li><li>BATCH_SIGN：批量签署</li></ul>
    */
    @SerializedName("ExtendServiceType")
    @Expose
    private String ExtendServiceType;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

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
    * <p>查询指定的合作方企业的授权信息，当ExtendServiceType=OPEN_SERVER_SIGN：企业静默签署时有效</p>
    */
    @SerializedName("PartnerOrganizationName")
    @Expose
    private String PartnerOrganizationName;

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
     * Get <p>要查询的扩展服务类型。<br>如下所示：</p><ul><li>OPEN_SERVER_SIGN：企业静默签署</li><li>BATCH_SIGN：批量签署</li></ul> 
     * @return ExtendServiceType <p>要查询的扩展服务类型。<br>如下所示：</p><ul><li>OPEN_SERVER_SIGN：企业静默签署</li><li>BATCH_SIGN：批量签署</li></ul>
     */
    public String getExtendServiceType() {
        return this.ExtendServiceType;
    }

    /**
     * Set <p>要查询的扩展服务类型。<br>如下所示：</p><ul><li>OPEN_SERVER_SIGN：企业静默签署</li><li>BATCH_SIGN：批量签署</li></ul>
     * @param ExtendServiceType <p>要查询的扩展服务类型。<br>如下所示：</p><ul><li>OPEN_SERVER_SIGN：企业静默签署</li><li>BATCH_SIGN：批量签署</li></ul>
     */
    public void setExtendServiceType(String ExtendServiceType) {
        this.ExtendServiceType = ExtendServiceType;
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

    /**
     * Get <p>查询指定的合作方企业的授权信息，当ExtendServiceType=OPEN_SERVER_SIGN：企业静默签署时有效</p> 
     * @return PartnerOrganizationName <p>查询指定的合作方企业的授权信息，当ExtendServiceType=OPEN_SERVER_SIGN：企业静默签署时有效</p>
     */
    public String getPartnerOrganizationName() {
        return this.PartnerOrganizationName;
    }

    /**
     * Set <p>查询指定的合作方企业的授权信息，当ExtendServiceType=OPEN_SERVER_SIGN：企业静默签署时有效</p>
     * @param PartnerOrganizationName <p>查询指定的合作方企业的授权信息，当ExtendServiceType=OPEN_SERVER_SIGN：企业静默签署时有效</p>
     */
    public void setPartnerOrganizationName(String PartnerOrganizationName) {
        this.PartnerOrganizationName = PartnerOrganizationName;
    }

    public DescribeExtendedServiceAuthDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExtendedServiceAuthDetailRequest(DescribeExtendedServiceAuthDetailRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ExtendServiceType != null) {
            this.ExtendServiceType = new String(source.ExtendServiceType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.PartnerOrganizationName != null) {
            this.PartnerOrganizationName = new String(source.PartnerOrganizationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ExtendServiceType", this.ExtendServiceType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "PartnerOrganizationName", this.PartnerOrganizationName);

    }
}

