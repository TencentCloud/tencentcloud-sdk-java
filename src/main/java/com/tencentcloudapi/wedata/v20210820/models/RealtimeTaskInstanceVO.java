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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealtimeTaskInstanceVO extends AbstractModel {

    /**
    * <p>实例生成时间</p>
    */
    @SerializedName("InstanceDate")
    @Expose
    private String InstanceDate;

    /**
    * <p>实例id</p>
    */
    @SerializedName("RunningOrderId")
    @Expose
    private Long RunningOrderId;

    /**
     * Get <p>实例生成时间</p> 
     * @return InstanceDate <p>实例生成时间</p>
     */
    public String getInstanceDate() {
        return this.InstanceDate;
    }

    /**
     * Set <p>实例生成时间</p>
     * @param InstanceDate <p>实例生成时间</p>
     */
    public void setInstanceDate(String InstanceDate) {
        this.InstanceDate = InstanceDate;
    }

    /**
     * Get <p>实例id</p> 
     * @return RunningOrderId <p>实例id</p>
     */
    public Long getRunningOrderId() {
        return this.RunningOrderId;
    }

    /**
     * Set <p>实例id</p>
     * @param RunningOrderId <p>实例id</p>
     */
    public void setRunningOrderId(Long RunningOrderId) {
        this.RunningOrderId = RunningOrderId;
    }

    public RealtimeTaskInstanceVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealtimeTaskInstanceVO(RealtimeTaskInstanceVO source) {
        if (source.InstanceDate != null) {
            this.InstanceDate = new String(source.InstanceDate);
        }
        if (source.RunningOrderId != null) {
            this.RunningOrderId = new Long(source.RunningOrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceDate", this.InstanceDate);
        this.setParamSimple(map, prefix + "RunningOrderId", this.RunningOrderId);

    }
}

