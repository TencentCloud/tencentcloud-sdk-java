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

public class TicketThroughUnit extends AbstractModel{

    /**
    * 时间
    */
    @SerializedName("DateKey")
    @Expose
    private String DateKey;

    /**
    * 票据验证的通过量
    */
    @SerializedName("Through")
    @Expose
    private Long Through;

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
     * Get 票据验证的通过量 
     * @return Through 票据验证的通过量
     */
    public Long getThrough() {
        return this.Through;
    }

    /**
     * Set 票据验证的通过量
     * @param Through 票据验证的通过量
     */
    public void setThrough(Long Through) {
        this.Through = Through;
    }

    public TicketThroughUnit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TicketThroughUnit(TicketThroughUnit source) {
        if (source.DateKey != null) {
            this.DateKey = new String(source.DateKey);
        }
        if (source.Through != null) {
            this.Through = new Long(source.Through);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateKey", this.DateKey);
        this.setParamSimple(map, prefix + "Through", this.Through);

    }
}

