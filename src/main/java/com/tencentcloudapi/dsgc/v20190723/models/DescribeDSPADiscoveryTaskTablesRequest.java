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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPADiscoveryTaskTablesRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 数据库扫描结果ID
    */
    @SerializedName("DbResultId")
    @Expose
    private Long DbResultId;

    /**
    * db名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 任务扫描id
    */
    @SerializedName("ScanResultId")
    @Expose
    private Long ScanResultId;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 数据库扫描结果ID 
     * @return DbResultId 数据库扫描结果ID
     * @deprecated
     */
    @Deprecated
    public Long getDbResultId() {
        return this.DbResultId;
    }

    /**
     * Set 数据库扫描结果ID
     * @param DbResultId 数据库扫描结果ID
     * @deprecated
     */
    @Deprecated
    public void setDbResultId(Long DbResultId) {
        this.DbResultId = DbResultId;
    }

    /**
     * Get db名称 
     * @return DbName db名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set db名称
     * @param DbName db名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 任务扫描id 
     * @return ScanResultId 任务扫描id
     */
    public Long getScanResultId() {
        return this.ScanResultId;
    }

    /**
     * Set 任务扫描id
     * @param ScanResultId 任务扫描id
     */
    public void setScanResultId(Long ScanResultId) {
        this.ScanResultId = ScanResultId;
    }

    public DescribeDSPADiscoveryTaskTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPADiscoveryTaskTablesRequest(DescribeDSPADiscoveryTaskTablesRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.DbResultId != null) {
            this.DbResultId = new Long(source.DbResultId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.ScanResultId != null) {
            this.ScanResultId = new Long(source.ScanResultId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DbResultId", this.DbResultId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "ScanResultId", this.ScanResultId);

    }
}

