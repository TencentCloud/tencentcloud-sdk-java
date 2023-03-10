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

public class GoodsInfo extends AbstractModel{

    /**
    * 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度。建议限制在128字符以内
    */
    @SerializedName("GoodsId")
    @Expose
    private String GoodsId;

    /**
    * 商品物料展示类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案）
    */
    @SerializedName("GoodsType")
    @Expose
    private String GoodsType;

    /**
    * 商品状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 商品生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b>
    */
    @SerializedName("PublishTimestamp")
    @Expose
    private Long PublishTimestamp;

    /**
    * 商品过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，<b>用作特征</b>，过期则不会被推荐，<b>强烈建议</b>
    */
    @SerializedName("ExpireTimestamp")
    @Expose
    private Long ExpireTimestamp;

    /**
    * spu((Standard Product Unit))维度id，商品聚合信息的最小单位，<b>强烈建议</b>
    */
    @SerializedName("SpuId")
    @Expose
    private String SpuId;

    /**
    * 类目层级数，例如3级类目，则填3，和CategoryPath字段的类数据匹配，<b>强烈建议</b>
    */
    @SerializedName("CategoryLevel")
    @Expose
    private Long CategoryLevel;

    /**
    * 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“女装:裙子:半身裙”。<b>用于物料池管理，强烈建议</b>
    */
    @SerializedName("CategoryPath")
    @Expose
    private String CategoryPath;

    /**
    * 商品标题，<b>主要用于语义分析</b>，<b>强烈建议</b>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 商品标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 商品对应的品牌，取值用户自定义，可以是品牌id或品牌明文，<b>用作特征以及打散/过滤规则，强烈建议</b>
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * 商品所属店铺ID，取值客户自定义，<b>用作特征，强烈建议</b>
    */
    @SerializedName("ShopId")
    @Expose
    private String ShopId;

    /**
    * 商品原始价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b>
    */
    @SerializedName("OrgPrice")
    @Expose
    private Float OrgPrice;

    /**
    * 商品当前价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b>
    */
    @SerializedName("CurPrice")
    @Expose
    private Float CurPrice;

    /**
    * 商品来源类型，客户自定义，<b>用于物料池管理</b>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 商品正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 商品正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b>
    */
    @SerializedName("ContentUrl")
    @Expose
    private String ContentUrl;

    /**
    * 商品封面url，不超过10个，<b>用作特征</b>
    */
    @SerializedName("PicUrlList")
    @Expose
    private String [] PicUrlList;

    /**
    * 卖家所在国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 卖家所在省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 卖家所在城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 商品是否包邮；1:包邮；2:不包邮；3:满足条件包邮，<b>用作特征</b>
    */
    @SerializedName("FreeShipping")
    @Expose
    private Long FreeShipping;

    /**
    * 商品邮费（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征</b>
    */
    @SerializedName("ShippingPrice")
    @Expose
    private Float ShippingPrice;

    /**
    * 商品累计好评次数，<b>用作特征</b>
    */
    @SerializedName("PraiseCnt")
    @Expose
    private Long PraiseCnt;

    /**
    * 商品累计评论次数，<b>用作特征</b>
    */
    @SerializedName("CommentCnt")
    @Expose
    private Long CommentCnt;

    /**
    * 商品累计分享次数，<b>用作特征</b>
    */
    @SerializedName("ShareCnt")
    @Expose
    private Long ShareCnt;

    /**
    * 商品累计收藏次数，<b>用作特征</b>
    */
    @SerializedName("CollectCnt")
    @Expose
    private Long CollectCnt;

    /**
    * 商品累积成交次数，<b>用作特征</b>
    */
    @SerializedName("OrderCnt")
    @Expose
    private Long OrderCnt;

    /**
    * 商品平均客户评分，取值范围用户自定，<b>用作特征</b>
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
     * Get 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度。建议限制在128字符以内 
     * @return GoodsId 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度。建议限制在128字符以内
     */
    public String getGoodsId() {
        return this.GoodsId;
    }

    /**
     * Set 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度。建议限制在128字符以内
     * @param GoodsId 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度。建议限制在128字符以内
     */
    public void setGoodsId(String GoodsId) {
        this.GoodsId = GoodsId;
    }

    /**
     * Get 商品物料展示类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案） 
     * @return GoodsType 商品物料展示类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案）
     */
    public String getGoodsType() {
        return this.GoodsType;
    }

    /**
     * Set 商品物料展示类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案）
     * @param GoodsType 商品物料展示类型：<br/>● article -图文<br>● text -纯文本<br/>● video -视频<br/>● short_video -时长15秒以内的视频<br/>● mini_video -竖屏视频<br/>● image -纯图片<br/>（如当前类型不满足，请<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决方案）
     */
    public void setGoodsType(String GoodsType) {
        this.GoodsType = GoodsType;
    }

    /**
     * Get 商品状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可 
     * @return Status 商品状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 商品状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可
     * @param Status 商品状态：
● 1 - 上架 
● 2 - 下架 
Status=2的内容不会在推荐结果中出现 
需要下架内容时，把Status的值修改为2即可
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 商品生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b> 
     * @return PublishTimestamp 商品生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b>
     */
    public Long getPublishTimestamp() {
        return this.PublishTimestamp;
    }

    /**
     * Set 商品生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b>
     * @param PublishTimestamp 商品生成时间，秒级时间戳（1639624786），需大于0，<b>用作特征和物料管理</b>
     */
    public void setPublishTimestamp(Long PublishTimestamp) {
        this.PublishTimestamp = PublishTimestamp;
    }

    /**
     * Get 商品过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，<b>用作特征</b>，过期则不会被推荐，<b>强烈建议</b> 
     * @return ExpireTimestamp 商品过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，<b>用作特征</b>，过期则不会被推荐，<b>强烈建议</b>
     */
    public Long getExpireTimestamp() {
        return this.ExpireTimestamp;
    }

    /**
     * Set 商品过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，<b>用作特征</b>，过期则不会被推荐，<b>强烈建议</b>
     * @param ExpireTimestamp 商品过期时间，秒级时间戳（1639624786），如未填，则默认PublishTimestamp往后延一年，<b>用作特征</b>，过期则不会被推荐，<b>强烈建议</b>
     */
    public void setExpireTimestamp(Long ExpireTimestamp) {
        this.ExpireTimestamp = ExpireTimestamp;
    }

    /**
     * Get spu((Standard Product Unit))维度id，商品聚合信息的最小单位，<b>强烈建议</b> 
     * @return SpuId spu((Standard Product Unit))维度id，商品聚合信息的最小单位，<b>强烈建议</b>
     */
    public String getSpuId() {
        return this.SpuId;
    }

    /**
     * Set spu((Standard Product Unit))维度id，商品聚合信息的最小单位，<b>强烈建议</b>
     * @param SpuId spu((Standard Product Unit))维度id，商品聚合信息的最小单位，<b>强烈建议</b>
     */
    public void setSpuId(String SpuId) {
        this.SpuId = SpuId;
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
     * Get 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“女装:裙子:半身裙”。<b>用于物料池管理，强烈建议</b> 
     * @return CategoryPath 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“女装:裙子:半身裙”。<b>用于物料池管理，强烈建议</b>
     */
    public String getCategoryPath() {
        return this.CategoryPath;
    }

    /**
     * Set 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“女装:裙子:半身裙”。<b>用于物料池管理，强烈建议</b>
     * @param CategoryPath 类目路径，一级二级三级等依次用英文冒号联接，和CategoryLevel字段值匹配，如体育：“女装:裙子:半身裙”。<b>用于物料池管理，强烈建议</b>
     */
    public void setCategoryPath(String CategoryPath) {
        this.CategoryPath = CategoryPath;
    }

    /**
     * Get 商品标题，<b>主要用于语义分析</b>，<b>强烈建议</b> 
     * @return Title 商品标题，<b>主要用于语义分析</b>，<b>强烈建议</b>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 商品标题，<b>主要用于语义分析</b>，<b>强烈建议</b>
     * @param Title 商品标题，<b>主要用于语义分析</b>，<b>强烈建议</b>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 商品标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b> 
     * @return Tags 商品标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 商品标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
     * @param Tags 商品标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 商品对应的品牌，取值用户自定义，可以是品牌id或品牌明文，<b>用作特征以及打散/过滤规则，强烈建议</b> 
     * @return Brand 商品对应的品牌，取值用户自定义，可以是品牌id或品牌明文，<b>用作特征以及打散/过滤规则，强烈建议</b>
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set 商品对应的品牌，取值用户自定义，可以是品牌id或品牌明文，<b>用作特征以及打散/过滤规则，强烈建议</b>
     * @param Brand 商品对应的品牌，取值用户自定义，可以是品牌id或品牌明文，<b>用作特征以及打散/过滤规则，强烈建议</b>
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get 商品所属店铺ID，取值客户自定义，<b>用作特征，强烈建议</b> 
     * @return ShopId 商品所属店铺ID，取值客户自定义，<b>用作特征，强烈建议</b>
     */
    public String getShopId() {
        return this.ShopId;
    }

    /**
     * Set 商品所属店铺ID，取值客户自定义，<b>用作特征，强烈建议</b>
     * @param ShopId 商品所属店铺ID，取值客户自定义，<b>用作特征，强烈建议</b>
     */
    public void setShopId(String ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 商品原始价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b> 
     * @return OrgPrice 商品原始价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b>
     */
    public Float getOrgPrice() {
        return this.OrgPrice;
    }

    /**
     * Set 商品原始价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b>
     * @param OrgPrice 商品原始价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b>
     */
    public void setOrgPrice(Float OrgPrice) {
        this.OrgPrice = OrgPrice;
    }

    /**
     * Get 商品当前价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b> 
     * @return CurPrice 商品当前价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b>
     */
    public Float getCurPrice() {
        return this.CurPrice;
    }

    /**
     * Set 商品当前价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b>
     * @param CurPrice 商品当前价格（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征，强烈建议</b>
     */
    public void setCurPrice(Float CurPrice) {
        this.CurPrice = CurPrice;
    }

    /**
     * Get 商品来源类型，客户自定义，<b>用于物料池管理</b> 
     * @return SourceId 商品来源类型，客户自定义，<b>用于物料池管理</b>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 商品来源类型，客户自定义，<b>用于物料池管理</b>
     * @param SourceId 商品来源类型，客户自定义，<b>用于物料池管理</b>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 商品正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b> 
     * @return Content 商品正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 商品正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b>
     * @param Content 商品正文关键片段，建议控制在500字符以内，<b>主要用于语义分析</b>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 商品正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b> 
     * @return ContentUrl 商品正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b>
     */
    public String getContentUrl() {
        return this.ContentUrl;
    }

    /**
     * Set 商品正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b>
     * @param ContentUrl 商品正文详情，主要用于语义分析，当内容过大时建议用ContentUrl传递，<b>与Content可二选一</b>
     */
    public void setContentUrl(String ContentUrl) {
        this.ContentUrl = ContentUrl;
    }

    /**
     * Get 商品封面url，不超过10个，<b>用作特征</b> 
     * @return PicUrlList 商品封面url，不超过10个，<b>用作特征</b>
     */
    public String [] getPicUrlList() {
        return this.PicUrlList;
    }

    /**
     * Set 商品封面url，不超过10个，<b>用作特征</b>
     * @param PicUrlList 商品封面url，不超过10个，<b>用作特征</b>
     */
    public void setPicUrlList(String [] PicUrlList) {
        this.PicUrlList = PicUrlList;
    }

    /**
     * Get 卖家所在国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b> 
     * @return Country 卖家所在国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 卖家所在国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
     * @param Country 卖家所在国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 卖家所在省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b> 
     * @return Province 卖家所在省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 卖家所在省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
     * @param Province 卖家所在省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 卖家所在城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b> 
     * @return City 卖家所在城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 卖家所在城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
     * @param City 卖家所在城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 商品是否包邮；1:包邮；2:不包邮；3:满足条件包邮，<b>用作特征</b> 
     * @return FreeShipping 商品是否包邮；1:包邮；2:不包邮；3:满足条件包邮，<b>用作特征</b>
     */
    public Long getFreeShipping() {
        return this.FreeShipping;
    }

    /**
     * Set 商品是否包邮；1:包邮；2:不包邮；3:满足条件包邮，<b>用作特征</b>
     * @param FreeShipping 商品是否包邮；1:包邮；2:不包邮；3:满足条件包邮，<b>用作特征</b>
     */
    public void setFreeShipping(Long FreeShipping) {
        this.FreeShipping = FreeShipping;
    }

    /**
     * Get 商品邮费（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征</b> 
     * @return ShippingPrice 商品邮费（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征</b>
     */
    public Float getShippingPrice() {
        return this.ShippingPrice;
    }

    /**
     * Set 商品邮费（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征</b>
     * @param ShippingPrice 商品邮费（单位：元，统一货币体系，如统一为RMB或美元等），<b>用作特征</b>
     */
    public void setShippingPrice(Float ShippingPrice) {
        this.ShippingPrice = ShippingPrice;
    }

    /**
     * Get 商品累计好评次数，<b>用作特征</b> 
     * @return PraiseCnt 商品累计好评次数，<b>用作特征</b>
     */
    public Long getPraiseCnt() {
        return this.PraiseCnt;
    }

    /**
     * Set 商品累计好评次数，<b>用作特征</b>
     * @param PraiseCnt 商品累计好评次数，<b>用作特征</b>
     */
    public void setPraiseCnt(Long PraiseCnt) {
        this.PraiseCnt = PraiseCnt;
    }

    /**
     * Get 商品累计评论次数，<b>用作特征</b> 
     * @return CommentCnt 商品累计评论次数，<b>用作特征</b>
     */
    public Long getCommentCnt() {
        return this.CommentCnt;
    }

    /**
     * Set 商品累计评论次数，<b>用作特征</b>
     * @param CommentCnt 商品累计评论次数，<b>用作特征</b>
     */
    public void setCommentCnt(Long CommentCnt) {
        this.CommentCnt = CommentCnt;
    }

    /**
     * Get 商品累计分享次数，<b>用作特征</b> 
     * @return ShareCnt 商品累计分享次数，<b>用作特征</b>
     */
    public Long getShareCnt() {
        return this.ShareCnt;
    }

    /**
     * Set 商品累计分享次数，<b>用作特征</b>
     * @param ShareCnt 商品累计分享次数，<b>用作特征</b>
     */
    public void setShareCnt(Long ShareCnt) {
        this.ShareCnt = ShareCnt;
    }

    /**
     * Get 商品累计收藏次数，<b>用作特征</b> 
     * @return CollectCnt 商品累计收藏次数，<b>用作特征</b>
     */
    public Long getCollectCnt() {
        return this.CollectCnt;
    }

    /**
     * Set 商品累计收藏次数，<b>用作特征</b>
     * @param CollectCnt 商品累计收藏次数，<b>用作特征</b>
     */
    public void setCollectCnt(Long CollectCnt) {
        this.CollectCnt = CollectCnt;
    }

    /**
     * Get 商品累积成交次数，<b>用作特征</b> 
     * @return OrderCnt 商品累积成交次数，<b>用作特征</b>
     */
    public Long getOrderCnt() {
        return this.OrderCnt;
    }

    /**
     * Set 商品累积成交次数，<b>用作特征</b>
     * @param OrderCnt 商品累积成交次数，<b>用作特征</b>
     */
    public void setOrderCnt(Long OrderCnt) {
        this.OrderCnt = OrderCnt;
    }

    /**
     * Get 商品平均客户评分，取值范围用户自定，<b>用作特征</b> 
     * @return Score 商品平均客户评分，取值范围用户自定，<b>用作特征</b>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 商品平均客户评分，取值范围用户自定，<b>用作特征</b>
     * @param Score 商品平均客户评分，取值范围用户自定，<b>用作特征</b>
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

    public GoodsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsInfo(GoodsInfo source) {
        if (source.GoodsId != null) {
            this.GoodsId = new String(source.GoodsId);
        }
        if (source.GoodsType != null) {
            this.GoodsType = new String(source.GoodsType);
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
        if (source.SpuId != null) {
            this.SpuId = new String(source.SpuId);
        }
        if (source.CategoryLevel != null) {
            this.CategoryLevel = new Long(source.CategoryLevel);
        }
        if (source.CategoryPath != null) {
            this.CategoryPath = new String(source.CategoryPath);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.ShopId != null) {
            this.ShopId = new String(source.ShopId);
        }
        if (source.OrgPrice != null) {
            this.OrgPrice = new Float(source.OrgPrice);
        }
        if (source.CurPrice != null) {
            this.CurPrice = new Float(source.CurPrice);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ContentUrl != null) {
            this.ContentUrl = new String(source.ContentUrl);
        }
        if (source.PicUrlList != null) {
            this.PicUrlList = new String[source.PicUrlList.length];
            for (int i = 0; i < source.PicUrlList.length; i++) {
                this.PicUrlList[i] = new String(source.PicUrlList[i]);
            }
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
        if (source.FreeShipping != null) {
            this.FreeShipping = new Long(source.FreeShipping);
        }
        if (source.ShippingPrice != null) {
            this.ShippingPrice = new Float(source.ShippingPrice);
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
        if (source.CollectCnt != null) {
            this.CollectCnt = new Long(source.CollectCnt);
        }
        if (source.OrderCnt != null) {
            this.OrderCnt = new Long(source.OrderCnt);
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
        this.setParamSimple(map, prefix + "GoodsId", this.GoodsId);
        this.setParamSimple(map, prefix + "GoodsType", this.GoodsType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PublishTimestamp", this.PublishTimestamp);
        this.setParamSimple(map, prefix + "ExpireTimestamp", this.ExpireTimestamp);
        this.setParamSimple(map, prefix + "SpuId", this.SpuId);
        this.setParamSimple(map, prefix + "CategoryLevel", this.CategoryLevel);
        this.setParamSimple(map, prefix + "CategoryPath", this.CategoryPath);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "OrgPrice", this.OrgPrice);
        this.setParamSimple(map, prefix + "CurPrice", this.CurPrice);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ContentUrl", this.ContentUrl);
        this.setParamArraySimple(map, prefix + "PicUrlList.", this.PicUrlList);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "FreeShipping", this.FreeShipping);
        this.setParamSimple(map, prefix + "ShippingPrice", this.ShippingPrice);
        this.setParamSimple(map, prefix + "PraiseCnt", this.PraiseCnt);
        this.setParamSimple(map, prefix + "CommentCnt", this.CommentCnt);
        this.setParamSimple(map, prefix + "ShareCnt", this.ShareCnt);
        this.setParamSimple(map, prefix + "CollectCnt", this.CollectCnt);
        this.setParamSimple(map, prefix + "OrderCnt", this.OrderCnt);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

