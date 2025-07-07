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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeJobInfo extends AbstractModel {

    /**
    * 人员库升级任务ID，用于查询、获取升级的进度和结果。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 人员库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 当前算法模型版本。
    */
    @SerializedName("FromFaceModelVersion")
    @Expose
    private String FromFaceModelVersion;

    /**
    * 目标算法模型版本。
    */
    @SerializedName("ToFaceModelVersion")
    @Expose
    private String ToFaceModelVersion;

    /**
    * 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 人员库升级任务ID，用于查询、获取升级的进度和结果。 
     * @return JobId 人员库升级任务ID，用于查询、获取升级的进度和结果。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 人员库升级任务ID，用于查询、获取升级的进度和结果。
     * @param JobId 人员库升级任务ID，用于查询、获取升级的进度和结果。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 人员库ID。 
     * @return GroupId 人员库ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库ID。
     * @param GroupId 人员库ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 当前算法模型版本。 
     * @return FromFaceModelVersion 当前算法模型版本。
     */
    public String getFromFaceModelVersion() {
        return this.FromFaceModelVersion;
    }

    /**
     * Set 当前算法模型版本。
     * @param FromFaceModelVersion 当前算法模型版本。
     */
    public void setFromFaceModelVersion(String FromFaceModelVersion) {
        this.FromFaceModelVersion = FromFaceModelVersion;
    }

    /**
     * Get 目标算法模型版本。 
     * @return ToFaceModelVersion 目标算法模型版本。
     */
    public String getToFaceModelVersion() {
        return this.ToFaceModelVersion;
    }

    /**
     * Set 目标算法模型版本。
     * @param ToFaceModelVersion 目标算法模型版本。
     */
    public void setToFaceModelVersion(String ToFaceModelVersion) {
        this.ToFaceModelVersion = ToFaceModelVersion;
    }

    /**
     * Get 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。 
     * @return StartTime 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     * @param StartTime 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。 
     * @return Status 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。
     * @param Status 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpgradeJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeJobInfo(UpgradeJobInfo source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.FromFaceModelVersion != null) {
            this.FromFaceModelVersion = new String(source.FromFaceModelVersion);
        }
        if (source.ToFaceModelVersion != null) {
            this.ToFaceModelVersion = new String(source.ToFaceModelVersion);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "FromFaceModelVersion", this.FromFaceModelVersion);
        this.setParamSimple(map, prefix + "ToFaceModelVersion", this.ToFaceModelVersion);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

