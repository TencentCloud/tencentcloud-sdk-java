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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataAssetsResponse extends AbstractModel {

    /**
    * 数据资产记录列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSetRecords")
    @Expose
    private DataSetRecord [] DataSetRecords;

    /**
    * 总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 指标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicatorRecords")
    @Expose
    private IndicatorBaseInfo [] IndicatorRecords;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据资产记录列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSetRecords 数据资产记录列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSetRecord [] getDataSetRecords() {
        return this.DataSetRecords;
    }

    /**
     * Set 数据资产记录列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSetRecords 数据资产记录列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSetRecords(DataSetRecord [] DataSetRecords) {
        this.DataSetRecords = DataSetRecords;
    }

    /**
     * Get 总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber 页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber 页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 每页数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 每页数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 指标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicatorRecords 指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorBaseInfo [] getIndicatorRecords() {
        return this.IndicatorRecords;
    }

    /**
     * Set 指标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicatorRecords 指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicatorRecords(IndicatorBaseInfo [] IndicatorRecords) {
        this.IndicatorRecords = IndicatorRecords;
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

    public DescribeDataAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataAssetsResponse(DescribeDataAssetsResponse source) {
        if (source.DataSetRecords != null) {
            this.DataSetRecords = new DataSetRecord[source.DataSetRecords.length];
            for (int i = 0; i < source.DataSetRecords.length; i++) {
                this.DataSetRecords[i] = new DataSetRecord(source.DataSetRecords[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.IndicatorRecords != null) {
            this.IndicatorRecords = new IndicatorBaseInfo[source.IndicatorRecords.length];
            for (int i = 0; i < source.IndicatorRecords.length; i++) {
                this.IndicatorRecords[i] = new IndicatorBaseInfo(source.IndicatorRecords[i]);
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
        this.setParamArrayObj(map, prefix + "DataSetRecords.", this.DataSetRecords);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "IndicatorRecords.", this.IndicatorRecords);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

