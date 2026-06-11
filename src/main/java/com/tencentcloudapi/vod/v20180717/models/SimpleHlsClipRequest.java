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

public class SimpleHlsClipRequest extends AbstractModel {

    /**
    * <p>需要裁剪的腾讯云点播 HLS 视频 URL。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。</p>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。</p>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * <p>是否固化。0 不固化，1 固化。默认不固化。</p>
    */
    @SerializedName("IsPersistence")
    @Expose
    private Long IsPersistence;

    /**
    * <p>剪辑固化后的视频存储过期时间。格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>剪辑固化后的视频点播任务流处理，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。仅 IsPersistence 为 1 时有效。</p>
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/31772">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li>仅 IsPersistence 为 1 时有效。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。</p>
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * <p>会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，<a href="/document/product/266/9636">任务流状态变更回调</a> 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>该字段已废弃。</p>
    */
    @SerializedName("Precision")
    @Expose
    private String Precision;

    /**
    * <p>输出视频类型，取值有：<li>hls: 输出 hls 文件。</li>默认取值 hls。</p>
    */
    @SerializedName("OutputMediaType")
    @Expose
    private String OutputMediaType;

    /**
    * <p>保留字段，特殊用途时使用。 示例值：&quot;&quot;</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>需要裁剪的腾讯云点播 HLS 视频 URL。</p> 
     * @return Url <p>需要裁剪的腾讯云点播 HLS 视频 URL。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>需要裁剪的腾讯云点播 HLS 视频 URL。</p>
     * @param Url <p>需要裁剪的腾讯云点播 HLS 视频 URL。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

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
     * Get <p>裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。</p> 
     * @return StartTimeOffset <p>裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。</p>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。</p>
     * @param StartTimeOffset <p>裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。</p>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。</p> 
     * @return EndTimeOffset <p>裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。</p>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。</p>
     * @param EndTimeOffset <p>裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。</p>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get <p>是否固化。0 不固化，1 固化。默认不固化。</p> 
     * @return IsPersistence <p>是否固化。0 不固化，1 固化。默认不固化。</p>
     */
    public Long getIsPersistence() {
        return this.IsPersistence;
    }

    /**
     * Set <p>是否固化。0 不固化，1 固化。默认不固化。</p>
     * @param IsPersistence <p>是否固化。0 不固化，1 固化。默认不固化。</p>
     */
    public void setIsPersistence(Long IsPersistence) {
        this.IsPersistence = IsPersistence;
    }

    /**
     * Get <p>剪辑固化后的视频存储过期时间。格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。</p> 
     * @return ExpireTime <p>剪辑固化后的视频存储过期时间。格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>剪辑固化后的视频存储过期时间。格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。</p>
     * @param ExpireTime <p>剪辑固化后的视频存储过期时间。格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>剪辑固化后的视频点播任务流处理，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。仅 IsPersistence 为 1 时有效。</p> 
     * @return Procedure <p>剪辑固化后的视频点播任务流处理，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。仅 IsPersistence 为 1 时有效。</p>
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set <p>剪辑固化后的视频点播任务流处理，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。仅 IsPersistence 为 1 时有效。</p>
     * @param Procedure <p>剪辑固化后的视频点播任务流处理，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。仅 IsPersistence 为 1 时有效。</p>
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/31772">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li>仅 IsPersistence 为 1 时有效。 
     * @return ClassId <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/31772">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li>仅 IsPersistence 为 1 时有效。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/31772">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li>仅 IsPersistence 为 1 时有效。
     * @param ClassId <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/31772">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li>仅 IsPersistence 为 1 时有效。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。</p> 
     * @return SourceContext <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。</p>
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。</p>
     * @param SourceContext <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。</p>
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get <p>会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，<a href="/document/product/266/9636">任务流状态变更回调</a> 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。</p> 
     * @return SessionContext <p>会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，<a href="/document/product/266/9636">任务流状态变更回调</a> 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，<a href="/document/product/266/9636">任务流状态变更回调</a> 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。</p>
     * @param SessionContext <p>会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，<a href="/document/product/266/9636">任务流状态变更回调</a> 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>该字段已废弃。</p> 
     * @return Precision <p>该字段已废弃。</p>
     * @deprecated
     */
    @Deprecated
    public String getPrecision() {
        return this.Precision;
    }

    /**
     * Set <p>该字段已废弃。</p>
     * @param Precision <p>该字段已废弃。</p>
     * @deprecated
     */
    @Deprecated
    public void setPrecision(String Precision) {
        this.Precision = Precision;
    }

    /**
     * Get <p>输出视频类型，取值有：<li>hls: 输出 hls 文件。</li>默认取值 hls。</p> 
     * @return OutputMediaType <p>输出视频类型，取值有：<li>hls: 输出 hls 文件。</li>默认取值 hls。</p>
     */
    public String getOutputMediaType() {
        return this.OutputMediaType;
    }

    /**
     * Set <p>输出视频类型，取值有：<li>hls: 输出 hls 文件。</li>默认取值 hls。</p>
     * @param OutputMediaType <p>输出视频类型，取值有：<li>hls: 输出 hls 文件。</li>默认取值 hls。</p>
     */
    public void setOutputMediaType(String OutputMediaType) {
        this.OutputMediaType = OutputMediaType;
    }

    /**
     * Get <p>保留字段，特殊用途时使用。 示例值：&quot;&quot;</p> 
     * @return ExtInfo <p>保留字段，特殊用途时使用。 示例值：&quot;&quot;</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>保留字段，特殊用途时使用。 示例值：&quot;&quot;</p>
     * @param ExtInfo <p>保留字段，特殊用途时使用。 示例值：&quot;&quot;</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public SimpleHlsClipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleHlsClipRequest(SimpleHlsClipRequest source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.IsPersistence != null) {
            this.IsPersistence = new Long(source.IsPersistence);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.Precision != null) {
            this.Precision = new String(source.Precision);
        }
        if (source.OutputMediaType != null) {
            this.OutputMediaType = new String(source.OutputMediaType);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "IsPersistence", this.IsPersistence);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "OutputMediaType", this.OutputMediaType);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

