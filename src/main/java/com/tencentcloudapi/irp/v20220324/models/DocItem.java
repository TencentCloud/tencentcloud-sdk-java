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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocItem extends AbstractModel{

    /**
    * 内容唯一id
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 内容类型
    */
    @SerializedName("ItemType")
    @Expose
    private Long ItemType;

    /**
    * 内容状态：1 - 上架， 2 - 下架
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 内容生成时间，秒级时间戳（1639624786），需大于0
    */
    @SerializedName("PublishTimestamp")
    @Expose
    private Long PublishTimestamp;

    /**
    * 物料来源ID
    */
    @SerializedName("SourceId")
    @Expose
    private Long SourceId;

    /**
    * 标题名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 内容正文
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 作者
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 作者id
    */
    @SerializedName("AuthorId")
    @Expose
    private String AuthorId;

    /**
    * 标签关键词，多个用英文分号分割
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 内容物料描述：物料的描述信息，推荐系统会对内容的描述信息，使用否LP技术，进行分词、提取关键词，作为news的特征使用。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 图片url
    */
    @SerializedName("PicUrlList")
    @Expose
    private String [] PicUrlList;

    /**
    * 视频url
    */
    @SerializedName("VideoUrlList")
    @Expose
    private String [] VideoUrlList;

    /**
    * 视频时长，时间秒
    */
    @SerializedName("VideoDuration")
    @Expose
    private Long VideoDuration;

    /**
    * 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配
    */
    @SerializedName("CategoryLevel")
    @Expose
    private Long CategoryLevel;

    /**
    * 类目路径，一级二级三级等依次用英文冒号联接，如体育：“足球:巴塞罗那”
    */
    @SerializedName("CategoryPath")
    @Expose
    private String CategoryPath;

    /**
    * 国家，统一用简写，比如中国则填写CN
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 省
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 区县
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年
    */
    @SerializedName("ExpireTimestamp")
    @Expose
    private Long ExpireTimestamp;

    /**
    * 所属话题
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 作者粉丝数
    */
    @SerializedName("AuthorFans")
    @Expose
    private Long AuthorFans;

    /**
    * 作者评级
    */
    @SerializedName("AuthorLevel")
    @Expose
    private String AuthorLevel;

    /**
    * 内容累计收藏次数
    */
    @SerializedName("CollectCnt")
    @Expose
    private Long CollectCnt;

    /**
    * 内容累积点赞次数
    */
    @SerializedName("PraiseCnt")
    @Expose
    private Long PraiseCnt;

    /**
    * 内容累计评论次数
    */
    @SerializedName("CommentCnt")
    @Expose
    private Long CommentCnt;

    /**
    * 内容累计分享次数
    */
    @SerializedName("ShareCnt")
    @Expose
    private Long ShareCnt;

    /**
    * 内容累积打赏数
    */
    @SerializedName("RewardCnt")
    @Expose
    private Long RewardCnt;

    /**
    * 内容质量评分，类似豆瓣电影的评分，这里为100分制，比如97分，满分100分，最低0分，范围外的将会被拦截
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 内容池id，用于分内容池召回，一个内容支持指定一个或多个内容池， 内容池id不建议使用0（0表示不区分内容池）
    */
    @SerializedName("PoolIdList")
    @Expose
    private String [] PoolIdList;

    /**
    * 描述用户标签
    */
    @SerializedName("TagInfoList")
    @Expose
    private TagInfo [] TagInfoList;

    /**
    * json字符串，用于物料数据的扩展
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
     * Get 内容唯一id 
     * @return ItemId 内容唯一id
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 内容唯一id
     * @param ItemId 内容唯一id
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 内容类型 
     * @return ItemType 内容类型
     */
    public Long getItemType() {
        return this.ItemType;
    }

    /**
     * Set 内容类型
     * @param ItemType 内容类型
     */
    public void setItemType(Long ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * Get 内容状态：1 - 上架， 2 - 下架 
     * @return Status 内容状态：1 - 上架， 2 - 下架
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 内容状态：1 - 上架， 2 - 下架
     * @param Status 内容状态：1 - 上架， 2 - 下架
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 内容生成时间，秒级时间戳（1639624786），需大于0 
     * @return PublishTimestamp 内容生成时间，秒级时间戳（1639624786），需大于0
     */
    public Long getPublishTimestamp() {
        return this.PublishTimestamp;
    }

    /**
     * Set 内容生成时间，秒级时间戳（1639624786），需大于0
     * @param PublishTimestamp 内容生成时间，秒级时间戳（1639624786），需大于0
     */
    public void setPublishTimestamp(Long PublishTimestamp) {
        this.PublishTimestamp = PublishTimestamp;
    }

    /**
     * Get 物料来源ID 
     * @return SourceId 物料来源ID
     */
    public Long getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 物料来源ID
     * @param SourceId 物料来源ID
     */
    public void setSourceId(Long SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 标题名称 
     * @return Title 标题名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题名称
     * @param Title 标题名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 内容正文 
     * @return Content 内容正文
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容正文
     * @param Content 内容正文
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 作者 
     * @return Author 作者
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 作者
     * @param Author 作者
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 作者id 
     * @return AuthorId 作者id
     */
    public String getAuthorId() {
        return this.AuthorId;
    }

    /**
     * Set 作者id
     * @param AuthorId 作者id
     */
    public void setAuthorId(String AuthorId) {
        this.AuthorId = AuthorId;
    }

    /**
     * Get 标签关键词，多个用英文分号分割 
     * @return Keyword 标签关键词，多个用英文分号分割
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 标签关键词，多个用英文分号分割
     * @param Keyword 标签关键词，多个用英文分号分割
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 内容物料描述：物料的描述信息，推荐系统会对内容的描述信息，使用否LP技术，进行分词、提取关键词，作为news的特征使用。 
     * @return Desc 内容物料描述：物料的描述信息，推荐系统会对内容的描述信息，使用否LP技术，进行分词、提取关键词，作为news的特征使用。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 内容物料描述：物料的描述信息，推荐系统会对内容的描述信息，使用否LP技术，进行分词、提取关键词，作为news的特征使用。
     * @param Desc 内容物料描述：物料的描述信息，推荐系统会对内容的描述信息，使用否LP技术，进行分词、提取关键词，作为news的特征使用。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 图片url 
     * @return PicUrlList 图片url
     */
    public String [] getPicUrlList() {
        return this.PicUrlList;
    }

    /**
     * Set 图片url
     * @param PicUrlList 图片url
     */
    public void setPicUrlList(String [] PicUrlList) {
        this.PicUrlList = PicUrlList;
    }

    /**
     * Get 视频url 
     * @return VideoUrlList 视频url
     */
    public String [] getVideoUrlList() {
        return this.VideoUrlList;
    }

    /**
     * Set 视频url
     * @param VideoUrlList 视频url
     */
    public void setVideoUrlList(String [] VideoUrlList) {
        this.VideoUrlList = VideoUrlList;
    }

    /**
     * Get 视频时长，时间秒 
     * @return VideoDuration 视频时长，时间秒
     */
    public Long getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * Set 视频时长，时间秒
     * @param VideoDuration 视频时长，时间秒
     */
    public void setVideoDuration(Long VideoDuration) {
        this.VideoDuration = VideoDuration;
    }

    /**
     * Get 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配 
     * @return CategoryLevel 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配
     */
    public Long getCategoryLevel() {
        return this.CategoryLevel;
    }

    /**
     * Set 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配
     * @param CategoryLevel 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配
     */
    public void setCategoryLevel(Long CategoryLevel) {
        this.CategoryLevel = CategoryLevel;
    }

    /**
     * Get 类目路径，一级二级三级等依次用英文冒号联接，如体育：“足球:巴塞罗那” 
     * @return CategoryPath 类目路径，一级二级三级等依次用英文冒号联接，如体育：“足球:巴塞罗那”
     */
    public String getCategoryPath() {
        return this.CategoryPath;
    }

    /**
     * Set 类目路径，一级二级三级等依次用英文冒号联接，如体育：“足球:巴塞罗那”
     * @param CategoryPath 类目路径，一级二级三级等依次用英文冒号联接，如体育：“足球:巴塞罗那”
     */
    public void setCategoryPath(String CategoryPath) {
        this.CategoryPath = CategoryPath;
    }

    /**
     * Get 国家，统一用简写，比如中国则填写CN 
     * @return Country 国家，统一用简写，比如中国则填写CN
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家，统一用简写，比如中国则填写CN
     * @param Country 国家，统一用简写，比如中国则填写CN
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 省 
     * @return Province 省
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省
     * @param Province 省
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 城市 
     * @return City 城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
     * @param City 城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 区县 
     * @return District 区县
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set 区县
     * @param District 区县
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年 
     * @return ExpireTimestamp 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年
     */
    public Long getExpireTimestamp() {
        return this.ExpireTimestamp;
    }

    /**
     * Set 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年
     * @param ExpireTimestamp 内容过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年
     */
    public void setExpireTimestamp(Long ExpireTimestamp) {
        this.ExpireTimestamp = ExpireTimestamp;
    }

    /**
     * Get 所属话题 
     * @return Topic 所属话题
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 所属话题
     * @param Topic 所属话题
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 作者粉丝数 
     * @return AuthorFans 作者粉丝数
     */
    public Long getAuthorFans() {
        return this.AuthorFans;
    }

    /**
     * Set 作者粉丝数
     * @param AuthorFans 作者粉丝数
     */
    public void setAuthorFans(Long AuthorFans) {
        this.AuthorFans = AuthorFans;
    }

    /**
     * Get 作者评级 
     * @return AuthorLevel 作者评级
     */
    public String getAuthorLevel() {
        return this.AuthorLevel;
    }

    /**
     * Set 作者评级
     * @param AuthorLevel 作者评级
     */
    public void setAuthorLevel(String AuthorLevel) {
        this.AuthorLevel = AuthorLevel;
    }

    /**
     * Get 内容累计收藏次数 
     * @return CollectCnt 内容累计收藏次数
     */
    public Long getCollectCnt() {
        return this.CollectCnt;
    }

    /**
     * Set 内容累计收藏次数
     * @param CollectCnt 内容累计收藏次数
     */
    public void setCollectCnt(Long CollectCnt) {
        this.CollectCnt = CollectCnt;
    }

    /**
     * Get 内容累积点赞次数 
     * @return PraiseCnt 内容累积点赞次数
     */
    public Long getPraiseCnt() {
        return this.PraiseCnt;
    }

    /**
     * Set 内容累积点赞次数
     * @param PraiseCnt 内容累积点赞次数
     */
    public void setPraiseCnt(Long PraiseCnt) {
        this.PraiseCnt = PraiseCnt;
    }

    /**
     * Get 内容累计评论次数 
     * @return CommentCnt 内容累计评论次数
     */
    public Long getCommentCnt() {
        return this.CommentCnt;
    }

    /**
     * Set 内容累计评论次数
     * @param CommentCnt 内容累计评论次数
     */
    public void setCommentCnt(Long CommentCnt) {
        this.CommentCnt = CommentCnt;
    }

    /**
     * Get 内容累计分享次数 
     * @return ShareCnt 内容累计分享次数
     */
    public Long getShareCnt() {
        return this.ShareCnt;
    }

    /**
     * Set 内容累计分享次数
     * @param ShareCnt 内容累计分享次数
     */
    public void setShareCnt(Long ShareCnt) {
        this.ShareCnt = ShareCnt;
    }

    /**
     * Get 内容累积打赏数 
     * @return RewardCnt 内容累积打赏数
     */
    public Long getRewardCnt() {
        return this.RewardCnt;
    }

    /**
     * Set 内容累积打赏数
     * @param RewardCnt 内容累积打赏数
     */
    public void setRewardCnt(Long RewardCnt) {
        this.RewardCnt = RewardCnt;
    }

    /**
     * Get 内容质量评分，类似豆瓣电影的评分，这里为100分制，比如97分，满分100分，最低0分，范围外的将会被拦截 
     * @return Score 内容质量评分，类似豆瓣电影的评分，这里为100分制，比如97分，满分100分，最低0分，范围外的将会被拦截
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 内容质量评分，类似豆瓣电影的评分，这里为100分制，比如97分，满分100分，最低0分，范围外的将会被拦截
     * @param Score 内容质量评分，类似豆瓣电影的评分，这里为100分制，比如97分，满分100分，最低0分，范围外的将会被拦截
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 内容池id，用于分内容池召回，一个内容支持指定一个或多个内容池， 内容池id不建议使用0（0表示不区分内容池） 
     * @return PoolIdList 内容池id，用于分内容池召回，一个内容支持指定一个或多个内容池， 内容池id不建议使用0（0表示不区分内容池）
     */
    public String [] getPoolIdList() {
        return this.PoolIdList;
    }

    /**
     * Set 内容池id，用于分内容池召回，一个内容支持指定一个或多个内容池， 内容池id不建议使用0（0表示不区分内容池）
     * @param PoolIdList 内容池id，用于分内容池召回，一个内容支持指定一个或多个内容池， 内容池id不建议使用0（0表示不区分内容池）
     */
    public void setPoolIdList(String [] PoolIdList) {
        this.PoolIdList = PoolIdList;
    }

    /**
     * Get 描述用户标签 
     * @return TagInfoList 描述用户标签
     */
    public TagInfo [] getTagInfoList() {
        return this.TagInfoList;
    }

    /**
     * Set 描述用户标签
     * @param TagInfoList 描述用户标签
     */
    public void setTagInfoList(TagInfo [] TagInfoList) {
        this.TagInfoList = TagInfoList;
    }

    /**
     * Get json字符串，用于物料数据的扩展 
     * @return Extension json字符串，用于物料数据的扩展
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set json字符串，用于物料数据的扩展
     * @param Extension json字符串，用于物料数据的扩展
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
            this.ItemType = new Long(source.ItemType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PublishTimestamp != null) {
            this.PublishTimestamp = new Long(source.PublishTimestamp);
        }
        if (source.SourceId != null) {
            this.SourceId = new Long(source.SourceId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.AuthorId != null) {
            this.AuthorId = new String(source.AuthorId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.PicUrlList != null) {
            this.PicUrlList = new String[source.PicUrlList.length];
            for (int i = 0; i < source.PicUrlList.length; i++) {
                this.PicUrlList[i] = new String(source.PicUrlList[i]);
            }
        }
        if (source.VideoUrlList != null) {
            this.VideoUrlList = new String[source.VideoUrlList.length];
            for (int i = 0; i < source.VideoUrlList.length; i++) {
                this.VideoUrlList[i] = new String(source.VideoUrlList[i]);
            }
        }
        if (source.VideoDuration != null) {
            this.VideoDuration = new Long(source.VideoDuration);
        }
        if (source.CategoryLevel != null) {
            this.CategoryLevel = new Long(source.CategoryLevel);
        }
        if (source.CategoryPath != null) {
            this.CategoryPath = new String(source.CategoryPath);
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
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.ExpireTimestamp != null) {
            this.ExpireTimestamp = new Long(source.ExpireTimestamp);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
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
        if (source.PoolIdList != null) {
            this.PoolIdList = new String[source.PoolIdList.length];
            for (int i = 0; i < source.PoolIdList.length; i++) {
                this.PoolIdList[i] = new String(source.PoolIdList[i]);
            }
        }
        if (source.TagInfoList != null) {
            this.TagInfoList = new TagInfo[source.TagInfoList.length];
            for (int i = 0; i < source.TagInfoList.length; i++) {
                this.TagInfoList[i] = new TagInfo(source.TagInfoList[i]);
            }
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
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "AuthorId", this.AuthorId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamArraySimple(map, prefix + "PicUrlList.", this.PicUrlList);
        this.setParamArraySimple(map, prefix + "VideoUrlList.", this.VideoUrlList);
        this.setParamSimple(map, prefix + "VideoDuration", this.VideoDuration);
        this.setParamSimple(map, prefix + "CategoryLevel", this.CategoryLevel);
        this.setParamSimple(map, prefix + "CategoryPath", this.CategoryPath);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "ExpireTimestamp", this.ExpireTimestamp);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "AuthorFans", this.AuthorFans);
        this.setParamSimple(map, prefix + "AuthorLevel", this.AuthorLevel);
        this.setParamSimple(map, prefix + "CollectCnt", this.CollectCnt);
        this.setParamSimple(map, prefix + "PraiseCnt", this.PraiseCnt);
        this.setParamSimple(map, prefix + "CommentCnt", this.CommentCnt);
        this.setParamSimple(map, prefix + "ShareCnt", this.ShareCnt);
        this.setParamSimple(map, prefix + "RewardCnt", this.RewardCnt);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "PoolIdList.", this.PoolIdList);
        this.setParamArrayObj(map, prefix + "TagInfoList.", this.TagInfoList);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

