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

public class ServerReceivingInfo extends AbstractModel {

    /**
    * 设备sn
    */
    @SerializedName("DeviceSn")
    @Expose
    private String DeviceSn;

    /**
    * 设备型号-版本
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 需要万兆机位
    */
    @SerializedName("Need10GbSlot")
    @Expose
    private String Need10GbSlot;

    /**
    * 需要直流电
    */
    @SerializedName("NeedDCPower")
    @Expose
    private String NeedDCPower;

    /**
    * 需要外网
    */
    @SerializedName("NeedExtranet")
    @Expose
    private String NeedExtranet;

    /**
    * 需要虚拟化
    */
    @SerializedName("NeedVirtualization")
    @Expose
    private String NeedVirtualization;

    /**
    * 硬件备注
    */
    @SerializedName("HardwareMemo")
    @Expose
    private String HardwareMemo;

    /**
     * Get 设备sn 
     * @return DeviceSn 设备sn
     */
    public String getDeviceSn() {
        return this.DeviceSn;
    }

    /**
     * Set 设备sn
     * @param DeviceSn 设备sn
     */
    public void setDeviceSn(String DeviceSn) {
        this.DeviceSn = DeviceSn;
    }

    /**
     * Get 设备型号-版本 
     * @return ModelVersion 设备型号-版本
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 设备型号-版本
     * @param ModelVersion 设备型号-版本
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 需要万兆机位 
     * @return Need10GbSlot 需要万兆机位
     */
    public String getNeed10GbSlot() {
        return this.Need10GbSlot;
    }

    /**
     * Set 需要万兆机位
     * @param Need10GbSlot 需要万兆机位
     */
    public void setNeed10GbSlot(String Need10GbSlot) {
        this.Need10GbSlot = Need10GbSlot;
    }

    /**
     * Get 需要直流电 
     * @return NeedDCPower 需要直流电
     */
    public String getNeedDCPower() {
        return this.NeedDCPower;
    }

    /**
     * Set 需要直流电
     * @param NeedDCPower 需要直流电
     */
    public void setNeedDCPower(String NeedDCPower) {
        this.NeedDCPower = NeedDCPower;
    }

    /**
     * Get 需要外网 
     * @return NeedExtranet 需要外网
     */
    public String getNeedExtranet() {
        return this.NeedExtranet;
    }

    /**
     * Set 需要外网
     * @param NeedExtranet 需要外网
     */
    public void setNeedExtranet(String NeedExtranet) {
        this.NeedExtranet = NeedExtranet;
    }

    /**
     * Get 需要虚拟化 
     * @return NeedVirtualization 需要虚拟化
     */
    public String getNeedVirtualization() {
        return this.NeedVirtualization;
    }

    /**
     * Set 需要虚拟化
     * @param NeedVirtualization 需要虚拟化
     */
    public void setNeedVirtualization(String NeedVirtualization) {
        this.NeedVirtualization = NeedVirtualization;
    }

    /**
     * Get 硬件备注 
     * @return HardwareMemo 硬件备注
     */
    public String getHardwareMemo() {
        return this.HardwareMemo;
    }

    /**
     * Set 硬件备注
     * @param HardwareMemo 硬件备注
     */
    public void setHardwareMemo(String HardwareMemo) {
        this.HardwareMemo = HardwareMemo;
    }

    public ServerReceivingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerReceivingInfo(ServerReceivingInfo source) {
        if (source.DeviceSn != null) {
            this.DeviceSn = new String(source.DeviceSn);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.Need10GbSlot != null) {
            this.Need10GbSlot = new String(source.Need10GbSlot);
        }
        if (source.NeedDCPower != null) {
            this.NeedDCPower = new String(source.NeedDCPower);
        }
        if (source.NeedExtranet != null) {
            this.NeedExtranet = new String(source.NeedExtranet);
        }
        if (source.NeedVirtualization != null) {
            this.NeedVirtualization = new String(source.NeedVirtualization);
        }
        if (source.HardwareMemo != null) {
            this.HardwareMemo = new String(source.HardwareMemo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceSn", this.DeviceSn);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "Need10GbSlot", this.Need10GbSlot);
        this.setParamSimple(map, prefix + "NeedDCPower", this.NeedDCPower);
        this.setParamSimple(map, prefix + "NeedExtranet", this.NeedExtranet);
        this.setParamSimple(map, prefix + "NeedVirtualization", this.NeedVirtualization);
        this.setParamSimple(map, prefix + "HardwareMemo", this.HardwareMemo);

    }
}

