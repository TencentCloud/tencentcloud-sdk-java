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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TicketInterceptUnit extends AbstractModel{

    /**
    * 时间
    */
    @SerializedName("DateKey")
    @Expose
    private String DateKey;

    /**
    * 票据验证拦截量
    */
    @SerializedName("Intercept")
    @Expose
    private Long Intercept;

    /**
     * Get 时间 
     * @return DateKey 时间
     */
    public String getDateKey() {
        return this.DateKey;
    }

    /**
     * Set 时间
     * @param DateKey 时间
     */
    public void setDateKey(String DateKey) {
        this.DateKey = DateKey;
    }

    /**
     * Get 票据验证拦截量 
     * @return Intercept 票据验证拦截量
     */
    public Long getIntercept() {
        return this.Intercept;
    }

    /**
     * Set 票据验证拦截量
     * @param Intercept 票据验证拦截量
     */
    public void setIntercept(Long Intercept) {
        this.Intercept = Intercept;
    }

    public TicketInterceptUnit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TicketInterceptUnit(TicketInterceptUnit source) {
        if (source.DateKey != null) {
            this.DateKey = new String(source.DateKey);
        }
        if (source.Intercept != null) {
            this.Intercept = new Long(source.Intercept);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateKey", this.DateKey);
        this.setParamSimple(map, prefix + "Intercept", this.Intercept);

    }
}

