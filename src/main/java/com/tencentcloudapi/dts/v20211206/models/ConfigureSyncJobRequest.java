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

public class ConfigureSyncJobRequest extends AbstractModel {

    /**
    * <p>同步实例id（即标识一个同步作业），形如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路</p>
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * <p>目标端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路</p>
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * <p>同步库表对象信息</p>
    */
    @SerializedName("Objects")
    @Expose
    private Objects Objects;

    /**
    * <p>同步任务名称</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>配置任务模式，默认值为fullMode</p><p>枚举值：</p><ul><li>fullMode： 正常模式</li></ul>
    */
    @SerializedName("JobMode")
    @Expose
    private String JobMode;

    /**
    * <p>运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p>
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * <p>期待启动时间，当RunMode取值为Timed时，此值必填，形如：&quot;2006-01-02 15:04:05&quot;</p>
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * <p>源端tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，SrcInfos中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。</p>
    */
    @SerializedName("SrcConnectType")
    @Expose
    private String SrcConnectType;

    /**
    * <p>源端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p>
    */
    @SerializedName("SrcInfo")
    @Expose
    private Endpoint SrcInfo;

    /**
    * <p>源端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p>
    */
    @SerializedName("SrcInfos")
    @Expose
    private SyncDBEndpointInfos SrcInfos;

    /**
    * <p>枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster</p>
    */
    @SerializedName("SrcNodeType")
    @Expose
    private String SrcNodeType;

    /**
    * <p>目标端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p>
    */
    @SerializedName("DstInfo")
    @Expose
    private Endpoint DstInfo;

    /**
    * <p>目标端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p>
    */
    @SerializedName("DstInfos")
    @Expose
    private SyncDBEndpointInfos DstInfos;

    /**
    * <p>枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster</p>
    */
    @SerializedName("DstNodeType")
    @Expose
    private String DstNodeType;

    /**
    * <p>同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速</p>
    */
    @SerializedName("Options")
    @Expose
    private Options Options;

    /**
    * <p>自动重试的时间段、可设置5至720分钟、0表示不重试</p>
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
     * Get <p>同步实例id（即标识一个同步作业），形如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p> 
     * @return JobId <p>同步实例id（即标识一个同步作业），形如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>同步实例id（即标识一个同步作业），形如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     * @param JobId <p>同步实例id（即标识一个同步作业），形如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路</p> 
     * @return SrcAccessType <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路</p>
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路</p>
     * @param SrcAccessType <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路</p>
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get <p>目标端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路</p> 
     * @return DstAccessType <p>目标端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路</p>
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set <p>目标端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路</p>
     * @param DstAccessType <p>目标端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路</p>
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get <p>同步库表对象信息</p> 
     * @return Objects <p>同步库表对象信息</p>
     */
    public Objects getObjects() {
        return this.Objects;
    }

    /**
     * Set <p>同步库表对象信息</p>
     * @param Objects <p>同步库表对象信息</p>
     */
    public void setObjects(Objects Objects) {
        this.Objects = Objects;
    }

    /**
     * Get <p>同步任务名称</p> 
     * @return JobName <p>同步任务名称</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>同步任务名称</p>
     * @param JobName <p>同步任务名称</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>配置任务模式，默认值为fullMode</p><p>枚举值：</p><ul><li>fullMode： 正常模式</li></ul> 
     * @return JobMode <p>配置任务模式，默认值为fullMode</p><p>枚举值：</p><ul><li>fullMode： 正常模式</li></ul>
     */
    public String getJobMode() {
        return this.JobMode;
    }

    /**
     * Set <p>配置任务模式，默认值为fullMode</p><p>枚举值：</p><ul><li>fullMode： 正常模式</li></ul>
     * @param JobMode <p>配置任务模式，默认值为fullMode</p><p>枚举值：</p><ul><li>fullMode： 正常模式</li></ul>
     */
    public void setJobMode(String JobMode) {
        this.JobMode = JobMode;
    }

    /**
     * Get <p>运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p> 
     * @return RunMode <p>运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p>
     * @param RunMode <p>运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p>
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get <p>期待启动时间，当RunMode取值为Timed时，此值必填，形如：&quot;2006-01-02 15:04:05&quot;</p> 
     * @return ExpectRunTime <p>期待启动时间，当RunMode取值为Timed时，此值必填，形如：&quot;2006-01-02 15:04:05&quot;</p>
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set <p>期待启动时间，当RunMode取值为Timed时，此值必填，形如：&quot;2006-01-02 15:04:05&quot;</p>
     * @param ExpectRunTime <p>期待启动时间，当RunMode取值为Timed时，此值必填，形如：&quot;2006-01-02 15:04:05&quot;</p>
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get <p>源端tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，SrcInfos中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。</p> 
     * @return SrcConnectType <p>源端tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，SrcInfos中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。</p>
     */
    public String getSrcConnectType() {
        return this.SrcConnectType;
    }

    /**
     * Set <p>源端tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，SrcInfos中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。</p>
     * @param SrcConnectType <p>源端tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，SrcInfos中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。</p>
     */
    public void setSrcConnectType(String SrcConnectType) {
        this.SrcConnectType = SrcConnectType;
    }

    /**
     * Get <p>源端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p> 
     * @return SrcInfo <p>源端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p>
     */
    public Endpoint getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set <p>源端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p>
     * @param SrcInfo <p>源端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p>
     */
    public void setSrcInfo(Endpoint SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get <p>源端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p> 
     * @return SrcInfos <p>源端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p>
     */
    public SyncDBEndpointInfos getSrcInfos() {
        return this.SrcInfos;
    }

    /**
     * Set <p>源端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p>
     * @param SrcInfos <p>源端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p>
     */
    public void setSrcInfos(SyncDBEndpointInfos SrcInfos) {
        this.SrcInfos = SrcInfos;
    }

    /**
     * Get <p>枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster</p> 
     * @return SrcNodeType <p>枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster</p>
     */
    public String getSrcNodeType() {
        return this.SrcNodeType;
    }

    /**
     * Set <p>枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster</p>
     * @param SrcNodeType <p>枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster</p>
     */
    public void setSrcNodeType(String SrcNodeType) {
        this.SrcNodeType = SrcNodeType;
    }

    /**
     * Get <p>目标端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p> 
     * @return DstInfo <p>目标端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p>
     */
    public Endpoint getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set <p>目标端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p>
     * @param DstInfo <p>目标端信息，单机版类型数据库配置使用，且SrcNodeType传single。例如mysql、percona、mariadb等。</p>
     */
    public void setDstInfo(Endpoint DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get <p>目标端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p> 
     * @return DstInfos <p>目标端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p>
     */
    public SyncDBEndpointInfos getDstInfos() {
        return this.DstInfos;
    }

    /**
     * Set <p>目标端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p>
     * @param DstInfos <p>目标端信息，分布式类型数据库配置使用，且SrcNodeType传cluster。例如分布式数据库tdsqlmysql等，mongodb使用此参数透传。</p>
     */
    public void setDstInfos(SyncDBEndpointInfos DstInfos) {
        this.DstInfos = DstInfos;
    }

    /**
     * Get <p>枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster</p> 
     * @return DstNodeType <p>枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster</p>
     */
    public String getDstNodeType() {
        return this.DstNodeType;
    }

    /**
     * Set <p>枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster</p>
     * @param DstNodeType <p>枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster</p>
     */
    public void setDstNodeType(String DstNodeType) {
        this.DstNodeType = DstNodeType;
    }

    /**
     * Get <p>同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速</p> 
     * @return Options <p>同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速</p>
     */
    public Options getOptions() {
        return this.Options;
    }

    /**
     * Set <p>同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速</p>
     * @param Options <p>同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速</p>
     */
    public void setOptions(Options Options) {
        this.Options = Options;
    }

    /**
     * Get <p>自动重试的时间段、可设置5至720分钟、0表示不重试</p> 
     * @return AutoRetryTimeRangeMinutes <p>自动重试的时间段、可设置5至720分钟、0表示不重试</p>
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set <p>自动重试的时间段、可设置5至720分钟、0表示不重试</p>
     * @param AutoRetryTimeRangeMinutes <p>自动重试的时间段、可设置5至720分钟、0表示不重试</p>
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    public ConfigureSyncJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureSyncJobRequest(ConfigureSyncJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.SrcAccessType != null) {
            this.SrcAccessType = new String(source.SrcAccessType);
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String(source.DstAccessType);
        }
        if (source.Objects != null) {
            this.Objects = new Objects(source.Objects);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobMode != null) {
            this.JobMode = new String(source.JobMode);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
        if (source.SrcConnectType != null) {
            this.SrcConnectType = new String(source.SrcConnectType);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new Endpoint(source.SrcInfo);
        }
        if (source.SrcInfos != null) {
            this.SrcInfos = new SyncDBEndpointInfos(source.SrcInfos);
        }
        if (source.SrcNodeType != null) {
            this.SrcNodeType = new String(source.SrcNodeType);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new Endpoint(source.DstInfo);
        }
        if (source.DstInfos != null) {
            this.DstInfos = new SyncDBEndpointInfos(source.DstInfos);
        }
        if (source.DstNodeType != null) {
            this.DstNodeType = new String(source.DstNodeType);
        }
        if (source.Options != null) {
            this.Options = new Options(source.Options);
        }
        if (source.AutoRetryTimeRangeMinutes != null) {
            this.AutoRetryTimeRangeMinutes = new Long(source.AutoRetryTimeRangeMinutes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobMode", this.JobMode);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);
        this.setParamSimple(map, prefix + "SrcConnectType", this.SrcConnectType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "SrcInfos.", this.SrcInfos);
        this.setParamSimple(map, prefix + "SrcNodeType", this.SrcNodeType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamObj(map, prefix + "DstInfos.", this.DstInfos);
        this.setParamSimple(map, prefix + "DstNodeType", this.DstNodeType);
        this.setParamObj(map, prefix + "Options.", this.Options);
        this.setParamSimple(map, prefix + "AutoRetryTimeRangeMinutes", this.AutoRetryTimeRangeMinutes);

    }
}

