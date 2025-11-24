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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessImageTemplate extends AbstractModel {

    /**
    * 图片处理模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 图片处理模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 图片处理模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 模板类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 图片处理模板配置参数。
    */
    @SerializedName("ProcessImageConfig")
    @Expose
    private ImageTaskInput ProcessImageConfig;

    /**
    * 模板创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 图片处理模板唯一标识。 
     * @return Definition 图片处理模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 图片处理模板唯一标识。
     * @param Definition 图片处理模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 图片处理模板名称。 
     * @return Name 图片处理模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 图片处理模板名称。
     * @param Name 图片处理模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 图片处理模板描述信息。 
     * @return Comment 图片处理模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 图片处理模板描述信息。
     * @param Comment 图片处理模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 模板类型。 
     * @return Type 模板类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型。
     * @param Type 模板类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 图片处理模板配置参数。 
     * @return ProcessImageConfig 图片处理模板配置参数。
     */
    public ImageTaskInput getProcessImageConfig() {
        return this.ProcessImageConfig;
    }

    /**
     * Set 图片处理模板配置参数。
     * @param ProcessImageConfig 图片处理模板配置参数。
     */
    public void setProcessImageConfig(ImageTaskInput ProcessImageConfig) {
        this.ProcessImageConfig = ProcessImageConfig;
    }

    /**
     * Get 模板创建时间。 
     * @return CreateTime 模板创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间。
     * @param CreateTime 模板创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间。 
     * @return UpdateTime 模板最后修改时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间。
     * @param UpdateTime 模板最后修改时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ProcessImageTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageTemplate(ProcessImageTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProcessImageConfig != null) {
            this.ProcessImageConfig = new ImageTaskInput(source.ProcessImageConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ProcessImageConfig.", this.ProcessImageConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

