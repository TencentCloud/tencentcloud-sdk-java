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

public class ResetCloudStorageRequest extends AbstractModel {

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>通道ID 非NVR设备则不填 NVR设备则必填 默认为无</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>云存用户Id，为空则为默认云存空间。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>订单id</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

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
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>通道ID 非NVR设备则不填 NVR设备则必填 默认为无</p> 
     * @return ChannelId <p>通道ID 非NVR设备则不填 NVR设备则必填 默认为无</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道ID 非NVR设备则不填 NVR设备则必填 默认为无</p>
     * @param ChannelId <p>通道ID 非NVR设备则不填 NVR设备则必填 默认为无</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>云存用户Id，为空则为默认云存空间。</p> 
     * @return UserId <p>云存用户Id，为空则为默认云存空间。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>云存用户Id，为空则为默认云存空间。</p>
     * @param UserId <p>云存用户Id，为空则为默认云存空间。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>订单id</p> 
     * @return OrderId <p>订单id</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单id</p>
     * @param OrderId <p>订单id</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public ResetCloudStorageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetCloudStorageRequest(ResetCloudStorageRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

