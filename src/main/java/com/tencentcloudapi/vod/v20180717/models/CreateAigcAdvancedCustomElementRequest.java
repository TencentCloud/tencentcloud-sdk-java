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

public class CreateAigcAdvancedCustomElementRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>主体名称，不能超过20个字符。</p>
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * <p>主体描述，不能超过100个字符。</p>
    */
    @SerializedName("ElementDescription")
    @Expose
    private String ElementDescription;

    /**
    * <p>主体参考方式。通过视频定制的主体和通过图片定制的主体的可用范围不同。</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体，此时将参考element_video_list定义主体外表。</li><li>image_refer： 多图主体，此时将参考element_image_list定义主体外表。</li></ul>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * <p>主体音色，可绑定音色库中已有音色。</p><ul><li>当前参数为空时，当前主体不绑定音色。</li><li>仅视频定制的主体支持绑定音色。</li></ul>
    */
    @SerializedName("ElementVoiceId")
    @Expose
    private String ElementVoiceId;

    /**
    * <p>主体参考视频，可通过视频设定主体及其细节。</p><ul><li>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</li><li>参考视频时当前参数必填，参考图片时当前参数无效</li><li>用key:value承载，如下：<br><pre><code>{  &quot;refer_videos&quot;:[    {      &quot;video_url&quot;:&quot;video_url_1&quot;    }  ]}</code></pre>● 视频格式仅支持MP4/MOV<br>● 仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频<br>● 至多仅支持上传1段视频，视频大小不超过200MB<br>● video_url参数值不得为空</li></ul>
    */
    @SerializedName("ElementVideoList")
    @Expose
    private String ElementVideoList;

    /**
    * <p>主体参考图，可通过多张图片设定主体及其细节。</p><ul><li>包括正面参考图和其他角度或特写参考图，其中：<ul><li>至少包括1张正面参考图，由frontal_image参数定义。</li><li>需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义。</li></ul></li><li>用key:value承载，如下：<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul>
    */
    @SerializedName("ElementImageList")
    @Expose
    private String ElementImageList;

    /**
    * <p>为主体配置标签，一个主体可以配置多个标签。</p><ul><li>用key:value承载，其中具体如下：</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p>
    */
    @SerializedName("TagList")
    @Expose
    private String TagList;

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
     * Get <p>主体名称，不能超过20个字符。</p> 
     * @return ElementName <p>主体名称，不能超过20个字符。</p>
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set <p>主体名称，不能超过20个字符。</p>
     * @param ElementName <p>主体名称，不能超过20个字符。</p>
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get <p>主体描述，不能超过100个字符。</p> 
     * @return ElementDescription <p>主体描述，不能超过100个字符。</p>
     */
    public String getElementDescription() {
        return this.ElementDescription;
    }

    /**
     * Set <p>主体描述，不能超过100个字符。</p>
     * @param ElementDescription <p>主体描述，不能超过100个字符。</p>
     */
    public void setElementDescription(String ElementDescription) {
        this.ElementDescription = ElementDescription;
    }

    /**
     * Get <p>主体参考方式。通过视频定制的主体和通过图片定制的主体的可用范围不同。</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体，此时将参考element_video_list定义主体外表。</li><li>image_refer： 多图主体，此时将参考element_image_list定义主体外表。</li></ul> 
     * @return ReferenceType <p>主体参考方式。通过视频定制的主体和通过图片定制的主体的可用范围不同。</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体，此时将参考element_video_list定义主体外表。</li><li>image_refer： 多图主体，此时将参考element_image_list定义主体外表。</li></ul>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>主体参考方式。通过视频定制的主体和通过图片定制的主体的可用范围不同。</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体，此时将参考element_video_list定义主体外表。</li><li>image_refer： 多图主体，此时将参考element_image_list定义主体外表。</li></ul>
     * @param ReferenceType <p>主体参考方式。通过视频定制的主体和通过图片定制的主体的可用范围不同。</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体，此时将参考element_video_list定义主体外表。</li><li>image_refer： 多图主体，此时将参考element_image_list定义主体外表。</li></ul>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>主体音色，可绑定音色库中已有音色。</p><ul><li>当前参数为空时，当前主体不绑定音色。</li><li>仅视频定制的主体支持绑定音色。</li></ul> 
     * @return ElementVoiceId <p>主体音色，可绑定音色库中已有音色。</p><ul><li>当前参数为空时，当前主体不绑定音色。</li><li>仅视频定制的主体支持绑定音色。</li></ul>
     */
    public String getElementVoiceId() {
        return this.ElementVoiceId;
    }

    /**
     * Set <p>主体音色，可绑定音色库中已有音色。</p><ul><li>当前参数为空时，当前主体不绑定音色。</li><li>仅视频定制的主体支持绑定音色。</li></ul>
     * @param ElementVoiceId <p>主体音色，可绑定音色库中已有音色。</p><ul><li>当前参数为空时，当前主体不绑定音色。</li><li>仅视频定制的主体支持绑定音色。</li></ul>
     */
    public void setElementVoiceId(String ElementVoiceId) {
        this.ElementVoiceId = ElementVoiceId;
    }

    /**
     * Get <p>主体参考视频，可通过视频设定主体及其细节。</p><ul><li>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</li><li>参考视频时当前参数必填，参考图片时当前参数无效</li><li>用key:value承载，如下：<br><pre><code>{  &quot;refer_videos&quot;:[    {      &quot;video_url&quot;:&quot;video_url_1&quot;    }  ]}</code></pre>● 视频格式仅支持MP4/MOV<br>● 仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频<br>● 至多仅支持上传1段视频，视频大小不超过200MB<br>● video_url参数值不得为空</li></ul> 
     * @return ElementVideoList <p>主体参考视频，可通过视频设定主体及其细节。</p><ul><li>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</li><li>参考视频时当前参数必填，参考图片时当前参数无效</li><li>用key:value承载，如下：<br><pre><code>{  &quot;refer_videos&quot;:[    {      &quot;video_url&quot;:&quot;video_url_1&quot;    }  ]}</code></pre>● 视频格式仅支持MP4/MOV<br>● 仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频<br>● 至多仅支持上传1段视频，视频大小不超过200MB<br>● video_url参数值不得为空</li></ul>
     */
    public String getElementVideoList() {
        return this.ElementVideoList;
    }

    /**
     * Set <p>主体参考视频，可通过视频设定主体及其细节。</p><ul><li>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</li><li>参考视频时当前参数必填，参考图片时当前参数无效</li><li>用key:value承载，如下：<br><pre><code>{  &quot;refer_videos&quot;:[    {      &quot;video_url&quot;:&quot;video_url_1&quot;    }  ]}</code></pre>● 视频格式仅支持MP4/MOV<br>● 仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频<br>● 至多仅支持上传1段视频，视频大小不超过200MB<br>● video_url参数值不得为空</li></ul>
     * @param ElementVideoList <p>主体参考视频，可通过视频设定主体及其细节。</p><ul><li>可上传有声视频，有声视频包含人声则触发音色定制（定制+入音色库+与主体绑定）</li><li>参考视频时当前参数必填，参考图片时当前参数无效</li><li>用key:value承载，如下：<br><pre><code>{  &quot;refer_videos&quot;:[    {      &quot;video_url&quot;:&quot;video_url_1&quot;    }  ]}</code></pre>● 视频格式仅支持MP4/MOV<br>● 仅支持时长介于3s～8s之间、宽高比例需为16:9或9:16的1080P视频<br>● 至多仅支持上传1段视频，视频大小不超过200MB<br>● video_url参数值不得为空</li></ul>
     */
    public void setElementVideoList(String ElementVideoList) {
        this.ElementVideoList = ElementVideoList;
    }

    /**
     * Get <p>主体参考图，可通过多张图片设定主体及其细节。</p><ul><li>包括正面参考图和其他角度或特写参考图，其中：<ul><li>至少包括1张正面参考图，由frontal_image参数定义。</li><li>需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义。</li></ul></li><li>用key:value承载，如下：<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul> 
     * @return ElementImageList <p>主体参考图，可通过多张图片设定主体及其细节。</p><ul><li>包括正面参考图和其他角度或特写参考图，其中：<ul><li>至少包括1张正面参考图，由frontal_image参数定义。</li><li>需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义。</li></ul></li><li>用key:value承载，如下：<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul>
     */
    public String getElementImageList() {
        return this.ElementImageList;
    }

    /**
     * Set <p>主体参考图，可通过多张图片设定主体及其细节。</p><ul><li>包括正面参考图和其他角度或特写参考图，其中：<ul><li>至少包括1张正面参考图，由frontal_image参数定义。</li><li>需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义。</li></ul></li><li>用key:value承载，如下：<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul>
     * @param ElementImageList <p>主体参考图，可通过多张图片设定主体及其细节。</p><ul><li>包括正面参考图和其他角度或特写参考图，其中：<ul><li>至少包括1张正面参考图，由frontal_image参数定义。</li><li>需包括1～3张其他参考图，需与正面参考图有差异，由image_url参数定义。</li></ul></li><li>用key:value承载，如下：<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul>
     */
    public void setElementImageList(String ElementImageList) {
        this.ElementImageList = ElementImageList;
    }

    /**
     * Get <p>为主体配置标签，一个主体可以配置多个标签。</p><ul><li>用key:value承载，其中具体如下：</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p> 
     * @return TagList <p>为主体配置标签，一个主体可以配置多个标签。</p><ul><li>用key:value承载，其中具体如下：</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p>
     */
    public String getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>为主体配置标签，一个主体可以配置多个标签。</p><ul><li>用key:value承载，其中具体如下：</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p>
     * @param TagList <p>为主体配置标签，一个主体可以配置多个标签。</p><ul><li>用key:value承载，其中具体如下：</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p>
     */
    public void setTagList(String TagList) {
        this.TagList = TagList;
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

    public CreateAigcAdvancedCustomElementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAdvancedCustomElementRequest(CreateAigcAdvancedCustomElementRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.ElementDescription != null) {
            this.ElementDescription = new String(source.ElementDescription);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ElementVoiceId != null) {
            this.ElementVoiceId = new String(source.ElementVoiceId);
        }
        if (source.ElementVideoList != null) {
            this.ElementVideoList = new String(source.ElementVideoList);
        }
        if (source.ElementImageList != null) {
            this.ElementImageList = new String(source.ElementImageList);
        }
        if (source.TagList != null) {
            this.TagList = new String(source.TagList);
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
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "ElementDescription", this.ElementDescription);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ElementVoiceId", this.ElementVoiceId);
        this.setParamSimple(map, prefix + "ElementVideoList", this.ElementVideoList);
        this.setParamSimple(map, prefix + "ElementImageList", this.ElementImageList);
        this.setParamSimple(map, prefix + "TagList", this.TagList);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

