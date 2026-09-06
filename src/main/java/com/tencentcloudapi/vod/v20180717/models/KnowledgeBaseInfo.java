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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeBaseInfo extends AbstractModel {

    /**
    * <p>知识库ID。</p>
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * <p>知识库名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>知识库描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>知识库状态。</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>active： 正常</li><li>deleting： 删除中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>知识库创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>知识库ID。</p> 
     * @return KnowledgeBaseId <p>知识库ID。</p>
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set <p>知识库ID。</p>
     * @param KnowledgeBaseId <p>知识库ID。</p>
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get <p>知识库名称。</p> 
     * @return Name <p>知识库名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>知识库名称。</p>
     * @param Name <p>知识库名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>知识库描述。</p> 
     * @return Description <p>知识库描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>知识库描述。</p>
     * @param Description <p>知识库描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>知识库状态。</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>active： 正常</li><li>deleting： 删除中</li></ul> 
     * @return Status <p>知识库状态。</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>active： 正常</li><li>deleting： 删除中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>知识库状态。</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>active： 正常</li><li>deleting： 删除中</li></ul>
     * @param Status <p>知识库状态。</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>active： 正常</li><li>deleting： 删除中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>知识库创建时间。</p> 
     * @return CreateTime <p>知识库创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>知识库创建时间。</p>
     * @param CreateTime <p>知识库创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public KnowledgeBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeBaseInfo(KnowledgeBaseInfo source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

