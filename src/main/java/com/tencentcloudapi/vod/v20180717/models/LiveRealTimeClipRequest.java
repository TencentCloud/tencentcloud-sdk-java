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

public class LiveRealTimeClipRequest extends AbstractModel {

    /**
    * <p>推流直播码。</p>
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * <p>流剪辑的开始时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>流剪辑的结束时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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
    * <p>是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。</p>
    */
    @SerializedName("MetaDataRequired")
    @Expose
    private Long MetaDataRequired;

    /**
    * <p>云点播中添加的用于时移播放的域名，必须在云直播已经<a href="https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">关联录制模板和开通时移服务</a>。<strong>如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。</strong></p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>剪辑的直播流信息：</p><li>默认剪辑直播原始流。</li><li>当StreamInfo中指定的Type为Transcoding，则剪辑TemplateId对应的直播转码流。</li>
    */
    @SerializedName("StreamInfo")
    @Expose
    private LiveRealTimeClipStreamInfo StreamInfo;

    /**
    * <p>系统保留字段，请勿填写。</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>推流直播码。</p> 
     * @return StreamId <p>推流直播码。</p>
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set <p>推流直播码。</p>
     * @param StreamId <p>推流直播码。</p>
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get <p>流剪辑的开始时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p> 
     * @return StartTime <p>流剪辑的开始时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>流剪辑的开始时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     * @param StartTime <p>流剪辑的开始时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>流剪辑的结束时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p> 
     * @return EndTime <p>流剪辑的结束时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>流剪辑的结束时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     * @param EndTime <p>流剪辑的结束时间，格式参照 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get <p>是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。</p> 
     * @return MetaDataRequired <p>是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。</p>
     */
    public Long getMetaDataRequired() {
        return this.MetaDataRequired;
    }

    /**
     * Set <p>是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。</p>
     * @param MetaDataRequired <p>是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。</p>
     */
    public void setMetaDataRequired(Long MetaDataRequired) {
        this.MetaDataRequired = MetaDataRequired;
    }

    /**
     * Get <p>云点播中添加的用于时移播放的域名，必须在云直播已经<a href="https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">关联录制模板和开通时移服务</a>。<strong>如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。</strong></p> 
     * @return Host <p>云点播中添加的用于时移播放的域名，必须在云直播已经<a href="https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">关联录制模板和开通时移服务</a>。<strong>如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。</strong></p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>云点播中添加的用于时移播放的域名，必须在云直播已经<a href="https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">关联录制模板和开通时移服务</a>。<strong>如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。</strong></p>
     * @param Host <p>云点播中添加的用于时移播放的域名，必须在云直播已经<a href="https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">关联录制模板和开通时移服务</a>。<strong>如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。</strong></p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>剪辑的直播流信息：</p><li>默认剪辑直播原始流。</li><li>当StreamInfo中指定的Type为Transcoding，则剪辑TemplateId对应的直播转码流。</li> 
     * @return StreamInfo <p>剪辑的直播流信息：</p><li>默认剪辑直播原始流。</li><li>当StreamInfo中指定的Type为Transcoding，则剪辑TemplateId对应的直播转码流。</li>
     */
    public LiveRealTimeClipStreamInfo getStreamInfo() {
        return this.StreamInfo;
    }

    /**
     * Set <p>剪辑的直播流信息：</p><li>默认剪辑直播原始流。</li><li>当StreamInfo中指定的Type为Transcoding，则剪辑TemplateId对应的直播转码流。</li>
     * @param StreamInfo <p>剪辑的直播流信息：</p><li>默认剪辑直播原始流。</li><li>当StreamInfo中指定的Type为Transcoding，则剪辑TemplateId对应的直播转码流。</li>
     */
    public void setStreamInfo(LiveRealTimeClipStreamInfo StreamInfo) {
        this.StreamInfo = StreamInfo;
    }

    /**
     * Get <p>系统保留字段，请勿填写。</p> 
     * @return ExtInfo <p>系统保留字段，请勿填写。</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>系统保留字段，请勿填写。</p>
     * @param ExtInfo <p>系统保留字段，请勿填写。</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public LiveRealTimeClipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRealTimeClipRequest(LiveRealTimeClipRequest source) {
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.MetaDataRequired != null) {
            this.MetaDataRequired = new Long(source.MetaDataRequired);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.StreamInfo != null) {
            this.StreamInfo = new LiveRealTimeClipStreamInfo(source.StreamInfo);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "IsPersistence", this.IsPersistence);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "MetaDataRequired", this.MetaDataRequired);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamObj(map, prefix + "StreamInfo.", this.StreamInfo);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

