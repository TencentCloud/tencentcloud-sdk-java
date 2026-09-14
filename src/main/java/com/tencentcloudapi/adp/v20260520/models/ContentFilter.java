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
    * <p>图片最小高度（像素），小于则过滤；&lt;=0 表示不启用</p>
    */
    @SerializedName("ImageMinHeight")
    @Expose
    private Long ImageMinHeight;

    /**
    * <p>图片最小宽度（像素），小于则过滤；&lt;=0 表示不启用</p>
    */
    @SerializedName("ImageMinWidth")
    @Expose
    private Long ImageMinWidth;

    /**
    * <p>图片名称过滤规则（用分号 &#39;;&#39; 分隔的多条正则，如 &#39;icon;notice;warning;info.*&#39;）</p>
    */
    @SerializedName("ImageNamePatterns")
    @Expose
    private String ImageNamePatterns;

    /**
     * Get <p>图片最小高度（像素），小于则过滤；&lt;=0 表示不启用</p> 
     * @return ImageMinHeight <p>图片最小高度（像素），小于则过滤；&lt;=0 表示不启用</p>
     */
    public Long getImageMinHeight() {
        return this.ImageMinHeight;
    }

    /**
     * Set <p>图片最小高度（像素），小于则过滤；&lt;=0 表示不启用</p>
     * @param ImageMinHeight <p>图片最小高度（像素），小于则过滤；&lt;=0 表示不启用</p>
     */
    public void setImageMinHeight(Long ImageMinHeight) {
        this.ImageMinHeight = ImageMinHeight;
    }

    /**
     * Get <p>图片最小宽度（像素），小于则过滤；&lt;=0 表示不启用</p> 
     * @return ImageMinWidth <p>图片最小宽度（像素），小于则过滤；&lt;=0 表示不启用</p>
     */
    public Long getImageMinWidth() {
        return this.ImageMinWidth;
    }

    /**
     * Set <p>图片最小宽度（像素），小于则过滤；&lt;=0 表示不启用</p>
     * @param ImageMinWidth <p>图片最小宽度（像素），小于则过滤；&lt;=0 表示不启用</p>
     */
    public void setImageMinWidth(Long ImageMinWidth) {
        this.ImageMinWidth = ImageMinWidth;
    }

    /**
     * Get <p>图片名称过滤规则（用分号 &#39;;&#39; 分隔的多条正则，如 &#39;icon;notice;warning;info.*&#39;）</p> 
     * @return ImageNamePatterns <p>图片名称过滤规则（用分号 &#39;;&#39; 分隔的多条正则，如 &#39;icon;notice;warning;info.*&#39;）</p>
     */
    public String getImageNamePatterns() {
        return this.ImageNamePatterns;
    }

    /**
     * Set <p>图片名称过滤规则（用分号 &#39;;&#39; 分隔的多条正则，如 &#39;icon;notice;warning;info.*&#39;）</p>
     * @param ImageNamePatterns <p>图片名称过滤规则（用分号 &#39;;&#39; 分隔的多条正则，如 &#39;icon;notice;warning;info.*&#39;）</p>
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

