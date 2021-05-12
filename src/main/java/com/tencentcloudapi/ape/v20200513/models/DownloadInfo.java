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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadInfo extends AbstractModel{

    /**
    * 图片基础信息
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 图片原图URL
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片缩略图URL
    */
    @SerializedName("ImageThumbUrl")
    @Expose
    private String ImageThumbUrl;

    /**
    * 订单Id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 订单创建时间
    */
    @SerializedName("OrderCreateTime")
    @Expose
    private String OrderCreateTime;

    /**
    * 下载Id
    */
    @SerializedName("DownloadId")
    @Expose
    private String DownloadId;

    /**
    * 下载时间
    */
    @SerializedName("DownloadTime")
    @Expose
    private String DownloadTime;

    /**
    * 图片购买类型，单张/会员
    */
    @SerializedName("ConsumeType")
    @Expose
    private Long ConsumeType;

    /**
    * 是否首次下载
    */
    @SerializedName("FirstDownload")
    @Expose
    private Boolean FirstDownload;

    /**
     * Get 图片基础信息 
     * @return ImageInfo 图片基础信息
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 图片基础信息
     * @param ImageInfo 图片基础信息
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get 图片原图URL 
     * @return ImageUrl 图片原图URL
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片原图URL
     * @param ImageUrl 图片原图URL
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片缩略图URL 
     * @return ImageThumbUrl 图片缩略图URL
     */
    public String getImageThumbUrl() {
        return this.ImageThumbUrl;
    }

    /**
     * Set 图片缩略图URL
     * @param ImageThumbUrl 图片缩略图URL
     */
    public void setImageThumbUrl(String ImageThumbUrl) {
        this.ImageThumbUrl = ImageThumbUrl;
    }

    /**
     * Get 订单Id 
     * @return OrderId 订单Id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单Id
     * @param OrderId 订单Id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 订单创建时间 
     * @return OrderCreateTime 订单创建时间
     */
    public String getOrderCreateTime() {
        return this.OrderCreateTime;
    }

    /**
     * Set 订单创建时间
     * @param OrderCreateTime 订单创建时间
     */
    public void setOrderCreateTime(String OrderCreateTime) {
        this.OrderCreateTime = OrderCreateTime;
    }

    /**
     * Get 下载Id 
     * @return DownloadId 下载Id
     */
    public String getDownloadId() {
        return this.DownloadId;
    }

    /**
     * Set 下载Id
     * @param DownloadId 下载Id
     */
    public void setDownloadId(String DownloadId) {
        this.DownloadId = DownloadId;
    }

    /**
     * Get 下载时间 
     * @return DownloadTime 下载时间
     */
    public String getDownloadTime() {
        return this.DownloadTime;
    }

    /**
     * Set 下载时间
     * @param DownloadTime 下载时间
     */
    public void setDownloadTime(String DownloadTime) {
        this.DownloadTime = DownloadTime;
    }

    /**
     * Get 图片购买类型，单张/会员 
     * @return ConsumeType 图片购买类型，单张/会员
     */
    public Long getConsumeType() {
        return this.ConsumeType;
    }

    /**
     * Set 图片购买类型，单张/会员
     * @param ConsumeType 图片购买类型，单张/会员
     */
    public void setConsumeType(Long ConsumeType) {
        this.ConsumeType = ConsumeType;
    }

    /**
     * Get 是否首次下载 
     * @return FirstDownload 是否首次下载
     */
    public Boolean getFirstDownload() {
        return this.FirstDownload;
    }

    /**
     * Set 是否首次下载
     * @param FirstDownload 是否首次下载
     */
    public void setFirstDownload(Boolean FirstDownload) {
        this.FirstDownload = FirstDownload;
    }

    public DownloadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadInfo(DownloadInfo source) {
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageThumbUrl != null) {
            this.ImageThumbUrl = new String(source.ImageThumbUrl);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.OrderCreateTime != null) {
            this.OrderCreateTime = new String(source.OrderCreateTime);
        }
        if (source.DownloadId != null) {
            this.DownloadId = new String(source.DownloadId);
        }
        if (source.DownloadTime != null) {
            this.DownloadTime = new String(source.DownloadTime);
        }
        if (source.ConsumeType != null) {
            this.ConsumeType = new Long(source.ConsumeType);
        }
        if (source.FirstDownload != null) {
            this.FirstDownload = new Boolean(source.FirstDownload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageThumbUrl", this.ImageThumbUrl);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "OrderCreateTime", this.OrderCreateTime);
        this.setParamSimple(map, prefix + "DownloadId", this.DownloadId);
        this.setParamSimple(map, prefix + "DownloadTime", this.DownloadTime);
        this.setParamSimple(map, prefix + "ConsumeType", this.ConsumeType);
        this.setParamSimple(map, prefix + "FirstDownload", this.FirstDownload);

    }
}

