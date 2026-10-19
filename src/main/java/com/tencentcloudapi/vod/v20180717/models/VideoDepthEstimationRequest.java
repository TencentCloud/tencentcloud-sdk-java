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

public class VideoDepthEstimationRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 输入视频地址，必填。支持三种形态，按前缀自动识别：
vod://{FileId} —— 引用当前账号下的 VOD 媒资。要求媒资存在且未处于禁用状态，否则将报参数错误。源文件不受影响。
http(s)://... —— 公网可下载的视频地址，长度不超过 8182 字符。
data:{mime};base64,{payload} —— Base64 内联媒体，适合小体积素材。解码后大小上限 20 MB，mime 须为视频容器类型（如 video/mp4、video/quicktime）。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 输出存储配置。不传时为临时存储。
    */
    @SerializedName("OutputConfig")
    @Expose
    private VideoDepthEstimationOutputConfig OutputConfig;

    /**
    * 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 保留字段，特殊用途时使用。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 输入视频地址，必填。支持三种形态，按前缀自动识别：
vod://{FileId} —— 引用当前账号下的 VOD 媒资。要求媒资存在且未处于禁用状态，否则将报参数错误。源文件不受影响。
http(s)://... —— 公网可下载的视频地址，长度不超过 8182 字符。
data:{mime};base64,{payload} —— Base64 内联媒体，适合小体积素材。解码后大小上限 20 MB，mime 须为视频容器类型（如 video/mp4、video/quicktime）。 
     * @return Url 输入视频地址，必填。支持三种形态，按前缀自动识别：
vod://{FileId} —— 引用当前账号下的 VOD 媒资。要求媒资存在且未处于禁用状态，否则将报参数错误。源文件不受影响。
http(s)://... —— 公网可下载的视频地址，长度不超过 8182 字符。
data:{mime};base64,{payload} —— Base64 内联媒体，适合小体积素材。解码后大小上限 20 MB，mime 须为视频容器类型（如 video/mp4、video/quicktime）。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 输入视频地址，必填。支持三种形态，按前缀自动识别：
vod://{FileId} —— 引用当前账号下的 VOD 媒资。要求媒资存在且未处于禁用状态，否则将报参数错误。源文件不受影响。
http(s)://... —— 公网可下载的视频地址，长度不超过 8182 字符。
data:{mime};base64,{payload} —— Base64 内联媒体，适合小体积素材。解码后大小上限 20 MB，mime 须为视频容器类型（如 video/mp4、video/quicktime）。
     * @param Url 输入视频地址，必填。支持三种形态，按前缀自动识别：
vod://{FileId} —— 引用当前账号下的 VOD 媒资。要求媒资存在且未处于禁用状态，否则将报参数错误。源文件不受影响。
http(s)://... —— 公网可下载的视频地址，长度不超过 8182 字符。
data:{mime};base64,{payload} —— Base64 内联媒体，适合小体积素材。解码后大小上限 20 MB，mime 须为视频容器类型（如 video/mp4、video/quicktime）。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 输出存储配置。不传时为临时存储。 
     * @return OutputConfig 输出存储配置。不传时为临时存储。
     */
    public VideoDepthEstimationOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 输出存储配置。不传时为临时存储。
     * @param OutputConfig 输出存储配置。不传时为临时存储。
     */
    public void setOutputConfig(VideoDepthEstimationOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。 
     * @return SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。 
     * @return SessionContext 来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。 
     * @return TasksPriority 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     * @param TasksPriority 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get 保留字段，特殊用途时使用。 
     * @return ExtInfo 保留字段，特殊用途时使用。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 保留字段，特殊用途时使用。
     * @param ExtInfo 保留字段，特殊用途时使用。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public VideoDepthEstimationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDepthEstimationRequest(VideoDepthEstimationRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new VideoDepthEstimationOutputConfig(source.OutputConfig);
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
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

