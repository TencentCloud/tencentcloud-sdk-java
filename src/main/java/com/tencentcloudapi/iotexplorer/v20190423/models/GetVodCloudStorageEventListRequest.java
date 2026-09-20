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

public class GetVodCloudStorageEventListRequest extends AbstractModel {

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
    * <p>日期</p><p>参数格式：格式 yyyy-MM-dd</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>分页游标，首页为空。</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>分页大小</p><p>取值范围：[10, 100]</p><p>默认值：10</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>通道id</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

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
    * <p>非加密 URL 签名有效期</p><p>单位：秒</p>
    */
    @SerializedName("ExpireSec")
    @Expose
    private Long ExpireSec;

    /**
    * <p>请求平台：0 Android，1 小程序，2 iOS，3 鸿蒙</p>
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

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
     * Get <p>日期</p><p>参数格式：格式 yyyy-MM-dd</p> 
     * @return Date <p>日期</p><p>参数格式：格式 yyyy-MM-dd</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>日期</p><p>参数格式：格式 yyyy-MM-dd</p>
     * @param Date <p>日期</p><p>参数格式：格式 yyyy-MM-dd</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>分页游标，首页为空。</p> 
     * @return Context <p>分页游标，首页为空。</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>分页游标，首页为空。</p>
     * @param Context <p>分页游标，首页为空。</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>分页大小</p><p>取值范围：[10, 100]</p><p>默认值：10</p> 
     * @return Size <p>分页大小</p><p>取值范围：[10, 100]</p><p>默认值：10</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>分页大小</p><p>取值范围：[10, 100]</p><p>默认值：10</p>
     * @param Size <p>分页大小</p><p>取值范围：[10, 100]</p><p>默认值：10</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
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

    /**
     * Get <p>非加密 URL 签名有效期</p><p>单位：秒</p> 
     * @return ExpireSec <p>非加密 URL 签名有效期</p><p>单位：秒</p>
     */
    public Long getExpireSec() {
        return this.ExpireSec;
    }

    /**
     * Set <p>非加密 URL 签名有效期</p><p>单位：秒</p>
     * @param ExpireSec <p>非加密 URL 签名有效期</p><p>单位：秒</p>
     */
    public void setExpireSec(Long ExpireSec) {
        this.ExpireSec = ExpireSec;
    }

    /**
     * Get <p>请求平台：0 Android，1 小程序，2 iOS，3 鸿蒙</p> 
     * @return Platform <p>请求平台：0 Android，1 小程序，2 iOS，3 鸿蒙</p>
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>请求平台：0 Android，1 小程序，2 iOS，3 鸿蒙</p>
     * @param Platform <p>请求平台：0 Android，1 小程序，2 iOS，3 鸿蒙</p>
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    public GetVodCloudStorageEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetVodCloudStorageEventListRequest(GetVodCloudStorageEventListRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.ExpireSec != null) {
            this.ExpireSec = new Long(source.ExpireSec);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "ExpireSec", this.ExpireSec);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

