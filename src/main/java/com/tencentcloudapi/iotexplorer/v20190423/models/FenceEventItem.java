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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FenceEventItem extends AbstractModel{

    /**
    * 围栏事件的产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 围栏事件的设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 围栏Id
    */
    @SerializedName("FenceId")
    @Expose
    private Long FenceId;

    /**
    * 围栏事件的告警类型（In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警）
    */
    @SerializedName("AlertType")
    @Expose
    private String AlertType;

    /**
    * 围栏事件的设备位置信息
    */
    @SerializedName("Data")
    @Expose
    private FenceAlarmPoint Data;

    /**
     * Get 围栏事件的产品Id 
     * @return ProductId 围栏事件的产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 围栏事件的产品Id
     * @param ProductId 围栏事件的产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 围栏事件的设备名称 
     * @return DeviceName 围栏事件的设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 围栏事件的设备名称
     * @param DeviceName 围栏事件的设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 围栏Id 
     * @return FenceId 围栏Id
     */
    public Long getFenceId() {
        return this.FenceId;
    }

    /**
     * Set 围栏Id
     * @param FenceId 围栏Id
     */
    public void setFenceId(Long FenceId) {
        this.FenceId = FenceId;
    }

    /**
     * Get 围栏事件的告警类型（In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警） 
     * @return AlertType 围栏事件的告警类型（In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警）
     */
    public String getAlertType() {
        return this.AlertType;
    }

    /**
     * Set 围栏事件的告警类型（In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警）
     * @param AlertType 围栏事件的告警类型（In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警）
     */
    public void setAlertType(String AlertType) {
        this.AlertType = AlertType;
    }

    /**
     * Get 围栏事件的设备位置信息 
     * @return Data 围栏事件的设备位置信息
     */
    public FenceAlarmPoint getData() {
        return this.Data;
    }

    /**
     * Set 围栏事件的设备位置信息
     * @param Data 围栏事件的设备位置信息
     */
    public void setData(FenceAlarmPoint Data) {
        this.Data = Data;
    }

    public FenceEventItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FenceEventItem(FenceEventItem source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.FenceId != null) {
            this.FenceId = new Long(source.FenceId);
        }
        if (source.AlertType != null) {
            this.AlertType = new String(source.AlertType);
        }
        if (source.Data != null) {
            this.Data = new FenceAlarmPoint(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "FenceId", this.FenceId);
        this.setParamSimple(map, prefix + "AlertType", this.AlertType);
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

