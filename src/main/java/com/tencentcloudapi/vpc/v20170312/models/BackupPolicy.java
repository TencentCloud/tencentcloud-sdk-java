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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupPolicy extends AbstractModel {

    /**
    * 备份周期时间，取值为monday, tuesday, wednesday, thursday, friday, saturday, sunday。
    */
    @SerializedName("BackupDay")
    @Expose
    private String BackupDay;

    /**
    * 备份时间点，格式：HH:mm:ss。
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
     * Get 备份周期时间，取值为monday, tuesday, wednesday, thursday, friday, saturday, sunday。 
     * @return BackupDay 备份周期时间，取值为monday, tuesday, wednesday, thursday, friday, saturday, sunday。
     */
    public String getBackupDay() {
        return this.BackupDay;
    }

    /**
     * Set 备份周期时间，取值为monday, tuesday, wednesday, thursday, friday, saturday, sunday。
     * @param BackupDay 备份周期时间，取值为monday, tuesday, wednesday, thursday, friday, saturday, sunday。
     */
    public void setBackupDay(String BackupDay) {
        this.BackupDay = BackupDay;
    }

    /**
     * Get 备份时间点，格式：HH:mm:ss。 
     * @return BackupTime 备份时间点，格式：HH:mm:ss。
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 备份时间点，格式：HH:mm:ss。
     * @param BackupTime 备份时间点，格式：HH:mm:ss。
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    public BackupPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPolicy(BackupPolicy source) {
        if (source.BackupDay != null) {
            this.BackupDay = new String(source.BackupDay);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupDay", this.BackupDay);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);

    }
}

