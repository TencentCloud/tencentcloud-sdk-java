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

public class RewriteTarget extends AbstractModel{

    /**
    * 重定向目标的监听器ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetListenerId")
    @Expose
    private String TargetListenerId;

    /**
    * 重定向目标的转发规则ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetLocationId")
    @Expose
    private String TargetLocationId;

    /**
    * 重定向状态码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewriteCode")
    @Expose
    private Long RewriteCode;

    /**
    * 重定向是否携带匹配的url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TakeUrl")
    @Expose
    private Boolean TakeUrl;

    /**
    * 重定向类型，Manual: 手动重定向，Auto:  自动重定向
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewriteType")
    @Expose
    private String RewriteType;

    /**
     * Get 重定向目标的监听器ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetListenerId 重定向目标的监听器ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetListenerId() {
        return this.TargetListenerId;
    }

    /**
     * Set 重定向目标的监听器ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetListenerId 重定向目标的监听器ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetListenerId(String TargetListenerId) {
        this.TargetListenerId = TargetListenerId;
    }

    /**
     * Get 重定向目标的转发规则ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetLocationId 重定向目标的转发规则ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetLocationId() {
        return this.TargetLocationId;
    }

    /**
     * Set 重定向目标的转发规则ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetLocationId 重定向目标的转发规则ID
注意：此字段可能返回 null，表示无重定向。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetLocationId(String TargetLocationId) {
        this.TargetLocationId = TargetLocationId;
    }

    /**
     * Get 重定向状态码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewriteCode 重定向状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRewriteCode() {
        return this.RewriteCode;
    }

    /**
     * Set 重定向状态码
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewriteCode 重定向状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewriteCode(Long RewriteCode) {
        this.RewriteCode = RewriteCode;
    }

    /**
     * Get 重定向是否携带匹配的url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TakeUrl 重定向是否携带匹配的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTakeUrl() {
        return this.TakeUrl;
    }

    /**
     * Set 重定向是否携带匹配的url
注意：此字段可能返回 null，表示取不到有效值。
     * @param TakeUrl 重定向是否携带匹配的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTakeUrl(Boolean TakeUrl) {
        this.TakeUrl = TakeUrl;
    }

    /**
     * Get 重定向类型，Manual: 手动重定向，Auto:  自动重定向
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewriteType 重定向类型，Manual: 手动重定向，Auto:  自动重定向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRewriteType() {
        return this.RewriteType;
    }

    /**
     * Set 重定向类型，Manual: 手动重定向，Auto:  自动重定向
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewriteType 重定向类型，Manual: 手动重定向，Auto:  自动重定向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewriteType(String RewriteType) {
        this.RewriteType = RewriteType;
    }

    public RewriteTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RewriteTarget(RewriteTarget source) {
        if (source.TargetListenerId != null) {
            this.TargetListenerId = new String(source.TargetListenerId);
        }
        if (source.TargetLocationId != null) {
            this.TargetLocationId = new String(source.TargetLocationId);
        }
        if (source.RewriteCode != null) {
            this.RewriteCode = new Long(source.RewriteCode);
        }
        if (source.TakeUrl != null) {
            this.TakeUrl = new Boolean(source.TakeUrl);
        }
        if (source.RewriteType != null) {
            this.RewriteType = new String(source.RewriteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetListenerId", this.TargetListenerId);
        this.setParamSimple(map, prefix + "TargetLocationId", this.TargetLocationId);
        this.setParamSimple(map, prefix + "RewriteCode", this.RewriteCode);
        this.setParamSimple(map, prefix + "TakeUrl", this.TakeUrl);
        this.setParamSimple(map, prefix + "RewriteType", this.RewriteType);

    }
}

