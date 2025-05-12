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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceBackupsResponse extends AbstractModel {

    /**
    * 备份文件总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 废弃字段。
    */
    @SerializedName("BackupSet")
    @Expose
    private BinlogInfo [] BackupSet;

    /**
    * 实例备份信息列表。
    */
    @SerializedName("BackupRecord")
    @Expose
    private BackupInfo [] BackupRecord;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份文件总数。 
     * @return TotalCount 备份文件总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 备份文件总数。
     * @param TotalCount 备份文件总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 废弃字段。 
     * @return BackupSet 废弃字段。
     * @deprecated
     */
    @Deprecated
    public BinlogInfo [] getBackupSet() {
        return this.BackupSet;
    }

    /**
     * Set 废弃字段。
     * @param BackupSet 废弃字段。
     * @deprecated
     */
    @Deprecated
    public void setBackupSet(BinlogInfo [] BackupSet) {
        this.BackupSet = BackupSet;
    }

    /**
     * Get 实例备份信息列表。 
     * @return BackupRecord 实例备份信息列表。
     */
    public BackupInfo [] getBackupRecord() {
        return this.BackupRecord;
    }

    /**
     * Set 实例备份信息列表。
     * @param BackupRecord 实例备份信息列表。
     */
    public void setBackupRecord(BackupInfo [] BackupRecord) {
        this.BackupRecord = BackupRecord;
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

    public DescribeInstanceBackupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceBackupsResponse(DescribeInstanceBackupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BackupSet != null) {
            this.BackupSet = new BinlogInfo[source.BackupSet.length];
            for (int i = 0; i < source.BackupSet.length; i++) {
                this.BackupSet[i] = new BinlogInfo(source.BackupSet[i]);
            }
        }
        if (source.BackupRecord != null) {
            this.BackupRecord = new BackupInfo[source.BackupRecord.length];
            for (int i = 0; i < source.BackupRecord.length; i++) {
                this.BackupRecord[i] = new BackupInfo(source.BackupRecord[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "BackupSet.", this.BackupSet);
        this.setParamArrayObj(map, prefix + "BackupRecord.", this.BackupRecord);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

