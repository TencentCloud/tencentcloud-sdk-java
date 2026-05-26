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

public class BackupTypeStatisticsModel extends AbstractModel {

    /**
    * <p>数据备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataBackupSize")
    @Expose
    private Long [] DataBackupSize;

    /**
    * <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogBackupSize")
    @Expose
    private Long [] LogBackupSize;

    /**
     * Get <p>数据备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataBackupSize <p>数据备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDataBackupSize() {
        return this.DataBackupSize;
    }

    /**
     * Set <p>数据备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataBackupSize <p>数据备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataBackupSize(Long [] DataBackupSize) {
        this.DataBackupSize = DataBackupSize;
    }

    /**
     * Get <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogBackupSize <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getLogBackupSize() {
        return this.LogBackupSize;
    }

    /**
     * Set <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogBackupSize <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogBackupSize(Long [] LogBackupSize) {
        this.LogBackupSize = LogBackupSize;
    }

    public BackupTypeStatisticsModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupTypeStatisticsModel(BackupTypeStatisticsModel source) {
        if (source.DataBackupSize != null) {
            this.DataBackupSize = new Long[source.DataBackupSize.length];
            for (int i = 0; i < source.DataBackupSize.length; i++) {
                this.DataBackupSize[i] = new Long(source.DataBackupSize[i]);
            }
        }
        if (source.LogBackupSize != null) {
            this.LogBackupSize = new Long[source.LogBackupSize.length];
            for (int i = 0; i < source.LogBackupSize.length; i++) {
                this.LogBackupSize[i] = new Long(source.LogBackupSize[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DataBackupSize.", this.DataBackupSize);
        this.setParamArraySimple(map, prefix + "LogBackupSize.", this.LogBackupSize);

    }
}

