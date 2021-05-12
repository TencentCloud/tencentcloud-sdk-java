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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCcnInstancesResponse extends AbstractModel{

    /**
    * 云联网实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnInstanceSets")
    @Expose
    private CcnInstanceSets [] CcnInstanceSets;

    /**
    * 云联网实例个数，最小值为0
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云联网实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnInstanceSets 云联网实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CcnInstanceSets [] getCcnInstanceSets() {
        return this.CcnInstanceSets;
    }

    /**
     * Set 云联网实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnInstanceSets 云联网实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnInstanceSets(CcnInstanceSets [] CcnInstanceSets) {
        this.CcnInstanceSets = CcnInstanceSets;
    }

    /**
     * Get 云联网实例个数，最小值为0 
     * @return TotalCount 云联网实例个数，最小值为0
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 云联网实例个数，最小值为0
     * @param TotalCount 云联网实例个数，最小值为0
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeCcnInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcnInstancesResponse(DescribeCcnInstancesResponse source) {
        if (source.CcnInstanceSets != null) {
            this.CcnInstanceSets = new CcnInstanceSets[source.CcnInstanceSets.length];
            for (int i = 0; i < source.CcnInstanceSets.length; i++) {
                this.CcnInstanceSets[i] = new CcnInstanceSets(source.CcnInstanceSets[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CcnInstanceSets.", this.CcnInstanceSets);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

