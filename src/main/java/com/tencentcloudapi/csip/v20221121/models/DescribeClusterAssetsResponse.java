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

public class DescribeClusterAssetsResponse extends AbstractModel {

    /**
    * 列表
    */
    @SerializedName("Data")
    @Expose
    private AssetCluster [] Data;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 集群类型枚举
    */
    @SerializedName("ClusterTypeList")
    @Expose
    private FilterDataObject [] ClusterTypeList;

    /**
    * 集群状态枚举
    */
    @SerializedName("ClusterStatusList")
    @Expose
    private FilterDataObject [] ClusterStatusList;

    /**
    * 组件状态枚举
    */
    @SerializedName("ComponentStatusList")
    @Expose
    private FilterDataObject [] ComponentStatusList;

    /**
    * 私有网络枚举
    */
    @SerializedName("VpcList")
    @Expose
    private FilterDataObject [] VpcList;

    /**
    * 地域枚举
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

    /**
    * 租户枚举
    */
    @SerializedName("AppIdList")
    @Expose
    private FilterDataObject [] AppIdList;

    /**
    * 集群防护状态枚举
    */
    @SerializedName("ProtectStatusList")
    @Expose
    private FilterDataObject [] ProtectStatusList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 列表 
     * @return Data 列表
     */
    public AssetCluster [] getData() {
        return this.Data;
    }

    /**
     * Set 列表
     * @param Data 列表
     */
    public void setData(AssetCluster [] Data) {
        this.Data = Data;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 集群类型枚举 
     * @return ClusterTypeList 集群类型枚举
     */
    public FilterDataObject [] getClusterTypeList() {
        return this.ClusterTypeList;
    }

    /**
     * Set 集群类型枚举
     * @param ClusterTypeList 集群类型枚举
     */
    public void setClusterTypeList(FilterDataObject [] ClusterTypeList) {
        this.ClusterTypeList = ClusterTypeList;
    }

    /**
     * Get 集群状态枚举 
     * @return ClusterStatusList 集群状态枚举
     */
    public FilterDataObject [] getClusterStatusList() {
        return this.ClusterStatusList;
    }

    /**
     * Set 集群状态枚举
     * @param ClusterStatusList 集群状态枚举
     */
    public void setClusterStatusList(FilterDataObject [] ClusterStatusList) {
        this.ClusterStatusList = ClusterStatusList;
    }

    /**
     * Get 组件状态枚举 
     * @return ComponentStatusList 组件状态枚举
     */
    public FilterDataObject [] getComponentStatusList() {
        return this.ComponentStatusList;
    }

    /**
     * Set 组件状态枚举
     * @param ComponentStatusList 组件状态枚举
     */
    public void setComponentStatusList(FilterDataObject [] ComponentStatusList) {
        this.ComponentStatusList = ComponentStatusList;
    }

    /**
     * Get 私有网络枚举 
     * @return VpcList 私有网络枚举
     */
    public FilterDataObject [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set 私有网络枚举
     * @param VpcList 私有网络枚举
     */
    public void setVpcList(FilterDataObject [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get 地域枚举 
     * @return RegionList 地域枚举
     */
    public FilterDataObject [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set 地域枚举
     * @param RegionList 地域枚举
     */
    public void setRegionList(FilterDataObject [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get 租户枚举 
     * @return AppIdList 租户枚举
     */
    public FilterDataObject [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set 租户枚举
     * @param AppIdList 租户枚举
     */
    public void setAppIdList(FilterDataObject [] AppIdList) {
        this.AppIdList = AppIdList;
    }

    /**
     * Get 集群防护状态枚举 
     * @return ProtectStatusList 集群防护状态枚举
     */
    public FilterDataObject [] getProtectStatusList() {
        return this.ProtectStatusList;
    }

    /**
     * Set 集群防护状态枚举
     * @param ProtectStatusList 集群防护状态枚举
     */
    public void setProtectStatusList(FilterDataObject [] ProtectStatusList) {
        this.ProtectStatusList = ProtectStatusList;
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

    public DescribeClusterAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterAssetsResponse(DescribeClusterAssetsResponse source) {
        if (source.Data != null) {
            this.Data = new AssetCluster[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new AssetCluster(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ClusterTypeList != null) {
            this.ClusterTypeList = new FilterDataObject[source.ClusterTypeList.length];
            for (int i = 0; i < source.ClusterTypeList.length; i++) {
                this.ClusterTypeList[i] = new FilterDataObject(source.ClusterTypeList[i]);
            }
        }
        if (source.ClusterStatusList != null) {
            this.ClusterStatusList = new FilterDataObject[source.ClusterStatusList.length];
            for (int i = 0; i < source.ClusterStatusList.length; i++) {
                this.ClusterStatusList[i] = new FilterDataObject(source.ClusterStatusList[i]);
            }
        }
        if (source.ComponentStatusList != null) {
            this.ComponentStatusList = new FilterDataObject[source.ComponentStatusList.length];
            for (int i = 0; i < source.ComponentStatusList.length; i++) {
                this.ComponentStatusList[i] = new FilterDataObject(source.ComponentStatusList[i]);
            }
        }
        if (source.VpcList != null) {
            this.VpcList = new FilterDataObject[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new FilterDataObject(source.VpcList[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new FilterDataObject[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new FilterDataObject(source.RegionList[i]);
            }
        }
        if (source.AppIdList != null) {
            this.AppIdList = new FilterDataObject[source.AppIdList.length];
            for (int i = 0; i < source.AppIdList.length; i++) {
                this.AppIdList[i] = new FilterDataObject(source.AppIdList[i]);
            }
        }
        if (source.ProtectStatusList != null) {
            this.ProtectStatusList = new FilterDataObject[source.ProtectStatusList.length];
            for (int i = 0; i < source.ProtectStatusList.length; i++) {
                this.ProtectStatusList[i] = new FilterDataObject(source.ProtectStatusList[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ClusterTypeList.", this.ClusterTypeList);
        this.setParamArrayObj(map, prefix + "ClusterStatusList.", this.ClusterStatusList);
        this.setParamArrayObj(map, prefix + "ComponentStatusList.", this.ComponentStatusList);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamArrayObj(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamArrayObj(map, prefix + "ProtectStatusList.", this.ProtectStatusList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

