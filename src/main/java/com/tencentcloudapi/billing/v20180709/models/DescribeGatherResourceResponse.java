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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatherResourceResponse extends AbstractModel {

    /**
    * 总条数
    */
    @SerializedName("RecordNum")
    @Expose
    private Long RecordNum;

    /**
    * 资源归集汇总
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatherResourceSummary")
    @Expose
    private GatherResourceSummary [] GatherResourceSummary;

    /**
    * 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数 
     * @return RecordNum 总条数
     */
    public Long getRecordNum() {
        return this.RecordNum;
    }

    /**
     * Set 总条数
     * @param RecordNum 总条数
     */
    public void setRecordNum(Long RecordNum) {
        this.RecordNum = RecordNum;
    }

    /**
     * Get 资源归集汇总
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatherResourceSummary 资源归集汇总
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatherResourceSummary [] getGatherResourceSummary() {
        return this.GatherResourceSummary;
    }

    /**
     * Set 资源归集汇总
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatherResourceSummary 资源归集汇总
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatherResourceSummary(GatherResourceSummary [] GatherResourceSummary) {
        this.GatherResourceSummary = GatherResourceSummary;
    }

    /**
     * Get 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
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

    public DescribeGatherResourceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatherResourceResponse(DescribeGatherResourceResponse source) {
        if (source.RecordNum != null) {
            this.RecordNum = new Long(source.RecordNum);
        }
        if (source.GatherResourceSummary != null) {
            this.GatherResourceSummary = new GatherResourceSummary[source.GatherResourceSummary.length];
            for (int i = 0; i < source.GatherResourceSummary.length; i++) {
                this.GatherResourceSummary[i] = new GatherResourceSummary(source.GatherResourceSummary[i]);
            }
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordNum", this.RecordNum);
        this.setParamArrayObj(map, prefix + "GatherResourceSummary.", this.GatherResourceSummary);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

