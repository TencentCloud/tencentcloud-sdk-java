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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMultiDeviceRequest extends AbstractModel {

    /**
    * 产品 ID。创建产品时腾讯云为用户分配全局唯一的 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 批量创建的设备名数组，单次最多创建 100 个设备。命名规则：[a-zA-Z0-9:_-]{1,48}
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
     * Get 产品 ID。创建产品时腾讯云为用户分配全局唯一的 ID 
     * @return ProductId 产品 ID。创建产品时腾讯云为用户分配全局唯一的 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID。创建产品时腾讯云为用户分配全局唯一的 ID
     * @param ProductId 产品 ID。创建产品时腾讯云为用户分配全局唯一的 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 批量创建的设备名数组，单次最多创建 100 个设备。命名规则：[a-zA-Z0-9:_-]{1,48} 
     * @return DeviceNames 批量创建的设备名数组，单次最多创建 100 个设备。命名规则：[a-zA-Z0-9:_-]{1,48}
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * Set 批量创建的设备名数组，单次最多创建 100 个设备。命名规则：[a-zA-Z0-9:_-]{1,48}
     * @param DeviceNames 批量创建的设备名数组，单次最多创建 100 个设备。命名规则：[a-zA-Z0-9:_-]{1,48}
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    public CreateMultiDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMultiDeviceRequest(CreateMultiDeviceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceNames != null) {
            this.DeviceNames = new String[source.DeviceNames.length];
            for (int i = 0; i < source.DeviceNames.length; i++) {
                this.DeviceNames[i] = new String(source.DeviceNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);

    }
}

