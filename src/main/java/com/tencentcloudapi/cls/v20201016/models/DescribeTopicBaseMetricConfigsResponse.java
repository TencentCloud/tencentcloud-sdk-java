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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopicBaseMetricConfigsResponse extends AbstractModel {

    /**
    * 总数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 指标采集配置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Datas")
    @Expose
    private BaseMetricCollectConfig [] Datas;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数目 
     * @return TotalCount 总数目
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数目
     * @param TotalCount 总数目
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 指标采集配置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Datas 指标采集配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseMetricCollectConfig [] getDatas() {
        return this.Datas;
    }

    /**
     * Set 指标采集配置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Datas 指标采集配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatas(BaseMetricCollectConfig [] Datas) {
        this.Datas = Datas;
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

    public DescribeTopicBaseMetricConfigsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicBaseMetricConfigsResponse(DescribeTopicBaseMetricConfigsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Datas != null) {
            this.Datas = new BaseMetricCollectConfig[source.Datas.length];
            for (int i = 0; i < source.Datas.length; i++) {
                this.Datas[i] = new BaseMetricCollectConfig(source.Datas[i]);
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
        this.setParamArrayObj(map, prefix + "Datas.", this.Datas);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

