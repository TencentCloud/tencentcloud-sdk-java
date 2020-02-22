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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceMonitorHotKeyRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 时间范围：1——实时，2——近30分钟，3——近6小时，4——近24小时
    */
    @SerializedName("SpanType")
    @Expose
    private Long SpanType;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 时间范围：1——实时，2——近30分钟，3——近6小时，4——近24小时 
     * @return SpanType 时间范围：1——实时，2——近30分钟，3——近6小时，4——近24小时
     */
    public Long getSpanType() {
        return this.SpanType;
    }

    /**
     * Set 时间范围：1——实时，2——近30分钟，3——近6小时，4——近24小时
     * @param SpanType 时间范围：1——实时，2——近30分钟，3——近6小时，4——近24小时
     */
    public void setSpanType(Long SpanType) {
        this.SpanType = SpanType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SpanType", this.SpanType);

    }
}

