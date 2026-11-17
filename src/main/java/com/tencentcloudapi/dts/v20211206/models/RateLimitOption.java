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

public class RateLimitOption extends AbstractModel {

    /**
    * <p>当前生效的全量导出线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p>
    */
    @SerializedName("CurrentDumpThread")
    @Expose
    private Long CurrentDumpThread;

    /**
    * <p>默认的全量导出线程数，该字段仅在出参有意义</p>
    */
    @SerializedName("DefaultDumpThread")
    @Expose
    private Long DefaultDumpThread;

    /**
    * <p>当前生效的全量导出Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
    */
    @SerializedName("CurrentDumpRps")
    @Expose
    private Long CurrentDumpRps;

    /**
    * <p>默认的全量导出Rps，该字段仅在出参有意义</p>
    */
    @SerializedName("DefaultDumpRps")
    @Expose
    private Long DefaultDumpRps;

    /**
    * <p>当前生效的全量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p>
    */
    @SerializedName("CurrentLoadThread")
    @Expose
    private Long CurrentLoadThread;

    /**
    * <p>默认的全量导入线程数，该字段仅在出参有意义</p>
    */
    @SerializedName("DefaultLoadThread")
    @Expose
    private Long DefaultLoadThread;

    /**
    * <p>当前生效的全量导入Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
    */
    @SerializedName("CurrentLoadRps")
    @Expose
    private Long CurrentLoadRps;

    /**
    * <p>默认的全量导入Rps，该字段仅在出参有意义</p>
    */
    @SerializedName("DefaultLoadRps")
    @Expose
    private Long DefaultLoadRps;

    /**
    * <p>当前生效的增量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为128</p>
    */
    @SerializedName("CurrentSinkerThread")
    @Expose
    private Long CurrentSinkerThread;

    /**
    * <p>默认的增量导入线程数，该字段仅在出参有意义</p>
    */
    @SerializedName("DefaultSinkerThread")
    @Expose
    private Long DefaultSinkerThread;

    /**
    * <p>enum:&quot;no&quot;/&quot;yes&quot;、no表示用户未设置过限速、yes表示设置过限速，该字段仅在出参有意义</p>
    */
    @SerializedName("HasUserSetRateLimit")
    @Expose
    private String HasUserSetRateLimit;

    /**
    * <p>默认的全量导出BPS，目前仅支持mongodb链路，单位MB/s</p>
    */
    @SerializedName("DefaultDumpBps")
    @Expose
    private Long DefaultDumpBps;

    /**
    * <p>增量导入RPS，目前仅支持mongodb链路</p>
    */
    @SerializedName("CurrentSinkerRps")
    @Expose
    private Long CurrentSinkerRps;

    /**
    * <p>默认的增量导入RPS，目前仅支持mongodb链路</p>
    */
    @SerializedName("DefaultSinkerRps")
    @Expose
    private Long DefaultSinkerRps;

    /**
    * <p>当前导入BPS，暂时只有redis在用，单位MB/s</p>
    */
    @SerializedName("CurrentLoadBps")
    @Expose
    private Long CurrentLoadBps;

    /**
    * <p>目标库分片数，暂时只有redis在用</p>
    */
    @SerializedName("CurrentDstShardCount")
    @Expose
    private Long CurrentDstShardCount;

    /**
    * <p>全量导出BPS，目前仅支持mongodb链路，单位MB/s</p>
    */
    @SerializedName("CurrentDumpBps")
    @Expose
    private Long CurrentDumpBps;

    /**
    * <p>增量导入BPS，目前仅支持mongodb链路，单位MB/s</p>
    */
    @SerializedName("CurrentSinkerBps")
    @Expose
    private Long CurrentSinkerBps;

    /**
    * <p>默认的增量导入BPS，目前仅支持mongodb链路，单位MB/s</p>
    */
    @SerializedName("DefaultSinkerBps")
    @Expose
    private Long DefaultSinkerBps;

    /**
     * Get <p>当前生效的全量导出线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p> 
     * @return CurrentDumpThread <p>当前生效的全量导出线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p>
     */
    public Long getCurrentDumpThread() {
        return this.CurrentDumpThread;
    }

    /**
     * Set <p>当前生效的全量导出线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p>
     * @param CurrentDumpThread <p>当前生效的全量导出线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p>
     */
    public void setCurrentDumpThread(Long CurrentDumpThread) {
        this.CurrentDumpThread = CurrentDumpThread;
    }

    /**
     * Get <p>默认的全量导出线程数，该字段仅在出参有意义</p> 
     * @return DefaultDumpThread <p>默认的全量导出线程数，该字段仅在出参有意义</p>
     */
    public Long getDefaultDumpThread() {
        return this.DefaultDumpThread;
    }

    /**
     * Set <p>默认的全量导出线程数，该字段仅在出参有意义</p>
     * @param DefaultDumpThread <p>默认的全量导出线程数，该字段仅在出参有意义</p>
     */
    public void setDefaultDumpThread(Long DefaultDumpThread) {
        this.DefaultDumpThread = DefaultDumpThread;
    }

    /**
     * Get <p>当前生效的全量导出Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p> 
     * @return CurrentDumpRps <p>当前生效的全量导出Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     */
    public Long getCurrentDumpRps() {
        return this.CurrentDumpRps;
    }

    /**
     * Set <p>当前生效的全量导出Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     * @param CurrentDumpRps <p>当前生效的全量导出Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     */
    public void setCurrentDumpRps(Long CurrentDumpRps) {
        this.CurrentDumpRps = CurrentDumpRps;
    }

    /**
     * Get <p>默认的全量导出Rps，该字段仅在出参有意义</p> 
     * @return DefaultDumpRps <p>默认的全量导出Rps，该字段仅在出参有意义</p>
     */
    public Long getDefaultDumpRps() {
        return this.DefaultDumpRps;
    }

    /**
     * Set <p>默认的全量导出Rps，该字段仅在出参有意义</p>
     * @param DefaultDumpRps <p>默认的全量导出Rps，该字段仅在出参有意义</p>
     */
    public void setDefaultDumpRps(Long DefaultDumpRps) {
        this.DefaultDumpRps = DefaultDumpRps;
    }

    /**
     * Get <p>当前生效的全量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p> 
     * @return CurrentLoadThread <p>当前生效的全量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p>
     */
    public Long getCurrentLoadThread() {
        return this.CurrentLoadThread;
    }

    /**
     * Set <p>当前生效的全量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p>
     * @param CurrentLoadThread <p>当前生效的全量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为16</p>
     */
    public void setCurrentLoadThread(Long CurrentLoadThread) {
        this.CurrentLoadThread = CurrentLoadThread;
    }

    /**
     * Get <p>默认的全量导入线程数，该字段仅在出参有意义</p> 
     * @return DefaultLoadThread <p>默认的全量导入线程数，该字段仅在出参有意义</p>
     */
    public Long getDefaultLoadThread() {
        return this.DefaultLoadThread;
    }

    /**
     * Set <p>默认的全量导入线程数，该字段仅在出参有意义</p>
     * @param DefaultLoadThread <p>默认的全量导入线程数，该字段仅在出参有意义</p>
     */
    public void setDefaultLoadThread(Long DefaultLoadThread) {
        this.DefaultLoadThread = DefaultLoadThread;
    }

    /**
     * Get <p>当前生效的全量导入Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p> 
     * @return CurrentLoadRps <p>当前生效的全量导入Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     */
    public Long getCurrentLoadRps() {
        return this.CurrentLoadRps;
    }

    /**
     * Set <p>当前生效的全量导入Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     * @param CurrentLoadRps <p>当前生效的全量导入Rps，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     */
    public void setCurrentLoadRps(Long CurrentLoadRps) {
        this.CurrentLoadRps = CurrentLoadRps;
    }

    /**
     * Get <p>默认的全量导入Rps，该字段仅在出参有意义</p> 
     * @return DefaultLoadRps <p>默认的全量导入Rps，该字段仅在出参有意义</p>
     */
    public Long getDefaultLoadRps() {
        return this.DefaultLoadRps;
    }

    /**
     * Set <p>默认的全量导入Rps，该字段仅在出参有意义</p>
     * @param DefaultLoadRps <p>默认的全量导入Rps，该字段仅在出参有意义</p>
     */
    public void setDefaultLoadRps(Long DefaultLoadRps) {
        this.DefaultLoadRps = DefaultLoadRps;
    }

    /**
     * Get <p>当前生效的增量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为128</p> 
     * @return CurrentSinkerThread <p>当前生效的增量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为128</p>
     */
    public Long getCurrentSinkerThread() {
        return this.CurrentSinkerThread;
    }

    /**
     * Set <p>当前生效的增量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为128</p>
     * @param CurrentSinkerThread <p>当前生效的增量导入线程数，配置任务时可调整该字段值，注意：如果不设置或设置为0则表示保持当前值，最大值为128</p>
     */
    public void setCurrentSinkerThread(Long CurrentSinkerThread) {
        this.CurrentSinkerThread = CurrentSinkerThread;
    }

    /**
     * Get <p>默认的增量导入线程数，该字段仅在出参有意义</p> 
     * @return DefaultSinkerThread <p>默认的增量导入线程数，该字段仅在出参有意义</p>
     */
    public Long getDefaultSinkerThread() {
        return this.DefaultSinkerThread;
    }

    /**
     * Set <p>默认的增量导入线程数，该字段仅在出参有意义</p>
     * @param DefaultSinkerThread <p>默认的增量导入线程数，该字段仅在出参有意义</p>
     */
    public void setDefaultSinkerThread(Long DefaultSinkerThread) {
        this.DefaultSinkerThread = DefaultSinkerThread;
    }

    /**
     * Get <p>enum:&quot;no&quot;/&quot;yes&quot;、no表示用户未设置过限速、yes表示设置过限速，该字段仅在出参有意义</p> 
     * @return HasUserSetRateLimit <p>enum:&quot;no&quot;/&quot;yes&quot;、no表示用户未设置过限速、yes表示设置过限速，该字段仅在出参有意义</p>
     */
    public String getHasUserSetRateLimit() {
        return this.HasUserSetRateLimit;
    }

    /**
     * Set <p>enum:&quot;no&quot;/&quot;yes&quot;、no表示用户未设置过限速、yes表示设置过限速，该字段仅在出参有意义</p>
     * @param HasUserSetRateLimit <p>enum:&quot;no&quot;/&quot;yes&quot;、no表示用户未设置过限速、yes表示设置过限速，该字段仅在出参有意义</p>
     */
    public void setHasUserSetRateLimit(String HasUserSetRateLimit) {
        this.HasUserSetRateLimit = HasUserSetRateLimit;
    }

    /**
     * Get <p>默认的全量导出BPS，目前仅支持mongodb链路，单位MB/s</p> 
     * @return DefaultDumpBps <p>默认的全量导出BPS，目前仅支持mongodb链路，单位MB/s</p>
     */
    public Long getDefaultDumpBps() {
        return this.DefaultDumpBps;
    }

    /**
     * Set <p>默认的全量导出BPS，目前仅支持mongodb链路，单位MB/s</p>
     * @param DefaultDumpBps <p>默认的全量导出BPS，目前仅支持mongodb链路，单位MB/s</p>
     */
    public void setDefaultDumpBps(Long DefaultDumpBps) {
        this.DefaultDumpBps = DefaultDumpBps;
    }

    /**
     * Get <p>增量导入RPS，目前仅支持mongodb链路</p> 
     * @return CurrentSinkerRps <p>增量导入RPS，目前仅支持mongodb链路</p>
     */
    public Long getCurrentSinkerRps() {
        return this.CurrentSinkerRps;
    }

    /**
     * Set <p>增量导入RPS，目前仅支持mongodb链路</p>
     * @param CurrentSinkerRps <p>增量导入RPS，目前仅支持mongodb链路</p>
     */
    public void setCurrentSinkerRps(Long CurrentSinkerRps) {
        this.CurrentSinkerRps = CurrentSinkerRps;
    }

    /**
     * Get <p>默认的增量导入RPS，目前仅支持mongodb链路</p> 
     * @return DefaultSinkerRps <p>默认的增量导入RPS，目前仅支持mongodb链路</p>
     */
    public Long getDefaultSinkerRps() {
        return this.DefaultSinkerRps;
    }

    /**
     * Set <p>默认的增量导入RPS，目前仅支持mongodb链路</p>
     * @param DefaultSinkerRps <p>默认的增量导入RPS，目前仅支持mongodb链路</p>
     */
    public void setDefaultSinkerRps(Long DefaultSinkerRps) {
        this.DefaultSinkerRps = DefaultSinkerRps;
    }

    /**
     * Get <p>当前导入BPS，暂时只有redis在用，单位MB/s</p> 
     * @return CurrentLoadBps <p>当前导入BPS，暂时只有redis在用，单位MB/s</p>
     */
    public Long getCurrentLoadBps() {
        return this.CurrentLoadBps;
    }

    /**
     * Set <p>当前导入BPS，暂时只有redis在用，单位MB/s</p>
     * @param CurrentLoadBps <p>当前导入BPS，暂时只有redis在用，单位MB/s</p>
     */
    public void setCurrentLoadBps(Long CurrentLoadBps) {
        this.CurrentLoadBps = CurrentLoadBps;
    }

    /**
     * Get <p>目标库分片数，暂时只有redis在用</p> 
     * @return CurrentDstShardCount <p>目标库分片数，暂时只有redis在用</p>
     */
    public Long getCurrentDstShardCount() {
        return this.CurrentDstShardCount;
    }

    /**
     * Set <p>目标库分片数，暂时只有redis在用</p>
     * @param CurrentDstShardCount <p>目标库分片数，暂时只有redis在用</p>
     */
    public void setCurrentDstShardCount(Long CurrentDstShardCount) {
        this.CurrentDstShardCount = CurrentDstShardCount;
    }

    /**
     * Get <p>全量导出BPS，目前仅支持mongodb链路，单位MB/s</p> 
     * @return CurrentDumpBps <p>全量导出BPS，目前仅支持mongodb链路，单位MB/s</p>
     */
    public Long getCurrentDumpBps() {
        return this.CurrentDumpBps;
    }

    /**
     * Set <p>全量导出BPS，目前仅支持mongodb链路，单位MB/s</p>
     * @param CurrentDumpBps <p>全量导出BPS，目前仅支持mongodb链路，单位MB/s</p>
     */
    public void setCurrentDumpBps(Long CurrentDumpBps) {
        this.CurrentDumpBps = CurrentDumpBps;
    }

    /**
     * Get <p>增量导入BPS，目前仅支持mongodb链路，单位MB/s</p> 
     * @return CurrentSinkerBps <p>增量导入BPS，目前仅支持mongodb链路，单位MB/s</p>
     */
    public Long getCurrentSinkerBps() {
        return this.CurrentSinkerBps;
    }

    /**
     * Set <p>增量导入BPS，目前仅支持mongodb链路，单位MB/s</p>
     * @param CurrentSinkerBps <p>增量导入BPS，目前仅支持mongodb链路，单位MB/s</p>
     */
    public void setCurrentSinkerBps(Long CurrentSinkerBps) {
        this.CurrentSinkerBps = CurrentSinkerBps;
    }

    /**
     * Get <p>默认的增量导入BPS，目前仅支持mongodb链路，单位MB/s</p> 
     * @return DefaultSinkerBps <p>默认的增量导入BPS，目前仅支持mongodb链路，单位MB/s</p>
     */
    public Long getDefaultSinkerBps() {
        return this.DefaultSinkerBps;
    }

    /**
     * Set <p>默认的增量导入BPS，目前仅支持mongodb链路，单位MB/s</p>
     * @param DefaultSinkerBps <p>默认的增量导入BPS，目前仅支持mongodb链路，单位MB/s</p>
     */
    public void setDefaultSinkerBps(Long DefaultSinkerBps) {
        this.DefaultSinkerBps = DefaultSinkerBps;
    }

    public RateLimitOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitOption(RateLimitOption source) {
        if (source.CurrentDumpThread != null) {
            this.CurrentDumpThread = new Long(source.CurrentDumpThread);
        }
        if (source.DefaultDumpThread != null) {
            this.DefaultDumpThread = new Long(source.DefaultDumpThread);
        }
        if (source.CurrentDumpRps != null) {
            this.CurrentDumpRps = new Long(source.CurrentDumpRps);
        }
        if (source.DefaultDumpRps != null) {
            this.DefaultDumpRps = new Long(source.DefaultDumpRps);
        }
        if (source.CurrentLoadThread != null) {
            this.CurrentLoadThread = new Long(source.CurrentLoadThread);
        }
        if (source.DefaultLoadThread != null) {
            this.DefaultLoadThread = new Long(source.DefaultLoadThread);
        }
        if (source.CurrentLoadRps != null) {
            this.CurrentLoadRps = new Long(source.CurrentLoadRps);
        }
        if (source.DefaultLoadRps != null) {
            this.DefaultLoadRps = new Long(source.DefaultLoadRps);
        }
        if (source.CurrentSinkerThread != null) {
            this.CurrentSinkerThread = new Long(source.CurrentSinkerThread);
        }
        if (source.DefaultSinkerThread != null) {
            this.DefaultSinkerThread = new Long(source.DefaultSinkerThread);
        }
        if (source.HasUserSetRateLimit != null) {
            this.HasUserSetRateLimit = new String(source.HasUserSetRateLimit);
        }
        if (source.DefaultDumpBps != null) {
            this.DefaultDumpBps = new Long(source.DefaultDumpBps);
        }
        if (source.CurrentSinkerRps != null) {
            this.CurrentSinkerRps = new Long(source.CurrentSinkerRps);
        }
        if (source.DefaultSinkerRps != null) {
            this.DefaultSinkerRps = new Long(source.DefaultSinkerRps);
        }
        if (source.CurrentLoadBps != null) {
            this.CurrentLoadBps = new Long(source.CurrentLoadBps);
        }
        if (source.CurrentDstShardCount != null) {
            this.CurrentDstShardCount = new Long(source.CurrentDstShardCount);
        }
        if (source.CurrentDumpBps != null) {
            this.CurrentDumpBps = new Long(source.CurrentDumpBps);
        }
        if (source.CurrentSinkerBps != null) {
            this.CurrentSinkerBps = new Long(source.CurrentSinkerBps);
        }
        if (source.DefaultSinkerBps != null) {
            this.DefaultSinkerBps = new Long(source.DefaultSinkerBps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentDumpThread", this.CurrentDumpThread);
        this.setParamSimple(map, prefix + "DefaultDumpThread", this.DefaultDumpThread);
        this.setParamSimple(map, prefix + "CurrentDumpRps", this.CurrentDumpRps);
        this.setParamSimple(map, prefix + "DefaultDumpRps", this.DefaultDumpRps);
        this.setParamSimple(map, prefix + "CurrentLoadThread", this.CurrentLoadThread);
        this.setParamSimple(map, prefix + "DefaultLoadThread", this.DefaultLoadThread);
        this.setParamSimple(map, prefix + "CurrentLoadRps", this.CurrentLoadRps);
        this.setParamSimple(map, prefix + "DefaultLoadRps", this.DefaultLoadRps);
        this.setParamSimple(map, prefix + "CurrentSinkerThread", this.CurrentSinkerThread);
        this.setParamSimple(map, prefix + "DefaultSinkerThread", this.DefaultSinkerThread);
        this.setParamSimple(map, prefix + "HasUserSetRateLimit", this.HasUserSetRateLimit);
        this.setParamSimple(map, prefix + "DefaultDumpBps", this.DefaultDumpBps);
        this.setParamSimple(map, prefix + "CurrentSinkerRps", this.CurrentSinkerRps);
        this.setParamSimple(map, prefix + "DefaultSinkerRps", this.DefaultSinkerRps);
        this.setParamSimple(map, prefix + "CurrentLoadBps", this.CurrentLoadBps);
        this.setParamSimple(map, prefix + "CurrentDstShardCount", this.CurrentDstShardCount);
        this.setParamSimple(map, prefix + "CurrentDumpBps", this.CurrentDumpBps);
        this.setParamSimple(map, prefix + "CurrentSinkerBps", this.CurrentSinkerBps);
        this.setParamSimple(map, prefix + "DefaultSinkerBps", this.DefaultSinkerBps);

    }
}

