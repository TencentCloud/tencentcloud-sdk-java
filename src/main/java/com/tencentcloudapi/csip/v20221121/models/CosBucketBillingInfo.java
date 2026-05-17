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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosBucketBillingInfo extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 昵称
    */
    @SerializedName("OwnerNickName")
    @Expose
    private String OwnerNickName;

    /**
    * 存储桶数量
    */
    @SerializedName("BucketCount")
    @Expose
    private Long BucketCount;

    /**
    * 0 未购买 1  已单独购买 2 已被共享
    */
    @SerializedName("BuyStatus")
    @Expose
    private Long BuyStatus;

    /**
    * 共享账号appid
    */
    @SerializedName("ShareFromAppId")
    @Expose
    private Long ShareFromAppId;

    /**
    * 共享账号uin
    */
    @SerializedName("ShareFromUin")
    @Expose
    private String ShareFromUin;

    /**
    * 共享账号昵称
    */
    @SerializedName("ShareFromNickName")
    @Expose
    private String ShareFromNickName;

    /**
    * 监控的存储桶数
    */
    @SerializedName("MonitorBucketCount")
    @Expose
    private Long MonitorBucketCount;

    /**
    * 0 关闭 1 开启
    */
    @SerializedName("IsAutoMonitor")
    @Expose
    private Long IsAutoMonitor;

    /**
     * Get appid 
     * @return AppId appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get uin 
     * @return OwnerUin uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set uin
     * @param OwnerUin uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 昵称 
     * @return OwnerNickName 昵称
     */
    public String getOwnerNickName() {
        return this.OwnerNickName;
    }

    /**
     * Set 昵称
     * @param OwnerNickName 昵称
     */
    public void setOwnerNickName(String OwnerNickName) {
        this.OwnerNickName = OwnerNickName;
    }

    /**
     * Get 存储桶数量 
     * @return BucketCount 存储桶数量
     */
    public Long getBucketCount() {
        return this.BucketCount;
    }

    /**
     * Set 存储桶数量
     * @param BucketCount 存储桶数量
     */
    public void setBucketCount(Long BucketCount) {
        this.BucketCount = BucketCount;
    }

    /**
     * Get 0 未购买 1  已单独购买 2 已被共享 
     * @return BuyStatus 0 未购买 1  已单独购买 2 已被共享
     */
    public Long getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set 0 未购买 1  已单独购买 2 已被共享
     * @param BuyStatus 0 未购买 1  已单独购买 2 已被共享
     */
    public void setBuyStatus(Long BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    /**
     * Get 共享账号appid 
     * @return ShareFromAppId 共享账号appid
     */
    public Long getShareFromAppId() {
        return this.ShareFromAppId;
    }

    /**
     * Set 共享账号appid
     * @param ShareFromAppId 共享账号appid
     */
    public void setShareFromAppId(Long ShareFromAppId) {
        this.ShareFromAppId = ShareFromAppId;
    }

    /**
     * Get 共享账号uin 
     * @return ShareFromUin 共享账号uin
     */
    public String getShareFromUin() {
        return this.ShareFromUin;
    }

    /**
     * Set 共享账号uin
     * @param ShareFromUin 共享账号uin
     */
    public void setShareFromUin(String ShareFromUin) {
        this.ShareFromUin = ShareFromUin;
    }

    /**
     * Get 共享账号昵称 
     * @return ShareFromNickName 共享账号昵称
     */
    public String getShareFromNickName() {
        return this.ShareFromNickName;
    }

    /**
     * Set 共享账号昵称
     * @param ShareFromNickName 共享账号昵称
     */
    public void setShareFromNickName(String ShareFromNickName) {
        this.ShareFromNickName = ShareFromNickName;
    }

    /**
     * Get 监控的存储桶数 
     * @return MonitorBucketCount 监控的存储桶数
     */
    public Long getMonitorBucketCount() {
        return this.MonitorBucketCount;
    }

    /**
     * Set 监控的存储桶数
     * @param MonitorBucketCount 监控的存储桶数
     */
    public void setMonitorBucketCount(Long MonitorBucketCount) {
        this.MonitorBucketCount = MonitorBucketCount;
    }

    /**
     * Get 0 关闭 1 开启 
     * @return IsAutoMonitor 0 关闭 1 开启
     */
    public Long getIsAutoMonitor() {
        return this.IsAutoMonitor;
    }

    /**
     * Set 0 关闭 1 开启
     * @param IsAutoMonitor 0 关闭 1 开启
     */
    public void setIsAutoMonitor(Long IsAutoMonitor) {
        this.IsAutoMonitor = IsAutoMonitor;
    }

    public CosBucketBillingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketBillingInfo(CosBucketBillingInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerNickName != null) {
            this.OwnerNickName = new String(source.OwnerNickName);
        }
        if (source.BucketCount != null) {
            this.BucketCount = new Long(source.BucketCount);
        }
        if (source.BuyStatus != null) {
            this.BuyStatus = new Long(source.BuyStatus);
        }
        if (source.ShareFromAppId != null) {
            this.ShareFromAppId = new Long(source.ShareFromAppId);
        }
        if (source.ShareFromUin != null) {
            this.ShareFromUin = new String(source.ShareFromUin);
        }
        if (source.ShareFromNickName != null) {
            this.ShareFromNickName = new String(source.ShareFromNickName);
        }
        if (source.MonitorBucketCount != null) {
            this.MonitorBucketCount = new Long(source.MonitorBucketCount);
        }
        if (source.IsAutoMonitor != null) {
            this.IsAutoMonitor = new Long(source.IsAutoMonitor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerNickName", this.OwnerNickName);
        this.setParamSimple(map, prefix + "BucketCount", this.BucketCount);
        this.setParamSimple(map, prefix + "BuyStatus", this.BuyStatus);
        this.setParamSimple(map, prefix + "ShareFromAppId", this.ShareFromAppId);
        this.setParamSimple(map, prefix + "ShareFromUin", this.ShareFromUin);
        this.setParamSimple(map, prefix + "ShareFromNickName", this.ShareFromNickName);
        this.setParamSimple(map, prefix + "MonitorBucketCount", this.MonitorBucketCount);
        this.setParamSimple(map, prefix + "IsAutoMonitor", this.IsAutoMonitor);

    }
}

