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

public class DescribeIncrementBackupSetsRequest extends AbstractModel {

    /**
    * 备份计划 ID。
    */
    @SerializedName("BackupPlanId")
    @Expose
    private String BackupPlanId;

    /**
    * 过滤条件，备份集 ID。
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * 分页参数。取值范围为(0, 100]，默认值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数。默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 备份计划 ID。 
     * @return BackupPlanId 备份计划 ID。
     */
    public String getBackupPlanId() {
        return this.BackupPlanId;
    }

    /**
     * Set 备份计划 ID。
     * @param BackupPlanId 备份计划 ID。
     */
    public void setBackupPlanId(String BackupPlanId) {
        this.BackupPlanId = BackupPlanId;
    }

    /**
     * Get 过滤条件，备份集 ID。 
     * @return BackupSetId 过滤条件，备份集 ID。
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set 过滤条件，备份集 ID。
     * @param BackupSetId 过滤条件，备份集 ID。
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get 分页参数。取值范围为(0, 100]，默认值为20。 
     * @return Limit 分页参数。取值范围为(0, 100]，默认值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数。取值范围为(0, 100]，默认值为20。
     * @param Limit 分页参数。取值范围为(0, 100]，默认值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数。默认值为0。 
     * @return Offset 分页参数。默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数。默认值为0。
     * @param Offset 分页参数。默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeIncrementBackupSetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIncrementBackupSetsRequest(DescribeIncrementBackupSetsRequest source) {
        if (source.BackupPlanId != null) {
            this.BackupPlanId = new String(source.BackupPlanId);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new String(source.BackupSetId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupPlanId", this.BackupPlanId);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

