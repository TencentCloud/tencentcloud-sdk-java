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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TsfLoadBalanceConfResp extends AbstractModel{

    /**
    * 是否开启负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLoadBalance")
    @Expose
    private Boolean IsLoadBalance;

    /**
    * 负载均衡方式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 是否开启会话保持。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionStickRequired")
    @Expose
    private Boolean SessionStickRequired;

    /**
    * 会话保持超时时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionStickTimeout")
    @Expose
    private Long SessionStickTimeout;

    /**
     * Get 是否开启负载均衡。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLoadBalance 是否开启负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLoadBalance() {
        return this.IsLoadBalance;
    }

    /**
     * Set 是否开启负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLoadBalance 是否开启负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLoadBalance(Boolean IsLoadBalance) {
        this.IsLoadBalance = IsLoadBalance;
    }

    /**
     * Get 负载均衡方式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 负载均衡方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 负载均衡方式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 负载均衡方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 是否开启会话保持。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionStickRequired 是否开启会话保持。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSessionStickRequired() {
        return this.SessionStickRequired;
    }

    /**
     * Set 是否开启会话保持。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionStickRequired 是否开启会话保持。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionStickRequired(Boolean SessionStickRequired) {
        this.SessionStickRequired = SessionStickRequired;
    }

    /**
     * Get 会话保持超时时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionStickTimeout 会话保持超时时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionStickTimeout() {
        return this.SessionStickTimeout;
    }

    /**
     * Set 会话保持超时时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionStickTimeout 会话保持超时时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionStickTimeout(Long SessionStickTimeout) {
        this.SessionStickTimeout = SessionStickTimeout;
    }

    public TsfLoadBalanceConfResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TsfLoadBalanceConfResp(TsfLoadBalanceConfResp source) {
        if (source.IsLoadBalance != null) {
            this.IsLoadBalance = new Boolean(source.IsLoadBalance);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.SessionStickRequired != null) {
            this.SessionStickRequired = new Boolean(source.SessionStickRequired);
        }
        if (source.SessionStickTimeout != null) {
            this.SessionStickTimeout = new Long(source.SessionStickTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsLoadBalance", this.IsLoadBalance);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "SessionStickRequired", this.SessionStickRequired);
        this.setParamSimple(map, prefix + "SessionStickTimeout", this.SessionStickTimeout);

    }
}

