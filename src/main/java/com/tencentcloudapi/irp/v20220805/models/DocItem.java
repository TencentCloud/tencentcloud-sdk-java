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
package com.tencentcloudapi.irp.v20220805.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocItem extends AbstractModel{

    /**
    * 内容唯一id，建议限制在128字符以内
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 内容类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案）
    */
    @SerializedName("ItemType")
    @Expose
    private String ItemType;

    /**
    * 内容状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 内容生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b>
    */
    @SerializedName("PublishTimestamp")
    @Expose
    private Long PublishTimestamp;

    /**
    * 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，用作特征，过期则不会被推荐，<b>强烈建议</b>
    */
    @SerializedName("ExpireTimestamp")
    @Expose
    private Long ExpireTimestamp;

    /**
    * 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配，<b>强烈建议</b>
    */
    @SerializedName("CategoryLevel")
    @Expose
    private Long CategoryLevel;

    /**
    * 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“足球:巴塞罗那”。<b>用于物料池管理，强烈建议</b>
    */
    @SerializedName("CategoryPath")
    @Expose
    private String CategoryPath;

    /**
    * 内容标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 作者名，需保证作者名唯一，若有重名需要加编号区分。<b>用于召回过滤、规则打散，强烈建议</b>
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 内容来源类型，客户自定义，<b>用于物料池管理</b>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 内容标题，<b>主要用于语义分析</b>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b>
    */
    @SerializedName("ContentUrl")
    @Expose
    private String ContentUrl;

    /**
    * 视频时长，时间秒，大于等于0，小于 3600 * 10。<b>视频内容必填，其它内容非必填，用作特征</b>
    */
    @SerializedName("VideoDuration")
    @Expose
    private Long VideoDuration;

    /**
    * 国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 作者粉丝数，<b>用作特征</b>
    */
    @SerializedName("AuthorFans")
    @Expose
    private Long AuthorFans;

    /**
    * 作者评级，<b>用作特征</b>
    */
    @SerializedName("AuthorLevel")
    @Expose
    private String AuthorLevel;

    /**
    * 内容累计收藏次数，<b>用作特征</b>
    */
    @SerializedName("CollectCnt")
    @Expose
    private Long CollectCnt;

    /**
    * 内容累积点赞次数，<b>用作特征</b>
    */
    @SerializedName("PraiseCnt")
    @Expose
    private Long PraiseCnt;

    /**
    * 内容累计评论次数，<b>用作特征</b>
    */
    @SerializedName("CommentCnt")
    @Expose
    private Long CommentCnt;

    /**
    * 内容累计分享次数，<b>用作特征</b>
    */
    @SerializedName("ShareCnt")
    @Expose
    private Long ShareCnt;

    /**
    * 内容累积打赏数，<b>用作特征</b>
    */
    @SerializedName("RewardCnt")
    @Expose
    private Long RewardCnt;

    /**
    * 内容质量评分，<b>用作特征</b>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * json字符串，<b>用于物料池管理的自定义扩展</b>
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
     * Get 内容唯一id，建议限制在128字符以内 
     * @return ItemId 内容唯一id，建议限制在128字符以内
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 内容唯一id，建议限制在128字符以内
     * @param ItemId 内容唯一id，建议限制在128字符以内
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 内容类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案） 
     * @return ItemType 内容类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案）
     */
    public String getItemType() {
        return this.ItemType;
    }

    /**
     * Set 内容类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案）
     * @param ItemType 内容类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案）
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * Get 内容状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可 
     * @return Status 内容状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 内容状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可
     * @param Status 内容状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 内容生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b> 
     * @return PublishTimestamp 内容生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b>
     */
    public Long getPublishTimestamp() {
        return this.PublishTimestamp;
    }

    /**
     * Set 内容生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b>
     * @param PublishTimestamp 内容生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b>
     */
    public void setPublishTimestamp(Long PublishTimestamp) {
        this.PublishTimestamp = PublishTimestamp;
    }

    /**
     * Get 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，用作特征，过期则不会被推荐，<b>强烈建议</b> 
     * @return ExpireTimestamp 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，用作特征，过期则不会被推荐，<b>强烈建议</b>
     */
    public Long getExpireTimestamp() {
        return this.ExpireTimestamp;
    }

    /**
     * Set 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，用作特征，过期则不会被推荐，<b>强烈建议</b>
     * @param ExpireTimestamp 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，用作特征，过期则不会被推荐，<b>强烈建议</b>
     */
    public void setExpireTimestamp(Long ExpireTimestamp) {
        this.ExpireTimestamp = ExpireTimestamp;
    }

    /**
     * Get 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配，<b>强烈建议</b> 
     * @return CategoryLevel 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配，<b>强烈建议</b>
     */
    public Long getCategoryLevel() {
        return this.CategoryLevel;
    }

    /**
     * Set 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配，<b>强烈建议</b>
     * @param CategoryLevel 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配，<b>强烈建议</b>
     */
    public void setCategoryLevel(Long CategoryLevel) {
        this.CategoryLevel = CategoryLevel;
    }

    /**
     * Get 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“足球:巴塞罗那”。<b>用于物料池管理，强烈建议</b> 
     * @return CategoryPath 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“足球:巴塞罗那”。<b>用于物料池管理，强烈建议</b>
     */
    public String getCategoryPath() {
        return this.CategoryPath;
    }

    /**
     * Set 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“足球:巴塞罗那”。<b>用于物料池管理，强烈建议</b>
     * @param CategoryPath 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“足球:巴塞罗那”。<b>用于物料池管理，强烈建议</b>
     */
    public void setCategoryPath(String CategoryPath) {
        this.CategoryPath = CategoryPath;
    }

    /**
     * Get 内容标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b> 
     * @return Tags 内容标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 内容标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
     * @param Tags 内容标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 作者名，需保证作者名唯一，若有重名需要加编号区分。<b>用于召回过滤、规则打散，强烈建议</b> 
     * @return Author 作者名，需保证作者名唯一，若有重名需要加编号区分。<b>用于召回过滤、规则打散，强烈建议</b>
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 作者名，需保证作者名唯一，若有重名需要加编号区分。<b>用于召回过滤、规则打散，强烈建议</b>
     * @param Author 作者名，需保证作者名唯一，若有重名需要加编号区分。<b>用于召回过滤、规则打散，强烈建议</b>
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 内容来源类型，客户自定义，<b>用于物料池管理</b> 
     * @return SourceId 内容来源类型，客户自定义，<b>用于物料池管理</b>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 内容来源类型，客户自定义，<b>用于物料池管理</b>
     * @param SourceId 内容来源类型，客户自定义，<b>用于物料池管理</b>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 内容标题，<b>主要用于语义分析</b> 
     * @return Title 内容标题，<b>主要用于语义分析</b>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 内容标题，<b>主要用于语义分析</b>
     * @param Title 内容标题，<b>主要用于语义分析</b>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b> 
     * @return Content 正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b>
     * @param Content 正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b> 
     * @return ContentUrl 正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b>
     */
    public String getContentUrl() {
        return this.ContentUrl;
    }

    /**
     * Set 正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b>
     * @param ContentUrl 正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b>
     */
    public void setContentUrl(String ContentUrl) {
        this.ContentUrl = ContentUrl;
    }

    /**
     * Get 视频时长，时间秒，大于等于0，小于 3600 * 10。<b>视频内容必填，其它内容非必填，用作特征</b> 
     * @return VideoDuration 视频时长，时间秒，大于等于0，小于 3600 * 10。<b>视频内容必填，其它内容非必填，用作特征</b>
     */
    public Long getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * Set 视频时长，时间秒，大于等于0，小于 3600 * 10。<b>视频内容必填，其它内容非必填，用作特征</b>
     * @param VideoDuration 视频时长，时间秒，大于等于0，小于 3600 * 10。<b>视频内容必填，其它内容非必填，用作特征</b>
     */
    public void setVideoDuration(Long VideoDuration) {
        this.VideoDuration = VideoDuration;
    }

    /**
     * Get 国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b> 
     * @return Country 国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
     * @param Country 国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b> 
     * @return Province 省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
     * @param Province 省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b> 
     * @return City 城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
     * @param City 城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 作者粉丝数，<b>用作特征</b> 
     * @return AuthorFans 作者粉丝数，<b>用作特征</b>
     */
    public Long getAuthorFans() {
        return this.AuthorFans;
    }

    /**
     * Set 作者粉丝数，<b>用作特征</b>
     * @param AuthorFans 作者粉丝数，<b>用作特征</b>
     */
    public void setAuthorFans(Long AuthorFans) {
        this.AuthorFans = AuthorFans;
    }

    /**
     * Get 作者评级，<b>用作特征</b> 
     * @return AuthorLevel 作者评级，<b>用作特征</b>
     */
    public String getAuthorLevel() {
        return this.AuthorLevel;
    }

    /**
     * Set 作者评级，<b>用作特征</b>
     * @param AuthorLevel 作者评级，<b>用作特征</b>
     */
    public void setAuthorLevel(String AuthorLevel) {
        this.AuthorLevel = AuthorLevel;
    }

    /**
     * Get 内容累计收藏次数，<b>用作特征</b> 
     * @return CollectCnt 内容累计收藏次数，<b>用作特征</b>
     */
    public Long getCollectCnt() {
        return this.CollectCnt;
    }

    /**
     * Set 内容累计收藏次数，<b>用作特征</b>
     * @param CollectCnt 内容累计收藏次数，<b>用作特征</b>
     */
    public void setCollectCnt(Long CollectCnt) {
        this.CollectCnt = CollectCnt;
    }

    /**
     * Get 内容累积点赞次数，<b>用作特征</b> 
     * @return PraiseCnt 内容累积点赞次数，<b>用作特征</b>
     */
    public Long getPraiseCnt() {
        return this.PraiseCnt;
    }

    /**
     * Set 内容累积点赞次数，<b>用作特征</b>
     * @param PraiseCnt 内容累积点赞次数，<b>用作特征</b>
     */
    public void setPraiseCnt(Long PraiseCnt) {
        this.PraiseCnt = PraiseCnt;
    }

    /**
     * Get 内容累计评论次数，<b>用作特征</b> 
     * @return CommentCnt 内容累计评论次数，<b>用作特征</b>
     */
    public Long getCommentCnt() {
        return this.CommentCnt;
    }

    /**
     * Set 内容累计评论次数，<b>用作特征</b>
     * @param CommentCnt 内容累计评论次数，<b>用作特征</b>
     */
    public void setCommentCnt(Long CommentCnt) {
        this.CommentCnt = CommentCnt;
    }

    /**
     * Get 内容累计分享次数，<b>用作特征</b> 
     * @return ShareCnt 内容累计分享次数，<b>用作特征</b>
     */
    public Long getShareCnt() {
        return this.ShareCnt;
    }

    /**
     * Set 内容累计分享次数，<b>用作特征</b>
     * @param ShareCnt 内容累计分享次数，<b>用作特征</b>
     */
    public void setShareCnt(Long ShareCnt) {
        this.ShareCnt = ShareCnt;
    }

    /**
     * Get 内容累积打赏数，<b>用作特征</b> 
     * @return RewardCnt 内容累积打赏数，<b>用作特征</b>
     */
    public Long getRewardCnt() {
        return this.RewardCnt;
    }

    /**
     * Set 内容累积打赏数，<b>用作特征</b>
     * @param RewardCnt 内容累积打赏数，<b>用作特征</b>
     */
    public void setRewardCnt(Long RewardCnt) {
        this.RewardCnt = RewardCnt;
    }

    /**
     * Get 内容质量评分，<b>用作特征</b> 
     * @return Score 内容质量评分，<b>用作特征</b>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 内容质量评分，<b>用作特征</b>
     * @param Score 内容质量评分，<b>用作特征</b>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get json字符串，<b>用于物料池管理的自定义扩展</b> 
     * @return Extension json字符串，<b>用于物料池管理的自定义扩展</b>
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set json字符串，<b>用于物料池管理的自定义扩展</b>
     * @param Extension json字符串，<b>用于物料池管理的自定义扩展</b>
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public DocItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocItem(DocItem source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.ItemType != null) {
            this.ItemType = new String(source.ItemType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PublishTimestamp != null) {
            this.PublishTimestamp = new Long(source.PublishTimestamp);
        }
        if (source.ExpireTimestamp != null) {
            this.ExpireTimestamp = new Long(source.ExpireTimestamp);
        }
        if (source.CategoryLevel != null) {
            this.CategoryLevel = new Long(source.CategoryLevel);
        }
        if (source.CategoryPath != null) {
            this.CategoryPath = new String(source.CategoryPath);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ContentUrl != null) {
            this.ContentUrl = new String(source.ContentUrl);
        }
        if (source.VideoDuration != null) {
            this.VideoDuration = new Long(source.VideoDuration);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.AuthorFans != null) {
            this.AuthorFans = new Long(source.AuthorFans);
        }
        if (source.AuthorLevel != null) {
            this.AuthorLevel = new String(source.AuthorLevel);
        }
        if (source.CollectCnt != null) {
            this.CollectCnt = new Long(source.CollectCnt);
        }
        if (source.PraiseCnt != null) {
            this.PraiseCnt = new Long(source.PraiseCnt);
        }
        if (source.CommentCnt != null) {
            this.CommentCnt = new Long(source.CommentCnt);
        }
        if (source.ShareCnt != null) {
            this.ShareCnt = new Long(source.ShareCnt);
        }
        if (source.RewardCnt != null) {
            this.RewardCnt = new Long(source.RewardCnt);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemType", this.ItemType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PublishTimestamp", this.PublishTimestamp);
        this.setParamSimple(map, prefix + "ExpireTimestamp", this.ExpireTimestamp);
        this.setParamSimple(map, prefix + "CategoryLevel", this.CategoryLevel);
        this.setParamSimple(map, prefix + "CategoryPath", this.CategoryPath);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ContentUrl", this.ContentUrl);
        this.setParamSimple(map, prefix + "VideoDuration", this.VideoDuration);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "AuthorFans", this.AuthorFans);
        this.setParamSimple(map, prefix + "AuthorLevel", this.AuthorLevel);
        this.setParamSimple(map, prefix + "CollectCnt", this.CollectCnt);
        this.setParamSimple(map, prefix + "PraiseCnt", this.PraiseCnt);
        this.setParamSimple(map, prefix + "CommentCnt", this.CommentCnt);
        this.setParamSimple(map, prefix + "ShareCnt", this.ShareCnt);
        this.setParamSimple(map, prefix + "RewardCnt", this.RewardCnt);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

