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

public class DescribeCWPTaskDurationRequest extends AbstractModel {

    /**
    * 需要执行任务的主机数
    */
    @SerializedName("UuidCnt")
    @Expose
    private Long UuidCnt;

    /**
    * 是否定时扫描
    */
    @SerializedName("TimingScan")
    @Expose
    private Boolean TimingScan;

    /**
     * Get 需要执行任务的主机数 
     * @return UuidCnt 需要执行任务的主机数
     */
    public Long getUuidCnt() {
        return this.UuidCnt;
    }

    /**
     * Set 需要执行任务的主机数
     * @param UuidCnt 需要执行任务的主机数
     */
    public void setUuidCnt(Long UuidCnt) {
        this.UuidCnt = UuidCnt;
    }

    /**
     * Get 是否定时扫描 
     * @return TimingScan 是否定时扫描
     */
    public Boolean getTimingScan() {
        return this.TimingScan;
    }

    /**
     * Set 是否定时扫描
     * @param TimingScan 是否定时扫描
     */
    public void setTimingScan(Boolean TimingScan) {
        this.TimingScan = TimingScan;
    }

    public DescribeCWPTaskDurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCWPTaskDurationRequest(DescribeCWPTaskDurationRequest source) {
        if (source.UuidCnt != null) {
            this.UuidCnt = new Long(source.UuidCnt);
        }
        if (source.TimingScan != null) {
            this.TimingScan = new Boolean(source.TimingScan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UuidCnt", this.UuidCnt);
        this.setParamSimple(map, prefix + "TimingScan", this.TimingScan);

    }
}

