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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupOverviewResponse extends AbstractModel {

    /**
    * 备份总容量
    */
    @SerializedName("BackupTotalVolume")
    @Expose
    private Float BackupTotalVolume;

    /**
    * 备份快照容量
    */
    @SerializedName("BackupSnapshotVolume")
    @Expose
    private Float BackupSnapshotVolume;

    /**
    * 备份逻辑容量
    */
    @SerializedName("BackupLogicVolume")
    @Expose
    private Float BackupLogicVolume;

    /**
    * 日志总容量
    */
    @SerializedName("LogTotalVolume")
    @Expose
    private Float LogTotalVolume;

    /**
    * 日志binlog容量
    */
    @SerializedName("LogBinlogVolume")
    @Expose
    private Float LogBinlogVolume;

    /**
    * 日志redolog容量
    */
    @SerializedName("LogRedoLogVolume")
    @Expose
    private Float LogRedoLogVolume;

    /**
    * 跨地域备份总容量
    */
    @SerializedName("CrossTotalVolume")
    @Expose
    private Float CrossTotalVolume;

    /**
    * 跨地域备份容量
    */
    @SerializedName("CrossRegionBackupVolume")
    @Expose
    private Float CrossRegionBackupVolume;

    /**
    * 跨地域日志容量
    */
    @SerializedName("CrossRegionLogVolume")
    @Expose
    private Float CrossRegionLogVolume;

    /**
    * 备份容量详情
    */
    @SerializedName("BackupVolumeInfos")
    @Expose
    private BackupVolumeInfo [] BackupVolumeInfos;

    /**
    * 跨地域备份容量详情
    */
    @SerializedName("CrossRegionBackupVolumeInfos")
    @Expose
    private BackupVolumeInfo [] CrossRegionBackupVolumeInfos;

    /**
    * 跨地域信息
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份总容量 
     * @return BackupTotalVolume 备份总容量
     */
    public Float getBackupTotalVolume() {
        return this.BackupTotalVolume;
    }

    /**
     * Set 备份总容量
     * @param BackupTotalVolume 备份总容量
     */
    public void setBackupTotalVolume(Float BackupTotalVolume) {
        this.BackupTotalVolume = BackupTotalVolume;
    }

    /**
     * Get 备份快照容量 
     * @return BackupSnapshotVolume 备份快照容量
     */
    public Float getBackupSnapshotVolume() {
        return this.BackupSnapshotVolume;
    }

    /**
     * Set 备份快照容量
     * @param BackupSnapshotVolume 备份快照容量
     */
    public void setBackupSnapshotVolume(Float BackupSnapshotVolume) {
        this.BackupSnapshotVolume = BackupSnapshotVolume;
    }

    /**
     * Get 备份逻辑容量 
     * @return BackupLogicVolume 备份逻辑容量
     */
    public Float getBackupLogicVolume() {
        return this.BackupLogicVolume;
    }

    /**
     * Set 备份逻辑容量
     * @param BackupLogicVolume 备份逻辑容量
     */
    public void setBackupLogicVolume(Float BackupLogicVolume) {
        this.BackupLogicVolume = BackupLogicVolume;
    }

    /**
     * Get 日志总容量 
     * @return LogTotalVolume 日志总容量
     */
    public Float getLogTotalVolume() {
        return this.LogTotalVolume;
    }

    /**
     * Set 日志总容量
     * @param LogTotalVolume 日志总容量
     */
    public void setLogTotalVolume(Float LogTotalVolume) {
        this.LogTotalVolume = LogTotalVolume;
    }

    /**
     * Get 日志binlog容量 
     * @return LogBinlogVolume 日志binlog容量
     */
    public Float getLogBinlogVolume() {
        return this.LogBinlogVolume;
    }

    /**
     * Set 日志binlog容量
     * @param LogBinlogVolume 日志binlog容量
     */
    public void setLogBinlogVolume(Float LogBinlogVolume) {
        this.LogBinlogVolume = LogBinlogVolume;
    }

    /**
     * Get 日志redolog容量 
     * @return LogRedoLogVolume 日志redolog容量
     */
    public Float getLogRedoLogVolume() {
        return this.LogRedoLogVolume;
    }

    /**
     * Set 日志redolog容量
     * @param LogRedoLogVolume 日志redolog容量
     */
    public void setLogRedoLogVolume(Float LogRedoLogVolume) {
        this.LogRedoLogVolume = LogRedoLogVolume;
    }

    /**
     * Get 跨地域备份总容量 
     * @return CrossTotalVolume 跨地域备份总容量
     */
    public Float getCrossTotalVolume() {
        return this.CrossTotalVolume;
    }

    /**
     * Set 跨地域备份总容量
     * @param CrossTotalVolume 跨地域备份总容量
     */
    public void setCrossTotalVolume(Float CrossTotalVolume) {
        this.CrossTotalVolume = CrossTotalVolume;
    }

    /**
     * Get 跨地域备份容量 
     * @return CrossRegionBackupVolume 跨地域备份容量
     */
    public Float getCrossRegionBackupVolume() {
        return this.CrossRegionBackupVolume;
    }

    /**
     * Set 跨地域备份容量
     * @param CrossRegionBackupVolume 跨地域备份容量
     */
    public void setCrossRegionBackupVolume(Float CrossRegionBackupVolume) {
        this.CrossRegionBackupVolume = CrossRegionBackupVolume;
    }

    /**
     * Get 跨地域日志容量 
     * @return CrossRegionLogVolume 跨地域日志容量
     */
    public Float getCrossRegionLogVolume() {
        return this.CrossRegionLogVolume;
    }

    /**
     * Set 跨地域日志容量
     * @param CrossRegionLogVolume 跨地域日志容量
     */
    public void setCrossRegionLogVolume(Float CrossRegionLogVolume) {
        this.CrossRegionLogVolume = CrossRegionLogVolume;
    }

    /**
     * Get 备份容量详情 
     * @return BackupVolumeInfos 备份容量详情
     */
    public BackupVolumeInfo [] getBackupVolumeInfos() {
        return this.BackupVolumeInfos;
    }

    /**
     * Set 备份容量详情
     * @param BackupVolumeInfos 备份容量详情
     */
    public void setBackupVolumeInfos(BackupVolumeInfo [] BackupVolumeInfos) {
        this.BackupVolumeInfos = BackupVolumeInfos;
    }

    /**
     * Get 跨地域备份容量详情 
     * @return CrossRegionBackupVolumeInfos 跨地域备份容量详情
     */
    public BackupVolumeInfo [] getCrossRegionBackupVolumeInfos() {
        return this.CrossRegionBackupVolumeInfos;
    }

    /**
     * Set 跨地域备份容量详情
     * @param CrossRegionBackupVolumeInfos 跨地域备份容量详情
     */
    public void setCrossRegionBackupVolumeInfos(BackupVolumeInfo [] CrossRegionBackupVolumeInfos) {
        this.CrossRegionBackupVolumeInfos = CrossRegionBackupVolumeInfos;
    }

    /**
     * Get 跨地域信息 
     * @return CrossRegions 跨地域信息
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set 跨地域信息
     * @param CrossRegions 跨地域信息
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupOverviewResponse(DescribeBackupOverviewResponse source) {
        if (source.BackupTotalVolume != null) {
            this.BackupTotalVolume = new Float(source.BackupTotalVolume);
        }
        if (source.BackupSnapshotVolume != null) {
            this.BackupSnapshotVolume = new Float(source.BackupSnapshotVolume);
        }
        if (source.BackupLogicVolume != null) {
            this.BackupLogicVolume = new Float(source.BackupLogicVolume);
        }
        if (source.LogTotalVolume != null) {
            this.LogTotalVolume = new Float(source.LogTotalVolume);
        }
        if (source.LogBinlogVolume != null) {
            this.LogBinlogVolume = new Float(source.LogBinlogVolume);
        }
        if (source.LogRedoLogVolume != null) {
            this.LogRedoLogVolume = new Float(source.LogRedoLogVolume);
        }
        if (source.CrossTotalVolume != null) {
            this.CrossTotalVolume = new Float(source.CrossTotalVolume);
        }
        if (source.CrossRegionBackupVolume != null) {
            this.CrossRegionBackupVolume = new Float(source.CrossRegionBackupVolume);
        }
        if (source.CrossRegionLogVolume != null) {
            this.CrossRegionLogVolume = new Float(source.CrossRegionLogVolume);
        }
        if (source.BackupVolumeInfos != null) {
            this.BackupVolumeInfos = new BackupVolumeInfo[source.BackupVolumeInfos.length];
            for (int i = 0; i < source.BackupVolumeInfos.length; i++) {
                this.BackupVolumeInfos[i] = new BackupVolumeInfo(source.BackupVolumeInfos[i]);
            }
        }
        if (source.CrossRegionBackupVolumeInfos != null) {
            this.CrossRegionBackupVolumeInfos = new BackupVolumeInfo[source.CrossRegionBackupVolumeInfos.length];
            for (int i = 0; i < source.CrossRegionBackupVolumeInfos.length; i++) {
                this.CrossRegionBackupVolumeInfos[i] = new BackupVolumeInfo(source.CrossRegionBackupVolumeInfos[i]);
            }
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupTotalVolume", this.BackupTotalVolume);
        this.setParamSimple(map, prefix + "BackupSnapshotVolume", this.BackupSnapshotVolume);
        this.setParamSimple(map, prefix + "BackupLogicVolume", this.BackupLogicVolume);
        this.setParamSimple(map, prefix + "LogTotalVolume", this.LogTotalVolume);
        this.setParamSimple(map, prefix + "LogBinlogVolume", this.LogBinlogVolume);
        this.setParamSimple(map, prefix + "LogRedoLogVolume", this.LogRedoLogVolume);
        this.setParamSimple(map, prefix + "CrossTotalVolume", this.CrossTotalVolume);
        this.setParamSimple(map, prefix + "CrossRegionBackupVolume", this.CrossRegionBackupVolume);
        this.setParamSimple(map, prefix + "CrossRegionLogVolume", this.CrossRegionLogVolume);
        this.setParamArrayObj(map, prefix + "BackupVolumeInfos.", this.BackupVolumeInfos);
        this.setParamArrayObj(map, prefix + "CrossRegionBackupVolumeInfos.", this.CrossRegionBackupVolumeInfos);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

