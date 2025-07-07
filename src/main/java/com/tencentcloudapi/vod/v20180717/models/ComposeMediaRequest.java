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

public class ComposeMediaRequest extends AbstractModel {

    /**
    * 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频、图片，每一种类型的轨道最多支持 10 个。</li><li>所有类型的轨道上放置的媒体片段数量总和最多支持 500 个。</li>
    */
    @SerializedName("Tracks")
    @Expose
    private MediaTrack [] Tracks;

    /**
    * 输出的媒体文件信息。
    */
    @SerializedName("Output")
    @Expose
    private ComposeMediaOutput Output;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 制作视频文件时使用的画布。
    */
    @SerializedName("Canvas")
    @Expose
    private Canvas Canvas;

    /**
    * 标识来源上下文，用于透传用户请求信息，在ComposeMediaComplete回调将返回该字段值，最长 1000个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频、图片，每一种类型的轨道最多支持 10 个。</li><li>所有类型的轨道上放置的媒体片段数量总和最多支持 500 个。</li> 
     * @return Tracks 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频、图片，每一种类型的轨道最多支持 10 个。</li><li>所有类型的轨道上放置的媒体片段数量总和最多支持 500 个。</li>
     */
    public MediaTrack [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频、图片，每一种类型的轨道最多支持 10 个。</li><li>所有类型的轨道上放置的媒体片段数量总和最多支持 500 个。</li>
     * @param Tracks 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频、图片，每一种类型的轨道最多支持 10 个。</li><li>所有类型的轨道上放置的媒体片段数量总和最多支持 500 个。</li>
     */
    public void setTracks(MediaTrack [] Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * Get 输出的媒体文件信息。 
     * @return Output 输出的媒体文件信息。
     */
    public ComposeMediaOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 输出的媒体文件信息。
     * @param Output 输出的媒体文件信息。
     */
    public void setOutput(ComposeMediaOutput Output) {
        this.Output = Output;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 制作视频文件时使用的画布。 
     * @return Canvas 制作视频文件时使用的画布。
     */
    public Canvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set 制作视频文件时使用的画布。
     * @param Canvas 制作视频文件时使用的画布。
     */
    public void setCanvas(Canvas Canvas) {
        this.Canvas = Canvas;
    }

    /**
     * Get 标识来源上下文，用于透传用户请求信息，在ComposeMediaComplete回调将返回该字段值，最长 1000个字符。 
     * @return SessionContext 标识来源上下文，用于透传用户请求信息，在ComposeMediaComplete回调将返回该字段值，最长 1000个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 标识来源上下文，用于透传用户请求信息，在ComposeMediaComplete回调将返回该字段值，最长 1000个字符。
     * @param SessionContext 标识来源上下文，用于透传用户请求信息，在ComposeMediaComplete回调将返回该字段值，最长 1000个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。 
     * @return SessionId 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public ComposeMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaRequest(ComposeMediaRequest source) {
        if (source.Tracks != null) {
            this.Tracks = new MediaTrack[source.Tracks.length];
            for (int i = 0; i < source.Tracks.length; i++) {
                this.Tracks[i] = new MediaTrack(source.Tracks[i]);
            }
        }
        if (source.Output != null) {
            this.Output = new ComposeMediaOutput(source.Output);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Canvas != null) {
            this.Canvas = new Canvas(source.Canvas);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tracks.", this.Tracks);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

