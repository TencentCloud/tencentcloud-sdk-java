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

public class CreateAigcVideoTaskRequest extends AbstractModel {

    /**
    * <p>模型名称。<br>当前支持的模型列表:<br>Hunyuan,<br>Hailuo，<br>Kling，<br>Vidu，<br>OS，<br>GV。</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hailuo， 可选[02、2.3]。</li><li>Kling，可选[2.0、2.1、2.5、O1、2.6、3.0、3.0-Omni]。</li><li>Vidu,可选[q2、q2-pro、q2-turbo、q3-pro、q3-turbo]。</li><li>GV, 可选[3.1]。</li><li>OS，可选[2.0]。</li></ol>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>指定场景生视频。<br>注意：仅部分模型支持指定场景。</p><ol><li>Kling支持动作控制，motion_control。</li><li>Mingmou支持横转竖，land2port。</li><li>Vidu支持特效模板，template_effect。</li></ol>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>用于描述您想要阻止模型生成的内容。<br>注意：部分模型支持。<br>例如：<br>顶部照明、明亮的色彩<br>人物、动物<br>多辆汽车、风。</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private Boolean EnhancePrompt;

    /**
    * <p>用于指导视频生成的图片 URL。该URL需外网可访问。<br>注意：</p><ol><li>推荐图片大小不超过10M，不同模型大小限制不相同。</li><li>支持的图片格式：jpeg、png。</li><li>使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。</li></ol>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>模型将以此参数传入的图片作为尾帧画面来生成视频。<br>支持此参数的模型：</p><ol><li>GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。</li><li>Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。</li><li>Vidu, q2-pro, q2-turbo 支持首尾帧。</li></ol><p>注意：</p><ol><li>推荐图片大小不超过10M，各模型限制不同。</li><li>支持的图片格式：jpeg、png。</li></ol>
    */
    @SerializedName("LastImageUrl")
    @Expose
    private String LastImageUrl;

    /**
    * <p>最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。</p><p>支持多图输入的模型：</p><ol><li>GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。</li><li>Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。</li></ol><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、png。</li></ol>
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcVideoReferenceImageInfo [] ImageInfos;

    /**
    * <p>目前仅Kling O1版本支持参考视频信息传入。<br>可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声。</p>
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcVideoReferenceVideoInfo [] VideoInfos;

    /**
    * <p>生成视频的时长。<br>注意：</p><ol><li>Kling支持 5、10秒。默认: 5秒。</li><li>Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。</li><li>Vidu支持1-10秒。</li><li>GV支持 8秒。 默认：8秒。</li><li>OS支持4、8、12秒。 默认：8秒。</li></ol>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>用于传入要求的额外参数。</p>
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcVideoExtraParam ExtraParameters;

    /**
    * <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * <p>接口操作者名称。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>模型名称。<br>当前支持的模型列表:<br>Hunyuan,<br>Hailuo，<br>Kling，<br>Vidu，<br>OS，<br>GV。</p> 
     * @return ModelName <p>模型名称。<br>当前支持的模型列表:<br>Hunyuan,<br>Hailuo，<br>Kling，<br>Vidu，<br>OS，<br>GV。</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。<br>当前支持的模型列表:<br>Hunyuan,<br>Hailuo，<br>Kling，<br>Vidu，<br>OS，<br>GV。</p>
     * @param ModelName <p>模型名称。<br>当前支持的模型列表:<br>Hunyuan,<br>Hailuo，<br>Kling，<br>Vidu，<br>OS，<br>GV。</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hailuo， 可选[02、2.3]。</li><li>Kling，可选[2.0、2.1、2.5、O1、2.6、3.0、3.0-Omni]。</li><li>Vidu,可选[q2、q2-pro、q2-turbo、q3-pro、q3-turbo]。</li><li>GV, 可选[3.1]。</li><li>OS，可选[2.0]。</li></ol> 
     * @return ModelVersion <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hailuo， 可选[02、2.3]。</li><li>Kling，可选[2.0、2.1、2.5、O1、2.6、3.0、3.0-Omni]。</li><li>Vidu,可选[q2、q2-pro、q2-turbo、q3-pro、q3-turbo]。</li><li>GV, 可选[3.1]。</li><li>OS，可选[2.0]。</li></ol>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hailuo， 可选[02、2.3]。</li><li>Kling，可选[2.0、2.1、2.5、O1、2.6、3.0、3.0-Omni]。</li><li>Vidu,可选[q2、q2-pro、q2-turbo、q3-pro、q3-turbo]。</li><li>GV, 可选[3.1]。</li><li>OS，可选[2.0]。</li></ol>
     * @param ModelVersion <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hailuo， 可选[02、2.3]。</li><li>Kling，可选[2.0、2.1、2.5、O1、2.6、3.0、3.0-Omni]。</li><li>Vidu,可选[q2、q2-pro、q2-turbo、q3-pro、q3-turbo]。</li><li>GV, 可选[3.1]。</li><li>OS，可选[2.0]。</li></ol>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>指定场景生视频。<br>注意：仅部分模型支持指定场景。</p><ol><li>Kling支持动作控制，motion_control。</li><li>Mingmou支持横转竖，land2port。</li><li>Vidu支持特效模板，template_effect。</li></ol> 
     * @return SceneType <p>指定场景生视频。<br>注意：仅部分模型支持指定场景。</p><ol><li>Kling支持动作控制，motion_control。</li><li>Mingmou支持横转竖，land2port。</li><li>Vidu支持特效模板，template_effect。</li></ol>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>指定场景生视频。<br>注意：仅部分模型支持指定场景。</p><ol><li>Kling支持动作控制，motion_control。</li><li>Mingmou支持横转竖，land2port。</li><li>Vidu支持特效模板，template_effect。</li></ol>
     * @param SceneType <p>指定场景生视频。<br>注意：仅部分模型支持指定场景。</p><ol><li>Kling支持动作控制，motion_control。</li><li>Mingmou支持横转竖，land2port。</li><li>Vidu支持特效模板，template_effect。</li></ol>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p> 
     * @return Prompt <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p>
     * @param Prompt <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>用于描述您想要阻止模型生成的内容。<br>注意：部分模型支持。<br>例如：<br>顶部照明、明亮的色彩<br>人物、动物<br>多辆汽车、风。</p> 
     * @return NegativePrompt <p>用于描述您想要阻止模型生成的内容。<br>注意：部分模型支持。<br>例如：<br>顶部照明、明亮的色彩<br>人物、动物<br>多辆汽车、风。</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>用于描述您想要阻止模型生成的内容。<br>注意：部分模型支持。<br>例如：<br>顶部照明、明亮的色彩<br>人物、动物<br>多辆汽车、风。</p>
     * @param NegativePrompt <p>用于描述您想要阻止模型生成的内容。<br>注意：部分模型支持。<br>例如：<br>顶部照明、明亮的色彩<br>人物、动物<br>多辆汽车、风。</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p> 
     * @return EnhancePrompt <p>默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p>
     */
    public Boolean getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set <p>默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p>
     * @param EnhancePrompt <p>默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p>
     */
    public void setEnhancePrompt(Boolean EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get <p>用于指导视频生成的图片 URL。该URL需外网可访问。<br>注意：</p><ol><li>推荐图片大小不超过10M，不同模型大小限制不相同。</li><li>支持的图片格式：jpeg、png。</li><li>使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。</li></ol> 
     * @return ImageUrl <p>用于指导视频生成的图片 URL。该URL需外网可访问。<br>注意：</p><ol><li>推荐图片大小不超过10M，不同模型大小限制不相同。</li><li>支持的图片格式：jpeg、png。</li><li>使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。</li></ol>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>用于指导视频生成的图片 URL。该URL需外网可访问。<br>注意：</p><ol><li>推荐图片大小不超过10M，不同模型大小限制不相同。</li><li>支持的图片格式：jpeg、png。</li><li>使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。</li></ol>
     * @param ImageUrl <p>用于指导视频生成的图片 URL。该URL需外网可访问。<br>注意：</p><ol><li>推荐图片大小不超过10M，不同模型大小限制不相同。</li><li>支持的图片格式：jpeg、png。</li><li>使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。</li></ol>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>模型将以此参数传入的图片作为尾帧画面来生成视频。<br>支持此参数的模型：</p><ol><li>GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。</li><li>Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。</li><li>Vidu, q2-pro, q2-turbo 支持首尾帧。</li></ol><p>注意：</p><ol><li>推荐图片大小不超过10M，各模型限制不同。</li><li>支持的图片格式：jpeg、png。</li></ol> 
     * @return LastImageUrl <p>模型将以此参数传入的图片作为尾帧画面来生成视频。<br>支持此参数的模型：</p><ol><li>GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。</li><li>Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。</li><li>Vidu, q2-pro, q2-turbo 支持首尾帧。</li></ol><p>注意：</p><ol><li>推荐图片大小不超过10M，各模型限制不同。</li><li>支持的图片格式：jpeg、png。</li></ol>
     */
    public String getLastImageUrl() {
        return this.LastImageUrl;
    }

    /**
     * Set <p>模型将以此参数传入的图片作为尾帧画面来生成视频。<br>支持此参数的模型：</p><ol><li>GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。</li><li>Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。</li><li>Vidu, q2-pro, q2-turbo 支持首尾帧。</li></ol><p>注意：</p><ol><li>推荐图片大小不超过10M，各模型限制不同。</li><li>支持的图片格式：jpeg、png。</li></ol>
     * @param LastImageUrl <p>模型将以此参数传入的图片作为尾帧画面来生成视频。<br>支持此参数的模型：</p><ol><li>GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。</li><li>Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。</li><li>Vidu, q2-pro, q2-turbo 支持首尾帧。</li></ol><p>注意：</p><ol><li>推荐图片大小不超过10M，各模型限制不同。</li><li>支持的图片格式：jpeg、png。</li></ol>
     */
    public void setLastImageUrl(String LastImageUrl) {
        this.LastImageUrl = LastImageUrl;
    }

    /**
     * Get <p>最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。</p><p>支持多图输入的模型：</p><ol><li>GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。</li><li>Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。</li></ol><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、png。</li></ol> 
     * @return ImageInfos <p>最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。</p><p>支持多图输入的模型：</p><ol><li>GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。</li><li>Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。</li></ol><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、png。</li></ol>
     */
    public AigcVideoReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set <p>最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。</p><p>支持多图输入的模型：</p><ol><li>GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。</li><li>Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。</li></ol><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、png。</li></ol>
     * @param ImageInfos <p>最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。</p><p>支持多图输入的模型：</p><ol><li>GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。</li><li>Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。</li></ol><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、png。</li></ol>
     */
    public void setImageInfos(AigcVideoReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get <p>目前仅Kling O1版本支持参考视频信息传入。<br>可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声。</p> 
     * @return VideoInfos <p>目前仅Kling O1版本支持参考视频信息传入。<br>可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声。</p>
     */
    public AigcVideoReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>目前仅Kling O1版本支持参考视频信息传入。<br>可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声。</p>
     * @param VideoInfos <p>目前仅Kling O1版本支持参考视频信息传入。<br>可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声。</p>
     */
    public void setVideoInfos(AigcVideoReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get <p>生成视频的时长。<br>注意：</p><ol><li>Kling支持 5、10秒。默认: 5秒。</li><li>Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。</li><li>Vidu支持1-10秒。</li><li>GV支持 8秒。 默认：8秒。</li><li>OS支持4、8、12秒。 默认：8秒。</li></ol> 
     * @return Duration <p>生成视频的时长。<br>注意：</p><ol><li>Kling支持 5、10秒。默认: 5秒。</li><li>Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。</li><li>Vidu支持1-10秒。</li><li>GV支持 8秒。 默认：8秒。</li><li>OS支持4、8、12秒。 默认：8秒。</li></ol>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>生成视频的时长。<br>注意：</p><ol><li>Kling支持 5、10秒。默认: 5秒。</li><li>Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。</li><li>Vidu支持1-10秒。</li><li>GV支持 8秒。 默认：8秒。</li><li>OS支持4、8、12秒。 默认：8秒。</li></ol>
     * @param Duration <p>生成视频的时长。<br>注意：</p><ol><li>Kling支持 5、10秒。默认: 5秒。</li><li>Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。</li><li>Vidu支持1-10秒。</li><li>GV支持 8秒。 默认：8秒。</li><li>OS支持4、8、12秒。 默认：8秒。</li></ol>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>用于传入要求的额外参数。</p> 
     * @return ExtraParameters <p>用于传入要求的额外参数。</p>
     */
    public AigcVideoExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set <p>用于传入要求的额外参数。</p>
     * @param ExtraParameters <p>用于传入要求的额外参数。</p>
     */
    public void setExtraParameters(AigcVideoExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p> 
     * @return StoreCosParam <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     * @param StoreCosParam <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p> 
     * @return AdditionalParameters <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p>
     * @param AdditionalParameters <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get <p>接口操作者名称。</p> 
     * @return Operator <p>接口操作者名称。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>接口操作者名称。</p>
     * @param Operator <p>接口操作者名称。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CreateAigcVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcVideoTaskRequest(CreateAigcVideoTaskRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new Boolean(source.EnhancePrompt);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.LastImageUrl != null) {
            this.LastImageUrl = new String(source.LastImageUrl);
        }
        if (source.ImageInfos != null) {
            this.ImageInfos = new AigcVideoReferenceImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new AigcVideoReferenceImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new AigcVideoReferenceVideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new AigcVideoReferenceVideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new AigcVideoExtraParam(source.ExtraParameters);
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new AigcStoreCosParam(source.StoreCosParam);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "LastImageUrl", this.LastImageUrl);
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

