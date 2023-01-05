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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSgSnapshotFileContentResponse extends AbstractModel{

    /**
    * 实例Id，即安全组Id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 快照策略Id。
    */
    @SerializedName("SnapshotPolicyId")
    @Expose
    private String SnapshotPolicyId;

    /**
    * 快照文件Id。
    */
    @SerializedName("SnapshotFileId")
    @Expose
    private String SnapshotFileId;

    /**
    * 备份时间。
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * 操作者。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 原始数据。
    */
    @SerializedName("OriginalData")
    @Expose
    private SecurityGroupPolicy [] OriginalData;

    /**
    * 备份数据。
    */
    @SerializedName("BackupData")
    @Expose
    private SecurityGroupPolicy [] BackupData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例Id，即安全组Id。 
     * @return InstanceId 实例Id，即安全组Id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id，即安全组Id。
     * @param InstanceId 实例Id，即安全组Id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 快照策略Id。 
     * @return SnapshotPolicyId 快照策略Id。
     */
    public String getSnapshotPolicyId() {
        return this.SnapshotPolicyId;
    }

    /**
     * Set 快照策略Id。
     * @param SnapshotPolicyId 快照策略Id。
     */
    public void setSnapshotPolicyId(String SnapshotPolicyId) {
        this.SnapshotPolicyId = SnapshotPolicyId;
    }

    /**
     * Get 快照文件Id。 
     * @return SnapshotFileId 快照文件Id。
     */
    public String getSnapshotFileId() {
        return this.SnapshotFileId;
    }

    /**
     * Set 快照文件Id。
     * @param SnapshotFileId 快照文件Id。
     */
    public void setSnapshotFileId(String SnapshotFileId) {
        this.SnapshotFileId = SnapshotFileId;
    }

    /**
     * Get 备份时间。 
     * @return BackupTime 备份时间。
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 备份时间。
     * @param BackupTime 备份时间。
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get 操作者。 
     * @return Operator 操作者。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。
     * @param Operator 操作者。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 原始数据。 
     * @return OriginalData 原始数据。
     */
    public SecurityGroupPolicy [] getOriginalData() {
        return this.OriginalData;
    }

    /**
     * Set 原始数据。
     * @param OriginalData 原始数据。
     */
    public void setOriginalData(SecurityGroupPolicy [] OriginalData) {
        this.OriginalData = OriginalData;
    }

    /**
     * Get 备份数据。 
     * @return BackupData 备份数据。
     */
    public SecurityGroupPolicy [] getBackupData() {
        return this.BackupData;
    }

    /**
     * Set 备份数据。
     * @param BackupData 备份数据。
     */
    public void setBackupData(SecurityGroupPolicy [] BackupData) {
        this.BackupData = BackupData;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSgSnapshotFileContentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSgSnapshotFileContentResponse(DescribeSgSnapshotFileContentResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SnapshotPolicyId != null) {
            this.SnapshotPolicyId = new String(source.SnapshotPolicyId);
        }
        if (source.SnapshotFileId != null) {
            this.SnapshotFileId = new String(source.SnapshotFileId);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.OriginalData != null) {
            this.OriginalData = new SecurityGroupPolicy[source.OriginalData.length];
            for (int i = 0; i < source.OriginalData.length; i++) {
                this.OriginalData[i] = new SecurityGroupPolicy(source.OriginalData[i]);
            }
        }
        if (source.BackupData != null) {
            this.BackupData = new SecurityGroupPolicy[source.BackupData.length];
            for (int i = 0; i < source.BackupData.length; i++) {
                this.BackupData[i] = new SecurityGroupPolicy(source.BackupData[i]);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotPolicyId", this.SnapshotPolicyId);
        this.setParamSimple(map, prefix + "SnapshotFileId", this.SnapshotFileId);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArrayObj(map, prefix + "OriginalData.", this.OriginalData);
        this.setParamArrayObj(map, prefix + "BackupData.", this.BackupData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

