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

public class DescribeFleetStatisticDetailsResponse extends AbstractModel{

    /**
    * 服务部署统计详情列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailList")
    @Expose
    private FleetStatisticDetail [] DetailList;

    /**
    * 记录总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 统计时间类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeType")
    @Expose
    private String TimeType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务部署统计详情列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailList 服务部署统计详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FleetStatisticDetail [] getDetailList() {
        return this.DetailList;
    }

    /**
     * Set 服务部署统计详情列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailList 服务部署统计详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailList(FleetStatisticDetail [] DetailList) {
        this.DetailList = DetailList;
    }

    /**
     * Get 记录总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 记录总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 记录总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 记录总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 统计时间类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeType 统计时间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeType() {
        return this.TimeType;
    }

    /**
     * Set 统计时间类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeType 统计时间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeType(String TimeType) {
        this.TimeType = TimeType;
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

    public DescribeFleetStatisticDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFleetStatisticDetailsResponse(DescribeFleetStatisticDetailsResponse source) {
        if (source.DetailList != null) {
            this.DetailList = new FleetStatisticDetail[source.DetailList.length];
            for (int i = 0; i < source.DetailList.length; i++) {
                this.DetailList[i] = new FleetStatisticDetail(source.DetailList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TimeType != null) {
            this.TimeType = new String(source.TimeType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DetailList.", this.DetailList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

