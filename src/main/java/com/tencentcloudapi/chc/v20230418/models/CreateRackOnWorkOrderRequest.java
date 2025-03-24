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

public class CreateRackOnWorkOrderRequest extends AbstractModel {

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
    * 上架人员 1.自行解决 2.由腾讯IDC负责
    */
    @SerializedName("StuffOption")
    @Expose
    private String StuffOption;

    /**
    * 上架后是否开电
    */
    @SerializedName("WithPowerOn")
    @Expose
    private Boolean WithPowerOn;

    /**
    * 服务器收货列表
    */
    @SerializedName("DeviceRackOnList")
    @Expose
    private DeviceRackOn [] DeviceRackOnList;

    /**
    * 自行解决必填
    */
    @SerializedName("SelfOperationInfo")
    @Expose
    private SelfOperation SelfOperationInfo;

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
     * Get 上架人员 1.自行解决 2.由腾讯IDC负责 
     * @return StuffOption 上架人员 1.自行解决 2.由腾讯IDC负责
     */
    public String getStuffOption() {
        return this.StuffOption;
    }

    /**
     * Set 上架人员 1.自行解决 2.由腾讯IDC负责
     * @param StuffOption 上架人员 1.自行解决 2.由腾讯IDC负责
     */
    public void setStuffOption(String StuffOption) {
        this.StuffOption = StuffOption;
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
     * Get 服务器收货列表 
     * @return DeviceRackOnList 服务器收货列表
     */
    public DeviceRackOn [] getDeviceRackOnList() {
        return this.DeviceRackOnList;
    }

    /**
     * Set 服务器收货列表
     * @param DeviceRackOnList 服务器收货列表
     */
    public void setDeviceRackOnList(DeviceRackOn [] DeviceRackOnList) {
        this.DeviceRackOnList = DeviceRackOnList;
    }

    /**
     * Get 自行解决必填 
     * @return SelfOperationInfo 自行解决必填
     */
    public SelfOperation getSelfOperationInfo() {
        return this.SelfOperationInfo;
    }

    /**
     * Set 自行解决必填
     * @param SelfOperationInfo 自行解决必填
     */
    public void setSelfOperationInfo(SelfOperation SelfOperationInfo) {
        this.SelfOperationInfo = SelfOperationInfo;
    }

    public CreateRackOnWorkOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRackOnWorkOrderRequest(CreateRackOnWorkOrderRequest source) {
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.StuffOption != null) {
            this.StuffOption = new String(source.StuffOption);
        }
        if (source.WithPowerOn != null) {
            this.WithPowerOn = new Boolean(source.WithPowerOn);
        }
        if (source.DeviceRackOnList != null) {
            this.DeviceRackOnList = new DeviceRackOn[source.DeviceRackOnList.length];
            for (int i = 0; i < source.DeviceRackOnList.length; i++) {
                this.DeviceRackOnList[i] = new DeviceRackOn(source.DeviceRackOnList[i]);
            }
        }
        if (source.SelfOperationInfo != null) {
            this.SelfOperationInfo = new SelfOperation(source.SelfOperationInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "StuffOption", this.StuffOption);
        this.setParamSimple(map, prefix + "WithPowerOn", this.WithPowerOn);
        this.setParamArrayObj(map, prefix + "DeviceRackOnList.", this.DeviceRackOnList);
        this.setParamObj(map, prefix + "SelfOperationInfo.", this.SelfOperationInfo);

    }
}

