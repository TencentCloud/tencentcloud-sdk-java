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

public class DescribeImagesRequest extends AbstractModel{

    /**
    * 页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 构图方式，可选以下值：horizontal、vertical、square，分别代表以下含义：横图、竖图、方图
    */
    @SerializedName("Orientation")
    @Expose
    private String Orientation;

    /**
    * 图片类型，可选以下值：照片、插画
    */
    @SerializedName("ImageSenseType")
    @Expose
    private String ImageSenseType;

    /**
    * 分层图库id数组，可选以下数值：1(基础)，2(精选)，3(高级)
    */
    @SerializedName("LayeredGalleryIds")
    @Expose
    private Long [] LayeredGalleryIds;

    /**
     * Get 页偏移量 
     * @return Offset 页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移量
     * @param Offset 页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页大小 
     * @return Limit 页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页大小
     * @param Limit 页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键字 
     * @return Keyword 搜索关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键字
     * @param Keyword 搜索关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 构图方式，可选以下值：horizontal、vertical、square，分别代表以下含义：横图、竖图、方图 
     * @return Orientation 构图方式，可选以下值：horizontal、vertical、square，分别代表以下含义：横图、竖图、方图
     */
    public String getOrientation() {
        return this.Orientation;
    }

    /**
     * Set 构图方式，可选以下值：horizontal、vertical、square，分别代表以下含义：横图、竖图、方图
     * @param Orientation 构图方式，可选以下值：horizontal、vertical、square，分别代表以下含义：横图、竖图、方图
     */
    public void setOrientation(String Orientation) {
        this.Orientation = Orientation;
    }

    /**
     * Get 图片类型，可选以下值：照片、插画 
     * @return ImageSenseType 图片类型，可选以下值：照片、插画
     */
    public String getImageSenseType() {
        return this.ImageSenseType;
    }

    /**
     * Set 图片类型，可选以下值：照片、插画
     * @param ImageSenseType 图片类型，可选以下值：照片、插画
     */
    public void setImageSenseType(String ImageSenseType) {
        this.ImageSenseType = ImageSenseType;
    }

    /**
     * Get 分层图库id数组，可选以下数值：1(基础)，2(精选)，3(高级) 
     * @return LayeredGalleryIds 分层图库id数组，可选以下数值：1(基础)，2(精选)，3(高级)
     */
    public Long [] getLayeredGalleryIds() {
        return this.LayeredGalleryIds;
    }

    /**
     * Set 分层图库id数组，可选以下数值：1(基础)，2(精选)，3(高级)
     * @param LayeredGalleryIds 分层图库id数组，可选以下数值：1(基础)，2(精选)，3(高级)
     */
    public void setLayeredGalleryIds(Long [] LayeredGalleryIds) {
        this.LayeredGalleryIds = LayeredGalleryIds;
    }

    public DescribeImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesRequest(DescribeImagesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Orientation != null) {
            this.Orientation = new String(source.Orientation);
        }
        if (source.ImageSenseType != null) {
            this.ImageSenseType = new String(source.ImageSenseType);
        }
        if (source.LayeredGalleryIds != null) {
            this.LayeredGalleryIds = new Long[source.LayeredGalleryIds.length];
            for (int i = 0; i < source.LayeredGalleryIds.length; i++) {
                this.LayeredGalleryIds[i] = new Long(source.LayeredGalleryIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Orientation", this.Orientation);
        this.setParamSimple(map, prefix + "ImageSenseType", this.ImageSenseType);
        this.setParamArraySimple(map, prefix + "LayeredGalleryIds.", this.LayeredGalleryIds);

    }
}

