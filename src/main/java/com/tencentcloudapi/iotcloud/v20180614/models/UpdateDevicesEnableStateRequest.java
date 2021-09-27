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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDevicesEnableStateRequest extends AbstractModel{

    /**
    * 设备所属产品id
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 设备名称集合
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
    * 要设置的设备状态，1为启用，0为禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 设备所属产品id 
     * @return ProductID 设备所属产品id
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 设备所属产品id
     * @param ProductID 设备所属产品id
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 设备名称集合 
     * @return DeviceNames 设备名称集合
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * Set 设备名称集合
     * @param DeviceNames 设备名称集合
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * Get 要设置的设备状态，1为启用，0为禁用 
     * @return Status 要设置的设备状态，1为启用，0为禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 要设置的设备状态，1为启用，0为禁用
     * @param Status 要设置的设备状态，1为启用，0为禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdateDevicesEnableStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDevicesEnableStateRequest(UpdateDevicesEnableStateRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.DeviceNames != null) {
            this.DeviceNames = new String[source.DeviceNames.length];
            for (int i = 0; i < source.DeviceNames.length; i++) {
                this.DeviceNames[i] = new String(source.DeviceNames[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

