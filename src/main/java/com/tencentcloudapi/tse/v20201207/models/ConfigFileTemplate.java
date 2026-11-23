/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    * <p>配置文件模板id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>配置文件模板名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>配置文件模板内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>配置文件模板格式</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>配置文件模板注释</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>配置文件模板创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>配置文件模板创建者</p>
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * <p>配置文件模板修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>配置文件模板修改者</p>
    */
    @SerializedName("ModifyBy")
    @Expose
    private String ModifyBy;

    /**
     * Get <p>配置文件模板id</p> 
     * @return Id <p>配置文件模板id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>配置文件模板id</p>
     * @param Id <p>配置文件模板id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>配置文件模板名称</p> 
     * @return Name <p>配置文件模板名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>配置文件模板名称</p>
     * @param Name <p>配置文件模板名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>配置文件模板内容</p> 
     * @return Content <p>配置文件模板内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>配置文件模板内容</p>
     * @param Content <p>配置文件模板内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>配置文件模板格式</p> 
     * @return Format <p>配置文件模板格式</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>配置文件模板格式</p>
     * @param Format <p>配置文件模板格式</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>配置文件模板注释</p> 
     * @return Comment <p>配置文件模板注释</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>配置文件模板注释</p>
     * @param Comment <p>配置文件模板注释</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>配置文件模板创建时间</p> 
     * @return CreateTime <p>配置文件模板创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>配置文件模板创建时间</p>
     * @param CreateTime <p>配置文件模板创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>配置文件模板创建者</p> 
     * @return CreateBy <p>配置文件模板创建者</p>
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set <p>配置文件模板创建者</p>
     * @param CreateBy <p>配置文件模板创建者</p>
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get <p>配置文件模板修改时间</p> 
     * @return ModifyTime <p>配置文件模板修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>配置文件模板修改时间</p>
     * @param ModifyTime <p>配置文件模板修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>配置文件模板修改者</p> 
     * @return ModifyBy <p>配置文件模板修改者</p>
     */
    public String getModifyBy() {
        return this.ModifyBy;
    }

    /**
     * Set <p>配置文件模板修改者</p>
     * @param ModifyBy <p>配置文件模板修改者</p>
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

