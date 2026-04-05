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

public class AigcVideoTaskInputSubjectInfo extends AbstractModel {

    /**
    * <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>，可在 prompt 中加入 [@name] 使用。如 name 为小明时，prompt 中描述为 [@小明] 。</li><li>Kling主体可选。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p><strong>仅Vidu有效。</strong>音色ID用来决定视频中的声音音色，为空时系统会自动推荐。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p><strong>仅Vidu有效。</strong>临时主体图片，最多3张图片<br>注1：支持传入图片URL（确保可访问）；<br>注2：图片支持 png、jpeg、jpg、webp格式；<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1。</p>
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * <p><strong>仅Vidu有效。</strong>临时主体视频，最多1个5秒视频注1：仅参考生viduq2-pro模型支持使用视频主体；注2：最多支持上传 1个5秒 的视频；注3：视频支持 mp4、avi、mov格式；注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1；</p>
    */
    @SerializedName("VideoUrls")
    @Expose
    private String [] VideoUrls;

    /**
     * Get <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul> 
     * @return Id <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul>
     * @param Id <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>，可在 prompt 中加入 [@name] 使用。如 name 为小明时，prompt 中描述为 [@小明] 。</li><li>Kling主体可选。</li></ul> 
     * @return Name <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>，可在 prompt 中加入 [@name] 使用。如 name 为小明时，prompt 中描述为 [@小明] 。</li><li>Kling主体可选。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>，可在 prompt 中加入 [@name] 使用。如 name 为小明时，prompt 中描述为 [@小明] 。</li><li>Kling主体可选。</li></ul>
     * @param Name <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>，可在 prompt 中加入 [@name] 使用。如 name 为小明时，prompt 中描述为 [@小明] 。</li><li>Kling主体可选。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p><strong>仅Vidu有效。</strong>音色ID用来决定视频中的声音音色，为空时系统会自动推荐。</p> 
     * @return VoiceId <p><strong>仅Vidu有效。</strong>音色ID用来决定视频中的声音音色，为空时系统会自动推荐。</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p><strong>仅Vidu有效。</strong>音色ID用来决定视频中的声音音色，为空时系统会自动推荐。</p>
     * @param VoiceId <p><strong>仅Vidu有效。</strong>音色ID用来决定视频中的声音音色，为空时系统会自动推荐。</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p><strong>仅Vidu有效。</strong>临时主体图片，最多3张图片<br>注1：支持传入图片URL（确保可访问）；<br>注2：图片支持 png、jpeg、jpg、webp格式；<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1。</p> 
     * @return ImageUrls <p><strong>仅Vidu有效。</strong>临时主体图片，最多3张图片<br>注1：支持传入图片URL（确保可访问）；<br>注2：图片支持 png、jpeg、jpg、webp格式；<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1。</p>
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set <p><strong>仅Vidu有效。</strong>临时主体图片，最多3张图片<br>注1：支持传入图片URL（确保可访问）；<br>注2：图片支持 png、jpeg、jpg、webp格式；<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1。</p>
     * @param ImageUrls <p><strong>仅Vidu有效。</strong>临时主体图片，最多3张图片<br>注1：支持传入图片URL（确保可访问）；<br>注2：图片支持 png、jpeg、jpg、webp格式；<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1。</p>
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get <p><strong>仅Vidu有效。</strong>临时主体视频，最多1个5秒视频注1：仅参考生viduq2-pro模型支持使用视频主体；注2：最多支持上传 1个5秒 的视频；注3：视频支持 mp4、avi、mov格式；注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1；</p> 
     * @return VideoUrls <p><strong>仅Vidu有效。</strong>临时主体视频，最多1个5秒视频注1：仅参考生viduq2-pro模型支持使用视频主体；注2：最多支持上传 1个5秒 的视频；注3：视频支持 mp4、avi、mov格式；注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1；</p>
     */
    public String [] getVideoUrls() {
        return this.VideoUrls;
    }

    /**
     * Set <p><strong>仅Vidu有效。</strong>临时主体视频，最多1个5秒视频注1：仅参考生viduq2-pro模型支持使用视频主体；注2：最多支持上传 1个5秒 的视频；注3：视频支持 mp4、avi、mov格式；注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1；</p>
     * @param VideoUrls <p><strong>仅Vidu有效。</strong>临时主体视频，最多1个5秒视频注1：仅参考生viduq2-pro模型支持使用视频主体；注2：最多支持上传 1个5秒 的视频；注3：视频支持 mp4、avi、mov格式；注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1；</p>
     */
    public void setVideoUrls(String [] VideoUrls) {
        this.VideoUrls = VideoUrls;
    }

    public AigcVideoTaskInputSubjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskInputSubjectInfo(AigcVideoTaskInputSubjectInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.ImageUrls != null) {
            this.ImageUrls = new String[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new String(source.ImageUrls[i]);
            }
        }
        if (source.VideoUrls != null) {
            this.VideoUrls = new String[source.VideoUrls.length];
            for (int i = 0; i < source.VideoUrls.length; i++) {
                this.VideoUrls[i] = new String(source.VideoUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamArraySimple(map, prefix + "ImageUrls.", this.ImageUrls);
        this.setParamArraySimple(map, prefix + "VideoUrls.", this.VideoUrls);

    }
}

