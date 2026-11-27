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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CageInfoItem extends AbstractModel {

    /**
    * <p>金融围拢ID、独享集群ID</p>
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * <p>可用区ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>金融围拢名称/独享集群名称</p>
    */
    @SerializedName("CageName")
    @Expose
    private String CageName;

    /**
    * <p>是否对外售卖</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>后端支持围拢发货的设备类型，normal/common</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>支持独享集群的可用区</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
     * Get <p>金融围拢ID、独享集群ID</p> 
     * @return CageId <p>金融围拢ID、独享集群ID</p>
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set <p>金融围拢ID、独享集群ID</p>
     * @param CageId <p>金融围拢ID、独享集群ID</p>
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * Get <p>可用区ID</p> 
     * @return ZoneId <p>可用区ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区ID</p>
     * @param ZoneId <p>可用区ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>金融围拢名称/独享集群名称</p> 
     * @return CageName <p>金融围拢名称/独享集群名称</p>
     */
    public String getCageName() {
        return this.CageName;
    }

    /**
     * Set <p>金融围拢名称/独享集群名称</p>
     * @param CageName <p>金融围拢名称/独享集群名称</p>
     */
    public void setCageName(String CageName) {
        this.CageName = CageName;
    }

    /**
     * Get <p>是否对外售卖</p> 
     * @return Status <p>是否对外售卖</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>是否对外售卖</p>
     * @param Status <p>是否对外售卖</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>后端支持围拢发货的设备类型，normal/common</p> 
     * @return DeviceType <p>后端支持围拢发货的设备类型，normal/common</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>后端支持围拢发货的设备类型，normal/common</p>
     * @param DeviceType <p>后端支持围拢发货的设备类型，normal/common</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>支持独享集群的可用区</p> 
     * @return ZoneIds <p>支持独享集群的可用区</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>支持独享集群的可用区</p>
     * @param ZoneIds <p>支持独享集群的可用区</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    public CageInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CageInfoItem(CageInfoItem source) {
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.CageName != null) {
            this.CageName = new String(source.CageName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
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
        this.setParamSimple(map, prefix + "CageId", this.CageId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "CageName", this.CageName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);

    }
}

