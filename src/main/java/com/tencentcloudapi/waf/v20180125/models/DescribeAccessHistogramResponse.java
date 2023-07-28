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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessHistogramResponse extends AbstractModel{

    /**
    * 柱状图间隔时间差，单位ms
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 满足条件的日志条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HistogramInfos")
    @Expose
    private AccessHistogramItem [] HistogramInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 柱状图间隔时间差，单位ms 
     * @return Interval 柱状图间隔时间差，单位ms
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 柱状图间隔时间差，单位ms
     * @param Interval 柱状图间隔时间差，单位ms
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 满足条件的日志条数 
     * @return TotalCount 满足条件的日志条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 满足条件的日志条数
     * @param TotalCount 满足条件的日志条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HistogramInfos 注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessHistogramItem [] getHistogramInfos() {
        return this.HistogramInfos;
    }

    /**
     * Set 注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     * @param HistogramInfos 注意：此字段可能返回 null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistogramInfos(AccessHistogramItem [] HistogramInfos) {
        this.HistogramInfos = HistogramInfos;
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

    public DescribeAccessHistogramResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessHistogramResponse(DescribeAccessHistogramResponse source) {
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.HistogramInfos != null) {
            this.HistogramInfos = new AccessHistogramItem[source.HistogramInfos.length];
            for (int i = 0; i < source.HistogramInfos.length; i++) {
                this.HistogramInfos[i] = new AccessHistogramItem(source.HistogramInfos[i]);
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
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "HistogramInfos.", this.HistogramInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

