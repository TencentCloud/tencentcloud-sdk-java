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

public class DescribeMigrationJobsRequest extends AbstractModel{

    /**
    * 数据迁移任务ID，如：dts-amm1jw5q
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 数据迁移任务名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 源实例ID，格式如：cdb-c1nl9rpv
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * 源实例地域，如：ap-guangzhou
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * 源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String [] SrcDatabaseType;

    /**
    * 源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String [] SrcAccessType;

    /**
    * 目标实例ID，格式如：cdb-c1nl9rpv
    */
    @SerializedName("DstInstanceId")
    @Expose
    private String DstInstanceId;

    /**
    * 目标实例地域，如：ap-guangzhou
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * 目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String [] DstDatabaseType;

    /**
    * 目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)
    */
    @SerializedName("DstAccessType")
    @Expose
    private String [] DstAccessType;

    /**
    * 任务运行模式，值包括：immediate(立即运行)，timed(定时运行)
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * 排序方式，可能取值为asc、desc，默认按照创建时间倒序
    */
    @SerializedName("OrderSeq")
    @Expose
    private String OrderSeq;

    /**
    * 返回实例数量，默认20，有效区间[1,100]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 标签过滤
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get 数据迁移任务ID，如：dts-amm1jw5q 
     * @return JobId 数据迁移任务ID，如：dts-amm1jw5q
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 数据迁移任务ID，如：dts-amm1jw5q
     * @param JobId 数据迁移任务ID，如：dts-amm1jw5q
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 数据迁移任务名称 
     * @return JobName 数据迁移任务名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 数据迁移任务名称
     * @param JobName 数据迁移任务名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中) 
     * @return Status 数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)
     * @param Status 数据迁移任务状态，可取值包括：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 源实例ID，格式如：cdb-c1nl9rpv 
     * @return SrcInstanceId 源实例ID，格式如：cdb-c1nl9rpv
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set 源实例ID，格式如：cdb-c1nl9rpv
     * @param SrcInstanceId 源实例ID，格式如：cdb-c1nl9rpv
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get 源实例地域，如：ap-guangzhou 
     * @return SrcRegion 源实例地域，如：ap-guangzhou
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set 源实例地域，如：ap-guangzhou
     * @param SrcRegion 源实例地域，如：ap-guangzhou
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get 源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql 
     * @return SrcDatabaseType 源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql
     */
    public String [] getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set 源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql
     * @param SrcDatabaseType 源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql
     */
    public void setSrcDatabaseType(String [] SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get 源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例) 
     * @return SrcAccessType 源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)
     */
    public String [] getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set 源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)
     * @param SrcAccessType 源实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)
     */
    public void setSrcAccessType(String [] SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get 目标实例ID，格式如：cdb-c1nl9rpv 
     * @return DstInstanceId 目标实例ID，格式如：cdb-c1nl9rpv
     */
    public String getDstInstanceId() {
        return this.DstInstanceId;
    }

    /**
     * Set 目标实例ID，格式如：cdb-c1nl9rpv
     * @param DstInstanceId 目标实例ID，格式如：cdb-c1nl9rpv
     */
    public void setDstInstanceId(String DstInstanceId) {
        this.DstInstanceId = DstInstanceId;
    }

    /**
     * Get 目标实例地域，如：ap-guangzhou 
     * @return DstRegion 目标实例地域，如：ap-guangzhou
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set 目标实例地域，如：ap-guangzhou
     * @param DstRegion 目标实例地域，如：ap-guangzhou
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get 目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql 
     * @return DstDatabaseType 目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql
     */
    public String [] getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set 目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql
     * @param DstDatabaseType 目标源实例数据库类型，如：sqlserver,mysql,mongodb,redis,tendis,keewidb,clickhouse,cynosdbmysql,percona,tdsqlpercona,mariadb,tdsqlmysql,postgresql
     */
    public void setDstDatabaseType(String [] DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get 目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例) 
     * @return DstAccessType 目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)
     */
    public String [] getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set 目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)
     * @param DstAccessType 目标实例接入类型，值包括：extranet(外网)、vpncloud(云vpn接入的实例)、dcg(专线接入的实例)、ccn(云联网接入的实例)、cdb(云上cdb实例)、cvm(cvm自建实例)
     */
    public void setDstAccessType(String [] DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get 任务运行模式，值包括：immediate(立即运行)，timed(定时运行) 
     * @return RunMode 任务运行模式，值包括：immediate(立即运行)，timed(定时运行)
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 任务运行模式，值包括：immediate(立即运行)，timed(定时运行)
     * @param RunMode 任务运行模式，值包括：immediate(立即运行)，timed(定时运行)
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get 排序方式，可能取值为asc、desc，默认按照创建时间倒序 
     * @return OrderSeq 排序方式，可能取值为asc、desc，默认按照创建时间倒序
     */
    public String getOrderSeq() {
        return this.OrderSeq;
    }

    /**
     * Set 排序方式，可能取值为asc、desc，默认按照创建时间倒序
     * @param OrderSeq 排序方式，可能取值为asc、desc，默认按照创建时间倒序
     */
    public void setOrderSeq(String OrderSeq) {
        this.OrderSeq = OrderSeq;
    }

    /**
     * Get 返回实例数量，默认20，有效区间[1,100] 
     * @return Limit 返回实例数量，默认20，有效区间[1,100]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回实例数量，默认20，有效区间[1,100]
     * @param Limit 返回实例数量，默认20，有效区间[1,100]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 标签过滤 
     * @return TagFilters 标签过滤
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤
     * @param TagFilters 标签过滤
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

