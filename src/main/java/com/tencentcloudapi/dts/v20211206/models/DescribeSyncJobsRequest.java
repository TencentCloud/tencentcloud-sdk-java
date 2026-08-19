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
    * <p>同步任务id，如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>同步任务id列表，如[&quot;sync-n3gh7md9&quot;]</p>
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
    * <p>同步任务名</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>排序字段，目前仅支持CreateTime字段排序</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序方式，升序为ASC，降序为DESC，默认为CreateTime降序</p>
    */
    @SerializedName("OrderSeq")
    @Expose
    private String OrderSeq;

    /**
    * <p>偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回同步任务实例数量，默认20，有效区间[1,100]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束)</p>
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * <p>运行模式，如Immediate:立即运行，Timed:定时运行</p>
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * <p>任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb</p>
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * <p>付费类型，PrePay：预付费，PostPay：后付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>tag</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * <p>源端数据库连接信息，可以输入实例ID或者IP等</p>
    */
    @SerializedName("SrcInfoPattern")
    @Expose
    private String SrcInfoPattern;

    /**
    * <p>目标端数据库连接信息，可以输入实例ID或者IP等</p>
    */
    @SerializedName("DstInfoPattern")
    @Expose
    private String DstInfoPattern;

    /**
     * Get <p>同步任务id，如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p> 
     * @return JobId <p>同步任务id，如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>同步任务id，如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     * @param JobId <p>同步任务id，如sync-werwfs23，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>同步任务id列表，如[&quot;sync-n3gh7md9&quot;]</p> 
     * @return JobIds <p>同步任务id列表，如[&quot;sync-n3gh7md9&quot;]</p>
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set <p>同步任务id列表，如[&quot;sync-n3gh7md9&quot;]</p>
     * @param JobIds <p>同步任务id列表，如[&quot;sync-n3gh7md9&quot;]</p>
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
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
     * Get <p>排序字段，目前仅支持CreateTime字段排序</p> 
     * @return Order <p>排序字段，目前仅支持CreateTime字段排序</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序字段，目前仅支持CreateTime字段排序</p>
     * @param Order <p>排序字段，目前仅支持CreateTime字段排序</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序方式，升序为ASC，降序为DESC，默认为CreateTime降序</p> 
     * @return OrderSeq <p>排序方式，升序为ASC，降序为DESC，默认为CreateTime降序</p>
     */
    public String getOrderSeq() {
        return this.OrderSeq;
    }

    /**
     * Set <p>排序方式，升序为ASC，降序为DESC，默认为CreateTime降序</p>
     * @param OrderSeq <p>排序方式，升序为ASC，降序为DESC，默认为CreateTime降序</p>
     */
    public void setOrderSeq(String OrderSeq) {
        this.OrderSeq = OrderSeq;
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
     * Get <p>返回同步任务实例数量，默认20，有效区间[1,100]</p> 
     * @return Limit <p>返回同步任务实例数量，默认20，有效区间[1,100]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回同步任务实例数量，默认20，有效区间[1,100]</p>
     * @param Limit <p>返回同步任务实例数量，默认20，有效区间[1,100]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束)</p> 
     * @return Status <p>状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束)</p>
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束)</p>
     * @param Status <p>状态集合，如Initialized(初始化),CheckPass(校验通过),Running(运行中),ResumableErr(恢复中),Stopped(已结束)</p>
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>运行模式，如Immediate:立即运行，Timed:定时运行</p> 
     * @return RunMode <p>运行模式，如Immediate:立即运行，Timed:定时运行</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>运行模式，如Immediate:立即运行，Timed:定时运行</p>
     * @param RunMode <p>运行模式，如Immediate:立即运行，Timed:定时运行</p>
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get <p>任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb</p> 
     * @return JobType <p>任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb</p>
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set <p>任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb</p>
     * @param JobType <p>任务类型，如mysql2mysql：msyql同步到mysql;可取值有mysql2mysql、mysql2kafka、tdsqlmysql2kafka、tdsqlmysql2tdsqlmysql、tdsqlmysql2mysql、mysql2tdsqlmysql、mysql2mariadb、mariadb2mariadb、mariadb2kafka、cynosdbmysql2kafka、cynosdbmysql2cynosdbmysql、cynosdbmysql2mysql、mysql2cynosdbmysql、mariadb2tdsqlmysql、tdsqlmysql2cynosdbmysql、cynosdbmysql2tdsqlmysql、tdstore2mysql、tdstore2percona、tdstore2mariadb、tdstore2cynosdbmysql、cynosdbmysql2mariadb、mariadb2cynosdbmysql、tdsqlmysql2mariadb、mariadb2mysql、percona2mariadb、postgresql2postgresql、tdstore2tdsqlmysql、mongodb2mongodb</p>
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get <p>付费类型，PrePay：预付费，PostPay：后付费</p> 
     * @return PayMode <p>付费类型，PrePay：预付费，PostPay：后付费</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费类型，PrePay：预付费，PostPay：后付费</p>
     * @param PayMode <p>付费类型，PrePay：预付费，PostPay：后付费</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>tag</p> 
     * @return TagFilters <p>tag</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>tag</p>
     * @param TagFilters <p>tag</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get <p>源端数据库连接信息，可以输入实例ID或者IP等</p> 
     * @return SrcInfoPattern <p>源端数据库连接信息，可以输入实例ID或者IP等</p>
     */
    public String getSrcInfoPattern() {
        return this.SrcInfoPattern;
    }

    /**
     * Set <p>源端数据库连接信息，可以输入实例ID或者IP等</p>
     * @param SrcInfoPattern <p>源端数据库连接信息，可以输入实例ID或者IP等</p>
     */
    public void setSrcInfoPattern(String SrcInfoPattern) {
        this.SrcInfoPattern = SrcInfoPattern;
    }

    /**
     * Get <p>目标端数据库连接信息，可以输入实例ID或者IP等</p> 
     * @return DstInfoPattern <p>目标端数据库连接信息，可以输入实例ID或者IP等</p>
     */
    public String getDstInfoPattern() {
        return this.DstInfoPattern;
    }

    /**
     * Set <p>目标端数据库连接信息，可以输入实例ID或者IP等</p>
     * @param DstInfoPattern <p>目标端数据库连接信息，可以输入实例ID或者IP等</p>
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

