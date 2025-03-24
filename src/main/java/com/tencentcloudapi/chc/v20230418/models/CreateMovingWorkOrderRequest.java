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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMovingWorkOrderRequest extends AbstractModel {

    /**
    * 机房id
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 设备类型，server, netDevice
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 上架后是否开电
    */
    @SerializedName("WithPowerOn")
    @Expose
    private Boolean WithPowerOn;

    /**
    * 设备搬迁信息列表
    */
    @SerializedName("DeviceMovingList")
    @Expose
    private DeviceRackOn [] DeviceMovingList;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 机房id 
     * @return IdcId 机房id
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 机房id
     * @param IdcId 机房id
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get 设备类型，server, netDevice 
     * @return DeviceType 设备类型，server, netDevice
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型，server, netDevice
     * @param DeviceType 设备类型，server, netDevice
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 上架后是否开电 
     * @return WithPowerOn 上架后是否开电
     */
    public Boolean getWithPowerOn() {
        return this.WithPowerOn;
    }

    /**
     * Set 上架后是否开电
     * @param WithPowerOn 上架后是否开电
     */
    public void setWithPowerOn(Boolean WithPowerOn) {
        this.WithPowerOn = WithPowerOn;
    }

    /**
     * Get 设备搬迁信息列表 
     * @return DeviceMovingList 设备搬迁信息列表
     */
    public DeviceRackOn [] getDeviceMovingList() {
        return this.DeviceMovingList;
    }

    /**
     * Set 设备搬迁信息列表
     * @param DeviceMovingList 设备搬迁信息列表
     */
    public void setDeviceMovingList(DeviceRackOn [] DeviceMovingList) {
        this.DeviceMovingList = DeviceMovingList;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateMovingWorkOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMovingWorkOrderRequest(CreateMovingWorkOrderRequest source) {
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.WithPowerOn != null) {
            this.WithPowerOn = new Boolean(source.WithPowerOn);
        }
        if (source.DeviceMovingList != null) {
            this.DeviceMovingList = new DeviceRackOn[source.DeviceMovingList.length];
            for (int i = 0; i < source.DeviceMovingList.length; i++) {
                this.DeviceMovingList[i] = new DeviceRackOn(source.DeviceMovingList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "WithPowerOn", this.WithPowerOn);
        this.setParamArrayObj(map, prefix + "DeviceMovingList.", this.DeviceMovingList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

