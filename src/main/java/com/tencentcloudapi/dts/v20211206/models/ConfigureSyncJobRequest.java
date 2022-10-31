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
    * 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * 源端信息
    */
    @SerializedName("SrcInfo")
    @Expose
    private Endpoint SrcInfo;

    /**
    * 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * 目标端信息
    */
    @SerializedName("DstInfo")
    @Expose
    private Endpoint DstInfo;

    /**
    * 同步任务选项
    */
    @SerializedName("Options")
    @Expose
    private Options Options;

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
     * Get 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路 
     * @return SrcAccessType 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路
     * @param SrcAccessType 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get 源端信息 
     * @return SrcInfo 源端信息
     */
    public Endpoint getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源端信息
     * @param SrcInfo 源端信息
     */
    public void setSrcInfo(Endpoint SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路 
     * @return DstAccessType 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路
     * @param DstAccessType 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)、noProxy,注意具体可选值依赖当前链路
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get 目标端信息 
     * @return DstInfo 目标端信息
     */
    public Endpoint getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 目标端信息
     * @param DstInfo 目标端信息
     */
    public void setDstInfo(Endpoint DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 同步任务选项 
     * @return Options 同步任务选项
     */
    public Options getOptions() {
        return this.Options;
    }

    /**
     * Set 同步任务选项
     * @param Options 同步任务选项
     */
    public void setOptions(Options Options) {
        this.Options = Options;
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
        if (source.SrcInfo != null) {
            this.SrcInfo = new Endpoint(source.SrcInfo);
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String(source.DstAccessType);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new Endpoint(source.DstInfo);
        }
        if (source.Options != null) {
            this.Options = new Options(source.Options);
        }
        if (source.Objects != null) {
            this.Objects = new Objects(source.Objects);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamObj(map, prefix + "Options.", this.Options);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);

    }
}

