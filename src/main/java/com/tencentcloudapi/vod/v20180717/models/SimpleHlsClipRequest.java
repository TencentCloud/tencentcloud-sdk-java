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
    * 需要裁剪的腾讯云点播 HLS 视频 URL。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 是否固化。0 不固化，1 固化。默认不固化。
    */
    @SerializedName("IsPersistence")
    @Expose
    private Long IsPersistence;

    /**
    * 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 且 Precision 为 Rough 时有效。
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
仅 IsPersistence 为 1 时有效。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * 会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，[任务流状态变更回调](/document/product/266/9636) 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 裁剪精度，取值有：<li>Rough: 粗略裁剪，最小剪辑精度是单个 ts 分片；</li><li>Precise: 精确裁剪，做到按照剪辑时间点的毫秒级精确剪辑。</li> 默认取值 Rough。
    */
    @SerializedName("Precision")
    @Expose
    private String Precision;

    /**
    * 输出视频类型，取值有：<li>hls: 输出 hls 文件；</li><li>mp4：输出 mp4 文件，MP4 文件的大小不超过5G，时长小于2小时。仅当 Precision 选择 Precise 且 IsPersistence  选择0时有效，即只有非固化的精确剪辑时支持输出 MP4。</li>默认取值 hls。
    */
    @SerializedName("OutputMediaType")
    @Expose
    private String OutputMediaType;

    /**
    * 保留字段，特殊用途时使用。 示例值：""
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get 需要裁剪的腾讯云点播 HLS 视频 URL。 
     * @return Url 需要裁剪的腾讯云点播 HLS 视频 URL。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 需要裁剪的腾讯云点播 HLS 视频 URL。
     * @param Url 需要裁剪的腾讯云点播 HLS 视频 URL。
     */
    public void setUrl(String Url) {
        this.Url = Url;
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
     * Get 裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。 
     * @return StartTimeOffset 裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。
     * @param StartTimeOffset 裁剪的开始偏移时间，单位秒。默认 0，即从视频开头开始裁剪。负数表示距离视频结束多少秒开始裁剪。例如 -10 表示从倒数第 10 秒开始裁剪。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。 
     * @return EndTimeOffset 裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。
     * @param EndTimeOffset 裁剪的结束偏移时间，单位秒。默认 0，即裁剪到视频尾部。负数表示距离视频结束多少秒结束裁剪。例如 -10 表示到倒数第 10 秒结束裁剪。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 是否固化。0 不固化，1 固化。默认不固化。 
     * @return IsPersistence 是否固化。0 不固化，1 固化。默认不固化。
     */
    public Long getIsPersistence() {
        return this.IsPersistence;
    }

    /**
     * Set 是否固化。0 不固化，1 固化。默认不固化。
     * @param IsPersistence 是否固化。0 不固化，1 固化。默认不固化。
     */
    public void setIsPersistence(Long IsPersistence) {
        this.IsPersistence = IsPersistence;
    }

    /**
     * Get 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。 
     * @return ExpireTime 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。
     * @param ExpireTime 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 且 Precision 为 Rough 时有效。 
     * @return Procedure 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 且 Precision 为 Rough 时有效。
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 且 Precision 为 Rough 时有效。
     * @param Procedure 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 且 Precision 为 Rough 时有效。
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
仅 IsPersistence 为 1 时有效。 
     * @return ClassId 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
仅 IsPersistence 为 1 时有效。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
仅 IsPersistence 为 1 时有效。
     * @param ClassId 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
仅 IsPersistence 为 1 时有效。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。 
     * @return SourceContext 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。
     * @param SourceContext 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。仅 IsPersistence 为 1 时有效。
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get 会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，[任务流状态变更回调](/document/product/266/9636) 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。 
     * @return SessionContext 会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，[任务流状态变更回调](/document/product/266/9636) 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，[任务流状态变更回调](/document/product/266/9636) 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。
     * @param SessionContext 会话上下文，用于透传用户请求信息，当指定 Procedure 参数后，[任务流状态变更回调](/document/product/266/9636) 将返回该字段值，最长 1000 个字符。仅 IsPersistence 为 1 时有效。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 裁剪精度，取值有：<li>Rough: 粗略裁剪，最小剪辑精度是单个 ts 分片；</li><li>Precise: 精确裁剪，做到按照剪辑时间点的毫秒级精确剪辑。</li> 默认取值 Rough。 
     * @return Precision 裁剪精度，取值有：<li>Rough: 粗略裁剪，最小剪辑精度是单个 ts 分片；</li><li>Precise: 精确裁剪，做到按照剪辑时间点的毫秒级精确剪辑。</li> 默认取值 Rough。
     */
    public String getPrecision() {
        return this.Precision;
    }

    /**
     * Set 裁剪精度，取值有：<li>Rough: 粗略裁剪，最小剪辑精度是单个 ts 分片；</li><li>Precise: 精确裁剪，做到按照剪辑时间点的毫秒级精确剪辑。</li> 默认取值 Rough。
     * @param Precision 裁剪精度，取值有：<li>Rough: 粗略裁剪，最小剪辑精度是单个 ts 分片；</li><li>Precise: 精确裁剪，做到按照剪辑时间点的毫秒级精确剪辑。</li> 默认取值 Rough。
     */
    public void setPrecision(String Precision) {
        this.Precision = Precision;
    }

    /**
     * Get 输出视频类型，取值有：<li>hls: 输出 hls 文件；</li><li>mp4：输出 mp4 文件，MP4 文件的大小不超过5G，时长小于2小时。仅当 Precision 选择 Precise 且 IsPersistence  选择0时有效，即只有非固化的精确剪辑时支持输出 MP4。</li>默认取值 hls。 
     * @return OutputMediaType 输出视频类型，取值有：<li>hls: 输出 hls 文件；</li><li>mp4：输出 mp4 文件，MP4 文件的大小不超过5G，时长小于2小时。仅当 Precision 选择 Precise 且 IsPersistence  选择0时有效，即只有非固化的精确剪辑时支持输出 MP4。</li>默认取值 hls。
     */
    public String getOutputMediaType() {
        return this.OutputMediaType;
    }

    /**
     * Set 输出视频类型，取值有：<li>hls: 输出 hls 文件；</li><li>mp4：输出 mp4 文件，MP4 文件的大小不超过5G，时长小于2小时。仅当 Precision 选择 Precise 且 IsPersistence  选择0时有效，即只有非固化的精确剪辑时支持输出 MP4。</li>默认取值 hls。
     * @param OutputMediaType 输出视频类型，取值有：<li>hls: 输出 hls 文件；</li><li>mp4：输出 mp4 文件，MP4 文件的大小不超过5G，时长小于2小时。仅当 Precision 选择 Precise 且 IsPersistence  选择0时有效，即只有非固化的精确剪辑时支持输出 MP4。</li>默认取值 hls。
     */
    public void setOutputMediaType(String OutputMediaType) {
        this.OutputMediaType = OutputMediaType;
    }

    /**
     * Get 保留字段，特殊用途时使用。 示例值："" 
     * @return ExtInfo 保留字段，特殊用途时使用。 示例值：""
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 保留字段，特殊用途时使用。 示例值：""
     * @param ExtInfo 保留字段，特殊用途时使用。 示例值：""
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

