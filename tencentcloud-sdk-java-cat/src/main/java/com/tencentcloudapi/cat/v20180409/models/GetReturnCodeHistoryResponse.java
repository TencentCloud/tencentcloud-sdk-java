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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetReturnCodeHistoryResponse extends AbstractModel{

    /**
    * 拨测失败详情列表
    */
    @SerializedName("Details")
    @Expose
    private CatReturnDetail [] Details;

    /**
    * 拨测失败汇总列表
    */
    @SerializedName("Summary")
    @Expose
    private CatReturnSummary [] Summary;

    /**
    * 开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 截至时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 拨测失败详情列表 
     * @return Details 拨测失败详情列表
     */
    public CatReturnDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 拨测失败详情列表
     * @param Details 拨测失败详情列表
     */
    public void setDetails(CatReturnDetail [] Details) {
        this.Details = Details;
    }

    /**
     * Get 拨测失败汇总列表 
     * @return Summary 拨测失败汇总列表
     */
    public CatReturnSummary [] getSummary() {
        return this.Summary;
    }

    /**
     * Set 拨测失败汇总列表
     * @param Summary 拨测失败汇总列表
     */
    public void setSummary(CatReturnSummary [] Summary) {
        this.Summary = Summary;
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
     * Get 截至时间 
     * @return EndTime 截至时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截至时间
     * @param EndTime 截至时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamArrayObj(map, prefix + "Summary.", this.Summary);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

