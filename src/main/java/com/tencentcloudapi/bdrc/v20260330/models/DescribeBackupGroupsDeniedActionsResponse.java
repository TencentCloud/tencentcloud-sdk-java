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

public class DescribeBackupGroupsDeniedActionsResponse extends AbstractModel {

    /**
    * 备份组不允许操作信息
    */
    @SerializedName("BackupGroupDeniedActionSet")
    @Expose
    private BackupGroupDeniedAction [] BackupGroupDeniedActionSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份组不允许操作信息 
     * @return BackupGroupDeniedActionSet 备份组不允许操作信息
     */
    public BackupGroupDeniedAction [] getBackupGroupDeniedActionSet() {
        return this.BackupGroupDeniedActionSet;
    }

    /**
     * Set 备份组不允许操作信息
     * @param BackupGroupDeniedActionSet 备份组不允许操作信息
     */
    public void setBackupGroupDeniedActionSet(BackupGroupDeniedAction [] BackupGroupDeniedActionSet) {
        this.BackupGroupDeniedActionSet = BackupGroupDeniedActionSet;
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

    public DescribeBackupGroupsDeniedActionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupGroupsDeniedActionsResponse(DescribeBackupGroupsDeniedActionsResponse source) {
        if (source.BackupGroupDeniedActionSet != null) {
            this.BackupGroupDeniedActionSet = new BackupGroupDeniedAction[source.BackupGroupDeniedActionSet.length];
            for (int i = 0; i < source.BackupGroupDeniedActionSet.length; i++) {
                this.BackupGroupDeniedActionSet[i] = new BackupGroupDeniedAction(source.BackupGroupDeniedActionSet[i]);
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
        this.setParamArrayObj(map, prefix + "BackupGroupDeniedActionSet.", this.BackupGroupDeniedActionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

