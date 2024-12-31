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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrinoQueryInfo extends AbstractModel {

    /**
    * catalog
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 提交IP
    */
    @SerializedName("ClientIpAddr")
    @Expose
    private String ClientIpAddr;

    /**
    * 切片数
    */
    @SerializedName("CompletedSplits")
    @Expose
    private String CompletedSplits;

    /**
    * CPU时间
    */
    @SerializedName("CpuTime")
    @Expose
    private Long CpuTime;

    /**
    * 累计内存
    */
    @SerializedName("CumulativeMemory")
    @Expose
    private Long CumulativeMemory;

    /**
    * 执行时长
    */
    @SerializedName("DurationMillis")
    @Expose
    private Long DurationMillis;

    /**
    * 结束时间 (s)
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 查询ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 内部传输量
    */
    @SerializedName("InternalNetworkBytes")
    @Expose
    private Long InternalNetworkBytes;

    /**
    * 输出字节数
    */
    @SerializedName("OutputBytes")
    @Expose
    private Long OutputBytes;

    /**
    * 峰值内存量
    */
    @SerializedName("PeakUserMemoryBytes")
    @Expose
    private Long PeakUserMemoryBytes;

    /**
    * 物理输入量
    */
    @SerializedName("PhysicalInputBytes")
    @Expose
    private Long PhysicalInputBytes;

    /**
    * 处理输入量
    */
    @SerializedName("ProcessedInputBytes")
    @Expose
    private Long ProcessedInputBytes;

    /**
    * 编译时长
    */
    @SerializedName("SqlCompileTime")
    @Expose
    private Long SqlCompileTime;

    /**
    * 开始时间 (s)
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 执行状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 执行语句
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * 提交用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 写入字节数
    */
    @SerializedName("WrittenBytes")
    @Expose
    private Long WrittenBytes;

    /**
     * Get catalog 
     * @return Catalog catalog
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set catalog
     * @param Catalog catalog
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 提交IP 
     * @return ClientIpAddr 提交IP
     */
    public String getClientIpAddr() {
        return this.ClientIpAddr;
    }

    /**
     * Set 提交IP
     * @param ClientIpAddr 提交IP
     */
    public void setClientIpAddr(String ClientIpAddr) {
        this.ClientIpAddr = ClientIpAddr;
    }

    /**
     * Get 切片数 
     * @return CompletedSplits 切片数
     */
    public String getCompletedSplits() {
        return this.CompletedSplits;
    }

    /**
     * Set 切片数
     * @param CompletedSplits 切片数
     */
    public void setCompletedSplits(String CompletedSplits) {
        this.CompletedSplits = CompletedSplits;
    }

    /**
     * Get CPU时间 
     * @return CpuTime CPU时间
     */
    public Long getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set CPU时间
     * @param CpuTime CPU时间
     */
    public void setCpuTime(Long CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get 累计内存 
     * @return CumulativeMemory 累计内存
     */
    public Long getCumulativeMemory() {
        return this.CumulativeMemory;
    }

    /**
     * Set 累计内存
     * @param CumulativeMemory 累计内存
     */
    public void setCumulativeMemory(Long CumulativeMemory) {
        this.CumulativeMemory = CumulativeMemory;
    }

    /**
     * Get 执行时长 
     * @return DurationMillis 执行时长
     */
    public Long getDurationMillis() {
        return this.DurationMillis;
    }

    /**
     * Set 执行时长
     * @param DurationMillis 执行时长
     */
    public void setDurationMillis(Long DurationMillis) {
        this.DurationMillis = DurationMillis;
    }

    /**
     * Get 结束时间 (s) 
     * @return EndTime 结束时间 (s)
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间 (s)
     * @param EndTime 结束时间 (s)
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询ID 
     * @return Id 查询ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 查询ID
     * @param Id 查询ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 内部传输量 
     * @return InternalNetworkBytes 内部传输量
     */
    public Long getInternalNetworkBytes() {
        return this.InternalNetworkBytes;
    }

    /**
     * Set 内部传输量
     * @param InternalNetworkBytes 内部传输量
     */
    public void setInternalNetworkBytes(Long InternalNetworkBytes) {
        this.InternalNetworkBytes = InternalNetworkBytes;
    }

    /**
     * Get 输出字节数 
     * @return OutputBytes 输出字节数
     */
    public Long getOutputBytes() {
        return this.OutputBytes;
    }

    /**
     * Set 输出字节数
     * @param OutputBytes 输出字节数
     */
    public void setOutputBytes(Long OutputBytes) {
        this.OutputBytes = OutputBytes;
    }

    /**
     * Get 峰值内存量 
     * @return PeakUserMemoryBytes 峰值内存量
     */
    public Long getPeakUserMemoryBytes() {
        return this.PeakUserMemoryBytes;
    }

    /**
     * Set 峰值内存量
     * @param PeakUserMemoryBytes 峰值内存量
     */
    public void setPeakUserMemoryBytes(Long PeakUserMemoryBytes) {
        this.PeakUserMemoryBytes = PeakUserMemoryBytes;
    }

    /**
     * Get 物理输入量 
     * @return PhysicalInputBytes 物理输入量
     */
    public Long getPhysicalInputBytes() {
        return this.PhysicalInputBytes;
    }

    /**
     * Set 物理输入量
     * @param PhysicalInputBytes 物理输入量
     */
    public void setPhysicalInputBytes(Long PhysicalInputBytes) {
        this.PhysicalInputBytes = PhysicalInputBytes;
    }

    /**
     * Get 处理输入量 
     * @return ProcessedInputBytes 处理输入量
     */
    public Long getProcessedInputBytes() {
        return this.ProcessedInputBytes;
    }

    /**
     * Set 处理输入量
     * @param ProcessedInputBytes 处理输入量
     */
    public void setProcessedInputBytes(Long ProcessedInputBytes) {
        this.ProcessedInputBytes = ProcessedInputBytes;
    }

    /**
     * Get 编译时长 
     * @return SqlCompileTime 编译时长
     */
    public Long getSqlCompileTime() {
        return this.SqlCompileTime;
    }

    /**
     * Set 编译时长
     * @param SqlCompileTime 编译时长
     */
    public void setSqlCompileTime(Long SqlCompileTime) {
        this.SqlCompileTime = SqlCompileTime;
    }

    /**
     * Get 开始时间 (s) 
     * @return StartTime 开始时间 (s)
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间 (s)
     * @param StartTime 开始时间 (s)
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 执行状态 
     * @return State 执行状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 执行状态
     * @param State 执行状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 执行语句 
     * @return Statement 执行语句
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set 执行语句
     * @param Statement 执行语句
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get 提交用户 
     * @return User 提交用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 提交用户
     * @param User 提交用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 写入字节数 
     * @return WrittenBytes 写入字节数
     */
    public Long getWrittenBytes() {
        return this.WrittenBytes;
    }

    /**
     * Set 写入字节数
     * @param WrittenBytes 写入字节数
     */
    public void setWrittenBytes(Long WrittenBytes) {
        this.WrittenBytes = WrittenBytes;
    }

    public TrinoQueryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrinoQueryInfo(TrinoQueryInfo source) {
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.ClientIpAddr != null) {
            this.ClientIpAddr = new String(source.ClientIpAddr);
        }
        if (source.CompletedSplits != null) {
            this.CompletedSplits = new String(source.CompletedSplits);
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Long(source.CpuTime);
        }
        if (source.CumulativeMemory != null) {
            this.CumulativeMemory = new Long(source.CumulativeMemory);
        }
        if (source.DurationMillis != null) {
            this.DurationMillis = new Long(source.DurationMillis);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.InternalNetworkBytes != null) {
            this.InternalNetworkBytes = new Long(source.InternalNetworkBytes);
        }
        if (source.OutputBytes != null) {
            this.OutputBytes = new Long(source.OutputBytes);
        }
        if (source.PeakUserMemoryBytes != null) {
            this.PeakUserMemoryBytes = new Long(source.PeakUserMemoryBytes);
        }
        if (source.PhysicalInputBytes != null) {
            this.PhysicalInputBytes = new Long(source.PhysicalInputBytes);
        }
        if (source.ProcessedInputBytes != null) {
            this.ProcessedInputBytes = new Long(source.ProcessedInputBytes);
        }
        if (source.SqlCompileTime != null) {
            this.SqlCompileTime = new Long(source.SqlCompileTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Statement != null) {
            this.Statement = new String(source.Statement);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.WrittenBytes != null) {
            this.WrittenBytes = new Long(source.WrittenBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "ClientIpAddr", this.ClientIpAddr);
        this.setParamSimple(map, prefix + "CompletedSplits", this.CompletedSplits);
        this.setParamSimple(map, prefix + "CpuTime", this.CpuTime);
        this.setParamSimple(map, prefix + "CumulativeMemory", this.CumulativeMemory);
        this.setParamSimple(map, prefix + "DurationMillis", this.DurationMillis);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InternalNetworkBytes", this.InternalNetworkBytes);
        this.setParamSimple(map, prefix + "OutputBytes", this.OutputBytes);
        this.setParamSimple(map, prefix + "PeakUserMemoryBytes", this.PeakUserMemoryBytes);
        this.setParamSimple(map, prefix + "PhysicalInputBytes", this.PhysicalInputBytes);
        this.setParamSimple(map, prefix + "ProcessedInputBytes", this.ProcessedInputBytes);
        this.setParamSimple(map, prefix + "SqlCompileTime", this.SqlCompileTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Statement", this.Statement);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "WrittenBytes", this.WrittenBytes);

    }
}

