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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialInfo extends AbstractModel{

    /**
    * 素材基本信息。
    */
    @SerializedName("BasicInfo")
    @Expose
    private MaterialBasicInfo BasicInfo;

    /**
    * 视频素材信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoMaterial")
    @Expose
    private VideoMaterial VideoMaterial;

    /**
    * 音频素材信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioMaterial")
    @Expose
    private AudioMaterial AudioMaterial;

    /**
    * 图片素材信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageMaterial")
    @Expose
    private ImageMaterial ImageMaterial;

    /**
    * 链接素材信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkMaterial")
    @Expose
    private LinkMaterial LinkMaterial;

    /**
     * Get 素材基本信息。 
     * @return BasicInfo 素材基本信息。
     */
    public MaterialBasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set 素材基本信息。
     * @param BasicInfo 素材基本信息。
     */
    public void setBasicInfo(MaterialBasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get 视频素材信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoMaterial 视频素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoMaterial getVideoMaterial() {
        return this.VideoMaterial;
    }

    /**
     * Set 视频素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoMaterial 视频素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoMaterial(VideoMaterial VideoMaterial) {
        this.VideoMaterial = VideoMaterial;
    }

    /**
     * Get 音频素材信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioMaterial 音频素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioMaterial getAudioMaterial() {
        return this.AudioMaterial;
    }

    /**
     * Set 音频素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioMaterial 音频素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioMaterial(AudioMaterial AudioMaterial) {
        this.AudioMaterial = AudioMaterial;
    }

    /**
     * Get 图片素材信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageMaterial 图片素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageMaterial getImageMaterial() {
        return this.ImageMaterial;
    }

    /**
     * Set 图片素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageMaterial 图片素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageMaterial(ImageMaterial ImageMaterial) {
        this.ImageMaterial = ImageMaterial;
    }

    /**
     * Get 链接素材信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkMaterial 链接素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LinkMaterial getLinkMaterial() {
        return this.LinkMaterial;
    }

    /**
     * Set 链接素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkMaterial 链接素材信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkMaterial(LinkMaterial LinkMaterial) {
        this.LinkMaterial = LinkMaterial;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BasicInfo.", this.BasicInfo);
        this.setParamObj(map, prefix + "VideoMaterial.", this.VideoMaterial);
        this.setParamObj(map, prefix + "AudioMaterial.", this.AudioMaterial);
        this.setParamObj(map, prefix + "ImageMaterial.", this.ImageMaterial);
        this.setParamObj(map, prefix + "LinkMaterial.", this.LinkMaterial);

    }
}

