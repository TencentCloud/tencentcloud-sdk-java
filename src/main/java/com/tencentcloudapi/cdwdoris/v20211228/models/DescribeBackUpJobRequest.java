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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackUpJobRequest extends AbstractModel {

    /**
    * <p>集群id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>任务类型：<br>0-不限制，或使用TypeFilters过滤；<br>1-备份恢复（包括周期备份和一次性备份）；<br>2-数据迁移（包括跨集群迁移和cos迁移）</p>
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * <p>任务类型过滤器</p>
    */
    @SerializedName("TypeFilters")
    @Expose
    private Long [] TypeFilters;

    /**
    * <p>实例状态过滤器</p>
    */
    @SerializedName("StatusFilters")
    @Expose
    private Long [] StatusFilters;

    /**
    * <p>任务名称过滤器</p>
    */
    @SerializedName("ScheduleNameFilters")
    @Expose
    private String ScheduleNameFilters;

    /**
    * <p>按照快照生成时间排序，默认DESC：<br>ASC-升序<br>DESC-降序</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>分页大小</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>页号</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>jobid的string类型</p>
    */
    @SerializedName("JobIdFiltersStr")
    @Expose
    private String JobIdFiltersStr;

    /**
    * <p>0-未加密；1-已加密</p>
    */
    @SerializedName("EncryptionFilters")
    @Expose
    private Long [] EncryptionFilters;

    /**
     * Get <p>集群id</p> 
     * @return InstanceId <p>集群id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群id</p>
     * @param InstanceId <p>集群id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>任务类型：<br>0-不限制，或使用TypeFilters过滤；<br>1-备份恢复（包括周期备份和一次性备份）；<br>2-数据迁移（包括跨集群迁移和cos迁移）</p> 
     * @return ApplicationType <p>任务类型：<br>0-不限制，或使用TypeFilters过滤；<br>1-备份恢复（包括周期备份和一次性备份）；<br>2-数据迁移（包括跨集群迁移和cos迁移）</p>
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set <p>任务类型：<br>0-不限制，或使用TypeFilters过滤；<br>1-备份恢复（包括周期备份和一次性备份）；<br>2-数据迁移（包括跨集群迁移和cos迁移）</p>
     * @param ApplicationType <p>任务类型：<br>0-不限制，或使用TypeFilters过滤；<br>1-备份恢复（包括周期备份和一次性备份）；<br>2-数据迁移（包括跨集群迁移和cos迁移）</p>
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get <p>任务类型过滤器</p> 
     * @return TypeFilters <p>任务类型过滤器</p>
     */
    public Long [] getTypeFilters() {
        return this.TypeFilters;
    }

    /**
     * Set <p>任务类型过滤器</p>
     * @param TypeFilters <p>任务类型过滤器</p>
     */
    public void setTypeFilters(Long [] TypeFilters) {
        this.TypeFilters = TypeFilters;
    }

    /**
     * Get <p>实例状态过滤器</p> 
     * @return StatusFilters <p>实例状态过滤器</p>
     */
    public Long [] getStatusFilters() {
        return this.StatusFilters;
    }

    /**
     * Set <p>实例状态过滤器</p>
     * @param StatusFilters <p>实例状态过滤器</p>
     */
    public void setStatusFilters(Long [] StatusFilters) {
        this.StatusFilters = StatusFilters;
    }

    /**
     * Get <p>任务名称过滤器</p> 
     * @return ScheduleNameFilters <p>任务名称过滤器</p>
     */
    public String getScheduleNameFilters() {
        return this.ScheduleNameFilters;
    }

    /**
     * Set <p>任务名称过滤器</p>
     * @param ScheduleNameFilters <p>任务名称过滤器</p>
     */
    public void setScheduleNameFilters(String ScheduleNameFilters) {
        this.ScheduleNameFilters = ScheduleNameFilters;
    }

    /**
     * Get <p>按照快照生成时间排序，默认DESC：<br>ASC-升序<br>DESC-降序</p> 
     * @return OrderType <p>按照快照生成时间排序，默认DESC：<br>ASC-升序<br>DESC-降序</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>按照快照生成时间排序，默认DESC：<br>ASC-升序<br>DESC-降序</p>
     * @param OrderType <p>按照快照生成时间排序，默认DESC：<br>ASC-升序<br>DESC-降序</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>分页大小</p> 
     * @return PageSize <p>分页大小</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页大小</p>
     * @param PageSize <p>分页大小</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>页号</p> 
     * @return PageNum <p>页号</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>页号</p>
     * @param PageNum <p>页号</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>开始时间</p> 
     * @return BeginTime <p>开始时间</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param BeginTime <p>开始时间</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>jobid的string类型</p> 
     * @return JobIdFiltersStr <p>jobid的string类型</p>
     */
    public String getJobIdFiltersStr() {
        return this.JobIdFiltersStr;
    }

    /**
     * Set <p>jobid的string类型</p>
     * @param JobIdFiltersStr <p>jobid的string类型</p>
     */
    public void setJobIdFiltersStr(String JobIdFiltersStr) {
        this.JobIdFiltersStr = JobIdFiltersStr;
    }

    /**
     * Get <p>0-未加密；1-已加密</p> 
     * @return EncryptionFilters <p>0-未加密；1-已加密</p>
     */
    public Long [] getEncryptionFilters() {
        return this.EncryptionFilters;
    }

    /**
     * Set <p>0-未加密；1-已加密</p>
     * @param EncryptionFilters <p>0-未加密；1-已加密</p>
     */
    public void setEncryptionFilters(Long [] EncryptionFilters) {
        this.EncryptionFilters = EncryptionFilters;
    }

    public DescribeBackUpJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackUpJobRequest(DescribeBackUpJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
        if (source.TypeFilters != null) {
            this.TypeFilters = new Long[source.TypeFilters.length];
            for (int i = 0; i < source.TypeFilters.length; i++) {
                this.TypeFilters[i] = new Long(source.TypeFilters[i]);
            }
        }
        if (source.StatusFilters != null) {
            this.StatusFilters = new Long[source.StatusFilters.length];
            for (int i = 0; i < source.StatusFilters.length; i++) {
                this.StatusFilters[i] = new Long(source.StatusFilters[i]);
            }
        }
        if (source.ScheduleNameFilters != null) {
            this.ScheduleNameFilters = new String(source.ScheduleNameFilters);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.JobIdFiltersStr != null) {
            this.JobIdFiltersStr = new String(source.JobIdFiltersStr);
        }
        if (source.EncryptionFilters != null) {
            this.EncryptionFilters = new Long[source.EncryptionFilters.length];
            for (int i = 0; i < source.EncryptionFilters.length; i++) {
                this.EncryptionFilters[i] = new Long(source.EncryptionFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamArraySimple(map, prefix + "TypeFilters.", this.TypeFilters);
        this.setParamArraySimple(map, prefix + "StatusFilters.", this.StatusFilters);
        this.setParamSimple(map, prefix + "ScheduleNameFilters", this.ScheduleNameFilters);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "JobIdFiltersStr", this.JobIdFiltersStr);
        this.setParamArraySimple(map, prefix + "EncryptionFilters.", this.EncryptionFilters);

    }
}

