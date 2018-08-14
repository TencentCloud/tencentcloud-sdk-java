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

public class IndustryNews  extends AbstractModel{

    /**
    * 行业报道ID
    */
    @SerializedName("IndustryId")
    @Expose
    private String IndustryId;

    /**
    * 报道发表时间
    */
    @SerializedName("PubTime")
    @Expose
    private String PubTime;

    /**
    * 报道来源
    */
    @SerializedName("FromSite")
    @Expose
    private String FromSite;

    /**
    * 报道标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 报道来源url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 报道来源等级
    */
    @SerializedName("Level")
    @Expose
    private Integer Level;

    /**
    * 热度值
    */
    @SerializedName("Hot")
    @Expose
    private Integer Hot;

    /**
    * 报道标识
    */
    @SerializedName("Flag")
    @Expose
    private Integer Flag;

    /**
    * 报道摘要
    */
    @SerializedName("Abstract")
    @Expose
    private String Abstract;

    /**
     * 获取行业报道ID
     * @return IndustryId 行业报道ID
     */
    public String getIndustryId() {
        return this.IndustryId;
    }

    /**
     * 设置行业报道ID
     * @param IndustryId 行业报道ID
     */
    public void setIndustryId(String IndustryId) {
        this.IndustryId = IndustryId;
    }

    /**
     * 获取报道发表时间
     * @return PubTime 报道发表时间
     */
    public String getPubTime() {
        return this.PubTime;
    }

    /**
     * 设置报道发表时间
     * @param PubTime 报道发表时间
     */
    public void setPubTime(String PubTime) {
        this.PubTime = PubTime;
    }

    /**
     * 获取报道来源
     * @return FromSite 报道来源
     */
    public String getFromSite() {
        return this.FromSite;
    }

    /**
     * 设置报道来源
     * @param FromSite 报道来源
     */
    public void setFromSite(String FromSite) {
        this.FromSite = FromSite;
    }

    /**
     * 获取报道标题
     * @return Title 报道标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * 设置报道标题
     * @param Title 报道标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * 获取报道来源url
     * @return Url 报道来源url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置报道来源url
     * @param Url 报道来源url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取报道来源等级
     * @return Level 报道来源等级
     */
    public Integer getLevel() {
        return this.Level;
    }

    /**
     * 设置报道来源等级
     * @param Level 报道来源等级
     */
    public void setLevel(Integer Level) {
        this.Level = Level;
    }

    /**
     * 获取热度值
     * @return Hot 热度值
     */
    public Integer getHot() {
        return this.Hot;
    }

    /**
     * 设置热度值
     * @param Hot 热度值
     */
    public void setHot(Integer Hot) {
        this.Hot = Hot;
    }

    /**
     * 获取报道标识
     * @return Flag 报道标识
     */
    public Integer getFlag() {
        return this.Flag;
    }

    /**
     * 设置报道标识
     * @param Flag 报道标识
     */
    public void setFlag(Integer Flag) {
        this.Flag = Flag;
    }

    /**
     * 获取报道摘要
     * @return Abstract 报道摘要
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * 设置报道摘要
     * @param Abstract 报道摘要
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndustryId", this.IndustryId);
        this.setParamSimple(map, prefix + "PubTime", this.PubTime);
        this.setParamSimple(map, prefix + "FromSite", this.FromSite);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Hot", this.Hot);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Abstract", this.Abstract);

    }
}

