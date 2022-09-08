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

public class CreateBackupRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 备份类型, 可选值：logic，逻辑备份；snapshot，物理备份
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份的库, 只在 BackupType 为 logic 时有效
    */
    @SerializedName("BackupDatabases")
    @Expose
    private String [] BackupDatabases;

    /**
    * 备份的表, 只在 BackupType 为 logic 时有效
    */
    @SerializedName("BackupTables")
    @Expose
    private DatabaseTables [] BackupTables;

    /**
    * 备注名
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

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
     * Get 备份类型, 可选值：logic，逻辑备份；snapshot，物理备份 
     * @return BackupType 备份类型, 可选值：logic，逻辑备份；snapshot，物理备份
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型, 可选值：logic，逻辑备份；snapshot，物理备份
     * @param BackupType 备份类型, 可选值：logic，逻辑备份；snapshot，物理备份
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份的库, 只在 BackupType 为 logic 时有效 
     * @return BackupDatabases 备份的库, 只在 BackupType 为 logic 时有效
     */
    public String [] getBackupDatabases() {
        return this.BackupDatabases;
    }

    /**
     * Set 备份的库, 只在 BackupType 为 logic 时有效
     * @param BackupDatabases 备份的库, 只在 BackupType 为 logic 时有效
     */
    public void setBackupDatabases(String [] BackupDatabases) {
        this.BackupDatabases = BackupDatabases;
    }

    /**
     * Get 备份的表, 只在 BackupType 为 logic 时有效 
     * @return BackupTables 备份的表, 只在 BackupType 为 logic 时有效
     */
    public DatabaseTables [] getBackupTables() {
        return this.BackupTables;
    }

    /**
     * Set 备份的表, 只在 BackupType 为 logic 时有效
     * @param BackupTables 备份的表, 只在 BackupType 为 logic 时有效
     */
    public void setBackupTables(DatabaseTables [] BackupTables) {
        this.BackupTables = BackupTables;
    }

    /**
     * Get 备注名 
     * @return BackupName 备注名
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备注名
     * @param BackupName 备注名
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    public CreateBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupRequest(CreateBackupRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupDatabases != null) {
            this.BackupDatabases = new String[source.BackupDatabases.length];
            for (int i = 0; i < source.BackupDatabases.length; i++) {
                this.BackupDatabases[i] = new String(source.BackupDatabases[i]);
            }
        }
        if (source.BackupTables != null) {
            this.BackupTables = new DatabaseTables[source.BackupTables.length];
            for (int i = 0; i < source.BackupTables.length; i++) {
                this.BackupTables[i] = new DatabaseTables(source.BackupTables[i]);
            }
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamArraySimple(map, prefix + "BackupDatabases.", this.BackupDatabases);
        this.setParamArrayObj(map, prefix + "BackupTables.", this.BackupTables);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}

