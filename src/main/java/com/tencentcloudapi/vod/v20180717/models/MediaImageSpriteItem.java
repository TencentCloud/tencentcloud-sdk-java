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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaImageSpriteItem extends AbstractModel {

    /**
    * 雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 雪碧图小图的高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 雪碧图小图的宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 每一张雪碧图大图里小图的数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 每一张雪碧图大图的地址。
    */
    @SerializedName("ImageUrlSet")
    @Expose
    private String [] ImageUrlSet;

    /**
    * 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * Get 雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。 
     * @return Definition 雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     * @param Definition 雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 雪碧图小图的高度。 
     * @return Height 雪碧图小图的高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 雪碧图小图的高度。
     * @param Height 雪碧图小图的高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 雪碧图小图的宽度。 
     * @return Width 雪碧图小图的宽度。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 雪碧图小图的宽度。
     * @param Width 雪碧图小图的宽度。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 每一张雪碧图大图里小图的数量。 
     * @return TotalCount 每一张雪碧图大图里小图的数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 每一张雪碧图大图里小图的数量。
     * @param TotalCount 每一张雪碧图大图里小图的数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 每一张雪碧图大图的地址。 
     * @return ImageUrlSet 每一张雪碧图大图的地址。
     */
    public String [] getImageUrlSet() {
        return this.ImageUrlSet;
    }

    /**
     * Set 每一张雪碧图大图的地址。
     * @param ImageUrlSet 每一张雪碧图大图的地址。
     */
    public void setImageUrlSet(String [] ImageUrlSet) {
        this.ImageUrlSet = ImageUrlSet;
    }

    /**
     * Get 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。 
     * @return WebVttUrl 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * Set 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。
     * @param WebVttUrl 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。
     */
    public void setWebVttUrl(String WebVttUrl) {
        this.WebVttUrl = WebVttUrl;
    }

    public MediaImageSpriteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaImageSpriteItem(MediaImageSpriteItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ImageUrlSet != null) {
            this.ImageUrlSet = new String[source.ImageUrlSet.length];
            for (int i = 0; i < source.ImageUrlSet.length; i++) {
                this.ImageUrlSet[i] = new String(source.ImageUrlSet[i]);
            }
        }
        if (source.WebVttUrl != null) {
            this.WebVttUrl = new String(source.WebVttUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "ImageUrlSet.", this.ImageUrlSet);
        this.setParamSimple(map, prefix + "WebVttUrl", this.WebVttUrl);

    }
}

