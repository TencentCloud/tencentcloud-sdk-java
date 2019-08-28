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

public class ModifyAnimatedGraphicsTemplateRequest  extends AbstractModel{

    /**
    * 转动图模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 转动图模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 动图宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 动图格式，取值为 gif 和 webp。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 帧率，取值范围：[1, 30]，单位：Hz。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 图片质量，取值范围：[1, 100]，默认值为 75。
    */
    @SerializedName("Quality")
    @Expose
    private Float Quality;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * 获取转动图模板唯一标识。
     * @return Definition 转动图模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置转动图模板唯一标识。
     * @param Definition 转动图模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取转动图模板名称，长度限制：64 个字符。
     * @return Name 转动图模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置转动图模板名称，长度限制：64 个字符。
     * @param Name 转动图模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取动图宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     * @return Width 动图宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * 设置动图宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     * @param Width 动图宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * 获取视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     * @return Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * 设置视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     * @param Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * 获取动图格式，取值为 gif 和 webp。
     * @return Format 动图格式，取值为 gif 和 webp。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * 设置动图格式，取值为 gif 和 webp。
     * @param Format 动图格式，取值为 gif 和 webp。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * 获取帧率，取值范围：[1, 30]，单位：Hz。
     * @return Fps 帧率，取值范围：[1, 30]，单位：Hz。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * 设置帧率，取值范围：[1, 30]，单位：Hz。
     * @param Fps 帧率，取值范围：[1, 30]，单位：Hz。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * 获取图片质量，取值范围：[1, 100]，默认值为 75。
     * @return Quality 图片质量，取值范围：[1, 100]，默认值为 75。
     */
    public Float getQuality() {
        return this.Quality;
    }

    /**
     * 设置图片质量，取值范围：[1, 100]，默认值为 75。
     * @param Quality 图片质量，取值范围：[1, 100]，默认值为 75。
     */
    public void setQuality(Float Quality) {
        this.Quality = Quality;
    }

    /**
     * 获取模板描述信息，长度限制：256 个字符。
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * 设置模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Quality", this.Quality);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

