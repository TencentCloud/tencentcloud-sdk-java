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

public class DescribeBackupOverviewGeneralResponse extends AbstractModel {

    /**
    * <p>整机备份（CVM 备份组）概览数据</p>
    */
    @SerializedName("InstanceBackupOverview")
    @Expose
    private InstanceBackupOverview InstanceBackupOverview;

    /**
    * <p>文件备份概览数据</p>
    */
    @SerializedName("FileBackupOverview")
    @Expose
    private FileBackupOverview FileBackupOverview;

    /**
    * <p>备份策略概览</p>
    */
    @SerializedName("BackupPolicyOverview")
    @Expose
    private BackupPolicyOverview BackupPolicyOverview;

    /**
    * <p>备份库概览</p>
    */
    @SerializedName("BackupVaultOverview")
    @Expose
    private BackupVaultOverview BackupVaultOverview;

    /**
    * <p>受保护资源概览</p>
    */
    @SerializedName("ProtectedResourceOverview")
    @Expose
    private ProtectedResourceOverview ProtectedResourceOverview;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>整机备份（CVM 备份组）概览数据</p> 
     * @return InstanceBackupOverview <p>整机备份（CVM 备份组）概览数据</p>
     */
    public InstanceBackupOverview getInstanceBackupOverview() {
        return this.InstanceBackupOverview;
    }

    /**
     * Set <p>整机备份（CVM 备份组）概览数据</p>
     * @param InstanceBackupOverview <p>整机备份（CVM 备份组）概览数据</p>
     */
    public void setInstanceBackupOverview(InstanceBackupOverview InstanceBackupOverview) {
        this.InstanceBackupOverview = InstanceBackupOverview;
    }

    /**
     * Get <p>文件备份概览数据</p> 
     * @return FileBackupOverview <p>文件备份概览数据</p>
     */
    public FileBackupOverview getFileBackupOverview() {
        return this.FileBackupOverview;
    }

    /**
     * Set <p>文件备份概览数据</p>
     * @param FileBackupOverview <p>文件备份概览数据</p>
     */
    public void setFileBackupOverview(FileBackupOverview FileBackupOverview) {
        this.FileBackupOverview = FileBackupOverview;
    }

    /**
     * Get <p>备份策略概览</p> 
     * @return BackupPolicyOverview <p>备份策略概览</p>
     */
    public BackupPolicyOverview getBackupPolicyOverview() {
        return this.BackupPolicyOverview;
    }

    /**
     * Set <p>备份策略概览</p>
     * @param BackupPolicyOverview <p>备份策略概览</p>
     */
    public void setBackupPolicyOverview(BackupPolicyOverview BackupPolicyOverview) {
        this.BackupPolicyOverview = BackupPolicyOverview;
    }

    /**
     * Get <p>备份库概览</p> 
     * @return BackupVaultOverview <p>备份库概览</p>
     */
    public BackupVaultOverview getBackupVaultOverview() {
        return this.BackupVaultOverview;
    }

    /**
     * Set <p>备份库概览</p>
     * @param BackupVaultOverview <p>备份库概览</p>
     */
    public void setBackupVaultOverview(BackupVaultOverview BackupVaultOverview) {
        this.BackupVaultOverview = BackupVaultOverview;
    }

    /**
     * Get <p>受保护资源概览</p> 
     * @return ProtectedResourceOverview <p>受保护资源概览</p>
     */
    public ProtectedResourceOverview getProtectedResourceOverview() {
        return this.ProtectedResourceOverview;
    }

    /**
     * Set <p>受保护资源概览</p>
     * @param ProtectedResourceOverview <p>受保护资源概览</p>
     */
    public void setProtectedResourceOverview(ProtectedResourceOverview ProtectedResourceOverview) {
        this.ProtectedResourceOverview = ProtectedResourceOverview;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupOverviewGeneralResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupOverviewGeneralResponse(DescribeBackupOverviewGeneralResponse source) {
        if (source.InstanceBackupOverview != null) {
            this.InstanceBackupOverview = new InstanceBackupOverview(source.InstanceBackupOverview);
        }
        if (source.FileBackupOverview != null) {
            this.FileBackupOverview = new FileBackupOverview(source.FileBackupOverview);
        }
        if (source.BackupPolicyOverview != null) {
            this.BackupPolicyOverview = new BackupPolicyOverview(source.BackupPolicyOverview);
        }
        if (source.BackupVaultOverview != null) {
            this.BackupVaultOverview = new BackupVaultOverview(source.BackupVaultOverview);
        }
        if (source.ProtectedResourceOverview != null) {
            this.ProtectedResourceOverview = new ProtectedResourceOverview(source.ProtectedResourceOverview);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceBackupOverview.", this.InstanceBackupOverview);
        this.setParamObj(map, prefix + "FileBackupOverview.", this.FileBackupOverview);
        this.setParamObj(map, prefix + "BackupPolicyOverview.", this.BackupPolicyOverview);
        this.setParamObj(map, prefix + "BackupVaultOverview.", this.BackupVaultOverview);
        this.setParamObj(map, prefix + "ProtectedResourceOverview.", this.ProtectedResourceOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

