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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigFileTemplate extends AbstractModel {

    /**
    * 配置文件模板id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 配置文件模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 配置文件模板内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 配置文件模板格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 配置文件模板注释
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 配置文件模板创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 配置文件模板创建者
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * 配置文件模板修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 配置文件模板修改者
    */
    @SerializedName("ModifyBy")
    @Expose
    private String ModifyBy;

    /**
     * Get 配置文件模板id 
     * @return Id 配置文件模板id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 配置文件模板id
     * @param Id 配置文件模板id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 配置文件模板名称 
     * @return Name 配置文件模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置文件模板名称
     * @param Name 配置文件模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 配置文件模板内容 
     * @return Content 配置文件模板内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 配置文件模板内容
     * @param Content 配置文件模板内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 配置文件模板格式 
     * @return Format 配置文件模板格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 配置文件模板格式
     * @param Format 配置文件模板格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 配置文件模板注释 
     * @return Comment 配置文件模板注释
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 配置文件模板注释
     * @param Comment 配置文件模板注释
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 配置文件模板创建时间 
     * @return CreateTime 配置文件模板创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 配置文件模板创建时间
     * @param CreateTime 配置文件模板创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 配置文件模板创建者 
     * @return CreateBy 配置文件模板创建者
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set 配置文件模板创建者
     * @param CreateBy 配置文件模板创建者
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get 配置文件模板修改时间 
     * @return ModifyTime 配置文件模板修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 配置文件模板修改时间
     * @param ModifyTime 配置文件模板修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 配置文件模板修改者 
     * @return ModifyBy 配置文件模板修改者
     */
    public String getModifyBy() {
        return this.ModifyBy;
    }

    /**
     * Set 配置文件模板修改者
     * @param ModifyBy 配置文件模板修改者
     */
    public void setModifyBy(String ModifyBy) {
        this.ModifyBy = ModifyBy;
    }

    public ConfigFileTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigFileTemplate(ConfigFileTemplate source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreateBy != null) {
            this.CreateBy = new String(source.CreateBy);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ModifyBy != null) {
            this.ModifyBy = new String(source.ModifyBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ModifyBy", this.ModifyBy);

    }
}

