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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

