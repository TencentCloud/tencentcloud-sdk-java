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

public class DescribeCOSAssetSensitiveDistributionResponse extends AbstractModel {

    /**
    * cos的涉敏资产
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosAsset")
    @Expose
    private CosAsset CosAsset;

    /**
    * 涉敏top
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopAsset")
    @Expose
    private TopAsset [] TopAsset;

    /**
    * cos资产详情列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosDetail")
    @Expose
    private AssetCosDetail [] CosDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get cos的涉敏资产
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosAsset cos的涉敏资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosAsset getCosAsset() {
        return this.CosAsset;
    }

    /**
     * Set cos的涉敏资产
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosAsset cos的涉敏资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosAsset(CosAsset CosAsset) {
        this.CosAsset = CosAsset;
    }

    /**
     * Get 涉敏top
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopAsset 涉敏top
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopAsset [] getTopAsset() {
        return this.TopAsset;
    }

    /**
     * Set 涉敏top
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopAsset 涉敏top
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopAsset(TopAsset [] TopAsset) {
        this.TopAsset = TopAsset;
    }

    /**
     * Get cos资产详情列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosDetail cos资产详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetCosDetail [] getCosDetail() {
        return this.CosDetail;
    }

    /**
     * Set cos资产详情列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosDetail cos资产详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosDetail(AssetCosDetail [] CosDetail) {
        this.CosDetail = CosDetail;
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

    public DescribeCOSAssetSensitiveDistributionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCOSAssetSensitiveDistributionResponse(DescribeCOSAssetSensitiveDistributionResponse source) {
        if (source.CosAsset != null) {
            this.CosAsset = new CosAsset(source.CosAsset);
        }
        if (source.TopAsset != null) {
            this.TopAsset = new TopAsset[source.TopAsset.length];
            for (int i = 0; i < source.TopAsset.length; i++) {
                this.TopAsset[i] = new TopAsset(source.TopAsset[i]);
            }
        }
        if (source.CosDetail != null) {
            this.CosDetail = new AssetCosDetail[source.CosDetail.length];
            for (int i = 0; i < source.CosDetail.length; i++) {
                this.CosDetail[i] = new AssetCosDetail(source.CosDetail[i]);
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
        this.setParamObj(map, prefix + "CosAsset.", this.CosAsset);
        this.setParamArrayObj(map, prefix + "TopAsset.", this.TopAsset);
        this.setParamArrayObj(map, prefix + "CosDetail.", this.CosDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

