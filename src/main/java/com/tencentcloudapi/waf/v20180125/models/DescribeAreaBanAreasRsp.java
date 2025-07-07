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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAreaBanAreasRsp extends AbstractModel {

    /**
    * 状态 "0"：未开启地域封禁 "1"：开启地域封禁
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数据来源 custom-自定义(默认)、batch-批量防护
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 字符串数据，配置的地域列表
    */
    @SerializedName("Areas")
    @Expose
    private String [] Areas;

    /**
    * 定时任务类型
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 定时任务详细配置
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * 周期任务配置
    */
    @SerializedName("CronType")
    @Expose
    private String CronType;

    /**
     * Get 状态 "0"：未开启地域封禁 "1"：开启地域封禁 
     * @return Status 状态 "0"：未开启地域封禁 "1"：开启地域封禁
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 "0"：未开启地域封禁 "1"：开启地域封禁
     * @param Status 状态 "0"：未开启地域封禁 "1"：开启地域封禁
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数据来源 custom-自定义(默认)、batch-批量防护 
     * @return Source 数据来源 custom-自定义(默认)、batch-批量防护
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 数据来源 custom-自定义(默认)、batch-批量防护
     * @param Source 数据来源 custom-自定义(默认)、batch-批量防护
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 字符串数据，配置的地域列表 
     * @return Areas 字符串数据，配置的地域列表
     */
    public String [] getAreas() {
        return this.Areas;
    }

    /**
     * Set 字符串数据，配置的地域列表
     * @param Areas 字符串数据，配置的地域列表
     */
    public void setAreas(String [] Areas) {
        this.Areas = Areas;
    }

    /**
     * Get 定时任务类型 
     * @return JobType 定时任务类型
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 定时任务类型
     * @param JobType 定时任务类型
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 定时任务详细配置 
     * @return JobDateTime 定时任务详细配置
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set 定时任务详细配置
     * @param JobDateTime 定时任务详细配置
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    /**
     * Get 周期任务配置 
     * @return CronType 周期任务配置
     */
    public String getCronType() {
        return this.CronType;
    }

    /**
     * Set 周期任务配置
     * @param CronType 周期任务配置
     */
    public void setCronType(String CronType) {
        this.CronType = CronType;
    }

    public DescribeAreaBanAreasRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAreaBanAreasRsp(DescribeAreaBanAreasRsp source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Areas != null) {
            this.Areas = new String[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new String(source.Areas[i]);
            }
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.CronType != null) {
            this.CronType = new String(source.CronType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "Areas.", this.Areas);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "CronType", this.CronType);

    }
}

