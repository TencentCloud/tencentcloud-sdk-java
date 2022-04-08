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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIotDeviceRequest extends AbstractModel{

    /**
    * 设备id，传0值表示此参数无效
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * 无
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 无
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
     * Get 设备id，传0值表示此参数无效 
     * @return DeviceId 设备id，传0值表示此参数无效
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备id，传0值表示此参数无效
     * @param DeviceId 设备id，传0值表示此参数无效
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 无 
     * @return ProductID 无
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 无
     * @param ProductID 无
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 无 
     * @return DeviceName 无
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 无
     * @param DeviceName 无
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public DescribeIotDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIotDeviceRequest(DescribeIotDeviceRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new Long(source.DeviceId);
        }
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

