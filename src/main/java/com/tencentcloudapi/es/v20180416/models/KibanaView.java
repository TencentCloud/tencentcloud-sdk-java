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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KibanaView extends AbstractModel{

    /**
    * Kibana节点IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 节点总磁盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 磁盘使用率
    */
    @SerializedName("DiskUsage")
    @Expose
    private Float DiskUsage;

    /**
    * 节点内存大小
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 内存使用率
    */
    @SerializedName("MemUsage")
    @Expose
    private Float MemUsage;

    /**
    * 节点cpu个数
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * cpu使用率
    */
    @SerializedName("CpuUsage")
    @Expose
    private Float CpuUsage;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Kibana节点IP 
     * @return Ip Kibana节点IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Kibana节点IP
     * @param Ip Kibana节点IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 节点总磁盘大小 
     * @return DiskSize 节点总磁盘大小
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 节点总磁盘大小
     * @param DiskSize 节点总磁盘大小
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 磁盘使用率 
     * @return DiskUsage 磁盘使用率
     */
    public Float getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 磁盘使用率
     * @param DiskUsage 磁盘使用率
     */
    public void setDiskUsage(Float DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 节点内存大小 
     * @return MemSize 节点内存大小
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 节点内存大小
     * @param MemSize 节点内存大小
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 内存使用率 
     * @return MemUsage 内存使用率
     */
    public Float getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set 内存使用率
     * @param MemUsage 内存使用率
     */
    public void setMemUsage(Float MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get 节点cpu个数 
     * @return CpuNum 节点cpu个数
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 节点cpu个数
     * @param CpuNum 节点cpu个数
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get cpu使用率 
     * @return CpuUsage cpu使用率
     */
    public Float getCpuUsage() {
        return this.CpuUsage;
    }

    /**
     * Set cpu使用率
     * @param CpuUsage cpu使用率
     */
    public void setCpuUsage(Float CpuUsage) {
        this.CpuUsage = CpuUsage;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public KibanaView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KibanaView(KibanaView source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new Float(source.DiskUsage);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemUsage != null) {
            this.MemUsage = new Float(source.MemUsage);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.CpuUsage != null) {
            this.CpuUsage = new Float(source.CpuUsage);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "CpuUsage", this.CpuUsage);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

