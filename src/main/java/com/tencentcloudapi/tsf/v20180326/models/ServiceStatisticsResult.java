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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceStatisticsResult extends AbstractModel{

    /**
    * 请求模版路径:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 请求方法:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 微服务Id
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * 微服务名称
    */
    @SerializedName("MicroserviceName")
    @Expose
    private String MicroserviceName;

    /**
    * 请求数
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * 请求错误率，不带百分号
    */
    @SerializedName("ErrorRate")
    @Expose
    private Float ErrorRate;

    /**
    * 平均响应耗时ms
    */
    @SerializedName("AvgTimeConsuming")
    @Expose
    private Float AvgTimeConsuming;

    /**
    * 响应耗时曲线
    */
    @SerializedName("MetricDataCurves")
    @Expose
    private MetricDataCurve [] MetricDataCurves;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 部署组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署组name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 部署组类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 部署组是否存在
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupExist")
    @Expose
    private Long GroupExist;

    /**
    * 实例是否存在，仅限cvm
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceExist")
    @Expose
    private Long InstanceExist;

    /**
    * 应用id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * cpu使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuPercent")
    @Expose
    private Long CpuPercent;

    /**
    * 已用堆大小,单位KB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeapUsed")
    @Expose
    private Long HeapUsed;

    /**
    * 数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Script值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Script")
    @Expose
    private String Script;

    /**
    * 数据库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
     * Get 请求模版路径:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 请求模版路径:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 请求模版路径:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 请求模版路径:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 请求方法:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 请求方法:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方法:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 请求方法:type为接口时返回，服务时不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 微服务Id 
     * @return MicroserviceId 微服务Id
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set 微服务Id
     * @param MicroserviceId 微服务Id
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get 微服务名称 
     * @return MicroserviceName 微服务名称
     */
    public String getMicroserviceName() {
        return this.MicroserviceName;
    }

    /**
     * Set 微服务名称
     * @param MicroserviceName 微服务名称
     */
    public void setMicroserviceName(String MicroserviceName) {
        this.MicroserviceName = MicroserviceName;
    }

    /**
     * Get 请求数 
     * @return RequestCount 请求数
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set 请求数
     * @param RequestCount 请求数
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get 请求错误率，不带百分号 
     * @return ErrorRate 请求错误率，不带百分号
     */
    public Float getErrorRate() {
        return this.ErrorRate;
    }

    /**
     * Set 请求错误率，不带百分号
     * @param ErrorRate 请求错误率，不带百分号
     */
    public void setErrorRate(Float ErrorRate) {
        this.ErrorRate = ErrorRate;
    }

    /**
     * Get 平均响应耗时ms 
     * @return AvgTimeConsuming 平均响应耗时ms
     */
    public Float getAvgTimeConsuming() {
        return this.AvgTimeConsuming;
    }

    /**
     * Set 平均响应耗时ms
     * @param AvgTimeConsuming 平均响应耗时ms
     */
    public void setAvgTimeConsuming(Float AvgTimeConsuming) {
        this.AvgTimeConsuming = AvgTimeConsuming;
    }

    /**
     * Get 响应耗时曲线 
     * @return MetricDataCurves 响应耗时曲线
     */
    public MetricDataCurve [] getMetricDataCurves() {
        return this.MetricDataCurves;
    }

    /**
     * Set 响应耗时曲线
     * @param MetricDataCurves 响应耗时曲线
     */
    public void setMetricDataCurves(MetricDataCurve [] MetricDataCurves) {
        this.MetricDataCurves = MetricDataCurves;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例name
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 部署组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 部署组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 部署组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 部署组name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 部署组name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 部署组name
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 部署组name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 部署组类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType 部署组类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 部署组类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 部署组类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 部署组是否存在
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupExist 部署组是否存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupExist() {
        return this.GroupExist;
    }

    /**
     * Set 部署组是否存在
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupExist 部署组是否存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupExist(Long GroupExist) {
        this.GroupExist = GroupExist;
    }

    /**
     * Get 实例是否存在，仅限cvm
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceExist 实例是否存在，仅限cvm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceExist() {
        return this.InstanceExist;
    }

    /**
     * Set 实例是否存在，仅限cvm
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceExist 实例是否存在，仅限cvm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceExist(Long InstanceExist) {
        this.InstanceExist = InstanceExist;
    }

    /**
     * Get 应用id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 微服务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceType 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceType 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get cpu使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuPercent cpu使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuPercent() {
        return this.CpuPercent;
    }

    /**
     * Set cpu使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuPercent cpu使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuPercent(Long CpuPercent) {
        this.CpuPercent = CpuPercent;
    }

    /**
     * Get 已用堆大小,单位KB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeapUsed 已用堆大小,单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeapUsed() {
        return this.HeapUsed;
    }

    /**
     * Set 已用堆大小,单位KB
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeapUsed 已用堆大小,单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeapUsed(Long HeapUsed) {
        this.HeapUsed = HeapUsed;
    }

    /**
     * Get 数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Script值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Script Script值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScript() {
        return this.Script;
    }

    /**
     * Set Script值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Script Script值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScript(String Script) {
        this.Script = Script;
    }

    /**
     * Get 数据库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbType 数据库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbType 数据库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    public ServiceStatisticsResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceStatisticsResult(ServiceStatisticsResult source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.MicroserviceId != null) {
            this.MicroserviceId = new String(source.MicroserviceId);
        }
        if (source.MicroserviceName != null) {
            this.MicroserviceName = new String(source.MicroserviceName);
        }
        if (source.RequestCount != null) {
            this.RequestCount = new Long(source.RequestCount);
        }
        if (source.ErrorRate != null) {
            this.ErrorRate = new Float(source.ErrorRate);
        }
        if (source.AvgTimeConsuming != null) {
            this.AvgTimeConsuming = new Float(source.AvgTimeConsuming);
        }
        if (source.MetricDataCurves != null) {
            this.MetricDataCurves = new MetricDataCurve[source.MetricDataCurves.length];
            for (int i = 0; i < source.MetricDataCurves.length; i++) {
                this.MetricDataCurves[i] = new MetricDataCurve(source.MetricDataCurves[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.GroupExist != null) {
            this.GroupExist = new Long(source.GroupExist);
        }
        if (source.InstanceExist != null) {
            this.InstanceExist = new Long(source.InstanceExist);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.CpuPercent != null) {
            this.CpuPercent = new Long(source.CpuPercent);
        }
        if (source.HeapUsed != null) {
            this.HeapUsed = new Long(source.HeapUsed);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Script != null) {
            this.Script = new String(source.Script);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "MicroserviceId", this.MicroserviceId);
        this.setParamSimple(map, prefix + "MicroserviceName", this.MicroserviceName);
        this.setParamSimple(map, prefix + "RequestCount", this.RequestCount);
        this.setParamSimple(map, prefix + "ErrorRate", this.ErrorRate);
        this.setParamSimple(map, prefix + "AvgTimeConsuming", this.AvgTimeConsuming);
        this.setParamArrayObj(map, prefix + "MetricDataCurves.", this.MetricDataCurves);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "GroupExist", this.GroupExist);
        this.setParamSimple(map, prefix + "InstanceExist", this.InstanceExist);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamSimple(map, prefix + "CpuPercent", this.CpuPercent);
        this.setParamSimple(map, prefix + "HeapUsed", this.HeapUsed);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Script", this.Script);
        this.setParamSimple(map, prefix + "DbType", this.DbType);

    }
}

