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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KibanaView extends AbstractModel {

    /**
    * <p>Kibana节点IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>节点总磁盘大小</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>磁盘使用率</p>
    */
    @SerializedName("DiskUsage")
    @Expose
    private Float DiskUsage;

    /**
    * <p>节点内存大小</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>内存使用率</p>
    */
    @SerializedName("MemUsage")
    @Expose
    private Float MemUsage;

    /**
    * <p>节点cpu个数</p>
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * <p>cpu使用率</p>
    */
    @SerializedName("CpuUsage")
    @Expose
    private Float CpuUsage;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>ts-0noqayxu-az6-hot-03222010-0</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>客户侧Ip信息</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
     * Get <p>Kibana节点IP</p> 
     * @return Ip <p>Kibana节点IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Kibana节点IP</p>
     * @param Ip <p>Kibana节点IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>节点总磁盘大小</p> 
     * @return DiskSize <p>节点总磁盘大小</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>节点总磁盘大小</p>
     * @param DiskSize <p>节点总磁盘大小</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>磁盘使用率</p> 
     * @return DiskUsage <p>磁盘使用率</p>
     */
    public Float getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set <p>磁盘使用率</p>
     * @param DiskUsage <p>磁盘使用率</p>
     */
    public void setDiskUsage(Float DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get <p>节点内存大小</p> 
     * @return MemSize <p>节点内存大小</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>节点内存大小</p>
     * @param MemSize <p>节点内存大小</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>内存使用率</p> 
     * @return MemUsage <p>内存使用率</p>
     */
    public Float getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set <p>内存使用率</p>
     * @param MemUsage <p>内存使用率</p>
     */
    public void setMemUsage(Float MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get <p>节点cpu个数</p> 
     * @return CpuNum <p>节点cpu个数</p>
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set <p>节点cpu个数</p>
     * @param CpuNum <p>节点cpu个数</p>
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get <p>cpu使用率</p> 
     * @return CpuUsage <p>cpu使用率</p>
     */
    public Float getCpuUsage() {
        return this.CpuUsage;
    }

    /**
     * Set <p>cpu使用率</p>
     * @param CpuUsage <p>cpu使用率</p>
     */
    public void setCpuUsage(Float CpuUsage) {
        this.CpuUsage = CpuUsage;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>ts-0noqayxu-az6-hot-03222010-0</p> 
     * @return NodeId <p>ts-0noqayxu-az6-hot-03222010-0</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>ts-0noqayxu-az6-hot-03222010-0</p>
     * @param NodeId <p>ts-0noqayxu-az6-hot-03222010-0</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>客户侧Ip信息</p> 
     * @return UserIp <p>客户侧Ip信息</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>客户侧Ip信息</p>
     * @param UserIp <p>客户侧Ip信息</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
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
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
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
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);

    }
}

