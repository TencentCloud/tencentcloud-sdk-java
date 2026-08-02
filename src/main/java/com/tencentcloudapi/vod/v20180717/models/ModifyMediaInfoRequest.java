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

public class ModifyMediaInfoRequest extends AbstractModel {

    /**
    * <p>媒体文件唯一标识。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>媒体文件名称，最长 64 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>媒体文件描述，最长 128 个字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>媒体文件分类 ID。</p>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>媒体文件过期时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>视频封面图片文件（如 jpeg, png 等）进行 <a href="https://tools.ietf.org/html/rfc4648">Base64</a> 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。</p>
    */
    @SerializedName("CoverData")
    @Expose
    private String CoverData;

    /**
    * <p>新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p>
    */
    @SerializedName("AddKeyFrameDescs")
    @Expose
    private MediaKeyFrameDescItem [] AddKeyFrameDescs;

    /**
    * <p>要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p>
    */
    @SerializedName("DeleteKeyFrameDescs")
    @Expose
    private Float [] DeleteKeyFrameDescs;

    /**
    * <p>取值 1 表示清空视频打点信息，其他值无意义。<br>同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。</p>
    */
    @SerializedName("ClearKeyFrameDescs")
    @Expose
    private Long ClearKeyFrameDescs;

    /**
    * <p>新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 32 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p>
    */
    @SerializedName("AddTags")
    @Expose
    private String [] AddTags;

    /**
    * <p>要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p>
    */
    @SerializedName("DeleteTags")
    @Expose
    private String [] DeleteTags;

    /**
    * <p>取值 1 表示清空媒体文件所有标签，其他值无意义。<br>同一个请求里，ClearTags 与 AddTags 不能同时出现。</p>
    */
    @SerializedName("ClearTags")
    @Expose
    private Long ClearTags;

    /**
    * <p>新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p>
    */
    @SerializedName("AddSubtitles")
    @Expose
    private MediaSubtitleInput [] AddSubtitles;

    /**
    * <p>待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p>
    */
    @SerializedName("DeleteSubtitleIds")
    @Expose
    private String [] DeleteSubtitleIds;

    /**
    * <p>取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。<br>同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。</p>
    */
    @SerializedName("ClearSubtitles")
    @Expose
    private Long ClearSubtitles;

    /**
    * <p>待出库的知识库ID。</p>
    */
    @SerializedName("DeleteKnowledgeBases")
    @Expose
    private String [] DeleteKnowledgeBases;

    /**
    * <p>取值 1 表示从所有知识库中移除此媒体文件，其他值无意义。</p><p><br>同一个请求里，ClearKnowledgeBases 与 DeleteKnowledgeBases 不能同时出现。<p></p></p>
    */
    @SerializedName("ClearKnowledgeBases")
    @Expose
    private Long ClearKnowledgeBases;

    /**
     * Get <p>媒体文件唯一标识。</p> 
     * @return FileId <p>媒体文件唯一标识。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>媒体文件唯一标识。</p>
     * @param FileId <p>媒体文件唯一标识。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
     * Get <p>媒体文件名称，最长 64 个字符。</p> 
     * @return Name <p>媒体文件名称，最长 64 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>媒体文件名称，最长 64 个字符。</p>
     * @param Name <p>媒体文件名称，最长 64 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>媒体文件描述，最长 128 个字符。</p> 
     * @return Description <p>媒体文件描述，最长 128 个字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>媒体文件描述，最长 128 个字符。</p>
     * @param Description <p>媒体文件描述，最长 128 个字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>媒体文件分类 ID。</p> 
     * @return ClassId <p>媒体文件分类 ID。</p>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>媒体文件分类 ID。</p>
     * @param ClassId <p>媒体文件分类 ID。</p>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>媒体文件过期时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。</p> 
     * @return ExpireTime <p>媒体文件过期时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>媒体文件过期时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。</p>
     * @param ExpireTime <p>媒体文件过期时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>视频封面图片文件（如 jpeg, png 等）进行 <a href="https://tools.ietf.org/html/rfc4648">Base64</a> 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。</p> 
     * @return CoverData <p>视频封面图片文件（如 jpeg, png 等）进行 <a href="https://tools.ietf.org/html/rfc4648">Base64</a> 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。</p>
     */
    public String getCoverData() {
        return this.CoverData;
    }

    /**
     * Set <p>视频封面图片文件（如 jpeg, png 等）进行 <a href="https://tools.ietf.org/html/rfc4648">Base64</a> 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。</p>
     * @param CoverData <p>视频封面图片文件（如 jpeg, png 等）进行 <a href="https://tools.ietf.org/html/rfc4648">Base64</a> 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。</p>
     */
    public void setCoverData(String CoverData) {
        this.CoverData = CoverData;
    }

    /**
     * Get <p>新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p> 
     * @return AddKeyFrameDescs <p>新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p>
     */
    public MediaKeyFrameDescItem [] getAddKeyFrameDescs() {
        return this.AddKeyFrameDescs;
    }

    /**
     * Set <p>新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p>
     * @param AddKeyFrameDescs <p>新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p>
     */
    public void setAddKeyFrameDescs(MediaKeyFrameDescItem [] AddKeyFrameDescs) {
        this.AddKeyFrameDescs = AddKeyFrameDescs;
    }

    /**
     * Get <p>要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p> 
     * @return DeleteKeyFrameDescs <p>要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p>
     */
    public Float [] getDeleteKeyFrameDescs() {
        return this.DeleteKeyFrameDescs;
    }

    /**
     * Set <p>要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p>
     * @param DeleteKeyFrameDescs <p>要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。</p>
     */
    public void setDeleteKeyFrameDescs(Float [] DeleteKeyFrameDescs) {
        this.DeleteKeyFrameDescs = DeleteKeyFrameDescs;
    }

    /**
     * Get <p>取值 1 表示清空视频打点信息，其他值无意义。<br>同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。</p> 
     * @return ClearKeyFrameDescs <p>取值 1 表示清空视频打点信息，其他值无意义。<br>同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。</p>
     */
    public Long getClearKeyFrameDescs() {
        return this.ClearKeyFrameDescs;
    }

    /**
     * Set <p>取值 1 表示清空视频打点信息，其他值无意义。<br>同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。</p>
     * @param ClearKeyFrameDescs <p>取值 1 表示清空视频打点信息，其他值无意义。<br>同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。</p>
     */
    public void setClearKeyFrameDescs(Long ClearKeyFrameDescs) {
        this.ClearKeyFrameDescs = ClearKeyFrameDescs;
    }

    /**
     * Get <p>新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 32 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p> 
     * @return AddTags <p>新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 32 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p>
     */
    public String [] getAddTags() {
        return this.AddTags;
    }

    /**
     * Set <p>新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 32 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p>
     * @param AddTags <p>新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 32 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p>
     */
    public void setAddTags(String [] AddTags) {
        this.AddTags = AddTags;
    }

    /**
     * Get <p>要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p> 
     * @return DeleteTags <p>要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p>
     */
    public String [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set <p>要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p>
     * @param DeleteTags <p>要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。</p>
     */
    public void setDeleteTags(String [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    /**
     * Get <p>取值 1 表示清空媒体文件所有标签，其他值无意义。<br>同一个请求里，ClearTags 与 AddTags 不能同时出现。</p> 
     * @return ClearTags <p>取值 1 表示清空媒体文件所有标签，其他值无意义。<br>同一个请求里，ClearTags 与 AddTags 不能同时出现。</p>
     */
    public Long getClearTags() {
        return this.ClearTags;
    }

    /**
     * Set <p>取值 1 表示清空媒体文件所有标签，其他值无意义。<br>同一个请求里，ClearTags 与 AddTags 不能同时出现。</p>
     * @param ClearTags <p>取值 1 表示清空媒体文件所有标签，其他值无意义。<br>同一个请求里，ClearTags 与 AddTags 不能同时出现。</p>
     */
    public void setClearTags(Long ClearTags) {
        this.ClearTags = ClearTags;
    }

    /**
     * Get <p>新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p> 
     * @return AddSubtitles <p>新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p>
     */
    public MediaSubtitleInput [] getAddSubtitles() {
        return this.AddSubtitles;
    }

    /**
     * Set <p>新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p>
     * @param AddSubtitles <p>新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p>
     */
    public void setAddSubtitles(MediaSubtitleInput [] AddSubtitles) {
        this.AddSubtitles = AddSubtitles;
    }

    /**
     * Get <p>待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p> 
     * @return DeleteSubtitleIds <p>待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p>
     */
    public String [] getDeleteSubtitleIds() {
        return this.DeleteSubtitleIds;
    }

    /**
     * Set <p>待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p>
     * @param DeleteSubtitleIds <p>待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。</p>
     */
    public void setDeleteSubtitleIds(String [] DeleteSubtitleIds) {
        this.DeleteSubtitleIds = DeleteSubtitleIds;
    }

    /**
     * Get <p>取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。<br>同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。</p> 
     * @return ClearSubtitles <p>取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。<br>同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。</p>
     */
    public Long getClearSubtitles() {
        return this.ClearSubtitles;
    }

    /**
     * Set <p>取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。<br>同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。</p>
     * @param ClearSubtitles <p>取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。<br>同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。</p>
     */
    public void setClearSubtitles(Long ClearSubtitles) {
        this.ClearSubtitles = ClearSubtitles;
    }

    /**
     * Get <p>待出库的知识库ID。</p> 
     * @return DeleteKnowledgeBases <p>待出库的知识库ID。</p>
     */
    public String [] getDeleteKnowledgeBases() {
        return this.DeleteKnowledgeBases;
    }

    /**
     * Set <p>待出库的知识库ID。</p>
     * @param DeleteKnowledgeBases <p>待出库的知识库ID。</p>
     */
    public void setDeleteKnowledgeBases(String [] DeleteKnowledgeBases) {
        this.DeleteKnowledgeBases = DeleteKnowledgeBases;
    }

    /**
     * Get <p>取值 1 表示从所有知识库中移除此媒体文件，其他值无意义。</p><p><br>同一个请求里，ClearKnowledgeBases 与 DeleteKnowledgeBases 不能同时出现。<p></p></p> 
     * @return ClearKnowledgeBases <p>取值 1 表示从所有知识库中移除此媒体文件，其他值无意义。</p><p><br>同一个请求里，ClearKnowledgeBases 与 DeleteKnowledgeBases 不能同时出现。<p></p></p>
     */
    public Long getClearKnowledgeBases() {
        return this.ClearKnowledgeBases;
    }

    /**
     * Set <p>取值 1 表示从所有知识库中移除此媒体文件，其他值无意义。</p><p><br>同一个请求里，ClearKnowledgeBases 与 DeleteKnowledgeBases 不能同时出现。<p></p></p>
     * @param ClearKnowledgeBases <p>取值 1 表示从所有知识库中移除此媒体文件，其他值无意义。</p><p><br>同一个请求里，ClearKnowledgeBases 与 DeleteKnowledgeBases 不能同时出现。<p></p></p>
     */
    public void setClearKnowledgeBases(Long ClearKnowledgeBases) {
        this.ClearKnowledgeBases = ClearKnowledgeBases;
    }

    public ModifyMediaInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaInfoRequest(ModifyMediaInfoRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CoverData != null) {
            this.CoverData = new String(source.CoverData);
        }
        if (source.AddKeyFrameDescs != null) {
            this.AddKeyFrameDescs = new MediaKeyFrameDescItem[source.AddKeyFrameDescs.length];
            for (int i = 0; i < source.AddKeyFrameDescs.length; i++) {
                this.AddKeyFrameDescs[i] = new MediaKeyFrameDescItem(source.AddKeyFrameDescs[i]);
            }
        }
        if (source.DeleteKeyFrameDescs != null) {
            this.DeleteKeyFrameDescs = new Float[source.DeleteKeyFrameDescs.length];
            for (int i = 0; i < source.DeleteKeyFrameDescs.length; i++) {
                this.DeleteKeyFrameDescs[i] = new Float(source.DeleteKeyFrameDescs[i]);
            }
        }
        if (source.ClearKeyFrameDescs != null) {
            this.ClearKeyFrameDescs = new Long(source.ClearKeyFrameDescs);
        }
        if (source.AddTags != null) {
            this.AddTags = new String[source.AddTags.length];
            for (int i = 0; i < source.AddTags.length; i++) {
                this.AddTags[i] = new String(source.AddTags[i]);
            }
        }
        if (source.DeleteTags != null) {
            this.DeleteTags = new String[source.DeleteTags.length];
            for (int i = 0; i < source.DeleteTags.length; i++) {
                this.DeleteTags[i] = new String(source.DeleteTags[i]);
            }
        }
        if (source.ClearTags != null) {
            this.ClearTags = new Long(source.ClearTags);
        }
        if (source.AddSubtitles != null) {
            this.AddSubtitles = new MediaSubtitleInput[source.AddSubtitles.length];
            for (int i = 0; i < source.AddSubtitles.length; i++) {
                this.AddSubtitles[i] = new MediaSubtitleInput(source.AddSubtitles[i]);
            }
        }
        if (source.DeleteSubtitleIds != null) {
            this.DeleteSubtitleIds = new String[source.DeleteSubtitleIds.length];
            for (int i = 0; i < source.DeleteSubtitleIds.length; i++) {
                this.DeleteSubtitleIds[i] = new String(source.DeleteSubtitleIds[i]);
            }
        }
        if (source.ClearSubtitles != null) {
            this.ClearSubtitles = new Long(source.ClearSubtitles);
        }
        if (source.DeleteKnowledgeBases != null) {
            this.DeleteKnowledgeBases = new String[source.DeleteKnowledgeBases.length];
            for (int i = 0; i < source.DeleteKnowledgeBases.length; i++) {
                this.DeleteKnowledgeBases[i] = new String(source.DeleteKnowledgeBases[i]);
            }
        }
        if (source.ClearKnowledgeBases != null) {
            this.ClearKnowledgeBases = new Long(source.ClearKnowledgeBases);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CoverData", this.CoverData);
        this.setParamArrayObj(map, prefix + "AddKeyFrameDescs.", this.AddKeyFrameDescs);
        this.setParamArraySimple(map, prefix + "DeleteKeyFrameDescs.", this.DeleteKeyFrameDescs);
        this.setParamSimple(map, prefix + "ClearKeyFrameDescs", this.ClearKeyFrameDescs);
        this.setParamArraySimple(map, prefix + "AddTags.", this.AddTags);
        this.setParamArraySimple(map, prefix + "DeleteTags.", this.DeleteTags);
        this.setParamSimple(map, prefix + "ClearTags", this.ClearTags);
        this.setParamArrayObj(map, prefix + "AddSubtitles.", this.AddSubtitles);
        this.setParamArraySimple(map, prefix + "DeleteSubtitleIds.", this.DeleteSubtitleIds);
        this.setParamSimple(map, prefix + "ClearSubtitles", this.ClearSubtitles);
        this.setParamArraySimple(map, prefix + "DeleteKnowledgeBases.", this.DeleteKnowledgeBases);
        this.setParamSimple(map, prefix + "ClearKnowledgeBases", this.ClearKnowledgeBases);

    }
}

