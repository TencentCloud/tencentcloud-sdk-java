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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterPodAssetsResponse extends AbstractModel{

    /**
    * 列表
    */
    @SerializedName("Data")
    @Expose
    private AssetClusterPod [] Data;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 集群pod状态枚举
    */
    @SerializedName("PodStatusList")
    @Expose
    private FilterDataObject [] PodStatusList;

    /**
    * 命名空间枚举
    */
    @SerializedName("NamespaceList")
    @Expose
    private FilterDataObject [] NamespaceList;

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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 列表 
     * @return Data 列表
     */
    public AssetClusterPod [] getData() {
        return this.Data;
    }

    /**
     * Set 列表
     * @param Data 列表
     */
    public void setData(AssetClusterPod [] Data) {
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
     * Get 集群pod状态枚举 
     * @return PodStatusList 集群pod状态枚举
     */
    public FilterDataObject [] getPodStatusList() {
        return this.PodStatusList;
    }

    /**
     * Set 集群pod状态枚举
     * @param PodStatusList 集群pod状态枚举
     */
    public void setPodStatusList(FilterDataObject [] PodStatusList) {
        this.PodStatusList = PodStatusList;
    }

    /**
     * Get 命名空间枚举 
     * @return NamespaceList 命名空间枚举
     */
    public FilterDataObject [] getNamespaceList() {
        return this.NamespaceList;
    }

    /**
     * Set 命名空间枚举
     * @param NamespaceList 命名空间枚举
     */
    public void setNamespaceList(FilterDataObject [] NamespaceList) {
        this.NamespaceList = NamespaceList;
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

    public DescribeClusterPodAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterPodAssetsResponse(DescribeClusterPodAssetsResponse source) {
        if (source.Data != null) {
            this.Data = new AssetClusterPod[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new AssetClusterPod(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PodStatusList != null) {
            this.PodStatusList = new FilterDataObject[source.PodStatusList.length];
            for (int i = 0; i < source.PodStatusList.length; i++) {
                this.PodStatusList[i] = new FilterDataObject(source.PodStatusList[i]);
            }
        }
        if (source.NamespaceList != null) {
            this.NamespaceList = new FilterDataObject[source.NamespaceList.length];
            for (int i = 0; i < source.NamespaceList.length; i++) {
                this.NamespaceList[i] = new FilterDataObject(source.NamespaceList[i]);
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
        this.setParamArrayObj(map, prefix + "PodStatusList.", this.PodStatusList);
        this.setParamArrayObj(map, prefix + "NamespaceList.", this.NamespaceList);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamArrayObj(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

