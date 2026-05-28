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
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>昵称</p>
    */
    @SerializedName("OwnerNickName")
    @Expose
    private String OwnerNickName;

    /**
    * <p>存储桶数量</p>
    */
    @SerializedName("BucketCount")
    @Expose
    private Long BucketCount;

    /**
    * <p>0 未购买 1  已单独购买 2 已被共享</p>
    */
    @SerializedName("BuyStatus")
    @Expose
    private Long BuyStatus;

    /**
    * <p>共享账号appid</p>
    */
    @SerializedName("ShareFromAppId")
    @Expose
    private Long ShareFromAppId;

    /**
    * <p>共享账号uin</p>
    */
    @SerializedName("ShareFromUin")
    @Expose
    private String ShareFromUin;

    /**
    * <p>共享账号昵称</p>
    */
    @SerializedName("ShareFromNickName")
    @Expose
    private String ShareFromNickName;

    /**
    * <p>监控的存储桶数</p>
    */
    @SerializedName("MonitorBucketCount")
    @Expose
    private Long MonitorBucketCount;

    /**
    * <p>0 关闭 1 开启</p>
    */
    @SerializedName("IsAutoMonitor")
    @Expose
    private Long IsAutoMonitor;

    /**
    * <p>是否启用白名单日志功能</p>
    */
    @SerializedName("LogFeatureWhitelist")
    @Expose
    private Boolean LogFeatureWhitelist;

    /**
    * <p>是否存在新的后付费订单</p>
    */
    @SerializedName("IsHaveNewPostOrder")
    @Expose
    private Boolean IsHaveNewPostOrder;

    /**
    * <p>是否存在旧后付费订单</p>
    */
    @SerializedName("IsHaveOldPostOrder")
    @Expose
    private Boolean IsHaveOldPostOrder;

    /**
    * <p>后付费产品列表</p>
    */
    @SerializedName("PostProductList")
    @Expose
    private Long [] PostProductList;

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>uin</p> 
     * @return OwnerUin <p>uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>uin</p>
     * @param OwnerUin <p>uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>昵称</p> 
     * @return OwnerNickName <p>昵称</p>
     */
    public String getOwnerNickName() {
        return this.OwnerNickName;
    }

    /**
     * Set <p>昵称</p>
     * @param OwnerNickName <p>昵称</p>
     */
    public void setOwnerNickName(String OwnerNickName) {
        this.OwnerNickName = OwnerNickName;
    }

    /**
     * Get <p>存储桶数量</p> 
     * @return BucketCount <p>存储桶数量</p>
     */
    public Long getBucketCount() {
        return this.BucketCount;
    }

    /**
     * Set <p>存储桶数量</p>
     * @param BucketCount <p>存储桶数量</p>
     */
    public void setBucketCount(Long BucketCount) {
        this.BucketCount = BucketCount;
    }

    /**
     * Get <p>0 未购买 1  已单独购买 2 已被共享</p> 
     * @return BuyStatus <p>0 未购买 1  已单独购买 2 已被共享</p>
     */
    public Long getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set <p>0 未购买 1  已单独购买 2 已被共享</p>
     * @param BuyStatus <p>0 未购买 1  已单独购买 2 已被共享</p>
     */
    public void setBuyStatus(Long BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    /**
     * Get <p>共享账号appid</p> 
     * @return ShareFromAppId <p>共享账号appid</p>
     */
    public Long getShareFromAppId() {
        return this.ShareFromAppId;
    }

    /**
     * Set <p>共享账号appid</p>
     * @param ShareFromAppId <p>共享账号appid</p>
     */
    public void setShareFromAppId(Long ShareFromAppId) {
        this.ShareFromAppId = ShareFromAppId;
    }

    /**
     * Get <p>共享账号uin</p> 
     * @return ShareFromUin <p>共享账号uin</p>
     */
    public String getShareFromUin() {
        return this.ShareFromUin;
    }

    /**
     * Set <p>共享账号uin</p>
     * @param ShareFromUin <p>共享账号uin</p>
     */
    public void setShareFromUin(String ShareFromUin) {
        this.ShareFromUin = ShareFromUin;
    }

    /**
     * Get <p>共享账号昵称</p> 
     * @return ShareFromNickName <p>共享账号昵称</p>
     */
    public String getShareFromNickName() {
        return this.ShareFromNickName;
    }

    /**
     * Set <p>共享账号昵称</p>
     * @param ShareFromNickName <p>共享账号昵称</p>
     */
    public void setShareFromNickName(String ShareFromNickName) {
        this.ShareFromNickName = ShareFromNickName;
    }

    /**
     * Get <p>监控的存储桶数</p> 
     * @return MonitorBucketCount <p>监控的存储桶数</p>
     */
    public Long getMonitorBucketCount() {
        return this.MonitorBucketCount;
    }

    /**
     * Set <p>监控的存储桶数</p>
     * @param MonitorBucketCount <p>监控的存储桶数</p>
     */
    public void setMonitorBucketCount(Long MonitorBucketCount) {
        this.MonitorBucketCount = MonitorBucketCount;
    }

    /**
     * Get <p>0 关闭 1 开启</p> 
     * @return IsAutoMonitor <p>0 关闭 1 开启</p>
     */
    public Long getIsAutoMonitor() {
        return this.IsAutoMonitor;
    }

    /**
     * Set <p>0 关闭 1 开启</p>
     * @param IsAutoMonitor <p>0 关闭 1 开启</p>
     */
    public void setIsAutoMonitor(Long IsAutoMonitor) {
        this.IsAutoMonitor = IsAutoMonitor;
    }

    /**
     * Get <p>是否启用白名单日志功能</p> 
     * @return LogFeatureWhitelist <p>是否启用白名单日志功能</p>
     */
    public Boolean getLogFeatureWhitelist() {
        return this.LogFeatureWhitelist;
    }

    /**
     * Set <p>是否启用白名单日志功能</p>
     * @param LogFeatureWhitelist <p>是否启用白名单日志功能</p>
     */
    public void setLogFeatureWhitelist(Boolean LogFeatureWhitelist) {
        this.LogFeatureWhitelist = LogFeatureWhitelist;
    }

    /**
     * Get <p>是否存在新的后付费订单</p> 
     * @return IsHaveNewPostOrder <p>是否存在新的后付费订单</p>
     */
    public Boolean getIsHaveNewPostOrder() {
        return this.IsHaveNewPostOrder;
    }

    /**
     * Set <p>是否存在新的后付费订单</p>
     * @param IsHaveNewPostOrder <p>是否存在新的后付费订单</p>
     */
    public void setIsHaveNewPostOrder(Boolean IsHaveNewPostOrder) {
        this.IsHaveNewPostOrder = IsHaveNewPostOrder;
    }

    /**
     * Get <p>是否存在旧后付费订单</p> 
     * @return IsHaveOldPostOrder <p>是否存在旧后付费订单</p>
     */
    public Boolean getIsHaveOldPostOrder() {
        return this.IsHaveOldPostOrder;
    }

    /**
     * Set <p>是否存在旧后付费订单</p>
     * @param IsHaveOldPostOrder <p>是否存在旧后付费订单</p>
     */
    public void setIsHaveOldPostOrder(Boolean IsHaveOldPostOrder) {
        this.IsHaveOldPostOrder = IsHaveOldPostOrder;
    }

    /**
     * Get <p>后付费产品列表</p> 
     * @return PostProductList <p>后付费产品列表</p>
     */
    public Long [] getPostProductList() {
        return this.PostProductList;
    }

    /**
     * Set <p>后付费产品列表</p>
     * @param PostProductList <p>后付费产品列表</p>
     */
    public void setPostProductList(Long [] PostProductList) {
        this.PostProductList = PostProductList;
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
        if (source.LogFeatureWhitelist != null) {
            this.LogFeatureWhitelist = new Boolean(source.LogFeatureWhitelist);
        }
        if (source.IsHaveNewPostOrder != null) {
            this.IsHaveNewPostOrder = new Boolean(source.IsHaveNewPostOrder);
        }
        if (source.IsHaveOldPostOrder != null) {
            this.IsHaveOldPostOrder = new Boolean(source.IsHaveOldPostOrder);
        }
        if (source.PostProductList != null) {
            this.PostProductList = new Long[source.PostProductList.length];
            for (int i = 0; i < source.PostProductList.length; i++) {
                this.PostProductList[i] = new Long(source.PostProductList[i]);
            }
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
        this.setParamSimple(map, prefix + "LogFeatureWhitelist", this.LogFeatureWhitelist);
        this.setParamSimple(map, prefix + "IsHaveNewPostOrder", this.IsHaveNewPostOrder);
        this.setParamSimple(map, prefix + "IsHaveOldPostOrder", this.IsHaveOldPostOrder);
        this.setParamArraySimple(map, prefix + "PostProductList.", this.PostProductList);

    }
}

