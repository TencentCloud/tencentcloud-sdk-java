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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccessPeriodRequest extends AbstractModel{

    /**
    * 访问日志保存期限，范围为[1, 30]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 日志主题
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get 访问日志保存期限，范围为[1, 30] 
     * @return Period 访问日志保存期限，范围为[1, 30]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 访问日志保存期限，范围为[1, 30]
     * @param Period 访问日志保存期限，范围为[1, 30]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 日志主题 
     * @return TopicId 日志主题
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题
     * @param TopicId 日志主题
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public ModifyAccessPeriodRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccessPeriodRequest(ModifyAccessPeriodRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

