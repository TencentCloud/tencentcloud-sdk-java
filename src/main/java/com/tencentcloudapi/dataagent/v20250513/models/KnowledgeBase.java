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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeBase extends AbstractModel {

    /**
    * 知识库id
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 知识库名称

    */
    @SerializedName("KnowledgeBaseName")
    @Expose
    private String KnowledgeBaseName;

    /**
    * 知识库描述
    */
    @SerializedName("KnowledgeBaseDesc")
    @Expose
    private String KnowledgeBaseDesc;

    /**
    * 创建者subuin
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文件数量
    */
    @SerializedName("FileNum")
    @Expose
    private Long FileNum;

    /**
    * 知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展
    */
    @SerializedName("DatasourceIds")
    @Expose
    private String [] DatasourceIds;

    /**
     * Get 知识库id 
     * @return KnowledgeBaseId 知识库id
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 知识库id
     * @param KnowledgeBaseId 知识库id
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get 知识库名称
 
     * @return KnowledgeBaseName 知识库名称

     */
    public String getKnowledgeBaseName() {
        return this.KnowledgeBaseName;
    }

    /**
     * Set 知识库名称

     * @param KnowledgeBaseName 知识库名称

     */
    public void setKnowledgeBaseName(String KnowledgeBaseName) {
        this.KnowledgeBaseName = KnowledgeBaseName;
    }

    /**
     * Get 知识库描述 
     * @return KnowledgeBaseDesc 知识库描述
     */
    public String getKnowledgeBaseDesc() {
        return this.KnowledgeBaseDesc;
    }

    /**
     * Set 知识库描述
     * @param KnowledgeBaseDesc 知识库描述
     */
    public void setKnowledgeBaseDesc(String KnowledgeBaseDesc) {
        this.KnowledgeBaseDesc = KnowledgeBaseDesc;
    }

    /**
     * Get 创建者subuin 
     * @return Creator 创建者subuin
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者subuin
     * @param Creator 创建者subuin
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
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
     * Get 文件数量 
     * @return FileNum 文件数量
     */
    public Long getFileNum() {
        return this.FileNum;
    }

    /**
     * Set 文件数量
     * @param FileNum 文件数量
     */
    public void setFileNum(Long FileNum) {
        this.FileNum = FileNum;
    }

    /**
     * Get 知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展 
     * @return DatasourceIds 知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展
     */
    public String [] getDatasourceIds() {
        return this.DatasourceIds;
    }

    /**
     * Set 知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展
     * @param DatasourceIds 知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展
     */
    public void setDatasourceIds(String [] DatasourceIds) {
        this.DatasourceIds = DatasourceIds;
    }

    public KnowledgeBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeBase(KnowledgeBase source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.KnowledgeBaseName != null) {
            this.KnowledgeBaseName = new String(source.KnowledgeBaseName);
        }
        if (source.KnowledgeBaseDesc != null) {
            this.KnowledgeBaseDesc = new String(source.KnowledgeBaseDesc);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FileNum != null) {
            this.FileNum = new Long(source.FileNum);
        }
        if (source.DatasourceIds != null) {
            this.DatasourceIds = new String[source.DatasourceIds.length];
            for (int i = 0; i < source.DatasourceIds.length; i++) {
                this.DatasourceIds[i] = new String(source.DatasourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "KnowledgeBaseName", this.KnowledgeBaseName);
        this.setParamSimple(map, prefix + "KnowledgeBaseDesc", this.KnowledgeBaseDesc);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FileNum", this.FileNum);
        this.setParamArraySimple(map, prefix + "DatasourceIds.", this.DatasourceIds);

    }
}

