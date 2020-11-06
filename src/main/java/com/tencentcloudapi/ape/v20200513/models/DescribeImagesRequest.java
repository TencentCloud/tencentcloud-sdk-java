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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Orientation", this.Orientation);
        this.setParamSimple(map, prefix + "ImageSenseType", this.ImageSenseType);

    }
}

