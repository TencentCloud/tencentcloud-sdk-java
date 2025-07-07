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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDetailResponse extends AbstractModel {

    /**
    * 备份 ID。
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 备份开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份方式。 

- 1：手动备份。
-  0：自动备份。
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份状态。 

- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 备份的备注信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 备份是否被锁定。

- 0：未被锁定。
- 1：已被锁定。
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * 备份文件大小。单位：Byte。
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * 实例类型。
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 单分片内存规格大小，单位：MB。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 分片数量。
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * 副本数量。
    */
    @SerializedName("ReplicasNum")
    @Expose
    private Long ReplicasNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份 ID。 
     * @return BackupId 备份 ID。
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份 ID。
     * @param BackupId 备份 ID。
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份开始时间。 
     * @return StartTime 备份开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份开始时间。
     * @param StartTime 备份开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份结束时间。 
     * @return EndTime 备份结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 备份结束时间。
     * @param EndTime 备份结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备份方式。 

- 1：手动备份。
-  0：自动备份。 
     * @return BackupType 备份方式。 

- 1：手动备份。
-  0：自动备份。
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份方式。 

- 1：手动备份。
-  0：自动备份。
     * @param BackupType 备份方式。 

- 1：手动备份。
-  0：自动备份。
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份状态。 

- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。 
     * @return Status 备份状态。 

- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 备份状态。 

- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。
     * @param Status 备份状态。 

- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 备份的备注信息。 
     * @return Remark 备份的备注信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备份的备注信息。
     * @param Remark 备份的备注信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 备份是否被锁定。

- 0：未被锁定。
- 1：已被锁定。 
     * @return Locked 备份是否被锁定。

- 0：未被锁定。
- 1：已被锁定。
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set 备份是否被锁定。

- 0：未被锁定。
- 1：已被锁定。
     * @param Locked 备份是否被锁定。

- 0：未被锁定。
- 1：已被锁定。
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 备份文件大小。单位：Byte。 
     * @return BackupSize 备份文件大小。单位：Byte。
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set 备份文件大小。单位：Byte。
     * @param BackupSize 备份文件大小。单位：Byte。
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get 实例类型。 
     * @return InstanceType 实例类型。
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型。
     * @param InstanceType 实例类型。
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 单分片内存规格大小，单位：MB。 
     * @return MemSize 单分片内存规格大小，单位：MB。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 单分片内存规格大小，单位：MB。
     * @param MemSize 单分片内存规格大小，单位：MB。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 分片数量。 
     * @return ShardNum 分片数量。
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 分片数量。
     * @param ShardNum 分片数量。
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get 副本数量。 
     * @return ReplicasNum 副本数量。
     */
    public Long getReplicasNum() {
        return this.ReplicasNum;
    }

    /**
     * Set 副本数量。
     * @param ReplicasNum 副本数量。
     */
    public void setReplicasNum(Long ReplicasNum) {
        this.ReplicasNum = ReplicasNum;
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

    public DescribeBackupDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDetailResponse(DescribeBackupDetailResponse source) {
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.ReplicasNum != null) {
            this.ReplicasNum = new Long(source.ReplicasNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "ReplicasNum", this.ReplicasNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

