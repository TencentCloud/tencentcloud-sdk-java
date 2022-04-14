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

public class CreateImageRequest extends AbstractModel{

    /**
    * 图库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 物品ID，最多支持64个字符。 
若EntityId已存在，则对其追加图片。
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * 图片名称，最多支持64个字符， 
同一个EntityId，最大支持10张图。
    */
    @SerializedName("PicName")
    @Expose
    private String PicName;

    /**
    * 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片分辨率不超过4096*4096。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片 base64 数据，base64 编码后大小不可超过5M。 
图片分辨率不超过4096*4096。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 用户自定义的内容，最多支持4096个字符，查询时原样带回。
    */
    @SerializedName("CustomContent")
    @Expose
    private String CustomContent;

    /**
    * 图片自定义标签，最多不超过10个，格式为JSON。
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
     * Get 图库ID。 
     * @return GroupId 图库ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 图库ID。
     * @param GroupId 图库ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 物品ID，最多支持64个字符。 
若EntityId已存在，则对其追加图片。 
     * @return EntityId 物品ID，最多支持64个字符。 
若EntityId已存在，则对其追加图片。
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set 物品ID，最多支持64个字符。 
若EntityId已存在，则对其追加图片。
     * @param EntityId 物品ID，最多支持64个字符。 
若EntityId已存在，则对其追加图片。
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get 图片名称，最多支持64个字符， 
同一个EntityId，最大支持10张图。 
     * @return PicName 图片名称，最多支持64个字符， 
同一个EntityId，最大支持10张图。
     */
    public String getPicName() {
        return this.PicName;
    }

    /**
     * Set 图片名称，最多支持64个字符， 
同一个EntityId，最大支持10张图。
     * @param PicName 图片名称，最多支持64个字符， 
同一个EntityId，最大支持10张图。
     */
    public void setPicName(String PicName) {
        this.PicName = PicName;
    }

    /**
     * Get 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片分辨率不超过4096*4096。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return ImageUrl 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片分辨率不超过4096*4096。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片分辨率不超过4096*4096。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param ImageUrl 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
Url、Image必须提供一个，如果都提供，只使用 Url。 
图片分辨率不超过4096*4096。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。 
图片分辨率不超过4096*4096。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return ImageBase64 图片 base64 数据，base64 编码后大小不可超过5M。 
图片分辨率不超过4096*4096。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。 
图片分辨率不超过4096*4096。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param ImageBase64 图片 base64 数据，base64 编码后大小不可超过5M。 
图片分辨率不超过4096*4096。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 用户自定义的内容，最多支持4096个字符，查询时原样带回。 
     * @return CustomContent 用户自定义的内容，最多支持4096个字符，查询时原样带回。
     */
    public String getCustomContent() {
        return this.CustomContent;
    }

    /**
     * Set 用户自定义的内容，最多支持4096个字符，查询时原样带回。
     * @param CustomContent 用户自定义的内容，最多支持4096个字符，查询时原样带回。
     */
    public void setCustomContent(String CustomContent) {
        this.CustomContent = CustomContent;
    }

    /**
     * Get 图片自定义标签，最多不超过10个，格式为JSON。 
     * @return Tags 图片自定义标签，最多不超过10个，格式为JSON。
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 图片自定义标签，最多不超过10个，格式为JSON。
     * @param Tags 图片自定义标签，最多不超过10个，格式为JSON。
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public CreateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRequest(CreateImageRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.PicName != null) {
            this.PicName = new String(source.PicName);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.CustomContent != null) {
            this.CustomContent = new String(source.CustomContent);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "PicName", this.PicName);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "CustomContent", this.CustomContent);
        this.setParamSimple(map, prefix + "Tags", this.Tags);

    }
}

