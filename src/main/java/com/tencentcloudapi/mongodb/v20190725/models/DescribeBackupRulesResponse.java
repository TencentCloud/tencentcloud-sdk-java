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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupRulesResponse extends AbstractModel {

    /**
    * 备份数据保留期限。单位为：天。
    */
    @SerializedName("BackupSaveTime")
    @Expose
    private Long BackupSaveTime;

    /**
    * 自动备份开始时间。
    */
    @SerializedName("BackupTime")
    @Expose
    private Long BackupTime;

    /**
    * 备份方式。
- 0：逻辑备份。
- 1：物理备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份数据保留期限。单位为：天。 
     * @return BackupSaveTime 备份数据保留期限。单位为：天。
     */
    public Long getBackupSaveTime() {
        return this.BackupSaveTime;
    }

    /**
     * Set 备份数据保留期限。单位为：天。
     * @param BackupSaveTime 备份数据保留期限。单位为：天。
     */
    public void setBackupSaveTime(Long BackupSaveTime) {
        this.BackupSaveTime = BackupSaveTime;
    }

    /**
     * Get 自动备份开始时间。 
     * @return BackupTime 自动备份开始时间。
     */
    public Long getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 自动备份开始时间。
     * @param BackupTime 自动备份开始时间。
     */
    public void setBackupTime(Long BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get 备份方式。
- 0：逻辑备份。
- 1：物理备份。 
     * @return BackupMethod 备份方式。
- 0：逻辑备份。
- 1：物理备份。
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式。
- 0：逻辑备份。
- 1：物理备份。
     * @param BackupMethod 备份方式。
- 0：逻辑备份。
- 1：物理备份。
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
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

    public DescribeBackupRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupRulesResponse(DescribeBackupRulesResponse source) {
        if (source.BackupSaveTime != null) {
            this.BackupSaveTime = new Long(source.BackupSaveTime);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new Long(source.BackupTime);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupSaveTime", this.BackupSaveTime);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

