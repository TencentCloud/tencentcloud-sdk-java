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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKnowledgeSetRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

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
    * 知识库的meta信息
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

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

    public CreateKnowledgeSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKnowledgeSetRequest(CreateKnowledgeSetRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Meta != null) {
            this.Meta = new String(source.Meta);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Meta", this.Meta);

    }
}

