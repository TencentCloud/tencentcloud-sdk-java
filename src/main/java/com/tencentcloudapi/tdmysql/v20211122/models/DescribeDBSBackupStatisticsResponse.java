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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSBackupStatisticsResponse extends AbstractModel {

    /**
    * <p>备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupMethodStatistics")
    @Expose
    private BackupMethodStatisticsModel BackupMethodStatistics;

    /**
    * <p>总备份集统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStatistics")
    @Expose
    private BackupStatisticsModel BackupStatistics;

    /**
    * <p>数据备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataBackupStatistics")
    @Expose
    private DataBackupStatisticsModel DataBackupStatistics;

    /**
    * <p>日志备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogBackupStatistics")
    @Expose
    private LogBackupStatisticsModel LogBackupStatistics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupMethodStatistics <p>备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupMethodStatisticsModel getBackupMethodStatistics() {
        return this.BackupMethodStatistics;
    }

    /**
     * Set <p>备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupMethodStatistics <p>备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupMethodStatistics(BackupMethodStatisticsModel BackupMethodStatistics) {
        this.BackupMethodStatistics = BackupMethodStatistics;
    }

    /**
     * Get <p>总备份集统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupStatistics <p>总备份集统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupStatisticsModel getBackupStatistics() {
        return this.BackupStatistics;
    }

    /**
     * Set <p>总备份集统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupStatistics <p>总备份集统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupStatistics(BackupStatisticsModel BackupStatistics) {
        this.BackupStatistics = BackupStatistics;
    }

    /**
     * Get <p>数据备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataBackupStatistics <p>数据备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataBackupStatisticsModel getDataBackupStatistics() {
        return this.DataBackupStatistics;
    }

    /**
     * Set <p>数据备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataBackupStatistics <p>数据备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataBackupStatistics(DataBackupStatisticsModel DataBackupStatistics) {
        this.DataBackupStatistics = DataBackupStatistics;
    }

    /**
     * Get <p>日志备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogBackupStatistics <p>日志备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogBackupStatisticsModel getLogBackupStatistics() {
        return this.LogBackupStatistics;
    }

    /**
     * Set <p>日志备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogBackupStatistics <p>日志备份统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogBackupStatistics(LogBackupStatisticsModel LogBackupStatistics) {
        this.LogBackupStatistics = LogBackupStatistics;
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

    public DescribeDBSBackupStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSBackupStatisticsResponse(DescribeDBSBackupStatisticsResponse source) {
        if (source.BackupMethodStatistics != null) {
            this.BackupMethodStatistics = new BackupMethodStatisticsModel(source.BackupMethodStatistics);
        }
        if (source.BackupStatistics != null) {
            this.BackupStatistics = new BackupStatisticsModel(source.BackupStatistics);
        }
        if (source.DataBackupStatistics != null) {
            this.DataBackupStatistics = new DataBackupStatisticsModel(source.DataBackupStatistics);
        }
        if (source.LogBackupStatistics != null) {
            this.LogBackupStatistics = new LogBackupStatisticsModel(source.LogBackupStatistics);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BackupMethodStatistics.", this.BackupMethodStatistics);
        this.setParamObj(map, prefix + "BackupStatistics.", this.BackupStatistics);
        this.setParamObj(map, prefix + "DataBackupStatistics.", this.DataBackupStatistics);
        this.setParamObj(map, prefix + "LogBackupStatistics.", this.LogBackupStatistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

