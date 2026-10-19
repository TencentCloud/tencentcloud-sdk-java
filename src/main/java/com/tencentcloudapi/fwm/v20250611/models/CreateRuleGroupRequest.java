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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRuleGroupRequest extends AbstractModel {

    /**
    * <p>规则组名称，不可为空，最长50字符（按字符数计，中文按1个字符计）</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>规则组归属产品。enterprise_sg-企业安全组，cfw_vpc_acl-VPC边界防火墙，cfw_nat_acl-NAT边界防火墙，cfw_edge_acl-互联网边界防火墙。必填，不接受 all</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>规则组名称，不可为空，最长50字符（按字符数计，中文按1个字符计）</p> 
     * @return GroupName <p>规则组名称，不可为空，最长50字符（按字符数计，中文按1个字符计）</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>规则组名称，不可为空，最长50字符（按字符数计，中文按1个字符计）</p>
     * @param GroupName <p>规则组名称，不可为空，最长50字符（按字符数计，中文按1个字符计）</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>规则组归属产品。enterprise_sg-企业安全组，cfw_vpc_acl-VPC边界防火墙，cfw_nat_acl-NAT边界防火墙，cfw_edge_acl-互联网边界防火墙。必填，不接受 all</p> 
     * @return Product <p>规则组归属产品。enterprise_sg-企业安全组，cfw_vpc_acl-VPC边界防火墙，cfw_nat_acl-NAT边界防火墙，cfw_edge_acl-互联网边界防火墙。必填，不接受 all</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>规则组归属产品。enterprise_sg-企业安全组，cfw_vpc_acl-VPC边界防火墙，cfw_nat_acl-NAT边界防火墙，cfw_edge_acl-互联网边界防火墙。必填，不接受 all</p>
     * @param Product <p>规则组归属产品。enterprise_sg-企业安全组，cfw_vpc_acl-VPC边界防火墙，cfw_nat_acl-NAT边界防火墙，cfw_edge_acl-互联网边界防火墙。必填，不接受 all</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CreateRuleGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleGroupRequest(CreateRuleGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

