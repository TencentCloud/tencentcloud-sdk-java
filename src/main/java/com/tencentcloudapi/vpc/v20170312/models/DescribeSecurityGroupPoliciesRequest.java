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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupPoliciesRequest extends AbstractModel{

    /**
    * 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 过滤条件,不支持同时指定SecurityGroupId和Filters参数。
<li>security-group-id - String - 安全组ID。</li>
<li>ip - String - IP，支持IPV4和IPV6模糊匹配。</li>
<li>address-module - String - IP地址模板或IP地址组模板ID。</li>
<li>service-module - String - 协议端口模板或协议端口组模板ID。</li>
<li>protocol-type - String - 安全组策略支持的协议，可选值：`TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`。</li>
<li>port - String - 是否必填：否 -协议端口，支持模糊匹配，值为`ALL`时，查询所有的端口。</li>
<li>poly - String - 协议策略，可选值：`ALL`，所有策略；`ACCEPT`，允许；`DROP`，拒绝。</li>
<li>direction - String - 协议规则，可选值：`ALL`，所有策略；`INBOUND`，入站规则；`OUTBOUND`，出站规则。</li>
<li>description - String - 协议描述，该过滤条件支持模糊匹配。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。 
     * @return SecurityGroupId 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     * @param SecurityGroupId 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 过滤条件,不支持同时指定SecurityGroupId和Filters参数。
<li>security-group-id - String - 安全组ID。</li>
<li>ip - String - IP，支持IPV4和IPV6模糊匹配。</li>
<li>address-module - String - IP地址模板或IP地址组模板ID。</li>
<li>service-module - String - 协议端口模板或协议端口组模板ID。</li>
<li>protocol-type - String - 安全组策略支持的协议，可选值：`TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`。</li>
<li>port - String - 是否必填：否 -协议端口，支持模糊匹配，值为`ALL`时，查询所有的端口。</li>
<li>poly - String - 协议策略，可选值：`ALL`，所有策略；`ACCEPT`，允许；`DROP`，拒绝。</li>
<li>direction - String - 协议规则，可选值：`ALL`，所有策略；`INBOUND`，入站规则；`OUTBOUND`，出站规则。</li>
<li>description - String - 协议描述，该过滤条件支持模糊匹配。</li> 
     * @return Filters 过滤条件,不支持同时指定SecurityGroupId和Filters参数。
<li>security-group-id - String - 安全组ID。</li>
<li>ip - String - IP，支持IPV4和IPV6模糊匹配。</li>
<li>address-module - String - IP地址模板或IP地址组模板ID。</li>
<li>service-module - String - 协议端口模板或协议端口组模板ID。</li>
<li>protocol-type - String - 安全组策略支持的协议，可选值：`TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`。</li>
<li>port - String - 是否必填：否 -协议端口，支持模糊匹配，值为`ALL`时，查询所有的端口。</li>
<li>poly - String - 协议策略，可选值：`ALL`，所有策略；`ACCEPT`，允许；`DROP`，拒绝。</li>
<li>direction - String - 协议规则，可选值：`ALL`，所有策略；`INBOUND`，入站规则；`OUTBOUND`，出站规则。</li>
<li>description - String - 协议描述，该过滤条件支持模糊匹配。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件,不支持同时指定SecurityGroupId和Filters参数。
<li>security-group-id - String - 安全组ID。</li>
<li>ip - String - IP，支持IPV4和IPV6模糊匹配。</li>
<li>address-module - String - IP地址模板或IP地址组模板ID。</li>
<li>service-module - String - 协议端口模板或协议端口组模板ID。</li>
<li>protocol-type - String - 安全组策略支持的协议，可选值：`TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`。</li>
<li>port - String - 是否必填：否 -协议端口，支持模糊匹配，值为`ALL`时，查询所有的端口。</li>
<li>poly - String - 协议策略，可选值：`ALL`，所有策略；`ACCEPT`，允许；`DROP`，拒绝。</li>
<li>direction - String - 协议规则，可选值：`ALL`，所有策略；`INBOUND`，入站规则；`OUTBOUND`，出站规则。</li>
<li>description - String - 协议描述，该过滤条件支持模糊匹配。</li>
     * @param Filters 过滤条件,不支持同时指定SecurityGroupId和Filters参数。
<li>security-group-id - String - 安全组ID。</li>
<li>ip - String - IP，支持IPV4和IPV6模糊匹配。</li>
<li>address-module - String - IP地址模板或IP地址组模板ID。</li>
<li>service-module - String - 协议端口模板或协议端口组模板ID。</li>
<li>protocol-type - String - 安全组策略支持的协议，可选值：`TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`。</li>
<li>port - String - 是否必填：否 -协议端口，支持模糊匹配，值为`ALL`时，查询所有的端口。</li>
<li>poly - String - 协议策略，可选值：`ALL`，所有策略；`ACCEPT`，允许；`DROP`，拒绝。</li>
<li>direction - String - 协议规则，可选值：`ALL`，所有策略；`INBOUND`，入站规则；`OUTBOUND`，出站规则。</li>
<li>description - String - 协议描述，该过滤条件支持模糊匹配。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSecurityGroupPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupPoliciesRequest(DescribeSecurityGroupPoliciesRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

