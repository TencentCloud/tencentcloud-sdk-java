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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfo extends AbstractModel {

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群最大磁盘 单位GB
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * 集群最大带宽 单位MB/s
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * 集群当前可用磁盘  单位GB
    */
    @SerializedName("AvailableDiskSize")
    @Expose
    private Long AvailableDiskSize;

    /**
    * 集群当前可用带宽 单位MB/s
    */
    @SerializedName("AvailableBandWidth")
    @Expose
    private Long AvailableBandWidth;

    /**
    * 集群所属可用区，表明集群归属的可用区
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
     * Get 集群Id 
     * @return ClusterId 集群Id
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id
     * @param ClusterId 集群Id
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群最大磁盘 单位GB 
     * @return MaxDiskSize 集群最大磁盘 单位GB
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set 集群最大磁盘 单位GB
     * @param MaxDiskSize 集群最大磁盘 单位GB
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get 集群最大带宽 单位MB/s 
     * @return MaxBandWidth 集群最大带宽 单位MB/s
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set 集群最大带宽 单位MB/s
     * @param MaxBandWidth 集群最大带宽 单位MB/s
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get 集群当前可用磁盘  单位GB 
     * @return AvailableDiskSize 集群当前可用磁盘  单位GB
     */
    public Long getAvailableDiskSize() {
        return this.AvailableDiskSize;
    }

    /**
     * Set 集群当前可用磁盘  单位GB
     * @param AvailableDiskSize 集群当前可用磁盘  单位GB
     */
    public void setAvailableDiskSize(Long AvailableDiskSize) {
        this.AvailableDiskSize = AvailableDiskSize;
    }

    /**
     * Get 集群当前可用带宽 单位MB/s 
     * @return AvailableBandWidth 集群当前可用带宽 单位MB/s
     */
    public Long getAvailableBandWidth() {
        return this.AvailableBandWidth;
    }

    /**
     * Set 集群当前可用带宽 单位MB/s
     * @param AvailableBandWidth 集群当前可用带宽 单位MB/s
     */
    public void setAvailableBandWidth(Long AvailableBandWidth) {
        this.AvailableBandWidth = AvailableBandWidth;
    }

    /**
     * Get 集群所属可用区，表明集群归属的可用区 
     * @return ZoneId 集群所属可用区，表明集群归属的可用区
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 集群所属可用区，表明集群归属的可用区
     * @param ZoneId 集群所属可用区，表明集群归属的可用区
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。 
     * @return ZoneIds 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。
     * @param ZoneIds 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    public ClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfo(ClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.AvailableDiskSize != null) {
            this.AvailableDiskSize = new Long(source.AvailableDiskSize);
        }
        if (source.AvailableBandWidth != null) {
            this.AvailableBandWidth = new Long(source.AvailableBandWidth);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "AvailableDiskSize", this.AvailableDiskSize);
        this.setParamSimple(map, prefix + "AvailableBandWidth", this.AvailableBandWidth);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);

    }
}

