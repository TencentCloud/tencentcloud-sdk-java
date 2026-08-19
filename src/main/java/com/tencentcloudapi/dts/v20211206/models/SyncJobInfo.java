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

public class SyncJobInfo extends AbstractModel {

    /**
    * <p>同步任务id，如：sync-btso140</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>同步任务名</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>付款方式，PostPay(按量付费)、PrePay(包年包月)</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p>
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * <p>期待运行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * <p>支持的所有操作</p>
    */
    @SerializedName("AllActions")
    @Expose
    private String [] AllActions;

    /**
    * <p>当前状态能进行的操作</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Actions")
    @Expose
    private String [] Actions;

    /**
    * <p>同步选项</p>
    */
    @SerializedName("Options")
    @Expose
    private Options Options;

    /**
    * <p>同步库表对象</p>
    */
    @SerializedName("Objects")
    @Expose
    private Objects Objects;

    /**
    * <p>任务规格</p>
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * <p>过期时间，格式为 yyyy-mm-dd hh:mm:ss</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>源端地域，如：ap-guangzhou等</p>
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * <p>源端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p>
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p>
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * <p>源端信息，单节点数据库使用</p>
    */
    @SerializedName("SrcInfo")
    @Expose
    private Endpoint SrcInfo;

    /**
    * <p>枚举值：cluster、single。源库为单节点数据库使用single，多节点使用cluster</p>
    */
    @SerializedName("SrcNodeType")
    @Expose
    private String SrcNodeType;

    /**
    * <p>源端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p>
    */
    @SerializedName("SrcInfos")
    @Expose
    private SyncDBEndpointInfos SrcInfos;

    /**
    * <p>目标端地域，如：ap-guangzhou等</p>
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * <p>目标端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p>
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * <p>目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p>
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * <p>目标端信息，单节点数据库使用</p>
    */
    @SerializedName("DstInfo")
    @Expose
    private Endpoint DstInfo;

    /**
    * <p>枚举值：cluster、single。目标库为单节点数据库使用single，多节点使用cluster</p>
    */
    @SerializedName("DstNodeType")
    @Expose
    private String DstNodeType;

    /**
    * <p>目标端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p>
    */
    @SerializedName("DstInfos")
    @Expose
    private SyncDBEndpointInfos DstInfos;

    /**
    * <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>标签相关信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * <p>同步任务运行步骤信息</p>
    */
    @SerializedName("Detail")
    @Expose
    private SyncDetailInfo Detail;

    /**
    * <p>用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)</p>
    */
    @SerializedName("TradeStatus")
    @Expose
    private String TradeStatus;

    /**
    * <p>同步链路规格，如micro,small,medium,large</p>
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * <p>自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>下线时间，格式为 yyyy-mm-dd hh:mm:ss</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>动态修改对象，修改任务的状态等</p>
    */
    @SerializedName("OptObjStatus")
    @Expose
    private String OptObjStatus;

    /**
    * <p>自动重试时间段设置</p>
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
    * <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p>
    */
    @SerializedName("DumperResumeCtrl")
    @Expose
    private String DumperResumeCtrl;

    /**
     * Get <p>同步任务id，如：sync-btso140</p> 
     * @return JobId <p>同步任务id，如：sync-btso140</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>同步任务id，如：sync-btso140</p>
     * @param JobId <p>同步任务id，如：sync-btso140</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>同步任务名</p> 
     * @return JobName <p>同步任务名</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>同步任务名</p>
     * @param JobName <p>同步任务名</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>付款方式，PostPay(按量付费)、PrePay(包年包月)</p> 
     * @return PayMode <p>付款方式，PostPay(按量付费)、PrePay(包年包月)</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付款方式，PostPay(按量付费)、PrePay(包年包月)</p>
     * @param PayMode <p>付款方式，PostPay(按量付费)、PrePay(包年包月)</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p> 
     * @return RunMode <p>运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p>
     * @param RunMode <p>运行模式，Immediate(表示立即运行，默认为此项值)、Timed(表示定时运行)</p>
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get <p>期待运行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return ExpectRunTime <p>期待运行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set <p>期待运行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param ExpectRunTime <p>期待运行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get <p>支持的所有操作</p> 
     * @return AllActions <p>支持的所有操作</p>
     */
    public String [] getAllActions() {
        return this.AllActions;
    }

    /**
     * Set <p>支持的所有操作</p>
     * @param AllActions <p>支持的所有操作</p>
     */
    public void setAllActions(String [] AllActions) {
        this.AllActions = AllActions;
    }

    /**
     * Get <p>当前状态能进行的操作</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Actions <p>当前状态能进行的操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getActions() {
        return this.Actions;
    }

    /**
     * Set <p>当前状态能进行的操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Actions <p>当前状态能进行的操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActions(String [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get <p>同步选项</p> 
     * @return Options <p>同步选项</p>
     */
    public Options getOptions() {
        return this.Options;
    }

    /**
     * Set <p>同步选项</p>
     * @param Options <p>同步选项</p>
     */
    public void setOptions(Options Options) {
        this.Options = Options;
    }

    /**
     * Get <p>同步库表对象</p> 
     * @return Objects <p>同步库表对象</p>
     */
    public Objects getObjects() {
        return this.Objects;
    }

    /**
     * Set <p>同步库表对象</p>
     * @param Objects <p>同步库表对象</p>
     */
    public void setObjects(Objects Objects) {
        this.Objects = Objects;
    }

    /**
     * Get <p>任务规格</p> 
     * @return Specification <p>任务规格</p>
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set <p>任务规格</p>
     * @param Specification <p>任务规格</p>
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get <p>过期时间，格式为 yyyy-mm-dd hh:mm:ss</p> 
     * @return ExpireTime <p>过期时间，格式为 yyyy-mm-dd hh:mm:ss</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间，格式为 yyyy-mm-dd hh:mm:ss</p>
     * @param ExpireTime <p>过期时间，格式为 yyyy-mm-dd hh:mm:ss</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>源端地域，如：ap-guangzhou等</p> 
     * @return SrcRegion <p>源端地域，如：ap-guangzhou等</p>
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set <p>源端地域，如：ap-guangzhou等</p>
     * @param SrcRegion <p>源端地域，如：ap-guangzhou等</p>
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get <p>源端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p> 
     * @return SrcDatabaseType <p>源端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p>
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set <p>源端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p>
     * @param SrcDatabaseType <p>源端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p>
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p> 
     * @return SrcAccessType <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p>
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p>
     * @param SrcAccessType <p>源端接入类型，cdb(云数据库)、cvm(云服务器自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p>
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get <p>源端信息，单节点数据库使用</p> 
     * @return SrcInfo <p>源端信息，单节点数据库使用</p>
     */
    public Endpoint getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set <p>源端信息，单节点数据库使用</p>
     * @param SrcInfo <p>源端信息，单节点数据库使用</p>
     */
    public void setSrcInfo(Endpoint SrcInfo) {
        this.SrcInfo = SrcInfo;
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
     * Get <p>源端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p> 
     * @return SrcInfos <p>源端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p>
     */
    public SyncDBEndpointInfos getSrcInfos() {
        return this.SrcInfos;
    }

    /**
     * Set <p>源端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p>
     * @param SrcInfos <p>源端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p>
     */
    public void setSrcInfos(SyncDBEndpointInfos SrcInfos) {
        this.SrcInfos = SrcInfos;
    }

    /**
     * Get <p>目标端地域，如：ap-guangzhou等</p> 
     * @return DstRegion <p>目标端地域，如：ap-guangzhou等</p>
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set <p>目标端地域，如：ap-guangzhou等</p>
     * @param DstRegion <p>目标端地域，如：ap-guangzhou等</p>
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get <p>目标端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p> 
     * @return DstDatabaseType <p>目标端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p>
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set <p>目标端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p>
     * @param DstDatabaseType <p>目标端数据库类型，mysql,tdsqlmysql,mariadb,cynosdbmysql(表示tdsql-c实例),tdstore,percona,postgresql,mongodb等。</p>
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get <p>目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p> 
     * @return DstAccessType <p>目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p>
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set <p>目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p>
     * @param DstAccessType <p>目标端接入类型，cdb(云数据库)、cvm(云主机自建)、vpc(私有网络)、extranet(外网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、intranet(自研上云)</p>
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get <p>目标端信息，单节点数据库使用</p> 
     * @return DstInfo <p>目标端信息，单节点数据库使用</p>
     */
    public Endpoint getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set <p>目标端信息，单节点数据库使用</p>
     * @param DstInfo <p>目标端信息，单节点数据库使用</p>
     */
    public void setDstInfo(Endpoint DstInfo) {
        this.DstInfo = DstInfo;
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
     * Get <p>目标端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p> 
     * @return DstInfos <p>目标端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p>
     */
    public SyncDBEndpointInfos getDstInfos() {
        return this.DstInfos;
    }

    /**
     * Set <p>目标端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p>
     * @param DstInfos <p>目标端信息，若SrcNodeType=cluster，则源端信息在这个字段里，mongodb链路使用此参数透传。</p>
     */
    public void setDstInfos(SyncDBEndpointInfos DstInfos) {
        this.DstInfos = DstInfos;
    }

    /**
     * Get <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return CreateTime <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param CreateTime <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return StartTime <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param StartTime <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)</p> 
     * @return Status <p>任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)</p>
     * @param Status <p>任务状态，UnInitialized(未初始化)、Initialized(已初始化)、Checking(校验中)、CheckPass(校验通过)、CheckNotPass(校验不通过)、ReadyRunning(准备运行)、Running(运行中)、Pausing(暂停中)、Paused(已暂停)、Stopping(停止中)、Stopped(已结束)、ResumableErr(任务错误)、Resuming(恢复中)、Failed(失败)、Released(已释放)、Resetting(重置中)、Unknown(未知)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return EndTime <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param EndTime <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>标签相关信息</p> 
     * @return Tags <p>标签相关信息</p>
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签相关信息</p>
     * @param Tags <p>标签相关信息</p>
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>同步任务运行步骤信息</p> 
     * @return Detail <p>同步任务运行步骤信息</p>
     */
    public SyncDetailInfo getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>同步任务运行步骤信息</p>
     * @param Detail <p>同步任务运行步骤信息</p>
     */
    public void setDetail(SyncDetailInfo Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)</p> 
     * @return TradeStatus <p>用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)</p>
     */
    public String getTradeStatus() {
        return this.TradeStatus;
    }

    /**
     * Set <p>用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)</p>
     * @param TradeStatus <p>用于计费的状态，可能取值有：Normal(正常状态)、Resizing(变配中)、Renewing(续费中)、Isolating(隔离中)、Isolated(已隔离)、Offlining(下线中)、Offlined(已下线)、NotBilled(未计费)、Recovering(解隔离)、PostPay2Prepaying(按量计费转包年包月中)、PrePay2Postpaying(包年包月转按量计费中)</p>
     */
    public void setTradeStatus(String TradeStatus) {
        this.TradeStatus = TradeStatus;
    }

    /**
     * Get <p>同步链路规格，如micro,small,medium,large</p> 
     * @return InstanceClass <p>同步链路规格，如micro,small,medium,large</p>
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set <p>同步链路规格，如micro,small,medium,large</p>
     * @param InstanceClass <p>同步链路规格，如micro,small,medium,large</p>
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get <p>自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）</p> 
     * @return AutoRenew <p>自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）</p>
     * @param AutoRenew <p>自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费）</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>下线时间，格式为 yyyy-mm-dd hh:mm:ss</p> 
     * @return OfflineTime <p>下线时间，格式为 yyyy-mm-dd hh:mm:ss</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>下线时间，格式为 yyyy-mm-dd hh:mm:ss</p>
     * @param OfflineTime <p>下线时间，格式为 yyyy-mm-dd hh:mm:ss</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>动态修改对象，修改任务的状态等</p> 
     * @return OptObjStatus <p>动态修改对象，修改任务的状态等</p>
     */
    public String getOptObjStatus() {
        return this.OptObjStatus;
    }

    /**
     * Set <p>动态修改对象，修改任务的状态等</p>
     * @param OptObjStatus <p>动态修改对象，修改任务的状态等</p>
     */
    public void setOptObjStatus(String OptObjStatus) {
        this.OptObjStatus = OptObjStatus;
    }

    /**
     * Get <p>自动重试时间段设置</p> 
     * @return AutoRetryTimeRangeMinutes <p>自动重试时间段设置</p>
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set <p>自动重试时间段设置</p>
     * @param AutoRetryTimeRangeMinutes <p>自动重试时间段设置</p>
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    /**
     * Get <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p> 
     * @return DumperResumeCtrl <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p>
     */
    public String getDumperResumeCtrl() {
        return this.DumperResumeCtrl;
    }

    /**
     * Set <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p>
     * @param DumperResumeCtrl <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p>
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
        if (source.OptObjStatus != null) {
            this.OptObjStatus = new String(source.OptObjStatus);
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
        this.setParamSimple(map, prefix + "OptObjStatus", this.OptObjStatus);
        this.setParamSimple(map, prefix + "AutoRetryTimeRangeMinutes", this.AutoRetryTimeRangeMinutes);
        this.setParamSimple(map, prefix + "DumperResumeCtrl", this.DumperResumeCtrl);

    }
}

