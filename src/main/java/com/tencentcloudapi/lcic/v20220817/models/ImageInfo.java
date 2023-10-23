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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel {

    /**
    * 图片类型：
1-原图
2-大图
3-缩略图

    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 图片数据大小，单位：字节。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 图片宽度，单位为像素。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 图片高度，单位为像素。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 图片下载地址。
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
     * Get 图片类型：
1-原图
2-大图
3-缩略图
 
     * @return Type 图片类型：
1-原图
2-大图
3-缩略图

     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 图片类型：
1-原图
2-大图
3-缩略图

     * @param Type 图片类型：
1-原图
2-大图
3-缩略图

     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 图片数据大小，单位：字节。 
     * @return Size 图片数据大小，单位：字节。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 图片数据大小，单位：字节。
     * @param Size 图片数据大小，单位：字节。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 图片宽度，单位为像素。 
     * @return Width 图片宽度，单位为像素。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 图片宽度，单位为像素。
     * @param Width 图片宽度，单位为像素。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 图片高度，单位为像素。 
     * @return Height 图片高度，单位为像素。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 图片高度，单位为像素。
     * @param Height 图片高度，单位为像素。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 图片下载地址。 
     * @return URL 图片下载地址。
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 图片下载地址。
     * @param URL 图片下载地址。
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "URL", this.URL);

    }
}

