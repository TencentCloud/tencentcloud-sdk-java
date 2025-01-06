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

public class TransferTWeCallDeviceRequest extends AbstractModel {

    /**
    * sn信息，product_deviceName
    */
    @SerializedName("TransferInDevice")
    @Expose
    private String TransferInDevice;

    /**
    * sn信息，product_deviceName
    */
    @SerializedName("TransferOutDevice")
    @Expose
    private String TransferOutDevice;

    /**
     * Get sn信息，product_deviceName 
     * @return TransferInDevice sn信息，product_deviceName
     */
    public String getTransferInDevice() {
        return this.TransferInDevice;
    }

    /**
     * Set sn信息，product_deviceName
     * @param TransferInDevice sn信息，product_deviceName
     */
    public void setTransferInDevice(String TransferInDevice) {
        this.TransferInDevice = TransferInDevice;
    }

    /**
     * Get sn信息，product_deviceName 
     * @return TransferOutDevice sn信息，product_deviceName
     */
    public String getTransferOutDevice() {
        return this.TransferOutDevice;
    }

    /**
     * Set sn信息，product_deviceName
     * @param TransferOutDevice sn信息，product_deviceName
     */
    public void setTransferOutDevice(String TransferOutDevice) {
        this.TransferOutDevice = TransferOutDevice;
    }

    public TransferTWeCallDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferTWeCallDeviceRequest(TransferTWeCallDeviceRequest source) {
        if (source.TransferInDevice != null) {
            this.TransferInDevice = new String(source.TransferInDevice);
        }
        if (source.TransferOutDevice != null) {
            this.TransferOutDevice = new String(source.TransferOutDevice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransferInDevice", this.TransferInDevice);
        this.setParamSimple(map, prefix + "TransferOutDevice", this.TransferOutDevice);

    }
}

