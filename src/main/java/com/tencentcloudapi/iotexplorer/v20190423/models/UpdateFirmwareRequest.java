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

public class UpdateFirmwareRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 固件新的版本号
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
    * 固件原版本号
    */
    @SerializedName("FirmwareOriVersion")
    @Expose
    private String FirmwareOriVersion;

    /**
    * 固件升级方式；0 静默升级 1 用户确认升级   不填默认静默升级
    */
    @SerializedName("UpgradeMethod")
    @Expose
    private Long UpgradeMethod;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 固件新的版本号 
     * @return FirmwareVersion 固件新的版本号
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set 固件新的版本号
     * @param FirmwareVersion 固件新的版本号
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Get 固件原版本号 
     * @return FirmwareOriVersion 固件原版本号
     */
    public String getFirmwareOriVersion() {
        return this.FirmwareOriVersion;
    }

    /**
     * Set 固件原版本号
     * @param FirmwareOriVersion 固件原版本号
     */
    public void setFirmwareOriVersion(String FirmwareOriVersion) {
        this.FirmwareOriVersion = FirmwareOriVersion;
    }

    /**
     * Get 固件升级方式；0 静默升级 1 用户确认升级   不填默认静默升级 
     * @return UpgradeMethod 固件升级方式；0 静默升级 1 用户确认升级   不填默认静默升级
     */
    public Long getUpgradeMethod() {
        return this.UpgradeMethod;
    }

    /**
     * Set 固件升级方式；0 静默升级 1 用户确认升级   不填默认静默升级
     * @param UpgradeMethod 固件升级方式；0 静默升级 1 用户确认升级   不填默认静默升级
     */
    public void setUpgradeMethod(Long UpgradeMethod) {
        this.UpgradeMethod = UpgradeMethod;
    }

    public UpdateFirmwareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFirmwareRequest(UpdateFirmwareRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.FirmwareVersion != null) {
            this.FirmwareVersion = new String(source.FirmwareVersion);
        }
        if (source.FirmwareOriVersion != null) {
            this.FirmwareOriVersion = new String(source.FirmwareOriVersion);
        }
        if (source.UpgradeMethod != null) {
            this.UpgradeMethod = new Long(source.UpgradeMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "FirmwareVersion", this.FirmwareVersion);
        this.setParamSimple(map, prefix + "FirmwareOriVersion", this.FirmwareOriVersion);
        this.setParamSimple(map, prefix + "UpgradeMethod", this.UpgradeMethod);

    }
}

