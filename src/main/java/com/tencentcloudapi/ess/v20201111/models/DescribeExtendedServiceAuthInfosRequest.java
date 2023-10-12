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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExtendedServiceAuthInfosRequest extends AbstractModel{

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 要查询的扩展服务类型。
默认为空，即查询当前支持的所有扩展服务信息。
若需查询单个扩展服务的开通情况，请传递相应的值，如下所示：
<ul><li>OPEN_SERVER_SIGN：企业静默签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>MOBILE_CHECK_APPROVER：使用手机号验证签署方身份</li>
<li>PAGING_SEAL：骑缝章</li>
<li>BATCH_SIGN：批量签署</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li></ul>

    */
    @SerializedName("ExtendServiceType")
    @Expose
    private String ExtendServiceType;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 要查询的扩展服务类型。
默认为空，即查询当前支持的所有扩展服务信息。
若需查询单个扩展服务的开通情况，请传递相应的值，如下所示：
<ul><li>OPEN_SERVER_SIGN：企业静默签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>MOBILE_CHECK_APPROVER：使用手机号验证签署方身份</li>
<li>PAGING_SEAL：骑缝章</li>
<li>BATCH_SIGN：批量签署</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li></ul>
 
     * @return ExtendServiceType 要查询的扩展服务类型。
默认为空，即查询当前支持的所有扩展服务信息。
若需查询单个扩展服务的开通情况，请传递相应的值，如下所示：
<ul><li>OPEN_SERVER_SIGN：企业静默签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>MOBILE_CHECK_APPROVER：使用手机号验证签署方身份</li>
<li>PAGING_SEAL：骑缝章</li>
<li>BATCH_SIGN：批量签署</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li></ul>

     */
    public String getExtendServiceType() {
        return this.ExtendServiceType;
    }

    /**
     * Set 要查询的扩展服务类型。
默认为空，即查询当前支持的所有扩展服务信息。
若需查询单个扩展服务的开通情况，请传递相应的值，如下所示：
<ul><li>OPEN_SERVER_SIGN：企业静默签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>MOBILE_CHECK_APPROVER：使用手机号验证签署方身份</li>
<li>PAGING_SEAL：骑缝章</li>
<li>BATCH_SIGN：批量签署</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li></ul>

     * @param ExtendServiceType 要查询的扩展服务类型。
默认为空，即查询当前支持的所有扩展服务信息。
若需查询单个扩展服务的开通情况，请传递相应的值，如下所示：
<ul><li>OPEN_SERVER_SIGN：企业静默签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>MOBILE_CHECK_APPROVER：使用手机号验证签署方身份</li>
<li>PAGING_SEAL：骑缝章</li>
<li>BATCH_SIGN：批量签署</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li></ul>

     */
    public void setExtendServiceType(String ExtendServiceType) {
        this.ExtendServiceType = ExtendServiceType;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public DescribeExtendedServiceAuthInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExtendedServiceAuthInfosRequest(DescribeExtendedServiceAuthInfosRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ExtendServiceType != null) {
            this.ExtendServiceType = new String(source.ExtendServiceType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ExtendServiceType", this.ExtendServiceType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

