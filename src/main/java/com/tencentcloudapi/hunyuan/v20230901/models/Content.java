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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Content extends AbstractModel {

    /**
    * 内容类型
注意：
需包含至少一个 Type 为"text"的参数。
参数值可选范围：[text", "image_url","video_url"]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 Type 为 text 时使用，表示具体的文本内容。当 Type 为 image_url 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 图片的url，当 Type 为 image_url 时使用，表示具体的图片内容
如"https://example.com/1.png" 或 图片的base64（注意 "data:image/jpeg;base64," 为必要部分）："data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAA......"。当 Type 为 text 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrl")
    @Expose
    private ImageUrl ImageUrl;

    /**
    * 当type为video_url时使用，标识具体的视频链接内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoUrl")
    @Expose
    private VideoUrl VideoUrl;

    /**
    * 当type为video_frames时使用，标识具体的视频内图像帧内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoFrames")
    @Expose
    private VideoFrames VideoFrames;

    /**
     * Get 内容类型
注意：
需包含至少一个 Type 为"text"的参数。
参数值可选范围：[text", "image_url","video_url"]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 内容类型
注意：
需包含至少一个 Type 为"text"的参数。
参数值可选范围：[text", "image_url","video_url"]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 内容类型
注意：
需包含至少一个 Type 为"text"的参数。
参数值可选范围：[text", "image_url","video_url"]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 内容类型
注意：
需包含至少一个 Type 为"text"的参数。
参数值可选范围：[text", "image_url","video_url"]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当 Type 为 text 时使用，表示具体的文本内容。当 Type 为 image_url 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 当 Type 为 text 时使用，表示具体的文本内容。当 Type 为 image_url 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 当 Type 为 text 时使用，表示具体的文本内容。当 Type 为 image_url 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 当 Type 为 text 时使用，表示具体的文本内容。当 Type 为 image_url 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 图片的url，当 Type 为 image_url 时使用，表示具体的图片内容
如"https://example.com/1.png" 或 图片的base64（注意 "data:image/jpeg;base64," 为必要部分）："data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAA......"。当 Type 为 text 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUrl 图片的url，当 Type 为 image_url 时使用，表示具体的图片内容
如"https://example.com/1.png" 或 图片的base64（注意 "data:image/jpeg;base64," 为必要部分）："data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAA......"。当 Type 为 text 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageUrl getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的url，当 Type 为 image_url 时使用，表示具体的图片内容
如"https://example.com/1.png" 或 图片的base64（注意 "data:image/jpeg;base64," 为必要部分）："data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAA......"。当 Type 为 text 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrl 图片的url，当 Type 为 image_url 时使用，表示具体的图片内容
如"https://example.com/1.png" 或 图片的base64（注意 "data:image/jpeg;base64," 为必要部分）："data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAA......"。当 Type 为 text 时，当前字段内容需保持为空，传递内容不生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrl(ImageUrl ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 当type为video_url时使用，标识具体的视频链接内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoUrl 当type为video_url时使用，标识具体的视频链接内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoUrl getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 当type为video_url时使用，标识具体的视频链接内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoUrl 当type为video_url时使用，标识具体的视频链接内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoUrl(VideoUrl VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 当type为video_frames时使用，标识具体的视频内图像帧内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoFrames 当type为video_frames时使用，标识具体的视频内图像帧内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoFrames getVideoFrames() {
        return this.VideoFrames;
    }

    /**
     * Set 当type为video_frames时使用，标识具体的视频内图像帧内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoFrames 当type为video_frames时使用，标识具体的视频内图像帧内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoFrames(VideoFrames VideoFrames) {
        this.VideoFrames = VideoFrames;
    }

    public Content() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Content(Content source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new ImageUrl(source.ImageUrl);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new VideoUrl(source.VideoUrl);
        }
        if (source.VideoFrames != null) {
            this.VideoFrames = new VideoFrames(source.VideoFrames);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "ImageUrl.", this.ImageUrl);
        this.setParamObj(map, prefix + "VideoUrl.", this.VideoUrl);
        this.setParamObj(map, prefix + "VideoFrames.", this.VideoFrames);

    }
}

