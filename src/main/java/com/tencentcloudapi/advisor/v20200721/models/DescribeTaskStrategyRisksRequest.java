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
package com.tencentcloudapi.advisor.v20200721.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStrategyRisksRequest extends AbstractModel{

    /**
    * 评估项ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 限制数量,默认100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 环境
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
     * Get 评估项ID 
     * @return StrategyId 评估项ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 评估项ID
     * @param StrategyId 评估项ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 限制数量,默认100 
     * @return Limit 限制数量,默认100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数量,默认100
     * @param Limit 限制数量,默认100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量,默认0 
     * @return Offset 偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 环境 
     * @return Env 环境
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set 环境
     * @param Env 环境
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    public DescribeTaskStrategyRisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskStrategyRisksRequest(DescribeTaskStrategyRisksRequest source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

