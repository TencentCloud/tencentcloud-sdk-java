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

public class MediaAnimatedGraphicsItem  extends AbstractModel{

    /**
    * 转动图的文件地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/266/33481#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 动图格式，如 gif。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 动图的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 动图的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 动图码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 动图大小，单位：字节。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 动图的md5值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 动图在视频中的起始时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 动图在视频中的结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * 获取转动图的文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Url 转动图的文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置转动图的文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 转动图的文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/266/33481#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Definition 转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/266/33481#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/266/33481#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Definition 转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/266/33481#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取动图格式，如 gif。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Container 动图格式，如 gif。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * 设置动图格式，如 gif。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Container 动图格式，如 gif。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * 获取动图的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Height 动图的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * 设置动图的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 动图的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * 获取动图的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Width 动图的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * 设置动图的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 动图的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * 获取动图码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Bitrate 动图码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * 设置动图码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 动图码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * 获取动图大小，单位：字节。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Size 动图大小，单位：字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * 设置动图大小，单位：字节。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 动图大小，单位：字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * 获取动图的md5值。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Md5 动图的md5值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * 设置动图的md5值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5 动图的md5值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * 获取动图在视频中的起始时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @return StartTimeOffset 动图在视频中的起始时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * 设置动图在视频中的起始时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTimeOffset 动图在视频中的起始时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * 获取动图在视频中的结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @return EndTimeOffset 动图在视频中的结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * 设置动图在视频中的结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTimeOffset 动图在视频中的结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

