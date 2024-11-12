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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulFixStatusResponse extends AbstractModel {

    /**
    * 开始修复时间
    */
    @SerializedName("FixStartTime")
    @Expose
    private String FixStartTime;

    /**
    * 修复结束时间，为空表示还没结束
    */
    @SerializedName("FixEndTime")
    @Expose
    private String FixEndTime;

    /**
    * 修复成功的主机数
    */
    @SerializedName("FixSuccessCnt")
    @Expose
    private Long FixSuccessCnt;

    /**
    * 修复失败的主机数
    */
    @SerializedName("FixFailCnt")
    @Expose
    private Long FixFailCnt;

    /**
    * 主机总数
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * 修复的任务id
    */
    @SerializedName("FixId")
    @Expose
    private Long FixId;

    /**
    * 修复快照状态列表
    */
    @SerializedName("SnapshotList")
    @Expose
    private VulFixStatusSnapshotInfo [] SnapshotList;

    /**
    * 修复漏洞详情列表
    */
    @SerializedName("VulFixList")
    @Expose
    private VulFixStatusInfo [] VulFixList;

    /**
    * 快照创建进度0-100
    */
    @SerializedName("SnapshotProgress")
    @Expose
    private Long SnapshotProgress;

    /**
    * 修复进度 0-100
    */
    @SerializedName("FixProgress")
    @Expose
    private Long FixProgress;

    /**
    * 预计剩余时间（单位秒）
    */
    @SerializedName("RemainingTime")
    @Expose
    private Long RemainingTime;

    /**
    * 快照是否是重试状态 0=非重试  1=重试
    */
    @SerializedName("IsRetrySnapshot")
    @Expose
    private Long IsRetrySnapshot;

    /**
    * 快照创建失败数
    */
    @SerializedName("SnapshotFailCnt")
    @Expose
    private Long SnapshotFailCnt;

    /**
    * 是否允许重试 0:不允许 1：允许
    */
    @SerializedName("IsAllowRetry")
    @Expose
    private Long IsAllowRetry;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 开始修复时间 
     * @return FixStartTime 开始修复时间
     */
    public String getFixStartTime() {
        return this.FixStartTime;
    }

    /**
     * Set 开始修复时间
     * @param FixStartTime 开始修复时间
     */
    public void setFixStartTime(String FixStartTime) {
        this.FixStartTime = FixStartTime;
    }

    /**
     * Get 修复结束时间，为空表示还没结束 
     * @return FixEndTime 修复结束时间，为空表示还没结束
     */
    public String getFixEndTime() {
        return this.FixEndTime;
    }

    /**
     * Set 修复结束时间，为空表示还没结束
     * @param FixEndTime 修复结束时间，为空表示还没结束
     */
    public void setFixEndTime(String FixEndTime) {
        this.FixEndTime = FixEndTime;
    }

    /**
     * Get 修复成功的主机数 
     * @return FixSuccessCnt 修复成功的主机数
     */
    public Long getFixSuccessCnt() {
        return this.FixSuccessCnt;
    }

    /**
     * Set 修复成功的主机数
     * @param FixSuccessCnt 修复成功的主机数
     */
    public void setFixSuccessCnt(Long FixSuccessCnt) {
        this.FixSuccessCnt = FixSuccessCnt;
    }

    /**
     * Get 修复失败的主机数 
     * @return FixFailCnt 修复失败的主机数
     */
    public Long getFixFailCnt() {
        return this.FixFailCnt;
    }

    /**
     * Set 修复失败的主机数
     * @param FixFailCnt 修复失败的主机数
     */
    public void setFixFailCnt(Long FixFailCnt) {
        this.FixFailCnt = FixFailCnt;
    }

    /**
     * Get 主机总数 
     * @return HostCnt 主机总数
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set 主机总数
     * @param HostCnt 主机总数
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get 修复的任务id 
     * @return FixId 修复的任务id
     */
    public Long getFixId() {
        return this.FixId;
    }

    /**
     * Set 修复的任务id
     * @param FixId 修复的任务id
     */
    public void setFixId(Long FixId) {
        this.FixId = FixId;
    }

    /**
     * Get 修复快照状态列表 
     * @return SnapshotList 修复快照状态列表
     */
    public VulFixStatusSnapshotInfo [] getSnapshotList() {
        return this.SnapshotList;
    }

    /**
     * Set 修复快照状态列表
     * @param SnapshotList 修复快照状态列表
     */
    public void setSnapshotList(VulFixStatusSnapshotInfo [] SnapshotList) {
        this.SnapshotList = SnapshotList;
    }

    /**
     * Get 修复漏洞详情列表 
     * @return VulFixList 修复漏洞详情列表
     */
    public VulFixStatusInfo [] getVulFixList() {
        return this.VulFixList;
    }

    /**
     * Set 修复漏洞详情列表
     * @param VulFixList 修复漏洞详情列表
     */
    public void setVulFixList(VulFixStatusInfo [] VulFixList) {
        this.VulFixList = VulFixList;
    }

    /**
     * Get 快照创建进度0-100 
     * @return SnapshotProgress 快照创建进度0-100
     */
    public Long getSnapshotProgress() {
        return this.SnapshotProgress;
    }

    /**
     * Set 快照创建进度0-100
     * @param SnapshotProgress 快照创建进度0-100
     */
    public void setSnapshotProgress(Long SnapshotProgress) {
        this.SnapshotProgress = SnapshotProgress;
    }

    /**
     * Get 修复进度 0-100 
     * @return FixProgress 修复进度 0-100
     */
    public Long getFixProgress() {
        return this.FixProgress;
    }

    /**
     * Set 修复进度 0-100
     * @param FixProgress 修复进度 0-100
     */
    public void setFixProgress(Long FixProgress) {
        this.FixProgress = FixProgress;
    }

    /**
     * Get 预计剩余时间（单位秒） 
     * @return RemainingTime 预计剩余时间（单位秒）
     */
    public Long getRemainingTime() {
        return this.RemainingTime;
    }

    /**
     * Set 预计剩余时间（单位秒）
     * @param RemainingTime 预计剩余时间（单位秒）
     */
    public void setRemainingTime(Long RemainingTime) {
        this.RemainingTime = RemainingTime;
    }

    /**
     * Get 快照是否是重试状态 0=非重试  1=重试 
     * @return IsRetrySnapshot 快照是否是重试状态 0=非重试  1=重试
     */
    public Long getIsRetrySnapshot() {
        return this.IsRetrySnapshot;
    }

    /**
     * Set 快照是否是重试状态 0=非重试  1=重试
     * @param IsRetrySnapshot 快照是否是重试状态 0=非重试  1=重试
     */
    public void setIsRetrySnapshot(Long IsRetrySnapshot) {
        this.IsRetrySnapshot = IsRetrySnapshot;
    }

    /**
     * Get 快照创建失败数 
     * @return SnapshotFailCnt 快照创建失败数
     */
    public Long getSnapshotFailCnt() {
        return this.SnapshotFailCnt;
    }

    /**
     * Set 快照创建失败数
     * @param SnapshotFailCnt 快照创建失败数
     */
    public void setSnapshotFailCnt(Long SnapshotFailCnt) {
        this.SnapshotFailCnt = SnapshotFailCnt;
    }

    /**
     * Get 是否允许重试 0:不允许 1：允许 
     * @return IsAllowRetry 是否允许重试 0:不允许 1：允许
     */
    public Long getIsAllowRetry() {
        return this.IsAllowRetry;
    }

    /**
     * Set 是否允许重试 0:不允许 1：允许
     * @param IsAllowRetry 是否允许重试 0:不允许 1：允许
     */
    public void setIsAllowRetry(Long IsAllowRetry) {
        this.IsAllowRetry = IsAllowRetry;
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

    public DescribeVulFixStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixStatusResponse(DescribeVulFixStatusResponse source) {
        if (source.FixStartTime != null) {
            this.FixStartTime = new String(source.FixStartTime);
        }
        if (source.FixEndTime != null) {
            this.FixEndTime = new String(source.FixEndTime);
        }
        if (source.FixSuccessCnt != null) {
            this.FixSuccessCnt = new Long(source.FixSuccessCnt);
        }
        if (source.FixFailCnt != null) {
            this.FixFailCnt = new Long(source.FixFailCnt);
        }
        if (source.HostCnt != null) {
            this.HostCnt = new Long(source.HostCnt);
        }
        if (source.FixId != null) {
            this.FixId = new Long(source.FixId);
        }
        if (source.SnapshotList != null) {
            this.SnapshotList = new VulFixStatusSnapshotInfo[source.SnapshotList.length];
            for (int i = 0; i < source.SnapshotList.length; i++) {
                this.SnapshotList[i] = new VulFixStatusSnapshotInfo(source.SnapshotList[i]);
            }
        }
        if (source.VulFixList != null) {
            this.VulFixList = new VulFixStatusInfo[source.VulFixList.length];
            for (int i = 0; i < source.VulFixList.length; i++) {
                this.VulFixList[i] = new VulFixStatusInfo(source.VulFixList[i]);
            }
        }
        if (source.SnapshotProgress != null) {
            this.SnapshotProgress = new Long(source.SnapshotProgress);
        }
        if (source.FixProgress != null) {
            this.FixProgress = new Long(source.FixProgress);
        }
        if (source.RemainingTime != null) {
            this.RemainingTime = new Long(source.RemainingTime);
        }
        if (source.IsRetrySnapshot != null) {
            this.IsRetrySnapshot = new Long(source.IsRetrySnapshot);
        }
        if (source.SnapshotFailCnt != null) {
            this.SnapshotFailCnt = new Long(source.SnapshotFailCnt);
        }
        if (source.IsAllowRetry != null) {
            this.IsAllowRetry = new Long(source.IsAllowRetry);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FixStartTime", this.FixStartTime);
        this.setParamSimple(map, prefix + "FixEndTime", this.FixEndTime);
        this.setParamSimple(map, prefix + "FixSuccessCnt", this.FixSuccessCnt);
        this.setParamSimple(map, prefix + "FixFailCnt", this.FixFailCnt);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "FixId", this.FixId);
        this.setParamArrayObj(map, prefix + "SnapshotList.", this.SnapshotList);
        this.setParamArrayObj(map, prefix + "VulFixList.", this.VulFixList);
        this.setParamSimple(map, prefix + "SnapshotProgress", this.SnapshotProgress);
        this.setParamSimple(map, prefix + "FixProgress", this.FixProgress);
        this.setParamSimple(map, prefix + "RemainingTime", this.RemainingTime);
        this.setParamSimple(map, prefix + "IsRetrySnapshot", this.IsRetrySnapshot);
        this.setParamSimple(map, prefix + "SnapshotFailCnt", this.SnapshotFailCnt);
        this.setParamSimple(map, prefix + "IsAllowRetry", this.IsAllowRetry);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

