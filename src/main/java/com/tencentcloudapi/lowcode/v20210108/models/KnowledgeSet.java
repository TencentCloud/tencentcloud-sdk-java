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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeSet extends AbstractModel {

    /**
    * 知识库标识
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 知识库名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 状态，
NOT_ENABLED未启用
ENABLED 已启用
    */
    @SerializedName("Active")
    @Expose
    private String Active;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 知识库的meta信息
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
    * 知识库容量,单位字节
    */
    @SerializedName("TotalSize")
    @Expose
    private String TotalSize;

    /**
     * Get 知识库标识 
     * @return Name 知识库标识
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 知识库标识
     * @param Name 知识库标识
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 知识库名称 
     * @return Title 知识库名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 知识库名称
     * @param Title 知识库名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 状态，
NOT_ENABLED未启用
ENABLED 已启用 
     * @return Active 状态，
NOT_ENABLED未启用
ENABLED 已启用
     */
    public String getActive() {
        return this.Active;
    }

    /**
     * Set 状态，
NOT_ENABLED未启用
ENABLED 已启用
     * @param Active 状态，
NOT_ENABLED未启用
ENABLED 已启用
     */
    public void setActive(String Active) {
        this.Active = Active;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 知识库的meta信息 
     * @return Meta 知识库的meta信息
     */
    public String getMeta() {
        return this.Meta;
    }

    /**
     * Set 知识库的meta信息
     * @param Meta 知识库的meta信息
     */
    public void setMeta(String Meta) {
        this.Meta = Meta;
    }

    /**
     * Get 知识库容量,单位字节 
     * @return TotalSize 知识库容量,单位字节
     */
    public String getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 知识库容量,单位字节
     * @param TotalSize 知识库容量,单位字节
     */
    public void setTotalSize(String TotalSize) {
        this.TotalSize = TotalSize;
    }

    public KnowledgeSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeSet(KnowledgeSet source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Active != null) {
            this.Active = new String(source.Active);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Meta != null) {
            this.Meta = new String(source.Meta);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new String(source.TotalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Meta", this.Meta);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

