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

public class ImageItem extends AbstractModel{

    /**
    * 图片ID
    */
    @SerializedName("ImageId")
    @Expose
    private Long ImageId;

    /**
    * 图片标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 图片描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 图片预览链接
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * 图片缩略图
    */
    @SerializedName("ThumbUrl")
    @Expose
    private String ThumbUrl;

    /**
    * 图片供应商
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * 图片关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * 宽
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 图片ID 
     * @return ImageId 图片ID
     */
    public Long getImageId() {
        return this.ImageId;
    }

    /**
     * Set 图片ID
     * @param ImageId 图片ID
     */
    public void setImageId(Long ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 图片标题 
     * @return Title 图片标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 图片标题
     * @param Title 图片标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 图片描述 
     * @return Description 图片描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 图片描述
     * @param Description 图片描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 图片预览链接 
     * @return PreviewUrl 图片预览链接
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set 图片预览链接
     * @param PreviewUrl 图片预览链接
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get 图片缩略图 
     * @return ThumbUrl 图片缩略图
     */
    public String getThumbUrl() {
        return this.ThumbUrl;
    }

    /**
     * Set 图片缩略图
     * @param ThumbUrl 图片缩略图
     */
    public void setThumbUrl(String ThumbUrl) {
        this.ThumbUrl = ThumbUrl;
    }

    /**
     * Get 图片供应商 
     * @return Vendor 图片供应商
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set 图片供应商
     * @param Vendor 图片供应商
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get 图片关键词 
     * @return Keywords 图片关键词
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 图片关键词
     * @param Keywords 图片关键词
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 宽 
     * @return Width 宽
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽
     * @param Width 宽
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高 
     * @return Height 高
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高
     * @param Height 高
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public ImageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageItem(ImageItem source) {
        if (source.ImageId != null) {
            this.ImageId = new Long(source.ImageId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.ThumbUrl != null) {
            this.ThumbUrl = new String(source.ThumbUrl);
        }
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.Keywords != null) {
            this.Keywords = new String(source.Keywords);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamSimple(map, prefix + "ThumbUrl", this.ThumbUrl);
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

