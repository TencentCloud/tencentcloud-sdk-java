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
    * <p>知识库id</p>
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * <p>知识库名称</p>
    */
    @SerializedName("KnowledgeBaseName")
    @Expose
    private String KnowledgeBaseName;

    /**
    * <p>知识库描述</p>
    */
    @SerializedName("KnowledgeBaseDesc")
    @Expose
    private String KnowledgeBaseDesc;

    /**
    * <p>创建者subuin</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>文件数量</p>
    */
    @SerializedName("FileNum")
    @Expose
    private Long FileNum;

    /**
    * <p>知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展</p>
    */
    @SerializedName("DatasourceIds")
    @Expose
    private String [] DatasourceIds;

    /**
    * <p>知识库任务配置</p>
    */
    @SerializedName("Config")
    @Expose
    private KnowledgeTaskConfig Config;

    /**
     * Get <p>知识库id</p> 
     * @return KnowledgeBaseId <p>知识库id</p>
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set <p>知识库id</p>
     * @param KnowledgeBaseId <p>知识库id</p>
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get <p>知识库名称</p> 
     * @return KnowledgeBaseName <p>知识库名称</p>
     */
    public String getKnowledgeBaseName() {
        return this.KnowledgeBaseName;
    }

    /**
     * Set <p>知识库名称</p>
     * @param KnowledgeBaseName <p>知识库名称</p>
     */
    public void setKnowledgeBaseName(String KnowledgeBaseName) {
        this.KnowledgeBaseName = KnowledgeBaseName;
    }

    /**
     * Get <p>知识库描述</p> 
     * @return KnowledgeBaseDesc <p>知识库描述</p>
     */
    public String getKnowledgeBaseDesc() {
        return this.KnowledgeBaseDesc;
    }

    /**
     * Set <p>知识库描述</p>
     * @param KnowledgeBaseDesc <p>知识库描述</p>
     */
    public void setKnowledgeBaseDesc(String KnowledgeBaseDesc) {
        this.KnowledgeBaseDesc = KnowledgeBaseDesc;
    }

    /**
     * Get <p>创建者subuin</p> 
     * @return Creator <p>创建者subuin</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建者subuin</p>
     * @param Creator <p>创建者subuin</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>文件数量</p> 
     * @return FileNum <p>文件数量</p>
     */
    public Long getFileNum() {
        return this.FileNum;
    }

    /**
     * Set <p>文件数量</p>
     * @param FileNum <p>文件数量</p>
     */
    public void setFileNum(Long FileNum) {
        this.FileNum = FileNum;
    }

    /**
     * Get <p>知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展</p> 
     * @return DatasourceIds <p>知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展</p>
     */
    public String [] getDatasourceIds() {
        return this.DatasourceIds;
    }

    /**
     * Set <p>知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展</p>
     * @param DatasourceIds <p>知识库关联的数据库列表，目前是只绑定一个数据源，数组预留拓展</p>
     */
    public void setDatasourceIds(String [] DatasourceIds) {
        this.DatasourceIds = DatasourceIds;
    }

    /**
     * Get <p>知识库任务配置</p> 
     * @return Config <p>知识库任务配置</p>
     */
    public KnowledgeTaskConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>知识库任务配置</p>
     * @param Config <p>知识库任务配置</p>
     */
    public void setConfig(KnowledgeTaskConfig Config) {
        this.Config = Config;
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
        if (source.Config != null) {
            this.Config = new KnowledgeTaskConfig(source.Config);
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
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

