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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageStrategyItem extends AbstractModel {

    /**
    * 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupRetentionPeriod")
    @Expose
    private Long BackupRetentionPeriod;

    /**
    * 全量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullStorageStrategy")
    @Expose
    private StorageStrategySingle FullStorageStrategy;

    /**
    * 增量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncStorageStrategy")
    @Expose
    private StorageStrategySingle IncStorageStrategy;

    /**
     * Get 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encryption 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encryption 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupRetentionPeriod 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupRetentionPeriod() {
        return this.BackupRetentionPeriod;
    }

    /**
     * Set 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupRetentionPeriod 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupRetentionPeriod(Long BackupRetentionPeriod) {
        this.BackupRetentionPeriod = BackupRetentionPeriod;
    }

    /**
     * Get 全量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullStorageStrategy 全量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StorageStrategySingle getFullStorageStrategy() {
        return this.FullStorageStrategy;
    }

    /**
     * Set 全量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullStorageStrategy 全量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullStorageStrategy(StorageStrategySingle FullStorageStrategy) {
        this.FullStorageStrategy = FullStorageStrategy;
    }

    /**
     * Get 增量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncStorageStrategy 增量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StorageStrategySingle getIncStorageStrategy() {
        return this.IncStorageStrategy;
    }

    /**
     * Set 增量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncStorageStrategy 增量备份存储策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncStorageStrategy(StorageStrategySingle IncStorageStrategy) {
        this.IncStorageStrategy = IncStorageStrategy;
    }

    public StorageStrategyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageStrategyItem(StorageStrategyItem source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.BackupRetentionPeriod != null) {
            this.BackupRetentionPeriod = new Long(source.BackupRetentionPeriod);
        }
        if (source.FullStorageStrategy != null) {
            this.FullStorageStrategy = new StorageStrategySingle(source.FullStorageStrategy);
        }
        if (source.IncStorageStrategy != null) {
            this.IncStorageStrategy = new StorageStrategySingle(source.IncStorageStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "BackupRetentionPeriod", this.BackupRetentionPeriod);
        this.setParamObj(map, prefix + "FullStorageStrategy.", this.FullStorageStrategy);
        this.setParamObj(map, prefix + "IncStorageStrategy.", this.IncStorageStrategy);

    }
}

