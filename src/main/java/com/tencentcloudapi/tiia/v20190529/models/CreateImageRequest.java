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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRequest extends AbstractModel {

    /**
    * 图库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 物品ID，最多支持64个字符。 
一个物品ID可以包含多张图片，若EntityId已存在，则对其追加图片。同一个EntityId，最大支持10张图。
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * 图片名称，最多支持64个字符， 
PicName唯一确定一张图片，具有唯一性。
    */
    @SerializedName("PicName")
    @Expose
    private String PicName;

    /**
    * 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片自定义备注内容，最多支持4096个字符，查询时原样带回。
    */
    @SerializedName("CustomContent")
    @Expose
    private String CustomContent;

    /**
    * 图片 base64 数据，base64 编码后大小不可超过5M。 
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片自定义标签，最多不超过10个，格式为JSON。
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 是否需要启用主体识别，默认为**TRUE**。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体创建图片并进行主体识别。主体识别结果可在**Response**中获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图创建图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
    */
    @SerializedName("EnableDetect")
    @Expose
    private Boolean EnableDetect;

    /**
    * 图像类目ID。
若设置类目ID，提取以下类目的主体创建图片。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 图像主体区域。
若设置主体区域，提取指定的区域创建图片。
    */
    @SerializedName("ImageRect")
    @Expose
    private Rect ImageRect;

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
一个物品ID可以包含多张图片，若EntityId已存在，则对其追加图片。同一个EntityId，最大支持10张图。 
     * @return EntityId 物品ID，最多支持64个字符。 
一个物品ID可以包含多张图片，若EntityId已存在，则对其追加图片。同一个EntityId，最大支持10张图。
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set 物品ID，最多支持64个字符。 
一个物品ID可以包含多张图片，若EntityId已存在，则对其追加图片。同一个EntityId，最大支持10张图。
     * @param EntityId 物品ID，最多支持64个字符。 
一个物品ID可以包含多张图片，若EntityId已存在，则对其追加图片。同一个EntityId，最大支持10张图。
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get 图片名称，最多支持64个字符， 
PicName唯一确定一张图片，具有唯一性。 
     * @return PicName 图片名称，最多支持64个字符， 
PicName唯一确定一张图片，具有唯一性。
     */
    public String getPicName() {
        return this.PicName;
    }

    /**
     * Set 图片名称，最多支持64个字符， 
PicName唯一确定一张图片，具有唯一性。
     * @param PicName 图片名称，最多支持64个字符， 
PicName唯一确定一张图片，具有唯一性。
     */
    public void setPicName(String PicName) {
        this.PicName = PicName;
    }

    /**
     * Get 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     * @param ImageUrl 图片的 Url 。对应图片 base64 编码后大小不可超过5M。  
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片自定义备注内容，最多支持4096个字符，查询时原样带回。 
     * @return CustomContent 图片自定义备注内容，最多支持4096个字符，查询时原样带回。
     */
    public String getCustomContent() {
        return this.CustomContent;
    }

    /**
     * Set 图片自定义备注内容，最多支持4096个字符，查询时原样带回。
     * @param CustomContent 图片自定义备注内容，最多支持4096个字符，查询时原样带回。
     */
    public void setCustomContent(String CustomContent) {
        this.CustomContent = CustomContent;
    }

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。 
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。 
     * @return ImageBase64 图片 base64 数据，base64 编码后大小不可超过5M。 
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。 
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
     * @param ImageBase64 图片 base64 数据，base64 编码后大小不可超过5M。 
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
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

    /**
     * Get 是否需要启用主体识别，默认为**TRUE**。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体创建图片并进行主体识别。主体识别结果可在**Response**中获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图创建图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>** 
     * @return EnableDetect 是否需要启用主体识别，默认为**TRUE**。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体创建图片并进行主体识别。主体识别结果可在**Response**中获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图创建图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     */
    public Boolean getEnableDetect() {
        return this.EnableDetect;
    }

    /**
     * Set 是否需要启用主体识别，默认为**TRUE**。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体创建图片并进行主体识别。主体识别结果可在**Response**中获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图创建图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     * @param EnableDetect 是否需要启用主体识别，默认为**TRUE**。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体创建图片并进行主体识别。主体识别结果可在**Response**中获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图创建图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     */
    public void setEnableDetect(Boolean EnableDetect) {
        this.EnableDetect = EnableDetect;
    }

    /**
     * Get 图像类目ID。
若设置类目ID，提取以下类目的主体创建图片。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>** 
     * @return CategoryId 图像类目ID。
若设置类目ID，提取以下类目的主体创建图片。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 图像类目ID。
若设置类目ID，提取以下类目的主体创建图片。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     * @param CategoryId 图像类目ID。
若设置类目ID，提取以下类目的主体创建图片。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 图像主体区域。
若设置主体区域，提取指定的区域创建图片。 
     * @return ImageRect 图像主体区域。
若设置主体区域，提取指定的区域创建图片。
     */
    public Rect getImageRect() {
        return this.ImageRect;
    }

    /**
     * Set 图像主体区域。
若设置主体区域，提取指定的区域创建图片。
     * @param ImageRect 图像主体区域。
若设置主体区域，提取指定的区域创建图片。
     */
    public void setImageRect(Rect ImageRect) {
        this.ImageRect = ImageRect;
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
        if (source.CustomContent != null) {
            this.CustomContent = new String(source.CustomContent);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.EnableDetect != null) {
            this.EnableDetect = new Boolean(source.EnableDetect);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.ImageRect != null) {
            this.ImageRect = new Rect(source.ImageRect);
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
        this.setParamSimple(map, prefix + "CustomContent", this.CustomContent);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "EnableDetect", this.EnableDetect);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamObj(map, prefix + "ImageRect.", this.ImageRect);

    }
}

