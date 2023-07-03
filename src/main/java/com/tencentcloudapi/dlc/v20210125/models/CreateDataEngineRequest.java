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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDataEngineRequest extends AbstractModel{

    /**
    * 引擎类型spark/presto
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 虚拟集群名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 集群类型 spark_private/presto_private/presto_cu/spark_cu
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 计费模式 0=共享模式 1=按量计费 2=包年包月
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 是否自动启动集群
    */
    @SerializedName("AutoResume")
    @Expose
    private Boolean AutoResume;

    /**
    * 最小资源
    */
    @SerializedName("MinClusters")
    @Expose
    private Long MinClusters;

    /**
    * 最大资源
    */
    @SerializedName("MaxClusters")
    @Expose
    private Long MaxClusters;

    /**
    * 是否为默认虚拟集群
    */
    @SerializedName("DefaultDataEngine")
    @Expose
    private Boolean DefaultDataEngine;

    /**
    * VPC网段
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 描述信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 集群规模
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 计费类型，后付费：0，预付费：1。当前只支持后付费，不填默认为后付费。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 资源使用时长，后付费：固定填3600，预付费：最少填1，代表购买资源一个月，最长不超过120。默认3600
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 资源使用时长的单位，后付费：s，预付费：m。默认为s
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 资源的自动续费标志。后付费无需续费，固定填0；预付费下：0表示手动续费、1代表自动续费、2代表不续费，在0下如果是大客户，会自动帮大客户续费。默认为0
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 创建资源的时候需要绑定的标签信息
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起
    */
    @SerializedName("AutoSuspend")
    @Expose
    private Boolean AutoSuspend;

    /**
    * 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥）
    */
    @SerializedName("CrontabResumeSuspend")
    @Expose
    private Long CrontabResumeSuspend;

    /**
    * 定时启停策略，复杂类型：包含启停时间、挂起集群策略
    */
    @SerializedName("CrontabResumeSuspendStrategy")
    @Expose
    private CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy;

    /**
    * 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL
    */
    @SerializedName("EngineExecType")
    @Expose
    private String EngineExecType;

    /**
    * 单个集群最大并发任务数，默认5
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * 可容忍的排队时间，默认0。当任务排队的时间超过可容忍的时间时可能会触发扩容。如果该参数为0，则表示一旦有任务排队就可能立即触发扩容。
    */
    @SerializedName("TolerableQueueTime")
    @Expose
    private Long TolerableQueueTime;

    /**
    * 集群自动挂起时间，默认10分钟
    */
    @SerializedName("AutoSuspendTime")
    @Expose
    private Long AutoSuspendTime;

    /**
    * 资源类型。Standard_CU：标准型；Memory_CU：内存型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 集群高级配置
    */
    @SerializedName("DataEngineConfigPairs")
    @Expose
    private DataEngineConfigPair [] DataEngineConfigPairs;

    /**
    * 集群镜像版本名字。如SuperSQL-P 1.1;SuperSQL-S 3.2等,不传，默认创建最新镜像版本的集群
    */
    @SerializedName("ImageVersionName")
    @Expose
    private String ImageVersionName;

    /**
    * 主集群名称，创建容灾集群时指定
    */
    @SerializedName("MainClusterName")
    @Expose
    private String MainClusterName;

    /**
    * spark jar 包年包月集群是否开启弹性
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Boolean ElasticSwitch;

    /**
    * spark jar 包年包月集群弹性上限
    */
    @SerializedName("ElasticLimit")
    @Expose
    private Long ElasticLimit;

    /**
    * spark作业集群session资源配置模板
    */
    @SerializedName("SessionResourceTemplate")
    @Expose
    private SessionResourceTemplate SessionResourceTemplate;

    /**
     * Get 引擎类型spark/presto 
     * @return EngineType 引擎类型spark/presto
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎类型spark/presto
     * @param EngineType 引擎类型spark/presto
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 虚拟集群名称 
     * @return DataEngineName 虚拟集群名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 虚拟集群名称
     * @param DataEngineName 虚拟集群名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 集群类型 spark_private/presto_private/presto_cu/spark_cu 
     * @return ClusterType 集群类型 spark_private/presto_private/presto_cu/spark_cu
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型 spark_private/presto_private/presto_cu/spark_cu
     * @param ClusterType 集群类型 spark_private/presto_private/presto_cu/spark_cu
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 计费模式 0=共享模式 1=按量计费 2=包年包月 
     * @return Mode 计费模式 0=共享模式 1=按量计费 2=包年包月
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 计费模式 0=共享模式 1=按量计费 2=包年包月
     * @param Mode 计费模式 0=共享模式 1=按量计费 2=包年包月
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 是否自动启动集群 
     * @return AutoResume 是否自动启动集群
     */
    public Boolean getAutoResume() {
        return this.AutoResume;
    }

    /**
     * Set 是否自动启动集群
     * @param AutoResume 是否自动启动集群
     */
    public void setAutoResume(Boolean AutoResume) {
        this.AutoResume = AutoResume;
    }

    /**
     * Get 最小资源 
     * @return MinClusters 最小资源
     */
    public Long getMinClusters() {
        return this.MinClusters;
    }

    /**
     * Set 最小资源
     * @param MinClusters 最小资源
     */
    public void setMinClusters(Long MinClusters) {
        this.MinClusters = MinClusters;
    }

    /**
     * Get 最大资源 
     * @return MaxClusters 最大资源
     */
    public Long getMaxClusters() {
        return this.MaxClusters;
    }

    /**
     * Set 最大资源
     * @param MaxClusters 最大资源
     */
    public void setMaxClusters(Long MaxClusters) {
        this.MaxClusters = MaxClusters;
    }

    /**
     * Get 是否为默认虚拟集群 
     * @return DefaultDataEngine 是否为默认虚拟集群
     * @deprecated
     */
    @Deprecated
    public Boolean getDefaultDataEngine() {
        return this.DefaultDataEngine;
    }

    /**
     * Set 是否为默认虚拟集群
     * @param DefaultDataEngine 是否为默认虚拟集群
     * @deprecated
     */
    @Deprecated
    public void setDefaultDataEngine(Boolean DefaultDataEngine) {
        this.DefaultDataEngine = DefaultDataEngine;
    }

    /**
     * Get VPC网段 
     * @return CidrBlock VPC网段
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set VPC网段
     * @param CidrBlock VPC网段
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 描述信息 
     * @return Message 描述信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 描述信息
     * @param Message 描述信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 集群规模 
     * @return Size 集群规模
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 集群规模
     * @param Size 集群规模
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 计费类型，后付费：0，预付费：1。当前只支持后付费，不填默认为后付费。 
     * @return PayMode 计费类型，后付费：0，预付费：1。当前只支持后付费，不填默认为后付费。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费类型，后付费：0，预付费：1。当前只支持后付费，不填默认为后付费。
     * @param PayMode 计费类型，后付费：0，预付费：1。当前只支持后付费，不填默认为后付费。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 资源使用时长，后付费：固定填3600，预付费：最少填1，代表购买资源一个月，最长不超过120。默认3600 
     * @return TimeSpan 资源使用时长，后付费：固定填3600，预付费：最少填1，代表购买资源一个月，最长不超过120。默认3600
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 资源使用时长，后付费：固定填3600，预付费：最少填1，代表购买资源一个月，最长不超过120。默认3600
     * @param TimeSpan 资源使用时长，后付费：固定填3600，预付费：最少填1，代表购买资源一个月，最长不超过120。默认3600
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 资源使用时长的单位，后付费：s，预付费：m。默认为s 
     * @return TimeUnit 资源使用时长的单位，后付费：s，预付费：m。默认为s
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 资源使用时长的单位，后付费：s，预付费：m。默认为s
     * @param TimeUnit 资源使用时长的单位，后付费：s，预付费：m。默认为s
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 资源的自动续费标志。后付费无需续费，固定填0；预付费下：0表示手动续费、1代表自动续费、2代表不续费，在0下如果是大客户，会自动帮大客户续费。默认为0 
     * @return AutoRenew 资源的自动续费标志。后付费无需续费，固定填0；预付费下：0表示手动续费、1代表自动续费、2代表不续费，在0下如果是大客户，会自动帮大客户续费。默认为0
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 资源的自动续费标志。后付费无需续费，固定填0；预付费下：0表示手动续费、1代表自动续费、2代表不续费，在0下如果是大客户，会自动帮大客户续费。默认为0
     * @param AutoRenew 资源的自动续费标志。后付费无需续费，固定填0；预付费下：0表示手动续费、1代表自动续费、2代表不续费，在0下如果是大客户，会自动帮大客户续费。默认为0
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 创建资源的时候需要绑定的标签信息 
     * @return Tags 创建资源的时候需要绑定的标签信息
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 创建资源的时候需要绑定的标签信息
     * @param Tags 创建资源的时候需要绑定的标签信息
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起 
     * @return AutoSuspend 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起
     */
    public Boolean getAutoSuspend() {
        return this.AutoSuspend;
    }

    /**
     * Set 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起
     * @param AutoSuspend 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起
     */
    public void setAutoSuspend(Boolean AutoSuspend) {
        this.AutoSuspend = AutoSuspend;
    }

    /**
     * Get 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥） 
     * @return CrontabResumeSuspend 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥）
     */
    public Long getCrontabResumeSuspend() {
        return this.CrontabResumeSuspend;
    }

    /**
     * Set 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥）
     * @param CrontabResumeSuspend 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥）
     */
    public void setCrontabResumeSuspend(Long CrontabResumeSuspend) {
        this.CrontabResumeSuspend = CrontabResumeSuspend;
    }

    /**
     * Get 定时启停策略，复杂类型：包含启停时间、挂起集群策略 
     * @return CrontabResumeSuspendStrategy 定时启停策略，复杂类型：包含启停时间、挂起集群策略
     */
    public CrontabResumeSuspendStrategy getCrontabResumeSuspendStrategy() {
        return this.CrontabResumeSuspendStrategy;
    }

    /**
     * Set 定时启停策略，复杂类型：包含启停时间、挂起集群策略
     * @param CrontabResumeSuspendStrategy 定时启停策略，复杂类型：包含启停时间、挂起集群策略
     */
    public void setCrontabResumeSuspendStrategy(CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy) {
        this.CrontabResumeSuspendStrategy = CrontabResumeSuspendStrategy;
    }

    /**
     * Get 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL 
     * @return EngineExecType 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL
     */
    public String getEngineExecType() {
        return this.EngineExecType;
    }

    /**
     * Set 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL
     * @param EngineExecType 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL
     */
    public void setEngineExecType(String EngineExecType) {
        this.EngineExecType = EngineExecType;
    }

    /**
     * Get 单个集群最大并发任务数，默认5 
     * @return MaxConcurrency 单个集群最大并发任务数，默认5
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 单个集群最大并发任务数，默认5
     * @param MaxConcurrency 单个集群最大并发任务数，默认5
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get 可容忍的排队时间，默认0。当任务排队的时间超过可容忍的时间时可能会触发扩容。如果该参数为0，则表示一旦有任务排队就可能立即触发扩容。 
     * @return TolerableQueueTime 可容忍的排队时间，默认0。当任务排队的时间超过可容忍的时间时可能会触发扩容。如果该参数为0，则表示一旦有任务排队就可能立即触发扩容。
     */
    public Long getTolerableQueueTime() {
        return this.TolerableQueueTime;
    }

    /**
     * Set 可容忍的排队时间，默认0。当任务排队的时间超过可容忍的时间时可能会触发扩容。如果该参数为0，则表示一旦有任务排队就可能立即触发扩容。
     * @param TolerableQueueTime 可容忍的排队时间，默认0。当任务排队的时间超过可容忍的时间时可能会触发扩容。如果该参数为0，则表示一旦有任务排队就可能立即触发扩容。
     */
    public void setTolerableQueueTime(Long TolerableQueueTime) {
        this.TolerableQueueTime = TolerableQueueTime;
    }

    /**
     * Get 集群自动挂起时间，默认10分钟 
     * @return AutoSuspendTime 集群自动挂起时间，默认10分钟
     */
    public Long getAutoSuspendTime() {
        return this.AutoSuspendTime;
    }

    /**
     * Set 集群自动挂起时间，默认10分钟
     * @param AutoSuspendTime 集群自动挂起时间，默认10分钟
     */
    public void setAutoSuspendTime(Long AutoSuspendTime) {
        this.AutoSuspendTime = AutoSuspendTime;
    }

    /**
     * Get 资源类型。Standard_CU：标准型；Memory_CU：内存型 
     * @return ResourceType 资源类型。Standard_CU：标准型；Memory_CU：内存型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型。Standard_CU：标准型；Memory_CU：内存型
     * @param ResourceType 资源类型。Standard_CU：标准型；Memory_CU：内存型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 集群高级配置 
     * @return DataEngineConfigPairs 集群高级配置
     */
    public DataEngineConfigPair [] getDataEngineConfigPairs() {
        return this.DataEngineConfigPairs;
    }

    /**
     * Set 集群高级配置
     * @param DataEngineConfigPairs 集群高级配置
     */
    public void setDataEngineConfigPairs(DataEngineConfigPair [] DataEngineConfigPairs) {
        this.DataEngineConfigPairs = DataEngineConfigPairs;
    }

    /**
     * Get 集群镜像版本名字。如SuperSQL-P 1.1;SuperSQL-S 3.2等,不传，默认创建最新镜像版本的集群 
     * @return ImageVersionName 集群镜像版本名字。如SuperSQL-P 1.1;SuperSQL-S 3.2等,不传，默认创建最新镜像版本的集群
     */
    public String getImageVersionName() {
        return this.ImageVersionName;
    }

    /**
     * Set 集群镜像版本名字。如SuperSQL-P 1.1;SuperSQL-S 3.2等,不传，默认创建最新镜像版本的集群
     * @param ImageVersionName 集群镜像版本名字。如SuperSQL-P 1.1;SuperSQL-S 3.2等,不传，默认创建最新镜像版本的集群
     */
    public void setImageVersionName(String ImageVersionName) {
        this.ImageVersionName = ImageVersionName;
    }

    /**
     * Get 主集群名称，创建容灾集群时指定 
     * @return MainClusterName 主集群名称，创建容灾集群时指定
     */
    public String getMainClusterName() {
        return this.MainClusterName;
    }

    /**
     * Set 主集群名称，创建容灾集群时指定
     * @param MainClusterName 主集群名称，创建容灾集群时指定
     */
    public void setMainClusterName(String MainClusterName) {
        this.MainClusterName = MainClusterName;
    }

    /**
     * Get spark jar 包年包月集群是否开启弹性 
     * @return ElasticSwitch spark jar 包年包月集群是否开启弹性
     */
    public Boolean getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set spark jar 包年包月集群是否开启弹性
     * @param ElasticSwitch spark jar 包年包月集群是否开启弹性
     */
    public void setElasticSwitch(Boolean ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get spark jar 包年包月集群弹性上限 
     * @return ElasticLimit spark jar 包年包月集群弹性上限
     */
    public Long getElasticLimit() {
        return this.ElasticLimit;
    }

    /**
     * Set spark jar 包年包月集群弹性上限
     * @param ElasticLimit spark jar 包年包月集群弹性上限
     */
    public void setElasticLimit(Long ElasticLimit) {
        this.ElasticLimit = ElasticLimit;
    }

    /**
     * Get spark作业集群session资源配置模板 
     * @return SessionResourceTemplate spark作业集群session资源配置模板
     */
    public SessionResourceTemplate getSessionResourceTemplate() {
        return this.SessionResourceTemplate;
    }

    /**
     * Set spark作业集群session资源配置模板
     * @param SessionResourceTemplate spark作业集群session资源配置模板
     */
    public void setSessionResourceTemplate(SessionResourceTemplate SessionResourceTemplate) {
        this.SessionResourceTemplate = SessionResourceTemplate;
    }

    public CreateDataEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataEngineRequest(CreateDataEngineRequest source) {
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.AutoResume != null) {
            this.AutoResume = new Boolean(source.AutoResume);
        }
        if (source.MinClusters != null) {
            this.MinClusters = new Long(source.MinClusters);
        }
        if (source.MaxClusters != null) {
            this.MaxClusters = new Long(source.MaxClusters);
        }
        if (source.DefaultDataEngine != null) {
            this.DefaultDataEngine = new Boolean(source.DefaultDataEngine);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.AutoSuspend != null) {
            this.AutoSuspend = new Boolean(source.AutoSuspend);
        }
        if (source.CrontabResumeSuspend != null) {
            this.CrontabResumeSuspend = new Long(source.CrontabResumeSuspend);
        }
        if (source.CrontabResumeSuspendStrategy != null) {
            this.CrontabResumeSuspendStrategy = new CrontabResumeSuspendStrategy(source.CrontabResumeSuspendStrategy);
        }
        if (source.EngineExecType != null) {
            this.EngineExecType = new String(source.EngineExecType);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.TolerableQueueTime != null) {
            this.TolerableQueueTime = new Long(source.TolerableQueueTime);
        }
        if (source.AutoSuspendTime != null) {
            this.AutoSuspendTime = new Long(source.AutoSuspendTime);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.DataEngineConfigPairs != null) {
            this.DataEngineConfigPairs = new DataEngineConfigPair[source.DataEngineConfigPairs.length];
            for (int i = 0; i < source.DataEngineConfigPairs.length; i++) {
                this.DataEngineConfigPairs[i] = new DataEngineConfigPair(source.DataEngineConfigPairs[i]);
            }
        }
        if (source.ImageVersionName != null) {
            this.ImageVersionName = new String(source.ImageVersionName);
        }
        if (source.MainClusterName != null) {
            this.MainClusterName = new String(source.MainClusterName);
        }
        if (source.ElasticSwitch != null) {
            this.ElasticSwitch = new Boolean(source.ElasticSwitch);
        }
        if (source.ElasticLimit != null) {
            this.ElasticLimit = new Long(source.ElasticLimit);
        }
        if (source.SessionResourceTemplate != null) {
            this.SessionResourceTemplate = new SessionResourceTemplate(source.SessionResourceTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "AutoResume", this.AutoResume);
        this.setParamSimple(map, prefix + "MinClusters", this.MinClusters);
        this.setParamSimple(map, prefix + "MaxClusters", this.MaxClusters);
        this.setParamSimple(map, prefix + "DefaultDataEngine", this.DefaultDataEngine);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoSuspend", this.AutoSuspend);
        this.setParamSimple(map, prefix + "CrontabResumeSuspend", this.CrontabResumeSuspend);
        this.setParamObj(map, prefix + "CrontabResumeSuspendStrategy.", this.CrontabResumeSuspendStrategy);
        this.setParamSimple(map, prefix + "EngineExecType", this.EngineExecType);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "TolerableQueueTime", this.TolerableQueueTime);
        this.setParamSimple(map, prefix + "AutoSuspendTime", this.AutoSuspendTime);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "DataEngineConfigPairs.", this.DataEngineConfigPairs);
        this.setParamSimple(map, prefix + "ImageVersionName", this.ImageVersionName);
        this.setParamSimple(map, prefix + "MainClusterName", this.MainClusterName);
        this.setParamSimple(map, prefix + "ElasticSwitch", this.ElasticSwitch);
        this.setParamSimple(map, prefix + "ElasticLimit", this.ElasticLimit);
        this.setParamObj(map, prefix + "SessionResourceTemplate.", this.SessionResourceTemplate);

    }
}

