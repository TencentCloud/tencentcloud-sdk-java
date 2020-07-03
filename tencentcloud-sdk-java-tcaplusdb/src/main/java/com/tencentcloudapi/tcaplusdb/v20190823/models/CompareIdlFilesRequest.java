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

public class CompareIdlFilesRequest extends AbstractModel{

    /**
    * 待修改表格所在集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 待修改表格列表
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfoNew [] SelectedTables;

    /**
    * 选中的已上传IDL文件列表，与NewIdlFiles必选其一
    */
    @SerializedName("ExistingIdlFiles")
    @Expose
    private IdlFileInfo [] ExistingIdlFiles;

    /**
    * 本次上传IDL文件列表，与ExistingIdlFiles必选其一
    */
    @SerializedName("NewIdlFiles")
    @Expose
    private IdlFileInfo [] NewIdlFiles;

    /**
     * Get 待修改表格所在集群ID 
     * @return ClusterId 待修改表格所在集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 待修改表格所在集群ID
     * @param ClusterId 待修改表格所在集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 待修改表格列表 
     * @return SelectedTables 待修改表格列表
     */
    public SelectedTableInfoNew [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set 待修改表格列表
     * @param SelectedTables 待修改表格列表
     */
    public void setSelectedTables(SelectedTableInfoNew [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * Get 选中的已上传IDL文件列表，与NewIdlFiles必选其一 
     * @return ExistingIdlFiles 选中的已上传IDL文件列表，与NewIdlFiles必选其一
     */
    public IdlFileInfo [] getExistingIdlFiles() {
        return this.ExistingIdlFiles;
    }

    /**
     * Set 选中的已上传IDL文件列表，与NewIdlFiles必选其一
     * @param ExistingIdlFiles 选中的已上传IDL文件列表，与NewIdlFiles必选其一
     */
    public void setExistingIdlFiles(IdlFileInfo [] ExistingIdlFiles) {
        this.ExistingIdlFiles = ExistingIdlFiles;
    }

    /**
     * Get 本次上传IDL文件列表，与ExistingIdlFiles必选其一 
     * @return NewIdlFiles 本次上传IDL文件列表，与ExistingIdlFiles必选其一
     */
    public IdlFileInfo [] getNewIdlFiles() {
        return this.NewIdlFiles;
    }

    /**
     * Set 本次上传IDL文件列表，与ExistingIdlFiles必选其一
     * @param NewIdlFiles 本次上传IDL文件列表，与ExistingIdlFiles必选其一
     */
    public void setNewIdlFiles(IdlFileInfo [] NewIdlFiles) {
        this.NewIdlFiles = NewIdlFiles;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamArrayObj(map, prefix + "ExistingIdlFiles.", this.ExistingIdlFiles);
        this.setParamArrayObj(map, prefix + "NewIdlFiles.", this.NewIdlFiles);

    }
}

