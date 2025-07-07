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

public class AccessKeyAlarmInfo extends AbstractModel {

    /**
    * 告警类型/风险类型
告警类型：
0异常调用
1泄漏检测
2自定义

风险类型：
0：配置风险
1: 自定义风险
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 告警数量/风险数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 告警类型/风险类型
告警类型：
0异常调用
1泄漏检测
2自定义

风险类型：
0：配置风险
1: 自定义风险 
     * @return Type 告警类型/风险类型
告警类型：
0异常调用
1泄漏检测
2自定义

风险类型：
0：配置风险
1: 自定义风险
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 告警类型/风险类型
告警类型：
0异常调用
1泄漏检测
2自定义

风险类型：
0：配置风险
1: 自定义风险
     * @param Type 告警类型/风险类型
告警类型：
0异常调用
1泄漏检测
2自定义

风险类型：
0：配置风险
1: 自定义风险
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 告警数量/风险数量 
     * @return Count 告警数量/风险数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 告警数量/风险数量
     * @param Count 告警数量/风险数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public AccessKeyAlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyAlarmInfo(AccessKeyAlarmInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

