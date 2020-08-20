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

public class SearchMediaRequest extends AbstractModel{

    /**
    * 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8个字符。</li>
<li>数组长度限制：10。</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。
<li>数组长度限制：10。</li>
    */
    @SerializedName("ClassIds")
    @Expose
    private Long [] ClassIds;

    /**
    * 推流 [直播码](https://cloud.tencent.com/document/product/267/5959) 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
    */
    @SerializedName("StreamIds")
    @Expose
    private String [] StreamIds;

    /**
    * 直播录制文件的唯一标识。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
    */
    @SerializedName("Vids")
    @Expose
    private String [] Vids;

    /**
    * 媒体文件来源集合，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
<li>数组长度限制：10。</li>
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

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
    * 匹配创建时间在此时间段内的文件。
<li>包含所指定的头尾时间点。</li>
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

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
<li>单个文件名长度限制：40个字符。</li>
<li>数组长度限制：10。</li>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：20个字符。</li>
<li>数组长度限制：10。</li>
    */
    @SerializedName("NamePrefixes")
    @Expose
    private String [] NamePrefixes;

    /**
    * 文件描述集合，匹配集合中的任意元素。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
    */
    @SerializedName("Descriptions")
    @Expose
    private String [] Descriptions;

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
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * （不推荐：应使用 StreamIds 替代）
推流 [直播码](https://cloud.tencent.com/document/product/267/5959)。
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * （不推荐：应使用 Vids 替代）
直播录制文件的唯一标识。
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * （不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）
搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64个字符。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

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
    * （不推荐：应使用 SourceTypes 替代）
媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
     * Get 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8个字符。</li>
<li>数组长度限制：10。</li> 
     * @return Tags 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8个字符。</li>
<li>数组长度限制：10。</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8个字符。</li>
<li>数组长度限制：10。</li>
     * @param Tags 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8个字符。</li>
<li>数组长度限制：10。</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
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
     * Get 推流 [直播码](https://cloud.tencent.com/document/product/267/5959) 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li> 
     * @return StreamIds 推流 [直播码](https://cloud.tencent.com/document/product/267/5959) 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     */
    public String [] getStreamIds() {
        return this.StreamIds;
    }

    /**
     * Set 推流 [直播码](https://cloud.tencent.com/document/product/267/5959) 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     * @param StreamIds 推流 [直播码](https://cloud.tencent.com/document/product/267/5959) 集合。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     */
    public void setStreamIds(String [] StreamIds) {
        this.StreamIds = StreamIds;
    }

    /**
     * Get 直播录制文件的唯一标识。匹配集合中的任意元素。
<li>数组长度限制：10。</li> 
     * @return Vids 直播录制文件的唯一标识。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     */
    public String [] getVids() {
        return this.Vids;
    }

    /**
     * Set 直播录制文件的唯一标识。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     * @param Vids 直播录制文件的唯一标识。匹配集合中的任意元素。
<li>数组长度限制：10。</li>
     */
    public void setVids(String [] Vids) {
        this.Vids = Vids;
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
<li>单个文件名长度限制：40个字符。</li>
<li>数组长度限制：10。</li> 
     * @return Names 文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。
<li>单个文件名长度限制：40个字符。</li>
<li>数组长度限制：10。</li>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。
<li>单个文件名长度限制：40个字符。</li>
<li>数组长度限制：10。</li>
     * @param Names 文件名集合，模糊匹配媒体文件的文件名，匹配度越高，排序越优先。
<li>单个文件名长度限制：40个字符。</li>
<li>数组长度限制：10。</li>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：20个字符。</li>
<li>数组长度限制：10。</li> 
     * @return NamePrefixes 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：20个字符。</li>
<li>数组长度限制：10。</li>
     */
    public String [] getNamePrefixes() {
        return this.NamePrefixes;
    }

    /**
     * Set 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：20个字符。</li>
<li>数组长度限制：10。</li>
     * @param NamePrefixes 文件名前缀，前缀匹配媒体文件的文件名。
<li>单个文件名前缀长度限制：20个字符。</li>
<li>数组长度限制：10。</li>
     */
    public void setNamePrefixes(String [] NamePrefixes) {
        this.NamePrefixes = NamePrefixes;
    }

    /**
     * Get 文件描述集合，匹配集合中的任意元素。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li> 
     * @return Descriptions 文件描述集合，匹配集合中的任意元素。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     */
    public String [] getDescriptions() {
        return this.Descriptions;
    }

    /**
     * Set 文件描述集合，匹配集合中的任意元素。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     * @param Descriptions 文件描述集合，匹配集合中的任意元素。
<li>单个描述长度限制：100个字符。</li>
<li>数组长度限制：10。</li>
     */
    public void setDescriptions(String [] Descriptions) {
        this.Descriptions = Descriptions;
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
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get （不推荐：应使用 StreamIds 替代）
推流 [直播码](https://cloud.tencent.com/document/product/267/5959)。 
     * @return StreamId （不推荐：应使用 StreamIds 替代）
推流 [直播码](https://cloud.tencent.com/document/product/267/5959)。
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set （不推荐：应使用 StreamIds 替代）
推流 [直播码](https://cloud.tencent.com/document/product/267/5959)。
     * @param StreamId （不推荐：应使用 StreamIds 替代）
推流 [直播码](https://cloud.tencent.com/document/product/267/5959)。
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get （不推荐：应使用 Vids 替代）
直播录制文件的唯一标识。 
     * @return Vid （不推荐：应使用 Vids 替代）
直播录制文件的唯一标识。
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set （不推荐：应使用 Vids 替代）
直播录制文件的唯一标识。
     * @param Vid （不推荐：应使用 Vids 替代）
直播录制文件的唯一标识。
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "ClassIds.", this.ClassIds);
        this.setParamArraySimple(map, prefix + "StreamIds.", this.StreamIds);
        this.setParamArraySimple(map, prefix + "Vids.", this.Vids);
        this.setParamArraySimple(map, prefix + "SourceTypes.", this.SourceTypes);
        this.setParamArraySimple(map, prefix + "Categories.", this.Categories);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "NamePrefixes.", this.NamePrefixes);
        this.setParamArraySimple(map, prefix + "Descriptions.", this.Descriptions);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Vid", this.Vid);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

