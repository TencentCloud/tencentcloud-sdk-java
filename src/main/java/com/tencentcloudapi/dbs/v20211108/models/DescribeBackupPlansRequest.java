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

public class DescribeBackupPlansRequest extends AbstractModel {

    /**
    * 过滤条件，备份计划 ID。
    */
    @SerializedName("BackupPlanId")
    @Expose
    private String BackupPlanId;

    /**
    * 过滤条件，备份计划状态。
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 过滤条件，数据库类型。
    */
    @SerializedName("DatabaseType")
    @Expose
    private String [] DatabaseType;

    /**
    * 过滤条件，接入访问类型。
    */
    @SerializedName("AccessType")
    @Expose
    private String [] AccessType;

    /**
    * 过滤条件，备份计划名称。
    */
    @SerializedName("BackupPlanName")
    @Expose
    private String BackupPlanName;

    /**
    * 过滤条件，标签键值。
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

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
     * Get 过滤条件，备份计划 ID。 
     * @return BackupPlanId 过滤条件，备份计划 ID。
     */
    public String getBackupPlanId() {
        return this.BackupPlanId;
    }

    /**
     * Set 过滤条件，备份计划 ID。
     * @param BackupPlanId 过滤条件，备份计划 ID。
     */
    public void setBackupPlanId(String BackupPlanId) {
        this.BackupPlanId = BackupPlanId;
    }

    /**
     * Get 过滤条件，备份计划状态。 
     * @return Status 过滤条件，备份计划状态。
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 过滤条件，备份计划状态。
     * @param Status 过滤条件，备份计划状态。
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 过滤条件，数据库类型。 
     * @return DatabaseType 过滤条件，数据库类型。
     */
    public String [] getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set 过滤条件，数据库类型。
     * @param DatabaseType 过滤条件，数据库类型。
     */
    public void setDatabaseType(String [] DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get 过滤条件，接入访问类型。 
     * @return AccessType 过滤条件，接入访问类型。
     */
    public String [] getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 过滤条件，接入访问类型。
     * @param AccessType 过滤条件，接入访问类型。
     */
    public void setAccessType(String [] AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 过滤条件，备份计划名称。 
     * @return BackupPlanName 过滤条件，备份计划名称。
     */
    public String getBackupPlanName() {
        return this.BackupPlanName;
    }

    /**
     * Set 过滤条件，备份计划名称。
     * @param BackupPlanName 过滤条件，备份计划名称。
     */
    public void setBackupPlanName(String BackupPlanName) {
        this.BackupPlanName = BackupPlanName;
    }

    /**
     * Get 过滤条件，标签键值。 
     * @return TagFilters 过滤条件，标签键值。
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 过滤条件，标签键值。
     * @param TagFilters 过滤条件，标签键值。
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
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

    public DescribeBackupPlansRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupPlansRequest(DescribeBackupPlansRequest source) {
        if (source.BackupPlanId != null) {
            this.BackupPlanId = new String(source.BackupPlanId);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.DatabaseType != null) {
            this.DatabaseType = new String[source.DatabaseType.length];
            for (int i = 0; i < source.DatabaseType.length; i++) {
                this.DatabaseType[i] = new String(source.DatabaseType[i]);
            }
        }
        if (source.AccessType != null) {
            this.AccessType = new String[source.AccessType.length];
            for (int i = 0; i < source.AccessType.length; i++) {
                this.AccessType[i] = new String(source.AccessType[i]);
            }
        }
        if (source.BackupPlanName != null) {
            this.BackupPlanName = new String(source.BackupPlanName);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
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
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "DatabaseType.", this.DatabaseType);
        this.setParamArraySimple(map, prefix + "AccessType.", this.AccessType);
        this.setParamSimple(map, prefix + "BackupPlanName", this.BackupPlanName);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

