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

public class ModifyMigrateRateLimitRequest extends AbstractModel {

    /**
    * <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>迁移任务全量导出线程数、有效值为 1-16</p>
    */
    @SerializedName("DumpThread")
    @Expose
    private Long DumpThread;

    /**
    * <p>迁移全量导出的 Rps 限制、需要大于 0</p>
    */
    @SerializedName("DumpRps")
    @Expose
    private Long DumpRps;

    /**
    * <p>全量导出Bps，单位MB/s，MongoDB专用，上限80</p>
    */
    @SerializedName("DumpBps")
    @Expose
    private Long DumpBps;

    /**
    * <p>迁移任务全量导入线程数、有效值为 1-16</p>
    */
    @SerializedName("LoadThread")
    @Expose
    private Long LoadThread;

    /**
    * <p>迁移任务增量导入线程数、有效值为 1-128</p>
    */
    @SerializedName("SinkerThread")
    @Expose
    private Long SinkerThread;

    /**
    * <p>全量导入Rps限制</p>
    */
    @SerializedName("LoadRps")
    @Expose
    private Long LoadRps;

    /**
    * <p>导入BPS，单位MB/s。目前仅对redis生效，表示目标库单分片流量限制大小</p>
    */
    @SerializedName("LoadBps")
    @Expose
    private Long LoadBps;

    /**
    * <p>目标库分片数，目前仅对redis生效</p>
    */
    @SerializedName("DstShardCount")
    @Expose
    private Long DstShardCount;

    /**
    * <p>增量导入Rps，MongoDB专用，上限30000</p>
    */
    @SerializedName("SinkerRps")
    @Expose
    private Long SinkerRps;

    /**
    * <p>增量导入Bps，单位MB/s，MongoDB专用，上限120</p>
    */
    @SerializedName("SinkerBps")
    @Expose
    private Long SinkerBps;

    /**
     * Get <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p> 
     * @return JobId <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
     * @param JobId <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>迁移任务全量导出线程数、有效值为 1-16</p> 
     * @return DumpThread <p>迁移任务全量导出线程数、有效值为 1-16</p>
     */
    public Long getDumpThread() {
        return this.DumpThread;
    }

    /**
     * Set <p>迁移任务全量导出线程数、有效值为 1-16</p>
     * @param DumpThread <p>迁移任务全量导出线程数、有效值为 1-16</p>
     */
    public void setDumpThread(Long DumpThread) {
        this.DumpThread = DumpThread;
    }

    /**
     * Get <p>迁移全量导出的 Rps 限制、需要大于 0</p> 
     * @return DumpRps <p>迁移全量导出的 Rps 限制、需要大于 0</p>
     */
    public Long getDumpRps() {
        return this.DumpRps;
    }

    /**
     * Set <p>迁移全量导出的 Rps 限制、需要大于 0</p>
     * @param DumpRps <p>迁移全量导出的 Rps 限制、需要大于 0</p>
     */
    public void setDumpRps(Long DumpRps) {
        this.DumpRps = DumpRps;
    }

    /**
     * Get <p>全量导出Bps，单位MB/s，MongoDB专用，上限80</p> 
     * @return DumpBps <p>全量导出Bps，单位MB/s，MongoDB专用，上限80</p>
     */
    public Long getDumpBps() {
        return this.DumpBps;
    }

    /**
     * Set <p>全量导出Bps，单位MB/s，MongoDB专用，上限80</p>
     * @param DumpBps <p>全量导出Bps，单位MB/s，MongoDB专用，上限80</p>
     */
    public void setDumpBps(Long DumpBps) {
        this.DumpBps = DumpBps;
    }

    /**
     * Get <p>迁移任务全量导入线程数、有效值为 1-16</p> 
     * @return LoadThread <p>迁移任务全量导入线程数、有效值为 1-16</p>
     */
    public Long getLoadThread() {
        return this.LoadThread;
    }

    /**
     * Set <p>迁移任务全量导入线程数、有效值为 1-16</p>
     * @param LoadThread <p>迁移任务全量导入线程数、有效值为 1-16</p>
     */
    public void setLoadThread(Long LoadThread) {
        this.LoadThread = LoadThread;
    }

    /**
     * Get <p>迁移任务增量导入线程数、有效值为 1-128</p> 
     * @return SinkerThread <p>迁移任务增量导入线程数、有效值为 1-128</p>
     */
    public Long getSinkerThread() {
        return this.SinkerThread;
    }

    /**
     * Set <p>迁移任务增量导入线程数、有效值为 1-128</p>
     * @param SinkerThread <p>迁移任务增量导入线程数、有效值为 1-128</p>
     */
    public void setSinkerThread(Long SinkerThread) {
        this.SinkerThread = SinkerThread;
    }

    /**
     * Get <p>全量导入Rps限制</p> 
     * @return LoadRps <p>全量导入Rps限制</p>
     */
    public Long getLoadRps() {
        return this.LoadRps;
    }

    /**
     * Set <p>全量导入Rps限制</p>
     * @param LoadRps <p>全量导入Rps限制</p>
     */
    public void setLoadRps(Long LoadRps) {
        this.LoadRps = LoadRps;
    }

    /**
     * Get <p>导入BPS，单位MB/s。目前仅对redis生效，表示目标库单分片流量限制大小</p> 
     * @return LoadBps <p>导入BPS，单位MB/s。目前仅对redis生效，表示目标库单分片流量限制大小</p>
     */
    public Long getLoadBps() {
        return this.LoadBps;
    }

    /**
     * Set <p>导入BPS，单位MB/s。目前仅对redis生效，表示目标库单分片流量限制大小</p>
     * @param LoadBps <p>导入BPS，单位MB/s。目前仅对redis生效，表示目标库单分片流量限制大小</p>
     */
    public void setLoadBps(Long LoadBps) {
        this.LoadBps = LoadBps;
    }

    /**
     * Get <p>目标库分片数，目前仅对redis生效</p> 
     * @return DstShardCount <p>目标库分片数，目前仅对redis生效</p>
     */
    public Long getDstShardCount() {
        return this.DstShardCount;
    }

    /**
     * Set <p>目标库分片数，目前仅对redis生效</p>
     * @param DstShardCount <p>目标库分片数，目前仅对redis生效</p>
     */
    public void setDstShardCount(Long DstShardCount) {
        this.DstShardCount = DstShardCount;
    }

    /**
     * Get <p>增量导入Rps，MongoDB专用，上限30000</p> 
     * @return SinkerRps <p>增量导入Rps，MongoDB专用，上限30000</p>
     */
    public Long getSinkerRps() {
        return this.SinkerRps;
    }

    /**
     * Set <p>增量导入Rps，MongoDB专用，上限30000</p>
     * @param SinkerRps <p>增量导入Rps，MongoDB专用，上限30000</p>
     */
    public void setSinkerRps(Long SinkerRps) {
        this.SinkerRps = SinkerRps;
    }

    /**
     * Get <p>增量导入Bps，单位MB/s，MongoDB专用，上限120</p> 
     * @return SinkerBps <p>增量导入Bps，单位MB/s，MongoDB专用，上限120</p>
     */
    public Long getSinkerBps() {
        return this.SinkerBps;
    }

    /**
     * Set <p>增量导入Bps，单位MB/s，MongoDB专用，上限120</p>
     * @param SinkerBps <p>增量导入Bps，单位MB/s，MongoDB专用，上限120</p>
     */
    public void setSinkerBps(Long SinkerBps) {
        this.SinkerBps = SinkerBps;
    }

    public ModifyMigrateRateLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMigrateRateLimitRequest(ModifyMigrateRateLimitRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.DumpThread != null) {
            this.DumpThread = new Long(source.DumpThread);
        }
        if (source.DumpRps != null) {
            this.DumpRps = new Long(source.DumpRps);
        }
        if (source.DumpBps != null) {
            this.DumpBps = new Long(source.DumpBps);
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
        if (source.LoadBps != null) {
            this.LoadBps = new Long(source.LoadBps);
        }
        if (source.DstShardCount != null) {
            this.DstShardCount = new Long(source.DstShardCount);
        }
        if (source.SinkerRps != null) {
            this.SinkerRps = new Long(source.SinkerRps);
        }
        if (source.SinkerBps != null) {
            this.SinkerBps = new Long(source.SinkerBps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "DumpThread", this.DumpThread);
        this.setParamSimple(map, prefix + "DumpRps", this.DumpRps);
        this.setParamSimple(map, prefix + "DumpBps", this.DumpBps);
        this.setParamSimple(map, prefix + "LoadThread", this.LoadThread);
        this.setParamSimple(map, prefix + "SinkerThread", this.SinkerThread);
        this.setParamSimple(map, prefix + "LoadRps", this.LoadRps);
        this.setParamSimple(map, prefix + "LoadBps", this.LoadBps);
        this.setParamSimple(map, prefix + "DstShardCount", this.DstShardCount);
        this.setParamSimple(map, prefix + "SinkerRps", this.SinkerRps);
        this.setParamSimple(map, prefix + "SinkerBps", this.SinkerBps);

    }
}

