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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaImageSpriteItem  extends AbstractModel{

    /**
    * 雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 雪碧图小图的高度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 雪碧图小图的宽度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 每一张雪碧图大图里小图的数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 每一张雪碧图大图的地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrlSet")
    @Expose
    private String [] ImageUrlSet;

    /**
    * 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * 获取雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Definition 雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Definition 雪碧图规格，参见[雪碧图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取雪碧图小图的高度。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Height 雪碧图小图的高度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * 设置雪碧图小图的高度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 雪碧图小图的高度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * 获取雪碧图小图的宽度。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Width 雪碧图小图的宽度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * 设置雪碧图小图的宽度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 雪碧图小图的宽度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * 获取每一张雪碧图大图里小图的数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TotalCount 每一张雪碧图大图里小图的数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置每一张雪碧图大图里小图的数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 每一张雪碧图大图里小图的数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取每一张雪碧图大图的地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ImageUrlSet 每一张雪碧图大图的地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getImageUrlSet() {
        return this.ImageUrlSet;
    }

    /**
     * 设置每一张雪碧图大图的地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrlSet 每一张雪碧图大图的地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrlSet(String [] ImageUrlSet) {
        this.ImageUrlSet = ImageUrlSet;
    }

    /**
     * 获取雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。
注意：此字段可能返回 null，表示取不到有效值。
     * @return WebVttUrl 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * 设置雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebVttUrl 雪碧图子图位置与时间关系的 WebVtt 文件地址。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在在雪碧大图里的坐标位置，一般被播放器用于实现预览。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebVttUrl(String WebVttUrl) {
        this.WebVttUrl = WebVttUrl;
    }

    /**
     * 内部实现，用户禁止调用
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

