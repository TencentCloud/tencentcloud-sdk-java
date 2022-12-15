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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupListRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 备份文件列表大小，取值范围(0,100]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 备份文件列表偏移，取值范围[0,INF)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数据库类型，取值范围: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 备份ID
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

    /**
    * 备份类型，可选值：snapshot，快照备份； logic，逻辑备份
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份方式，可选值：auto，自动备份；manual，手动备
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 快照类型，可选值：full，全量；increment，增量
    */
    @SerializedName("SnapShotType")
    @Expose
    private String SnapShotType;

    /**
    * 备份开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份文件名，模糊查询
    */
    @SerializedName("FileNames")
    @Expose
    private String [] FileNames;

    /**
    * 备份备注名，模糊查询
    */
    @SerializedName("BackupNames")
    @Expose
    private String [] BackupNames;

    /**
    * 快照备份Id列表
    */
    @SerializedName("SnapshotIdList")
    @Expose
    private Long [] SnapshotIdList;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 备份文件列表大小，取值范围(0,100] 
     * @return Limit 备份文件列表大小，取值范围(0,100]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 备份文件列表大小，取值范围(0,100]
     * @param Limit 备份文件列表大小，取值范围(0,100]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 备份文件列表偏移，取值范围[0,INF) 
     * @return Offset 备份文件列表偏移，取值范围[0,INF)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 备份文件列表偏移，取值范围[0,INF)
     * @param Offset 备份文件列表偏移，取值范围[0,INF)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数据库类型，取值范围: 
<li> MYSQL </li> 
     * @return DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型，取值范围: 
<li> MYSQL </li>
     * @param DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 备份ID 
     * @return BackupIds 备份ID
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set 备份ID
     * @param BackupIds 备份ID
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    /**
     * Get 备份类型，可选值：snapshot，快照备份； logic，逻辑备份 
     * @return BackupType 备份类型，可选值：snapshot，快照备份； logic，逻辑备份
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型，可选值：snapshot，快照备份； logic，逻辑备份
     * @param BackupType 备份类型，可选值：snapshot，快照备份； logic，逻辑备份
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份方式，可选值：auto，自动备份；manual，手动备 
     * @return BackupMethod 备份方式，可选值：auto，自动备份；manual，手动备
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式，可选值：auto，自动备份；manual，手动备
     * @param BackupMethod 备份方式，可选值：auto，自动备份；manual，手动备
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 快照类型，可选值：full，全量；increment，增量 
     * @return SnapShotType 快照类型，可选值：full，全量；increment，增量
     */
    public String getSnapShotType() {
        return this.SnapShotType;
    }

    /**
     * Set 快照类型，可选值：full，全量；increment，增量
     * @param SnapShotType 快照类型，可选值：full，全量；increment，增量
     */
    public void setSnapShotType(String SnapShotType) {
        this.SnapShotType = SnapShotType;
    }

    /**
     * Get 备份开始时间 
     * @return StartTime 备份开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份开始时间
     * @param StartTime 备份开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份结束时间 
     * @return EndTime 备份结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 备份结束时间
     * @param EndTime 备份结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备份文件名，模糊查询 
     * @return FileNames 备份文件名，模糊查询
     */
    public String [] getFileNames() {
        return this.FileNames;
    }

    /**
     * Set 备份文件名，模糊查询
     * @param FileNames 备份文件名，模糊查询
     */
    public void setFileNames(String [] FileNames) {
        this.FileNames = FileNames;
    }

    /**
     * Get 备份备注名，模糊查询 
     * @return BackupNames 备份备注名，模糊查询
     */
    public String [] getBackupNames() {
        return this.BackupNames;
    }

    /**
     * Set 备份备注名，模糊查询
     * @param BackupNames 备份备注名，模糊查询
     */
    public void setBackupNames(String [] BackupNames) {
        this.BackupNames = BackupNames;
    }

    /**
     * Get 快照备份Id列表 
     * @return SnapshotIdList 快照备份Id列表
     */
    public Long [] getSnapshotIdList() {
        return this.SnapshotIdList;
    }

    /**
     * Set 快照备份Id列表
     * @param SnapshotIdList 快照备份Id列表
     */
    public void setSnapshotIdList(Long [] SnapshotIdList) {
        this.SnapshotIdList = SnapshotIdList;
    }

    public DescribeBackupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupListRequest(DescribeBackupListRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.BackupIds != null) {
            this.BackupIds = new Long[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new Long(source.BackupIds[i]);
            }
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.SnapShotType != null) {
            this.SnapShotType = new String(source.SnapShotType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FileNames != null) {
            this.FileNames = new String[source.FileNames.length];
            for (int i = 0; i < source.FileNames.length; i++) {
                this.FileNames[i] = new String(source.FileNames[i]);
            }
        }
        if (source.BackupNames != null) {
            this.BackupNames = new String[source.BackupNames.length];
            for (int i = 0; i < source.BackupNames.length; i++) {
                this.BackupNames[i] = new String(source.BackupNames[i]);
            }
        }
        if (source.SnapshotIdList != null) {
            this.SnapshotIdList = new Long[source.SnapshotIdList.length];
            for (int i = 0; i < source.SnapshotIdList.length; i++) {
                this.SnapshotIdList[i] = new Long(source.SnapshotIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "SnapShotType", this.SnapShotType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "FileNames.", this.FileNames);
        this.setParamArraySimple(map, prefix + "BackupNames.", this.BackupNames);
        this.setParamArraySimple(map, prefix + "SnapshotIdList.", this.SnapshotIdList);

    }
}

