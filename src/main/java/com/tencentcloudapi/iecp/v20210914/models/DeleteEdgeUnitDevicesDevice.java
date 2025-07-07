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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteEdgeUnitDevicesDevice extends AbstractModel {

    /**
    * 无
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 无
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
     * Get 无 
     * @return ProductId 无
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 无
     * @param ProductId 无
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
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

    public DeleteEdgeUnitDevicesDevice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEdgeUnitDevicesDevice(DeleteEdgeUnitDevicesDevice source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

