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

public class StorageStrategy extends AbstractModel {

    /**
    * 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。
    */
    @SerializedName("BackupRetentionPeriod")
    @Expose
    private Long BackupRetentionPeriod;

    /**
     * Get 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。 
     * @return StorageType 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。
     * @param StorageType 存储类型。目前仅支持 "system" - DBS 内置存储。默认值为 "system"。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。 
     * @return Encryption 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。
     * @param Encryption 加密方式。可能的取值为：
"UnEncrypted" - 非加密存储;
"SSE-COS" - 内置加密存储;
当该参数用作入参时，默认值为 "UnEncrypted"。
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。 
     * @return BackupRetentionPeriod 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。
     */
    public Long getBackupRetentionPeriod() {
        return this.BackupRetentionPeriod;
    }

    /**
     * Set 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。
     * @param BackupRetentionPeriod 日志保留时间，单位为天。取值范围为[7, 3650]，默认值为 30。
     */
    public void setBackupRetentionPeriod(Long BackupRetentionPeriod) {
        this.BackupRetentionPeriod = BackupRetentionPeriod;
    }

    public StorageStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageStrategy(StorageStrategy source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.BackupRetentionPeriod != null) {
            this.BackupRetentionPeriod = new Long(source.BackupRetentionPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "BackupRetentionPeriod", this.BackupRetentionPeriod);

    }
}

