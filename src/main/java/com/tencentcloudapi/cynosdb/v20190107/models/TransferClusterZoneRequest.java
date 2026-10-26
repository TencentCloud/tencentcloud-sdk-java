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
    * <p>源集群Id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>目标可用区</p>
    */
    @SerializedName("DstZone")
    @Expose
    private String DstZone;

    /**
    * <p>跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms)</p>
    */
    @SerializedName("MaxLag")
    @Expose
    private Long MaxLag;

    /**
    * <p>Immediate:立即执行，InMaintain:时间窗口执行</p>
    */
    @SerializedName("TransferType")
    @Expose
    private String TransferType;

    /**
    * <p>多可用区备区</p>
    */
    @SerializedName("DstSlaveZone")
    @Expose
    private String DstSlaveZone;

    /**
    * <p>proxy迁移的目标可用区信息</p>
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
     * Get <p>源集群Id</p> 
     * @return ClusterId <p>源集群Id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>源集群Id</p>
     * @param ClusterId <p>源集群Id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>目标可用区</p> 
     * @return DstZone <p>目标可用区</p>
     */
    public String getDstZone() {
        return this.DstZone;
    }

    /**
     * Set <p>目标可用区</p>
     * @param DstZone <p>目标可用区</p>
     */
    public void setDstZone(String DstZone) {
        this.DstZone = DstZone;
    }

    /**
     * Get <p>跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms)</p> 
     * @return MaxLag <p>跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms)</p>
     */
    public Long getMaxLag() {
        return this.MaxLag;
    }

    /**
     * Set <p>跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms)</p>
     * @param MaxLag <p>跨可用区迁移主从数据延迟校验阈值，单位毫秒(ms)</p>
     */
    public void setMaxLag(Long MaxLag) {
        this.MaxLag = MaxLag;
    }

    /**
     * Get <p>Immediate:立即执行，InMaintain:时间窗口执行</p> 
     * @return TransferType <p>Immediate:立即执行，InMaintain:时间窗口执行</p>
     */
    public String getTransferType() {
        return this.TransferType;
    }

    /**
     * Set <p>Immediate:立即执行，InMaintain:时间窗口执行</p>
     * @param TransferType <p>Immediate:立即执行，InMaintain:时间窗口执行</p>
     */
    public void setTransferType(String TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get <p>多可用区备区</p> 
     * @return DstSlaveZone <p>多可用区备区</p>
     */
    public String getDstSlaveZone() {
        return this.DstSlaveZone;
    }

    /**
     * Set <p>多可用区备区</p>
     * @param DstSlaveZone <p>多可用区备区</p>
     */
    public void setDstSlaveZone(String DstSlaveZone) {
        this.DstSlaveZone = DstSlaveZone;
    }

    /**
     * Get <p>proxy迁移的目标可用区信息</p> 
     * @return ProxyZones <p>proxy迁移的目标可用区信息</p>
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set <p>proxy迁移的目标可用区信息</p>
     * @param ProxyZones <p>proxy迁移的目标可用区信息</p>
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

