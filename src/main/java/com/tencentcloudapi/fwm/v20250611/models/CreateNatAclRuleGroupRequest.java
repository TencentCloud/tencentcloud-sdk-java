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

public class CreateNatAclRuleGroupRequest extends AbstractModel {

    /**
    * 规则组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 产品类型，固定为 cfw_nat_acl
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 规则列表
    */
    @SerializedName("Rules")
    @Expose
    private NatAclRule [] Rules;

    /**
     * Get 规则组名称 
     * @return GroupName 规则组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 规则组名称
     * @param GroupName 规则组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 产品类型，固定为 cfw_nat_acl 
     * @return Product 产品类型，固定为 cfw_nat_acl
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品类型，固定为 cfw_nat_acl
     * @param Product 产品类型，固定为 cfw_nat_acl
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 规则列表 
     * @return Rules 规则列表
     */
    public NatAclRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则列表
     * @param Rules 规则列表
     */
    public void setRules(NatAclRule [] Rules) {
        this.Rules = Rules;
    }

    public CreateNatAclRuleGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatAclRuleGroupRequest(CreateNatAclRuleGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Rules != null) {
            this.Rules = new NatAclRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new NatAclRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

