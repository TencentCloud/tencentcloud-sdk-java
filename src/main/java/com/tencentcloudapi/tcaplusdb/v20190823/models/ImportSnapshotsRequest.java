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

public class ImportSnapshotsRequest extends AbstractModel{

    /**
    * 表格所属的集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 用于导入的快照信息
    */
    @SerializedName("Snapshots")
    @Expose
    private SnapshotInfo Snapshots;

    /**
    * 是否导入部分记录，TRUE表示导入部分记录，FALSE表示全表导入
    */
    @SerializedName("ImportSpecialKey")
    @Expose
    private String ImportSpecialKey;

    /**
    * 是否导入到当前表，TRUE表示导入到当前表，FALSE表示导入到新表
    */
    @SerializedName("ImportOriginTable")
    @Expose
    private String ImportOriginTable;

    /**
    * 部分记录的key文件
    */
    @SerializedName("KeyFile")
    @Expose
    private KeyFile KeyFile;

    /**
    * 如果导入到新表，此为新表所属的表格组id
    */
    @SerializedName("NewTableGroupId")
    @Expose
    private String NewTableGroupId;

    /**
    * 如果导入到新表，此为新表的表名，系统会以该名称自动创建一张结构相同的空表
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
     * Get 表格所属的集群id 
     * @return ClusterId 表格所属的集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 表格所属的集群id
     * @param ClusterId 表格所属的集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 用于导入的快照信息 
     * @return Snapshots 用于导入的快照信息
     */
    public SnapshotInfo getSnapshots() {
        return this.Snapshots;
    }

    /**
     * Set 用于导入的快照信息
     * @param Snapshots 用于导入的快照信息
     */
    public void setSnapshots(SnapshotInfo Snapshots) {
        this.Snapshots = Snapshots;
    }

    /**
     * Get 是否导入部分记录，TRUE表示导入部分记录，FALSE表示全表导入 
     * @return ImportSpecialKey 是否导入部分记录，TRUE表示导入部分记录，FALSE表示全表导入
     */
    public String getImportSpecialKey() {
        return this.ImportSpecialKey;
    }

    /**
     * Set 是否导入部分记录，TRUE表示导入部分记录，FALSE表示全表导入
     * @param ImportSpecialKey 是否导入部分记录，TRUE表示导入部分记录，FALSE表示全表导入
     */
    public void setImportSpecialKey(String ImportSpecialKey) {
        this.ImportSpecialKey = ImportSpecialKey;
    }

    /**
     * Get 是否导入到当前表，TRUE表示导入到当前表，FALSE表示导入到新表 
     * @return ImportOriginTable 是否导入到当前表，TRUE表示导入到当前表，FALSE表示导入到新表
     */
    public String getImportOriginTable() {
        return this.ImportOriginTable;
    }

    /**
     * Set 是否导入到当前表，TRUE表示导入到当前表，FALSE表示导入到新表
     * @param ImportOriginTable 是否导入到当前表，TRUE表示导入到当前表，FALSE表示导入到新表
     */
    public void setImportOriginTable(String ImportOriginTable) {
        this.ImportOriginTable = ImportOriginTable;
    }

    /**
     * Get 部分记录的key文件 
     * @return KeyFile 部分记录的key文件
     */
    public KeyFile getKeyFile() {
        return this.KeyFile;
    }

    /**
     * Set 部分记录的key文件
     * @param KeyFile 部分记录的key文件
     */
    public void setKeyFile(KeyFile KeyFile) {
        this.KeyFile = KeyFile;
    }

    /**
     * Get 如果导入到新表，此为新表所属的表格组id 
     * @return NewTableGroupId 如果导入到新表，此为新表所属的表格组id
     */
    public String getNewTableGroupId() {
        return this.NewTableGroupId;
    }

    /**
     * Set 如果导入到新表，此为新表所属的表格组id
     * @param NewTableGroupId 如果导入到新表，此为新表所属的表格组id
     */
    public void setNewTableGroupId(String NewTableGroupId) {
        this.NewTableGroupId = NewTableGroupId;
    }

    /**
     * Get 如果导入到新表，此为新表的表名，系统会以该名称自动创建一张结构相同的空表 
     * @return NewTableName 如果导入到新表，此为新表的表名，系统会以该名称自动创建一张结构相同的空表
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set 如果导入到新表，此为新表的表名，系统会以该名称自动创建一张结构相同的空表
     * @param NewTableName 如果导入到新表，此为新表的表名，系统会以该名称自动创建一张结构相同的空表
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    public ImportSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportSnapshotsRequest(ImportSnapshotsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Snapshots != null) {
            this.Snapshots = new SnapshotInfo(source.Snapshots);
        }
        if (source.ImportSpecialKey != null) {
            this.ImportSpecialKey = new String(source.ImportSpecialKey);
        }
        if (source.ImportOriginTable != null) {
            this.ImportOriginTable = new String(source.ImportOriginTable);
        }
        if (source.KeyFile != null) {
            this.KeyFile = new KeyFile(source.KeyFile);
        }
        if (source.NewTableGroupId != null) {
            this.NewTableGroupId = new String(source.NewTableGroupId);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Snapshots.", this.Snapshots);
        this.setParamSimple(map, prefix + "ImportSpecialKey", this.ImportSpecialKey);
        this.setParamSimple(map, prefix + "ImportOriginTable", this.ImportOriginTable);
        this.setParamObj(map, prefix + "KeyFile.", this.KeyFile);
        this.setParamSimple(map, prefix + "NewTableGroupId", this.NewTableGroupId);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);

    }
}

