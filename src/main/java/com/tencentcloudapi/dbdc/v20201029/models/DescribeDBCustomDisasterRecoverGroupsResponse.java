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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBCustomDisasterRecoverGroupsResponse extends AbstractModel {

    /**
    * <p>总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>置放群组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisasterRecoverGroupSet")
    @Expose
    private DisasterRecoverGroup [] DisasterRecoverGroupSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总数</p> 
     * @return TotalCount <p>总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总数</p>
     * @param TotalCount <p>总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>置放群组列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisasterRecoverGroupSet <p>置放群组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DisasterRecoverGroup [] getDisasterRecoverGroupSet() {
        return this.DisasterRecoverGroupSet;
    }

    /**
     * Set <p>置放群组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisasterRecoverGroupSet <p>置放群组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisasterRecoverGroupSet(DisasterRecoverGroup [] DisasterRecoverGroupSet) {
        this.DisasterRecoverGroupSet = DisasterRecoverGroupSet;
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

    public DescribeDBCustomDisasterRecoverGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBCustomDisasterRecoverGroupsResponse(DescribeDBCustomDisasterRecoverGroupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DisasterRecoverGroupSet != null) {
            this.DisasterRecoverGroupSet = new DisasterRecoverGroup[source.DisasterRecoverGroupSet.length];
            for (int i = 0; i < source.DisasterRecoverGroupSet.length; i++) {
                this.DisasterRecoverGroupSet[i] = new DisasterRecoverGroup(source.DisasterRecoverGroupSet[i]);
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
        this.setParamArrayObj(map, prefix + "DisasterRecoverGroupSet.", this.DisasterRecoverGroupSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

