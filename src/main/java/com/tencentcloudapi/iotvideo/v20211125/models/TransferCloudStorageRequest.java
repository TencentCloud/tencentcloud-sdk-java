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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransferCloudStorageRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 已开通云存的设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 未开通云存的设备名称
    */
    @SerializedName("ToDeviceName")
    @Expose
    private String ToDeviceName;

    /**
    * 未开通云存的设备产品ID
    */
    @SerializedName("ToProductId")
    @Expose
    private String ToProductId;

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
     * Get 已开通云存的设备名称 
     * @return DeviceName 已开通云存的设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 已开通云存的设备名称
     * @param DeviceName 已开通云存的设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 未开通云存的设备名称 
     * @return ToDeviceName 未开通云存的设备名称
     */
    public String getToDeviceName() {
        return this.ToDeviceName;
    }

    /**
     * Set 未开通云存的设备名称
     * @param ToDeviceName 未开通云存的设备名称
     */
    public void setToDeviceName(String ToDeviceName) {
        this.ToDeviceName = ToDeviceName;
    }

    /**
     * Get 未开通云存的设备产品ID 
     * @return ToProductId 未开通云存的设备产品ID
     */
    public String getToProductId() {
        return this.ToProductId;
    }

    /**
     * Set 未开通云存的设备产品ID
     * @param ToProductId 未开通云存的设备产品ID
     */
    public void setToProductId(String ToProductId) {
        this.ToProductId = ToProductId;
    }

    public TransferCloudStorageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferCloudStorageRequest(TransferCloudStorageRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ToDeviceName != null) {
            this.ToDeviceName = new String(source.ToDeviceName);
        }
        if (source.ToProductId != null) {
            this.ToProductId = new String(source.ToProductId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ToDeviceName", this.ToDeviceName);
        this.setParamSimple(map, prefix + "ToProductId", this.ToProductId);

    }
}

