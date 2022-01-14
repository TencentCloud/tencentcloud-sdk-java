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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContainerSecEventSummaryResponse extends AbstractModel{

    /**
    * 未处理逃逸事件
    */
    @SerializedName("UnhandledEscapeCnt")
    @Expose
    private Long UnhandledEscapeCnt;

    /**
    * 未处理反弹shell事件
    */
    @SerializedName("UnhandledReverseShellCnt")
    @Expose
    private Long UnhandledReverseShellCnt;

    /**
    * 未处理高危系统调用
    */
    @SerializedName("UnhandledRiskSyscallCnt")
    @Expose
    private Long UnhandledRiskSyscallCnt;

    /**
    * 未处理异常进程
    */
    @SerializedName("UnhandledAbnormalProcessCnt")
    @Expose
    private Long UnhandledAbnormalProcessCnt;

    /**
    * 未处理文件篡改
    */
    @SerializedName("UnhandledFileCnt")
    @Expose
    private Long UnhandledFileCnt;

    /**
    * 未处理木马事件
    */
    @SerializedName("UnhandledVirusEventCnt")
    @Expose
    private Long UnhandledVirusEventCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 未处理逃逸事件 
     * @return UnhandledEscapeCnt 未处理逃逸事件
     */
    public Long getUnhandledEscapeCnt() {
        return this.UnhandledEscapeCnt;
    }

    /**
     * Set 未处理逃逸事件
     * @param UnhandledEscapeCnt 未处理逃逸事件
     */
    public void setUnhandledEscapeCnt(Long UnhandledEscapeCnt) {
        this.UnhandledEscapeCnt = UnhandledEscapeCnt;
    }

    /**
     * Get 未处理反弹shell事件 
     * @return UnhandledReverseShellCnt 未处理反弹shell事件
     */
    public Long getUnhandledReverseShellCnt() {
        return this.UnhandledReverseShellCnt;
    }

    /**
     * Set 未处理反弹shell事件
     * @param UnhandledReverseShellCnt 未处理反弹shell事件
     */
    public void setUnhandledReverseShellCnt(Long UnhandledReverseShellCnt) {
        this.UnhandledReverseShellCnt = UnhandledReverseShellCnt;
    }

    /**
     * Get 未处理高危系统调用 
     * @return UnhandledRiskSyscallCnt 未处理高危系统调用
     */
    public Long getUnhandledRiskSyscallCnt() {
        return this.UnhandledRiskSyscallCnt;
    }

    /**
     * Set 未处理高危系统调用
     * @param UnhandledRiskSyscallCnt 未处理高危系统调用
     */
    public void setUnhandledRiskSyscallCnt(Long UnhandledRiskSyscallCnt) {
        this.UnhandledRiskSyscallCnt = UnhandledRiskSyscallCnt;
    }

    /**
     * Get 未处理异常进程 
     * @return UnhandledAbnormalProcessCnt 未处理异常进程
     */
    public Long getUnhandledAbnormalProcessCnt() {
        return this.UnhandledAbnormalProcessCnt;
    }

    /**
     * Set 未处理异常进程
     * @param UnhandledAbnormalProcessCnt 未处理异常进程
     */
    public void setUnhandledAbnormalProcessCnt(Long UnhandledAbnormalProcessCnt) {
        this.UnhandledAbnormalProcessCnt = UnhandledAbnormalProcessCnt;
    }

    /**
     * Get 未处理文件篡改 
     * @return UnhandledFileCnt 未处理文件篡改
     */
    public Long getUnhandledFileCnt() {
        return this.UnhandledFileCnt;
    }

    /**
     * Set 未处理文件篡改
     * @param UnhandledFileCnt 未处理文件篡改
     */
    public void setUnhandledFileCnt(Long UnhandledFileCnt) {
        this.UnhandledFileCnt = UnhandledFileCnt;
    }

    /**
     * Get 未处理木马事件 
     * @return UnhandledVirusEventCnt 未处理木马事件
     */
    public Long getUnhandledVirusEventCnt() {
        return this.UnhandledVirusEventCnt;
    }

    /**
     * Set 未处理木马事件
     * @param UnhandledVirusEventCnt 未处理木马事件
     */
    public void setUnhandledVirusEventCnt(Long UnhandledVirusEventCnt) {
        this.UnhandledVirusEventCnt = UnhandledVirusEventCnt;
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

    public DescribeContainerSecEventSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContainerSecEventSummaryResponse(DescribeContainerSecEventSummaryResponse source) {
        if (source.UnhandledEscapeCnt != null) {
            this.UnhandledEscapeCnt = new Long(source.UnhandledEscapeCnt);
        }
        if (source.UnhandledReverseShellCnt != null) {
            this.UnhandledReverseShellCnt = new Long(source.UnhandledReverseShellCnt);
        }
        if (source.UnhandledRiskSyscallCnt != null) {
            this.UnhandledRiskSyscallCnt = new Long(source.UnhandledRiskSyscallCnt);
        }
        if (source.UnhandledAbnormalProcessCnt != null) {
            this.UnhandledAbnormalProcessCnt = new Long(source.UnhandledAbnormalProcessCnt);
        }
        if (source.UnhandledFileCnt != null) {
            this.UnhandledFileCnt = new Long(source.UnhandledFileCnt);
        }
        if (source.UnhandledVirusEventCnt != null) {
            this.UnhandledVirusEventCnt = new Long(source.UnhandledVirusEventCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnhandledEscapeCnt", this.UnhandledEscapeCnt);
        this.setParamSimple(map, prefix + "UnhandledReverseShellCnt", this.UnhandledReverseShellCnt);
        this.setParamSimple(map, prefix + "UnhandledRiskSyscallCnt", this.UnhandledRiskSyscallCnt);
        this.setParamSimple(map, prefix + "UnhandledAbnormalProcessCnt", this.UnhandledAbnormalProcessCnt);
        this.setParamSimple(map, prefix + "UnhandledFileCnt", this.UnhandledFileCnt);
        this.setParamSimple(map, prefix + "UnhandledVirusEventCnt", this.UnhandledVirusEventCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

