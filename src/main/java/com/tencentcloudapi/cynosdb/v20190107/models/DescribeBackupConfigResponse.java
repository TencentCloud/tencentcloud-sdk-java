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

public class DescribeBackupConfigResponse extends AbstractModel {

    /**
    * <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
    */
    @SerializedName("BackupTimeBeg")
    @Expose
    private Long BackupTimeBeg;

    /**
    * <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
    */
    @SerializedName("BackupTimeEnd")
    @Expose
    private Long BackupTimeEnd;

    /**
    * <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800</p>
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * <p>备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p>
    */
    @SerializedName("BackupFreq")
    @Expose
    private String [] BackupFreq;

    /**
    * <p>备份方式，logic-逻辑备份，snapshot-快照备份</p>
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>跨地域逻辑备份配置修改时间</p>
    */
    @SerializedName("LogicCrossRegionsConfigUpdateTime")
    @Expose
    private String LogicCrossRegionsConfigUpdateTime;

    /**
    * <p>自动逻辑备份配置</p>
    */
    @SerializedName("LogicBackupConfig")
    @Expose
    private LogicBackupConfigInfo LogicBackupConfig;

    /**
    * <p>二级快照备份配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotSecondaryBackupConfig")
    @Expose
    private BackupConfigInfo SnapshotSecondaryBackupConfig;

    /**
    * <p>稀疏备份配置</p>
    */
    @SerializedName("SparseBackupConfig")
    @Expose
    private SparseBackupConfigRsp SparseBackupConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p> 
     * @return BackupTimeBeg <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     */
    public Long getBackupTimeBeg() {
        return this.BackupTimeBeg;
    }

    /**
     * Set <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     * @param BackupTimeBeg <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     */
    public void setBackupTimeBeg(Long BackupTimeBeg) {
        this.BackupTimeBeg = BackupTimeBeg;
    }

    /**
     * Get <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p> 
     * @return BackupTimeEnd <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     */
    public Long getBackupTimeEnd() {
        return this.BackupTimeEnd;
    }

    /**
     * Set <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     * @param BackupTimeEnd <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     */
    public void setBackupTimeEnd(Long BackupTimeEnd) {
        this.BackupTimeEnd = BackupTimeEnd;
    }

    /**
     * Get <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800</p> 
     * @return ReserveDuration <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800</p>
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800</p>
     * @param ReserveDuration <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800</p>
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get <p>备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p> 
     * @return BackupFreq <p>备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p>
     */
    public String [] getBackupFreq() {
        return this.BackupFreq;
    }

    /**
     * Set <p>备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p>
     * @param BackupFreq <p>备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p>
     */
    public void setBackupFreq(String [] BackupFreq) {
        this.BackupFreq = BackupFreq;
    }

    /**
     * Get <p>备份方式，logic-逻辑备份，snapshot-快照备份</p> 
     * @return BackupType <p>备份方式，logic-逻辑备份，snapshot-快照备份</p>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>备份方式，logic-逻辑备份，snapshot-快照备份</p>
     * @param BackupType <p>备份方式，logic-逻辑备份，snapshot-快照备份</p>
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>跨地域逻辑备份配置修改时间</p> 
     * @return LogicCrossRegionsConfigUpdateTime <p>跨地域逻辑备份配置修改时间</p>
     */
    public String getLogicCrossRegionsConfigUpdateTime() {
        return this.LogicCrossRegionsConfigUpdateTime;
    }

    /**
     * Set <p>跨地域逻辑备份配置修改时间</p>
     * @param LogicCrossRegionsConfigUpdateTime <p>跨地域逻辑备份配置修改时间</p>
     */
    public void setLogicCrossRegionsConfigUpdateTime(String LogicCrossRegionsConfigUpdateTime) {
        this.LogicCrossRegionsConfigUpdateTime = LogicCrossRegionsConfigUpdateTime;
    }

    /**
     * Get <p>自动逻辑备份配置</p> 
     * @return LogicBackupConfig <p>自动逻辑备份配置</p>
     */
    public LogicBackupConfigInfo getLogicBackupConfig() {
        return this.LogicBackupConfig;
    }

    /**
     * Set <p>自动逻辑备份配置</p>
     * @param LogicBackupConfig <p>自动逻辑备份配置</p>
     */
    public void setLogicBackupConfig(LogicBackupConfigInfo LogicBackupConfig) {
        this.LogicBackupConfig = LogicBackupConfig;
    }

    /**
     * Get <p>二级快照备份配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotSecondaryBackupConfig <p>二级快照备份配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupConfigInfo getSnapshotSecondaryBackupConfig() {
        return this.SnapshotSecondaryBackupConfig;
    }

    /**
     * Set <p>二级快照备份配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotSecondaryBackupConfig <p>二级快照备份配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotSecondaryBackupConfig(BackupConfigInfo SnapshotSecondaryBackupConfig) {
        this.SnapshotSecondaryBackupConfig = SnapshotSecondaryBackupConfig;
    }

    /**
     * Get <p>稀疏备份配置</p> 
     * @return SparseBackupConfig <p>稀疏备份配置</p>
     */
    public SparseBackupConfigRsp getSparseBackupConfig() {
        return this.SparseBackupConfig;
    }

    /**
     * Set <p>稀疏备份配置</p>
     * @param SparseBackupConfig <p>稀疏备份配置</p>
     */
    public void setSparseBackupConfig(SparseBackupConfigRsp SparseBackupConfig) {
        this.SparseBackupConfig = SparseBackupConfig;
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

    public DescribeBackupConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupConfigResponse(DescribeBackupConfigResponse source) {
        if (source.BackupTimeBeg != null) {
            this.BackupTimeBeg = new Long(source.BackupTimeBeg);
        }
        if (source.BackupTimeEnd != null) {
            this.BackupTimeEnd = new Long(source.BackupTimeEnd);
        }
        if (source.ReserveDuration != null) {
            this.ReserveDuration = new Long(source.ReserveDuration);
        }
        if (source.BackupFreq != null) {
            this.BackupFreq = new String[source.BackupFreq.length];
            for (int i = 0; i < source.BackupFreq.length; i++) {
                this.BackupFreq[i] = new String(source.BackupFreq[i]);
            }
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.LogicCrossRegionsConfigUpdateTime != null) {
            this.LogicCrossRegionsConfigUpdateTime = new String(source.LogicCrossRegionsConfigUpdateTime);
        }
        if (source.LogicBackupConfig != null) {
            this.LogicBackupConfig = new LogicBackupConfigInfo(source.LogicBackupConfig);
        }
        if (source.SnapshotSecondaryBackupConfig != null) {
            this.SnapshotSecondaryBackupConfig = new BackupConfigInfo(source.SnapshotSecondaryBackupConfig);
        }
        if (source.SparseBackupConfig != null) {
            this.SparseBackupConfig = new SparseBackupConfigRsp(source.SparseBackupConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupTimeBeg", this.BackupTimeBeg);
        this.setParamSimple(map, prefix + "BackupTimeEnd", this.BackupTimeEnd);
        this.setParamSimple(map, prefix + "ReserveDuration", this.ReserveDuration);
        this.setParamArraySimple(map, prefix + "BackupFreq.", this.BackupFreq);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "LogicCrossRegionsConfigUpdateTime", this.LogicCrossRegionsConfigUpdateTime);
        this.setParamObj(map, prefix + "LogicBackupConfig.", this.LogicBackupConfig);
        this.setParamObj(map, prefix + "SnapshotSecondaryBackupConfig.", this.SnapshotSecondaryBackupConfig);
        this.setParamObj(map, prefix + "SparseBackupConfig.", this.SparseBackupConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

