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

public class DescribeVodCloudStorageDateRequest extends AbstractModel {

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
    private String ChannelId;

    /**
    * <p>用户id</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>时区</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

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
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道id</p>
     * @param ChannelId <p>通道id</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>用户id</p> 
     * @return UserId <p>用户id</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户id</p>
     * @param UserId <p>用户id</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>时区</p> 
     * @return TimeZone <p>时区</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>时区</p>
     * @param TimeZone <p>时区</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public DescribeVodCloudStorageDateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVodCloudStorageDateRequest(DescribeVodCloudStorageDateRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
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
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

