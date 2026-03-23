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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TmsConfigDTO extends AbstractModel {

    /**
    * 检测范围,请求/响应
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
    * 检测形式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 执行动作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 合并请求检测event数，联动Mode字段sync
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MergeCount")
    @Expose
    private Long MergeCount;

    /**
    * 风控策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InterceptMessage")
    @Expose
    private String InterceptMessage;

    /**
     * Get 检测范围,请求/响应
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope 检测范围,请求/响应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set 检测范围,请求/响应
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope 检测范围,请求/响应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 检测形式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode 检测形式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 检测形式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode 检测形式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 执行动作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 执行动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 执行动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 合并请求检测event数，联动Mode字段sync
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MergeCount 合并请求检测event数，联动Mode字段sync
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMergeCount() {
        return this.MergeCount;
    }

    /**
     * Set 合并请求检测event数，联动Mode字段sync
注意：此字段可能返回 null，表示取不到有效值。
     * @param MergeCount 合并请求检测event数，联动Mode字段sync
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMergeCount(Long MergeCount) {
        this.MergeCount = MergeCount;
    }

    /**
     * Get 风控策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizType 风控策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 风控策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizType 风控策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InterceptMessage 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInterceptMessage() {
        return this.InterceptMessage;
    }

    /**
     * Set 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param InterceptMessage 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterceptMessage(String InterceptMessage) {
        this.InterceptMessage = InterceptMessage;
    }

    public TmsConfigDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TmsConfigDTO(TmsConfigDTO source) {
        if (source.Scope != null) {
            this.Scope = new String[source.Scope.length];
            for (int i = 0; i < source.Scope.length; i++) {
                this.Scope[i] = new String(source.Scope[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.MergeCount != null) {
            this.MergeCount = new Long(source.MergeCount);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.InterceptMessage != null) {
            this.InterceptMessage = new String(source.InterceptMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Scope.", this.Scope);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "MergeCount", this.MergeCount);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "InterceptMessage", this.InterceptMessage);

    }
}

