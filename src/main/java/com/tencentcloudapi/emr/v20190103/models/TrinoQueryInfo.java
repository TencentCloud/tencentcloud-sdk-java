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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 提交IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIpAddr")
    @Expose
    private String ClientIpAddr;

    /**
    * 切片数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompletedSplits")
    @Expose
    private String CompletedSplits;

    /**
    * CPU时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuTime")
    @Expose
    private Long CpuTime;

    /**
    * 累计内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CumulativeMemory")
    @Expose
    private Long CumulativeMemory;

    /**
    * 执行时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationMillis")
    @Expose
    private Long DurationMillis;

    /**
    * 结束时间 (s)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 查询ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 内部传输量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternalNetworkBytes")
    @Expose
    private Long InternalNetworkBytes;

    /**
    * 输出字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputBytes")
    @Expose
    private Long OutputBytes;

    /**
    * 峰值内存量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeakUserMemoryBytes")
    @Expose
    private Long PeakUserMemoryBytes;

    /**
    * 物理输入量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhysicalInputBytes")
    @Expose
    private Long PhysicalInputBytes;

    /**
    * 处理输入量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessedInputBytes")
    @Expose
    private Long ProcessedInputBytes;

    /**
    * 编译时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlCompileTime")
    @Expose
    private Long SqlCompileTime;

    /**
    * 开始时间 (s)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 执行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 执行语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * 提交用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 写入字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WrittenBytes")
    @Expose
    private Long WrittenBytes;

    /**
     * Get catalog
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalog catalog
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set catalog
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalog catalog
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 提交IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIpAddr 提交IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientIpAddr() {
        return this.ClientIpAddr;
    }

    /**
     * Set 提交IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIpAddr 提交IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIpAddr(String ClientIpAddr) {
        this.ClientIpAddr = ClientIpAddr;
    }

    /**
     * Get 切片数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompletedSplits 切片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompletedSplits() {
        return this.CompletedSplits;
    }

    /**
     * Set 切片数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompletedSplits 切片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompletedSplits(String CompletedSplits) {
        this.CompletedSplits = CompletedSplits;
    }

    /**
     * Get CPU时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuTime CPU时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set CPU时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuTime CPU时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuTime(Long CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get 累计内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CumulativeMemory 累计内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCumulativeMemory() {
        return this.CumulativeMemory;
    }

    /**
     * Set 累计内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param CumulativeMemory 累计内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCumulativeMemory(Long CumulativeMemory) {
        this.CumulativeMemory = CumulativeMemory;
    }

    /**
     * Get 执行时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationMillis 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationMillis() {
        return this.DurationMillis;
    }

    /**
     * Set 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationMillis 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationMillis(Long DurationMillis) {
        this.DurationMillis = DurationMillis;
    }

    /**
     * Get 结束时间 (s)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间 (s)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间 (s)
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间 (s)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 查询ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 查询ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 查询ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 内部传输量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternalNetworkBytes 内部传输量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInternalNetworkBytes() {
        return this.InternalNetworkBytes;
    }

    /**
     * Set 内部传输量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternalNetworkBytes 内部传输量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternalNetworkBytes(Long InternalNetworkBytes) {
        this.InternalNetworkBytes = InternalNetworkBytes;
    }

    /**
     * Get 输出字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputBytes 输出字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputBytes() {
        return this.OutputBytes;
    }

    /**
     * Set 输出字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputBytes 输出字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputBytes(Long OutputBytes) {
        this.OutputBytes = OutputBytes;
    }

    /**
     * Get 峰值内存量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeakUserMemoryBytes 峰值内存量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeakUserMemoryBytes() {
        return this.PeakUserMemoryBytes;
    }

    /**
     * Set 峰值内存量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeakUserMemoryBytes 峰值内存量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeakUserMemoryBytes(Long PeakUserMemoryBytes) {
        this.PeakUserMemoryBytes = PeakUserMemoryBytes;
    }

    /**
     * Get 物理输入量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhysicalInputBytes 物理输入量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhysicalInputBytes() {
        return this.PhysicalInputBytes;
    }

    /**
     * Set 物理输入量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhysicalInputBytes 物理输入量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhysicalInputBytes(Long PhysicalInputBytes) {
        this.PhysicalInputBytes = PhysicalInputBytes;
    }

    /**
     * Get 处理输入量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessedInputBytes 处理输入量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessedInputBytes() {
        return this.ProcessedInputBytes;
    }

    /**
     * Set 处理输入量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessedInputBytes 处理输入量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessedInputBytes(Long ProcessedInputBytes) {
        this.ProcessedInputBytes = ProcessedInputBytes;
    }

    /**
     * Get 编译时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlCompileTime 编译时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSqlCompileTime() {
        return this.SqlCompileTime;
    }

    /**
     * Set 编译时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlCompileTime 编译时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlCompileTime(Long SqlCompileTime) {
        this.SqlCompileTime = SqlCompileTime;
    }

    /**
     * Get 开始时间 (s)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间 (s)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间 (s)
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间 (s)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 执行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 执行语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Statement 执行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set 执行语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param Statement 执行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get 提交用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 提交用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 提交用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 提交用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 写入字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WrittenBytes 写入字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWrittenBytes() {
        return this.WrittenBytes;
    }

    /**
     * Set 写入字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WrittenBytes 写入字节数
注意：此字段可能返回 null，表示取不到有效值。
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

