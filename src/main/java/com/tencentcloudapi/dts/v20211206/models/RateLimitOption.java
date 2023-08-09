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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitOption extends AbstractModel{

    /**
    * 当前生效的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentDumpThread")
    @Expose
    private Long CurrentDumpThread;

    /**
    * 默认的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultDumpThread")
    @Expose
    private Long DefaultDumpThread;

    /**
    * 当前生效的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentDumpRps")
    @Expose
    private Long CurrentDumpRps;

    /**
    * 默认的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultDumpRps")
    @Expose
    private Long DefaultDumpRps;

    /**
    * 当前生效的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentLoadThread")
    @Expose
    private Long CurrentLoadThread;

    /**
    * 默认的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultLoadThread")
    @Expose
    private Long DefaultLoadThread;

    /**
    * 当前生效的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentLoadRps")
    @Expose
    private Long CurrentLoadRps;

    /**
    * 默认的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultLoadRps")
    @Expose
    private Long DefaultLoadRps;

    /**
    * 当前生效的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentSinkerThread")
    @Expose
    private Long CurrentSinkerThread;

    /**
    * 默认的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultSinkerThread")
    @Expose
    private Long DefaultSinkerThread;

    /**
    * enum:"no"/"yes"、no表示用户未设置过限速、yes表示设置过限速
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasUserSetRateLimit")
    @Expose
    private String HasUserSetRateLimit;

    /**
     * Get 当前生效的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentDumpThread 当前生效的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentDumpThread() {
        return this.CurrentDumpThread;
    }

    /**
     * Set 当前生效的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentDumpThread 当前生效的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentDumpThread(Long CurrentDumpThread) {
        this.CurrentDumpThread = CurrentDumpThread;
    }

    /**
     * Get 默认的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultDumpThread 默认的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultDumpThread() {
        return this.DefaultDumpThread;
    }

    /**
     * Set 默认的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultDumpThread 默认的全量导出线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultDumpThread(Long DefaultDumpThread) {
        this.DefaultDumpThread = DefaultDumpThread;
    }

    /**
     * Get 当前生效的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentDumpRps 当前生效的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentDumpRps() {
        return this.CurrentDumpRps;
    }

    /**
     * Set 当前生效的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentDumpRps 当前生效的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentDumpRps(Long CurrentDumpRps) {
        this.CurrentDumpRps = CurrentDumpRps;
    }

    /**
     * Get 默认的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultDumpRps 默认的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultDumpRps() {
        return this.DefaultDumpRps;
    }

    /**
     * Set 默认的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultDumpRps 默认的全量导出Rps	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultDumpRps(Long DefaultDumpRps) {
        this.DefaultDumpRps = DefaultDumpRps;
    }

    /**
     * Get 当前生效的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentLoadThread 当前生效的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentLoadThread() {
        return this.CurrentLoadThread;
    }

    /**
     * Set 当前生效的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentLoadThread 当前生效的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentLoadThread(Long CurrentLoadThread) {
        this.CurrentLoadThread = CurrentLoadThread;
    }

    /**
     * Get 默认的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultLoadThread 默认的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultLoadThread() {
        return this.DefaultLoadThread;
    }

    /**
     * Set 默认的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultLoadThread 默认的全量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultLoadThread(Long DefaultLoadThread) {
        this.DefaultLoadThread = DefaultLoadThread;
    }

    /**
     * Get 当前生效的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentLoadRps 当前生效的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentLoadRps() {
        return this.CurrentLoadRps;
    }

    /**
     * Set 当前生效的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentLoadRps 当前生效的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentLoadRps(Long CurrentLoadRps) {
        this.CurrentLoadRps = CurrentLoadRps;
    }

    /**
     * Get 默认的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultLoadRps 默认的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultLoadRps() {
        return this.DefaultLoadRps;
    }

    /**
     * Set 默认的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultLoadRps 默认的全量导入Rps	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultLoadRps(Long DefaultLoadRps) {
        this.DefaultLoadRps = DefaultLoadRps;
    }

    /**
     * Get 当前生效的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentSinkerThread 当前生效的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentSinkerThread() {
        return this.CurrentSinkerThread;
    }

    /**
     * Set 当前生效的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentSinkerThread 当前生效的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentSinkerThread(Long CurrentSinkerThread) {
        this.CurrentSinkerThread = CurrentSinkerThread;
    }

    /**
     * Get 默认的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultSinkerThread 默认的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultSinkerThread() {
        return this.DefaultSinkerThread;
    }

    /**
     * Set 默认的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultSinkerThread 默认的增量导入线程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultSinkerThread(Long DefaultSinkerThread) {
        this.DefaultSinkerThread = DefaultSinkerThread;
    }

    /**
     * Get enum:"no"/"yes"、no表示用户未设置过限速、yes表示设置过限速
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasUserSetRateLimit enum:"no"/"yes"、no表示用户未设置过限速、yes表示设置过限速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHasUserSetRateLimit() {
        return this.HasUserSetRateLimit;
    }

    /**
     * Set enum:"no"/"yes"、no表示用户未设置过限速、yes表示设置过限速
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasUserSetRateLimit enum:"no"/"yes"、no表示用户未设置过限速、yes表示设置过限速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasUserSetRateLimit(String HasUserSetRateLimit) {
        this.HasUserSetRateLimit = HasUserSetRateLimit;
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

    }
}

