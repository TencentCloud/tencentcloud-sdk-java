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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LookUpEventsRequest extends AbstractModel{

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 检索条件
    */
    @SerializedName("LookupAttributes")
    @Expose
    private LookupAttribute [] LookupAttributes;

    /**
    * 返回日志的最大条数
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 云审计模式，有效值：standard | quick，其中standard是标准模式，quick是极速模式。默认为标准模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 查看更多日志的凭证
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 检索条件 
     * @return LookupAttributes 检索条件
     */
    public LookupAttribute [] getLookupAttributes() {
        return this.LookupAttributes;
    }

    /**
     * Set 检索条件
     * @param LookupAttributes 检索条件
     */
    public void setLookupAttributes(LookupAttribute [] LookupAttributes) {
        this.LookupAttributes = LookupAttributes;
    }

    /**
     * Get 返回日志的最大条数 
     * @return MaxResults 返回日志的最大条数
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 返回日志的最大条数
     * @param MaxResults 返回日志的最大条数
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 云审计模式，有效值：standard | quick，其中standard是标准模式，quick是极速模式。默认为标准模式 
     * @return Mode 云审计模式，有效值：standard | quick，其中standard是标准模式，quick是极速模式。默认为标准模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 云审计模式，有效值：standard | quick，其中standard是标准模式，quick是极速模式。默认为标准模式
     * @param Mode 云审计模式，有效值：standard | quick，其中standard是标准模式，quick是极速模式。默认为标准模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 查看更多日志的凭证 
     * @return NextToken 查看更多日志的凭证
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 查看更多日志的凭证
     * @param NextToken 查看更多日志的凭证
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "LookupAttributes.", this.LookupAttributes);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

