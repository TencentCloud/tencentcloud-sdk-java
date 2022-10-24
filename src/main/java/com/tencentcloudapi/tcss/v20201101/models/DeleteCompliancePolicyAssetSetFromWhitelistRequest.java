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

public class DeleteCompliancePolicyAssetSetFromWhitelistRequest extends AbstractModel{

    /**
    * （检查项ID+资产ID列表）的列表
    */
    @SerializedName("PolicyAssetSetList")
    @Expose
    private CompliancePolicyAssetSetItem [] PolicyAssetSetList;

    /**
     * Get （检查项ID+资产ID列表）的列表 
     * @return PolicyAssetSetList （检查项ID+资产ID列表）的列表
     */
    public CompliancePolicyAssetSetItem [] getPolicyAssetSetList() {
        return this.PolicyAssetSetList;
    }

    /**
     * Set （检查项ID+资产ID列表）的列表
     * @param PolicyAssetSetList （检查项ID+资产ID列表）的列表
     */
    public void setPolicyAssetSetList(CompliancePolicyAssetSetItem [] PolicyAssetSetList) {
        this.PolicyAssetSetList = PolicyAssetSetList;
    }

    public DeleteCompliancePolicyAssetSetFromWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCompliancePolicyAssetSetFromWhitelistRequest(DeleteCompliancePolicyAssetSetFromWhitelistRequest source) {
        if (source.PolicyAssetSetList != null) {
            this.PolicyAssetSetList = new CompliancePolicyAssetSetItem[source.PolicyAssetSetList.length];
            for (int i = 0; i < source.PolicyAssetSetList.length; i++) {
                this.PolicyAssetSetList[i] = new CompliancePolicyAssetSetItem(source.PolicyAssetSetList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PolicyAssetSetList.", this.PolicyAssetSetList);

    }
}

