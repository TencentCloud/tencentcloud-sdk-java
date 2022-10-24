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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCompliancePolicyAssetSetToWhitelistRequest extends AbstractModel{

    /**
    * 检查项ID
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
    * 需要忽略指定检查项内的资产ID列表
    */
    @SerializedName("CustomerAssetItemIdSet")
    @Expose
    private Long [] CustomerAssetItemIdSet;

    /**
     * Get 检查项ID 
     * @return CustomerPolicyItemId 检查项ID
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set 检查项ID
     * @param CustomerPolicyItemId 检查项ID
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    /**
     * Get 需要忽略指定检查项内的资产ID列表 
     * @return CustomerAssetItemIdSet 需要忽略指定检查项内的资产ID列表
     */
    public Long [] getCustomerAssetItemIdSet() {
        return this.CustomerAssetItemIdSet;
    }

    /**
     * Set 需要忽略指定检查项内的资产ID列表
     * @param CustomerAssetItemIdSet 需要忽略指定检查项内的资产ID列表
     */
    public void setCustomerAssetItemIdSet(Long [] CustomerAssetItemIdSet) {
        this.CustomerAssetItemIdSet = CustomerAssetItemIdSet;
    }

    public AddCompliancePolicyAssetSetToWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCompliancePolicyAssetSetToWhitelistRequest(AddCompliancePolicyAssetSetToWhitelistRequest source) {
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
        if (source.CustomerAssetItemIdSet != null) {
            this.CustomerAssetItemIdSet = new Long[source.CustomerAssetItemIdSet.length];
            for (int i = 0; i < source.CustomerAssetItemIdSet.length; i++) {
                this.CustomerAssetItemIdSet[i] = new Long(source.CustomerAssetItemIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);
        this.setParamArraySimple(map, prefix + "CustomerAssetItemIdSet.", this.CustomerAssetItemIdSet);

    }
}

