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

public class SearchMediaRequest  extends AbstractModel{

    /**
    * 搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64 个字符。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8 个字符。</li>
<li>数组长度限制：10。</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。数组长度限制：10。
    */
    @SerializedName("ClassIds")
    @Expose
    private Long [] ClassIds;

    /**
    * 创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 创建时间的结束时间。
<li>小于结束时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 推流[直播码](https://cloud.tencent.com/document/product/267/5959)。
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 直播录制文件的唯一标识。
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * 排序方式。
<li>Sort.Field 可选值：CreateTime</li>
<li>指定 Text 搜索时，将根据匹配度排序，该字段无效</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * 偏移量。
<li>默认值：0。</li>
<li>取值范围：Offset + Limit 不超过 5000。</li>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：10。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * 获取搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64 个字符。
     * @return Text 搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64 个字符。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * 设置搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64 个字符。
     * @param Text 搜索文本，模糊匹配媒体文件名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：64 个字符。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * 获取标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8 个字符。</li>
<li>数组长度限制：10。</li>
     * @return Tags 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8 个字符。</li>
<li>数组长度限制：10。</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * 设置标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8 个字符。</li>
<li>数组长度限制：10。</li>
     * @param Tags 标签集合，匹配集合中任意元素。
<li>单个标签长度限制：8 个字符。</li>
<li>数组长度限制：10。</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。数组长度限制：10。
     * @return ClassIds 分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。数组长度限制：10。
     */
    public Long [] getClassIds() {
        return this.ClassIds;
    }

    /**
     * 设置分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。数组长度限制：10。
     * @param ClassIds 分类 ID 集合，匹配集合指定 ID 的分类及其所有子类。数组长度限制：10。
     */
    public void setClassIds(Long [] ClassIds) {
        this.ClassIds = ClassIds;
    }

    /**
     * 获取创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     * @return StartTime 创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     * @param StartTime 创建时间的开始时间。
<li>大于等于开始时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取创建时间的结束时间。
<li>小于结束时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     * @return EndTime 创建时间的结束时间。
<li>小于结束时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置创建时间的结束时间。
<li>小于结束时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     * @param EndTime 创建时间的结束时间。
<li>小于结束时间。</li>
<li>格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
     * @return SourceType 媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * 设置媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
     * @param SourceType 媒体文件来源，来源取值参见 [SourceType](https://cloud.tencent.com/document/product/266/31773#MediaSourceData)。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * 获取推流[直播码](https://cloud.tencent.com/document/product/267/5959)。
     * @return StreamId 推流[直播码](https://cloud.tencent.com/document/product/267/5959)。
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * 设置推流[直播码](https://cloud.tencent.com/document/product/267/5959)。
     * @param StreamId 推流[直播码](https://cloud.tencent.com/document/product/267/5959)。
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * 获取直播录制文件的唯一标识。
     * @return Vid 直播录制文件的唯一标识。
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * 设置直播录制文件的唯一标识。
     * @param Vid 直播录制文件的唯一标识。
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * 获取排序方式。
<li>Sort.Field 可选值：CreateTime</li>
<li>指定 Text 搜索时，将根据匹配度排序，该字段无效</li>
     * @return Sort 排序方式。
<li>Sort.Field 可选值：CreateTime</li>
<li>指定 Text 搜索时，将根据匹配度排序，该字段无效</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * 设置排序方式。
<li>Sort.Field 可选值：CreateTime</li>
<li>指定 Text 搜索时，将根据匹配度排序，该字段无效</li>
     * @param Sort 排序方式。
<li>Sort.Field 可选值：CreateTime</li>
<li>指定 Text 搜索时，将根据匹配度排序，该字段无效</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * 获取偏移量。
<li>默认值：0。</li>
<li>取值范围：Offset + Limit 不超过 5000。</li>
     * @return Offset 偏移量。
<li>默认值：0。</li>
<li>取值范围：Offset + Limit 不超过 5000。</li>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量。
<li>默认值：0。</li>
<li>取值范围：Offset + Limit 不超过 5000。</li>
     * @param Offset 偏移量。
<li>默认值：0。</li>
<li>取值范围：Offset + Limit 不超过 5000。</li>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回记录条数，默认值：10。
     * @return Limit 返回记录条数，默认值：10。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回记录条数，默认值：10。
     * @param Limit 返回记录条数，默认值：10。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * 设置点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "ClassIds.", this.ClassIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Vid", this.Vid);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

