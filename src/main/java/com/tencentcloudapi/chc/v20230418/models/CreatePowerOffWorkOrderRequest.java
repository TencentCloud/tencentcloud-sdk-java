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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePowerOffWorkOrderRequest extends AbstractModel {

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
    * 关电确认，1.授权时关电 2.关电前需要确认
    */
    @SerializedName("IsPowerOffConfirm")
    @Expose
    private String IsPowerOffConfirm;

    /**
    * 设备sn列表
    */
    @SerializedName("DeviceSnList")
    @Expose
    private String [] DeviceSnList;

    /**
    * 关电前需要确认时必填
    */
    @SerializedName("PowerOffConfirmInfo")
    @Expose
    private PowerOffConfirm PowerOffConfirmInfo;

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
     * Get 关电确认，1.授权时关电 2.关电前需要确认 
     * @return IsPowerOffConfirm 关电确认，1.授权时关电 2.关电前需要确认
     */
    public String getIsPowerOffConfirm() {
        return this.IsPowerOffConfirm;
    }

    /**
     * Set 关电确认，1.授权时关电 2.关电前需要确认
     * @param IsPowerOffConfirm 关电确认，1.授权时关电 2.关电前需要确认
     */
    public void setIsPowerOffConfirm(String IsPowerOffConfirm) {
        this.IsPowerOffConfirm = IsPowerOffConfirm;
    }

    /**
     * Get 设备sn列表 
     * @return DeviceSnList 设备sn列表
     */
    public String [] getDeviceSnList() {
        return this.DeviceSnList;
    }

    /**
     * Set 设备sn列表
     * @param DeviceSnList 设备sn列表
     */
    public void setDeviceSnList(String [] DeviceSnList) {
        this.DeviceSnList = DeviceSnList;
    }

    /**
     * Get 关电前需要确认时必填 
     * @return PowerOffConfirmInfo 关电前需要确认时必填
     */
    public PowerOffConfirm getPowerOffConfirmInfo() {
        return this.PowerOffConfirmInfo;
    }

    /**
     * Set 关电前需要确认时必填
     * @param PowerOffConfirmInfo 关电前需要确认时必填
     */
    public void setPowerOffConfirmInfo(PowerOffConfirm PowerOffConfirmInfo) {
        this.PowerOffConfirmInfo = PowerOffConfirmInfo;
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

    public CreatePowerOffWorkOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePowerOffWorkOrderRequest(CreatePowerOffWorkOrderRequest source) {
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.IsPowerOffConfirm != null) {
            this.IsPowerOffConfirm = new String(source.IsPowerOffConfirm);
        }
        if (source.DeviceSnList != null) {
            this.DeviceSnList = new String[source.DeviceSnList.length];
            for (int i = 0; i < source.DeviceSnList.length; i++) {
                this.DeviceSnList[i] = new String(source.DeviceSnList[i]);
            }
        }
        if (source.PowerOffConfirmInfo != null) {
            this.PowerOffConfirmInfo = new PowerOffConfirm(source.PowerOffConfirmInfo);
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
        this.setParamSimple(map, prefix + "IsPowerOffConfirm", this.IsPowerOffConfirm);
        this.setParamArraySimple(map, prefix + "DeviceSnList.", this.DeviceSnList);
        this.setParamObj(map, prefix + "PowerOffConfirmInfo.", this.PowerOffConfirmInfo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

