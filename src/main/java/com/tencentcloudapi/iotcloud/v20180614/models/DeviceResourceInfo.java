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

public class DeviceResourceInfo extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 产品名
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源文件md5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 资源文件大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 资源更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备资源上传状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设备资源上传百分比
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

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
     * Get 产品名 
     * @return ProductName 产品名
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名
     * @param ProductName 产品名
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 资源名称 
     * @return Name 资源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称
     * @param Name 资源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源文件md5 
     * @return Md5 资源文件md5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 资源文件md5
     * @param Md5 资源文件md5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 资源文件大小 
     * @return Size 资源文件大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 资源文件大小
     * @param Size 资源文件大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 资源更新时间 
     * @return UpdateTime 资源更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 资源更新时间
     * @param UpdateTime 资源更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get 设备资源上传状态 
     * @return Status 设备资源上传状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备资源上传状态
     * @param Status 设备资源上传状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设备资源上传百分比 
     * @return Percent 设备资源上传百分比
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 设备资源上传百分比
     * @param Percent 设备资源上传百分比
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    public DeviceResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceResourceInfo(DeviceResourceInfo source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

