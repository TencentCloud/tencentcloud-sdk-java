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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLLMWafDLPRulesRequest extends AbstractModel {

    /**
    * <p>SDK 模式传 ServiceId（与 Domain 二选一）</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>排序字段，当前仅支持 UpdateTime；为空则按规则默认顺序返回</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>排序方向：asc(升序)/desc(降序)，默认 desc</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>域名模式传 Domain（与 ServiceId 二选一）</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get <p>SDK 模式传 ServiceId（与 Domain 二选一）</p> 
     * @return ServiceId <p>SDK 模式传 ServiceId（与 Domain 二选一）</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>SDK 模式传 ServiceId（与 Domain 二选一）</p>
     * @param ServiceId <p>SDK 模式传 ServiceId（与 Domain 二选一）</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>排序字段，当前仅支持 UpdateTime；为空则按规则默认顺序返回</p> 
     * @return By <p>排序字段，当前仅支持 UpdateTime；为空则按规则默认顺序返回</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段，当前仅支持 UpdateTime；为空则按规则默认顺序返回</p>
     * @param By <p>排序字段，当前仅支持 UpdateTime；为空则按规则默认顺序返回</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get <p>排序方向：asc(升序)/desc(降序)，默认 desc</p> 
     * @return Order <p>排序方向：asc(升序)/desc(降序)，默认 desc</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方向：asc(升序)/desc(降序)，默认 desc</p>
     * @param Order <p>排序方向：asc(升序)/desc(降序)，默认 desc</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>域名模式传 Domain（与 ServiceId 二选一）</p> 
     * @return Domain <p>域名模式传 Domain（与 ServiceId 二选一）</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名模式传 Domain（与 ServiceId 二选一）</p>
     * @param Domain <p>域名模式传 Domain（与 ServiceId 二选一）</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeLLMWafDLPRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMWafDLPRulesRequest(DescribeLLMWafDLPRulesRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

