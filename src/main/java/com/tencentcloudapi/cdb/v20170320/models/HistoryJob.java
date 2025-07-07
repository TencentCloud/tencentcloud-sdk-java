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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HistoryJob extends AbstractModel {

    /**
    * 操作类型
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 扩容类型
    */
    @SerializedName("ExpandType")
    @Expose
    private String ExpandType;

    /**
    * 扩容开始时间
说明：此项显示的格式是 int 类型的 unix 时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 扩容结束时间
说明：此项显示的格式是 int 类型的 unix 时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 扩容前核数
    */
    @SerializedName("OldCpu")
    @Expose
    private Long OldCpu;

    /**
    * 扩容后核数
    */
    @SerializedName("NewCpu")
    @Expose
    private Long NewCpu;

    /**
    * 增减的cpu数
    */
    @SerializedName("ExtendCPUNum")
    @Expose
    private Long ExtendCPUNum;

    /**
    * extend_failed操作上报
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get 操作类型 
     * @return OperationType 操作类型
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型
     * @param OperationType 操作类型
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 扩容类型 
     * @return ExpandType 扩容类型
     */
    public String getExpandType() {
        return this.ExpandType;
    }

    /**
     * Set 扩容类型
     * @param ExpandType 扩容类型
     */
    public void setExpandType(String ExpandType) {
        this.ExpandType = ExpandType;
    }

    /**
     * Get 扩容开始时间
说明：此项显示的格式是 int 类型的 unix 时间戳 
     * @return StartTime 扩容开始时间
说明：此项显示的格式是 int 类型的 unix 时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 扩容开始时间
说明：此项显示的格式是 int 类型的 unix 时间戳
     * @param StartTime 扩容开始时间
说明：此项显示的格式是 int 类型的 unix 时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 扩容结束时间
说明：此项显示的格式是 int 类型的 unix 时间戳 
     * @return EndTime 扩容结束时间
说明：此项显示的格式是 int 类型的 unix 时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 扩容结束时间
说明：此项显示的格式是 int 类型的 unix 时间戳
     * @param EndTime 扩容结束时间
说明：此项显示的格式是 int 类型的 unix 时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 扩容前核数 
     * @return OldCpu 扩容前核数
     */
    public Long getOldCpu() {
        return this.OldCpu;
    }

    /**
     * Set 扩容前核数
     * @param OldCpu 扩容前核数
     */
    public void setOldCpu(Long OldCpu) {
        this.OldCpu = OldCpu;
    }

    /**
     * Get 扩容后核数 
     * @return NewCpu 扩容后核数
     */
    public Long getNewCpu() {
        return this.NewCpu;
    }

    /**
     * Set 扩容后核数
     * @param NewCpu 扩容后核数
     */
    public void setNewCpu(Long NewCpu) {
        this.NewCpu = NewCpu;
    }

    /**
     * Get 增减的cpu数 
     * @return ExtendCPUNum 增减的cpu数
     */
    public Long getExtendCPUNum() {
        return this.ExtendCPUNum;
    }

    /**
     * Set 增减的cpu数
     * @param ExtendCPUNum 增减的cpu数
     */
    public void setExtendCPUNum(Long ExtendCPUNum) {
        this.ExtendCPUNum = ExtendCPUNum;
    }

    /**
     * Get extend_failed操作上报 
     * @return Error extend_failed操作上报
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set extend_failed操作上报
     * @param Error extend_failed操作上报
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public HistoryJob() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HistoryJob(HistoryJob source) {
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.ExpandType != null) {
            this.ExpandType = new String(source.ExpandType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.OldCpu != null) {
            this.OldCpu = new Long(source.OldCpu);
        }
        if (source.NewCpu != null) {
            this.NewCpu = new Long(source.NewCpu);
        }
        if (source.ExtendCPUNum != null) {
            this.ExtendCPUNum = new Long(source.ExtendCPUNum);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "ExpandType", this.ExpandType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OldCpu", this.OldCpu);
        this.setParamSimple(map, prefix + "NewCpu", this.NewCpu);
        this.setParamSimple(map, prefix + "ExtendCPUNum", this.ExtendCPUNum);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

