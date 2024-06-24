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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddAreaBanAreasRequest extends AbstractModel {

    /**
    * 需要修改的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 需要新增的封禁地域
    */
    @SerializedName("Areas")
    @Expose
    private String [] Areas;

    /**
    * waf版本信息，spart-waf或者clb-waf，其他无效，请一定填写
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 定时任务类型
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 定时任务配置
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
     * Get 需要修改的域名 
     * @return Domain 需要修改的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要修改的域名
     * @param Domain 需要修改的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 需要新增的封禁地域 
     * @return Areas 需要新增的封禁地域
     */
    public String [] getAreas() {
        return this.Areas;
    }

    /**
     * Set 需要新增的封禁地域
     * @param Areas 需要新增的封禁地域
     */
    public void setAreas(String [] Areas) {
        this.Areas = Areas;
    }

    /**
     * Get waf版本信息，spart-waf或者clb-waf，其他无效，请一定填写 
     * @return Edition waf版本信息，spart-waf或者clb-waf，其他无效，请一定填写
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set waf版本信息，spart-waf或者clb-waf，其他无效，请一定填写
     * @param Edition waf版本信息，spart-waf或者clb-waf，其他无效，请一定填写
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
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
     * Get 定时任务配置 
     * @return JobDateTime 定时任务配置
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set 定时任务配置
     * @param JobDateTime 定时任务配置
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    public AddAreaBanAreasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAreaBanAreasRequest(AddAreaBanAreasRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Areas != null) {
            this.Areas = new String[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new String(source.Areas[i]);
            }
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Areas.", this.Areas);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);

    }
}

