/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackUpTablesRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0为默认。1时是对远端的doris进行备份，不周期，一次性。2时为cos恢复，一次性
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * 远端doris集群的连接信息
    */
    @SerializedName("DorisSourceInfo")
    @Expose
    private DorisSourceInfo DorisSourceInfo;

    /**
    * cos信息
    */
    @SerializedName("CosSourceInfo")
    @Expose
    private CosSourceInfo CosSourceInfo;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 0为默认。1时是对远端的doris进行备份，不周期，一次性。2时为cos恢复，一次性 
     * @return BackupType 0为默认。1时是对远端的doris进行备份，不周期，一次性。2时为cos恢复，一次性
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 0为默认。1时是对远端的doris进行备份，不周期，一次性。2时为cos恢复，一次性
     * @param BackupType 0为默认。1时是对远端的doris进行备份，不周期，一次性。2时为cos恢复，一次性
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 远端doris集群的连接信息 
     * @return DorisSourceInfo 远端doris集群的连接信息
     */
    public DorisSourceInfo getDorisSourceInfo() {
        return this.DorisSourceInfo;
    }

    /**
     * Set 远端doris集群的连接信息
     * @param DorisSourceInfo 远端doris集群的连接信息
     */
    public void setDorisSourceInfo(DorisSourceInfo DorisSourceInfo) {
        this.DorisSourceInfo = DorisSourceInfo;
    }

    /**
     * Get cos信息 
     * @return CosSourceInfo cos信息
     */
    public CosSourceInfo getCosSourceInfo() {
        return this.CosSourceInfo;
    }

    /**
     * Set cos信息
     * @param CosSourceInfo cos信息
     */
    public void setCosSourceInfo(CosSourceInfo CosSourceInfo) {
        this.CosSourceInfo = CosSourceInfo;
    }

    public DescribeBackUpTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackUpTablesRequest(DescribeBackUpTablesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.DorisSourceInfo != null) {
            this.DorisSourceInfo = new DorisSourceInfo(source.DorisSourceInfo);
        }
        if (source.CosSourceInfo != null) {
            this.CosSourceInfo = new CosSourceInfo(source.CosSourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamObj(map, prefix + "DorisSourceInfo.", this.DorisSourceInfo);
        this.setParamObj(map, prefix + "CosSourceInfo.", this.CosSourceInfo);

    }
}

