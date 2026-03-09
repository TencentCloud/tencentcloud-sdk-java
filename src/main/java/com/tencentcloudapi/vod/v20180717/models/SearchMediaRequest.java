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
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>文件 ID 集合，匹配集合中的任意元素。</p><li>数组长度限制：10。</li><li>单个 ID 长度限制：40个字符。</li>
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * <p>文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。</p><li>单个文件名长度限制：100个字符。</li><li>数组长度限制：10。</li>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * <p>文件名前缀，前缀匹配媒体文件的文件名。</p><li>单个文件名前缀长度限制：100个字符。</li><li>数组长度限制：10。</li>
    */
    @SerializedName("NamePrefixes")
    @Expose
    private String [] NamePrefixes;

    /**
    * <p>文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。</p><li>单个描述长度限制：100个字符。</li><li>数组长度限制：10。</li>
    */
    @SerializedName("Descriptions")
    @Expose
    private String [] Descriptions;

    /**
    * <p>分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。</p><li>数组长度限制：10。</li>
    */
    @SerializedName("ClassIds")
    @Expose
    private Long [] ClassIds;

    /**
    * <p>标签集合，匹配集合中任意元素。</p><li>单个标签长度限制：32个字符。</li><li>数组长度限制：16。</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>文件类型。匹配集合中的任意元素：</p><li>Video: 视频文件</li><li>Audio: 音频文件</li><li>Image: 图片文件</li>
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * <p>媒体文件来源集合，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p><li>数组长度限制：10。</li>
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * <p>推流直播码集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li>
    */
    @SerializedName("StreamIds")
    @Expose
    private String [] StreamIds;

    /**
    * <p>匹配创建时间在此时间段内的文件。</p><li>包含所指定的头尾时间点。</li>
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * <p>匹配过期时间在此时间段内的文件，无法检索到已过期文件。</p><li>包含所指定的头尾时间点。</li>
    */
    @SerializedName("ExpireTime")
    @Expose
    private TimeRange ExpireTime;

    /**
    * <p>媒体文件存储地区，如 ap-chongqing，参见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a>。</p><li>单个存储地区长度限制：20个字符。</li><li>数组长度限制：20。</li>
    */
    @SerializedName("StorageRegions")
    @Expose
    private String [] StorageRegions;

    /**
    * <p>存储类型数组。可选值有：</p><li> STANDARD：标准存储。</li><li> STANDARD_IA：低频存储。</li><li> ARCHIVE：归档存储。</li><li> DEEP_ARCHIVE：深度归档存储。</li>
    */
    @SerializedName("StorageClasses")
    @Expose
    private String [] StorageClasses;

    /**
    * <p>媒体文件封装格式集合，匹配集合中任意元素。</p><li>数组长度限制：10。</li>
    */
    @SerializedName("MediaTypes")
    @Expose
    private String [] MediaTypes;

    /**
    * <p>媒体文件状态，匹配集合中任意元素。</p><li> Normal：正常；</li><li> SystemForbidden：平台封禁；</li><li> Forbidden：主动封禁。</li>
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * <p>媒体文件审核结果，匹配集合中任意元素。</p><li> pass：审核通过；</li><li> review：疑似违规，建议复审；</li><li> block：确认违规，建议封禁；</li><li> notModerated：未审核。</li>
    */
    @SerializedName("ReviewResults")
    @Expose
    private String [] ReviewResults;

    /**
    * <p>TRTC 应用 ID 集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li>
    */
    @SerializedName("TrtcSdkAppIds")
    @Expose
    private Long [] TrtcSdkAppIds;

    /**
    * <p>TRTC 房间 ID 集合。匹配集合中的任意元素。</p><li>单个房间 ID 长度限制：64个字符；</li><li>数组长度限制：10。</li>
    */
    @SerializedName("TrtcRoomIds")
    @Expose
    private String [] TrtcRoomIds;

    /**
    * <p>指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：</p><li>basicInfo（视频基础信息）。</li><li>metaData（视频元信息）。</li><li>transcodeInfo（视频转码结果信息）。</li><li>animatedGraphicsInfo（视频转动图结果信息）。</li><li>imageSpriteInfo（视频雪碧图信息）。</li><li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li><li>sampleSnapshotInfo（采样截图信息）。</li><li>keyFrameDescInfo（打点信息）。</li><li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li><li>miniProgramReviewInfo（小程序审核信息）。</li>
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * <p>排序方式。</p><li>Sort.Field 可选 CreateTime 。</li><li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>（不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）<br>搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>（不推荐：应使用 SourceTypes 替代）<br>媒体文件来源，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>（不推荐：应使用 StreamIds 替代）<br>推流直播码。</p>
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的开始时间。</p><li>大于等于开始时间。</li><li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的结束时间。</p><li>小于结束时间。</li><li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>该字段已无效。</p>
    */
    @SerializedName("Vids")
    @Expose
    private String [] Vids;

    /**
    * <p>该字段已无效。</p>
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * <p>直播推流Domain，当媒资来源是直播录制时有效。</p>
    */
    @SerializedName("StreamDomains")
    @Expose
    private String [] StreamDomains;

    /**
    * <p>直播推流Path，当媒资来源是直播录制时有效。</p>
    */
    @SerializedName("StreamPaths")
    @Expose
    private String [] StreamPaths;

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
     * Get <p>文件 ID 集合，匹配集合中的任意元素。</p><li>数组长度限制：10。</li><li>单个 ID 长度限制：40个字符。</li> 
     * @return FileIds <p>文件 ID 集合，匹配集合中的任意元素。</p><li>数组长度限制：10。</li><li>单个 ID 长度限制：40个字符。</li>
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set <p>文件 ID 集合，匹配集合中的任意元素。</p><li>数组长度限制：10。</li><li>单个 ID 长度限制：40个字符。</li>
     * @param FileIds <p>文件 ID 集合，匹配集合中的任意元素。</p><li>数组长度限制：10。</li><li>单个 ID 长度限制：40个字符。</li>
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get <p>文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。</p><li>单个文件名长度限制：100个字符。</li><li>数组长度限制：10。</li> 
     * @return Names <p>文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。</p><li>单个文件名长度限制：100个字符。</li><li>数组长度限制：10。</li>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set <p>文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。</p><li>单个文件名长度限制：100个字符。</li><li>数组长度限制：10。</li>
     * @param Names <p>文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。</p><li>单个文件名长度限制：100个字符。</li><li>数组长度限制：10。</li>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get <p>文件名前缀，前缀匹配媒体文件的文件名。</p><li>单个文件名前缀长度限制：100个字符。</li><li>数组长度限制：10。</li> 
     * @return NamePrefixes <p>文件名前缀，前缀匹配媒体文件的文件名。</p><li>单个文件名前缀长度限制：100个字符。</li><li>数组长度限制：10。</li>
     */
    public String [] getNamePrefixes() {
        return this.NamePrefixes;
    }

    /**
     * Set <p>文件名前缀，前缀匹配媒体文件的文件名。</p><li>单个文件名前缀长度限制：100个字符。</li><li>数组长度限制：10。</li>
     * @param NamePrefixes <p>文件名前缀，前缀匹配媒体文件的文件名。</p><li>单个文件名前缀长度限制：100个字符。</li><li>数组长度限制：10。</li>
     */
    public void setNamePrefixes(String [] NamePrefixes) {
        this.NamePrefixes = NamePrefixes;
    }

    /**
     * Get <p>文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。</p><li>单个描述长度限制：100个字符。</li><li>数组长度限制：10。</li> 
     * @return Descriptions <p>文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。</p><li>单个描述长度限制：100个字符。</li><li>数组长度限制：10。</li>
     */
    public String [] getDescriptions() {
        return this.Descriptions;
    }

    /**
     * Set <p>文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。</p><li>单个描述长度限制：100个字符。</li><li>数组长度限制：10。</li>
     * @param Descriptions <p>文件描述集合，模糊匹配媒体文件的描述，匹配度越高，排序越优先。</p><li>单个描述长度限制：100个字符。</li><li>数组长度限制：10。</li>
     */
    public void setDescriptions(String [] Descriptions) {
        this.Descriptions = Descriptions;
    }

    /**
     * Get <p>分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。</p><li>数组长度限制：10。</li> 
     * @return ClassIds <p>分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。</p><li>数组长度限制：10。</li>
     */
    public Long [] getClassIds() {
        return this.ClassIds;
    }

    /**
     * Set <p>分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。</p><li>数组长度限制：10。</li>
     * @param ClassIds <p>分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。</p><li>数组长度限制：10。</li>
     */
    public void setClassIds(Long [] ClassIds) {
        this.ClassIds = ClassIds;
    }

    /**
     * Get <p>标签集合，匹配集合中任意元素。</p><li>单个标签长度限制：32个字符。</li><li>数组长度限制：16。</li> 
     * @return Tags <p>标签集合，匹配集合中任意元素。</p><li>单个标签长度限制：32个字符。</li><li>数组长度限制：16。</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签集合，匹配集合中任意元素。</p><li>单个标签长度限制：32个字符。</li><li>数组长度限制：16。</li>
     * @param Tags <p>标签集合，匹配集合中任意元素。</p><li>单个标签长度限制：32个字符。</li><li>数组长度限制：16。</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>文件类型。匹配集合中的任意元素：</p><li>Video: 视频文件</li><li>Audio: 音频文件</li><li>Image: 图片文件</li> 
     * @return Categories <p>文件类型。匹配集合中的任意元素：</p><li>Video: 视频文件</li><li>Audio: 音频文件</li><li>Image: 图片文件</li>
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set <p>文件类型。匹配集合中的任意元素：</p><li>Video: 视频文件</li><li>Audio: 音频文件</li><li>Image: 图片文件</li>
     * @param Categories <p>文件类型。匹配集合中的任意元素：</p><li>Video: 视频文件</li><li>Audio: 音频文件</li><li>Image: 图片文件</li>
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get <p>媒体文件来源集合，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p><li>数组长度限制：10。</li> 
     * @return SourceTypes <p>媒体文件来源集合，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p><li>数组长度限制：10。</li>
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set <p>媒体文件来源集合，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p><li>数组长度限制：10。</li>
     * @param SourceTypes <p>媒体文件来源集合，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p><li>数组长度限制：10。</li>
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get <p>推流直播码集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li> 
     * @return StreamIds <p>推流直播码集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li>
     */
    public String [] getStreamIds() {
        return this.StreamIds;
    }

    /**
     * Set <p>推流直播码集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li>
     * @param StreamIds <p>推流直播码集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li>
     */
    public void setStreamIds(String [] StreamIds) {
        this.StreamIds = StreamIds;
    }

    /**
     * Get <p>匹配创建时间在此时间段内的文件。</p><li>包含所指定的头尾时间点。</li> 
     * @return CreateTime <p>匹配创建时间在此时间段内的文件。</p><li>包含所指定的头尾时间点。</li>
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>匹配创建时间在此时间段内的文件。</p><li>包含所指定的头尾时间点。</li>
     * @param CreateTime <p>匹配创建时间在此时间段内的文件。</p><li>包含所指定的头尾时间点。</li>
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>匹配过期时间在此时间段内的文件，无法检索到已过期文件。</p><li>包含所指定的头尾时间点。</li> 
     * @return ExpireTime <p>匹配过期时间在此时间段内的文件，无法检索到已过期文件。</p><li>包含所指定的头尾时间点。</li>
     */
    public TimeRange getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>匹配过期时间在此时间段内的文件，无法检索到已过期文件。</p><li>包含所指定的头尾时间点。</li>
     * @param ExpireTime <p>匹配过期时间在此时间段内的文件，无法检索到已过期文件。</p><li>包含所指定的头尾时间点。</li>
     */
    public void setExpireTime(TimeRange ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>媒体文件存储地区，如 ap-chongqing，参见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a>。</p><li>单个存储地区长度限制：20个字符。</li><li>数组长度限制：20。</li> 
     * @return StorageRegions <p>媒体文件存储地区，如 ap-chongqing，参见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a>。</p><li>单个存储地区长度限制：20个字符。</li><li>数组长度限制：20。</li>
     */
    public String [] getStorageRegions() {
        return this.StorageRegions;
    }

    /**
     * Set <p>媒体文件存储地区，如 ap-chongqing，参见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a>。</p><li>单个存储地区长度限制：20个字符。</li><li>数组长度限制：20。</li>
     * @param StorageRegions <p>媒体文件存储地区，如 ap-chongqing，参见<a href="https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a>。</p><li>单个存储地区长度限制：20个字符。</li><li>数组长度限制：20。</li>
     */
    public void setStorageRegions(String [] StorageRegions) {
        this.StorageRegions = StorageRegions;
    }

    /**
     * Get <p>存储类型数组。可选值有：</p><li> STANDARD：标准存储。</li><li> STANDARD_IA：低频存储。</li><li> ARCHIVE：归档存储。</li><li> DEEP_ARCHIVE：深度归档存储。</li> 
     * @return StorageClasses <p>存储类型数组。可选值有：</p><li> STANDARD：标准存储。</li><li> STANDARD_IA：低频存储。</li><li> ARCHIVE：归档存储。</li><li> DEEP_ARCHIVE：深度归档存储。</li>
     */
    public String [] getStorageClasses() {
        return this.StorageClasses;
    }

    /**
     * Set <p>存储类型数组。可选值有：</p><li> STANDARD：标准存储。</li><li> STANDARD_IA：低频存储。</li><li> ARCHIVE：归档存储。</li><li> DEEP_ARCHIVE：深度归档存储。</li>
     * @param StorageClasses <p>存储类型数组。可选值有：</p><li> STANDARD：标准存储。</li><li> STANDARD_IA：低频存储。</li><li> ARCHIVE：归档存储。</li><li> DEEP_ARCHIVE：深度归档存储。</li>
     */
    public void setStorageClasses(String [] StorageClasses) {
        this.StorageClasses = StorageClasses;
    }

    /**
     * Get <p>媒体文件封装格式集合，匹配集合中任意元素。</p><li>数组长度限制：10。</li> 
     * @return MediaTypes <p>媒体文件封装格式集合，匹配集合中任意元素。</p><li>数组长度限制：10。</li>
     */
    public String [] getMediaTypes() {
        return this.MediaTypes;
    }

    /**
     * Set <p>媒体文件封装格式集合，匹配集合中任意元素。</p><li>数组长度限制：10。</li>
     * @param MediaTypes <p>媒体文件封装格式集合，匹配集合中任意元素。</p><li>数组长度限制：10。</li>
     */
    public void setMediaTypes(String [] MediaTypes) {
        this.MediaTypes = MediaTypes;
    }

    /**
     * Get <p>媒体文件状态，匹配集合中任意元素。</p><li> Normal：正常；</li><li> SystemForbidden：平台封禁；</li><li> Forbidden：主动封禁。</li> 
     * @return Status <p>媒体文件状态，匹配集合中任意元素。</p><li> Normal：正常；</li><li> SystemForbidden：平台封禁；</li><li> Forbidden：主动封禁。</li>
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>媒体文件状态，匹配集合中任意元素。</p><li> Normal：正常；</li><li> SystemForbidden：平台封禁；</li><li> Forbidden：主动封禁。</li>
     * @param Status <p>媒体文件状态，匹配集合中任意元素。</p><li> Normal：正常；</li><li> SystemForbidden：平台封禁；</li><li> Forbidden：主动封禁。</li>
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>媒体文件审核结果，匹配集合中任意元素。</p><li> pass：审核通过；</li><li> review：疑似违规，建议复审；</li><li> block：确认违规，建议封禁；</li><li> notModerated：未审核。</li> 
     * @return ReviewResults <p>媒体文件审核结果，匹配集合中任意元素。</p><li> pass：审核通过；</li><li> review：疑似违规，建议复审；</li><li> block：确认违规，建议封禁；</li><li> notModerated：未审核。</li>
     */
    public String [] getReviewResults() {
        return this.ReviewResults;
    }

    /**
     * Set <p>媒体文件审核结果，匹配集合中任意元素。</p><li> pass：审核通过；</li><li> review：疑似违规，建议复审；</li><li> block：确认违规，建议封禁；</li><li> notModerated：未审核。</li>
     * @param ReviewResults <p>媒体文件审核结果，匹配集合中任意元素。</p><li> pass：审核通过；</li><li> review：疑似违规，建议复审；</li><li> block：确认违规，建议封禁；</li><li> notModerated：未审核。</li>
     */
    public void setReviewResults(String [] ReviewResults) {
        this.ReviewResults = ReviewResults;
    }

    /**
     * Get <p>TRTC 应用 ID 集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li> 
     * @return TrtcSdkAppIds <p>TRTC 应用 ID 集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li>
     */
    public Long [] getTrtcSdkAppIds() {
        return this.TrtcSdkAppIds;
    }

    /**
     * Set <p>TRTC 应用 ID 集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li>
     * @param TrtcSdkAppIds <p>TRTC 应用 ID 集合。匹配集合中的任意元素。</p><li>数组长度限制：10。</li>
     */
    public void setTrtcSdkAppIds(Long [] TrtcSdkAppIds) {
        this.TrtcSdkAppIds = TrtcSdkAppIds;
    }

    /**
     * Get <p>TRTC 房间 ID 集合。匹配集合中的任意元素。</p><li>单个房间 ID 长度限制：64个字符；</li><li>数组长度限制：10。</li> 
     * @return TrtcRoomIds <p>TRTC 房间 ID 集合。匹配集合中的任意元素。</p><li>单个房间 ID 长度限制：64个字符；</li><li>数组长度限制：10。</li>
     */
    public String [] getTrtcRoomIds() {
        return this.TrtcRoomIds;
    }

    /**
     * Set <p>TRTC 房间 ID 集合。匹配集合中的任意元素。</p><li>单个房间 ID 长度限制：64个字符；</li><li>数组长度限制：10。</li>
     * @param TrtcRoomIds <p>TRTC 房间 ID 集合。匹配集合中的任意元素。</p><li>单个房间 ID 长度限制：64个字符；</li><li>数组长度限制：10。</li>
     */
    public void setTrtcRoomIds(String [] TrtcRoomIds) {
        this.TrtcRoomIds = TrtcRoomIds;
    }

    /**
     * Get <p>指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：</p><li>basicInfo（视频基础信息）。</li><li>metaData（视频元信息）。</li><li>transcodeInfo（视频转码结果信息）。</li><li>animatedGraphicsInfo（视频转动图结果信息）。</li><li>imageSpriteInfo（视频雪碧图信息）。</li><li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li><li>sampleSnapshotInfo（采样截图信息）。</li><li>keyFrameDescInfo（打点信息）。</li><li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li><li>miniProgramReviewInfo（小程序审核信息）。</li> 
     * @return Filters <p>指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：</p><li>basicInfo（视频基础信息）。</li><li>metaData（视频元信息）。</li><li>transcodeInfo（视频转码结果信息）。</li><li>animatedGraphicsInfo（视频转动图结果信息）。</li><li>imageSpriteInfo（视频雪碧图信息）。</li><li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li><li>sampleSnapshotInfo（采样截图信息）。</li><li>keyFrameDescInfo（打点信息）。</li><li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li><li>miniProgramReviewInfo（小程序审核信息）。</li>
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：</p><li>basicInfo（视频基础信息）。</li><li>metaData（视频元信息）。</li><li>transcodeInfo（视频转码结果信息）。</li><li>animatedGraphicsInfo（视频转动图结果信息）。</li><li>imageSpriteInfo（视频雪碧图信息）。</li><li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li><li>sampleSnapshotInfo（采样截图信息）。</li><li>keyFrameDescInfo（打点信息）。</li><li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li><li>miniProgramReviewInfo（小程序审核信息）。</li>
     * @param Filters <p>指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：</p><li>basicInfo（视频基础信息）。</li><li>metaData（视频元信息）。</li><li>transcodeInfo（视频转码结果信息）。</li><li>animatedGraphicsInfo（视频转动图结果信息）。</li><li>imageSpriteInfo（视频雪碧图信息）。</li><li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li><li>sampleSnapshotInfo（采样截图信息）。</li><li>keyFrameDescInfo（打点信息）。</li><li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li><li>miniProgramReviewInfo（小程序审核信息）。</li>
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序方式。</p><li>Sort.Field 可选 CreateTime 。</li><li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li> 
     * @return Sort <p>排序方式。</p><li>Sort.Field 可选 CreateTime 。</li><li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序方式。</p><li>Sort.Field 可选 CreateTime 。</li><li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
     * @param Sort <p>排序方式。</p><li>Sort.Field 可选 CreateTime 。</li><li>当 Text、 Names 或 Descriptions 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div> 
     * @return Offset <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     * @param Offset <div id="p_offset">分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div> 
     * @return Limit <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     * @param Limit <div id="p_limit">分页返回的记录条数，默认值：10。将返回第 Offset 到第 Offset+Limit-1 条。<li>取值范围：Offset + Limit 不超过5000。（参见：<a href="#maxResultsDesc">接口返回结果数限制</a>）</li></div>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>（不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）<br>搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。</p> 
     * @return Text <p>（不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）<br>搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>（不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）<br>搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。</p>
     * @param Text <p>（不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）<br>搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>（不推荐：应使用 SourceTypes 替代）<br>媒体文件来源，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p> 
     * @return SourceType <p>（不推荐：应使用 SourceTypes 替代）<br>媒体文件来源，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>（不推荐：应使用 SourceTypes 替代）<br>媒体文件来源，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p>
     * @param SourceType <p>（不推荐：应使用 SourceTypes 替代）<br>媒体文件来源，来源取值参见 <a href="https://cloud.tencent.com/document/product/266/31773#MediaSourceData">SourceType</a>。</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>（不推荐：应使用 StreamIds 替代）<br>推流直播码。</p> 
     * @return StreamId <p>（不推荐：应使用 StreamIds 替代）<br>推流直播码。</p>
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set <p>（不推荐：应使用 StreamIds 替代）<br>推流直播码。</p>
     * @param StreamId <p>（不推荐：应使用 StreamIds 替代）<br>推流直播码。</p>
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的开始时间。</p><li>大于等于开始时间。</li><li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li> 
     * @return StartTime <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的开始时间。</p><li>大于等于开始时间。</li><li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的开始时间。</p><li>大于等于开始时间。</li><li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     * @param StartTime <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的开始时间。</p><li>大于等于开始时间。</li><li>当 CreateTime.After 也存在时，将优先使用 CreateTime.After。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的结束时间。</p><li>小于结束时间。</li><li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li> 
     * @return EndTime <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的结束时间。</p><li>小于结束时间。</li><li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的结束时间。</p><li>小于结束时间。</li><li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     * @param EndTime <p>（不推荐：应使用 CreateTime 替代）<br>创建时间的结束时间。</p><li>小于结束时间。</li><li>当 CreateTime.Before 也存在时，将优先使用 CreateTime.Before。</li><li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。</li>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>该字段已无效。</p> 
     * @return Vids <p>该字段已无效。</p>
     */
    public String [] getVids() {
        return this.Vids;
    }

    /**
     * Set <p>该字段已无效。</p>
     * @param Vids <p>该字段已无效。</p>
     */
    public void setVids(String [] Vids) {
        this.Vids = Vids;
    }

    /**
     * Get <p>该字段已无效。</p> 
     * @return Vid <p>该字段已无效。</p>
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set <p>该字段已无效。</p>
     * @param Vid <p>该字段已无效。</p>
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * Get <p>直播推流Domain，当媒资来源是直播录制时有效。</p> 
     * @return StreamDomains <p>直播推流Domain，当媒资来源是直播录制时有效。</p>
     */
    public String [] getStreamDomains() {
        return this.StreamDomains;
    }

    /**
     * Set <p>直播推流Domain，当媒资来源是直播录制时有效。</p>
     * @param StreamDomains <p>直播推流Domain，当媒资来源是直播录制时有效。</p>
     */
    public void setStreamDomains(String [] StreamDomains) {
        this.StreamDomains = StreamDomains;
    }

    /**
     * Get <p>直播推流Path，当媒资来源是直播录制时有效。</p> 
     * @return StreamPaths <p>直播推流Path，当媒资来源是直播录制时有效。</p>
     */
    public String [] getStreamPaths() {
        return this.StreamPaths;
    }

    /**
     * Set <p>直播推流Path，当媒资来源是直播录制时有效。</p>
     * @param StreamPaths <p>直播推流Path，当媒资来源是直播录制时有效。</p>
     */
    public void setStreamPaths(String [] StreamPaths) {
        this.StreamPaths = StreamPaths;
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
        if (source.StreamDomains != null) {
            this.StreamDomains = new String[source.StreamDomains.length];
            for (int i = 0; i < source.StreamDomains.length; i++) {
                this.StreamDomains[i] = new String(source.StreamDomains[i]);
            }
        }
        if (source.StreamPaths != null) {
            this.StreamPaths = new String[source.StreamPaths.length];
            for (int i = 0; i < source.StreamPaths.length; i++) {
                this.StreamPaths[i] = new String(source.StreamPaths[i]);
            }
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
        this.setParamArraySimple(map, prefix + "StreamDomains.", this.StreamDomains);
        this.setParamArraySimple(map, prefix + "StreamPaths.", this.StreamPaths);

    }
}

