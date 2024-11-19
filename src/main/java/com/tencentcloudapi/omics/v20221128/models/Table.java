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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Table extends AbstractModel {

    /**
    * 表格ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 关联项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 表格名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 表格描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 表格列
    */
    @SerializedName("Columns")
    @Expose
    private TableColumn [] Columns;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建人ID
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
     * Get 表格ID 
     * @return TableId 表格ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表格ID
     * @param TableId 表格ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 关联项目ID 
     * @return ProjectId 关联项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 关联项目ID
     * @param ProjectId 关联项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 表格名称 
     * @return Name 表格名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表格名称
     * @param Name 表格名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 表格描述 
     * @return Description 表格描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 表格描述
     * @param Description 表格描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 表格列 
     * @return Columns 表格列
     */
    public TableColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 表格列
     * @param Columns 表格列
     */
    public void setColumns(TableColumn [] Columns) {
        this.Columns = Columns;
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
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建人ID 
     * @return CreatorId 创建人ID
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建人ID
     * @param CreatorId 创建人ID
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    public Table() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Table(Table source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Columns != null) {
            this.Columns = new TableColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new TableColumn(source.Columns[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);

    }
}

