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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTablesRequest extends AbstractModel{

    /**
    * 待创建表格所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 用户选定的建表格IDL文件列表
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * 待创建表格信息列表
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfoNew [] SelectedTables;

    /**
    * 表格标签列表
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfoUnit [] ResourceTags;

    /**
     * Get 待创建表格所属集群ID 
     * @return ClusterId 待创建表格所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 待创建表格所属集群ID
     * @param ClusterId 待创建表格所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 用户选定的建表格IDL文件列表 
     * @return IdlFiles 用户选定的建表格IDL文件列表
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * Set 用户选定的建表格IDL文件列表
     * @param IdlFiles 用户选定的建表格IDL文件列表
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * Get 待创建表格信息列表 
     * @return SelectedTables 待创建表格信息列表
     */
    public SelectedTableInfoNew [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set 待创建表格信息列表
     * @param SelectedTables 待创建表格信息列表
     */
    public void setSelectedTables(SelectedTableInfoNew [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * Get 表格标签列表 
     * @return ResourceTags 表格标签列表
     */
    public TagInfoUnit [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 表格标签列表
     * @param ResourceTags 表格标签列表
     */
    public void setResourceTags(TagInfoUnit [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "IdlFiles.", this.IdlFiles);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

