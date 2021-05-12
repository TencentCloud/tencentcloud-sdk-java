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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataResponse extends AbstractModel{

    /**
    * 匹配概况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverviewData")
    @Expose
    private ReportOverviewData OverviewData;

    /**
    * 匹配请求次数趋势数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrendData")
    @Expose
    private ReportTrendData TrendData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 匹配概况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverviewData 匹配概况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReportOverviewData getOverviewData() {
        return this.OverviewData;
    }

    /**
     * Set 匹配概况
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverviewData 匹配概况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverviewData(ReportOverviewData OverviewData) {
        this.OverviewData = OverviewData;
    }

    /**
     * Get 匹配请求次数趋势数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrendData 匹配请求次数趋势数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReportTrendData getTrendData() {
        return this.TrendData;
    }

    /**
     * Set 匹配请求次数趋势数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrendData 匹配请求次数趋势数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrendData(ReportTrendData TrendData) {
        this.TrendData = TrendData;
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

    public DescribeDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataResponse(DescribeDataResponse source) {
        if (source.OverviewData != null) {
            this.OverviewData = new ReportOverviewData(source.OverviewData);
        }
        if (source.TrendData != null) {
            this.TrendData = new ReportTrendData(source.TrendData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OverviewData.", this.OverviewData);
        this.setParamObj(map, prefix + "TrendData.", this.TrendData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

