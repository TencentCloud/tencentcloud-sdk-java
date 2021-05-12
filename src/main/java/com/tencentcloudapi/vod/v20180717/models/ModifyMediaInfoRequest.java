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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaInfoRequest extends AbstractModel{

    /**
    * 媒体文件唯一标识。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 媒体文件名称，最长 64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 媒体文件描述，最长 128 个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 媒体文件分类 ID。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 媒体文件过期时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 视频封面图片文件（如 jpeg, png 等）进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。
    */
    @SerializedName("CoverData")
    @Expose
    private String CoverData;

    /**
    * 新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。
    */
    @SerializedName("AddKeyFrameDescs")
    @Expose
    private MediaKeyFrameDescItem [] AddKeyFrameDescs;

    /**
    * 要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。
    */
    @SerializedName("DeleteKeyFrameDescs")
    @Expose
    private Float [] DeleteKeyFrameDescs;

    /**
    * 取值 1 表示清空视频打点信息，其他值无意义。
同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。
    */
    @SerializedName("ClearKeyFrameDescs")
    @Expose
    private Long ClearKeyFrameDescs;

    /**
    * 新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 16 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。
    */
    @SerializedName("AddTags")
    @Expose
    private String [] AddTags;

    /**
    * 要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。
    */
    @SerializedName("DeleteTags")
    @Expose
    private String [] DeleteTags;

    /**
    * 取值 1 表示清空媒体文件所有标签，其他值无意义。
同一个请求里，ClearTags 与 AddTags 不能同时出现。
    */
    @SerializedName("ClearTags")
    @Expose
    private Long ClearTags;

    /**
    * 新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。
    */
    @SerializedName("AddSubtitles")
    @Expose
    private MediaSubtitleInput [] AddSubtitles;

    /**
    * 待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。
    */
    @SerializedName("DeleteSubtitleIds")
    @Expose
    private String [] DeleteSubtitleIds;

    /**
    * 取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。
同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。
    */
    @SerializedName("ClearSubtitles")
    @Expose
    private Long ClearSubtitles;

    /**
    * 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 媒体文件唯一标识。 
     * @return FileId 媒体文件唯一标识。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件唯一标识。
     * @param FileId 媒体文件唯一标识。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 媒体文件名称，最长 64 个字符。 
     * @return Name 媒体文件名称，最长 64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体文件名称，最长 64 个字符。
     * @param Name 媒体文件名称，最长 64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 媒体文件描述，最长 128 个字符。 
     * @return Description 媒体文件描述，最长 128 个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 媒体文件描述，最长 128 个字符。
     * @param Description 媒体文件描述，最长 128 个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 媒体文件分类 ID。 
     * @return ClassId 媒体文件分类 ID。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 媒体文件分类 ID。
     * @param ClassId 媒体文件分类 ID。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 媒体文件过期时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。 
     * @return ExpireTime 媒体文件过期时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 媒体文件过期时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。
     * @param ExpireTime 媒体文件过期时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 视频封面图片文件（如 jpeg, png 等）进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。 
     * @return CoverData 视频封面图片文件（如 jpeg, png 等）进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。
     */
    public String getCoverData() {
        return this.CoverData;
    }

    /**
     * Set 视频封面图片文件（如 jpeg, png 等）进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。
     * @param CoverData 视频封面图片文件（如 jpeg, png 等）进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式。
     */
    public void setCoverData(String CoverData) {
        this.CoverData = CoverData;
    }

    /**
     * Get 新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。 
     * @return AddKeyFrameDescs 新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。
     */
    public MediaKeyFrameDescItem [] getAddKeyFrameDescs() {
        return this.AddKeyFrameDescs;
    }

    /**
     * Set 新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。
     * @param AddKeyFrameDescs 新增的一组视频打点信息，如果某个偏移时间已存在打点，则会进行覆盖操作，单个媒体文件最多 100 个打点信息。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。
     */
    public void setAddKeyFrameDescs(MediaKeyFrameDescItem [] AddKeyFrameDescs) {
        this.AddKeyFrameDescs = AddKeyFrameDescs;
    }

    /**
     * Get 要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。 
     * @return DeleteKeyFrameDescs 要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。
     */
    public Float [] getDeleteKeyFrameDescs() {
        return this.DeleteKeyFrameDescs;
    }

    /**
     * Set 要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。
     * @param DeleteKeyFrameDescs 要删除的一组视频打点信息的时间偏移，单位：秒。同一个请求里，AddKeyFrameDescs 的时间偏移参数必须与 DeleteKeyFrameDescs 都不同。
     */
    public void setDeleteKeyFrameDescs(Float [] DeleteKeyFrameDescs) {
        this.DeleteKeyFrameDescs = DeleteKeyFrameDescs;
    }

    /**
     * Get 取值 1 表示清空视频打点信息，其他值无意义。
同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。 
     * @return ClearKeyFrameDescs 取值 1 表示清空视频打点信息，其他值无意义。
同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。
     */
    public Long getClearKeyFrameDescs() {
        return this.ClearKeyFrameDescs;
    }

    /**
     * Set 取值 1 表示清空视频打点信息，其他值无意义。
同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。
     * @param ClearKeyFrameDescs 取值 1 表示清空视频打点信息，其他值无意义。
同一个请求里，ClearKeyFrameDescs 与 AddKeyFrameDescs 不能同时出现。
     */
    public void setClearKeyFrameDescs(Long ClearKeyFrameDescs) {
        this.ClearKeyFrameDescs = ClearKeyFrameDescs;
    }

    /**
     * Get 新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 16 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。 
     * @return AddTags 新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 16 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。
     */
    public String [] getAddTags() {
        return this.AddTags;
    }

    /**
     * Set 新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 16 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。
     * @param AddTags 新增的一组标签，单个媒体文件最多 16 个标签，单个标签最多 16 个字符。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。
     */
    public void setAddTags(String [] AddTags) {
        this.AddTags = AddTags;
    }

    /**
     * Get 要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。 
     * @return DeleteTags 要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。
     */
    public String [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set 要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。
     * @param DeleteTags 要删除的一组标签。同一个请求里，AddTags 参数必须与 DeleteTags 都不同。
     */
    public void setDeleteTags(String [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    /**
     * Get 取值 1 表示清空媒体文件所有标签，其他值无意义。
同一个请求里，ClearTags 与 AddTags 不能同时出现。 
     * @return ClearTags 取值 1 表示清空媒体文件所有标签，其他值无意义。
同一个请求里，ClearTags 与 AddTags 不能同时出现。
     */
    public Long getClearTags() {
        return this.ClearTags;
    }

    /**
     * Set 取值 1 表示清空媒体文件所有标签，其他值无意义。
同一个请求里，ClearTags 与 AddTags 不能同时出现。
     * @param ClearTags 取值 1 表示清空媒体文件所有标签，其他值无意义。
同一个请求里，ClearTags 与 AddTags 不能同时出现。
     */
    public void setClearTags(Long ClearTags) {
        this.ClearTags = ClearTags;
    }

    /**
     * Get 新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。 
     * @return AddSubtitles 新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。
     */
    public MediaSubtitleInput [] getAddSubtitles() {
        return this.AddSubtitles;
    }

    /**
     * Set 新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。
     * @param AddSubtitles 新增一组字幕。单个媒体文件最多 16 个字幕。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。
     */
    public void setAddSubtitles(MediaSubtitleInput [] AddSubtitles) {
        this.AddSubtitles = AddSubtitles;
    }

    /**
     * Get 待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。 
     * @return DeleteSubtitleIds 待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。
     */
    public String [] getDeleteSubtitleIds() {
        return this.DeleteSubtitleIds;
    }

    /**
     * Set 待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。
     * @param DeleteSubtitleIds 待删除字幕的唯一标识。同一个请求中，AddSubtitles 中指定的字幕 Id 必须与 DeleteSubtitleIds 都不相同。
     */
    public void setDeleteSubtitleIds(String [] DeleteSubtitleIds) {
        this.DeleteSubtitleIds = DeleteSubtitleIds;
    }

    /**
     * Get 取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。
同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。 
     * @return ClearSubtitles 取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。
同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。
     */
    public Long getClearSubtitles() {
        return this.ClearSubtitles;
    }

    /**
     * Set 取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。
同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。
     * @param ClearSubtitles 取值 1 表示清空媒体文件所有的字幕信息，其他值无意义。
同一个请求里，ClearSubtitles 与 AddSubtitles不能同时出现。
     */
    public void setClearSubtitles(Long ClearSubtitles) {
        this.ClearSubtitles = ClearSubtitles;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

