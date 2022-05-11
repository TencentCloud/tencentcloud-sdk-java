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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Quota extends AbstractModel{

    /**
    * 配额名称，取值范围：
<li> TOTAL_OPEN_CLB_QUOTA：用户当前地域下的公网CLB配额 </li>
<li> TOTAL_INTERNAL_CLB_QUOTA：用户当前地域下的内网CLB配额 </li>
<li> TOTAL_LISTENER_QUOTA：一个CLB下的监听器配额 </li>
<li> TOTAL_LISTENER_RULE_QUOTA：一个监听器下的转发规则配额 </li>
<li> TOTAL_TARGET_BIND_QUOTA：一条转发规则下可绑定设备的配额 </li>
<li> TOTAL_SNAP_IP_QUOTA： 一个CLB实例下跨地域2.0的SNAT IP配额 </li>
<li>TOTAL_ISP_CLB_QUOTA：用户当前地域下的三网CLB配额 </li>
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * 当前使用数量，为 null 时表示无意义。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaCurrent")
    @Expose
    private Long QuotaCurrent;

    /**
    * 配额数量。
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
     * Get 配额名称，取值范围：
<li> TOTAL_OPEN_CLB_QUOTA：用户当前地域下的公网CLB配额 </li>
<li> TOTAL_INTERNAL_CLB_QUOTA：用户当前地域下的内网CLB配额 </li>
<li> TOTAL_LISTENER_QUOTA：一个CLB下的监听器配额 </li>
<li> TOTAL_LISTENER_RULE_QUOTA：一个监听器下的转发规则配额 </li>
<li> TOTAL_TARGET_BIND_QUOTA：一条转发规则下可绑定设备的配额 </li>
<li> TOTAL_SNAP_IP_QUOTA： 一个CLB实例下跨地域2.0的SNAT IP配额 </li>
<li>TOTAL_ISP_CLB_QUOTA：用户当前地域下的三网CLB配额 </li> 
     * @return QuotaId 配额名称，取值范围：
<li> TOTAL_OPEN_CLB_QUOTA：用户当前地域下的公网CLB配额 </li>
<li> TOTAL_INTERNAL_CLB_QUOTA：用户当前地域下的内网CLB配额 </li>
<li> TOTAL_LISTENER_QUOTA：一个CLB下的监听器配额 </li>
<li> TOTAL_LISTENER_RULE_QUOTA：一个监听器下的转发规则配额 </li>
<li> TOTAL_TARGET_BIND_QUOTA：一条转发规则下可绑定设备的配额 </li>
<li> TOTAL_SNAP_IP_QUOTA： 一个CLB实例下跨地域2.0的SNAT IP配额 </li>
<li>TOTAL_ISP_CLB_QUOTA：用户当前地域下的三网CLB配额 </li>
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set 配额名称，取值范围：
<li> TOTAL_OPEN_CLB_QUOTA：用户当前地域下的公网CLB配额 </li>
<li> TOTAL_INTERNAL_CLB_QUOTA：用户当前地域下的内网CLB配额 </li>
<li> TOTAL_LISTENER_QUOTA：一个CLB下的监听器配额 </li>
<li> TOTAL_LISTENER_RULE_QUOTA：一个监听器下的转发规则配额 </li>
<li> TOTAL_TARGET_BIND_QUOTA：一条转发规则下可绑定设备的配额 </li>
<li> TOTAL_SNAP_IP_QUOTA： 一个CLB实例下跨地域2.0的SNAT IP配额 </li>
<li>TOTAL_ISP_CLB_QUOTA：用户当前地域下的三网CLB配额 </li>
     * @param QuotaId 配额名称，取值范围：
<li> TOTAL_OPEN_CLB_QUOTA：用户当前地域下的公网CLB配额 </li>
<li> TOTAL_INTERNAL_CLB_QUOTA：用户当前地域下的内网CLB配额 </li>
<li> TOTAL_LISTENER_QUOTA：一个CLB下的监听器配额 </li>
<li> TOTAL_LISTENER_RULE_QUOTA：一个监听器下的转发规则配额 </li>
<li> TOTAL_TARGET_BIND_QUOTA：一条转发规则下可绑定设备的配额 </li>
<li> TOTAL_SNAP_IP_QUOTA： 一个CLB实例下跨地域2.0的SNAT IP配额 </li>
<li>TOTAL_ISP_CLB_QUOTA：用户当前地域下的三网CLB配额 </li>
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get 当前使用数量，为 null 时表示无意义。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaCurrent 当前使用数量，为 null 时表示无意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQuotaCurrent() {
        return this.QuotaCurrent;
    }

    /**
     * Set 当前使用数量，为 null 时表示无意义。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaCurrent 当前使用数量，为 null 时表示无意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaCurrent(Long QuotaCurrent) {
        this.QuotaCurrent = QuotaCurrent;
    }

    /**
     * Get 配额数量。 
     * @return QuotaLimit 配额数量。
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set 配额数量。
     * @param QuotaLimit 配额数量。
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    public Quota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Quota(Quota source) {
        if (source.QuotaId != null) {
            this.QuotaId = new String(source.QuotaId);
        }
        if (source.QuotaCurrent != null) {
            this.QuotaCurrent = new Long(source.QuotaCurrent);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaCurrent", this.QuotaCurrent);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);

    }
}

