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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakBase extends AbstractModel {

    /**
    * CPU峰值
    */
    @SerializedName("PeakCpuNum")
    @Expose
    private Long PeakCpuNum;

    /**
    * 内存峰值
    */
    @SerializedName("PeakMemoryNum")
    @Expose
    private Long PeakMemoryNum;

    /**
    * 硬盘峰值
    */
    @SerializedName("PeakStorageNum")
    @Expose
    private Long PeakStorageNum;

    /**
    * 记录时间
    */
    @SerializedName("RecordTime")
    @Expose
    private String RecordTime;

    /**
     * Get CPU峰值 
     * @return PeakCpuNum CPU峰值
     */
    public Long getPeakCpuNum() {
        return this.PeakCpuNum;
    }

    /**
     * Set CPU峰值
     * @param PeakCpuNum CPU峰值
     */
    public void setPeakCpuNum(Long PeakCpuNum) {
        this.PeakCpuNum = PeakCpuNum;
    }

    /**
     * Get 内存峰值 
     * @return PeakMemoryNum 内存峰值
     */
    public Long getPeakMemoryNum() {
        return this.PeakMemoryNum;
    }

    /**
     * Set 内存峰值
     * @param PeakMemoryNum 内存峰值
     */
    public void setPeakMemoryNum(Long PeakMemoryNum) {
        this.PeakMemoryNum = PeakMemoryNum;
    }

    /**
     * Get 硬盘峰值 
     * @return PeakStorageNum 硬盘峰值
     */
    public Long getPeakStorageNum() {
        return this.PeakStorageNum;
    }

    /**
     * Set 硬盘峰值
     * @param PeakStorageNum 硬盘峰值
     */
    public void setPeakStorageNum(Long PeakStorageNum) {
        this.PeakStorageNum = PeakStorageNum;
    }

    /**
     * Get 记录时间 
     * @return RecordTime 记录时间
     */
    public String getRecordTime() {
        return this.RecordTime;
    }

    /**
     * Set 记录时间
     * @param RecordTime 记录时间
     */
    public void setRecordTime(String RecordTime) {
        this.RecordTime = RecordTime;
    }

    public PeakBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeakBase(PeakBase source) {
        if (source.PeakCpuNum != null) {
            this.PeakCpuNum = new Long(source.PeakCpuNum);
        }
        if (source.PeakMemoryNum != null) {
            this.PeakMemoryNum = new Long(source.PeakMemoryNum);
        }
        if (source.PeakStorageNum != null) {
            this.PeakStorageNum = new Long(source.PeakStorageNum);
        }
        if (source.RecordTime != null) {
            this.RecordTime = new String(source.RecordTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeakCpuNum", this.PeakCpuNum);
        this.setParamSimple(map, prefix + "PeakMemoryNum", this.PeakMemoryNum);
        this.setParamSimple(map, prefix + "PeakStorageNum", this.PeakStorageNum);
        this.setParamSimple(map, prefix + "RecordTime", this.RecordTime);

    }
}

