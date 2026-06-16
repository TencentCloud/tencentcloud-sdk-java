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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemindFlowGroupDetail extends AbstractModel {

    /**
    * <p>该签署人在合同中的签署顺序</p>
    */
    @SerializedName("ApproverOrder")
    @Expose
    private Long ApproverOrder;

    /**
    * <p>签署人对应的签署id</p>
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * <p>催办状态</p><p>枚举值：</p><ul><li>0： 成功</li><li>2： 无需催办</li><li>5： 超过次数限制</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>描述当前催办结果的原因</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>该签署人在合同中的签署顺序</p> 
     * @return ApproverOrder <p>该签署人在合同中的签署顺序</p>
     */
    public Long getApproverOrder() {
        return this.ApproverOrder;
    }

    /**
     * Set <p>该签署人在合同中的签署顺序</p>
     * @param ApproverOrder <p>该签署人在合同中的签署顺序</p>
     */
    public void setApproverOrder(Long ApproverOrder) {
        this.ApproverOrder = ApproverOrder;
    }

    /**
     * Get <p>签署人对应的签署id</p> 
     * @return SignId <p>签署人对应的签署id</p>
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set <p>签署人对应的签署id</p>
     * @param SignId <p>签署人对应的签署id</p>
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get <p>催办状态</p><p>枚举值：</p><ul><li>0： 成功</li><li>2： 无需催办</li><li>5： 超过次数限制</li></ul> 
     * @return Status <p>催办状态</p><p>枚举值：</p><ul><li>0： 成功</li><li>2： 无需催办</li><li>5： 超过次数限制</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>催办状态</p><p>枚举值：</p><ul><li>0： 成功</li><li>2： 无需催办</li><li>5： 超过次数限制</li></ul>
     * @param Status <p>催办状态</p><p>枚举值：</p><ul><li>0： 成功</li><li>2： 无需催办</li><li>5： 超过次数限制</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>描述当前催办结果的原因</p> 
     * @return Reason <p>描述当前催办结果的原因</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>描述当前催办结果的原因</p>
     * @param Reason <p>描述当前催办结果的原因</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public RemindFlowGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemindFlowGroupDetail(RemindFlowGroupDetail source) {
        if (source.ApproverOrder != null) {
            this.ApproverOrder = new Long(source.ApproverOrder);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproverOrder", this.ApproverOrder);
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

