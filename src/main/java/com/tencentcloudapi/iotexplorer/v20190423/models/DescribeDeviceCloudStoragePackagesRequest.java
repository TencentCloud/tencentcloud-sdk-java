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

public class DescribeDeviceCloudStoragePackagesRequest extends AbstractModel {

    /**
    * <p>产品id</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>通道id</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>云存类别</p><p>枚举值：</p><ul><li>video： 视频云存</li><li>image： 图片云存</li></ul>
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
     * Get <p>产品id</p> 
     * @return ProductId <p>产品id</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品id</p>
     * @param ProductId <p>产品id</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名</p> 
     * @return DeviceName <p>设备名</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名</p>
     * @param DeviceName <p>设备名</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>通道id</p> 
     * @return ChannelId <p>通道id</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道id</p>
     * @param ChannelId <p>通道id</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>云存类别</p><p>枚举值：</p><ul><li>video： 视频云存</li><li>image： 图片云存</li></ul> 
     * @return MediaType <p>云存类别</p><p>枚举值：</p><ul><li>video： 视频云存</li><li>image： 图片云存</li></ul>
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set <p>云存类别</p><p>枚举值：</p><ul><li>video： 视频云存</li><li>image： 图片云存</li></ul>
     * @param MediaType <p>云存类别</p><p>枚举值：</p><ul><li>video： 视频云存</li><li>image： 图片云存</li></ul>
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
    }

    public DescribeDeviceCloudStoragePackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceCloudStoragePackagesRequest(DescribeDeviceCloudStoragePackagesRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.MediaType != null) {
            this.MediaType = new String(source.MediaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);

    }
}

