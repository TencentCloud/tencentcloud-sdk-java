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

public class IndustryNews extends AbstractModel{

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
    private Long Level;

    /**
    * 热度值
    */
    @SerializedName("Hot")
    @Expose
    private Long Hot;

    /**
    * 报道标识
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * 报道摘要
    */
    @SerializedName("Abstract")
    @Expose
    private String Abstract;

    /**
     * Get 行业报道ID 
     * @return IndustryId 行业报道ID
     */
    public String getIndustryId() {
        return this.IndustryId;
    }

    /**
     * Set 行业报道ID
     * @param IndustryId 行业报道ID
     */
    public void setIndustryId(String IndustryId) {
        this.IndustryId = IndustryId;
    }

    /**
     * Get 报道发表时间 
     * @return PubTime 报道发表时间
     */
    public String getPubTime() {
        return this.PubTime;
    }

    /**
     * Set 报道发表时间
     * @param PubTime 报道发表时间
     */
    public void setPubTime(String PubTime) {
        this.PubTime = PubTime;
    }

    /**
     * Get 报道来源 
     * @return FromSite 报道来源
     */
    public String getFromSite() {
        return this.FromSite;
    }

    /**
     * Set 报道来源
     * @param FromSite 报道来源
     */
    public void setFromSite(String FromSite) {
        this.FromSite = FromSite;
    }

    /**
     * Get 报道标题 
     * @return Title 报道标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 报道标题
     * @param Title 报道标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 报道来源url 
     * @return Url 报道来源url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 报道来源url
     * @param Url 报道来源url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 报道来源等级 
     * @return Level 报道来源等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 报道来源等级
     * @param Level 报道来源等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 热度值 
     * @return Hot 热度值
     */
    public Long getHot() {
        return this.Hot;
    }

    /**
     * Set 热度值
     * @param Hot 热度值
     */
    public void setHot(Long Hot) {
        this.Hot = Hot;
    }

    /**
     * Get 报道标识 
     * @return Flag 报道标识
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 报道标识
     * @param Flag 报道标识
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 报道摘要 
     * @return Abstract 报道摘要
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * Set 报道摘要
     * @param Abstract 报道摘要
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    /**
     * Internal implementation, normal users should not use it.
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

