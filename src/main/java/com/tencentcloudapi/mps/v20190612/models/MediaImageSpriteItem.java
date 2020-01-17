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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaImageSpriteItem extends AbstractModel{

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
    * 每一张雪碧图大图的路径。
    */
    @SerializedName("ImagePathSet")
    @Expose
    private String [] ImagePathSet;

    /**
    * 雪碧图子图位置与时间关系的 WebVtt 文件路径。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。
    */
    @SerializedName("WebVttPath")
    @Expose
    private String WebVttPath;

    /**
    * 雪碧图文件的存储位置。
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

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
     * Get 每一张雪碧图大图的路径。 
     * @return ImagePathSet 每一张雪碧图大图的路径。
     */
    public String [] getImagePathSet() {
        return this.ImagePathSet;
    }

    /**
     * Set 每一张雪碧图大图的路径。
     * @param ImagePathSet 每一张雪碧图大图的路径。
     */
    public void setImagePathSet(String [] ImagePathSet) {
        this.ImagePathSet = ImagePathSet;
    }

    /**
     * Get 雪碧图子图位置与时间关系的 WebVtt 文件路径。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。 
     * @return WebVttPath 雪碧图子图位置与时间关系的 WebVtt 文件路径。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。
     */
    public String getWebVttPath() {
        return this.WebVttPath;
    }

    /**
     * Set 雪碧图子图位置与时间关系的 WebVtt 文件路径。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。
     * @param WebVttPath 雪碧图子图位置与时间关系的 WebVtt 文件路径。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。
     */
    public void setWebVttPath(String WebVttPath) {
        this.WebVttPath = WebVttPath;
    }

    /**
     * Get 雪碧图文件的存储位置。 
     * @return Storage 雪碧图文件的存储位置。
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set 雪碧图文件的存储位置。
     * @param Storage 雪碧图文件的存储位置。
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "ImagePathSet.", this.ImagePathSet);
        this.setParamSimple(map, prefix + "WebVttPath", this.WebVttPath);
        this.setParamObj(map, prefix + "Storage.", this.Storage);

    }
}

