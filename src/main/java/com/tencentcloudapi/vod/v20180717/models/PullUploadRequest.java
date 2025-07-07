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

public class PullUploadRequest extends AbstractModel {

    /**
    * 要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。
支持的扩展名详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。请确保媒体 URL 可以访问。
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * 媒体文件类型（扩展名），支持的类型详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。
如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 媒体名称。
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 媒体后续任务操作，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * 媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 指定上传园区，仅适用于对上传地域有特殊需求的用户：
<li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li>
<li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 分类ID，用于对媒体进行分类管理，可通过[创建分类](https://cloud.tencent.com/document/product/266/7812)接口，创建分类，获得分类 ID。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 保留字段，特殊用途时使用。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
     * Get 要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。
支持的扩展名详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。请确保媒体 URL 可以访问。 
     * @return MediaUrl 要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。
支持的扩展名详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。请确保媒体 URL 可以访问。
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set 要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。
支持的扩展名详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。请确保媒体 URL 可以访问。
     * @param MediaUrl 要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。
支持的扩展名详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。请确保媒体 URL 可以访问。
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get 媒体文件类型（扩展名），支持的类型详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。
如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。 
     * @return MediaType 媒体文件类型（扩展名），支持的类型详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。
如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set 媒体文件类型（扩展名），支持的类型详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。
如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。
     * @param MediaType 媒体文件类型（扩展名），支持的类型详见[媒体类型](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B)。
如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
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
     * Get 媒体名称。 
     * @return MediaName 媒体名称。
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 媒体名称。
     * @param MediaName 媒体名称。
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get 要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。 
     * @return CoverUrl 要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。
     * @param CoverUrl 要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 媒体后续任务操作，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。 
     * @return Procedure 媒体后续任务操作，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set 媒体后续任务操作，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。
     * @param Procedure 媒体后续任务操作，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get 媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return ExpireTime 媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param ExpireTime 媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 指定上传园区，仅适用于对上传地域有特殊需求的用户：
<li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li>
<li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li> 
     * @return StorageRegion 指定上传园区，仅适用于对上传地域有特殊需求的用户：
<li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li>
<li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 指定上传园区，仅适用于对上传地域有特殊需求的用户：
<li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li>
<li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li>
     * @param StorageRegion 指定上传园区，仅适用于对上传地域有特殊需求的用户：
<li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li>
<li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 分类ID，用于对媒体进行分类管理，可通过[创建分类](https://cloud.tencent.com/document/product/266/7812)接口，创建分类，获得分类 ID。 
     * @return ClassId 分类ID，用于对媒体进行分类管理，可通过[创建分类](https://cloud.tencent.com/document/product/266/7812)接口，创建分类，获得分类 ID。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 分类ID，用于对媒体进行分类管理，可通过[创建分类](https://cloud.tencent.com/document/product/266/7812)接口，创建分类，获得分类 ID。
     * @param ClassId 分类ID，用于对媒体进行分类管理，可通过[创建分类](https://cloud.tencent.com/document/product/266/7812)接口，创建分类，获得分类 ID。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
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
     * Get 来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。 
     * @return SessionContext 来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
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

    /**
     * Get 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。 
     * @return SourceContext 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。
     * @param SourceContext 来源上下文，用于透传用户请求信息，[上传完成回调](/document/product/266/7830) 将返回该字段值，最长 250 个字符。
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    public PullUploadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullUploadRequest(PullUploadRequest source) {
        if (source.MediaUrl != null) {
            this.MediaUrl = new String(source.MediaUrl);
        }
        if (source.MediaType != null) {
            this.MediaType = new String(source.MediaType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaUrl", this.MediaUrl);
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);

    }
}

