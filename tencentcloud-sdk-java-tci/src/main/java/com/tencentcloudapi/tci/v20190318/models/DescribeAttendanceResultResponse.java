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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttendanceResultResponse extends AbstractModel{

    /**
    * 缺失人员的ID列表(只针对请求中的libids字段)
    */
    @SerializedName("AbsenceSetInLibs")
    @Expose
    private AbsenceInfo [] AbsenceSetInLibs;

    /**
    * 确定出勤人员列表
    */
    @SerializedName("AttendanceSet")
    @Expose
    private AttendanceInfo [] AttendanceSet;

    /**
    * 疑似出勤人员列表
    */
    @SerializedName("SuspectedSet")
    @Expose
    private SuspectedInfo [] SuspectedSet;

    /**
    * 缺失人员的ID列表(只针对请求中的personids字段)
    */
    @SerializedName("AbsenceSet")
    @Expose
    private String [] AbsenceSet;

    /**
    * 请求处理进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 缺失人员的ID列表(只针对请求中的libids字段) 
     * @return AbsenceSetInLibs 缺失人员的ID列表(只针对请求中的libids字段)
     */
    public AbsenceInfo [] getAbsenceSetInLibs() {
        return this.AbsenceSetInLibs;
    }

    /**
     * Set 缺失人员的ID列表(只针对请求中的libids字段)
     * @param AbsenceSetInLibs 缺失人员的ID列表(只针对请求中的libids字段)
     */
    public void setAbsenceSetInLibs(AbsenceInfo [] AbsenceSetInLibs) {
        this.AbsenceSetInLibs = AbsenceSetInLibs;
    }

    /**
     * Get 确定出勤人员列表 
     * @return AttendanceSet 确定出勤人员列表
     */
    public AttendanceInfo [] getAttendanceSet() {
        return this.AttendanceSet;
    }

    /**
     * Set 确定出勤人员列表
     * @param AttendanceSet 确定出勤人员列表
     */
    public void setAttendanceSet(AttendanceInfo [] AttendanceSet) {
        this.AttendanceSet = AttendanceSet;
    }

    /**
     * Get 疑似出勤人员列表 
     * @return SuspectedSet 疑似出勤人员列表
     */
    public SuspectedInfo [] getSuspectedSet() {
        return this.SuspectedSet;
    }

    /**
     * Set 疑似出勤人员列表
     * @param SuspectedSet 疑似出勤人员列表
     */
    public void setSuspectedSet(SuspectedInfo [] SuspectedSet) {
        this.SuspectedSet = SuspectedSet;
    }

    /**
     * Get 缺失人员的ID列表(只针对请求中的personids字段) 
     * @return AbsenceSet 缺失人员的ID列表(只针对请求中的personids字段)
     */
    public String [] getAbsenceSet() {
        return this.AbsenceSet;
    }

    /**
     * Set 缺失人员的ID列表(只针对请求中的personids字段)
     * @param AbsenceSet 缺失人员的ID列表(只针对请求中的personids字段)
     */
    public void setAbsenceSet(String [] AbsenceSet) {
        this.AbsenceSet = AbsenceSet;
    }

    /**
     * Get 请求处理进度 
     * @return Progress 请求处理进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 请求处理进度
     * @param Progress 请求处理进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AbsenceSetInLibs.", this.AbsenceSetInLibs);
        this.setParamArrayObj(map, prefix + "AttendanceSet.", this.AttendanceSet);
        this.setParamArrayObj(map, prefix + "SuspectedSet.", this.SuspectedSet);
        this.setParamArraySimple(map, prefix + "AbsenceSet.", this.AbsenceSet);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

