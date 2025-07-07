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

public class SearchMediaRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 文件 ID 集合，匹配集合中的任意元素。
<li>数组长度限制：10。</li>
<li>单个 ID 长度限制：40个字符。</li>
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。
<li>单个文件名长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
    */
    @SerializedName("NamePrefixes")
    @Expose
    private String [] NamePrefixes;

    /**
    * 文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
    */
    @SerializedName("Descriptions")
    @Expose
    private String [] Descriptions;

    /**
    * 分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。
<li>数组长度限制：10。</li>
    */
    @SerializedName("ClassIds")
    @Expose
    private Long [] ClassIds;

    /**
    * 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：32个字符。</li>
<li>数组长度限制：16。</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 文件类型。匹配集合中的任意元素：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li>
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * 媒体文件来源集合，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
<li>数组长度限制：10。</li>
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * 推流直播码集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
    */
    @SerializedName("StreamIds")
    @Expose
    private String [] StreamIds;

    /**
    * 匹配创建时间在此时间段内的文件。
<li>包含所指定的头尾时间点。</li>
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * 匹配过期时间在此时间段内的文件，无法检索到已过期文件。
<li>包含所指定的头尾时间点。</li>
    */
    @SerializedName("ExpireTime")
    @Expose
    private TimeRange ExpireTime;

    /**
    * 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
<li>单个存储地区长度限制：20个字符。</li>
<li>数组长度限制：20。</li>
    */
    @SerializedName("StorageRegions")
    @Expose
    private String [] StorageRegions;

    /**
    * 存储类型数组。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
    */
    @SerializedName("StorageClasses")
    @Expose
    private String [] StorageClasses;

    /**
    * 媒体文件封装格式集合，匹配集合中任意元素。
<li>数组长度限制：10。</li>
    */
    @SerializedName("MediaTypes")
    @Expose
    private String [] MediaTypes;

    /**
    * 媒体文件状态，匹配集合中任意元素。
<li> Normal：正常；</li>
<li> SystemForbidden：平台封禁；</li>
<li> Forbidden：主动封禁。</li>
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 媒体文件审核结果，匹配集合中任意元素。
<li> pass：审核通过；</li>
<li> review：疑似违规，建议复审；</li>
<li> block：确认违规，建议封禁；</li>
<li> notModerated：未审核。</li>
    */
    @SerializedName("ReviewResults")
    @Expose
    private String [] ReviewResults;

    /**
    * TRTC 应用 ID 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
    */
    @SerializedName("TrtcSdkAppIds")
    @Expose
    private Long [] TrtcSdkAppIds;

    /**
    * TRTC 房间 ID 集合。匹配集合中的任意元素。
<li>单个房间 ID 长度限制：64个字符；</li>
<li>数组长度限制：10。</li>
    */
    @SerializedName("TrtcRoomIds")
    @Expose
    private String [] TrtcRoomIds;

    /**
    * 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li>
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * 排序方式。
<li>Sort.Field 可选 CreateTime 。</li>
<li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * （不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）
搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * （不推荐：应使用 SourceTypes 替代）
媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * （不推荐：应使用 StreamIds 替代）
推流直播码。
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * （不推荐：应使用 CreateTime 替代）
创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * （不推荐：应使用 CreateTime 替代）
创建时间的结束时间。
<li>小于结束时间。</li>
<li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 该字段已无效。
    */
    @SerializedName("Vids")
    @Expose
    private String [] Vids;

    /**
    * 该字段已无效。
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

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
     * Get 文件 ID 集合，匹配集合中的任意元素。
<li>数组长度限制：10。</li>
<li>单个 ID 长度限制：40个字符。</li> 
     * @return FileIds 文件 ID 集合，匹配集合中的任意元素。
<li>数组长度限制：10。</li>
<li>单个 ID 长度限制：40个字符。</li>
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 文件 ID 集合，匹配集合中的任意元素。
<li>数组长度限制：10。</li>
<li>单个 ID 长度限制：40个字符。</li>
     * @param FileIds 文件 ID 集合，匹配集合中的任意元素。
<li>数组长度限制：10。</li>
<li>单个 ID 长度限制：40个字符。</li>
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。
<li>单个文件名长度限制：100个字符。</li>
<li>数组长度限制：10。</li> 
     * @return Names 文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。
<li>单个文件名长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。
<li>单个文件名长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     * @param Names 文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。
<li>单个文件名长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：100个字符。</li>
<li>数组长度限制：10。</li> 
     * @return NamePrefixes 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     */
    public String [] getNamePrefixes() {
        return this.NamePrefixes;
    }

    /**
     * Set 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     * @param NamePrefixes 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     */
    public void setNamePrefixes(String [] NamePrefixes) {
        this.NamePrefixes = NamePrefixes;
    }

    /**
     * Get 文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li> 
     * @return Descriptions 文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     */
    public String [] getDescriptions() {
        return this.Descriptions;
    }

    /**
     * Set 文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     * @param Descriptions 文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     */
    public void setDescriptions(String [] Descriptions) {
        this.Descriptions = Descriptions;
    }

    /**
     * Get 分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。
<li>数组长度限制：10。</li> 
     * @return ClassIds 分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。
<li>数组长度限制：10。</li>
     */
    public Long [] getClassIds() {
        return this.ClassIds;
    }

    /**
     * Set 分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。
<li>数组长度限制：10。</li>
     * @param ClassIds 分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。
<li>数组长度限制：10。</li>
     */
    public void setClassIds(Long [] ClassIds) {
        this.ClassIds = ClassIds;
    }

    /**
     * Get 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：32个字符。</li>
<li>数组长度限制：16。</li> 
     * @return Tags 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：32个字符。</li>
<li>数组长度限制：16。</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：32个字符。</li>
<li>数组长度限制：16。</li>
     * @param Tags 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：32个字符。</li>
<li>数组长度限制：16。</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 文件类型。匹配集合中的任意元素：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li> 
     * @return Categories 文件类型。匹配集合中的任意元素：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li>
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set 文件类型。匹配集合中的任意元素：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li>
     * @param Categories 文件类型。匹配集合中的任意元素：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li>
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get 媒体文件来源集合，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
<li>数组长度限制：10。</li> 
     * @return SourceTypes 媒体文件来源集合，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
<li>数组长度限制：10。</li>
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set 媒体文件来源集合，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
<li>数组长度限制：10。</li>
     * @param SourceTypes 媒体文件来源集合，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
<li>数组长度限制：10。</li>
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get 推流直播码集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li> 
     * @return StreamIds 推流直播码集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     */
    public String [] getStreamIds() {
        return this.StreamIds;
    }

    /**
     * Set 推流直播码集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     * @param StreamIds 推流直播码集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     */
    public void setStreamIds(String [] StreamIds) {
        this.StreamIds = StreamIds;
    }

    /**
     * Get 匹配创建时间在此时间段内的文件。
<li>包含所指定的头尾时间点。</li> 
     * @return CreateTime 匹配创建时间在此时间段内的文件。
<li>包含所指定的头尾时间点。</li>
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 匹配创建时间在此时间段内的文件。
<li>包含所指定的头尾时间点。</li>
     * @param CreateTime 匹配创建时间在此时间段内的文件。
<li>包含所指定的头尾时间点。</li>
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 匹配过期时间在此时间段内的文件，无法检索到已过期文件。
<li>包含所指定的头尾时间点。</li> 
     * @return ExpireTime 匹配过期时间在此时间段内的文件，无法检索到已过期文件。
<li>包含所指定的头尾时间点。</li>
     */
    public TimeRange getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 匹配过期时间在此时间段内的文件，无法检索到已过期文件。
<li>包含所指定的头尾时间点。</li>
     * @param ExpireTime 匹配过期时间在此时间段内的文件，无法检索到已过期文件。
<li>包含所指定的头尾时间点。</li>
     */
    public void setExpireTime(TimeRange ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
<li>单个存储地区长度限制：20个字符。</li>
<li>数组长度限制：20。</li> 
     * @return StorageRegions 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
<li>单个存储地区长度限制：20个字符。</li>
<li>数组长度限制：20。</li>
     */
    public String [] getStorageRegions() {
        return this.StorageRegions;
    }

    /**
     * Set 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
<li>单个存储地区长度限制：20个字符。</li>
<li>数组长度限制：20。</li>
     * @param StorageRegions 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
<li>单个存储地区长度限制：20个字符。</li>
<li>数组长度限制：20。</li>
     */
    public void setStorageRegions(String [] StorageRegions) {
        this.StorageRegions = StorageRegions;
    }

    /**
     * Get 存储类型数组。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li> 
     * @return StorageClasses 存储类型数组。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
     */
    public String [] getStorageClasses() {
        return this.StorageClasses;
    }

    /**
     * Set 存储类型数组。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
     * @param StorageClasses 存储类型数组。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
     */
    public void setStorageClasses(String [] StorageClasses) {
        this.StorageClasses = StorageClasses;
    }

    /**
     * Get 媒体文件封装格式集合，匹配集合中任意元素。
<li>数组长度限制：10。</li> 
     * @return MediaTypes 媒体文件封装格式集合，匹配集合中任意元素。
<li>数组长度限制：10。</li>
     */
    public String [] getMediaTypes() {
        return this.MediaTypes;
    }

    /**
     * Set 媒体文件封装格式集合，匹配集合中任意元素。
<li>数组长度限制：10。</li>
     * @param MediaTypes 媒体文件封装格式集合，匹配集合中任意元素。
<li>数组长度限制：10。</li>
     */
    public void setMediaTypes(String [] MediaTypes) {
        this.MediaTypes = MediaTypes;
    }

    /**
     * Get 媒体文件状态，匹配集合中任意元素。
<li> Normal：正常；</li>
<li> SystemForbidden：平台封禁；</li>
<li> Forbidden：主动封禁。</li> 
     * @return Status 媒体文件状态，匹配集合中任意元素。
<li> Normal：正常；</li>
<li> SystemForbidden：平台封禁；</li>
<li> Forbidden：主动封禁。</li>
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 媒体文件状态，匹配集合中任意元素。
<li> Normal：正常；</li>
<li> SystemForbidden：平台封禁；</li>
<li> Forbidden：主动封禁。</li>
     * @param Status 媒体文件状态，匹配集合中任意元素。
<li> Normal：正常；</li>
<li> SystemForbidden：平台封禁；</li>
<li> Forbidden：主动封禁。</li>
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 媒体文件审核结果，匹配集合中任意元素。
<li> pass：审核通过；</li>
<li> review：疑似违规，建议复审；</li>
<li> block：确认违规，建议封禁；</li>
<li> notModerated：未审核。</li> 
     * @return ReviewResults 媒体文件审核结果，匹配集合中任意元素。
<li> pass：审核通过；</li>
<li> review：疑似违规，建议复审；</li>
<li> block：确认违规，建议封禁；</li>
<li> notModerated：未审核。</li>
     */
    public String [] getReviewResults() {
        return this.ReviewResults;
    }

    /**
     * Set 媒体文件审核结果，匹配集合中任意元素。
<li> pass：审核通过；</li>
<li> review：疑似违规，建议复审；</li>
<li> block：确认违规，建议封禁；</li>
<li> notModerated：未审核。</li>
     * @param ReviewResults 媒体文件审核结果，匹配集合中任意元素。
<li> pass：审核通过；</li>
<li> review：疑似违规，建议复审；</li>
<li> block：确认违规，建议封禁；</li>
<li> notModerated：未审核。</li>
     */
    public void setReviewResults(String [] ReviewResults) {
        this.ReviewResults = ReviewResults;
    }

    /**
     * Get TRTC 应用 ID 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li> 
     * @return TrtcSdkAppIds TRTC 应用 ID 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     */
    public Long [] getTrtcSdkAppIds() {
        return this.TrtcSdkAppIds;
    }

    /**
     * Set TRTC 应用 ID 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     * @param TrtcSdkAppIds TRTC 应用 ID 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     */
    public void setTrtcSdkAppIds(Long [] TrtcSdkAppIds) {
        this.TrtcSdkAppIds = TrtcSdkAppIds;
    }

    /**
     * Get TRTC 房间 ID 集合。匹配集合中的任意元素。
<li>单个房间 ID 长度限制：64个字符；</li>
<li>数组长度限制：10。</li> 
     * @return TrtcRoomIds TRTC 房间 ID 集合。匹配集合中的任意元素。
<li>单个房间 ID 长度限制：64个字符；</li>
<li>数组长度限制：10。</li>
     */
    public String [] getTrtcRoomIds() {
        return this.TrtcRoomIds;
    }

    /**
     * Set TRTC 房间 ID 集合。匹配集合中的任意元素。
<li>单个房间 ID 长度限制：64个字符；</li>
<li>数组长度限制：10。</li>
     * @param TrtcRoomIds TRTC 房间 ID 集合。匹配集合中的任意元素。
<li>单个房间 ID 长度限制：64个字符；</li>
<li>数组长度限制：10。</li>
     */
    public void setTrtcRoomIds(String [] TrtcRoomIds) {
        this.TrtcRoomIds = TrtcRoomIds;
    }

    /**
     * Get 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li> 
     * @return Filters 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li>
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li>
     * @param Filters 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li>
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式。
<li>Sort.Field 可选 CreateTime 。</li>
<li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li> 
     * @return Sort 排序方式。
<li>Sort.Field 可选 CreateTime 。</li>
<li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式。
<li>Sort.Field 可选 CreateTime 。</li>
<li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
     * @param Sort 排序方式。
<li>Sort.Field 可选 CreateTime 。</li>
<li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div> 
     * @return Offset <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     * @param Offset <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div> 
     * @return Limit <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     * @param Limit <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。
<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get （不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）
搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。 
     * @return Text （不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）
搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set （不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）
搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。
     * @param Text （不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）
搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get （不推荐：应使用 SourceTypes 替代）
媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。 
     * @return SourceType （不推荐：应使用 SourceTypes 替代）
媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set （不推荐：应使用 SourceTypes 替代）
媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
     * @param SourceType （不推荐：应使用 SourceTypes 替代）
媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get （不推荐：应使用 StreamIds 替代）
推流直播码。 
     * @return StreamId （不推荐：应使用 StreamIds 替代）
推流直播码。
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set （不推荐：应使用 StreamIds 替代）
推流直播码。
     * @param StreamId （不推荐：应使用 StreamIds 替代）
推流直播码。
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get （不推荐：应使用 CreateTime 替代）
创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li> 
     * @return StartTime （不推荐：应使用 CreateTime 替代）
创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set （不推荐：应使用 CreateTime 替代）
创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     * @param StartTime （不推荐：应使用 CreateTime 替代）
创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get （不推荐：应使用 CreateTime 替代）
创建时间的结束时间。
<li>小于结束时间。</li>
<li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li> 
     * @return EndTime （不推荐：应使用 CreateTime 替代）
创建时间的结束时间。
<li>小于结束时间。</li>
<li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set （不推荐：应使用 CreateTime 替代）
创建时间的结束时间。
<li>小于结束时间。</li>
<li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     * @param EndTime （不推荐：应使用 CreateTime 替代）
创建时间的结束时间。
<li>小于结束时间。</li>
<li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li>
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 该字段已无效。 
     * @return Vids 该字段已无效。
     */
    public String [] getVids() {
        return this.Vids;
    }

    /**
     * Set 该字段已无效。
     * @param Vids 该字段已无效。
     */
    public void setVids(String [] Vids) {
        this.Vids = Vids;
    }

    /**
     * Get 该字段已无效。 
     * @return Vid 该字段已无效。
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set 该字段已无效。
     * @param Vid 该字段已无效。
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    public SearchMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchMediaRequest(SearchMediaRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.NamePrefixes != null) {
            this.NamePrefixes = new String[source.NamePrefixes.length];
            for (int i = 0; i < source.NamePrefixes.length; i++) {
                this.NamePrefixes[i] = new String(source.NamePrefixes[i]);
            }
        }
        if (source.Descriptions != null) {
            this.Descriptions = new String[source.Descriptions.length];
            for (int i = 0; i < source.Descriptions.length; i++) {
                this.Descriptions[i] = new String(source.Descriptions[i]);
            }
        }
        if (source.ClassIds != null) {
            this.ClassIds = new Long[source.ClassIds.length];
            for (int i = 0; i < source.ClassIds.length; i++) {
                this.ClassIds[i] = new Long(source.ClassIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Categories != null) {
            this.Categories = new String[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new String(source.Categories[i]);
            }
        }
        if (source.SourceTypes != null) {
            this.SourceTypes = new String[source.SourceTypes.length];
            for (int i = 0; i < source.SourceTypes.length; i++) {
                this.SourceTypes[i] = new String(source.SourceTypes[i]);
            }
        }
        if (source.StreamIds != null) {
            this.StreamIds = new String[source.StreamIds.length];
            for (int i = 0; i < source.StreamIds.length; i++) {
                this.StreamIds[i] = new String(source.StreamIds[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new TimeRange(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new TimeRange(source.ExpireTime);
        }
        if (source.StorageRegions != null) {
            this.StorageRegions = new String[source.StorageRegions.length];
            for (int i = 0; i < source.StorageRegions.length; i++) {
                this.StorageRegions[i] = new String(source.StorageRegions[i]);
            }
        }
        if (source.StorageClasses != null) {
            this.StorageClasses = new String[source.StorageClasses.length];
            for (int i = 0; i < source.StorageClasses.length; i++) {
                this.StorageClasses[i] = new String(source.StorageClasses[i]);
            }
        }
        if (source.MediaTypes != null) {
            this.MediaTypes = new String[source.MediaTypes.length];
            for (int i = 0; i < source.MediaTypes.length; i++) {
                this.MediaTypes[i] = new String(source.MediaTypes[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.ReviewResults != null) {
            this.ReviewResults = new String[source.ReviewResults.length];
            for (int i = 0; i < source.ReviewResults.length; i++) {
                this.ReviewResults[i] = new String(source.ReviewResults[i]);
            }
        }
        if (source.TrtcSdkAppIds != null) {
            this.TrtcSdkAppIds = new Long[source.TrtcSdkAppIds.length];
            for (int i = 0; i < source.TrtcSdkAppIds.length; i++) {
                this.TrtcSdkAppIds[i] = new Long(source.TrtcSdkAppIds[i]);
            }
        }
        if (source.TrtcRoomIds != null) {
            this.TrtcRoomIds = new String[source.TrtcRoomIds.length];
            for (int i = 0; i < source.TrtcRoomIds.length; i++) {
                this.TrtcRoomIds[i] = new String(source.TrtcRoomIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Vids != null) {
            this.Vids = new String[source.Vids.length];
            for (int i = 0; i < source.Vids.length; i++) {
                this.Vids[i] = new String(source.Vids[i]);
            }
        }
        if (source.Vid != null) {
            this.Vid = new String(source.Vid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "NamePrefixes.", this.NamePrefixes);
        this.setParamArraySimple(map, prefix + "Descriptions.", this.Descriptions);
        this.setParamArraySimple(map, prefix + "ClassIds.", this.ClassIds);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Categories.", this.Categories);
        this.setParamArraySimple(map, prefix + "SourceTypes.", this.SourceTypes);
        this.setParamArraySimple(map, prefix + "StreamIds.", this.StreamIds);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamObj(map, prefix + "ExpireTime.", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "StorageRegions.", this.StorageRegions);
        this.setParamArraySimple(map, prefix + "StorageClasses.", this.StorageClasses);
        this.setParamArraySimple(map, prefix + "MediaTypes.", this.MediaTypes);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "ReviewResults.", this.ReviewResults);
        this.setParamArraySimple(map, prefix + "TrtcSdkAppIds.", this.TrtcSdkAppIds);
        this.setParamArraySimple(map, prefix + "TrtcRoomIds.", this.TrtcRoomIds);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Vids.", this.Vids);
        this.setParamSimple(map, prefix + "Vid", this.Vid);

    }
}

