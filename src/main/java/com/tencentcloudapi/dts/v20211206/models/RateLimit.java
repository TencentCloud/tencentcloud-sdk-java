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

public class RateLimit extends AbstractModel {

    /**
    * <p>全量导出线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p>
    */
    @SerializedName("DumpThread")
    @Expose
    private Long DumpThread;

    /**
    * <p>全量导出Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
    */
    @SerializedName("DumpRps")
    @Expose
    private Long DumpRps;

    /**
    * <p>全量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p>
    */
    @SerializedName("LoadThread")
    @Expose
    private Long LoadThread;

    /**
    * <p>全量导入Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
    */
    @SerializedName("LoadRps")
    @Expose
    private Long LoadRps;

    /**
    * <p>增量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为128</p>
    */
    @SerializedName("SinkerThread")
    @Expose
    private Long SinkerThread;

    /**
     * Get <p>全量导出线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p> 
     * @return DumpThread <p>全量导出线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p>
     */
    public Long getDumpThread() {
        return this.DumpThread;
    }

    /**
     * Set <p>全量导出线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p>
     * @param DumpThread <p>全量导出线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p>
     */
    public void setDumpThread(Long DumpThread) {
        this.DumpThread = DumpThread;
    }

    /**
     * Get <p>全量导出Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p> 
     * @return DumpRps <p>全量导出Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     */
    public Long getDumpRps() {
        return this.DumpRps;
    }

    /**
     * Set <p>全量导出Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     * @param DumpRps <p>全量导出Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     */
    public void setDumpRps(Long DumpRps) {
        this.DumpRps = DumpRps;
    }

    /**
     * Get <p>全量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p> 
     * @return LoadThread <p>全量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p>
     */
    public Long getLoadThread() {
        return this.LoadThread;
    }

    /**
     * Set <p>全量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p>
     * @param LoadThread <p>全量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为16</p>
     */
    public void setLoadThread(Long LoadThread) {
        this.LoadThread = LoadThread;
    }

    /**
     * Get <p>全量导入Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p> 
     * @return LoadRps <p>全量导入Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     */
    public Long getLoadRps() {
        return this.LoadRps;
    }

    /**
     * Set <p>全量导入Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     * @param LoadRps <p>全量导入Rps，如果不设置或设置为0则表示保持当前值，最大值为50000000</p>
     */
    public void setLoadRps(Long LoadRps) {
        this.LoadRps = LoadRps;
    }

    /**
     * Get <p>增量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为128</p> 
     * @return SinkerThread <p>增量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为128</p>
     */
    public Long getSinkerThread() {
        return this.SinkerThread;
    }

    /**
     * Set <p>增量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为128</p>
     * @param SinkerThread <p>增量导入线程数，如果不设置或设置为0则表示保持当前值，最大值为128</p>
     */
    public void setSinkerThread(Long SinkerThread) {
        this.SinkerThread = SinkerThread;
    }

    public RateLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimit(RateLimit source) {
        if (source.DumpThread != null) {
            this.DumpThread = new Long(source.DumpThread);
        }
        if (source.DumpRps != null) {
            this.DumpRps = new Long(source.DumpRps);
        }
        if (source.LoadThread != null) {
            this.LoadThread = new Long(source.LoadThread);
        }
        if (source.LoadRps != null) {
            this.LoadRps = new Long(source.LoadRps);
        }
        if (source.SinkerThread != null) {
            this.SinkerThread = new Long(source.SinkerThread);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DumpThread", this.DumpThread);
        this.setParamSimple(map, prefix + "DumpRps", this.DumpRps);
        this.setParamSimple(map, prefix + "LoadThread", this.LoadThread);
        this.setParamSimple(map, prefix + "LoadRps", this.LoadRps);
        this.setParamSimple(map, prefix + "SinkerThread", this.SinkerThread);

    }
}

