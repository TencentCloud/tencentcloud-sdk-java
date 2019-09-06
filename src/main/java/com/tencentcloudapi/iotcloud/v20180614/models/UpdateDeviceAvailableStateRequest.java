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

public class UpdateDeviceAvailableStateRequest  extends AbstractModel{

    /**
    * 设备所属产品id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 要设置的设备状态，1为启用，0为禁用
    */
    @SerializedName("EnableState")
    @Expose
    private Integer EnableState;

    /**
     * 获取设备所属产品id
     * @return ProductId 设备所属产品id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置设备所属产品id
     * @param ProductId 设备所属产品id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取设备名称
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * 设置设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 获取要设置的设备状态，1为启用，0为禁用
     * @return EnableState 要设置的设备状态，1为启用，0为禁用
     */
    public Integer getEnableState() {
        return this.EnableState;
    }

    /**
     * 设置要设置的设备状态，1为启用，0为禁用
     * @param EnableState 要设置的设备状态，1为启用，0为禁用
     */
    public void setEnableState(Integer EnableState) {
        this.EnableState = EnableState;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "EnableState", this.EnableState);

    }
}

