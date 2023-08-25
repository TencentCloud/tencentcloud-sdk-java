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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeESAssetSensitiveDistributionResponse extends AbstractModel{

    /**
    * ES的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ESAsset")
    @Expose
    private ESAsset ESAsset;

    /**
    * 涉敏top数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopAsset")
    @Expose
    private TopAsset [] TopAsset;

    /**
    * ES的详情列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ESDetail")
    @Expose
    private ESAssetDBDetail [] ESDetail;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ES的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ESAsset ES的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ESAsset getESAsset() {
        return this.ESAsset;
    }

    /**
     * Set ES的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ESAsset ES的资产统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setESAsset(ESAsset ESAsset) {
        this.ESAsset = ESAsset;
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
     * Get ES的详情列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ESDetail ES的详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ESAssetDBDetail [] getESDetail() {
        return this.ESDetail;
    }

    /**
     * Set ES的详情列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ESDetail ES的详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setESDetail(ESAssetDBDetail [] ESDetail) {
        this.ESDetail = ESDetail;
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

    public DescribeESAssetSensitiveDistributionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeESAssetSensitiveDistributionResponse(DescribeESAssetSensitiveDistributionResponse source) {
        if (source.ESAsset != null) {
            this.ESAsset = new ESAsset(source.ESAsset);
        }
        if (source.TopAsset != null) {
            this.TopAsset = new TopAsset[source.TopAsset.length];
            for (int i = 0; i < source.TopAsset.length; i++) {
                this.TopAsset[i] = new TopAsset(source.TopAsset[i]);
            }
        }
        if (source.ESDetail != null) {
            this.ESDetail = new ESAssetDBDetail[source.ESDetail.length];
            for (int i = 0; i < source.ESDetail.length; i++) {
                this.ESDetail[i] = new ESAssetDBDetail(source.ESDetail[i]);
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
        this.setParamObj(map, prefix + "ESAsset.", this.ESAsset);
        this.setParamArrayObj(map, prefix + "TopAsset.", this.TopAsset);
        this.setParamArrayObj(map, prefix + "ESDetail.", this.ESDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

