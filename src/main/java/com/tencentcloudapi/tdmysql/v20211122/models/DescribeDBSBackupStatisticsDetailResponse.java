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

public class DescribeDBSBackupStatisticsDetailResponse extends AbstractModel {

    /**
    * <p>按备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupMethodStatistics")
    @Expose
    private BackupMethodStatisticsOutPut BackupMethodStatistics;

    /**
    * <p>备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupTime")
    @Expose
    private String [] BackupTime;

    /**
    * <p>按备份数据类型统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupTypeStatistics")
    @Expose
    private BackupTypeStatisticsModel BackupTypeStatistics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>按备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupMethodStatistics <p>按备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupMethodStatisticsOutPut getBackupMethodStatistics() {
        return this.BackupMethodStatistics;
    }

    /**
     * Set <p>按备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupMethodStatistics <p>按备份方式统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupMethodStatistics(BackupMethodStatisticsOutPut BackupMethodStatistics) {
        this.BackupMethodStatistics = BackupMethodStatistics;
    }

    /**
     * Get <p>备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupTime <p>备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set <p>备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupTime <p>备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupTime(String [] BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get <p>按备份数据类型统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupTypeStatistics <p>按备份数据类型统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupTypeStatisticsModel getBackupTypeStatistics() {
        return this.BackupTypeStatistics;
    }

    /**
     * Set <p>按备份数据类型统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupTypeStatistics <p>按备份数据类型统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupTypeStatistics(BackupTypeStatisticsModel BackupTypeStatistics) {
        this.BackupTypeStatistics = BackupTypeStatistics;
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

    public DescribeDBSBackupStatisticsDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSBackupStatisticsDetailResponse(DescribeDBSBackupStatisticsDetailResponse source) {
        if (source.BackupMethodStatistics != null) {
            this.BackupMethodStatistics = new BackupMethodStatisticsOutPut(source.BackupMethodStatistics);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String[source.BackupTime.length];
            for (int i = 0; i < source.BackupTime.length; i++) {
                this.BackupTime[i] = new String(source.BackupTime[i]);
            }
        }
        if (source.BackupTypeStatistics != null) {
            this.BackupTypeStatistics = new BackupTypeStatisticsModel(source.BackupTypeStatistics);
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
        this.setParamArraySimple(map, prefix + "BackupTime.", this.BackupTime);
        this.setParamObj(map, prefix + "BackupTypeStatistics.", this.BackupTypeStatistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

