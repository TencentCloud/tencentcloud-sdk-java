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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceScheduledScalingAction extends AbstractModel {

    /**
    * Cron 表达式，用于描述定时伸缩动作的触发时间。采用 5 字段标准 Cron 格式：分钟 小时 日期 月份 星期。不支持秒字段和年份字段。
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
    * 命中该定时伸缩动作后，推理服务需要调整到的最小实例数。若同一评估窗口内多个定时伸缩动作同时命中，则使用其中最大的 MinInstanceCount。
    */
    @SerializedName("MinInstanceCount")
    @Expose
    private Long MinInstanceCount;

    /**
     * Get Cron 表达式，用于描述定时伸缩动作的触发时间。采用 5 字段标准 Cron 格式：分钟 小时 日期 月份 星期。不支持秒字段和年份字段。 
     * @return CronExpression Cron 表达式，用于描述定时伸缩动作的触发时间。采用 5 字段标准 Cron 格式：分钟 小时 日期 月份 星期。不支持秒字段和年份字段。
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set Cron 表达式，用于描述定时伸缩动作的触发时间。采用 5 字段标准 Cron 格式：分钟 小时 日期 月份 星期。不支持秒字段和年份字段。
     * @param CronExpression Cron 表达式，用于描述定时伸缩动作的触发时间。采用 5 字段标准 Cron 格式：分钟 小时 日期 月份 星期。不支持秒字段和年份字段。
     */
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    /**
     * Get 命中该定时伸缩动作后，推理服务需要调整到的最小实例数。若同一评估窗口内多个定时伸缩动作同时命中，则使用其中最大的 MinInstanceCount。 
     * @return MinInstanceCount 命中该定时伸缩动作后，推理服务需要调整到的最小实例数。若同一评估窗口内多个定时伸缩动作同时命中，则使用其中最大的 MinInstanceCount。
     */
    public Long getMinInstanceCount() {
        return this.MinInstanceCount;
    }

    /**
     * Set 命中该定时伸缩动作后，推理服务需要调整到的最小实例数。若同一评估窗口内多个定时伸缩动作同时命中，则使用其中最大的 MinInstanceCount。
     * @param MinInstanceCount 命中该定时伸缩动作后，推理服务需要调整到的最小实例数。若同一评估窗口内多个定时伸缩动作同时命中，则使用其中最大的 MinInstanceCount。
     */
    public void setMinInstanceCount(Long MinInstanceCount) {
        this.MinInstanceCount = MinInstanceCount;
    }

    public InferenceScheduledScalingAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceScheduledScalingAction(InferenceScheduledScalingAction source) {
        if (source.CronExpression != null) {
            this.CronExpression = new String(source.CronExpression);
        }
        if (source.MinInstanceCount != null) {
            this.MinInstanceCount = new Long(source.MinInstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CronExpression", this.CronExpression);
        this.setParamSimple(map, prefix + "MinInstanceCount", this.MinInstanceCount);

    }
}

