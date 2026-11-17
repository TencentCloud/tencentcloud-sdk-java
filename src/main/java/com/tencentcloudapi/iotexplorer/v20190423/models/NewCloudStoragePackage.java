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

public class NewCloudStoragePackage extends AbstractModel {

    /**
    * <p>资源id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>媒体类型</p><p>枚举值：</p><ul><li>image： 图片套餐</li><li>video： 视频套餐</li></ul>
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul>
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * <p>录制模式</p><p>枚举值：</p><ul><li>low_power：  2小时/日</li><li>event：  8小时/日</li><li>full_time：  24小时/日</li></ul>
    */
    @SerializedName("RecordingMode")
    @Expose
    private String RecordingMode;

    /**
    * <p>码率</p><p>枚举值：</p><ul><li>0.5m： 0.5Mbps</li><li>1m： 1Mbps</li><li>1.5m： 1.5Mbps</li><li>2m： 2Mbps</li></ul>
    */
    @SerializedName("Bitrate")
    @Expose
    private String Bitrate;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>套餐状态</p><p>枚举值：</p><ul><li>active： 生效中</li><li>queued： 排队中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>启停状态</p><p>枚举值：</p><ul><li>0： 停用</li><li>1： 启用</li></ul>
    */
    @SerializedName("ReportEnabled")
    @Expose
    private Long ReportEnabled;

    /**
    * <p>订单id</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>大订单号</p>
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * <p>卡有效期类型</p><p>枚举值：</p><ul><li>monthly_card： 月卡</li><li>annual_card： 年卡</li></ul>
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * <p>图片档位</p><p>枚举值：</p><ul><li>300： 300张/日</li><li>1000： 1000张/日</li></ul>
    */
    @SerializedName("ImageCapacity")
    @Expose
    private String ImageCapacity;

    /**
     * Get <p>资源id</p> 
     * @return ResourceId <p>资源id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id</p>
     * @param ResourceId <p>资源id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>媒体类型</p><p>枚举值：</p><ul><li>image： 图片套餐</li><li>video： 视频套餐</li></ul> 
     * @return MediaType <p>媒体类型</p><p>枚举值：</p><ul><li>image： 图片套餐</li><li>video： 视频套餐</li></ul>
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set <p>媒体类型</p><p>枚举值：</p><ul><li>image： 图片套餐</li><li>video： 视频套餐</li></ul>
     * @param MediaType <p>媒体类型</p><p>枚举值：</p><ul><li>image： 图片套餐</li><li>video： 视频套餐</li></ul>
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
    }

    /**
     * Get <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul> 
     * @return RetentionDays <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul>
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul>
     * @param RetentionDays <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul>
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get <p>录制模式</p><p>枚举值：</p><ul><li>low_power：  2小时/日</li><li>event：  8小时/日</li><li>full_time：  24小时/日</li></ul> 
     * @return RecordingMode <p>录制模式</p><p>枚举值：</p><ul><li>low_power：  2小时/日</li><li>event：  8小时/日</li><li>full_time：  24小时/日</li></ul>
     */
    public String getRecordingMode() {
        return this.RecordingMode;
    }

    /**
     * Set <p>录制模式</p><p>枚举值：</p><ul><li>low_power：  2小时/日</li><li>event：  8小时/日</li><li>full_time：  24小时/日</li></ul>
     * @param RecordingMode <p>录制模式</p><p>枚举值：</p><ul><li>low_power：  2小时/日</li><li>event：  8小时/日</li><li>full_time：  24小时/日</li></ul>
     */
    public void setRecordingMode(String RecordingMode) {
        this.RecordingMode = RecordingMode;
    }

    /**
     * Get <p>码率</p><p>枚举值：</p><ul><li>0.5m： 0.5Mbps</li><li>1m： 1Mbps</li><li>1.5m： 1.5Mbps</li><li>2m： 2Mbps</li></ul> 
     * @return Bitrate <p>码率</p><p>枚举值：</p><ul><li>0.5m： 0.5Mbps</li><li>1m： 1Mbps</li><li>1.5m： 1.5Mbps</li><li>2m： 2Mbps</li></ul>
     */
    public String getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>码率</p><p>枚举值：</p><ul><li>0.5m： 0.5Mbps</li><li>1m： 1Mbps</li><li>1.5m： 1.5Mbps</li><li>2m： 2Mbps</li></ul>
     * @param Bitrate <p>码率</p><p>枚举值：</p><ul><li>0.5m： 0.5Mbps</li><li>1m： 1Mbps</li><li>1.5m： 1.5Mbps</li><li>2m： 2Mbps</li></ul>
     */
    public void setBitrate(String Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>过期时间</p> 
     * @return ExpireTime <p>过期时间</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpireTime <p>过期时间</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>套餐状态</p><p>枚举值：</p><ul><li>active： 生效中</li><li>queued： 排队中</li></ul> 
     * @return Status <p>套餐状态</p><p>枚举值：</p><ul><li>active： 生效中</li><li>queued： 排队中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>套餐状态</p><p>枚举值：</p><ul><li>active： 生效中</li><li>queued： 排队中</li></ul>
     * @param Status <p>套餐状态</p><p>枚举值：</p><ul><li>active： 生效中</li><li>queued： 排队中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>启停状态</p><p>枚举值：</p><ul><li>0： 停用</li><li>1： 启用</li></ul> 
     * @return ReportEnabled <p>启停状态</p><p>枚举值：</p><ul><li>0： 停用</li><li>1： 启用</li></ul>
     */
    public Long getReportEnabled() {
        return this.ReportEnabled;
    }

    /**
     * Set <p>启停状态</p><p>枚举值：</p><ul><li>0： 停用</li><li>1： 启用</li></ul>
     * @param ReportEnabled <p>启停状态</p><p>枚举值：</p><ul><li>0： 停用</li><li>1： 启用</li></ul>
     */
    public void setReportEnabled(Long ReportEnabled) {
        this.ReportEnabled = ReportEnabled;
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

    /**
     * Get <p>大订单号</p> 
     * @return BigDealId <p>大订单号</p>
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set <p>大订单号</p>
     * @param BigDealId <p>大订单号</p>
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get <p>卡有效期类型</p><p>枚举值：</p><ul><li>monthly_card： 月卡</li><li>annual_card： 年卡</li></ul> 
     * @return ValidityPeriod <p>卡有效期类型</p><p>枚举值：</p><ul><li>monthly_card： 月卡</li><li>annual_card： 年卡</li></ul>
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set <p>卡有效期类型</p><p>枚举值：</p><ul><li>monthly_card： 月卡</li><li>annual_card： 年卡</li></ul>
     * @param ValidityPeriod <p>卡有效期类型</p><p>枚举值：</p><ul><li>monthly_card： 月卡</li><li>annual_card： 年卡</li></ul>
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get <p>图片档位</p><p>枚举值：</p><ul><li>300： 300张/日</li><li>1000： 1000张/日</li></ul> 
     * @return ImageCapacity <p>图片档位</p><p>枚举值：</p><ul><li>300： 300张/日</li><li>1000： 1000张/日</li></ul>
     */
    public String getImageCapacity() {
        return this.ImageCapacity;
    }

    /**
     * Set <p>图片档位</p><p>枚举值：</p><ul><li>300： 300张/日</li><li>1000： 1000张/日</li></ul>
     * @param ImageCapacity <p>图片档位</p><p>枚举值：</p><ul><li>300： 300张/日</li><li>1000： 1000张/日</li></ul>
     */
    public void setImageCapacity(String ImageCapacity) {
        this.ImageCapacity = ImageCapacity;
    }

    public NewCloudStoragePackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewCloudStoragePackage(NewCloudStoragePackage source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.MediaType != null) {
            this.MediaType = new String(source.MediaType);
        }
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
        if (source.RecordingMode != null) {
            this.RecordingMode = new String(source.RecordingMode);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new String(source.Bitrate);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ReportEnabled != null) {
            this.ReportEnabled = new Long(source.ReportEnabled);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.ValidityPeriod != null) {
            this.ValidityPeriod = new String(source.ValidityPeriod);
        }
        if (source.ImageCapacity != null) {
            this.ImageCapacity = new String(source.ImageCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);
        this.setParamSimple(map, prefix + "RecordingMode", this.RecordingMode);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ReportEnabled", this.ReportEnabled);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "ImageCapacity", this.ImageCapacity);

    }
}

