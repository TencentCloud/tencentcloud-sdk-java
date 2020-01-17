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

public class MediaAnimatedGraphicsItem extends AbstractModel{

    /**
    * 转动图文件的存储位置。
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
    * 转动图的文件路径。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/862/37042#.E9.A2.84.E7.BD.AE.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 动图格式，如 gif。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 动图的高度，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 动图的宽度，单位：px。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 动图码率，单位：bps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 动图大小，单位：字节。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 动图的md5值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 动图在视频中的起始时间偏移，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 动图在视频中的结束时间偏移，单位：秒。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get 转动图文件的存储位置。 
     * @return Storage 转动图文件的存储位置。
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set 转动图文件的存储位置。
     * @param Storage 转动图文件的存储位置。
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 转动图的文件路径。 
     * @return Path 转动图的文件路径。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 转动图的文件路径。
     * @param Path 转动图的文件路径。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/862/37042#.E9.A2.84.E7.BD.AE.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。 
     * @return Definition 转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/862/37042#.E9.A2.84.E7.BD.AE.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/862/37042#.E9.A2.84.E7.BD.AE.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     * @param Definition 转动图模板 ID，参见[转动图参数模板](https://cloud.tencent.com/document/product/862/37042#.E9.A2.84.E7.BD.AE.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 动图格式，如 gif。 
     * @return Container 动图格式，如 gif。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 动图格式，如 gif。
     * @param Container 动图格式，如 gif。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 动图的高度，单位：px。 
     * @return Height 动图的高度，单位：px。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 动图的高度，单位：px。
     * @param Height 动图的高度，单位：px。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 动图的宽度，单位：px。 
     * @return Width 动图的宽度，单位：px。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 动图的宽度，单位：px。
     * @param Width 动图的宽度，单位：px。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 动图码率，单位：bps。 
     * @return Bitrate 动图码率，单位：bps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 动图码率，单位：bps。
     * @param Bitrate 动图码率，单位：bps。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 动图大小，单位：字节。 
     * @return Size 动图大小，单位：字节。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 动图大小，单位：字节。
     * @param Size 动图大小，单位：字节。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 动图的md5值。 
     * @return Md5 动图的md5值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 动图的md5值。
     * @param Md5 动图的md5值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 动图在视频中的起始时间偏移，单位：秒。 
     * @return StartTimeOffset 动图在视频中的起始时间偏移，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 动图在视频中的起始时间偏移，单位：秒。
     * @param StartTimeOffset 动图在视频中的起始时间偏移，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 动图在视频中的结束时间偏移，单位：秒。 
     * @return EndTimeOffset 动图在视频中的结束时间偏移，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 动图在视频中的结束时间偏移，单位：秒。
     * @param EndTimeOffset 动图在视频中的结束时间偏移，单位：秒。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "Path", this.Path);
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

