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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceReportSummary extends AbstractModel{

    /**
    * 总读取记录数
    */
    @SerializedName("TotalReadRecords")
    @Expose
    private Long TotalReadRecords;

    /**
    * 总读取字节数
    */
    @SerializedName("TotalReadBytes")
    @Expose
    private Long TotalReadBytes;

    /**
    * 总写入记录数
    */
    @SerializedName("TotalWriteRecords")
    @Expose
    private Long TotalWriteRecords;

    /**
    * 总写入字节数
    */
    @SerializedName("TotalWriteBytes")
    @Expose
    private Long TotalWriteBytes;

    /**
    * 速率（条/秒）
    */
    @SerializedName("RecordSpeed")
    @Expose
    private Long RecordSpeed;

    /**
    * 流量（Byte/秒）
    */
    @SerializedName("ByteSpeed")
    @Expose
    private Float ByteSpeed;

    /**
    * 脏数据记录数
    */
    @SerializedName("TotalErrorRecords")
    @Expose
    private Long TotalErrorRecords;

    /**
    * 脏数据字节数
    */
    @SerializedName("TotalErrorBytes")
    @Expose
    private Long TotalErrorBytes;

    /**
    * 任务运行总时长
    */
    @SerializedName("TotalRunDuration")
    @Expose
    private Long TotalRunDuration;

    /**
    * 任务开始运行时间
    */
    @SerializedName("BeginRunTime")
    @Expose
    private String BeginRunTime;

    /**
    * 任务结束运行时间
    */
    @SerializedName("EndRunTime")
    @Expose
    private String EndRunTime;

    /**
     * Get 总读取记录数 
     * @return TotalReadRecords 总读取记录数
     */
    public Long getTotalReadRecords() {
        return this.TotalReadRecords;
    }

    /**
     * Set 总读取记录数
     * @param TotalReadRecords 总读取记录数
     */
    public void setTotalReadRecords(Long TotalReadRecords) {
        this.TotalReadRecords = TotalReadRecords;
    }

    /**
     * Get 总读取字节数 
     * @return TotalReadBytes 总读取字节数
     */
    public Long getTotalReadBytes() {
        return this.TotalReadBytes;
    }

    /**
     * Set 总读取字节数
     * @param TotalReadBytes 总读取字节数
     */
    public void setTotalReadBytes(Long TotalReadBytes) {
        this.TotalReadBytes = TotalReadBytes;
    }

    /**
     * Get 总写入记录数 
     * @return TotalWriteRecords 总写入记录数
     */
    public Long getTotalWriteRecords() {
        return this.TotalWriteRecords;
    }

    /**
     * Set 总写入记录数
     * @param TotalWriteRecords 总写入记录数
     */
    public void setTotalWriteRecords(Long TotalWriteRecords) {
        this.TotalWriteRecords = TotalWriteRecords;
    }

    /**
     * Get 总写入字节数 
     * @return TotalWriteBytes 总写入字节数
     */
    public Long getTotalWriteBytes() {
        return this.TotalWriteBytes;
    }

    /**
     * Set 总写入字节数
     * @param TotalWriteBytes 总写入字节数
     */
    public void setTotalWriteBytes(Long TotalWriteBytes) {
        this.TotalWriteBytes = TotalWriteBytes;
    }

    /**
     * Get 速率（条/秒） 
     * @return RecordSpeed 速率（条/秒）
     */
    public Long getRecordSpeed() {
        return this.RecordSpeed;
    }

    /**
     * Set 速率（条/秒）
     * @param RecordSpeed 速率（条/秒）
     */
    public void setRecordSpeed(Long RecordSpeed) {
        this.RecordSpeed = RecordSpeed;
    }

    /**
     * Get 流量（Byte/秒） 
     * @return ByteSpeed 流量（Byte/秒）
     */
    public Float getByteSpeed() {
        return this.ByteSpeed;
    }

    /**
     * Set 流量（Byte/秒）
     * @param ByteSpeed 流量（Byte/秒）
     */
    public void setByteSpeed(Float ByteSpeed) {
        this.ByteSpeed = ByteSpeed;
    }

    /**
     * Get 脏数据记录数 
     * @return TotalErrorRecords 脏数据记录数
     */
    public Long getTotalErrorRecords() {
        return this.TotalErrorRecords;
    }

    /**
     * Set 脏数据记录数
     * @param TotalErrorRecords 脏数据记录数
     */
    public void setTotalErrorRecords(Long TotalErrorRecords) {
        this.TotalErrorRecords = TotalErrorRecords;
    }

    /**
     * Get 脏数据字节数 
     * @return TotalErrorBytes 脏数据字节数
     */
    public Long getTotalErrorBytes() {
        return this.TotalErrorBytes;
    }

    /**
     * Set 脏数据字节数
     * @param TotalErrorBytes 脏数据字节数
     */
    public void setTotalErrorBytes(Long TotalErrorBytes) {
        this.TotalErrorBytes = TotalErrorBytes;
    }

    /**
     * Get 任务运行总时长 
     * @return TotalRunDuration 任务运行总时长
     */
    public Long getTotalRunDuration() {
        return this.TotalRunDuration;
    }

    /**
     * Set 任务运行总时长
     * @param TotalRunDuration 任务运行总时长
     */
    public void setTotalRunDuration(Long TotalRunDuration) {
        this.TotalRunDuration = TotalRunDuration;
    }

    /**
     * Get 任务开始运行时间 
     * @return BeginRunTime 任务开始运行时间
     */
    public String getBeginRunTime() {
        return this.BeginRunTime;
    }

    /**
     * Set 任务开始运行时间
     * @param BeginRunTime 任务开始运行时间
     */
    public void setBeginRunTime(String BeginRunTime) {
        this.BeginRunTime = BeginRunTime;
    }

    /**
     * Get 任务结束运行时间 
     * @return EndRunTime 任务结束运行时间
     */
    public String getEndRunTime() {
        return this.EndRunTime;
    }

    /**
     * Set 任务结束运行时间
     * @param EndRunTime 任务结束运行时间
     */
    public void setEndRunTime(String EndRunTime) {
        this.EndRunTime = EndRunTime;
    }

    public InstanceReportSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceReportSummary(InstanceReportSummary source) {
        if (source.TotalReadRecords != null) {
            this.TotalReadRecords = new Long(source.TotalReadRecords);
        }
        if (source.TotalReadBytes != null) {
            this.TotalReadBytes = new Long(source.TotalReadBytes);
        }
        if (source.TotalWriteRecords != null) {
            this.TotalWriteRecords = new Long(source.TotalWriteRecords);
        }
        if (source.TotalWriteBytes != null) {
            this.TotalWriteBytes = new Long(source.TotalWriteBytes);
        }
        if (source.RecordSpeed != null) {
            this.RecordSpeed = new Long(source.RecordSpeed);
        }
        if (source.ByteSpeed != null) {
            this.ByteSpeed = new Float(source.ByteSpeed);
        }
        if (source.TotalErrorRecords != null) {
            this.TotalErrorRecords = new Long(source.TotalErrorRecords);
        }
        if (source.TotalErrorBytes != null) {
            this.TotalErrorBytes = new Long(source.TotalErrorBytes);
        }
        if (source.TotalRunDuration != null) {
            this.TotalRunDuration = new Long(source.TotalRunDuration);
        }
        if (source.BeginRunTime != null) {
            this.BeginRunTime = new String(source.BeginRunTime);
        }
        if (source.EndRunTime != null) {
            this.EndRunTime = new String(source.EndRunTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalReadRecords", this.TotalReadRecords);
        this.setParamSimple(map, prefix + "TotalReadBytes", this.TotalReadBytes);
        this.setParamSimple(map, prefix + "TotalWriteRecords", this.TotalWriteRecords);
        this.setParamSimple(map, prefix + "TotalWriteBytes", this.TotalWriteBytes);
        this.setParamSimple(map, prefix + "RecordSpeed", this.RecordSpeed);
        this.setParamSimple(map, prefix + "ByteSpeed", this.ByteSpeed);
        this.setParamSimple(map, prefix + "TotalErrorRecords", this.TotalErrorRecords);
        this.setParamSimple(map, prefix + "TotalErrorBytes", this.TotalErrorBytes);
        this.setParamSimple(map, prefix + "TotalRunDuration", this.TotalRunDuration);
        this.setParamSimple(map, prefix + "BeginRunTime", this.BeginRunTime);
        this.setParamSimple(map, prefix + "EndRunTime", this.EndRunTime);

    }
}

