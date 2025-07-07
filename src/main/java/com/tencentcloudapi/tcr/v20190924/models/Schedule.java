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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Schedule extends AbstractModel {

    /**
    * 类型：Hourly, Daily, Weekly, Custom, Manual, Dryrun, None
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 类型：Hourly, Daily, Weekly, Custom, Manual, Dryrun, None 
     * @return Type 类型：Hourly, Daily, Weekly, Custom, Manual, Dryrun, None
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型：Hourly, Daily, Weekly, Custom, Manual, Dryrun, None
     * @param Type 类型：Hourly, Daily, Weekly, Custom, Manual, Dryrun, None
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Schedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Schedule(Schedule source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

