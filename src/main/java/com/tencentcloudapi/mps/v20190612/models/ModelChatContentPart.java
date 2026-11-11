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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelChatContentPart extends AbstractModel {

    /**
    * <p>内容类型</p><p>枚举值：</p><ul><li>text： 文本内容</li><li>input_image： 图片输入</li><li>input_video： 视频输入</li><li>input_audio： 音频输入</li><li>input_file： 文件输入</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>文本消息</p><p>Type=text 时必填</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>图片输入</p><p>Type=input_image 时必填</p>
    */
    @SerializedName("InputImage")
    @Expose
    private ModelChatInputImage InputImage;

    /**
    * <p>视频输入</p><p>Type=input_video 时必填</p>
    */
    @SerializedName("InputVideo")
    @Expose
    private ModelChatInputVideo InputVideo;

    /**
    * <p>音频输入</p><p>Type=input_audio 时必填</p>
    */
    @SerializedName("InputAudio")
    @Expose
    private ModelChatInputAudio InputAudio;

    /**
    * <p>文件输入</p><p>Type=input_file 时必填</p>
    */
    @SerializedName("InputFile")
    @Expose
    private ModelChatInputFile InputFile;

    /**
     * Get <p>内容类型</p><p>枚举值：</p><ul><li>text： 文本内容</li><li>input_image： 图片输入</li><li>input_video： 视频输入</li><li>input_audio： 音频输入</li><li>input_file： 文件输入</li></ul> 
     * @return Type <p>内容类型</p><p>枚举值：</p><ul><li>text： 文本内容</li><li>input_image： 图片输入</li><li>input_video： 视频输入</li><li>input_audio： 音频输入</li><li>input_file： 文件输入</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>内容类型</p><p>枚举值：</p><ul><li>text： 文本内容</li><li>input_image： 图片输入</li><li>input_video： 视频输入</li><li>input_audio： 音频输入</li><li>input_file： 文件输入</li></ul>
     * @param Type <p>内容类型</p><p>枚举值：</p><ul><li>text： 文本内容</li><li>input_image： 图片输入</li><li>input_video： 视频输入</li><li>input_audio： 音频输入</li><li>input_file： 文件输入</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>文本消息</p><p>Type=text 时必填</p> 
     * @return Text <p>文本消息</p><p>Type=text 时必填</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>文本消息</p><p>Type=text 时必填</p>
     * @param Text <p>文本消息</p><p>Type=text 时必填</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>图片输入</p><p>Type=input_image 时必填</p> 
     * @return InputImage <p>图片输入</p><p>Type=input_image 时必填</p>
     */
    public ModelChatInputImage getInputImage() {
        return this.InputImage;
    }

    /**
     * Set <p>图片输入</p><p>Type=input_image 时必填</p>
     * @param InputImage <p>图片输入</p><p>Type=input_image 时必填</p>
     */
    public void setInputImage(ModelChatInputImage InputImage) {
        this.InputImage = InputImage;
    }

    /**
     * Get <p>视频输入</p><p>Type=input_video 时必填</p> 
     * @return InputVideo <p>视频输入</p><p>Type=input_video 时必填</p>
     */
    public ModelChatInputVideo getInputVideo() {
        return this.InputVideo;
    }

    /**
     * Set <p>视频输入</p><p>Type=input_video 时必填</p>
     * @param InputVideo <p>视频输入</p><p>Type=input_video 时必填</p>
     */
    public void setInputVideo(ModelChatInputVideo InputVideo) {
        this.InputVideo = InputVideo;
    }

    /**
     * Get <p>音频输入</p><p>Type=input_audio 时必填</p> 
     * @return InputAudio <p>音频输入</p><p>Type=input_audio 时必填</p>
     */
    public ModelChatInputAudio getInputAudio() {
        return this.InputAudio;
    }

    /**
     * Set <p>音频输入</p><p>Type=input_audio 时必填</p>
     * @param InputAudio <p>音频输入</p><p>Type=input_audio 时必填</p>
     */
    public void setInputAudio(ModelChatInputAudio InputAudio) {
        this.InputAudio = InputAudio;
    }

    /**
     * Get <p>文件输入</p><p>Type=input_file 时必填</p> 
     * @return InputFile <p>文件输入</p><p>Type=input_file 时必填</p>
     */
    public ModelChatInputFile getInputFile() {
        return this.InputFile;
    }

    /**
     * Set <p>文件输入</p><p>Type=input_file 时必填</p>
     * @param InputFile <p>文件输入</p><p>Type=input_file 时必填</p>
     */
    public void setInputFile(ModelChatInputFile InputFile) {
        this.InputFile = InputFile;
    }

    public ModelChatContentPart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelChatContentPart(ModelChatContentPart source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.InputImage != null) {
            this.InputImage = new ModelChatInputImage(source.InputImage);
        }
        if (source.InputVideo != null) {
            this.InputVideo = new ModelChatInputVideo(source.InputVideo);
        }
        if (source.InputAudio != null) {
            this.InputAudio = new ModelChatInputAudio(source.InputAudio);
        }
        if (source.InputFile != null) {
            this.InputFile = new ModelChatInputFile(source.InputFile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "InputImage.", this.InputImage);
        this.setParamObj(map, prefix + "InputVideo.", this.InputVideo);
        this.setParamObj(map, prefix + "InputAudio.", this.InputAudio);
        this.setParamObj(map, prefix + "InputFile.", this.InputFile);

    }
}

