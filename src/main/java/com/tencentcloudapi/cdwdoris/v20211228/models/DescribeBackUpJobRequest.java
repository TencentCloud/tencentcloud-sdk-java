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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackUpJobRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务类型：
0-不限制，或使用TypeFilters过滤；
1-备份恢复（包括周期备份和一次性备份）；
2-数据迁移（包括跨集群迁移和cos迁移）	
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页号
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * jobid的string类型
    */
    @SerializedName("JobIdFiltersStr")
    @Expose
    private String JobIdFiltersStr;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务类型：
0-不限制，或使用TypeFilters过滤；
1-备份恢复（包括周期备份和一次性备份）；
2-数据迁移（包括跨集群迁移和cos迁移）	 
     * @return ApplicationType 任务类型：
0-不限制，或使用TypeFilters过滤；
1-备份恢复（包括周期备份和一次性备份）；
2-数据迁移（包括跨集群迁移和cos迁移）	
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 任务类型：
0-不限制，或使用TypeFilters过滤；
1-备份恢复（包括周期备份和一次性备份）；
2-数据迁移（包括跨集群迁移和cos迁移）	
     * @param ApplicationType 任务类型：
0-不限制，或使用TypeFilters过滤；
1-备份恢复（包括周期备份和一次性备份）；
2-数据迁移（包括跨集群迁移和cos迁移）	
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页号 
     * @return PageNum 页号
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页号
     * @param PageNum 页号
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 开始时间 
     * @return BeginTime 开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
     * @param BeginTime 开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get jobid的string类型 
     * @return JobIdFiltersStr jobid的string类型
     */
    public String getJobIdFiltersStr() {
        return this.JobIdFiltersStr;
    }

    /**
     * Set jobid的string类型
     * @param JobIdFiltersStr jobid的string类型
     */
    public void setJobIdFiltersStr(String JobIdFiltersStr) {
        this.JobIdFiltersStr = JobIdFiltersStr;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "JobIdFiltersStr", this.JobIdFiltersStr);

    }
}

