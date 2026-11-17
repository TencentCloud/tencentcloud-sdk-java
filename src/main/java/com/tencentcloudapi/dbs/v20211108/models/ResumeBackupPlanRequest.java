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

public class ResumeBackupPlanRequest extends AbstractModel {

    /**
    * 备份计划 ID。可通过 DescribeBackupPlans 接口获取。
    */
    @SerializedName("BackupPlanId")
    @Expose
    private String BackupPlanId;

    /**
    * 恢复后是否立即发起一次备份。取值：
- 0：不立即备份，默认值
- 1：立即备份
    */
    @SerializedName("BackupNow")
    @Expose
    private Long BackupNow;

    /**
     * Get 备份计划 ID。可通过 DescribeBackupPlans 接口获取。 
     * @return BackupPlanId 备份计划 ID。可通过 DescribeBackupPlans 接口获取。
     */
    public String getBackupPlanId() {
        return this.BackupPlanId;
    }

    /**
     * Set 备份计划 ID。可通过 DescribeBackupPlans 接口获取。
     * @param BackupPlanId 备份计划 ID。可通过 DescribeBackupPlans 接口获取。
     */
    public void setBackupPlanId(String BackupPlanId) {
        this.BackupPlanId = BackupPlanId;
    }

    /**
     * Get 恢复后是否立即发起一次备份。取值：
- 0：不立即备份，默认值
- 1：立即备份 
     * @return BackupNow 恢复后是否立即发起一次备份。取值：
- 0：不立即备份，默认值
- 1：立即备份
     */
    public Long getBackupNow() {
        return this.BackupNow;
    }

    /**
     * Set 恢复后是否立即发起一次备份。取值：
- 0：不立即备份，默认值
- 1：立即备份
     * @param BackupNow 恢复后是否立即发起一次备份。取值：
- 0：不立即备份，默认值
- 1：立即备份
     */
    public void setBackupNow(Long BackupNow) {
        this.BackupNow = BackupNow;
    }

    public ResumeBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResumeBackupPlanRequest(ResumeBackupPlanRequest source) {
        if (source.BackupPlanId != null) {
            this.BackupPlanId = new String(source.BackupPlanId);
        }
        if (source.BackupNow != null) {
            this.BackupNow = new Long(source.BackupNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupPlanId", this.BackupPlanId);
        this.setParamSimple(map, prefix + "BackupNow", this.BackupNow);

    }
}

