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

public class SyncJobInfo extends AbstractModel{

    /**
    * 同步任务id，如：sync-btso140
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 同步任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 付款方式，PostPay(按量付费)、PrePay(包年包月)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * 期待运行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * 支持的所有操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllActions")
    @Expose
    private String [] AllActions;

    /**
    * 当前状态能进行的操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Actions")
    @Expose
    private String [] Actions;

    /**
    * 同步选项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Options")
    @Expose
    private Options Options;

    /**
    * 同步库表对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Objects")
    @Expose
    private Objects Objects;

    /**
    * 任务规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 过期时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 源端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * 源端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * 源端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcInfo")
    @Expose
    private Endpoint SrcInfo;

    /**
    * 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcNodeType")
    @Expose
    private String SrcNodeType;

    /**
    * 源端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcInfos")
    @Expose
    private SyncDBEndpointInfos SrcInfos;

    /**
    * 目标端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * 目标端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * 目标端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstInfo")
    @Expose
    private Endpoint DstInfo;

    /**
    * 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstNodeType")
    @Expose
    private String DstNodeType;

    /**
    * 目标端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstInfos")
    @Expose
    private SyncDBEndpointInfos DstInfos;

    /**
    * 创建时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 开始时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 标签相关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * 同步任务运行步骤信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private SyncDetailInfo Detail;

    /**
    * 用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeStatus")
    @Expose
    private String TradeStatus;

    /**
    * 同步链路规格，如micro,small,medium,large
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 下线时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 自动重试时间段设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
    * 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DumperResumeCtrl")
    @Expose
    private String DumperResumeCtrl;

    /**
     * Get 同步任务id，如：sync-btso140
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 同步任务id，如：sync-btso140
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 同步任务id，如：sync-btso140
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 同步任务id，如：sync-btso140
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 同步任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobName 同步任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 同步任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobName 同步任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 付款方式，PostPay(按量付费)、PrePay(包年包月)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 付款方式，PostPay(按量付费)、PrePay(包年包月)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付款方式，PostPay(按量付费)、PrePay(包年包月)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 付款方式，PostPay(按量付费)、PrePay(包年包月)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunMode 运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunMode 运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get 期待运行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpectRunTime 期待运行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set 期待运行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpectRunTime 期待运行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get 支持的所有操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllActions 支持的所有操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllActions() {
        return this.AllActions;
    }

    /**
     * Set 支持的所有操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllActions 支持的所有操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllActions(String [] AllActions) {
        this.AllActions = AllActions;
    }

    /**
     * Get 当前状态能进行的操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Actions 当前状态能进行的操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getActions() {
        return this.Actions;
    }

    /**
     * Set 当前状态能进行的操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param Actions 当前状态能进行的操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActions(String [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 同步选项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Options 同步选项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Options getOptions() {
        return this.Options;
    }

    /**
     * Set 同步选项
注意：此字段可能返回 null，表示取不到有效值。
     * @param Options 同步选项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptions(Options Options) {
        this.Options = Options;
    }

    /**
     * Get 同步库表对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Objects 同步库表对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Objects getObjects() {
        return this.Objects;
    }

    /**
     * Set 同步库表对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Objects 同步库表对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjects(Objects Objects) {
        this.Objects = Objects;
    }

    /**
     * Get 任务规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Specification 任务规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 任务规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Specification 任务规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 过期时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 源端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcRegion 源端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set 源端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcRegion 源端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get 源端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcDatabaseType 源端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set 源端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcDatabaseType 源端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcAccessType 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcAccessType 源端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get 源端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcInfo 源端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Endpoint getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcInfo 源端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcInfo(Endpoint SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcNodeType 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcNodeType() {
        return this.SrcNodeType;
    }

    /**
     * Set 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcNodeType 枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcNodeType(String SrcNodeType) {
        this.SrcNodeType = SrcNodeType;
    }

    /**
     * Get 源端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcInfos 源端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SyncDBEndpointInfos getSrcInfos() {
        return this.SrcInfos;
    }

    /**
     * Set 源端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcInfos 源端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcInfos(SyncDBEndpointInfos SrcInfos) {
        this.SrcInfos = SrcInfos;
    }

    /**
     * Get 目标端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstRegion 目标端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set 目标端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstRegion 目标端地域，如：ap-guangzhou等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get 目标端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstDatabaseType 目标端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set 目标端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstDatabaseType 目标端数据库类型，mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstAccessType 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstAccessType 目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get 目标端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstInfo 目标端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Endpoint getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 目标端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstInfo 目标端信息，单节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstInfo(Endpoint DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstNodeType 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstNodeType() {
        return this.DstNodeType;
    }

    /**
     * Set 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstNodeType 枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstNodeType(String DstNodeType) {
        this.DstNodeType = DstNodeType;
    }

    /**
     * Get 目标端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstInfos 目标端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SyncDBEndpointInfos getDstInfos() {
        return this.DstInfos;
    }

    /**
     * Set 目标端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstInfos 目标端信息，多节点数据库使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstInfos(SyncDBEndpointInfos DstInfos) {
        this.DstInfos = DstInfos;
    }

    /**
     * Get 创建时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 开始时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 标签相关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签相关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 同步任务运行步骤信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 同步任务运行步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SyncDetailInfo getDetail() {
        return this.Detail;
    }

    /**
     * Set 同步任务运行步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 同步任务运行步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(SyncDetailInfo Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeStatus 用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeStatus() {
        return this.TradeStatus;
    }

    /**
     * Set 用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeStatus 用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeStatus(String TradeStatus) {
        this.TradeStatus = TradeStatus;
    }

    /**
     * Get 同步链路规格，如micro,small,medium,large
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceClass 同步链路规格，如micro,small,medium,large
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set 同步链路规格，如micro,small,medium,large
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceClass 同步链路规格，如micro,small,medium,large
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenew 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenew 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 下线时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineTime 下线时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 下线时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineTime 下线时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 自动重试时间段设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRetryTimeRangeMinutes 自动重试时间段设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set 自动重试时间段设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRetryTimeRangeMinutes 自动重试时间段设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    /**
     * Get 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DumperResumeCtrl 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDumperResumeCtrl() {
        return this.DumperResumeCtrl;
    }

    /**
     * Set 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。
     * @param DumperResumeCtrl 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDumperResumeCtrl(String DumperResumeCtrl) {
        this.DumperResumeCtrl = DumperResumeCtrl;
    }

    public SyncJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncJobInfo(SyncJobInfo source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
        if (source.AllActions != null) {
            this.AllActions = new String[source.AllActions.length];
            for (int i = 0; i < source.AllActions.length; i++) {
                this.AllActions[i] = new String(source.AllActions[i]);
            }
        }
        if (source.Actions != null) {
            this.Actions = new String[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new String(source.Actions[i]);
            }
        }
        if (source.Options != null) {
            this.Options = new Options(source.Options);
        }
        if (source.Objects != null) {
            this.Objects = new Objects(source.Objects);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.SrcDatabaseType != null) {
            this.SrcDatabaseType = new String(source.SrcDatabaseType);
        }
        if (source.SrcAccessType != null) {
            this.SrcAccessType = new String(source.SrcAccessType);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new Endpoint(source.SrcInfo);
        }
        if (source.SrcNodeType != null) {
            this.SrcNodeType = new String(source.SrcNodeType);
        }
        if (source.SrcInfos != null) {
            this.SrcInfos = new SyncDBEndpointInfos(source.SrcInfos);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.DstDatabaseType != null) {
            this.DstDatabaseType = new String(source.DstDatabaseType);
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String(source.DstAccessType);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new Endpoint(source.DstInfo);
        }
        if (source.DstNodeType != null) {
            this.DstNodeType = new String(source.DstNodeType);
        }
        if (source.DstInfos != null) {
            this.DstInfos = new SyncDBEndpointInfos(source.DstInfos);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.Detail != null) {
            this.Detail = new SyncDetailInfo(source.Detail);
        }
        if (source.TradeStatus != null) {
            this.TradeStatus = new String(source.TradeStatus);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.AutoRetryTimeRangeMinutes != null) {
            this.AutoRetryTimeRangeMinutes = new Long(source.AutoRetryTimeRangeMinutes);
        }
        if (source.DumperResumeCtrl != null) {
            this.DumperResumeCtrl = new String(source.DumperResumeCtrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);
        this.setParamArraySimple(map, prefix + "AllActions.", this.AllActions);
        this.setParamArraySimple(map, prefix + "Actions.", this.Actions);
        this.setParamObj(map, prefix + "Options.", this.Options);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "SrcNodeType", this.SrcNodeType);
        this.setParamObj(map, prefix + "SrcInfos.", this.SrcInfos);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "DstNodeType", this.DstNodeType);
        this.setParamObj(map, prefix + "DstInfos.", this.DstInfos);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "TradeStatus", this.TradeStatus);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "AutoRetryTimeRangeMinutes", this.AutoRetryTimeRangeMinutes);
        this.setParamSimple(map, prefix + "DumperResumeCtrl", this.DumperResumeCtrl);

    }
}

