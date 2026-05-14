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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackUpSchedulesResponse extends AbstractModel {

    /**
    * <p>备份是否开启</p>
    */
    @SerializedName("BackUpOpened")
    @Expose
    private Boolean BackUpOpened;

    /**
    * <p>备份桶</p>
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * <p>备份的状态</p>
    */
    @SerializedName("BackUpStatus")
    @Expose
    private Long BackUpStatus;

    /**
    * <p>备份、迁移任务信息</p>
    */
    @SerializedName("BackupScheduleInfos")
    @Expose
    private BackupScheduleInfo [] BackupScheduleInfos;

    /**
    * <p>当前系统时间</p>
    */
    @SerializedName("CurrentTime")
    @Expose
    private String CurrentTime;

    /**
    * <p>桶加密状态信息</p>
    */
    @SerializedName("BucketEncryption")
    @Expose
    private BucketEncryptionInfo BucketEncryption;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>备份是否开启</p> 
     * @return BackUpOpened <p>备份是否开启</p>
     */
    public Boolean getBackUpOpened() {
        return this.BackUpOpened;
    }

    /**
     * Set <p>备份是否开启</p>
     * @param BackUpOpened <p>备份是否开启</p>
     */
    public void setBackUpOpened(Boolean BackUpOpened) {
        this.BackUpOpened = BackUpOpened;
    }

    /**
     * Get <p>备份桶</p> 
     * @return CosBucketName <p>备份桶</p>
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set <p>备份桶</p>
     * @param CosBucketName <p>备份桶</p>
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get <p>备份的状态</p> 
     * @return BackUpStatus <p>备份的状态</p>
     */
    public Long getBackUpStatus() {
        return this.BackUpStatus;
    }

    /**
     * Set <p>备份的状态</p>
     * @param BackUpStatus <p>备份的状态</p>
     */
    public void setBackUpStatus(Long BackUpStatus) {
        this.BackUpStatus = BackUpStatus;
    }

    /**
     * Get <p>备份、迁移任务信息</p> 
     * @return BackupScheduleInfos <p>备份、迁移任务信息</p>
     */
    public BackupScheduleInfo [] getBackupScheduleInfos() {
        return this.BackupScheduleInfos;
    }

    /**
     * Set <p>备份、迁移任务信息</p>
     * @param BackupScheduleInfos <p>备份、迁移任务信息</p>
     */
    public void setBackupScheduleInfos(BackupScheduleInfo [] BackupScheduleInfos) {
        this.BackupScheduleInfos = BackupScheduleInfos;
    }

    /**
     * Get <p>当前系统时间</p> 
     * @return CurrentTime <p>当前系统时间</p>
     */
    public String getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set <p>当前系统时间</p>
     * @param CurrentTime <p>当前系统时间</p>
     */
    public void setCurrentTime(String CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get <p>桶加密状态信息</p> 
     * @return BucketEncryption <p>桶加密状态信息</p>
     */
    public BucketEncryptionInfo getBucketEncryption() {
        return this.BucketEncryption;
    }

    /**
     * Set <p>桶加密状态信息</p>
     * @param BucketEncryption <p>桶加密状态信息</p>
     */
    public void setBucketEncryption(BucketEncryptionInfo BucketEncryption) {
        this.BucketEncryption = BucketEncryption;
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

    public DescribeBackUpSchedulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackUpSchedulesResponse(DescribeBackUpSchedulesResponse source) {
        if (source.BackUpOpened != null) {
            this.BackUpOpened = new Boolean(source.BackUpOpened);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.BackUpStatus != null) {
            this.BackUpStatus = new Long(source.BackUpStatus);
        }
        if (source.BackupScheduleInfos != null) {
            this.BackupScheduleInfos = new BackupScheduleInfo[source.BackupScheduleInfos.length];
            for (int i = 0; i < source.BackupScheduleInfos.length; i++) {
                this.BackupScheduleInfos[i] = new BackupScheduleInfo(source.BackupScheduleInfos[i]);
            }
        }
        if (source.CurrentTime != null) {
            this.CurrentTime = new String(source.CurrentTime);
        }
        if (source.BucketEncryption != null) {
            this.BucketEncryption = new BucketEncryptionInfo(source.BucketEncryption);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackUpOpened", this.BackUpOpened);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "BackUpStatus", this.BackUpStatus);
        this.setParamArrayObj(map, prefix + "BackupScheduleInfos.", this.BackupScheduleInfos);
        this.setParamSimple(map, prefix + "CurrentTime", this.CurrentTime);
        this.setParamObj(map, prefix + "BucketEncryption.", this.BucketEncryption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

