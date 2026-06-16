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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCreditsUsageRequest extends AbstractModel {

    /**
    * <p>开始日期</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>结束日期</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>环境id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
     * Get <p>开始日期</p> 
     * @return StartDate <p>开始日期</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>开始日期</p>
     * @param StartDate <p>开始日期</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>结束日期</p> 
     * @return EndDate <p>结束日期</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>结束日期</p>
     * @param EndDate <p>结束日期</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>环境id</p> 
     * @return EnvId <p>环境id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境id</p>
     * @param EnvId <p>环境id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    public DescribeCreditsUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCreditsUsageRequest(DescribeCreditsUsageRequest source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);

    }
}

