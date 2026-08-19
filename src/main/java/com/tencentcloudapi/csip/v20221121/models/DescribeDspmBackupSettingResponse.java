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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmBackupSettingResponse extends AbstractModel {

    /**
    * <p>备份日志保留时长</p>
    */
    @SerializedName("BackupLogSaveTime")
    @Expose
    private Long BackupLogSaveTime;

    /**
    * <p>恢复日志保留时长</p>
    */
    @SerializedName("RestoreLogSaveTime")
    @Expose
    private Long RestoreLogSaveTime;

    /**
    * <p>日志最大生命周期限制</p>
    */
    @SerializedName("LogMaxSaveTime")
    @Expose
    private Long LogMaxSaveTime;

    /**
    * <p>在线日志最大天数限制</p>
    */
    @SerializedName("OnlineLogMaxSaveTime")
    @Expose
    private Long OnlineLogMaxSaveTime;

    /**
    * <p>最大在线日志条数，单位是：个</p>
    */
    @SerializedName("MaxOnlineLogCount")
    @Expose
    private Long MaxOnlineLogCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>备份日志保留时长</p> 
     * @return BackupLogSaveTime <p>备份日志保留时长</p>
     */
    public Long getBackupLogSaveTime() {
        return this.BackupLogSaveTime;
    }

    /**
     * Set <p>备份日志保留时长</p>
     * @param BackupLogSaveTime <p>备份日志保留时长</p>
     */
    public void setBackupLogSaveTime(Long BackupLogSaveTime) {
        this.BackupLogSaveTime = BackupLogSaveTime;
    }

    /**
     * Get <p>恢复日志保留时长</p> 
     * @return RestoreLogSaveTime <p>恢复日志保留时长</p>
     */
    public Long getRestoreLogSaveTime() {
        return this.RestoreLogSaveTime;
    }

    /**
     * Set <p>恢复日志保留时长</p>
     * @param RestoreLogSaveTime <p>恢复日志保留时长</p>
     */
    public void setRestoreLogSaveTime(Long RestoreLogSaveTime) {
        this.RestoreLogSaveTime = RestoreLogSaveTime;
    }

    /**
     * Get <p>日志最大生命周期限制</p> 
     * @return LogMaxSaveTime <p>日志最大生命周期限制</p>
     */
    public Long getLogMaxSaveTime() {
        return this.LogMaxSaveTime;
    }

    /**
     * Set <p>日志最大生命周期限制</p>
     * @param LogMaxSaveTime <p>日志最大生命周期限制</p>
     */
    public void setLogMaxSaveTime(Long LogMaxSaveTime) {
        this.LogMaxSaveTime = LogMaxSaveTime;
    }

    /**
     * Get <p>在线日志最大天数限制</p> 
     * @return OnlineLogMaxSaveTime <p>在线日志最大天数限制</p>
     */
    public Long getOnlineLogMaxSaveTime() {
        return this.OnlineLogMaxSaveTime;
    }

    /**
     * Set <p>在线日志最大天数限制</p>
     * @param OnlineLogMaxSaveTime <p>在线日志最大天数限制</p>
     */
    public void setOnlineLogMaxSaveTime(Long OnlineLogMaxSaveTime) {
        this.OnlineLogMaxSaveTime = OnlineLogMaxSaveTime;
    }

    /**
     * Get <p>最大在线日志条数，单位是：个</p> 
     * @return MaxOnlineLogCount <p>最大在线日志条数，单位是：个</p>
     */
    public Long getMaxOnlineLogCount() {
        return this.MaxOnlineLogCount;
    }

    /**
     * Set <p>最大在线日志条数，单位是：个</p>
     * @param MaxOnlineLogCount <p>最大在线日志条数，单位是：个</p>
     */
    public void setMaxOnlineLogCount(Long MaxOnlineLogCount) {
        this.MaxOnlineLogCount = MaxOnlineLogCount;
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

    public DescribeDspmBackupSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmBackupSettingResponse(DescribeDspmBackupSettingResponse source) {
        if (source.BackupLogSaveTime != null) {
            this.BackupLogSaveTime = new Long(source.BackupLogSaveTime);
        }
        if (source.RestoreLogSaveTime != null) {
            this.RestoreLogSaveTime = new Long(source.RestoreLogSaveTime);
        }
        if (source.LogMaxSaveTime != null) {
            this.LogMaxSaveTime = new Long(source.LogMaxSaveTime);
        }
        if (source.OnlineLogMaxSaveTime != null) {
            this.OnlineLogMaxSaveTime = new Long(source.OnlineLogMaxSaveTime);
        }
        if (source.MaxOnlineLogCount != null) {
            this.MaxOnlineLogCount = new Long(source.MaxOnlineLogCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupLogSaveTime", this.BackupLogSaveTime);
        this.setParamSimple(map, prefix + "RestoreLogSaveTime", this.RestoreLogSaveTime);
        this.setParamSimple(map, prefix + "LogMaxSaveTime", this.LogMaxSaveTime);
        this.setParamSimple(map, prefix + "OnlineLogMaxSaveTime", this.OnlineLogMaxSaveTime);
        this.setParamSimple(map, prefix + "MaxOnlineLogCount", this.MaxOnlineLogCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

