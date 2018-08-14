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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BrandReportArticle  extends AbstractModel{

    /**
    * 文章标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 文章url地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 文章来源
    */
    @SerializedName("FromSite")
    @Expose
    private String FromSite;

    /**
    * 文章发表日期
    */
    @SerializedName("PubTime")
    @Expose
    private String PubTime;

    /**
    * 文章标识
    */
    @SerializedName("Flag")
    @Expose
    private Integer Flag;

    /**
    * 文章热度值
    */
    @SerializedName("Hot")
    @Expose
    private Integer Hot;

    /**
    * 文章来源等级
    */
    @SerializedName("Level")
    @Expose
    private Integer Level;

    /**
    * 文章摘要
    */
    @SerializedName("Abstract")
    @Expose
    private String Abstract;

    /**
    * 文章ID
    */
    @SerializedName("ArticleId")
    @Expose
    private String ArticleId;

    /**
     * 获取文章标题
     * @return Title 文章标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * 设置文章标题
     * @param Title 文章标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * 获取文章url地址
     * @return Url 文章url地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置文章url地址
     * @param Url 文章url地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取文章来源
     * @return FromSite 文章来源
     */
    public String getFromSite() {
        return this.FromSite;
    }

    /**
     * 设置文章来源
     * @param FromSite 文章来源
     */
    public void setFromSite(String FromSite) {
        this.FromSite = FromSite;
    }

    /**
     * 获取文章发表日期
     * @return PubTime 文章发表日期
     */
    public String getPubTime() {
        return this.PubTime;
    }

    /**
     * 设置文章发表日期
     * @param PubTime 文章发表日期
     */
    public void setPubTime(String PubTime) {
        this.PubTime = PubTime;
    }

    /**
     * 获取文章标识
     * @return Flag 文章标识
     */
    public Integer getFlag() {
        return this.Flag;
    }

    /**
     * 设置文章标识
     * @param Flag 文章标识
     */
    public void setFlag(Integer Flag) {
        this.Flag = Flag;
    }

    /**
     * 获取文章热度值
     * @return Hot 文章热度值
     */
    public Integer getHot() {
        return this.Hot;
    }

    /**
     * 设置文章热度值
     * @param Hot 文章热度值
     */
    public void setHot(Integer Hot) {
        this.Hot = Hot;
    }

    /**
     * 获取文章来源等级
     * @return Level 文章来源等级
     */
    public Integer getLevel() {
        return this.Level;
    }

    /**
     * 设置文章来源等级
     * @param Level 文章来源等级
     */
    public void setLevel(Integer Level) {
        this.Level = Level;
    }

    /**
     * 获取文章摘要
     * @return Abstract 文章摘要
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * 设置文章摘要
     * @param Abstract 文章摘要
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    /**
     * 获取文章ID
     * @return ArticleId 文章ID
     */
    public String getArticleId() {
        return this.ArticleId;
    }

    /**
     * 设置文章ID
     * @param ArticleId 文章ID
     */
    public void setArticleId(String ArticleId) {
        this.ArticleId = ArticleId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FromSite", this.FromSite);
        this.setParamSimple(map, prefix + "PubTime", this.PubTime);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Hot", this.Hot);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Abstract", this.Abstract);
        this.setParamSimple(map, prefix + "ArticleId", this.ArticleId);

    }
}

