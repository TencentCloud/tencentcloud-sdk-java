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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EtcdBackupSettings extends AbstractModel {

    /**
    * 备份间隔(s)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupInterval")
    @Expose
    private Long BackupInterval;

    /**
    * 最大备份个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxBackupCount")
    @Expose
    private Long MaxBackupCount;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * COS桶名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
     * Get 备份间隔(s)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupInterval 备份间隔(s)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupInterval() {
        return this.BackupInterval;
    }

    /**
     * Set 备份间隔(s)
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupInterval 备份间隔(s)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupInterval(Long BackupInterval) {
        this.BackupInterval = BackupInterval;
    }

    /**
     * Get 最大备份个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxBackupCount 最大备份个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxBackupCount() {
        return this.MaxBackupCount;
    }

    /**
     * Set 最大备份个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxBackupCount 最大备份个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxBackupCount(Long MaxBackupCount) {
        this.MaxBackupCount = MaxBackupCount;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get COS桶名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketName COS桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set COS桶名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketName COS桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    public EtcdBackupSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EtcdBackupSettings(EtcdBackupSettings source) {
        if (source.BackupInterval != null) {
            this.BackupInterval = new Long(source.BackupInterval);
        }
        if (source.MaxBackupCount != null) {
            this.MaxBackupCount = new Long(source.MaxBackupCount);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupInterval", this.BackupInterval);
        this.setParamSimple(map, prefix + "MaxBackupCount", this.MaxBackupCount);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);

    }
}

