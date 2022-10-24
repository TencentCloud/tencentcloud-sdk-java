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

public class ComplianceAssetPolicySetItem extends AbstractModel{

    /**
    * 资产ID
    */
    @SerializedName("CustomerAssetItemId")
    @Expose
    private Long CustomerAssetItemId;

    /**
    * 需要忽略指定资产内的检查项ID列表，为空表示所有
    */
    @SerializedName("CustomerPolicyItemIdSet")
    @Expose
    private Long [] CustomerPolicyItemIdSet;

    /**
     * Get 资产ID 
     * @return CustomerAssetItemId 资产ID
     */
    public Long getCustomerAssetItemId() {
        return this.CustomerAssetItemId;
    }

    /**
     * Set 资产ID
     * @param CustomerAssetItemId 资产ID
     */
    public void setCustomerAssetItemId(Long CustomerAssetItemId) {
        this.CustomerAssetItemId = CustomerAssetItemId;
    }

    /**
     * Get 需要忽略指定资产内的检查项ID列表，为空表示所有 
     * @return CustomerPolicyItemIdSet 需要忽略指定资产内的检查项ID列表，为空表示所有
     */
    public Long [] getCustomerPolicyItemIdSet() {
        return this.CustomerPolicyItemIdSet;
    }

    /**
     * Set 需要忽略指定资产内的检查项ID列表，为空表示所有
     * @param CustomerPolicyItemIdSet 需要忽略指定资产内的检查项ID列表，为空表示所有
     */
    public void setCustomerPolicyItemIdSet(Long [] CustomerPolicyItemIdSet) {
        this.CustomerPolicyItemIdSet = CustomerPolicyItemIdSet;
    }

    public ComplianceAssetPolicySetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAssetPolicySetItem(ComplianceAssetPolicySetItem source) {
        if (source.CustomerAssetItemId != null) {
            this.CustomerAssetItemId = new Long(source.CustomerAssetItemId);
        }
        if (source.CustomerPolicyItemIdSet != null) {
            this.CustomerPolicyItemIdSet = new Long[source.CustomerPolicyItemIdSet.length];
            for (int i = 0; i < source.CustomerPolicyItemIdSet.length; i++) {
                this.CustomerPolicyItemIdSet[i] = new Long(source.CustomerPolicyItemIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetItemId", this.CustomerAssetItemId);
        this.setParamArraySimple(map, prefix + "CustomerPolicyItemIdSet.", this.CustomerPolicyItemIdSet);

    }
}

