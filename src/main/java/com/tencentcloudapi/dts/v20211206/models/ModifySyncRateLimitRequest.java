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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySyncRateLimitRequest extends AbstractModel {

    /**
    * <p>同步任务ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>同步任务全量导出线程数、有效值为 1-16</p>
    */
    @SerializedName("DumpThread")
    @Expose
    private Long DumpThread;

    /**
    * <p>同步任务全量导出的 Rps 限制、需要大于 0;对于mongodb最大值为20000，其他数据库最大值为50000000</p>
    */
    @SerializedName("DumpRps")
    @Expose
    private Long DumpRps;

    /**
    * <p>同步任务全量导入线程数、有效值为 1-16</p>
    */
    @SerializedName("LoadThread")
    @Expose
    private Long LoadThread;

    /**
    * <p>同步任务增量导入线程数、有效值为 1-128</p>
    */
    @SerializedName("SinkerThread")
    @Expose
    private Long SinkerThread;

    /**
    * <p>同步任务全量导入的Rps</p>
    */
    @SerializedName("LoadRps")
    @Expose
    private Long LoadRps;

    /**
     * Get <p>同步任务ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p> 
     * @return JobId <p>同步任务ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>同步任务ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     * @param JobId <p>同步任务ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>同步任务全量导出线程数、有效值为 1-16</p> 
     * @return DumpThread <p>同步任务全量导出线程数、有效值为 1-16</p>
     */
    public Long getDumpThread() {
        return this.DumpThread;
    }

    /**
     * Set <p>同步任务全量导出线程数、有效值为 1-16</p>
     * @param DumpThread <p>同步任务全量导出线程数、有效值为 1-16</p>
     */
    public void setDumpThread(Long DumpThread) {
        this.DumpThread = DumpThread;
    }

    /**
     * Get <p>同步任务全量导出的 Rps 限制、需要大于 0;对于mongodb最大值为20000，其他数据库最大值为50000000</p> 
     * @return DumpRps <p>同步任务全量导出的 Rps 限制、需要大于 0;对于mongodb最大值为20000，其他数据库最大值为50000000</p>
     */
    public Long getDumpRps() {
        return this.DumpRps;
    }

    /**
     * Set <p>同步任务全量导出的 Rps 限制、需要大于 0;对于mongodb最大值为20000，其他数据库最大值为50000000</p>
     * @param DumpRps <p>同步任务全量导出的 Rps 限制、需要大于 0;对于mongodb最大值为20000，其他数据库最大值为50000000</p>
     */
    public void setDumpRps(Long DumpRps) {
        this.DumpRps = DumpRps;
    }

    /**
     * Get <p>同步任务全量导入线程数、有效值为 1-16</p> 
     * @return LoadThread <p>同步任务全量导入线程数、有效值为 1-16</p>
     */
    public Long getLoadThread() {
        return this.LoadThread;
    }

    /**
     * Set <p>同步任务全量导入线程数、有效值为 1-16</p>
     * @param LoadThread <p>同步任务全量导入线程数、有效值为 1-16</p>
     */
    public void setLoadThread(Long LoadThread) {
        this.LoadThread = LoadThread;
    }

    /**
     * Get <p>同步任务增量导入线程数、有效值为 1-128</p> 
     * @return SinkerThread <p>同步任务增量导入线程数、有效值为 1-128</p>
     */
    public Long getSinkerThread() {
        return this.SinkerThread;
    }

    /**
     * Set <p>同步任务增量导入线程数、有效值为 1-128</p>
     * @param SinkerThread <p>同步任务增量导入线程数、有效值为 1-128</p>
     */
    public void setSinkerThread(Long SinkerThread) {
        this.SinkerThread = SinkerThread;
    }

    /**
     * Get <p>同步任务全量导入的Rps</p> 
     * @return LoadRps <p>同步任务全量导入的Rps</p>
     */
    public Long getLoadRps() {
        return this.LoadRps;
    }

    /**
     * Set <p>同步任务全量导入的Rps</p>
     * @param LoadRps <p>同步任务全量导入的Rps</p>
     */
    public void setLoadRps(Long LoadRps) {
        this.LoadRps = LoadRps;
    }

    public ModifySyncRateLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySyncRateLimitRequest(ModifySyncRateLimitRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.DumpThread != null) {
            this.DumpThread = new Long(source.DumpThread);
        }
        if (source.DumpRps != null) {
            this.DumpRps = new Long(source.DumpRps);
        }
        if (source.LoadThread != null) {
            this.LoadThread = new Long(source.LoadThread);
        }
        if (source.SinkerThread != null) {
            this.SinkerThread = new Long(source.SinkerThread);
        }
        if (source.LoadRps != null) {
            this.LoadRps = new Long(source.LoadRps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "DumpThread", this.DumpThread);
        this.setParamSimple(map, prefix + "DumpRps", this.DumpRps);
        this.setParamSimple(map, prefix + "LoadThread", this.LoadThread);
        this.setParamSimple(map, prefix + "SinkerThread", this.SinkerThread);
        this.setParamSimple(map, prefix + "LoadRps", this.LoadRps);

    }
}

