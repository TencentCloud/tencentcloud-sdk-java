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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetListResponse extends AbstractModel{

    /**
    * 资产列表
    */
    @SerializedName("AssetList")
    @Expose
    private AssetList AssetList;

    /**
    * 聚合数据
    */
    @SerializedName("AggregationData")
    @Expose
    private AggregationObj [] AggregationData;

    /**
    * 命名空间数据
    */
    @SerializedName("NamespaceData")
    @Expose
    private String [] NamespaceData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资产列表 
     * @return AssetList 资产列表
     */
    public AssetList getAssetList() {
        return this.AssetList;
    }

    /**
     * Set 资产列表
     * @param AssetList 资产列表
     */
    public void setAssetList(AssetList AssetList) {
        this.AssetList = AssetList;
    }

    /**
     * Get 聚合数据 
     * @return AggregationData 聚合数据
     */
    public AggregationObj [] getAggregationData() {
        return this.AggregationData;
    }

    /**
     * Set 聚合数据
     * @param AggregationData 聚合数据
     */
    public void setAggregationData(AggregationObj [] AggregationData) {
        this.AggregationData = AggregationData;
    }

    /**
     * Get 命名空间数据 
     * @return NamespaceData 命名空间数据
     */
    public String [] getNamespaceData() {
        return this.NamespaceData;
    }

    /**
     * Set 命名空间数据
     * @param NamespaceData 命名空间数据
     */
    public void setNamespaceData(String [] NamespaceData) {
        this.NamespaceData = NamespaceData;
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

    public DescribeAssetListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetListResponse(DescribeAssetListResponse source) {
        if (source.AssetList != null) {
            this.AssetList = new AssetList(source.AssetList);
        }
        if (source.AggregationData != null) {
            this.AggregationData = new AggregationObj[source.AggregationData.length];
            for (int i = 0; i < source.AggregationData.length; i++) {
                this.AggregationData[i] = new AggregationObj(source.AggregationData[i]);
            }
        }
        if (source.NamespaceData != null) {
            this.NamespaceData = new String[source.NamespaceData.length];
            for (int i = 0; i < source.NamespaceData.length; i++) {
                this.NamespaceData[i] = new String(source.NamespaceData[i]);
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
        this.setParamObj(map, prefix + "AssetList.", this.AssetList);
        this.setParamArrayObj(map, prefix + "AggregationData.", this.AggregationData);
        this.setParamArraySimple(map, prefix + "NamespaceData.", this.NamespaceData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

