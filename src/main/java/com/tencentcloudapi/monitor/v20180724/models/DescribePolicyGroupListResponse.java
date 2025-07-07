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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupListResponse extends AbstractModel {

    /**
    * 策略组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupList")
    @Expose
    private DescribePolicyGroupListGroup [] GroupList;

    /**
    * 策略组总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warning")
    @Expose
    private String Warning;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupList 策略组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupListGroup [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set 策略组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupList 策略组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupList(DescribePolicyGroupListGroup [] GroupList) {
        this.GroupList = GroupList;
    }

    /**
     * Get 策略组总数 
     * @return Total 策略组总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 策略组总数
     * @param Total 策略组总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warning 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarning() {
        return this.Warning;
    }

    /**
     * Set 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warning 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarning(String Warning) {
        this.Warning = Warning;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePolicyGroupListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupListResponse(DescribePolicyGroupListResponse source) {
        if (source.GroupList != null) {
            this.GroupList = new DescribePolicyGroupListGroup[source.GroupList.length];
            for (int i = 0; i < source.GroupList.length; i++) {
                this.GroupList[i] = new DescribePolicyGroupListGroup(source.GroupList[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Warning != null) {
            this.Warning = new String(source.Warning);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "GroupList.", this.GroupList);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Warning", this.Warning);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

