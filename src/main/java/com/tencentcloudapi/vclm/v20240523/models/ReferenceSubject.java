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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReferenceSubject extends AbstractModel {

    /**
    * <p>主体id，后续生成时在提示词中可以通过@主体id的方式使用。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>该主体对应的图片url，每个主体最多支持3张图片<br>注1：支持传入图片URL（确保可访问）<br>注2：图片支持 png、jpeg、jpg、webp格式<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过50M。</p>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>主体id，后续生成时可以通过@主体id的方式使用</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>主体视频，该主体对应的视频url，与videos必填一个<br>注1： 仅viduq2-pro模型支持使用视频主体<br>注2：每个主体中的图片和视频，共享3个槽位<br>注3：支持1个5秒视频<br>注4：支持传入视频 URL（确保可访问）<br>注5：视频支持 mp4、avi、mov格式<br>注6：视频像素不能小于 128*128，且比例需要小于1:4或者4:1<br>注7：请注意，base64 decode之后的字节长度需要小于20M，且编码必须包含适当的内容类型字符串</p>
    */
    @SerializedName("Videos")
    @Expose
    private String [] Videos;

    /**
    * <p>音色ID用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：[音色列表](URL https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg)</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
     * Get <p>主体id，后续生成时在提示词中可以通过@主体id的方式使用。</p> 
     * @return Id <p>主体id，后续生成时在提示词中可以通过@主体id的方式使用。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>主体id，后续生成时在提示词中可以通过@主体id的方式使用。</p>
     * @param Id <p>主体id，后续生成时在提示词中可以通过@主体id的方式使用。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>该主体对应的图片url，每个主体最多支持3张图片<br>注1：支持传入图片URL（确保可访问）<br>注2：图片支持 png、jpeg、jpg、webp格式<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过50M。</p> 
     * @return Images <p>该主体对应的图片url，每个主体最多支持3张图片<br>注1：支持传入图片URL（确保可访问）<br>注2：图片支持 png、jpeg、jpg、webp格式<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过50M。</p>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>该主体对应的图片url，每个主体最多支持3张图片<br>注1：支持传入图片URL（确保可访问）<br>注2：图片支持 png、jpeg、jpg、webp格式<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过50M。</p>
     * @param Images <p>该主体对应的图片url，每个主体最多支持3张图片<br>注1：支持传入图片URL（确保可访问）<br>注2：图片支持 png、jpeg、jpg、webp格式<br>注3：图片像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过50M。</p>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>主体id，后续生成时可以通过@主体id的方式使用</p> 
     * @return Name <p>主体id，后续生成时可以通过@主体id的方式使用</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>主体id，后续生成时可以通过@主体id的方式使用</p>
     * @param Name <p>主体id，后续生成时可以通过@主体id的方式使用</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>主体视频，该主体对应的视频url，与videos必填一个<br>注1： 仅viduq2-pro模型支持使用视频主体<br>注2：每个主体中的图片和视频，共享3个槽位<br>注3：支持1个5秒视频<br>注4：支持传入视频 URL（确保可访问）<br>注5：视频支持 mp4、avi、mov格式<br>注6：视频像素不能小于 128*128，且比例需要小于1:4或者4:1<br>注7：请注意，base64 decode之后的字节长度需要小于20M，且编码必须包含适当的内容类型字符串</p> 
     * @return Videos <p>主体视频，该主体对应的视频url，与videos必填一个<br>注1： 仅viduq2-pro模型支持使用视频主体<br>注2：每个主体中的图片和视频，共享3个槽位<br>注3：支持1个5秒视频<br>注4：支持传入视频 URL（确保可访问）<br>注5：视频支持 mp4、avi、mov格式<br>注6：视频像素不能小于 128*128，且比例需要小于1:4或者4:1<br>注7：请注意，base64 decode之后的字节长度需要小于20M，且编码必须包含适当的内容类型字符串</p>
     */
    public String [] getVideos() {
        return this.Videos;
    }

    /**
     * Set <p>主体视频，该主体对应的视频url，与videos必填一个<br>注1： 仅viduq2-pro模型支持使用视频主体<br>注2：每个主体中的图片和视频，共享3个槽位<br>注3：支持1个5秒视频<br>注4：支持传入视频 URL（确保可访问）<br>注5：视频支持 mp4、avi、mov格式<br>注6：视频像素不能小于 128*128，且比例需要小于1:4或者4:1<br>注7：请注意，base64 decode之后的字节长度需要小于20M，且编码必须包含适当的内容类型字符串</p>
     * @param Videos <p>主体视频，该主体对应的视频url，与videos必填一个<br>注1： 仅viduq2-pro模型支持使用视频主体<br>注2：每个主体中的图片和视频，共享3个槽位<br>注3：支持1个5秒视频<br>注4：支持传入视频 URL（确保可访问）<br>注5：视频支持 mp4、avi、mov格式<br>注6：视频像素不能小于 128*128，且比例需要小于1:4或者4:1<br>注7：请注意，base64 decode之后的字节长度需要小于20M，且编码必须包含适当的内容类型字符串</p>
     */
    public void setVideos(String [] Videos) {
        this.Videos = Videos;
    }

    /**
     * Get <p>音色ID用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：[音色列表](URL https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg)</p> 
     * @return VoiceId <p>音色ID用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：[音色列表](URL https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg)</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色ID用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：[音色列表](URL https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg)</p>
     * @param VoiceId <p>音色ID用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：[音色列表](URL https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg)</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    public ReferenceSubject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReferenceSubject(ReferenceSubject source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Videos != null) {
            this.Videos = new String[source.Videos.length];
            for (int i = 0; i < source.Videos.length; i++) {
                this.Videos[i] = new String(source.Videos[i]);
            }
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Videos.", this.Videos);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);

    }
}

