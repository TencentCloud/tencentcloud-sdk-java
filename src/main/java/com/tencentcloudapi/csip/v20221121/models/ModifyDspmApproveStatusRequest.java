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

public class ModifyDspmApproveStatusRequest extends AbstractModel {

    /**
    * 申请单id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 状态。1-通过 2-拒绝
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 审批信息
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 申请单id 
     * @return OrderId 申请单id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 申请单id
     * @param OrderId 申请单id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 状态。1-通过 2-拒绝 
     * @return Status 状态。1-通过 2-拒绝
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。1-通过 2-拒绝
     * @param Status 状态。1-通过 2-拒绝
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 审批信息 
     * @return Comment 审批信息
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 审批信息
     * @param Comment 审批信息
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public ModifyDspmApproveStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmApproveStatusRequest(ModifyDspmApproveStatusRequest source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

