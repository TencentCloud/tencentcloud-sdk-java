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

public class PackageInfo extends AbstractModel {

    /**
    * 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 云存类型，1为全时云存，2为事件云存
    */
    @SerializedName("CSType")
    @Expose
    private Long CSType;

    /**
    * 云存回看时长
    */
    @SerializedName("CSShiftDuration")
    @Expose
    private Long CSShiftDuration;

    /**
    * 云存套餐过期时间
    */
    @SerializedName("CSExpiredTime")
    @Expose
    private Long CSExpiredTime;

    /**
    * 云存套餐创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 云存套餐更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
    * 套餐id
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 订单id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 通道id
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 用户id
    */
    @SerializedName("CSUserId")
    @Expose
    private String CSUserId;

    /**
     * Get 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据 
     * @return Status 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据
     * @param Status 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 云存类型，1为全时云存，2为事件云存 
     * @return CSType 云存类型，1为全时云存，2为事件云存
     */
    public Long getCSType() {
        return this.CSType;
    }

    /**
     * Set 云存类型，1为全时云存，2为事件云存
     * @param CSType 云存类型，1为全时云存，2为事件云存
     */
    public void setCSType(Long CSType) {
        this.CSType = CSType;
    }

    /**
     * Get 云存回看时长 
     * @return CSShiftDuration 云存回看时长
     */
    public Long getCSShiftDuration() {
        return this.CSShiftDuration;
    }

    /**
     * Set 云存回看时长
     * @param CSShiftDuration 云存回看时长
     */
    public void setCSShiftDuration(Long CSShiftDuration) {
        this.CSShiftDuration = CSShiftDuration;
    }

    /**
     * Get 云存套餐过期时间 
     * @return CSExpiredTime 云存套餐过期时间
     */
    public Long getCSExpiredTime() {
        return this.CSExpiredTime;
    }

    /**
     * Set 云存套餐过期时间
     * @param CSExpiredTime 云存套餐过期时间
     */
    public void setCSExpiredTime(Long CSExpiredTime) {
        this.CSExpiredTime = CSExpiredTime;
    }

    /**
     * Get 云存套餐创建时间 
     * @return CreatedAt 云存套餐创建时间
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 云存套餐创建时间
     * @param CreatedAt 云存套餐创建时间
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 云存套餐更新时间 
     * @return UpdatedAt 云存套餐更新时间
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 云存套餐更新时间
     * @param UpdatedAt 云存套餐更新时间
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 套餐id 
     * @return PackageId 套餐id
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 套餐id
     * @param PackageId 套餐id
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 订单id 
     * @return OrderId 订单id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id
     * @param OrderId 订单id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 通道id 
     * @return ChannelId 通道id
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道id
     * @param ChannelId 通道id
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 用户id 
     * @return CSUserId 用户id
     */
    public String getCSUserId() {
        return this.CSUserId;
    }

    /**
     * Set 用户id
     * @param CSUserId 用户id
     */
    public void setCSUserId(String CSUserId) {
        this.CSUserId = CSUserId;
    }

    public PackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageInfo(PackageInfo source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CSType != null) {
            this.CSType = new Long(source.CSType);
        }
        if (source.CSShiftDuration != null) {
            this.CSShiftDuration = new Long(source.CSShiftDuration);
        }
        if (source.CSExpiredTime != null) {
            this.CSExpiredTime = new Long(source.CSExpiredTime);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.CSUserId != null) {
            this.CSUserId = new String(source.CSUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CSType", this.CSType);
        this.setParamSimple(map, prefix + "CSShiftDuration", this.CSShiftDuration);
        this.setParamSimple(map, prefix + "CSExpiredTime", this.CSExpiredTime);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "CSUserId", this.CSUserId);

    }
}

