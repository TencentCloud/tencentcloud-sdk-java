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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransferCloudStorageRequest extends AbstractModel {

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>已开通云存的设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>未开通云存的设备名称</p>
    */
    @SerializedName("ToDeviceName")
    @Expose
    private String ToDeviceName;

    /**
    * <p>未开通云存的设备产品ID</p>
    */
    @SerializedName("ToProductId")
    @Expose
    private String ToProductId;

    /**
    * <p>已开通云存的通道id</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>未开通云存的通道id</p>
    */
    @SerializedName("ToChannelId")
    @Expose
    private Long ToChannelId;

    /**
     * Get <p>产品ID</p> 
     * @return ProductId <p>产品ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID</p>
     * @param ProductId <p>产品ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>已开通云存的设备名称</p> 
     * @return DeviceName <p>已开通云存的设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>已开通云存的设备名称</p>
     * @param DeviceName <p>已开通云存的设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>未开通云存的设备名称</p> 
     * @return ToDeviceName <p>未开通云存的设备名称</p>
     */
    public String getToDeviceName() {
        return this.ToDeviceName;
    }

    /**
     * Set <p>未开通云存的设备名称</p>
     * @param ToDeviceName <p>未开通云存的设备名称</p>
     */
    public void setToDeviceName(String ToDeviceName) {
        this.ToDeviceName = ToDeviceName;
    }

    /**
     * Get <p>未开通云存的设备产品ID</p> 
     * @return ToProductId <p>未开通云存的设备产品ID</p>
     */
    public String getToProductId() {
        return this.ToProductId;
    }

    /**
     * Set <p>未开通云存的设备产品ID</p>
     * @param ToProductId <p>未开通云存的设备产品ID</p>
     */
    public void setToProductId(String ToProductId) {
        this.ToProductId = ToProductId;
    }

    /**
     * Get <p>已开通云存的通道id</p> 
     * @return ChannelId <p>已开通云存的通道id</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>已开通云存的通道id</p>
     * @param ChannelId <p>已开通云存的通道id</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>未开通云存的通道id</p> 
     * @return ToChannelId <p>未开通云存的通道id</p>
     */
    public Long getToChannelId() {
        return this.ToChannelId;
    }

    /**
     * Set <p>未开通云存的通道id</p>
     * @param ToChannelId <p>未开通云存的通道id</p>
     */
    public void setToChannelId(Long ToChannelId) {
        this.ToChannelId = ToChannelId;
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
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.ToChannelId != null) {
            this.ToChannelId = new Long(source.ToChannelId);
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
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ToChannelId", this.ToChannelId);

    }
}

