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

public class CreateAigcElementRequest extends AbstractModel {

    /**
    * <p>主体名称<br>不能超过20个字符</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>主体描述</p><p>不能超过100个字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>主体参考方式</p><p>枚举值：<br>video_refer<br>image_refer<br>video_refer: 视频角色主体，此时将参考element_video_list定义主体外表<br>image_refer: 多图主体，此时将参考element_image_list定义主体外表</p>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * <p>主体参考图，可通过多张图片设定主体及其细节</p><p>包括正面参考图和其他角度或特写参考图，其中：至少包括1张正面参考图，由frontal_image参数定义；需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义<br>支持传入图片Base64编码或图片URL（确保可访问）</p><p>图片格式支持.jpg / .jpeg / .png。图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间</p><p>reference_type参数值为 image_refer 时，当前参数必填</p>
    */
    @SerializedName("ElementImageList")
    @Expose
    private ElementImageList ElementImageList;

    /**
    * <p>主体参考视频，可通过视频设定主体及其细节</p><p>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</p><p>暂时仅支持通过视频定制写实风格的人形形象</p><p>参考视频时当前参数必填，参考图片时当前参数无效</p><p>用key:value承载。视频格式仅支持MP4/MOV。仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频。至多仅支持上传1段视频，视频大小不超过200MB。video_url参数值不得为空</p>
    */
    @SerializedName("VideoList")
    @Expose
    private String [] VideoList;

    /**
    * <p>厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String [] Provider;

    /**
    * <p>为主体配置标签，一个主体可以配置多个标签</p><p>用key:value承载。tag的ID与名称：o_101 热梗, o_102 人物, o_103 动物, o_104 道具, o_105 服饰, o_106 场景, o_107 特效, o_108 其他</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
    * <p>主体音色ID，可绑定音色库中已有音色</p><p>当前参数为空时，当前主体不绑定音色<br>为多图主体绑定音色时，仅支持人物形象主体或类人形象主体</p>
    */
    @SerializedName("ElementVoiceId")
    @Expose
    private String ElementVoiceId;

    /**
     * Get <p>主体名称<br>不能超过20个字符</p> 
     * @return Name <p>主体名称<br>不能超过20个字符</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>主体名称<br>不能超过20个字符</p>
     * @param Name <p>主体名称<br>不能超过20个字符</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>主体描述</p><p>不能超过100个字符</p> 
     * @return Description <p>主体描述</p><p>不能超过100个字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>主体描述</p><p>不能超过100个字符</p>
     * @param Description <p>主体描述</p><p>不能超过100个字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>主体参考方式</p><p>枚举值：<br>video_refer<br>image_refer<br>video_refer: 视频角色主体，此时将参考element_video_list定义主体外表<br>image_refer: 多图主体，此时将参考element_image_list定义主体外表</p> 
     * @return ReferenceType <p>主体参考方式</p><p>枚举值：<br>video_refer<br>image_refer<br>video_refer: 视频角色主体，此时将参考element_video_list定义主体外表<br>image_refer: 多图主体，此时将参考element_image_list定义主体外表</p>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>主体参考方式</p><p>枚举值：<br>video_refer<br>image_refer<br>video_refer: 视频角色主体，此时将参考element_video_list定义主体外表<br>image_refer: 多图主体，此时将参考element_image_list定义主体外表</p>
     * @param ReferenceType <p>主体参考方式</p><p>枚举值：<br>video_refer<br>image_refer<br>video_refer: 视频角色主体，此时将参考element_video_list定义主体外表<br>image_refer: 多图主体，此时将参考element_image_list定义主体外表</p>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>主体参考图，可通过多张图片设定主体及其细节</p><p>包括正面参考图和其他角度或特写参考图，其中：至少包括1张正面参考图，由frontal_image参数定义；需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义<br>支持传入图片Base64编码或图片URL（确保可访问）</p><p>图片格式支持.jpg / .jpeg / .png。图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间</p><p>reference_type参数值为 image_refer 时，当前参数必填</p> 
     * @return ElementImageList <p>主体参考图，可通过多张图片设定主体及其细节</p><p>包括正面参考图和其他角度或特写参考图，其中：至少包括1张正面参考图，由frontal_image参数定义；需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义<br>支持传入图片Base64编码或图片URL（确保可访问）</p><p>图片格式支持.jpg / .jpeg / .png。图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间</p><p>reference_type参数值为 image_refer 时，当前参数必填</p>
     */
    public ElementImageList getElementImageList() {
        return this.ElementImageList;
    }

    /**
     * Set <p>主体参考图，可通过多张图片设定主体及其细节</p><p>包括正面参考图和其他角度或特写参考图，其中：至少包括1张正面参考图，由frontal_image参数定义；需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义<br>支持传入图片Base64编码或图片URL（确保可访问）</p><p>图片格式支持.jpg / .jpeg / .png。图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间</p><p>reference_type参数值为 image_refer 时，当前参数必填</p>
     * @param ElementImageList <p>主体参考图，可通过多张图片设定主体及其细节</p><p>包括正面参考图和其他角度或特写参考图，其中：至少包括1张正面参考图，由frontal_image参数定义；需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义<br>支持传入图片Base64编码或图片URL（确保可访问）</p><p>图片格式支持.jpg / .jpeg / .png。图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间</p><p>reference_type参数值为 image_refer 时，当前参数必填</p>
     */
    public void setElementImageList(ElementImageList ElementImageList) {
        this.ElementImageList = ElementImageList;
    }

    /**
     * Get <p>主体参考视频，可通过视频设定主体及其细节</p><p>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</p><p>暂时仅支持通过视频定制写实风格的人形形象</p><p>参考视频时当前参数必填，参考图片时当前参数无效</p><p>用key:value承载。视频格式仅支持MP4/MOV。仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频。至多仅支持上传1段视频，视频大小不超过200MB。video_url参数值不得为空</p> 
     * @return VideoList <p>主体参考视频，可通过视频设定主体及其细节</p><p>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</p><p>暂时仅支持通过视频定制写实风格的人形形象</p><p>参考视频时当前参数必填，参考图片时当前参数无效</p><p>用key:value承载。视频格式仅支持MP4/MOV。仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频。至多仅支持上传1段视频，视频大小不超过200MB。video_url参数值不得为空</p>
     */
    public String [] getVideoList() {
        return this.VideoList;
    }

    /**
     * Set <p>主体参考视频，可通过视频设定主体及其细节</p><p>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</p><p>暂时仅支持通过视频定制写实风格的人形形象</p><p>参考视频时当前参数必填，参考图片时当前参数无效</p><p>用key:value承载。视频格式仅支持MP4/MOV。仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频。至多仅支持上传1段视频，视频大小不超过200MB。video_url参数值不得为空</p>
     * @param VideoList <p>主体参考视频，可通过视频设定主体及其细节</p><p>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</p><p>暂时仅支持通过视频定制写实风格的人形形象</p><p>参考视频时当前参数必填，参考图片时当前参数无效</p><p>用key:value承载。视频格式仅支持MP4/MOV。仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频。至多仅支持上传1段视频，视频大小不超过200MB。video_url参数值不得为空</p>
     */
    public void setVideoList(String [] VideoList) {
        this.VideoList = VideoList;
    }

    /**
     * Get <p>厂商</p> 
     * @return Provider <p>厂商</p>
     */
    public String [] getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>厂商</p>
     * @param Provider <p>厂商</p>
     */
    public void setProvider(String [] Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>为主体配置标签，一个主体可以配置多个标签</p><p>用key:value承载。tag的ID与名称：o_101 热梗, o_102 人物, o_103 动物, o_104 道具, o_105 服饰, o_106 场景, o_107 特效, o_108 其他</p> 
     * @return TagList <p>为主体配置标签，一个主体可以配置多个标签</p><p>用key:value承载。tag的ID与名称：o_101 热梗, o_102 人物, o_103 动物, o_104 道具, o_105 服饰, o_106 场景, o_107 特效, o_108 其他</p>
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>为主体配置标签，一个主体可以配置多个标签</p><p>用key:value承载。tag的ID与名称：o_101 热梗, o_102 人物, o_103 动物, o_104 道具, o_105 服饰, o_106 场景, o_107 特效, o_108 其他</p>
     * @param TagList <p>为主体配置标签，一个主体可以配置多个标签</p><p>用key:value承载。tag的ID与名称：o_101 热梗, o_102 人物, o_103 动物, o_104 道具, o_105 服饰, o_106 场景, o_107 特效, o_108 其他</p>
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>主体音色ID，可绑定音色库中已有音色</p><p>当前参数为空时，当前主体不绑定音色<br>为多图主体绑定音色时，仅支持人物形象主体或类人形象主体</p> 
     * @return ElementVoiceId <p>主体音色ID，可绑定音色库中已有音色</p><p>当前参数为空时，当前主体不绑定音色<br>为多图主体绑定音色时，仅支持人物形象主体或类人形象主体</p>
     */
    public String getElementVoiceId() {
        return this.ElementVoiceId;
    }

    /**
     * Set <p>主体音色ID，可绑定音色库中已有音色</p><p>当前参数为空时，当前主体不绑定音色<br>为多图主体绑定音色时，仅支持人物形象主体或类人形象主体</p>
     * @param ElementVoiceId <p>主体音色ID，可绑定音色库中已有音色</p><p>当前参数为空时，当前主体不绑定音色<br>为多图主体绑定音色时，仅支持人物形象主体或类人形象主体</p>
     */
    public void setElementVoiceId(String ElementVoiceId) {
        this.ElementVoiceId = ElementVoiceId;
    }

    public CreateAigcElementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcElementRequest(CreateAigcElementRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ElementImageList != null) {
            this.ElementImageList = new ElementImageList(source.ElementImageList);
        }
        if (source.VideoList != null) {
            this.VideoList = new String[source.VideoList.length];
            for (int i = 0; i < source.VideoList.length; i++) {
                this.VideoList[i] = new String(source.VideoList[i]);
            }
        }
        if (source.Provider != null) {
            this.Provider = new String[source.Provider.length];
            for (int i = 0; i < source.Provider.length; i++) {
                this.Provider[i] = new String(source.Provider[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new TagList[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagList(source.TagList[i]);
            }
        }
        if (source.ElementVoiceId != null) {
            this.ElementVoiceId = new String(source.ElementVoiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamObj(map, prefix + "ElementImageList.", this.ElementImageList);
        this.setParamArraySimple(map, prefix + "VideoList.", this.VideoList);
        this.setParamArraySimple(map, prefix + "Provider.", this.Provider);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "ElementVoiceId", this.ElementVoiceId);

    }
}

