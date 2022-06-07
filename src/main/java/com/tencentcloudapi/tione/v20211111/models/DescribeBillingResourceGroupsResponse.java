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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingResourceGroupsResponse extends AbstractModel{

    /**
    * 资源组总数； 注意接口是分页拉取的，total是指资源组总数，不是本次返回中ResourceGroupSet数组的大小
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 资源组详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupSet")
    @Expose
    private ResourceGroup [] ResourceGroupSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资源组总数； 注意接口是分页拉取的，total是指资源组总数，不是本次返回中ResourceGroupSet数组的大小 
     * @return TotalCount 资源组总数； 注意接口是分页拉取的，total是指资源组总数，不是本次返回中ResourceGroupSet数组的大小
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 资源组总数； 注意接口是分页拉取的，total是指资源组总数，不是本次返回中ResourceGroupSet数组的大小
     * @param TotalCount 资源组总数； 注意接口是分页拉取的，total是指资源组总数，不是本次返回中ResourceGroupSet数组的大小
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 资源组详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupSet 资源组详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceGroup [] getResourceGroupSet() {
        return this.ResourceGroupSet;
    }

    /**
     * Set 资源组详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupSet 资源组详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupSet(ResourceGroup [] ResourceGroupSet) {
        this.ResourceGroupSet = ResourceGroupSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBillingResourceGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingResourceGroupsResponse(DescribeBillingResourceGroupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ResourceGroupSet != null) {
            this.ResourceGroupSet = new ResourceGroup[source.ResourceGroupSet.length];
            for (int i = 0; i < source.ResourceGroupSet.length; i++) {
                this.ResourceGroupSet[i] = new ResourceGroup(source.ResourceGroupSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ResourceGroupSet.", this.ResourceGroupSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

