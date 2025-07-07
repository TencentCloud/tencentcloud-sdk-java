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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackTimeRange extends AbstractModel {

    /**
    * 实例可回档开始时间，时间格式：2016-10-29 01:06:04
    */
    @SerializedName("Begin")
    @Expose
    private String Begin;

    /**
    * 实例可回档结束时间，时间格式：2016-11-02 11:44:47
    */
    @SerializedName("End")
    @Expose
    private String End;

    /**
     * Get 实例可回档开始时间，时间格式：2016-10-29 01:06:04 
     * @return Begin 实例可回档开始时间，时间格式：2016-10-29 01:06:04
     */
    public String getBegin() {
        return this.Begin;
    }

    /**
     * Set 实例可回档开始时间，时间格式：2016-10-29 01:06:04
     * @param Begin 实例可回档开始时间，时间格式：2016-10-29 01:06:04
     */
    public void setBegin(String Begin) {
        this.Begin = Begin;
    }

    /**
     * Get 实例可回档结束时间，时间格式：2016-11-02 11:44:47 
     * @return End 实例可回档结束时间，时间格式：2016-11-02 11:44:47
     */
    public String getEnd() {
        return this.End;
    }

    /**
     * Set 实例可回档结束时间，时间格式：2016-11-02 11:44:47
     * @param End 实例可回档结束时间，时间格式：2016-11-02 11:44:47
     */
    public void setEnd(String End) {
        this.End = End;
    }

    public RollbackTimeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTimeRange(RollbackTimeRange source) {
        if (source.Begin != null) {
            this.Begin = new String(source.Begin);
        }
        if (source.End != null) {
            this.End = new String(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Begin", this.Begin);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

