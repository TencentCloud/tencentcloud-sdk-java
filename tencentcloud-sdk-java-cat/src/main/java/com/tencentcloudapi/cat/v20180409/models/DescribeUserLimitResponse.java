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

public class DescribeUserLimitResponse extends AbstractModel{

    /**
    * 用户可建立的最大任务数
    */
    @SerializedName("MaxTaskNum")
    @Expose
    private Long MaxTaskNum;

    /**
    * 用户可用的最大拨测结点数
    */
    @SerializedName("MaxAgentNum")
    @Expose
    private Long MaxAgentNum;

    /**
    * 用户可建立的最大拨测分组数
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
    * 用户可用的最小拨测间隔
    */
    @SerializedName("MinPeriod")
    @Expose
    private Long MinPeriod;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户可建立的最大任务数 
     * @return MaxTaskNum 用户可建立的最大任务数
     */
    public Long getMaxTaskNum() {
        return this.MaxTaskNum;
    }

    /**
     * Set 用户可建立的最大任务数
     * @param MaxTaskNum 用户可建立的最大任务数
     */
    public void setMaxTaskNum(Long MaxTaskNum) {
        this.MaxTaskNum = MaxTaskNum;
    }

    /**
     * Get 用户可用的最大拨测结点数 
     * @return MaxAgentNum 用户可用的最大拨测结点数
     */
    public Long getMaxAgentNum() {
        return this.MaxAgentNum;
    }

    /**
     * Set 用户可用的最大拨测结点数
     * @param MaxAgentNum 用户可用的最大拨测结点数
     */
    public void setMaxAgentNum(Long MaxAgentNum) {
        this.MaxAgentNum = MaxAgentNum;
    }

    /**
     * Get 用户可建立的最大拨测分组数 
     * @return MaxGroupNum 用户可建立的最大拨测分组数
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set 用户可建立的最大拨测分组数
     * @param MaxGroupNum 用户可建立的最大拨测分组数
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Get 用户可用的最小拨测间隔 
     * @return MinPeriod 用户可用的最小拨测间隔
     */
    public Long getMinPeriod() {
        return this.MinPeriod;
    }

    /**
     * Set 用户可用的最小拨测间隔
     * @param MinPeriod 用户可用的最小拨测间隔
     */
    public void setMinPeriod(Long MinPeriod) {
        this.MinPeriod = MinPeriod;
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
        this.setParamSimple(map, prefix + "MaxTaskNum", this.MaxTaskNum);
        this.setParamSimple(map, prefix + "MaxAgentNum", this.MaxAgentNum);
        this.setParamSimple(map, prefix + "MaxGroupNum", this.MaxGroupNum);
        this.setParamSimple(map, prefix + "MinPeriod", this.MinPeriod);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

