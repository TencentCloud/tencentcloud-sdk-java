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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageMaterial extends AbstractModel{

    /**
    * 图片高度，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 图片宽度，单位：px。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 素材媒体文件的 URL 地址。
    */
    @SerializedName("MaterialUrl")
    @Expose
    private String MaterialUrl;

    /**
    * 图片大小，单位：字节。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 图片高度，单位：px。 
     * @return Height 图片高度，单位：px。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 图片高度，单位：px。
     * @param Height 图片高度，单位：px。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 图片宽度，单位：px。 
     * @return Width 图片宽度，单位：px。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 图片宽度，单位：px。
     * @param Width 图片宽度，单位：px。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 素材媒体文件的 URL 地址。 
     * @return MaterialUrl 素材媒体文件的 URL 地址。
     */
    public String getMaterialUrl() {
        return this.MaterialUrl;
    }

    /**
     * Set 素材媒体文件的 URL 地址。
     * @param MaterialUrl 素材媒体文件的 URL 地址。
     */
    public void setMaterialUrl(String MaterialUrl) {
        this.MaterialUrl = MaterialUrl;
    }

    /**
     * Get 图片大小，单位：字节。 
     * @return Size 图片大小，单位：字节。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 图片大小，单位：字节。
     * @param Size 图片大小，单位：字节。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "MaterialUrl", this.MaterialUrl);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

