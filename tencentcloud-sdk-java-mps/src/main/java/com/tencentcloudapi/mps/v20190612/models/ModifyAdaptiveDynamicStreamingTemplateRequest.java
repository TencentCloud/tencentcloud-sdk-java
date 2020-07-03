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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAdaptiveDynamicStreamingTemplateRequest extends AbstractModel{

    /**
    * 转自适应码流模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * 转自适应码流输入流参数信息，最多输入10路流。
注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 转自适应码流模板唯一标识。 
     * @return Definition 转自适应码流模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转自适应码流模板唯一标识。
     * @param Definition 转自适应码流模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 模板名称，长度限制：64 个字符。 
     * @return Name 模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称，长度限制：64 个字符。
     * @param Name 模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li> 
     * @return Format 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
     * @param Format 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li> 
     * @return DisableHigherVideoBitrate 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     * @param DisableHigherVideoBitrate 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li> 
     * @return DisableHigherVideoResolution 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     * @param DisableHigherVideoResolution 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get 转自适应码流输入流参数信息，最多输入10路流。
注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。 
     * @return StreamInfos 转自适应码流输入流参数信息，最多输入10路流。
注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set 转自适应码流输入流参数信息，最多输入10路流。
注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。
     * @param StreamInfos 转自适应码流输入流参数信息，最多输入10路流。
注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

