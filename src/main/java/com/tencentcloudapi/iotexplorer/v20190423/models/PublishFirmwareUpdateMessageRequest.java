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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishFirmwareUpdateMessageRequest extends AbstractModel {

    /**
    * 产品 ID。
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 设备名称。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
     * Get 产品 ID。 
     * @return ProductID 产品 ID。
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品 ID。
     * @param ProductID 产品 ID。
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 设备名称。 
     * @return DeviceName 设备名称。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称。
     * @param DeviceName 设备名称。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public PublishFirmwareUpdateMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishFirmwareUpdateMessageRequest(PublishFirmwareUpdateMessageRequest source) {
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
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

