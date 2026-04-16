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

public class DescribeMigrationJobsRequest extends AbstractModel {

    /**
    * <p>数据迁移任务ID，如：dts-amm1jw5q</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>数据迁移任务名称</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)</p>
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * <p>源实例ID，格式如：cdb-c1nl9rpv</p>
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * <p>源实例地域，如：ap-guangzhou</p>
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * <p>源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p>
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String [] SrcDatabaseType;

    /**
    * <p>源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p>
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String [] SrcAccessType;

    /**
    * <p>目标实例ID，格式如：cdb-c1nl9rpv</p>
    */
    @SerializedName("DstInstanceId")
    @Expose
    private String DstInstanceId;

    /**
    * <p>目标实例地域，如：ap-guangzhou</p>
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * <p>目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p>
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String [] DstDatabaseType;

    /**
    * <p>目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p>
    */
    @SerializedName("DstAccessType")
    @Expose
    private String [] DstAccessType;

    /**
    * <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p>
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * <p>排序方式，可能取值为asc、desc，默认按照创建时间倒序</p>
    */
    @SerializedName("OrderSeq")
    @Expose
    private String OrderSeq;

    /**
    * <p>返回实例数量，默认20，有效区间[1,100]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>标签过滤</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get <p>数据迁移任务ID，如：dts-amm1jw5q</p> 
     * @return JobId <p>数据迁移任务ID，如：dts-amm1jw5q</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>数据迁移任务ID，如：dts-amm1jw5q</p>
     * @param JobId <p>数据迁移任务ID，如：dts-amm1jw5q</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>数据迁移任务名称</p> 
     * @return JobName <p>数据迁移任务名称</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>数据迁移任务名称</p>
     * @param JobName <p>数据迁移任务名称</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)</p> 
     * @return Status <p>数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)</p>
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)</p>
     * @param Status <p>数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)</p>
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>源实例ID，格式如：cdb-c1nl9rpv</p> 
     * @return SrcInstanceId <p>源实例ID，格式如：cdb-c1nl9rpv</p>
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set <p>源实例ID，格式如：cdb-c1nl9rpv</p>
     * @param SrcInstanceId <p>源实例ID，格式如：cdb-c1nl9rpv</p>
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get <p>源实例地域，如：ap-guangzhou</p> 
     * @return SrcRegion <p>源实例地域，如：ap-guangzhou</p>
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set <p>源实例地域，如：ap-guangzhou</p>
     * @param SrcRegion <p>源实例地域，如：ap-guangzhou</p>
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get <p>源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p> 
     * @return SrcDatabaseType <p>源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p>
     */
    public String [] getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set <p>源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p>
     * @param SrcDatabaseType <p>源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p>
     */
    public void setSrcDatabaseType(String [] SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get <p>源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p> 
     * @return SrcAccessType <p>源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p>
     */
    public String [] getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set <p>源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p>
     * @param SrcAccessType <p>源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p>
     */
    public void setSrcAccessType(String [] SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get <p>目标实例ID，格式如：cdb-c1nl9rpv</p> 
     * @return DstInstanceId <p>目标实例ID，格式如：cdb-c1nl9rpv</p>
     */
    public String getDstInstanceId() {
        return this.DstInstanceId;
    }

    /**
     * Set <p>目标实例ID，格式如：cdb-c1nl9rpv</p>
     * @param DstInstanceId <p>目标实例ID，格式如：cdb-c1nl9rpv</p>
     */
    public void setDstInstanceId(String DstInstanceId) {
        this.DstInstanceId = DstInstanceId;
    }

    /**
     * Get <p>目标实例地域，如：ap-guangzhou</p> 
     * @return DstRegion <p>目标实例地域，如：ap-guangzhou</p>
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set <p>目标实例地域，如：ap-guangzhou</p>
     * @param DstRegion <p>目标实例地域，如：ap-guangzhou</p>
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get <p>目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p> 
     * @return DstDatabaseType <p>目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p>
     */
    public String [] getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set <p>目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p>
     * @param DstDatabaseType <p>目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql</p>
     */
    public void setDstDatabaseType(String [] DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get <p>目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p> 
     * @return DstAccessType <p>目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p>
     */
    public String [] getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set <p>目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p>
     * @param DstAccessType <p>目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)</p>
     */
    public void setDstAccessType(String [] DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p> 
     * @return RunMode <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p>
     * @param RunMode <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p>
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get <p>排序方式，可能取值为asc、desc，默认按照创建时间倒序</p> 
     * @return OrderSeq <p>排序方式，可能取值为asc、desc，默认按照创建时间倒序</p>
     */
    public String getOrderSeq() {
        return this.OrderSeq;
    }

    /**
     * Set <p>排序方式，可能取值为asc、desc，默认按照创建时间倒序</p>
     * @param OrderSeq <p>排序方式，可能取值为asc、desc，默认按照创建时间倒序</p>
     */
    public void setOrderSeq(String OrderSeq) {
        this.OrderSeq = OrderSeq;
    }

    /**
     * Get <p>返回实例数量，默认20，有效区间[1,100]</p> 
     * @return Limit <p>返回实例数量，默认20，有效区间[1,100]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回实例数量，默认20，有效区间[1,100]</p>
     * @param Limit <p>返回实例数量，默认20，有效区间[1,100]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0</p> 
     * @return Offset <p>偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0</p>
     * @param Offset <p>偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>标签过滤</p> 
     * @return TagFilters <p>标签过滤</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>标签过滤</p>
     * @param TagFilters <p>标签过滤</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeMigrationJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationJobsRequest(DescribeMigrationJobsRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.SrcDatabaseType != null) {
            this.SrcDatabaseType = new String[source.SrcDatabaseType.length];
            for (int i = 0; i < source.SrcDatabaseType.length; i++) {
                this.SrcDatabaseType[i] = new String(source.SrcDatabaseType[i]);
            }
        }
        if (source.SrcAccessType != null) {
            this.SrcAccessType = new String[source.SrcAccessType.length];
            for (int i = 0; i < source.SrcAccessType.length; i++) {
                this.SrcAccessType[i] = new String(source.SrcAccessType[i]);
            }
        }
        if (source.DstInstanceId != null) {
            this.DstInstanceId = new String(source.DstInstanceId);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.DstDatabaseType != null) {
            this.DstDatabaseType = new String[source.DstDatabaseType.length];
            for (int i = 0; i < source.DstDatabaseType.length; i++) {
                this.DstDatabaseType[i] = new String(source.DstDatabaseType[i]);
            }
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String[source.DstAccessType.length];
            for (int i = 0; i < source.DstAccessType.length; i++) {
                this.DstAccessType[i] = new String(source.DstAccessType[i]);
            }
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.OrderSeq != null) {
            this.OrderSeq = new String(source.OrderSeq);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamArraySimple(map, prefix + "SrcDatabaseType.", this.SrcDatabaseType);
        this.setParamArraySimple(map, prefix + "SrcAccessType.", this.SrcAccessType);
        this.setParamSimple(map, prefix + "DstInstanceId", this.DstInstanceId);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamArraySimple(map, prefix + "DstDatabaseType.", this.DstDatabaseType);
        this.setParamArraySimple(map, prefix + "DstAccessType.", this.DstAccessType);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "OrderSeq", this.OrderSeq);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

