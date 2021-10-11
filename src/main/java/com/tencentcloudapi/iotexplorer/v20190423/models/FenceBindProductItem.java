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

public class FenceBindProductItem extends AbstractModel{

    /**
    * 围栏绑定的设备信息
    */
    @SerializedName("Devices")
    @Expose
    private FenceBindDeviceItem [] Devices;

    /**
    * 围栏绑定的产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
     * Get 围栏绑定的设备信息 
     * @return Devices 围栏绑定的设备信息
     */
    public FenceBindDeviceItem [] getDevices() {
        return this.Devices;
    }

    /**
     * Set 围栏绑定的设备信息
     * @param Devices 围栏绑定的设备信息
     */
    public void setDevices(FenceBindDeviceItem [] Devices) {
        this.Devices = Devices;
    }

    /**
     * Get 围栏绑定的产品Id 
     * @return ProductId 围栏绑定的产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 围栏绑定的产品Id
     * @param ProductId 围栏绑定的产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public FenceBindProductItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FenceBindProductItem(FenceBindProductItem source) {
        if (source.Devices != null) {
            this.Devices = new FenceBindDeviceItem[source.Devices.length];
            for (int i = 0; i < source.Devices.length; i++) {
                this.Devices[i] = new FenceBindDeviceItem(source.Devices[i]);
            }
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Devices.", this.Devices);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);

    }
}

