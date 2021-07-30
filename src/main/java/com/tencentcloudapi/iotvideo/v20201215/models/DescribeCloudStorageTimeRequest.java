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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudStorageTimeRequest extends AbstractModel{

    /**
    * 产品ID
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
    * 云存日期，例如"2020-01-05"
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 开始时间，unix时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，unix时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

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
     * Get 云存日期，例如"2020-01-05" 
     * @return Date 云存日期，例如"2020-01-05"
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 云存日期，例如"2020-01-05"
     * @param Date 云存日期，例如"2020-01-05"
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 开始时间，unix时间 
     * @return StartTime 开始时间，unix时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，unix时间
     * @param StartTime 开始时间，unix时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，unix时间 
     * @return EndTime 结束时间，unix时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，unix时间
     * @param EndTime 结束时间，unix时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DescribeCloudStorageTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageTimeRequest(DescribeCloudStorageTimeRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

