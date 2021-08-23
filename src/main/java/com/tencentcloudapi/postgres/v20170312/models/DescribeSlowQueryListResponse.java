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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowQueryListResponse extends AbstractModel{

    /**
    * 选定时间范围内慢SQL总条数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 指定时间范围内，慢SQL耗时分段分析。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationAnalysis")
    @Expose
    private DurationAnalysis [] DurationAnalysis;

    /**
    * 指定时间范围内 慢SQL流水。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawSlowQueryList")
    @Expose
    private RawSlowQuery [] RawSlowQueryList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 选定时间范围内慢SQL总条数。 
     * @return TotalCount 选定时间范围内慢SQL总条数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 选定时间范围内慢SQL总条数。
     * @param TotalCount 选定时间范围内慢SQL总条数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 指定时间范围内，慢SQL耗时分段分析。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationAnalysis 指定时间范围内，慢SQL耗时分段分析。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DurationAnalysis [] getDurationAnalysis() {
        return this.DurationAnalysis;
    }

    /**
     * Set 指定时间范围内，慢SQL耗时分段分析。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationAnalysis 指定时间范围内，慢SQL耗时分段分析。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationAnalysis(DurationAnalysis [] DurationAnalysis) {
        this.DurationAnalysis = DurationAnalysis;
    }

    /**
     * Get 指定时间范围内 慢SQL流水。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawSlowQueryList 指定时间范围内 慢SQL流水。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RawSlowQuery [] getRawSlowQueryList() {
        return this.RawSlowQueryList;
    }

    /**
     * Set 指定时间范围内 慢SQL流水。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawSlowQueryList 指定时间范围内 慢SQL流水。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawSlowQueryList(RawSlowQuery [] RawSlowQueryList) {
        this.RawSlowQueryList = RawSlowQueryList;
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

    public DescribeSlowQueryListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowQueryListResponse(DescribeSlowQueryListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DurationAnalysis != null) {
            this.DurationAnalysis = new DurationAnalysis[source.DurationAnalysis.length];
            for (int i = 0; i < source.DurationAnalysis.length; i++) {
                this.DurationAnalysis[i] = new DurationAnalysis(source.DurationAnalysis[i]);
            }
        }
        if (source.RawSlowQueryList != null) {
            this.RawSlowQueryList = new RawSlowQuery[source.RawSlowQueryList.length];
            for (int i = 0; i < source.RawSlowQueryList.length; i++) {
                this.RawSlowQueryList[i] = new RawSlowQuery(source.RawSlowQueryList[i]);
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
        this.setParamArrayObj(map, prefix + "DurationAnalysis.", this.DurationAnalysis);
        this.setParamArrayObj(map, prefix + "RawSlowQueryList.", this.RawSlowQueryList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

