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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClustersRequest extends AbstractModel{

    /**
    * 按照一个或者多个实例ID查询。实例ID形如：`cluster-xxxxxxxx`
    */
    @SerializedName("DedicatedClusterIds")
    @Expose
    private String [] DedicatedClusterIds;

    /**
    * 按照可用区名称过滤
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 按照站点id过滤
    */
    @SerializedName("SiteIds")
    @Expose
    private String [] SiteIds;

    /**
    * 按照专用集群生命周期过滤
    */
    @SerializedName("LifecycleStatuses")
    @Expose
    private String [] LifecycleStatuses;

    /**
    * 模糊匹配专用集群名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 按照一个或者多个实例ID查询。实例ID形如：`cluster-xxxxxxxx` 
     * @return DedicatedClusterIds 按照一个或者多个实例ID查询。实例ID形如：`cluster-xxxxxxxx`
     */
    public String [] getDedicatedClusterIds() {
        return this.DedicatedClusterIds;
    }

    /**
     * Set 按照一个或者多个实例ID查询。实例ID形如：`cluster-xxxxxxxx`
     * @param DedicatedClusterIds 按照一个或者多个实例ID查询。实例ID形如：`cluster-xxxxxxxx`
     */
    public void setDedicatedClusterIds(String [] DedicatedClusterIds) {
        this.DedicatedClusterIds = DedicatedClusterIds;
    }

    /**
     * Get 按照可用区名称过滤 
     * @return Zones 按照可用区名称过滤
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 按照可用区名称过滤
     * @param Zones 按照可用区名称过滤
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 按照站点id过滤 
     * @return SiteIds 按照站点id过滤
     */
    public String [] getSiteIds() {
        return this.SiteIds;
    }

    /**
     * Set 按照站点id过滤
     * @param SiteIds 按照站点id过滤
     */
    public void setSiteIds(String [] SiteIds) {
        this.SiteIds = SiteIds;
    }

    /**
     * Get 按照专用集群生命周期过滤 
     * @return LifecycleStatuses 按照专用集群生命周期过滤
     */
    public String [] getLifecycleStatuses() {
        return this.LifecycleStatuses;
    }

    /**
     * Set 按照专用集群生命周期过滤
     * @param LifecycleStatuses 按照专用集群生命周期过滤
     */
    public void setLifecycleStatuses(String [] LifecycleStatuses) {
        this.LifecycleStatuses = LifecycleStatuses;
    }

    /**
     * Get 模糊匹配专用集群名称 
     * @return Name 模糊匹配专用集群名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模糊匹配专用集群名称
     * @param Name 模糊匹配专用集群名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDedicatedClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClustersRequest(DescribeDedicatedClustersRequest source) {
        if (source.DedicatedClusterIds != null) {
            this.DedicatedClusterIds = new String[source.DedicatedClusterIds.length];
            for (int i = 0; i < source.DedicatedClusterIds.length; i++) {
                this.DedicatedClusterIds[i] = new String(source.DedicatedClusterIds[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.SiteIds != null) {
            this.SiteIds = new String[source.SiteIds.length];
            for (int i = 0; i < source.SiteIds.length; i++) {
                this.SiteIds[i] = new String(source.SiteIds[i]);
            }
        }
        if (source.LifecycleStatuses != null) {
            this.LifecycleStatuses = new String[source.LifecycleStatuses.length];
            for (int i = 0; i < source.LifecycleStatuses.length; i++) {
                this.LifecycleStatuses[i] = new String(source.LifecycleStatuses[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DedicatedClusterIds.", this.DedicatedClusterIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArraySimple(map, prefix + "SiteIds.", this.SiteIds);
        this.setParamArraySimple(map, prefix + "LifecycleStatuses.", this.LifecycleStatuses);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

