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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatDeviceType extends AbstractModel {

    /**
    * 汇总数。在线（正常+故障） + 离线
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 正常数
    */
    @SerializedName("Normal")
    @Expose
    private Long Normal;

    /**
    * 离线数
    */
    @SerializedName("Offline")
    @Expose
    private Long Offline;

    /**
    * 故障数
    */
    @SerializedName("Fault")
    @Expose
    private Long Fault;

    /**
    * 设备名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 汇总数。在线（正常+故障） + 离线 
     * @return Total 汇总数。在线（正常+故障） + 离线
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 汇总数。在线（正常+故障） + 离线
     * @param Total 汇总数。在线（正常+故障） + 离线
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 正常数 
     * @return Normal 正常数
     */
    public Long getNormal() {
        return this.Normal;
    }

    /**
     * Set 正常数
     * @param Normal 正常数
     */
    public void setNormal(Long Normal) {
        this.Normal = Normal;
    }

    /**
     * Get 离线数 
     * @return Offline 离线数
     */
    public Long getOffline() {
        return this.Offline;
    }

    /**
     * Set 离线数
     * @param Offline 离线数
     */
    public void setOffline(Long Offline) {
        this.Offline = Offline;
    }

    /**
     * Get 故障数 
     * @return Fault 故障数
     */
    public Long getFault() {
        return this.Fault;
    }

    /**
     * Set 故障数
     * @param Fault 故障数
     */
    public void setFault(Long Fault) {
        this.Fault = Fault;
    }

    /**
     * Get 设备名 
     * @return Name 设备名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备名
     * @param Name 设备名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备类型 
     * @return DeviceType 设备类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型
     * @param DeviceType 设备类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public StatDeviceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatDeviceType(StatDeviceType source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Normal != null) {
            this.Normal = new Long(source.Normal);
        }
        if (source.Offline != null) {
            this.Offline = new Long(source.Offline);
        }
        if (source.Fault != null) {
            this.Fault = new Long(source.Fault);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Normal", this.Normal);
        this.setParamSimple(map, prefix + "Offline", this.Offline);
        this.setParamSimple(map, prefix + "Fault", this.Fault);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

