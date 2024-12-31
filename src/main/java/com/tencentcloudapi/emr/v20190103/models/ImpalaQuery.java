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

public class ImpalaQuery extends AbstractModel {

    /**
    * 执行语句
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * 查询ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 运行时间
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 执行状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 获取行数
    */
    @SerializedName("RowsFetched")
    @Expose
    private Long RowsFetched;

    /**
    * 用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 默认DB
    */
    @SerializedName("DefaultDB")
    @Expose
    private String DefaultDB;

    /**
    * 执行的Coordinator节点
    */
    @SerializedName("Coordinator")
    @Expose
    private String Coordinator;

    /**
    * 单节点内存峰值
    */
    @SerializedName("MaxNodePeakMemoryUsage")
    @Expose
    private String MaxNodePeakMemoryUsage;

    /**
    * 查询类型
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * 扫描的HDFS行数
    */
    @SerializedName("ScanHDFSRows")
    @Expose
    private Long ScanHDFSRows;

    /**
    * 扫描的Kudu行数
    */
    @SerializedName("ScanKUDURows")
    @Expose
    private Long ScanKUDURows;

    /**
    * 扫描的总行数
    */
    @SerializedName("ScanRowsTotal")
    @Expose
    private Long ScanRowsTotal;

    /**
    * 读取的总字节数
    */
    @SerializedName("TotalBytesRead")
    @Expose
    private Long TotalBytesRead;

    /**
    * 发送的总字节数
    */
    @SerializedName("TotalBytesSent")
    @Expose
    private Long TotalBytesSent;

    /**
    * CPU总时间
    */
    @SerializedName("TotalCpuTime")
    @Expose
    private Long TotalCpuTime;

    /**
    * 内部数据发送总量(Bytes)
    */
    @SerializedName("TotalInnerBytesSent")
    @Expose
    private Long TotalInnerBytesSent;

    /**
    * 内部扫描数据发送总量(Bytes)
    */
    @SerializedName("TotalScanBytesSent")
    @Expose
    private Long TotalScanBytesSent;

    /**
    * 预估单节点内存
    */
    @SerializedName("EstimatedPerHostMemBytes")
    @Expose
    private Long EstimatedPerHostMemBytes;

    /**
    * 从缓存中获取的数据行数
    */
    @SerializedName("NumRowsFetchedFromCache")
    @Expose
    private Long NumRowsFetchedFromCache;

    /**
    * 会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 单节点内存峰值和(Bytes)
    */
    @SerializedName("PerNodePeakMemoryBytesSum")
    @Expose
    private Long PerNodePeakMemoryBytesSum;

    /**
    * 后端个数
    */
    @SerializedName("BackendsCount")
    @Expose
    private Long BackendsCount;

    /**
    * fragment数
    */
    @SerializedName("FragmentInstancesCount")
    @Expose
    private Long FragmentInstancesCount;

    /**
    * 剩余未完成Fragment数
    */
    @SerializedName("RemainingFragmentCount")
    @Expose
    private Long RemainingFragmentCount;

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
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 运行时间 
     * @return Duration 运行时间
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 运行时间
     * @param Duration 运行时间
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
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
     * Get 获取行数 
     * @return RowsFetched 获取行数
     */
    public Long getRowsFetched() {
        return this.RowsFetched;
    }

    /**
     * Set 获取行数
     * @param RowsFetched 获取行数
     */
    public void setRowsFetched(Long RowsFetched) {
        this.RowsFetched = RowsFetched;
    }

    /**
     * Get 用户 
     * @return User 用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
     * @param User 用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 默认DB 
     * @return DefaultDB 默认DB
     */
    public String getDefaultDB() {
        return this.DefaultDB;
    }

    /**
     * Set 默认DB
     * @param DefaultDB 默认DB
     */
    public void setDefaultDB(String DefaultDB) {
        this.DefaultDB = DefaultDB;
    }

    /**
     * Get 执行的Coordinator节点 
     * @return Coordinator 执行的Coordinator节点
     */
    public String getCoordinator() {
        return this.Coordinator;
    }

    /**
     * Set 执行的Coordinator节点
     * @param Coordinator 执行的Coordinator节点
     */
    public void setCoordinator(String Coordinator) {
        this.Coordinator = Coordinator;
    }

    /**
     * Get 单节点内存峰值 
     * @return MaxNodePeakMemoryUsage 单节点内存峰值
     */
    public String getMaxNodePeakMemoryUsage() {
        return this.MaxNodePeakMemoryUsage;
    }

    /**
     * Set 单节点内存峰值
     * @param MaxNodePeakMemoryUsage 单节点内存峰值
     */
    public void setMaxNodePeakMemoryUsage(String MaxNodePeakMemoryUsage) {
        this.MaxNodePeakMemoryUsage = MaxNodePeakMemoryUsage;
    }

    /**
     * Get 查询类型 
     * @return QueryType 查询类型
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 查询类型
     * @param QueryType 查询类型
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get 扫描的HDFS行数 
     * @return ScanHDFSRows 扫描的HDFS行数
     */
    public Long getScanHDFSRows() {
        return this.ScanHDFSRows;
    }

    /**
     * Set 扫描的HDFS行数
     * @param ScanHDFSRows 扫描的HDFS行数
     */
    public void setScanHDFSRows(Long ScanHDFSRows) {
        this.ScanHDFSRows = ScanHDFSRows;
    }

    /**
     * Get 扫描的Kudu行数 
     * @return ScanKUDURows 扫描的Kudu行数
     */
    public Long getScanKUDURows() {
        return this.ScanKUDURows;
    }

    /**
     * Set 扫描的Kudu行数
     * @param ScanKUDURows 扫描的Kudu行数
     */
    public void setScanKUDURows(Long ScanKUDURows) {
        this.ScanKUDURows = ScanKUDURows;
    }

    /**
     * Get 扫描的总行数 
     * @return ScanRowsTotal 扫描的总行数
     */
    public Long getScanRowsTotal() {
        return this.ScanRowsTotal;
    }

    /**
     * Set 扫描的总行数
     * @param ScanRowsTotal 扫描的总行数
     */
    public void setScanRowsTotal(Long ScanRowsTotal) {
        this.ScanRowsTotal = ScanRowsTotal;
    }

    /**
     * Get 读取的总字节数 
     * @return TotalBytesRead 读取的总字节数
     */
    public Long getTotalBytesRead() {
        return this.TotalBytesRead;
    }

    /**
     * Set 读取的总字节数
     * @param TotalBytesRead 读取的总字节数
     */
    public void setTotalBytesRead(Long TotalBytesRead) {
        this.TotalBytesRead = TotalBytesRead;
    }

    /**
     * Get 发送的总字节数 
     * @return TotalBytesSent 发送的总字节数
     */
    public Long getTotalBytesSent() {
        return this.TotalBytesSent;
    }

    /**
     * Set 发送的总字节数
     * @param TotalBytesSent 发送的总字节数
     */
    public void setTotalBytesSent(Long TotalBytesSent) {
        this.TotalBytesSent = TotalBytesSent;
    }

    /**
     * Get CPU总时间 
     * @return TotalCpuTime CPU总时间
     */
    public Long getTotalCpuTime() {
        return this.TotalCpuTime;
    }

    /**
     * Set CPU总时间
     * @param TotalCpuTime CPU总时间
     */
    public void setTotalCpuTime(Long TotalCpuTime) {
        this.TotalCpuTime = TotalCpuTime;
    }

    /**
     * Get 内部数据发送总量(Bytes) 
     * @return TotalInnerBytesSent 内部数据发送总量(Bytes)
     */
    public Long getTotalInnerBytesSent() {
        return this.TotalInnerBytesSent;
    }

    /**
     * Set 内部数据发送总量(Bytes)
     * @param TotalInnerBytesSent 内部数据发送总量(Bytes)
     */
    public void setTotalInnerBytesSent(Long TotalInnerBytesSent) {
        this.TotalInnerBytesSent = TotalInnerBytesSent;
    }

    /**
     * Get 内部扫描数据发送总量(Bytes) 
     * @return TotalScanBytesSent 内部扫描数据发送总量(Bytes)
     */
    public Long getTotalScanBytesSent() {
        return this.TotalScanBytesSent;
    }

    /**
     * Set 内部扫描数据发送总量(Bytes)
     * @param TotalScanBytesSent 内部扫描数据发送总量(Bytes)
     */
    public void setTotalScanBytesSent(Long TotalScanBytesSent) {
        this.TotalScanBytesSent = TotalScanBytesSent;
    }

    /**
     * Get 预估单节点内存 
     * @return EstimatedPerHostMemBytes 预估单节点内存
     */
    public Long getEstimatedPerHostMemBytes() {
        return this.EstimatedPerHostMemBytes;
    }

    /**
     * Set 预估单节点内存
     * @param EstimatedPerHostMemBytes 预估单节点内存
     */
    public void setEstimatedPerHostMemBytes(Long EstimatedPerHostMemBytes) {
        this.EstimatedPerHostMemBytes = EstimatedPerHostMemBytes;
    }

    /**
     * Get 从缓存中获取的数据行数 
     * @return NumRowsFetchedFromCache 从缓存中获取的数据行数
     */
    public Long getNumRowsFetchedFromCache() {
        return this.NumRowsFetchedFromCache;
    }

    /**
     * Set 从缓存中获取的数据行数
     * @param NumRowsFetchedFromCache 从缓存中获取的数据行数
     */
    public void setNumRowsFetchedFromCache(Long NumRowsFetchedFromCache) {
        this.NumRowsFetchedFromCache = NumRowsFetchedFromCache;
    }

    /**
     * Get 会话ID 
     * @return SessionId 会话ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话ID
     * @param SessionId 会话ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 单节点内存峰值和(Bytes) 
     * @return PerNodePeakMemoryBytesSum 单节点内存峰值和(Bytes)
     */
    public Long getPerNodePeakMemoryBytesSum() {
        return this.PerNodePeakMemoryBytesSum;
    }

    /**
     * Set 单节点内存峰值和(Bytes)
     * @param PerNodePeakMemoryBytesSum 单节点内存峰值和(Bytes)
     */
    public void setPerNodePeakMemoryBytesSum(Long PerNodePeakMemoryBytesSum) {
        this.PerNodePeakMemoryBytesSum = PerNodePeakMemoryBytesSum;
    }

    /**
     * Get 后端个数 
     * @return BackendsCount 后端个数
     */
    public Long getBackendsCount() {
        return this.BackendsCount;
    }

    /**
     * Set 后端个数
     * @param BackendsCount 后端个数
     */
    public void setBackendsCount(Long BackendsCount) {
        this.BackendsCount = BackendsCount;
    }

    /**
     * Get fragment数 
     * @return FragmentInstancesCount fragment数
     */
    public Long getFragmentInstancesCount() {
        return this.FragmentInstancesCount;
    }

    /**
     * Set fragment数
     * @param FragmentInstancesCount fragment数
     */
    public void setFragmentInstancesCount(Long FragmentInstancesCount) {
        this.FragmentInstancesCount = FragmentInstancesCount;
    }

    /**
     * Get 剩余未完成Fragment数 
     * @return RemainingFragmentCount 剩余未完成Fragment数
     */
    public Long getRemainingFragmentCount() {
        return this.RemainingFragmentCount;
    }

    /**
     * Set 剩余未完成Fragment数
     * @param RemainingFragmentCount 剩余未完成Fragment数
     */
    public void setRemainingFragmentCount(Long RemainingFragmentCount) {
        this.RemainingFragmentCount = RemainingFragmentCount;
    }

    public ImpalaQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImpalaQuery(ImpalaQuery source) {
        if (source.Statement != null) {
            this.Statement = new String(source.Statement);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.RowsFetched != null) {
            this.RowsFetched = new Long(source.RowsFetched);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.DefaultDB != null) {
            this.DefaultDB = new String(source.DefaultDB);
        }
        if (source.Coordinator != null) {
            this.Coordinator = new String(source.Coordinator);
        }
        if (source.MaxNodePeakMemoryUsage != null) {
            this.MaxNodePeakMemoryUsage = new String(source.MaxNodePeakMemoryUsage);
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.ScanHDFSRows != null) {
            this.ScanHDFSRows = new Long(source.ScanHDFSRows);
        }
        if (source.ScanKUDURows != null) {
            this.ScanKUDURows = new Long(source.ScanKUDURows);
        }
        if (source.ScanRowsTotal != null) {
            this.ScanRowsTotal = new Long(source.ScanRowsTotal);
        }
        if (source.TotalBytesRead != null) {
            this.TotalBytesRead = new Long(source.TotalBytesRead);
        }
        if (source.TotalBytesSent != null) {
            this.TotalBytesSent = new Long(source.TotalBytesSent);
        }
        if (source.TotalCpuTime != null) {
            this.TotalCpuTime = new Long(source.TotalCpuTime);
        }
        if (source.TotalInnerBytesSent != null) {
            this.TotalInnerBytesSent = new Long(source.TotalInnerBytesSent);
        }
        if (source.TotalScanBytesSent != null) {
            this.TotalScanBytesSent = new Long(source.TotalScanBytesSent);
        }
        if (source.EstimatedPerHostMemBytes != null) {
            this.EstimatedPerHostMemBytes = new Long(source.EstimatedPerHostMemBytes);
        }
        if (source.NumRowsFetchedFromCache != null) {
            this.NumRowsFetchedFromCache = new Long(source.NumRowsFetchedFromCache);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.PerNodePeakMemoryBytesSum != null) {
            this.PerNodePeakMemoryBytesSum = new Long(source.PerNodePeakMemoryBytesSum);
        }
        if (source.BackendsCount != null) {
            this.BackendsCount = new Long(source.BackendsCount);
        }
        if (source.FragmentInstancesCount != null) {
            this.FragmentInstancesCount = new Long(source.FragmentInstancesCount);
        }
        if (source.RemainingFragmentCount != null) {
            this.RemainingFragmentCount = new Long(source.RemainingFragmentCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Statement", this.Statement);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RowsFetched", this.RowsFetched);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "DefaultDB", this.DefaultDB);
        this.setParamSimple(map, prefix + "Coordinator", this.Coordinator);
        this.setParamSimple(map, prefix + "MaxNodePeakMemoryUsage", this.MaxNodePeakMemoryUsage);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "ScanHDFSRows", this.ScanHDFSRows);
        this.setParamSimple(map, prefix + "ScanKUDURows", this.ScanKUDURows);
        this.setParamSimple(map, prefix + "ScanRowsTotal", this.ScanRowsTotal);
        this.setParamSimple(map, prefix + "TotalBytesRead", this.TotalBytesRead);
        this.setParamSimple(map, prefix + "TotalBytesSent", this.TotalBytesSent);
        this.setParamSimple(map, prefix + "TotalCpuTime", this.TotalCpuTime);
        this.setParamSimple(map, prefix + "TotalInnerBytesSent", this.TotalInnerBytesSent);
        this.setParamSimple(map, prefix + "TotalScanBytesSent", this.TotalScanBytesSent);
        this.setParamSimple(map, prefix + "EstimatedPerHostMemBytes", this.EstimatedPerHostMemBytes);
        this.setParamSimple(map, prefix + "NumRowsFetchedFromCache", this.NumRowsFetchedFromCache);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "PerNodePeakMemoryBytesSum", this.PerNodePeakMemoryBytesSum);
        this.setParamSimple(map, prefix + "BackendsCount", this.BackendsCount);
        this.setParamSimple(map, prefix + "FragmentInstancesCount", this.FragmentInstancesCount);
        this.setParamSimple(map, prefix + "RemainingFragmentCount", this.RemainingFragmentCount);

    }
}

