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

public class CreateIaCAccessTokenRequest extends AbstractModel {

    /**
    * <p>CI/CD名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>扫描结果存储时长(30/60/90/120/150/180天)</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get <p>CI/CD名称</p> 
     * @return Name <p>CI/CD名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>CI/CD名称</p>
     * @param Name <p>CI/CD名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>扫描结果存储时长(30/60/90/120/150/180天)</p> 
     * @return Period <p>扫描结果存储时长(30/60/90/120/150/180天)</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>扫描结果存储时长(30/60/90/120/150/180天)</p>
     * @param Period <p>扫描结果存储时长(30/60/90/120/150/180天)</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public CreateIaCAccessTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIaCAccessTokenRequest(CreateIaCAccessTokenRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

