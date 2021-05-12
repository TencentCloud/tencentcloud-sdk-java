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

public class DescribeBackupConfigResponse extends AbstractModel{

    /**
    * 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
    */
    @SerializedName("BackupTimeBeg")
    @Expose
    private Long BackupTimeBeg;

    /**
    * 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
    */
    @SerializedName("BackupTimeEnd")
    @Expose
    private Long BackupTimeEnd;

    /**
    * 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * 备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupFreq")
    @Expose
    private String [] BackupFreq;

    /**
    * 备份方式，logic-逻辑备份，snapshot-快照备份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200 
     * @return BackupTimeBeg 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     */
    public Long getBackupTimeBeg() {
        return this.BackupTimeBeg;
    }

    /**
     * Set 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     * @param BackupTimeBeg 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     */
    public void setBackupTimeBeg(Long BackupTimeBeg) {
        this.BackupTimeBeg = BackupTimeBeg;
    }

    /**
     * Get 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200 
     * @return BackupTimeEnd 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     */
    public Long getBackupTimeEnd() {
        return this.BackupTimeEnd;
    }

    /**
     * Set 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     * @param BackupTimeEnd 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     */
    public void setBackupTimeEnd(Long BackupTimeEnd) {
        this.BackupTimeEnd = BackupTimeEnd;
    }

    /**
     * Get 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800 
     * @return ReserveDuration 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800
     * @param ReserveDuration 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get 备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupFreq 备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBackupFreq() {
        return this.BackupFreq;
    }

    /**
     * Set 备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupFreq 备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupFreq(String [] BackupFreq) {
        this.BackupFreq = BackupFreq;
    }

    /**
     * Get 备份方式，logic-逻辑备份，snapshot-快照备份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupType 备份方式，logic-逻辑备份，snapshot-快照备份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份方式，logic-逻辑备份，snapshot-快照备份
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupType 备份方式，logic-逻辑备份，snapshot-快照备份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

