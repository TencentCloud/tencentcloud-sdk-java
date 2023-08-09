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

public class ConfigureSyncJobRequest extends AbstractModel{

    /**
    * 同步实例id（即标识一个同步作业），形如sync-werwfs23
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * 同步库表对象信息
    */
    @SerializedName("Objects")
    @Expose
    private Objects Objects;

    /**
    * 同步任务名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 枚举值是 liteMode 和 fullMode ，分别对应精简模式或正常模式
    */
    @SerializedName("JobMode")
    @Expose
    private String JobMode;

    /**
    * 运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * 期待启动时间，当RunMode取值为Timed时，此值必填，形如："2006-01-02 15:04:05"
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * 源端信息，单节点数据库使用，且SrcNodeType传single
    */
    @SerializedName("SrcInfo")
    @Expose
    private Endpoint SrcInfo;

    /**
    * 源端信息，多节点数据库使用，且SrcNodeType传cluster
    */
    @SerializedName("SrcInfos")
    @Expose
    private SyncDBEndpointInfos SrcInfos;

    /**
    * 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster
    */
    @SerializedName("SrcNodeType")
    @Expose
    private String SrcNodeType;

    /**
    * 目标端信息，单节点数据库使用
    */
    @SerializedName("DstInfo")
    @Expose
    private Endpoint DstInfo;

    /**
    * 目标端信息，多节点数据库使用，且DstNodeType传cluster
    */
    @SerializedName("DstInfos")
    @Expose
    private SyncDBEndpointInfos DstInfos;

    /**
    * 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster
    */
    @SerializedName("DstNodeType")
    @Expose
    private String DstNodeType;

    /**
    * 同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速
    */
    @SerializedName("Options")
    @Expose
    private Options Options;

    /**
    * 自动重试的时间段、可设置5至720分钟、0表示不重试
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
     * Get 同步实例id（即标识一个同步作业），形如sync-werwfs23 
     * @return JobId 同步实例id（即标识一个同步作业），形如sync-werwfs23
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 同步实例id（即标识一个同步作业），形如sync-werwfs23
     * @param JobId 同步实例id（即标识一个同步作业），形如sync-werwfs23
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路 
     * @return SrcAccessType 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路
     * @param SrcAccessType 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云),注意具体可选值依赖当前链路
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路 
     * @return DstAccessType 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路
     * @param DstAccessType 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、ckafka(CKafka实例),注意具体可选值依赖当前链路
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get 同步库表对象信息 
     * @return Objects 同步库表对象信息
     */
    public Objects getObjects() {
        return this.Objects;
    }

    /**
     * Set 同步库表对象信息
     * @param Objects 同步库表对象信息
     */
    public void setObjects(Objects Objects) {
        this.Objects = Objects;
    }

    /**
     * Get 同步任务名称 
     * @return JobName 同步任务名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 同步任务名称
     * @param JobName 同步任务名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 枚举值是 liteMode 和 fullMode ，分别对应精简模式或正常模式 
     * @return JobMode 枚举值是 liteMode 和 fullMode ，分别对应精简模式或正常模式
     */
    public String getJobMode() {
        return this.JobMode;
    }

    /**
     * Set 枚举值是 liteMode 和 fullMode ，分别对应精简模式或正常模式
     * @param JobMode 枚举值是 liteMode 和 fullMode ，分别对应精简模式或正常模式
     */
    public void setJobMode(String JobMode) {
        this.JobMode = JobMode;
    }

    /**
     * Get 运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行) 
     * @return RunMode 运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)
     * @param RunMode 运行模式，取值如：Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get 期待启动时间，当RunMode取值为Timed时，此值必填，形如："2006-01-02 15:04:05" 
     * @return ExpectRunTime 期待启动时间，当RunMode取值为Timed时，此值必填，形如："2006-01-02 15:04:05"
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set 期待启动时间，当RunMode取值为Timed时，此值必填，形如："2006-01-02 15:04:05"
     * @param ExpectRunTime 期待启动时间，当RunMode取值为Timed时，此值必填，形如："2006-01-02 15:04:05"
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get 源端信息，单节点数据库使用，且SrcNodeType传single 
     * @return SrcInfo 源端信息，单节点数据库使用，且SrcNodeType传single
     */
    public Endpoint getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源端信息，单节点数据库使用，且SrcNodeType传single
     * @param SrcInfo 源端信息，单节点数据库使用，且SrcNodeType传single
     */
    public void setSrcInfo(Endpoint SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 源端信息，多节点数据库使用，且SrcNodeType传cluster 
     * @return SrcInfos 源端信息，多节点数据库使用，且SrcNodeType传cluster
     */
    public SyncDBEndpointInfos getSrcInfos() {
        return this.SrcInfos;
    }

    /**
     * Set 源端信息，多节点数据库使用，且SrcNodeType传cluster
     * @param SrcInfos 源端信息，多节点数据库使用，且SrcNodeType传cluster
     */
    public void setSrcInfos(SyncDBEndpointInfos SrcInfos) {
        this.SrcInfos = SrcInfos;
    }

    /**
     * Get 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster 
     * @return SrcNodeType 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster
     */
    public String getSrcNodeType() {
        return this.SrcNodeType;
    }

    /**
     * Set 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster
     * @param SrcNodeType 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster
     */
    public void setSrcNodeType(String SrcNodeType) {
        this.SrcNodeType = SrcNodeType;
    }

    /**
     * Get 目标端信息，单节点数据库使用 
     * @return DstInfo 目标端信息，单节点数据库使用
     */
    public Endpoint getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 目标端信息，单节点数据库使用
     * @param DstInfo 目标端信息，单节点数据库使用
     */
    public void setDstInfo(Endpoint DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 目标端信息，多节点数据库使用，且DstNodeType传cluster 
     * @return DstInfos 目标端信息，多节点数据库使用，且DstNodeType传cluster
     */
    public SyncDBEndpointInfos getDstInfos() {
        return this.DstInfos;
    }

    /**
     * Set 目标端信息，多节点数据库使用，且DstNodeType传cluster
     * @param DstInfos 目标端信息，多节点数据库使用，且DstNodeType传cluster
     */
    public void setDstInfos(SyncDBEndpointInfos DstInfos) {
        this.DstInfos = DstInfos;
    }

    /**
     * Get 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster 
     * @return DstNodeType 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster
     */
    public String getDstNodeType() {
        return this.DstNodeType;
    }

    /**
     * Set 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster
     * @param DstNodeType 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster
     */
    public void setDstNodeType(String DstNodeType) {
        this.DstNodeType = DstNodeType;
    }

    /**
     * Get 同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速 
     * @return Options 同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速
     */
    public Options getOptions() {
        return this.Options;
    }

    /**
     * Set 同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速
     * @param Options 同步任务选项；该字段下的RateLimitOption暂时无法生效、如果需要修改限速、可通过ModifySyncRateLimit接口完成限速
     */
    public void setOptions(Options Options) {
        this.Options = Options;
    }

    /**
     * Get 自动重试的时间段、可设置5至720分钟、0表示不重试 
     * @return AutoRetryTimeRangeMinutes 自动重试的时间段、可设置5至720分钟、0表示不重试
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set 自动重试的时间段、可设置5至720分钟、0表示不重试
     * @param AutoRetryTimeRangeMinutes 自动重试的时间段、可设置5至720分钟、0表示不重试
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

