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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRansomDefenseStateResponse extends AbstractModel{

    /**
    * 已开启防御策略数量
    */
    @SerializedName("StrategyCount")
    @Expose
    private Long StrategyCount;

    /**
    * 已开启防御机器数
    */
    @SerializedName("MachineCount")
    @Expose
    private Long MachineCount;

    /**
    * 快照总容量
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Long SnapshotSize;

    /**
    * 恢复备份任务数量
    */
    @SerializedName("RollBackTaskCount")
    @Expose
    private Long RollBackTaskCount;

    /**
    * 进行中的创建快照任务数
    */
    @SerializedName("ProgressingSnapshotTaskCount")
    @Expose
    private Long ProgressingSnapshotTaskCount;

    /**
    * 进行中的恢复备份任务数
    */
    @SerializedName("ProgressingRollBackTaskCount")
    @Expose
    private Long ProgressingRollBackTaskCount;

    /**
    * 机器总数
    */
    @SerializedName("MachineTotal")
    @Expose
    private Long MachineTotal;

    /**
    * 策略总数
    */
    @SerializedName("StrategyTotal")
    @Expose
    private Long StrategyTotal;

    /**
    * 账户状态：0未欠费，1已欠费
    */
    @SerializedName("BalanceStatus")
    @Expose
    private Long BalanceStatus;

    /**
    * 已备份主机数
    */
    @SerializedName("BackupMachineCount")
    @Expose
    private Long BackupMachineCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 已开启防御策略数量 
     * @return StrategyCount 已开启防御策略数量
     */
    public Long getStrategyCount() {
        return this.StrategyCount;
    }

    /**
     * Set 已开启防御策略数量
     * @param StrategyCount 已开启防御策略数量
     */
    public void setStrategyCount(Long StrategyCount) {
        this.StrategyCount = StrategyCount;
    }

    /**
     * Get 已开启防御机器数 
     * @return MachineCount 已开启防御机器数
     */
    public Long getMachineCount() {
        return this.MachineCount;
    }

    /**
     * Set 已开启防御机器数
     * @param MachineCount 已开启防御机器数
     */
    public void setMachineCount(Long MachineCount) {
        this.MachineCount = MachineCount;
    }

    /**
     * Get 快照总容量 
     * @return SnapshotSize 快照总容量
     */
    public Long getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * Set 快照总容量
     * @param SnapshotSize 快照总容量
     */
    public void setSnapshotSize(Long SnapshotSize) {
        this.SnapshotSize = SnapshotSize;
    }

    /**
     * Get 恢复备份任务数量 
     * @return RollBackTaskCount 恢复备份任务数量
     */
    public Long getRollBackTaskCount() {
        return this.RollBackTaskCount;
    }

    /**
     * Set 恢复备份任务数量
     * @param RollBackTaskCount 恢复备份任务数量
     */
    public void setRollBackTaskCount(Long RollBackTaskCount) {
        this.RollBackTaskCount = RollBackTaskCount;
    }

    /**
     * Get 进行中的创建快照任务数 
     * @return ProgressingSnapshotTaskCount 进行中的创建快照任务数
     */
    public Long getProgressingSnapshotTaskCount() {
        return this.ProgressingSnapshotTaskCount;
    }

    /**
     * Set 进行中的创建快照任务数
     * @param ProgressingSnapshotTaskCount 进行中的创建快照任务数
     */
    public void setProgressingSnapshotTaskCount(Long ProgressingSnapshotTaskCount) {
        this.ProgressingSnapshotTaskCount = ProgressingSnapshotTaskCount;
    }

    /**
     * Get 进行中的恢复备份任务数 
     * @return ProgressingRollBackTaskCount 进行中的恢复备份任务数
     */
    public Long getProgressingRollBackTaskCount() {
        return this.ProgressingRollBackTaskCount;
    }

    /**
     * Set 进行中的恢复备份任务数
     * @param ProgressingRollBackTaskCount 进行中的恢复备份任务数
     */
    public void setProgressingRollBackTaskCount(Long ProgressingRollBackTaskCount) {
        this.ProgressingRollBackTaskCount = ProgressingRollBackTaskCount;
    }

    /**
     * Get 机器总数 
     * @return MachineTotal 机器总数
     */
    public Long getMachineTotal() {
        return this.MachineTotal;
    }

    /**
     * Set 机器总数
     * @param MachineTotal 机器总数
     */
    public void setMachineTotal(Long MachineTotal) {
        this.MachineTotal = MachineTotal;
    }

    /**
     * Get 策略总数 
     * @return StrategyTotal 策略总数
     */
    public Long getStrategyTotal() {
        return this.StrategyTotal;
    }

    /**
     * Set 策略总数
     * @param StrategyTotal 策略总数
     */
    public void setStrategyTotal(Long StrategyTotal) {
        this.StrategyTotal = StrategyTotal;
    }

    /**
     * Get 账户状态：0未欠费，1已欠费 
     * @return BalanceStatus 账户状态：0未欠费，1已欠费
     */
    public Long getBalanceStatus() {
        return this.BalanceStatus;
    }

    /**
     * Set 账户状态：0未欠费，1已欠费
     * @param BalanceStatus 账户状态：0未欠费，1已欠费
     */
    public void setBalanceStatus(Long BalanceStatus) {
        this.BalanceStatus = BalanceStatus;
    }

    /**
     * Get 已备份主机数 
     * @return BackupMachineCount 已备份主机数
     */
    public Long getBackupMachineCount() {
        return this.BackupMachineCount;
    }

    /**
     * Set 已备份主机数
     * @param BackupMachineCount 已备份主机数
     */
    public void setBackupMachineCount(Long BackupMachineCount) {
        this.BackupMachineCount = BackupMachineCount;
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

    public DescribeRansomDefenseStateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRansomDefenseStateResponse(DescribeRansomDefenseStateResponse source) {
        if (source.StrategyCount != null) {
            this.StrategyCount = new Long(source.StrategyCount);
        }
        if (source.MachineCount != null) {
            this.MachineCount = new Long(source.MachineCount);
        }
        if (source.SnapshotSize != null) {
            this.SnapshotSize = new Long(source.SnapshotSize);
        }
        if (source.RollBackTaskCount != null) {
            this.RollBackTaskCount = new Long(source.RollBackTaskCount);
        }
        if (source.ProgressingSnapshotTaskCount != null) {
            this.ProgressingSnapshotTaskCount = new Long(source.ProgressingSnapshotTaskCount);
        }
        if (source.ProgressingRollBackTaskCount != null) {
            this.ProgressingRollBackTaskCount = new Long(source.ProgressingRollBackTaskCount);
        }
        if (source.MachineTotal != null) {
            this.MachineTotal = new Long(source.MachineTotal);
        }
        if (source.StrategyTotal != null) {
            this.StrategyTotal = new Long(source.StrategyTotal);
        }
        if (source.BalanceStatus != null) {
            this.BalanceStatus = new Long(source.BalanceStatus);
        }
        if (source.BackupMachineCount != null) {
            this.BackupMachineCount = new Long(source.BackupMachineCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyCount", this.StrategyCount);
        this.setParamSimple(map, prefix + "MachineCount", this.MachineCount);
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);
        this.setParamSimple(map, prefix + "RollBackTaskCount", this.RollBackTaskCount);
        this.setParamSimple(map, prefix + "ProgressingSnapshotTaskCount", this.ProgressingSnapshotTaskCount);
        this.setParamSimple(map, prefix + "ProgressingRollBackTaskCount", this.ProgressingRollBackTaskCount);
        this.setParamSimple(map, prefix + "MachineTotal", this.MachineTotal);
        this.setParamSimple(map, prefix + "StrategyTotal", this.StrategyTotal);
        this.setParamSimple(map, prefix + "BalanceStatus", this.BalanceStatus);
        this.setParamSimple(map, prefix + "BackupMachineCount", this.BackupMachineCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

