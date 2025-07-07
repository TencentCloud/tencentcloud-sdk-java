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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageMsgContent extends AbstractModel {

    /**
    * 图片的唯一标识，客户端用于索引图片的键值。
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 图片格式。
JPG = 1
GIF = 2
PNG = 3
BMP = 4
其他 = 255

    */
    @SerializedName("ImageFormat")
    @Expose
    private Long ImageFormat;

    /**
    * 图片信息
    */
    @SerializedName("ImageInfoList")
    @Expose
    private ImageInfo [] ImageInfoList;

    /**
     * Get 图片的唯一标识，客户端用于索引图片的键值。 
     * @return UUID 图片的唯一标识，客户端用于索引图片的键值。
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 图片的唯一标识，客户端用于索引图片的键值。
     * @param UUID 图片的唯一标识，客户端用于索引图片的键值。
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 图片格式。
JPG = 1
GIF = 2
PNG = 3
BMP = 4
其他 = 255
 
     * @return ImageFormat 图片格式。
JPG = 1
GIF = 2
PNG = 3
BMP = 4
其他 = 255

     */
    public Long getImageFormat() {
        return this.ImageFormat;
    }

    /**
     * Set 图片格式。
JPG = 1
GIF = 2
PNG = 3
BMP = 4
其他 = 255

     * @param ImageFormat 图片格式。
JPG = 1
GIF = 2
PNG = 3
BMP = 4
其他 = 255

     */
    public void setImageFormat(Long ImageFormat) {
        this.ImageFormat = ImageFormat;
    }

    /**
     * Get 图片信息 
     * @return ImageInfoList 图片信息
     */
    public ImageInfo [] getImageInfoList() {
        return this.ImageInfoList;
    }

    /**
     * Set 图片信息
     * @param ImageInfoList 图片信息
     */
    public void setImageInfoList(ImageInfo [] ImageInfoList) {
        this.ImageInfoList = ImageInfoList;
    }

    public ImageMsgContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageMsgContent(ImageMsgContent source) {
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.ImageFormat != null) {
            this.ImageFormat = new Long(source.ImageFormat);
        }
        if (source.ImageInfoList != null) {
            this.ImageInfoList = new ImageInfo[source.ImageInfoList.length];
            for (int i = 0; i < source.ImageInfoList.length; i++) {
                this.ImageInfoList[i] = new ImageInfo(source.ImageInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "ImageFormat", this.ImageFormat);
        this.setParamArrayObj(map, prefix + "ImageInfoList.", this.ImageInfoList);

    }
}

