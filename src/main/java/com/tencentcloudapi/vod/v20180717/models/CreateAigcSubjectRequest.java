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

public class CreateAigcSubjectRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>主体名称。</p>
    */
    @SerializedName("SubjectName")
    @Expose
    private String SubjectName;

    /**
    * <p>主体图片，至少上传 1 张主体图片。* 注1：支持传入图片URL（确保可访问）；* 注2：最多支持输入 3 张图；* 注3：图片支持 png、jpeg、jpg、webp格式；* 注4：图片比例需要小于 1:4 或者 4:1 ；* 注5：图片大小不超过 50 MB；</p>
    */
    @SerializedName("SubjectImages")
    @Expose
    private String [] SubjectImages;

    /**
    * <p>视频参考支持上传 1 个主体视频</p><ul><li>注1：仅参考生viduq2-pro模型支持使用视频主体</li><li>注2：最多支持上传 1个5秒 的视频</li><li>注3：视频支持 mp4、avi、mov格式</li><li>注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过100M。</li></ul>
    */
    @SerializedName("SubjectVideos")
    @Expose
    private String [] SubjectVideos;

    /**
    * <p>主体音色Id，该信息仅在创建音视频直出任务时使用</p><ul><li>注1：不传音色id 生成音视频直出任务时，系统会自动推荐音色</li><li>注2：q2-pro不支持使用音色id</li></ul>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>主体名称。</p> 
     * @return SubjectName <p>主体名称。</p>
     */
    public String getSubjectName() {
        return this.SubjectName;
    }

    /**
     * Set <p>主体名称。</p>
     * @param SubjectName <p>主体名称。</p>
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    /**
     * Get <p>主体图片，至少上传 1 张主体图片。* 注1：支持传入图片URL（确保可访问）；* 注2：最多支持输入 3 张图；* 注3：图片支持 png、jpeg、jpg、webp格式；* 注4：图片比例需要小于 1:4 或者 4:1 ；* 注5：图片大小不超过 50 MB；</p> 
     * @return SubjectImages <p>主体图片，至少上传 1 张主体图片。* 注1：支持传入图片URL（确保可访问）；* 注2：最多支持输入 3 张图；* 注3：图片支持 png、jpeg、jpg、webp格式；* 注4：图片比例需要小于 1:4 或者 4:1 ；* 注5：图片大小不超过 50 MB；</p>
     */
    public String [] getSubjectImages() {
        return this.SubjectImages;
    }

    /**
     * Set <p>主体图片，至少上传 1 张主体图片。* 注1：支持传入图片URL（确保可访问）；* 注2：最多支持输入 3 张图；* 注3：图片支持 png、jpeg、jpg、webp格式；* 注4：图片比例需要小于 1:4 或者 4:1 ；* 注5：图片大小不超过 50 MB；</p>
     * @param SubjectImages <p>主体图片，至少上传 1 张主体图片。* 注1：支持传入图片URL（确保可访问）；* 注2：最多支持输入 3 张图；* 注3：图片支持 png、jpeg、jpg、webp格式；* 注4：图片比例需要小于 1:4 或者 4:1 ；* 注5：图片大小不超过 50 MB；</p>
     */
    public void setSubjectImages(String [] SubjectImages) {
        this.SubjectImages = SubjectImages;
    }

    /**
     * Get <p>视频参考支持上传 1 个主体视频</p><ul><li>注1：仅参考生viduq2-pro模型支持使用视频主体</li><li>注2：最多支持上传 1个5秒 的视频</li><li>注3：视频支持 mp4、avi、mov格式</li><li>注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过100M。</li></ul> 
     * @return SubjectVideos <p>视频参考支持上传 1 个主体视频</p><ul><li>注1：仅参考生viduq2-pro模型支持使用视频主体</li><li>注2：最多支持上传 1个5秒 的视频</li><li>注3：视频支持 mp4、avi、mov格式</li><li>注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过100M。</li></ul>
     */
    public String [] getSubjectVideos() {
        return this.SubjectVideos;
    }

    /**
     * Set <p>视频参考支持上传 1 个主体视频</p><ul><li>注1：仅参考生viduq2-pro模型支持使用视频主体</li><li>注2：最多支持上传 1个5秒 的视频</li><li>注3：视频支持 mp4、avi、mov格式</li><li>注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过100M。</li></ul>
     * @param SubjectVideos <p>视频参考支持上传 1 个主体视频</p><ul><li>注1：仅参考生viduq2-pro模型支持使用视频主体</li><li>注2：最多支持上传 1个5秒 的视频</li><li>注3：视频支持 mp4、avi、mov格式</li><li>注4：视频像素不能小于 128*128，且比例需要小于1:4或者4:1，且大小不超过100M。</li></ul>
     */
    public void setSubjectVideos(String [] SubjectVideos) {
        this.SubjectVideos = SubjectVideos;
    }

    /**
     * Get <p>主体音色Id，该信息仅在创建音视频直出任务时使用</p><ul><li>注1：不传音色id 生成音视频直出任务时，系统会自动推荐音色</li><li>注2：q2-pro不支持使用音色id</li></ul> 
     * @return VoiceId <p>主体音色Id，该信息仅在创建音视频直出任务时使用</p><ul><li>注1：不传音色id 生成音视频直出任务时，系统会自动推荐音色</li><li>注2：q2-pro不支持使用音色id</li></ul>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>主体音色Id，该信息仅在创建音视频直出任务时使用</p><ul><li>注1：不传音色id 生成音视频直出任务时，系统会自动推荐音色</li><li>注2：q2-pro不支持使用音色id</li></ul>
     * @param VoiceId <p>主体音色Id，该信息仅在创建音视频直出任务时使用</p><ul><li>注1：不传音色id 生成音视频直出任务时，系统会自动推荐音色</li><li>注2：q2-pro不支持使用音色id</li></ul>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p> 
     * @return TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     * @param TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    public CreateAigcSubjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcSubjectRequest(CreateAigcSubjectRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SubjectName != null) {
            this.SubjectName = new String(source.SubjectName);
        }
        if (source.SubjectImages != null) {
            this.SubjectImages = new String[source.SubjectImages.length];
            for (int i = 0; i < source.SubjectImages.length; i++) {
                this.SubjectImages[i] = new String(source.SubjectImages[i]);
            }
        }
        if (source.SubjectVideos != null) {
            this.SubjectVideos = new String[source.SubjectVideos.length];
            for (int i = 0; i < source.SubjectVideos.length; i++) {
                this.SubjectVideos[i] = new String(source.SubjectVideos[i]);
            }
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SubjectName", this.SubjectName);
        this.setParamArraySimple(map, prefix + "SubjectImages.", this.SubjectImages);
        this.setParamArraySimple(map, prefix + "SubjectVideos.", this.SubjectVideos);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

