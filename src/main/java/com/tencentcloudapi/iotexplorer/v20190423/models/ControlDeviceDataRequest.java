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

public class ControlDeviceDataRequest  extends AbstractModel{

    /**
    * 产品ID
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
    * 属性数据
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 请求类型
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 设备ID，该字段有值将代替 ProductId/DeviceName
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * 获取产品ID
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品ID
     * @param ProductId 产品ID
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
     * 获取属性数据
     * @return Data 属性数据
     */
    public String getData() {
        return this.Data;
    }

    /**
     * 设置属性数据
     * @param Data 属性数据
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * 获取请求类型
     * @return Method 请求类型
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * 设置请求类型
     * @param Method 请求类型
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * 获取设备ID，该字段有值将代替 ProductId/DeviceName
     * @return DeviceId 设备ID，该字段有值将代替 ProductId/DeviceName
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * 设置设备ID，该字段有值将代替 ProductId/DeviceName
     * @param DeviceId 设备ID，该字段有值将代替 ProductId/DeviceName
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

