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

public class HostResource extends AbstractModel{

    /**
    * 专用宿主机实例总cpu核数
    */
    @SerializedName("CpuTotal")
    @Expose
    private Long CpuTotal;

    /**
    * 专用宿主机实例可用cpu核数
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Long CpuAvailable;

    /**
    * 专用宿主机实例总内存大小（单位为:GiB）
    */
    @SerializedName("MemTotal")
    @Expose
    private Float MemTotal;

    /**
    * 专用宿主机实例可用内存大小（单位为:GiB）
    */
    @SerializedName("MemAvailable")
    @Expose
    private Float MemAvailable;

    /**
    * 专用宿主机实例总磁盘大小（单位为:GiB）
    */
    @SerializedName("DiskTotal")
    @Expose
    private Long DiskTotal;

    /**
    * 专用宿主机实例可用磁盘大小（单位为:GiB）
    */
    @SerializedName("DiskAvailable")
    @Expose
    private Long DiskAvailable;

    /**
    * 专用宿主机实例磁盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 专用宿主机实例总GPU卡数
    */
    @SerializedName("GpuTotal")
    @Expose
    private Long GpuTotal;

    /**
    * 专用宿主机实例可用GPU卡数
    */
    @SerializedName("GpuAvailable")
    @Expose
    private Long GpuAvailable;

    /**
     * Get 专用宿主机实例总cpu核数 
     * @return CpuTotal 专用宿主机实例总cpu核数
     */
    public Long getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set 专用宿主机实例总cpu核数
     * @param CpuTotal 专用宿主机实例总cpu核数
     */
    public void setCpuTotal(Long CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get 专用宿主机实例可用cpu核数 
     * @return CpuAvailable 专用宿主机实例可用cpu核数
     */
    public Long getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set 专用宿主机实例可用cpu核数
     * @param CpuAvailable 专用宿主机实例可用cpu核数
     */
    public void setCpuAvailable(Long CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get 专用宿主机实例总内存大小（单位为:GiB） 
     * @return MemTotal 专用宿主机实例总内存大小（单位为:GiB）
     */
    public Float getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set 专用宿主机实例总内存大小（单位为:GiB）
     * @param MemTotal 专用宿主机实例总内存大小（单位为:GiB）
     */
    public void setMemTotal(Float MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get 专用宿主机实例可用内存大小（单位为:GiB） 
     * @return MemAvailable 专用宿主机实例可用内存大小（单位为:GiB）
     */
    public Float getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set 专用宿主机实例可用内存大小（单位为:GiB）
     * @param MemAvailable 专用宿主机实例可用内存大小（单位为:GiB）
     */
    public void setMemAvailable(Float MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * Get 专用宿主机实例总磁盘大小（单位为:GiB） 
     * @return DiskTotal 专用宿主机实例总磁盘大小（单位为:GiB）
     */
    public Long getDiskTotal() {
        return this.DiskTotal;
    }

    /**
     * Set 专用宿主机实例总磁盘大小（单位为:GiB）
     * @param DiskTotal 专用宿主机实例总磁盘大小（单位为:GiB）
     */
    public void setDiskTotal(Long DiskTotal) {
        this.DiskTotal = DiskTotal;
    }

    /**
     * Get 专用宿主机实例可用磁盘大小（单位为:GiB） 
     * @return DiskAvailable 专用宿主机实例可用磁盘大小（单位为:GiB）
     */
    public Long getDiskAvailable() {
        return this.DiskAvailable;
    }

    /**
     * Set 专用宿主机实例可用磁盘大小（单位为:GiB）
     * @param DiskAvailable 专用宿主机实例可用磁盘大小（单位为:GiB）
     */
    public void setDiskAvailable(Long DiskAvailable) {
        this.DiskAvailable = DiskAvailable;
    }

    /**
     * Get 专用宿主机实例磁盘类型 
     * @return DiskType 专用宿主机实例磁盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 专用宿主机实例磁盘类型
     * @param DiskType 专用宿主机实例磁盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 专用宿主机实例总GPU卡数 
     * @return GpuTotal 专用宿主机实例总GPU卡数
     */
    public Long getGpuTotal() {
        return this.GpuTotal;
    }

    /**
     * Set 专用宿主机实例总GPU卡数
     * @param GpuTotal 专用宿主机实例总GPU卡数
     */
    public void setGpuTotal(Long GpuTotal) {
        this.GpuTotal = GpuTotal;
    }

    /**
     * Get 专用宿主机实例可用GPU卡数 
     * @return GpuAvailable 专用宿主机实例可用GPU卡数
     */
    public Long getGpuAvailable() {
        return this.GpuAvailable;
    }

    /**
     * Set 专用宿主机实例可用GPU卡数
     * @param GpuAvailable 专用宿主机实例可用GPU卡数
     */
    public void setGpuAvailable(Long GpuAvailable) {
        this.GpuAvailable = GpuAvailable;
    }

    public HostResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostResource(HostResource source) {
        if (source.CpuTotal != null) {
            this.CpuTotal = new Long(source.CpuTotal);
        }
        if (source.CpuAvailable != null) {
            this.CpuAvailable = new Long(source.CpuAvailable);
        }
        if (source.MemTotal != null) {
            this.MemTotal = new Float(source.MemTotal);
        }
        if (source.MemAvailable != null) {
            this.MemAvailable = new Float(source.MemAvailable);
        }
        if (source.DiskTotal != null) {
            this.DiskTotal = new Long(source.DiskTotal);
        }
        if (source.DiskAvailable != null) {
            this.DiskAvailable = new Long(source.DiskAvailable);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.GpuTotal != null) {
            this.GpuTotal = new Long(source.GpuTotal);
        }
        if (source.GpuAvailable != null) {
            this.GpuAvailable = new Long(source.GpuAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);
        this.setParamSimple(map, prefix + "DiskTotal", this.DiskTotal);
        this.setParamSimple(map, prefix + "DiskAvailable", this.DiskAvailable);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "GpuTotal", this.GpuTotal);
        this.setParamSimple(map, prefix + "GpuAvailable", this.GpuAvailable);

    }
}

