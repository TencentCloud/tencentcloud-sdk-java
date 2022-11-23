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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHpcClustersRequest extends AbstractModel{

    /**
    * 高性能计算集群ID数组。
    */
    @SerializedName("HpcClusterIds")
    @Expose
    private String [] HpcClusterIds;

    /**
    * 高性能计算集群名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 偏移量, 默认值0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 本次请求量, 默认值20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 高性能计算集群ID数组。 
     * @return HpcClusterIds 高性能计算集群ID数组。
     */
    public String [] getHpcClusterIds() {
        return this.HpcClusterIds;
    }

    /**
     * Set 高性能计算集群ID数组。
     * @param HpcClusterIds 高性能计算集群ID数组。
     */
    public void setHpcClusterIds(String [] HpcClusterIds) {
        this.HpcClusterIds = HpcClusterIds;
    }

    /**
     * Get 高性能计算集群名称。 
     * @return Name 高性能计算集群名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 高性能计算集群名称。
     * @param Name 高性能计算集群名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 可用区。 
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 偏移量, 默认值0。 
     * @return Offset 偏移量, 默认值0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量, 默认值0。
     * @param Offset 偏移量, 默认值0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 本次请求量, 默认值20。 
     * @return Limit 本次请求量, 默认值20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 本次请求量, 默认值20。
     * @param Limit 本次请求量, 默认值20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeHpcClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHpcClustersRequest(DescribeHpcClustersRequest source) {
        if (source.HpcClusterIds != null) {
            this.HpcClusterIds = new String[source.HpcClusterIds.length];
            for (int i = 0; i < source.HpcClusterIds.length; i++) {
                this.HpcClusterIds[i] = new String(source.HpcClusterIds[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
        this.setParamArraySimple(map, prefix + "HpcClusterIds.", this.HpcClusterIds);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

