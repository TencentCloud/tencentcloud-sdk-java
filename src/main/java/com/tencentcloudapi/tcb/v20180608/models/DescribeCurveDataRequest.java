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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCurveDataRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <h4>基础套餐相关指标</h4>
<ul>
<li> StorageRead: 存储读请求次数 </li>
<li> StorageWrite: 存储写请求次数 </li>
<li> StorageCdnOriginFlux: CDN回源流量, 单位字节 </li>
<li> CDNFlux: CDN回源流量, 单位字节 </li>
<li> FunctionInvocation: 云函数调用次数 </li>
<li> FunctionGBs: 云函数资源使用量, 单位Mb*Ms </li>
<li> FunctionFlux: 云函数流量, 单位千字节(KB) </li>
<li> FunctionError: 云函数调用错误次数 </li>
<li> FunctionDuration: 云函数运行时间, 单位毫秒 </li>
<li> DbRead: 数据库读请求数 </li>
<li> DbWrite: 数据库写请求数 </li>
<li> DbCostTime10ms: 数据库耗时在10ms-50ms请求数 </li>
<li> DbCostTime50ms: 数据库耗时在50ms-100ms请求数 </li>
<li> DbCostTime100ms: 数据库耗时在100ms以上请求数 </li>
<li> TkeInvokeNum: 调用量 </li>
<li> FunctionConcurrentExecutions: 云函数并发执行个数</li>
<li> FunctionIdleProvisioned: 云函数预置并发闲置量 </li>
<li> FunctionConcurrencyMemoryMB: 云函数并发执行内存量 </li>
<li> FunctionThrottle: 云函数受限次数 </li>
<li> FunctionProvisionedConcurrency: 云函数预置并发 </li>
<li>ApiCountSummary: API总调用量(包括：数据库读+写，云存储读+写，云函数调用，CMS调用)</li>
<li>CapacitySummary： 容量(包括：云存储+数据库)</li>
<li>DatabaseApiCountSummary：数据库调用次数(包括：数据库读+写)</li>
<li>StorageApiCountSummary：云存储调用次数(包括：云存储读+写)</li>
<li>EnvQPSAll：环境总QPS</li>
</ul>

<h4>云托管相关指标</h4>
<ul>
<li>TkeCpuRatio ： 容器CPU占用率</li>
<li>TkeMemRatio ： 容器内存占用率</li>
<li>TkeCpuUsed ： 容器CPU使用量</li>
<li>TkeMemUsed ： 容器内存使用量</li>
<li>TkeResourceCpuVersion ： 实际分配CPU规格数 单位：核</li>
<li>TkeResourceMemVersion ： 实际分配内存规格数 单位：MB</li>
<li>TkeResourceCpuService ： CPU 规格量</li>
<li>TkeResourceMemService ： 内存 规格量</li>
<li>TkeCpuUsedVersion ： 版本级别cpu使用量</li>
<li>TkeMemUsedVersion ： 版本级别内存使用量</li>
<li>TkeCpuRatioVersion ： 版本级别cpu使用率</li>
<li>TkeMemRatioVersion ： 版本级别内存使用率</li>
<li>TkePodNumVersion ： 实例个数（版本）</li>
<li>TkePodUnavailableNumVersion ： 实例不可用个数（版本）</li>
<li>TkeCUUsedVersion ： 版本级别内存使用量(CU单位)</li>
<li>TkeCpuUsedService ： 服务级别cpu使用量</li>
<li>TkeMemUsedService ： 服务级别内存使用量</li>
<li>TkePodNumService ： 实例个数（服务）</li>
<li>TkePodUnavailableNumService ： 实例不可用个数（服务）</li>
<li>TkeCUUsedService ： 服务级别内存使用量(CU单位)</li>
</ul>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 开始时间，如2018-08-24 10:50:00, 开始时间需要早于结束时间至少五分钟(原因是因为目前统计粒度最小是5分钟)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如2018-08-24 10:50:00, 结束时间需要晚于开始时间至少五分钟(原因是因为目前统计粒度最小是5分钟)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 资源ID, 目前仅对云函数、容器托管相关的指标有意义。云函数(FunctionInvocation, FunctionGBs, FunctionFlux, FunctionError, FunctionDuration)、容器托管（服务名称）, 如果想查询某个云函数的指标则在ResourceId中传入函数名; 如果只想查询整个namespace的指标, 则留空或不传.如果想查询数据库某个集合相关信息，传入集合名称
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <h4>基础套餐相关指标</h4>
<ul>
<li> StorageRead: 存储读请求次数 </li>
<li> StorageWrite: 存储写请求次数 </li>
<li> StorageCdnOriginFlux: CDN回源流量, 单位字节 </li>
<li> CDNFlux: CDN回源流量, 单位字节 </li>
<li> FunctionInvocation: 云函数调用次数 </li>
<li> FunctionGBs: 云函数资源使用量, 单位Mb*Ms </li>
<li> FunctionFlux: 云函数流量, 单位千字节(KB) </li>
<li> FunctionError: 云函数调用错误次数 </li>
<li> FunctionDuration: 云函数运行时间, 单位毫秒 </li>
<li> DbRead: 数据库读请求数 </li>
<li> DbWrite: 数据库写请求数 </li>
<li> DbCostTime10ms: 数据库耗时在10ms-50ms请求数 </li>
<li> DbCostTime50ms: 数据库耗时在50ms-100ms请求数 </li>
<li> DbCostTime100ms: 数据库耗时在100ms以上请求数 </li>
<li> TkeInvokeNum: 调用量 </li>
<li> FunctionConcurrentExecutions: 云函数并发执行个数</li>
<li> FunctionIdleProvisioned: 云函数预置并发闲置量 </li>
<li> FunctionConcurrencyMemoryMB: 云函数并发执行内存量 </li>
<li> FunctionThrottle: 云函数受限次数 </li>
<li> FunctionProvisionedConcurrency: 云函数预置并发 </li>
<li>ApiCountSummary: API总调用量(包括：数据库读+写，云存储读+写，云函数调用，CMS调用)</li>
<li>CapacitySummary： 容量(包括：云存储+数据库)</li>
<li>DatabaseApiCountSummary：数据库调用次数(包括：数据库读+写)</li>
<li>StorageApiCountSummary：云存储调用次数(包括：云存储读+写)</li>
<li>EnvQPSAll：环境总QPS</li>
</ul>

<h4>云托管相关指标</h4>
<ul>
<li>TkeCpuRatio ： 容器CPU占用率</li>
<li>TkeMemRatio ： 容器内存占用率</li>
<li>TkeCpuUsed ： 容器CPU使用量</li>
<li>TkeMemUsed ： 容器内存使用量</li>
<li>TkeResourceCpuVersion ： 实际分配CPU规格数 单位：核</li>
<li>TkeResourceMemVersion ： 实际分配内存规格数 单位：MB</li>
<li>TkeResourceCpuService ： CPU 规格量</li>
<li>TkeResourceMemService ： 内存 规格量</li>
<li>TkeCpuUsedVersion ： 版本级别cpu使用量</li>
<li>TkeMemUsedVersion ： 版本级别内存使用量</li>
<li>TkeCpuRatioVersion ： 版本级别cpu使用率</li>
<li>TkeMemRatioVersion ： 版本级别内存使用率</li>
<li>TkePodNumVersion ： 实例个数（版本）</li>
<li>TkePodUnavailableNumVersion ： 实例不可用个数（版本）</li>
<li>TkeCUUsedVersion ： 版本级别内存使用量(CU单位)</li>
<li>TkeCpuUsedService ： 服务级别cpu使用量</li>
<li>TkeMemUsedService ： 服务级别内存使用量</li>
<li>TkePodNumService ： 实例个数（服务）</li>
<li>TkePodUnavailableNumService ： 实例不可用个数（服务）</li>
<li>TkeCUUsedService ： 服务级别内存使用量(CU单位)</li>
</ul> 
     * @return MetricName <h4>基础套餐相关指标</h4>
<ul>
<li> StorageRead: 存储读请求次数 </li>
<li> StorageWrite: 存储写请求次数 </li>
<li> StorageCdnOriginFlux: CDN回源流量, 单位字节 </li>
<li> CDNFlux: CDN回源流量, 单位字节 </li>
<li> FunctionInvocation: 云函数调用次数 </li>
<li> FunctionGBs: 云函数资源使用量, 单位Mb*Ms </li>
<li> FunctionFlux: 云函数流量, 单位千字节(KB) </li>
<li> FunctionError: 云函数调用错误次数 </li>
<li> FunctionDuration: 云函数运行时间, 单位毫秒 </li>
<li> DbRead: 数据库读请求数 </li>
<li> DbWrite: 数据库写请求数 </li>
<li> DbCostTime10ms: 数据库耗时在10ms-50ms请求数 </li>
<li> DbCostTime50ms: 数据库耗时在50ms-100ms请求数 </li>
<li> DbCostTime100ms: 数据库耗时在100ms以上请求数 </li>
<li> TkeInvokeNum: 调用量 </li>
<li> FunctionConcurrentExecutions: 云函数并发执行个数</li>
<li> FunctionIdleProvisioned: 云函数预置并发闲置量 </li>
<li> FunctionConcurrencyMemoryMB: 云函数并发执行内存量 </li>
<li> FunctionThrottle: 云函数受限次数 </li>
<li> FunctionProvisionedConcurrency: 云函数预置并发 </li>
<li>ApiCountSummary: API总调用量(包括：数据库读+写，云存储读+写，云函数调用，CMS调用)</li>
<li>CapacitySummary： 容量(包括：云存储+数据库)</li>
<li>DatabaseApiCountSummary：数据库调用次数(包括：数据库读+写)</li>
<li>StorageApiCountSummary：云存储调用次数(包括：云存储读+写)</li>
<li>EnvQPSAll：环境总QPS</li>
</ul>

<h4>云托管相关指标</h4>
<ul>
<li>TkeCpuRatio ： 容器CPU占用率</li>
<li>TkeMemRatio ： 容器内存占用率</li>
<li>TkeCpuUsed ： 容器CPU使用量</li>
<li>TkeMemUsed ： 容器内存使用量</li>
<li>TkeResourceCpuVersion ： 实际分配CPU规格数 单位：核</li>
<li>TkeResourceMemVersion ： 实际分配内存规格数 单位：MB</li>
<li>TkeResourceCpuService ： CPU 规格量</li>
<li>TkeResourceMemService ： 内存 规格量</li>
<li>TkeCpuUsedVersion ： 版本级别cpu使用量</li>
<li>TkeMemUsedVersion ： 版本级别内存使用量</li>
<li>TkeCpuRatioVersion ： 版本级别cpu使用率</li>
<li>TkeMemRatioVersion ： 版本级别内存使用率</li>
<li>TkePodNumVersion ： 实例个数（版本）</li>
<li>TkePodUnavailableNumVersion ： 实例不可用个数（版本）</li>
<li>TkeCUUsedVersion ： 版本级别内存使用量(CU单位)</li>
<li>TkeCpuUsedService ： 服务级别cpu使用量</li>
<li>TkeMemUsedService ： 服务级别内存使用量</li>
<li>TkePodNumService ： 实例个数（服务）</li>
<li>TkePodUnavailableNumService ： 实例不可用个数（服务）</li>
<li>TkeCUUsedService ： 服务级别内存使用量(CU单位)</li>
</ul>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <h4>基础套餐相关指标</h4>
<ul>
<li> StorageRead: 存储读请求次数 </li>
<li> StorageWrite: 存储写请求次数 </li>
<li> StorageCdnOriginFlux: CDN回源流量, 单位字节 </li>
<li> CDNFlux: CDN回源流量, 单位字节 </li>
<li> FunctionInvocation: 云函数调用次数 </li>
<li> FunctionGBs: 云函数资源使用量, 单位Mb*Ms </li>
<li> FunctionFlux: 云函数流量, 单位千字节(KB) </li>
<li> FunctionError: 云函数调用错误次数 </li>
<li> FunctionDuration: 云函数运行时间, 单位毫秒 </li>
<li> DbRead: 数据库读请求数 </li>
<li> DbWrite: 数据库写请求数 </li>
<li> DbCostTime10ms: 数据库耗时在10ms-50ms请求数 </li>
<li> DbCostTime50ms: 数据库耗时在50ms-100ms请求数 </li>
<li> DbCostTime100ms: 数据库耗时在100ms以上请求数 </li>
<li> TkeInvokeNum: 调用量 </li>
<li> FunctionConcurrentExecutions: 云函数并发执行个数</li>
<li> FunctionIdleProvisioned: 云函数预置并发闲置量 </li>
<li> FunctionConcurrencyMemoryMB: 云函数并发执行内存量 </li>
<li> FunctionThrottle: 云函数受限次数 </li>
<li> FunctionProvisionedConcurrency: 云函数预置并发 </li>
<li>ApiCountSummary: API总调用量(包括：数据库读+写，云存储读+写，云函数调用，CMS调用)</li>
<li>CapacitySummary： 容量(包括：云存储+数据库)</li>
<li>DatabaseApiCountSummary：数据库调用次数(包括：数据库读+写)</li>
<li>StorageApiCountSummary：云存储调用次数(包括：云存储读+写)</li>
<li>EnvQPSAll：环境总QPS</li>
</ul>

<h4>云托管相关指标</h4>
<ul>
<li>TkeCpuRatio ： 容器CPU占用率</li>
<li>TkeMemRatio ： 容器内存占用率</li>
<li>TkeCpuUsed ： 容器CPU使用量</li>
<li>TkeMemUsed ： 容器内存使用量</li>
<li>TkeResourceCpuVersion ： 实际分配CPU规格数 单位：核</li>
<li>TkeResourceMemVersion ： 实际分配内存规格数 单位：MB</li>
<li>TkeResourceCpuService ： CPU 规格量</li>
<li>TkeResourceMemService ： 内存 规格量</li>
<li>TkeCpuUsedVersion ： 版本级别cpu使用量</li>
<li>TkeMemUsedVersion ： 版本级别内存使用量</li>
<li>TkeCpuRatioVersion ： 版本级别cpu使用率</li>
<li>TkeMemRatioVersion ： 版本级别内存使用率</li>
<li>TkePodNumVersion ： 实例个数（版本）</li>
<li>TkePodUnavailableNumVersion ： 实例不可用个数（版本）</li>
<li>TkeCUUsedVersion ： 版本级别内存使用量(CU单位)</li>
<li>TkeCpuUsedService ： 服务级别cpu使用量</li>
<li>TkeMemUsedService ： 服务级别内存使用量</li>
<li>TkePodNumService ： 实例个数（服务）</li>
<li>TkePodUnavailableNumService ： 实例不可用个数（服务）</li>
<li>TkeCUUsedService ： 服务级别内存使用量(CU单位)</li>
</ul>
     * @param MetricName <h4>基础套餐相关指标</h4>
<ul>
<li> StorageRead: 存储读请求次数 </li>
<li> StorageWrite: 存储写请求次数 </li>
<li> StorageCdnOriginFlux: CDN回源流量, 单位字节 </li>
<li> CDNFlux: CDN回源流量, 单位字节 </li>
<li> FunctionInvocation: 云函数调用次数 </li>
<li> FunctionGBs: 云函数资源使用量, 单位Mb*Ms </li>
<li> FunctionFlux: 云函数流量, 单位千字节(KB) </li>
<li> FunctionError: 云函数调用错误次数 </li>
<li> FunctionDuration: 云函数运行时间, 单位毫秒 </li>
<li> DbRead: 数据库读请求数 </li>
<li> DbWrite: 数据库写请求数 </li>
<li> DbCostTime10ms: 数据库耗时在10ms-50ms请求数 </li>
<li> DbCostTime50ms: 数据库耗时在50ms-100ms请求数 </li>
<li> DbCostTime100ms: 数据库耗时在100ms以上请求数 </li>
<li> TkeInvokeNum: 调用量 </li>
<li> FunctionConcurrentExecutions: 云函数并发执行个数</li>
<li> FunctionIdleProvisioned: 云函数预置并发闲置量 </li>
<li> FunctionConcurrencyMemoryMB: 云函数并发执行内存量 </li>
<li> FunctionThrottle: 云函数受限次数 </li>
<li> FunctionProvisionedConcurrency: 云函数预置并发 </li>
<li>ApiCountSummary: API总调用量(包括：数据库读+写，云存储读+写，云函数调用，CMS调用)</li>
<li>CapacitySummary： 容量(包括：云存储+数据库)</li>
<li>DatabaseApiCountSummary：数据库调用次数(包括：数据库读+写)</li>
<li>StorageApiCountSummary：云存储调用次数(包括：云存储读+写)</li>
<li>EnvQPSAll：环境总QPS</li>
</ul>

<h4>云托管相关指标</h4>
<ul>
<li>TkeCpuRatio ： 容器CPU占用率</li>
<li>TkeMemRatio ： 容器内存占用率</li>
<li>TkeCpuUsed ： 容器CPU使用量</li>
<li>TkeMemUsed ： 容器内存使用量</li>
<li>TkeResourceCpuVersion ： 实际分配CPU规格数 单位：核</li>
<li>TkeResourceMemVersion ： 实际分配内存规格数 单位：MB</li>
<li>TkeResourceCpuService ： CPU 规格量</li>
<li>TkeResourceMemService ： 内存 规格量</li>
<li>TkeCpuUsedVersion ： 版本级别cpu使用量</li>
<li>TkeMemUsedVersion ： 版本级别内存使用量</li>
<li>TkeCpuRatioVersion ： 版本级别cpu使用率</li>
<li>TkeMemRatioVersion ： 版本级别内存使用率</li>
<li>TkePodNumVersion ： 实例个数（版本）</li>
<li>TkePodUnavailableNumVersion ： 实例不可用个数（版本）</li>
<li>TkeCUUsedVersion ： 版本级别内存使用量(CU单位)</li>
<li>TkeCpuUsedService ： 服务级别cpu使用量</li>
<li>TkeMemUsedService ： 服务级别内存使用量</li>
<li>TkePodNumService ： 实例个数（服务）</li>
<li>TkePodUnavailableNumService ： 实例不可用个数（服务）</li>
<li>TkeCUUsedService ： 服务级别内存使用量(CU单位)</li>
</ul>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 开始时间，如2018-08-24 10:50:00, 开始时间需要早于结束时间至少五分钟(原因是因为目前统计粒度最小是5分钟) 
     * @return StartTime 开始时间，如2018-08-24 10:50:00, 开始时间需要早于结束时间至少五分钟(原因是因为目前统计粒度最小是5分钟)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如2018-08-24 10:50:00, 开始时间需要早于结束时间至少五分钟(原因是因为目前统计粒度最小是5分钟)
     * @param StartTime 开始时间，如2018-08-24 10:50:00, 开始时间需要早于结束时间至少五分钟(原因是因为目前统计粒度最小是5分钟)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，如2018-08-24 10:50:00, 结束时间需要晚于开始时间至少五分钟(原因是因为目前统计粒度最小是5分钟) 
     * @return EndTime 结束时间，如2018-08-24 10:50:00, 结束时间需要晚于开始时间至少五分钟(原因是因为目前统计粒度最小是5分钟)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，如2018-08-24 10:50:00, 结束时间需要晚于开始时间至少五分钟(原因是因为目前统计粒度最小是5分钟)
     * @param EndTime 结束时间，如2018-08-24 10:50:00, 结束时间需要晚于开始时间至少五分钟(原因是因为目前统计粒度最小是5分钟)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 资源ID, 目前仅对云函数、容器托管相关的指标有意义。云函数(FunctionInvocation, FunctionGBs, FunctionFlux, FunctionError, FunctionDuration)、容器托管（服务名称）, 如果想查询某个云函数的指标则在ResourceId中传入函数名; 如果只想查询整个namespace的指标, 则留空或不传.如果想查询数据库某个集合相关信息，传入集合名称 
     * @return ResourceID 资源ID, 目前仅对云函数、容器托管相关的指标有意义。云函数(FunctionInvocation, FunctionGBs, FunctionFlux, FunctionError, FunctionDuration)、容器托管（服务名称）, 如果想查询某个云函数的指标则在ResourceId中传入函数名; 如果只想查询整个namespace的指标, 则留空或不传.如果想查询数据库某个集合相关信息，传入集合名称
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set 资源ID, 目前仅对云函数、容器托管相关的指标有意义。云函数(FunctionInvocation, FunctionGBs, FunctionFlux, FunctionError, FunctionDuration)、容器托管（服务名称）, 如果想查询某个云函数的指标则在ResourceId中传入函数名; 如果只想查询整个namespace的指标, 则留空或不传.如果想查询数据库某个集合相关信息，传入集合名称
     * @param ResourceID 资源ID, 目前仅对云函数、容器托管相关的指标有意义。云函数(FunctionInvocation, FunctionGBs, FunctionFlux, FunctionError, FunctionDuration)、容器托管（服务名称）, 如果想查询某个云函数的指标则在ResourceId中传入函数名; 如果只想查询整个namespace的指标, 则留空或不传.如果想查询数据库某个集合相关信息，传入集合名称
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    public DescribeCurveDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCurveDataRequest(DescribeCurveDataRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);

    }
}

