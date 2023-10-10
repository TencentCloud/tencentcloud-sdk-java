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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReqUserRule extends AbstractModel{

    /**
    * 特征序号
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 规则开关
0：关
1：开
2：只告警
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

    /**
     * Get 特征序号 
     * @return Id 特征序号
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 特征序号
     * @param Id 特征序号
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 规则开关
0：关
1：开
2：只告警 
     * @return Status 规则开关
0：关
1：开
2：只告警
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关
0：关
1：开
2：只告警
     * @param Status 规则开关
0：关
1：开
2：只告警
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它 
     * @return Reason 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它
     * @param Reason 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    public ReqUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReqUserRule(ReqUserRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new Long(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

