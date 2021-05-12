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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceCreationLimitPolicy extends AbstractModel{

    /**
    * 创建数量，最小值1，默认2
    */
    @SerializedName("NewGameServerSessionsPerCreator")
    @Expose
    private Long NewGameServerSessionsPerCreator;

    /**
    * 单位时间，最小值1，默认3，单位分钟
    */
    @SerializedName("PolicyPeriodInMinutes")
    @Expose
    private Long PolicyPeriodInMinutes;

    /**
     * Get 创建数量，最小值1，默认2 
     * @return NewGameServerSessionsPerCreator 创建数量，最小值1，默认2
     */
    public Long getNewGameServerSessionsPerCreator() {
        return this.NewGameServerSessionsPerCreator;
    }

    /**
     * Set 创建数量，最小值1，默认2
     * @param NewGameServerSessionsPerCreator 创建数量，最小值1，默认2
     */
    public void setNewGameServerSessionsPerCreator(Long NewGameServerSessionsPerCreator) {
        this.NewGameServerSessionsPerCreator = NewGameServerSessionsPerCreator;
    }

    /**
     * Get 单位时间，最小值1，默认3，单位分钟 
     * @return PolicyPeriodInMinutes 单位时间，最小值1，默认3，单位分钟
     */
    public Long getPolicyPeriodInMinutes() {
        return this.PolicyPeriodInMinutes;
    }

    /**
     * Set 单位时间，最小值1，默认3，单位分钟
     * @param PolicyPeriodInMinutes 单位时间，最小值1，默认3，单位分钟
     */
    public void setPolicyPeriodInMinutes(Long PolicyPeriodInMinutes) {
        this.PolicyPeriodInMinutes = PolicyPeriodInMinutes;
    }

    public ResourceCreationLimitPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceCreationLimitPolicy(ResourceCreationLimitPolicy source) {
        if (source.NewGameServerSessionsPerCreator != null) {
            this.NewGameServerSessionsPerCreator = new Long(source.NewGameServerSessionsPerCreator);
        }
        if (source.PolicyPeriodInMinutes != null) {
            this.PolicyPeriodInMinutes = new Long(source.PolicyPeriodInMinutes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NewGameServerSessionsPerCreator", this.NewGameServerSessionsPerCreator);
        this.setParamSimple(map, prefix + "PolicyPeriodInMinutes", this.PolicyPeriodInMinutes);

    }
}

