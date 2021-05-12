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

public class SnapshotInfoNew extends AbstractModel{

    /**
    * 所属表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照过期时间点
    */
    @SerializedName("SnapshotDeadTime")
    @Expose
    private String SnapshotDeadTime;

    /**
     * Get 所属表格组ID 
     * @return TableGroupId 所属表格组ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 所属表格组ID
     * @param TableGroupId 所属表格组ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 快照名称 
     * @return SnapshotName 快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称
     * @param SnapshotName 快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 快照过期时间点 
     * @return SnapshotDeadTime 快照过期时间点
     */
    public String getSnapshotDeadTime() {
        return this.SnapshotDeadTime;
    }

    /**
     * Set 快照过期时间点
     * @param SnapshotDeadTime 快照过期时间点
     */
    public void setSnapshotDeadTime(String SnapshotDeadTime) {
        this.SnapshotDeadTime = SnapshotDeadTime;
    }

    public SnapshotInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotInfoNew(SnapshotInfoNew source) {
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.SnapshotDeadTime != null) {
            this.SnapshotDeadTime = new String(source.SnapshotDeadTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SnapshotDeadTime", this.SnapshotDeadTime);

    }
}

