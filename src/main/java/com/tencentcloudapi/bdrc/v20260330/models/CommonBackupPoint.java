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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonBackupPoint extends AbstractModel {

    /**
    * 共同时间点（精确到小时）
    */
    @SerializedName("BackupCommonTime")
    @Expose
    private String BackupCommonTime;

    /**
    * 共同备份点信息
    */
    @SerializedName("BackupDetailSet")
    @Expose
    private BackupDetail [] BackupDetailSet;

    /**
     * Get 共同时间点（精确到小时） 
     * @return BackupCommonTime 共同时间点（精确到小时）
     */
    public String getBackupCommonTime() {
        return this.BackupCommonTime;
    }

    /**
     * Set 共同时间点（精确到小时）
     * @param BackupCommonTime 共同时间点（精确到小时）
     */
    public void setBackupCommonTime(String BackupCommonTime) {
        this.BackupCommonTime = BackupCommonTime;
    }

    /**
     * Get 共同备份点信息 
     * @return BackupDetailSet 共同备份点信息
     */
    public BackupDetail [] getBackupDetailSet() {
        return this.BackupDetailSet;
    }

    /**
     * Set 共同备份点信息
     * @param BackupDetailSet 共同备份点信息
     */
    public void setBackupDetailSet(BackupDetail [] BackupDetailSet) {
        this.BackupDetailSet = BackupDetailSet;
    }

    public CommonBackupPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonBackupPoint(CommonBackupPoint source) {
        if (source.BackupCommonTime != null) {
            this.BackupCommonTime = new String(source.BackupCommonTime);
        }
        if (source.BackupDetailSet != null) {
            this.BackupDetailSet = new BackupDetail[source.BackupDetailSet.length];
            for (int i = 0; i < source.BackupDetailSet.length; i++) {
                this.BackupDetailSet[i] = new BackupDetail(source.BackupDetailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupCommonTime", this.BackupCommonTime);
        this.setParamArrayObj(map, prefix + "BackupDetailSet.", this.BackupDetailSet);

    }
}

