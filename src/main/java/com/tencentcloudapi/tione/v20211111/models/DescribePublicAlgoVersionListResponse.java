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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicAlgoVersionListResponse extends AbstractModel {

    /**
    * 算法版本数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAlgoVersions")
    @Expose
    private PublicAlgoVersion [] PublicAlgoVersions;

    /**
    * 聚合后的公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AggregatePublicAlgoVersions")
    @Expose
    private AggregatePublicAlgoVersion [] AggregatePublicAlgoVersions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 算法版本数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 算法版本数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 算法版本数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 算法版本数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAlgoVersions 公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PublicAlgoVersion [] getPublicAlgoVersions() {
        return this.PublicAlgoVersions;
    }

    /**
     * Set 公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAlgoVersions 公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAlgoVersions(PublicAlgoVersion [] PublicAlgoVersions) {
        this.PublicAlgoVersions = PublicAlgoVersions;
    }

    /**
     * Get 聚合后的公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AggregatePublicAlgoVersions 聚合后的公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AggregatePublicAlgoVersion [] getAggregatePublicAlgoVersions() {
        return this.AggregatePublicAlgoVersions;
    }

    /**
     * Set 聚合后的公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AggregatePublicAlgoVersions 聚合后的公共算法版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAggregatePublicAlgoVersions(AggregatePublicAlgoVersion [] AggregatePublicAlgoVersions) {
        this.AggregatePublicAlgoVersions = AggregatePublicAlgoVersions;
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

    public DescribePublicAlgoVersionListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicAlgoVersionListResponse(DescribePublicAlgoVersionListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PublicAlgoVersions != null) {
            this.PublicAlgoVersions = new PublicAlgoVersion[source.PublicAlgoVersions.length];
            for (int i = 0; i < source.PublicAlgoVersions.length; i++) {
                this.PublicAlgoVersions[i] = new PublicAlgoVersion(source.PublicAlgoVersions[i]);
            }
        }
        if (source.AggregatePublicAlgoVersions != null) {
            this.AggregatePublicAlgoVersions = new AggregatePublicAlgoVersion[source.AggregatePublicAlgoVersions.length];
            for (int i = 0; i < source.AggregatePublicAlgoVersions.length; i++) {
                this.AggregatePublicAlgoVersions[i] = new AggregatePublicAlgoVersion(source.AggregatePublicAlgoVersions[i]);
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
        this.setParamArrayObj(map, prefix + "PublicAlgoVersions.", this.PublicAlgoVersions);
        this.setParamArrayObj(map, prefix + "AggregatePublicAlgoVersions.", this.AggregatePublicAlgoVersions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

