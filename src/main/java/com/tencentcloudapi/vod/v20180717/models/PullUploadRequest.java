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
    * <p>要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。<br>支持的扩展名详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。请确保媒体 URL 可以访问。</p>
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * <p>媒体文件类型（扩展名），支持的类型详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。<br>如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。</p>
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>媒体名称。</p>
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。</p>
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * <p>媒体后续任务操作，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。</p>
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * <p>媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>指定上传园区，仅适用于对上传地域有特殊需求的用户：</p><li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li><li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * <p>分类ID，用于对媒体进行分类管理，可通过<a href="https://cloud.tencent.com/document/product/266/31772">创建分类</a>接口，创建分类，获得分类 ID。</p>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * <p>来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>保留字段，特殊用途时使用。</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。</p>
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * <p>媒体存储路径，以/开头。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以指定存储路径。</p>
    */
    @SerializedName("MediaStoragePath")
    @Expose
    private String MediaStoragePath;

    /**
     * Get <p>要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。<br>支持的扩展名详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。请确保媒体 URL 可以访问。</p> 
     * @return MediaUrl <p>要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。<br>支持的扩展名详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。请确保媒体 URL 可以访问。</p>
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set <p>要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。<br>支持的扩展名详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。请确保媒体 URL 可以访问。</p>
     * @param MediaUrl <p>要拉取的媒体 URL，暂不支持拉取 Dash 格式（可以支持 HLS）。<br>支持的扩展名详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。请确保媒体 URL 可以访问。</p>
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get <p>媒体文件类型（扩展名），支持的类型详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。<br>如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。</p> 
     * @return MediaType <p>媒体文件类型（扩展名），支持的类型详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。<br>如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。</p>
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set <p>媒体文件类型（扩展名），支持的类型详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。<br>如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。</p>
     * @param MediaType <p>媒体文件类型（扩展名），支持的类型详见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B">媒体类型</a>。<br>如果 MediaType 不填或取值为空字符串，将根据 MediaUrl 自动获取文件类型。</p>
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
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
     * Get <p>媒体名称。</p> 
     * @return MediaName <p>媒体名称。</p>
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>媒体名称。</p>
     * @param MediaName <p>媒体名称。</p>
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。</p> 
     * @return CoverUrl <p>要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。</p>
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set <p>要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。</p>
     * @param CoverUrl <p>要拉取的视频封面 URL。支持的文件格式：gif、jpeg（jpg）、png。</p>
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get <p>媒体后续任务操作，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。</p> 
     * @return Procedure <p>媒体后续任务操作，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。</p>
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set <p>媒体后续任务操作，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。</p>
     * @param Procedure <p>媒体后续任务操作，详见<a href="https://cloud.tencent.com/document/product/266/9759">上传指定任务流</a>。</p>
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get <p>媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p> 
     * @return ExpireTime <p>媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     * @param ExpireTime <p>媒体文件过期时间，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>指定上传园区，仅适用于对上传地域有特殊需求的用户：</p><li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li><li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li> 
     * @return StorageRegion <p>指定上传园区，仅适用于对上传地域有特殊需求的用户：</p><li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li><li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>指定上传园区，仅适用于对上传地域有特殊需求的用户：</p><li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li><li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li>
     * @param StorageRegion <p>指定上传园区，仅适用于对上传地域有特殊需求的用户：</p><li>不填默认上传至您的[默认地域](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)。</li><li>若指定上传园区，请先确认[上传存储设置](https://cloud.tencent.com/document/product/266/14059?from=11329#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4)已经开启相应的存储地域。</li>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get <p>分类ID，用于对媒体进行分类管理，可通过<a href="https://cloud.tencent.com/document/product/266/31772">创建分类</a>接口，创建分类，获得分类 ID。</p> 
     * @return ClassId <p>分类ID，用于对媒体进行分类管理，可通过<a href="https://cloud.tencent.com/document/product/266/31772">创建分类</a>接口，创建分类，获得分类 ID。</p>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>分类ID，用于对媒体进行分类管理，可通过<a href="https://cloud.tencent.com/document/product/266/31772">创建分类</a>接口，创建分类，获得分类 ID。</p>
     * @param ClassId <p>分类ID，用于对媒体进行分类管理，可通过<a href="https://cloud.tencent.com/document/product/266/31772">创建分类</a>接口，创建分类，获得分类 ID。</p>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
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

    /**
     * Get <p>来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，当指定 Procedure 任务后，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
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
     * Get <p>保留字段，特殊用途时使用。</p> 
     * @return ExtInfo <p>保留字段，特殊用途时使用。</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>保留字段，特殊用途时使用。</p>
     * @param ExtInfo <p>保留字段，特殊用途时使用。</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。</p> 
     * @return SourceContext <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。</p>
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。</p>
     * @param SourceContext <p>来源上下文，用于透传用户请求信息，<a href="/document/product/266/7830">上传完成回调</a> 将返回该字段值，最长 250 个字符。</p>
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get <p>媒体存储路径，以/开头。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以指定存储路径。</p> 
     * @return MediaStoragePath <p>媒体存储路径，以/开头。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以指定存储路径。</p>
     */
    public String getMediaStoragePath() {
        return this.MediaStoragePath;
    }

    /**
     * Set <p>媒体存储路径，以/开头。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以指定存储路径。</p>
     * @param MediaStoragePath <p>媒体存储路径，以/开头。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以指定存储路径。</p>
     */
    public void setMediaStoragePath(String MediaStoragePath) {
        this.MediaStoragePath = MediaStoragePath;
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
        if (source.MediaStoragePath != null) {
            this.MediaStoragePath = new String(source.MediaStoragePath);
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
        this.setParamSimple(map, prefix + "MediaStoragePath", this.MediaStoragePath);

    }
}

