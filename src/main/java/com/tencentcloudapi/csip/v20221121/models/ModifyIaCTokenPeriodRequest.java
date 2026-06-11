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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIaCTokenPeriodRequest extends AbstractModel {

    /**
    * <p>ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>扫描结果存储周期</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get <p>ID</p> 
     * @return Id <p>ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>ID</p>
     * @param Id <p>ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>扫描结果存储周期</p> 
     * @return Period <p>扫描结果存储周期</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>扫描结果存储周期</p>
     * @param Period <p>扫描结果存储周期</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public ModifyIaCTokenPeriodRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIaCTokenPeriodRequest(ModifyIaCTokenPeriodRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

