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

public class DescribeBackupVaultsDeniedActionsResponse extends AbstractModel {

    /**
    * 备份库不允许操作信息
    */
    @SerializedName("BackupVaultDeniedActionSet")
    @Expose
    private VaultDeniedAction [] BackupVaultDeniedActionSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份库不允许操作信息 
     * @return BackupVaultDeniedActionSet 备份库不允许操作信息
     */
    public VaultDeniedAction [] getBackupVaultDeniedActionSet() {
        return this.BackupVaultDeniedActionSet;
    }

    /**
     * Set 备份库不允许操作信息
     * @param BackupVaultDeniedActionSet 备份库不允许操作信息
     */
    public void setBackupVaultDeniedActionSet(VaultDeniedAction [] BackupVaultDeniedActionSet) {
        this.BackupVaultDeniedActionSet = BackupVaultDeniedActionSet;
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

    public DescribeBackupVaultsDeniedActionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupVaultsDeniedActionsResponse(DescribeBackupVaultsDeniedActionsResponse source) {
        if (source.BackupVaultDeniedActionSet != null) {
            this.BackupVaultDeniedActionSet = new VaultDeniedAction[source.BackupVaultDeniedActionSet.length];
            for (int i = 0; i < source.BackupVaultDeniedActionSet.length; i++) {
                this.BackupVaultDeniedActionSet[i] = new VaultDeniedAction(source.BackupVaultDeniedActionSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BackupVaultDeniedActionSet.", this.BackupVaultDeniedActionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

