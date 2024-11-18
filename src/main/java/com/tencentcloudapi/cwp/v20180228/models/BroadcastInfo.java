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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BroadcastInfo extends AbstractModel {

    /**
    * 文章名字
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 跳转位置：0=不跳转，1=文件查杀，2=漏洞扫描，3=安全基线
    */
    @SerializedName("GotoType")
    @Expose
    private Long GotoType;

    /**
    * 副标题
    */
    @SerializedName("Subtitle")
    @Expose
    private String Subtitle;

    /**
    * 发布时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 富文本内容信息
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 文章唯一Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 文章名字 
     * @return Title 文章名字
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 文章名字
     * @param Title 文章名字
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 跳转位置：0=不跳转，1=文件查杀，2=漏洞扫描，3=安全基线 
     * @return GotoType 跳转位置：0=不跳转，1=文件查杀，2=漏洞扫描，3=安全基线
     */
    public Long getGotoType() {
        return this.GotoType;
    }

    /**
     * Set 跳转位置：0=不跳转，1=文件查杀，2=漏洞扫描，3=安全基线
     * @param GotoType 跳转位置：0=不跳转，1=文件查杀，2=漏洞扫描，3=安全基线
     */
    public void setGotoType(Long GotoType) {
        this.GotoType = GotoType;
    }

    /**
     * Get 副标题 
     * @return Subtitle 副标题
     */
    public String getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set 副标题
     * @param Subtitle 副标题
     */
    public void setSubtitle(String Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * Get 发布时间 
     * @return CreateTime 发布时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 发布时间
     * @param CreateTime 发布时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 富文本内容信息 
     * @return Content 富文本内容信息
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 富文本内容信息
     * @param Content 富文本内容信息
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 文章唯一Id 
     * @return Id 文章唯一Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 文章唯一Id
     * @param Id 文章唯一Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布 
     * @return Type 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布
     * @param Type 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public BroadcastInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BroadcastInfo(BroadcastInfo source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.GotoType != null) {
            this.GotoType = new Long(source.GotoType);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new String(source.Subtitle);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "GotoType", this.GotoType);
        this.setParamSimple(map, prefix + "Subtitle", this.Subtitle);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

