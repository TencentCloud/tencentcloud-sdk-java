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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchImageRequest extends AbstractModel{

    /**
    * 图库名称。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 图片的 Url 。对应图片 base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片 base64 数据，base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 出参Score中，只有超过MatchThreshold值的结果才会返回。默认为0
    */
    @SerializedName("MatchThreshold")
    @Expose
    private Long MatchThreshold;

    /**
    * 起始序号，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认值为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 针对入库时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 图像主体区域。
    */
    @SerializedName("ImageRect")
    @Expose
    private ImageRect ImageRect;

    /**
     * Get 图库名称。 
     * @return GroupId 图库名称。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 图库名称。
     * @param GroupId 图库名称。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 图片的 Url 。对应图片 base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return ImageUrl 图片的 Url 。对应图片 base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 。对应图片 base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param ImageUrl 图片的 Url 。对应图片 base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return ImageBase64 图片 base64 数据，base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param ImageBase64 图片 base64 数据，base64 编码后大小不可超过2M。 
图片分辨率不超过1920*1080。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 出参Score中，只有超过MatchThreshold值的结果才会返回。默认为0 
     * @return MatchThreshold 出参Score中，只有超过MatchThreshold值的结果才会返回。默认为0
     */
    public Long getMatchThreshold() {
        return this.MatchThreshold;
    }

    /**
     * Set 出参Score中，只有超过MatchThreshold值的结果才会返回。默认为0
     * @param MatchThreshold 出参Score中，只有超过MatchThreshold值的结果才会返回。默认为0
     */
    public void setMatchThreshold(Long MatchThreshold) {
        this.MatchThreshold = MatchThreshold;
    }

    /**
     * Get 起始序号，默认值为0。 
     * @return Offset 起始序号，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始序号，默认值为0。
     * @param Offset 起始序号，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为10，最大值为100。 
     * @return Limit 返回数量，默认值为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为10，最大值为100。
     * @param Limit 返回数量，默认值为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 针对入库时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。 
     * @return Filter 针对入库时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 针对入库时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。
     * @param Filter 针对入库时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 图像主体区域。 
     * @return ImageRect 图像主体区域。
     */
    public ImageRect getImageRect() {
        return this.ImageRect;
    }

    /**
     * Set 图像主体区域。
     * @param ImageRect 图像主体区域。
     */
    public void setImageRect(ImageRect ImageRect) {
        this.ImageRect = ImageRect;
    }

    public SearchImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchImageRequest(SearchImageRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.MatchThreshold != null) {
            this.MatchThreshold = new Long(source.MatchThreshold);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.ImageRect != null) {
            this.ImageRect = new ImageRect(source.ImageRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "MatchThreshold", this.MatchThreshold);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamObj(map, prefix + "ImageRect.", this.ImageRect);

    }
}

