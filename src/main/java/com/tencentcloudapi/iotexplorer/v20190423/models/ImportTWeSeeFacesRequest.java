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

public class ImportTWeSeeFacesRequest extends AbstractModel {

    /**
    * 产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 图片 URL，支持 HTTP(S) URL 或 JPG、PNG、BMP 格式的 data URL，图片大小不超过 5 MiB
    */
    @SerializedName("ImageURL")
    @Expose
    private String ImageURL;

    /**
    * 通道 ID，默认值为 0
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
     * Get 产品 ID 
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID
     * @param ProductId 产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 图片 URL，支持 HTTP(S) URL 或 JPG、PNG、BMP 格式的 data URL，图片大小不超过 5 MiB 
     * @return ImageURL 图片 URL，支持 HTTP(S) URL 或 JPG、PNG、BMP 格式的 data URL，图片大小不超过 5 MiB
     */
    public String getImageURL() {
        return this.ImageURL;
    }

    /**
     * Set 图片 URL，支持 HTTP(S) URL 或 JPG、PNG、BMP 格式的 data URL，图片大小不超过 5 MiB
     * @param ImageURL 图片 URL，支持 HTTP(S) URL 或 JPG、PNG、BMP 格式的 data URL，图片大小不超过 5 MiB
     */
    public void setImageURL(String ImageURL) {
        this.ImageURL = ImageURL;
    }

    /**
     * Get 通道 ID，默认值为 0 
     * @return ChannelId 通道 ID，默认值为 0
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID，默认值为 0
     * @param ChannelId 通道 ID，默认值为 0
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    public ImportTWeSeeFacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportTWeSeeFacesRequest(ImportTWeSeeFacesRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ImageURL != null) {
            this.ImageURL = new String(source.ImageURL);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ImageURL", this.ImageURL);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

