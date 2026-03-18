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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransferClusterZoneRequest extends AbstractModel {

    /**
    * 源集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 目标可用区
    */
    @SerializedName("DstZone")
    @Expose
    private String DstZone;

    /**
    * 跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms)
    */
    @SerializedName("MaxLag")
    @Expose
    private Long MaxLag;

    /**
    * Immediate:立即执行，InMaintain:时间窗口执行
    */
    @SerializedName("TransferType")
    @Expose
    private String TransferType;

    /**
    * 多可用区备区
    */
    @SerializedName("DstSlaveZone")
    @Expose
    private String DstSlaveZone;

    /**
    * proxy迁移的目标可用区信息
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
     * Get 源集群Id 
     * @return ClusterId 源集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 源集群Id
     * @param ClusterId 源集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 目标可用区 
     * @return DstZone 目标可用区
     */
    public String getDstZone() {
        return this.DstZone;
    }

    /**
     * Set 目标可用区
     * @param DstZone 目标可用区
     */
    public void setDstZone(String DstZone) {
        this.DstZone = DstZone;
    }

    /**
     * Get 跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms) 
     * @return MaxLag 跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms)
     */
    public Long getMaxLag() {
        return this.MaxLag;
    }

    /**
     * Set 跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms)
     * @param MaxLag 跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms)
     */
    public void setMaxLag(Long MaxLag) {
        this.MaxLag = MaxLag;
    }

    /**
     * Get Immediate:立即执行，InMaintain:时间窗口执行 
     * @return TransferType Immediate:立即执行，InMaintain:时间窗口执行
     */
    public String getTransferType() {
        return this.TransferType;
    }

    /**
     * Set Immediate:立即执行，InMaintain:时间窗口执行
     * @param TransferType Immediate:立即执行，InMaintain:时间窗口执行
     */
    public void setTransferType(String TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get 多可用区备区 
     * @return DstSlaveZone 多可用区备区
     */
    public String getDstSlaveZone() {
        return this.DstSlaveZone;
    }

    /**
     * Set 多可用区备区
     * @param DstSlaveZone 多可用区备区
     */
    public void setDstSlaveZone(String DstSlaveZone) {
        this.DstSlaveZone = DstSlaveZone;
    }

    /**
     * Get proxy迁移的目标可用区信息 
     * @return ProxyZones proxy迁移的目标可用区信息
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set proxy迁移的目标可用区信息
     * @param ProxyZones proxy迁移的目标可用区信息
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    public TransferClusterZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferClusterZoneRequest(TransferClusterZoneRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DstZone != null) {
            this.DstZone = new String(source.DstZone);
        }
        if (source.MaxLag != null) {
            this.MaxLag = new Long(source.MaxLag);
        }
        if (source.TransferType != null) {
            this.TransferType = new String(source.TransferType);
        }
        if (source.DstSlaveZone != null) {
            this.DstSlaveZone = new String(source.DstSlaveZone);
        }
        if (source.ProxyZones != null) {
            this.ProxyZones = new ProxyZone[source.ProxyZones.length];
            for (int i = 0; i < source.ProxyZones.length; i++) {
                this.ProxyZones[i] = new ProxyZone(source.ProxyZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DstZone", this.DstZone);
        this.setParamSimple(map, prefix + "MaxLag", this.MaxLag);
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamSimple(map, prefix + "DstSlaveZone", this.DstSlaveZone);
        this.setParamArrayObj(map, prefix + "ProxyZones.", this.ProxyZones);

    }
}

