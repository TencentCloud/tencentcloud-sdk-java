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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupTableContent extends AbstractModel {

    /**
    * 数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 表总字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalBytes")
    @Expose
    private Long TotalBytes;

    /**
    * 表单个副本的大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SingleReplicaBytes")
    @Expose
    private String SingleReplicaBytes;

    /**
    * 备份状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStatus")
    @Expose
    private Long BackupStatus;

    /**
    * 备份的错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupErrorMsg")
    @Expose
    private String BackupErrorMsg;

    /**
    * 改库表是否绑定降冷策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOpenCoolDown")
    @Expose
    private Boolean IsOpenCoolDown;

    /**
     * Get 数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Database 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param Database 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table 表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table 表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 表总字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalBytes 表总字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalBytes() {
        return this.TotalBytes;
    }

    /**
     * Set 表总字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalBytes 表总字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalBytes(Long TotalBytes) {
        this.TotalBytes = TotalBytes;
    }

    /**
     * Get 表单个副本的大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SingleReplicaBytes 表单个副本的大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSingleReplicaBytes() {
        return this.SingleReplicaBytes;
    }

    /**
     * Set 表单个副本的大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param SingleReplicaBytes 表单个副本的大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSingleReplicaBytes(String SingleReplicaBytes) {
        this.SingleReplicaBytes = SingleReplicaBytes;
    }

    /**
     * Get 备份状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupStatus 备份状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set 备份状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupStatus 备份状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupStatus(Long BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get 备份的错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupErrorMsg 备份的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupErrorMsg() {
        return this.BackupErrorMsg;
    }

    /**
     * Set 备份的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupErrorMsg 备份的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupErrorMsg(String BackupErrorMsg) {
        this.BackupErrorMsg = BackupErrorMsg;
    }

    /**
     * Get 改库表是否绑定降冷策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOpenCoolDown 改库表是否绑定降冷策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsOpenCoolDown() {
        return this.IsOpenCoolDown;
    }

    /**
     * Set 改库表是否绑定降冷策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOpenCoolDown 改库表是否绑定降冷策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOpenCoolDown(Boolean IsOpenCoolDown) {
        this.IsOpenCoolDown = IsOpenCoolDown;
    }

    public BackupTableContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupTableContent(BackupTableContent source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.TotalBytes != null) {
            this.TotalBytes = new Long(source.TotalBytes);
        }
        if (source.SingleReplicaBytes != null) {
            this.SingleReplicaBytes = new String(source.SingleReplicaBytes);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new Long(source.BackupStatus);
        }
        if (source.BackupErrorMsg != null) {
            this.BackupErrorMsg = new String(source.BackupErrorMsg);
        }
        if (source.IsOpenCoolDown != null) {
            this.IsOpenCoolDown = new Boolean(source.IsOpenCoolDown);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "TotalBytes", this.TotalBytes);
        this.setParamSimple(map, prefix + "SingleReplicaBytes", this.SingleReplicaBytes);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "BackupErrorMsg", this.BackupErrorMsg);
        this.setParamSimple(map, prefix + "IsOpenCoolDown", this.IsOpenCoolDown);

    }
}

