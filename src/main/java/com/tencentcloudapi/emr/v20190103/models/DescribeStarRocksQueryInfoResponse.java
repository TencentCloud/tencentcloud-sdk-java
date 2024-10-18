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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStarRocksQueryInfoResponse extends AbstractModel {

    /**
    * 总数，分页查询时使用
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Starrocks 查询信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StarRocksQueryInfoList")
    @Expose
    private StarRocksQueryInfo [] StarRocksQueryInfoList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数，分页查询时使用 
     * @return TotalCount 总数，分页查询时使用
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数，分页查询时使用
     * @param TotalCount 总数，分页查询时使用
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Starrocks 查询信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StarRocksQueryInfoList Starrocks 查询信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StarRocksQueryInfo [] getStarRocksQueryInfoList() {
        return this.StarRocksQueryInfoList;
    }

    /**
     * Set Starrocks 查询信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param StarRocksQueryInfoList Starrocks 查询信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStarRocksQueryInfoList(StarRocksQueryInfo [] StarRocksQueryInfoList) {
        this.StarRocksQueryInfoList = StarRocksQueryInfoList;
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

    public DescribeStarRocksQueryInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStarRocksQueryInfoResponse(DescribeStarRocksQueryInfoResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.StarRocksQueryInfoList != null) {
            this.StarRocksQueryInfoList = new StarRocksQueryInfo[source.StarRocksQueryInfoList.length];
            for (int i = 0; i < source.StarRocksQueryInfoList.length; i++) {
                this.StarRocksQueryInfoList[i] = new StarRocksQueryInfo(source.StarRocksQueryInfoList[i]);
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
        this.setParamArrayObj(map, prefix + "StarRocksQueryInfoList.", this.StarRocksQueryInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

