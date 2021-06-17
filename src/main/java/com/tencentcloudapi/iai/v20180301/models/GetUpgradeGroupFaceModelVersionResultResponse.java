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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUpgradeGroupFaceModelVersionResultResponse extends AbstractModel{

    /**
    * 人员升级任务预估结束时间。 StartTimestamp的值是自 Unix 纪元时间到人员查重任务预估结束的毫秒数。  
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
如果为0表示这个任务已经执行完毕。
    */
    @SerializedName("EndTimestamp")
    @Expose
    private Long EndTimestamp;

    /**
    * 升级任务完成进度。取值[0.0，100.0]。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 0表示升级中，1表示升级完毕，2表示回滚完毕。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * 人员库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 无法升级的人脸Id信息，文件格式为json。半小时有效
    */
    @SerializedName("FailedFacesUrl")
    @Expose
    private String FailedFacesUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员升级任务预估结束时间。 StartTimestamp的值是自 Unix 纪元时间到人员查重任务预估结束的毫秒数。  
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
如果为0表示这个任务已经执行完毕。 
     * @return EndTimestamp 人员升级任务预估结束时间。 StartTimestamp的值是自 Unix 纪元时间到人员查重任务预估结束的毫秒数。  
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
如果为0表示这个任务已经执行完毕。
     */
    public Long getEndTimestamp() {
        return this.EndTimestamp;
    }

    /**
     * Set 人员升级任务预估结束时间。 StartTimestamp的值是自 Unix 纪元时间到人员查重任务预估结束的毫秒数。  
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
如果为0表示这个任务已经执行完毕。
     * @param EndTimestamp 人员升级任务预估结束时间。 StartTimestamp的值是自 Unix 纪元时间到人员查重任务预估结束的毫秒数。  
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
如果为0表示这个任务已经执行完毕。
     */
    public void setEndTimestamp(Long EndTimestamp) {
        this.EndTimestamp = EndTimestamp;
    }

    /**
     * Get 升级任务完成进度。取值[0.0，100.0]。 
     * @return Progress 升级任务完成进度。取值[0.0，100.0]。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 升级任务完成进度。取值[0.0，100.0]。
     * @param Progress 升级任务完成进度。取值[0.0，100.0]。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 0表示升级中，1表示升级完毕，2表示回滚完毕。 
     * @return Status 0表示升级中，1表示升级完毕，2表示回滚完毕。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0表示升级中，1表示升级完毕，2表示回滚完毕。
     * @param Status 0表示升级中，1表示升级完毕，2表示回滚完毕。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 无法升级的人脸Id信息，文件格式为json。半小时有效 
     * @return FailedFacesUrl 无法升级的人脸Id信息，文件格式为json。半小时有效
     */
    public String getFailedFacesUrl() {
        return this.FailedFacesUrl;
    }

    /**
     * Set 无法升级的人脸Id信息，文件格式为json。半小时有效
     * @param FailedFacesUrl 无法升级的人脸Id信息，文件格式为json。半小时有效
     */
    public void setFailedFacesUrl(String FailedFacesUrl) {
        this.FailedFacesUrl = FailedFacesUrl;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetUpgradeGroupFaceModelVersionResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUpgradeGroupFaceModelVersionResultResponse(GetUpgradeGroupFaceModelVersionResultResponse source) {
        if (source.EndTimestamp != null) {
            this.EndTimestamp = new Long(source.EndTimestamp);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.FromFaceModelVersion != null) {
            this.FromFaceModelVersion = new String(source.FromFaceModelVersion);
        }
        if (source.ToFaceModelVersion != null) {
            this.ToFaceModelVersion = new String(source.ToFaceModelVersion);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.FailedFacesUrl != null) {
            this.FailedFacesUrl = new String(source.FailedFacesUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndTimestamp", this.EndTimestamp);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FromFaceModelVersion", this.FromFaceModelVersion);
        this.setParamSimple(map, prefix + "ToFaceModelVersion", this.ToFaceModelVersion);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "FailedFacesUrl", this.FailedFacesUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

