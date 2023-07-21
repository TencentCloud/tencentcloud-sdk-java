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

public class SwitchDomainRulesRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则列表
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 开关状态，0表示关闭，1表示开启，2表示只观察
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设置为观察模式原因，
1表示业务自身原因观察，2表示系统规则误报上报，3表示核心业务灰度观察，4表示其他
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则列表 
     * @return Ids 规则列表
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 规则列表
     * @param Ids 规则列表
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 开关状态，0表示关闭，1表示开启，2表示只观察 
     * @return Status 开关状态，0表示关闭，1表示开启，2表示只观察
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态，0表示关闭，1表示开启，2表示只观察
     * @param Status 开关状态，0表示关闭，1表示开启，2表示只观察
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设置为观察模式原因，
1表示业务自身原因观察，2表示系统规则误报上报，3表示核心业务灰度观察，4表示其他 
     * @return Reason 设置为观察模式原因，
1表示业务自身原因观察，2表示系统规则误报上报，3表示核心业务灰度观察，4表示其他
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set 设置为观察模式原因，
1表示业务自身原因观察，2表示系统规则误报上报，3表示核心业务灰度观察，4表示其他
     * @param Reason 设置为观察模式原因，
1表示业务自身原因观察，2表示系统规则误报上报，3表示核心业务灰度观察，4表示其他
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    public SwitchDomainRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchDomainRulesRequest(SwitchDomainRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

