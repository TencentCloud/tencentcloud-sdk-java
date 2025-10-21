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

public class DescribeSyncJobsRequest extends AbstractModel {

    /**
    * 同步任务id，如sync-werwfs23，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。

    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 同步任务id列表，如["sync-n3gh7md9"]
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
    * 同步任务名
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 排序字段，目前仅支持CreateTime字段排序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序方式，升序为ASC，降序为DESC，默认为CreateTime降序
    */
    @SerializedName("OrderSeq")
    @Expose
    private String OrderSeq;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回同步任务实例数量，默认20，有效区间[1,100]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束)
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 运行模式，如Immediate:立即运行，Timed:定时运行
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * 任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 付费类型，PrePay：预付费，PostPay：后付费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * tag
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 源端数据库连接信息，可以输入实例ID或者IP等
    */
    @SerializedName("SrcInfoPattern")
    @Expose
    private String SrcInfoPattern;

    /**
    * 目标端数据库连接信息，可以输入实例ID或者IP等
    */
    @SerializedName("DstInfoPattern")
    @Expose
    private String DstInfoPattern;

    /**
     * Get 同步任务id，如sync-werwfs23，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
 
     * @return JobId 同步任务id，如sync-werwfs23，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。

     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 同步任务id，如sync-werwfs23，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。

     * @param JobId 同步任务id，如sync-werwfs23，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。

     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 同步任务id列表，如["sync-n3gh7md9"] 
     * @return JobIds 同步任务id列表，如["sync-n3gh7md9"]
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set 同步任务id列表，如["sync-n3gh7md9"]
     * @param JobIds 同步任务id列表，如["sync-n3gh7md9"]
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    /**
     * Get 同步任务名 
     * @return JobName 同步任务名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 同步任务名
     * @param JobName 同步任务名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 排序字段，目前仅支持CreateTime字段排序 
     * @return Order 排序字段，目前仅支持CreateTime字段排序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序字段，目前仅支持CreateTime字段排序
     * @param Order 排序字段，目前仅支持CreateTime字段排序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序方式，升序为ASC，降序为DESC，默认为CreateTime降序 
     * @return OrderSeq 排序方式，升序为ASC，降序为DESC，默认为CreateTime降序
     */
    public String getOrderSeq() {
        return this.OrderSeq;
    }

    /**
     * Set 排序方式，升序为ASC，降序为DESC，默认为CreateTime降序
     * @param OrderSeq 排序方式，升序为ASC，降序为DESC，默认为CreateTime降序
     */
    public void setOrderSeq(String OrderSeq) {
        this.OrderSeq = OrderSeq;
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
     * Get 返回同步任务实例数量，默认20，有效区间[1,100] 
     * @return Limit 返回同步任务实例数量，默认20，有效区间[1,100]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回同步任务实例数量，默认20，有效区间[1,100]
     * @param Limit 返回同步任务实例数量，默认20，有效区间[1,100]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束) 
     * @return Status 状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束)
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束)
     * @param Status 状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束)
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 运行模式，如Immediate:立即运行，Timed:定时运行 
     * @return RunMode 运行模式，如Immediate:立即运行，Timed:定时运行
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 运行模式，如Immediate:立即运行，Timed:定时运行
     * @param RunMode 运行模式，如Immediate:立即运行，Timed:定时运行
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get 任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb 
     * @return JobType 任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb
     * @param JobType 任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 付费类型，PrePay：预付费，PostPay：后付费 
     * @return PayMode 付费类型，PrePay：预付费，PostPay：后付费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型，PrePay：预付费，PostPay：后付费
     * @param PayMode 付费类型，PrePay：预付费，PostPay：后付费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get tag 
     * @return TagFilters tag
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set tag
     * @param TagFilters tag
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 源端数据库连接信息，可以输入实例ID或者IP等 
     * @return SrcInfoPattern 源端数据库连接信息，可以输入实例ID或者IP等
     */
    public String getSrcInfoPattern() {
        return this.SrcInfoPattern;
    }

    /**
     * Set 源端数据库连接信息，可以输入实例ID或者IP等
     * @param SrcInfoPattern 源端数据库连接信息，可以输入实例ID或者IP等
     */
    public void setSrcInfoPattern(String SrcInfoPattern) {
        this.SrcInfoPattern = SrcInfoPattern;
    }

    /**
     * Get 目标端数据库连接信息，可以输入实例ID或者IP等 
     * @return DstInfoPattern 目标端数据库连接信息，可以输入实例ID或者IP等
     */
    public String getDstInfoPattern() {
        return this.DstInfoPattern;
    }

    /**
     * Set 目标端数据库连接信息，可以输入实例ID或者IP等
     * @param DstInfoPattern 目标端数据库连接信息，可以输入实例ID或者IP等
     */
    public void setDstInfoPattern(String DstInfoPattern) {
        this.DstInfoPattern = DstInfoPattern;
    }

    public DescribeSyncJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSyncJobsRequest(DescribeSyncJobsRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobIds != null) {
            this.JobIds = new String[source.JobIds.length];
            for (int i = 0; i < source.JobIds.length; i++) {
                this.JobIds[i] = new String(source.JobIds[i]);
            }
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderSeq != null) {
            this.OrderSeq = new String(source.OrderSeq);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.SrcInfoPattern != null) {
            this.SrcInfoPattern = new String(source.SrcInfoPattern);
        }
        if (source.DstInfoPattern != null) {
            this.DstInfoPattern = new String(source.DstInfoPattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderSeq", this.OrderSeq);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "SrcInfoPattern", this.SrcInfoPattern);
        this.setParamSimple(map, prefix + "DstInfoPattern", this.DstInfoPattern);

    }
}

