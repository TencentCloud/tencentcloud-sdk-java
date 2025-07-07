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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerlessMetricsResponse extends AbstractModel {

    /**
    * storage指标值，单位byte
    */
    @SerializedName("Storage")
    @Expose
    private Float Storage;

    /**
    * IndexTraffic指标值，单位byte
    */
    @SerializedName("IndexTraffic")
    @Expose
    private Float IndexTraffic;

    /**
    * 读请求数，单位次数
    */
    @SerializedName("ReadReqTimes")
    @Expose
    private Long ReadReqTimes;

    /**
    * 写请求数，单位次数
    */
    @SerializedName("WriteReqTimes")
    @Expose
    private Long WriteReqTimes;

    /**
    * 文档数量，单位个数
    */
    @SerializedName("DocCount")
    @Expose
    private Long DocCount;

    /**
    * 指标数据数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricMapList")
    @Expose
    private MetricMapByIndexId [] MetricMapList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get storage指标值，单位byte 
     * @return Storage storage指标值，单位byte
     */
    public Float getStorage() {
        return this.Storage;
    }

    /**
     * Set storage指标值，单位byte
     * @param Storage storage指标值，单位byte
     */
    public void setStorage(Float Storage) {
        this.Storage = Storage;
    }

    /**
     * Get IndexTraffic指标值，单位byte 
     * @return IndexTraffic IndexTraffic指标值，单位byte
     */
    public Float getIndexTraffic() {
        return this.IndexTraffic;
    }

    /**
     * Set IndexTraffic指标值，单位byte
     * @param IndexTraffic IndexTraffic指标值，单位byte
     */
    public void setIndexTraffic(Float IndexTraffic) {
        this.IndexTraffic = IndexTraffic;
    }

    /**
     * Get 读请求数，单位次数 
     * @return ReadReqTimes 读请求数，单位次数
     */
    public Long getReadReqTimes() {
        return this.ReadReqTimes;
    }

    /**
     * Set 读请求数，单位次数
     * @param ReadReqTimes 读请求数，单位次数
     */
    public void setReadReqTimes(Long ReadReqTimes) {
        this.ReadReqTimes = ReadReqTimes;
    }

    /**
     * Get 写请求数，单位次数 
     * @return WriteReqTimes 写请求数，单位次数
     */
    public Long getWriteReqTimes() {
        return this.WriteReqTimes;
    }

    /**
     * Set 写请求数，单位次数
     * @param WriteReqTimes 写请求数，单位次数
     */
    public void setWriteReqTimes(Long WriteReqTimes) {
        this.WriteReqTimes = WriteReqTimes;
    }

    /**
     * Get 文档数量，单位个数 
     * @return DocCount 文档数量，单位个数
     */
    public Long getDocCount() {
        return this.DocCount;
    }

    /**
     * Set 文档数量，单位个数
     * @param DocCount 文档数量，单位个数
     */
    public void setDocCount(Long DocCount) {
        this.DocCount = DocCount;
    }

    /**
     * Get 指标数据数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricMapList 指标数据数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricMapByIndexId [] getMetricMapList() {
        return this.MetricMapList;
    }

    /**
     * Set 指标数据数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricMapList 指标数据数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricMapList(MetricMapByIndexId [] MetricMapList) {
        this.MetricMapList = MetricMapList;
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

    public DescribeServerlessMetricsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerlessMetricsResponse(DescribeServerlessMetricsResponse source) {
        if (source.Storage != null) {
            this.Storage = new Float(source.Storage);
        }
        if (source.IndexTraffic != null) {
            this.IndexTraffic = new Float(source.IndexTraffic);
        }
        if (source.ReadReqTimes != null) {
            this.ReadReqTimes = new Long(source.ReadReqTimes);
        }
        if (source.WriteReqTimes != null) {
            this.WriteReqTimes = new Long(source.WriteReqTimes);
        }
        if (source.DocCount != null) {
            this.DocCount = new Long(source.DocCount);
        }
        if (source.MetricMapList != null) {
            this.MetricMapList = new MetricMapByIndexId[source.MetricMapList.length];
            for (int i = 0; i < source.MetricMapList.length; i++) {
                this.MetricMapList[i] = new MetricMapByIndexId(source.MetricMapList[i]);
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
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "IndexTraffic", this.IndexTraffic);
        this.setParamSimple(map, prefix + "ReadReqTimes", this.ReadReqTimes);
        this.setParamSimple(map, prefix + "WriteReqTimes", this.WriteReqTimes);
        this.setParamSimple(map, prefix + "DocCount", this.DocCount);
        this.setParamArrayObj(map, prefix + "MetricMapList.", this.MetricMapList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

