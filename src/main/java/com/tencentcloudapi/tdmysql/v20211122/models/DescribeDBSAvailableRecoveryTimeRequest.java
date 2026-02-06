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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSAvailableRecoveryTimeRequest extends AbstractModel {

    /**
    * <p>db实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>备份集ID,值来自 DescribeDBSBackupSets 接口返回</p>
    */
    @SerializedName("BackupSetId")
    @Expose
    private Long BackupSetId;

    /**
     * Get <p>db实例ID</p> 
     * @return InstanceId <p>db实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>db实例ID</p>
     * @param InstanceId <p>db实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>备份集ID,值来自 DescribeDBSBackupSets 接口返回</p> 
     * @return BackupSetId <p>备份集ID,值来自 DescribeDBSBackupSets 接口返回</p>
     */
    public Long getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set <p>备份集ID,值来自 DescribeDBSBackupSets 接口返回</p>
     * @param BackupSetId <p>备份集ID,值来自 DescribeDBSBackupSets 接口返回</p>
     */
    public void setBackupSetId(Long BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    public DescribeDBSAvailableRecoveryTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSAvailableRecoveryTimeRequest(DescribeDBSAvailableRecoveryTimeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new Long(source.BackupSetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);

    }
}

