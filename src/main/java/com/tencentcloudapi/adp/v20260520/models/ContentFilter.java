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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentFilter extends AbstractModel {

    /**
    * 图片最小高度（像素），小于则过滤；<=0 表示不启用
    */
    @SerializedName("ImageMinHeight")
    @Expose
    private Long ImageMinHeight;

    /**
    * 图片最小宽度（像素），小于则过滤；<=0 表示不启用
    */
    @SerializedName("ImageMinWidth")
    @Expose
    private Long ImageMinWidth;

    /**
    * 图片名称过滤规则（用分号 ';' 分隔的多条正则，如 'icon;notice;warning;info.*'）
    */
    @SerializedName("ImageNamePatterns")
    @Expose
    private String ImageNamePatterns;

    /**
     * Get 图片最小高度（像素），小于则过滤；<=0 表示不启用 
     * @return ImageMinHeight 图片最小高度（像素），小于则过滤；<=0 表示不启用
     */
    public Long getImageMinHeight() {
        return this.ImageMinHeight;
    }

    /**
     * Set 图片最小高度（像素），小于则过滤；<=0 表示不启用
     * @param ImageMinHeight 图片最小高度（像素），小于则过滤；<=0 表示不启用
     */
    public void setImageMinHeight(Long ImageMinHeight) {
        this.ImageMinHeight = ImageMinHeight;
    }

    /**
     * Get 图片最小宽度（像素），小于则过滤；<=0 表示不启用 
     * @return ImageMinWidth 图片最小宽度（像素），小于则过滤；<=0 表示不启用
     */
    public Long getImageMinWidth() {
        return this.ImageMinWidth;
    }

    /**
     * Set 图片最小宽度（像素），小于则过滤；<=0 表示不启用
     * @param ImageMinWidth 图片最小宽度（像素），小于则过滤；<=0 表示不启用
     */
    public void setImageMinWidth(Long ImageMinWidth) {
        this.ImageMinWidth = ImageMinWidth;
    }

    /**
     * Get 图片名称过滤规则（用分号 ';' 分隔的多条正则，如 'icon;notice;warning;info.*'） 
     * @return ImageNamePatterns 图片名称过滤规则（用分号 ';' 分隔的多条正则，如 'icon;notice;warning;info.*'）
     */
    public String getImageNamePatterns() {
        return this.ImageNamePatterns;
    }

    /**
     * Set 图片名称过滤规则（用分号 ';' 分隔的多条正则，如 'icon;notice;warning;info.*'）
     * @param ImageNamePatterns 图片名称过滤规则（用分号 ';' 分隔的多条正则，如 'icon;notice;warning;info.*'）
     */
    public void setImageNamePatterns(String ImageNamePatterns) {
        this.ImageNamePatterns = ImageNamePatterns;
    }

    public ContentFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentFilter(ContentFilter source) {
        if (source.ImageMinHeight != null) {
            this.ImageMinHeight = new Long(source.ImageMinHeight);
        }
        if (source.ImageMinWidth != null) {
            this.ImageMinWidth = new Long(source.ImageMinWidth);
        }
        if (source.ImageNamePatterns != null) {
            this.ImageNamePatterns = new String(source.ImageNamePatterns);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageMinHeight", this.ImageMinHeight);
        this.setParamSimple(map, prefix + "ImageMinWidth", this.ImageMinWidth);
        this.setParamSimple(map, prefix + "ImageNamePatterns", this.ImageNamePatterns);

    }
}

