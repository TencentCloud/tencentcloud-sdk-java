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

public class ControlDeviceDataRequest extends AbstractModel{

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
    * 属性数据, JSON格式字符串, 注意字段需要在物模型属性里定义
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 请求类型 , 不填该参数或者 desired 表示下发属性给设备,  reported 表示模拟设备上报属性
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 设备ID，该字段有值将代替 ProductId/DeviceName , 通常情况不需要填写
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 上报数据UNIX时间戳(毫秒), 仅对Method:reported有效
    */
    @SerializedName("DataTimestamp")
    @Expose
    private Long DataTimestamp;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 属性数据, JSON格式字符串, 注意字段需要在物模型属性里定义 
     * @return Data 属性数据, JSON格式字符串, 注意字段需要在物模型属性里定义
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 属性数据, JSON格式字符串, 注意字段需要在物模型属性里定义
     * @param Data 属性数据, JSON格式字符串, 注意字段需要在物模型属性里定义
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 请求类型 , 不填该参数或者 desired 表示下发属性给设备,  reported 表示模拟设备上报属性 
     * @return Method 请求类型 , 不填该参数或者 desired 表示下发属性给设备,  reported 表示模拟设备上报属性
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求类型 , 不填该参数或者 desired 表示下发属性给设备,  reported 表示模拟设备上报属性
     * @param Method 请求类型 , 不填该参数或者 desired 表示下发属性给设备,  reported 表示模拟设备上报属性
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 设备ID，该字段有值将代替 ProductId/DeviceName , 通常情况不需要填写 
     * @return DeviceId 设备ID，该字段有值将代替 ProductId/DeviceName , 通常情况不需要填写
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID，该字段有值将代替 ProductId/DeviceName , 通常情况不需要填写
     * @param DeviceId 设备ID，该字段有值将代替 ProductId/DeviceName , 通常情况不需要填写
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 上报数据UNIX时间戳(毫秒), 仅对Method:reported有效 
     * @return DataTimestamp 上报数据UNIX时间戳(毫秒), 仅对Method:reported有效
     */
    public Long getDataTimestamp() {
        return this.DataTimestamp;
    }

    /**
     * Set 上报数据UNIX时间戳(毫秒), 仅对Method:reported有效
     * @param DataTimestamp 上报数据UNIX时间戳(毫秒), 仅对Method:reported有效
     */
    public void setDataTimestamp(Long DataTimestamp) {
        this.DataTimestamp = DataTimestamp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DataTimestamp", this.DataTimestamp);

    }
}

