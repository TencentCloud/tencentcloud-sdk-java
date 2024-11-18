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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetViewVulRiskListResponse extends AbstractModel {

    /**
    * 总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 资产视角的漏洞风险列表
    */
    @SerializedName("Data")
    @Expose
    private AssetViewVULRiskData [] Data;

    /**
    * 状态列表
    */
    @SerializedName("StatusLists")
    @Expose
    private FilterDataObject [] StatusLists;

    /**
    * 危险等级列表
    */
    @SerializedName("LevelLists")
    @Expose
    private FilterDataObject [] LevelLists;

    /**
    * 来源列表
    */
    @SerializedName("FromLists")
    @Expose
    private FilterDataObject [] FromLists;

    /**
    * 漏洞类型列表
    */
    @SerializedName("VULTypeLists")
    @Expose
    private FilterDataObject [] VULTypeLists;

    /**
    * 资产类型列表
    */
    @SerializedName("InstanceTypeLists")
    @Expose
    private FilterDataObject [] InstanceTypeLists;

    /**
    * tag枚举
    */
    @SerializedName("Tags")
    @Expose
    private FilterDataObject [] Tags;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数 
     * @return TotalCount 总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数
     * @param TotalCount 总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 资产视角的漏洞风险列表 
     * @return Data 资产视角的漏洞风险列表
     */
    public AssetViewVULRiskData [] getData() {
        return this.Data;
    }

    /**
     * Set 资产视角的漏洞风险列表
     * @param Data 资产视角的漏洞风险列表
     */
    public void setData(AssetViewVULRiskData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 状态列表 
     * @return StatusLists 状态列表
     */
    public FilterDataObject [] getStatusLists() {
        return this.StatusLists;
    }

    /**
     * Set 状态列表
     * @param StatusLists 状态列表
     */
    public void setStatusLists(FilterDataObject [] StatusLists) {
        this.StatusLists = StatusLists;
    }

    /**
     * Get 危险等级列表 
     * @return LevelLists 危险等级列表
     */
    public FilterDataObject [] getLevelLists() {
        return this.LevelLists;
    }

    /**
     * Set 危险等级列表
     * @param LevelLists 危险等级列表
     */
    public void setLevelLists(FilterDataObject [] LevelLists) {
        this.LevelLists = LevelLists;
    }

    /**
     * Get 来源列表 
     * @return FromLists 来源列表
     */
    public FilterDataObject [] getFromLists() {
        return this.FromLists;
    }

    /**
     * Set 来源列表
     * @param FromLists 来源列表
     */
    public void setFromLists(FilterDataObject [] FromLists) {
        this.FromLists = FromLists;
    }

    /**
     * Get 漏洞类型列表 
     * @return VULTypeLists 漏洞类型列表
     */
    public FilterDataObject [] getVULTypeLists() {
        return this.VULTypeLists;
    }

    /**
     * Set 漏洞类型列表
     * @param VULTypeLists 漏洞类型列表
     */
    public void setVULTypeLists(FilterDataObject [] VULTypeLists) {
        this.VULTypeLists = VULTypeLists;
    }

    /**
     * Get 资产类型列表 
     * @return InstanceTypeLists 资产类型列表
     */
    public FilterDataObject [] getInstanceTypeLists() {
        return this.InstanceTypeLists;
    }

    /**
     * Set 资产类型列表
     * @param InstanceTypeLists 资产类型列表
     */
    public void setInstanceTypeLists(FilterDataObject [] InstanceTypeLists) {
        this.InstanceTypeLists = InstanceTypeLists;
    }

    /**
     * Get tag枚举 
     * @return Tags tag枚举
     */
    public FilterDataObject [] getTags() {
        return this.Tags;
    }

    /**
     * Set tag枚举
     * @param Tags tag枚举
     */
    public void setTags(FilterDataObject [] Tags) {
        this.Tags = Tags;
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

    public DescribeAssetViewVulRiskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetViewVulRiskListResponse(DescribeAssetViewVulRiskListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new AssetViewVULRiskData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new AssetViewVULRiskData(source.Data[i]);
            }
        }
        if (source.StatusLists != null) {
            this.StatusLists = new FilterDataObject[source.StatusLists.length];
            for (int i = 0; i < source.StatusLists.length; i++) {
                this.StatusLists[i] = new FilterDataObject(source.StatusLists[i]);
            }
        }
        if (source.LevelLists != null) {
            this.LevelLists = new FilterDataObject[source.LevelLists.length];
            for (int i = 0; i < source.LevelLists.length; i++) {
                this.LevelLists[i] = new FilterDataObject(source.LevelLists[i]);
            }
        }
        if (source.FromLists != null) {
            this.FromLists = new FilterDataObject[source.FromLists.length];
            for (int i = 0; i < source.FromLists.length; i++) {
                this.FromLists[i] = new FilterDataObject(source.FromLists[i]);
            }
        }
        if (source.VULTypeLists != null) {
            this.VULTypeLists = new FilterDataObject[source.VULTypeLists.length];
            for (int i = 0; i < source.VULTypeLists.length; i++) {
                this.VULTypeLists[i] = new FilterDataObject(source.VULTypeLists[i]);
            }
        }
        if (source.InstanceTypeLists != null) {
            this.InstanceTypeLists = new FilterDataObject[source.InstanceTypeLists.length];
            for (int i = 0; i < source.InstanceTypeLists.length; i++) {
                this.InstanceTypeLists[i] = new FilterDataObject(source.InstanceTypeLists[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new FilterDataObject[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new FilterDataObject(source.Tags[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "StatusLists.", this.StatusLists);
        this.setParamArrayObj(map, prefix + "LevelLists.", this.LevelLists);
        this.setParamArrayObj(map, prefix + "FromLists.", this.FromLists);
        this.setParamArrayObj(map, prefix + "VULTypeLists.", this.VULTypeLists);
        this.setParamArrayObj(map, prefix + "InstanceTypeLists.", this.InstanceTypeLists);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

