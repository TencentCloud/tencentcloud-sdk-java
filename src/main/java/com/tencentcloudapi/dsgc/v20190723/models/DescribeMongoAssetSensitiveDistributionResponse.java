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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMongoAssetSensitiveDistributionResponse extends AbstractModel {

    /**
    * mongo的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MongoAsset")
    @Expose
    private MongoAsset MongoAsset;

    /**
    * 涉敏top数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopAsset")
    @Expose
    private TopAsset [] TopAsset;

    /**
    * mongo的详情列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MongoDetail")
    @Expose
    private MongoAssetDBDetail [] MongoDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get mongo的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MongoAsset mongo的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoAsset getMongoAsset() {
        return this.MongoAsset;
    }

    /**
     * Set mongo的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param MongoAsset mongo的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongoAsset(MongoAsset MongoAsset) {
        this.MongoAsset = MongoAsset;
    }

    /**
     * Get 涉敏top数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopAsset 涉敏top数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopAsset [] getTopAsset() {
        return this.TopAsset;
    }

    /**
     * Set 涉敏top数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopAsset 涉敏top数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopAsset(TopAsset [] TopAsset) {
        this.TopAsset = TopAsset;
    }

    /**
     * Get mongo的详情列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MongoDetail mongo的详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoAssetDBDetail [] getMongoDetail() {
        return this.MongoDetail;
    }

    /**
     * Set mongo的详情列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MongoDetail mongo的详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongoDetail(MongoAssetDBDetail [] MongoDetail) {
        this.MongoDetail = MongoDetail;
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

    public DescribeMongoAssetSensitiveDistributionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMongoAssetSensitiveDistributionResponse(DescribeMongoAssetSensitiveDistributionResponse source) {
        if (source.MongoAsset != null) {
            this.MongoAsset = new MongoAsset(source.MongoAsset);
        }
        if (source.TopAsset != null) {
            this.TopAsset = new TopAsset[source.TopAsset.length];
            for (int i = 0; i < source.TopAsset.length; i++) {
                this.TopAsset[i] = new TopAsset(source.TopAsset[i]);
            }
        }
        if (source.MongoDetail != null) {
            this.MongoDetail = new MongoAssetDBDetail[source.MongoDetail.length];
            for (int i = 0; i < source.MongoDetail.length; i++) {
                this.MongoDetail[i] = new MongoAssetDBDetail(source.MongoDetail[i]);
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
        this.setParamObj(map, prefix + "MongoAsset.", this.MongoAsset);
        this.setParamArrayObj(map, prefix + "TopAsset.", this.TopAsset);
        this.setParamArrayObj(map, prefix + "MongoDetail.", this.MongoDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

