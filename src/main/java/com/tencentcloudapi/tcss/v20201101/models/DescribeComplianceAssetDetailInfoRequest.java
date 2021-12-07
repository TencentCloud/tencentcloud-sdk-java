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

public class DescribeComplianceAssetDetailInfoRequest extends AbstractModel{

    /**
    * 客户资产ID。
    */
    @SerializedName("CustomerAssetId")
    @Expose
    private Long CustomerAssetId;

    /**
     * Get 客户资产ID。 
     * @return CustomerAssetId 客户资产ID。
     */
    public Long getCustomerAssetId() {
        return this.CustomerAssetId;
    }

    /**
     * Set 客户资产ID。
     * @param CustomerAssetId 客户资产ID。
     */
    public void setCustomerAssetId(Long CustomerAssetId) {
        this.CustomerAssetId = CustomerAssetId;
    }

    public DescribeComplianceAssetDetailInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceAssetDetailInfoRequest(DescribeComplianceAssetDetailInfoRequest source) {
        if (source.CustomerAssetId != null) {
            this.CustomerAssetId = new Long(source.CustomerAssetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetId", this.CustomerAssetId);

    }
}

