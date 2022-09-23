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
package com.tencentcloudapi.bpaas.v20181217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutApproveBpaasApplicationRequest extends AbstractModel{

    /**
    * 状态  1:通过  2:拒绝
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 审批单id
    */
    @SerializedName("ApproveId")
    @Expose
    private Long ApproveId;

    /**
    * 审批意见
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
     * Get 状态  1:通过  2:拒绝 
     * @return Status 状态  1:通过  2:拒绝
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态  1:通过  2:拒绝
     * @param Status 状态  1:通过  2:拒绝
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 审批单id 
     * @return ApproveId 审批单id
     */
    public Long getApproveId() {
        return this.ApproveId;
    }

    /**
     * Set 审批单id
     * @param ApproveId 审批单id
     */
    public void setApproveId(Long ApproveId) {
        this.ApproveId = ApproveId;
    }

    /**
     * Get 审批意见 
     * @return Msg 审批意见
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 审批意见
     * @param Msg 审批意见
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public OutApproveBpaasApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutApproveBpaasApplicationRequest(OutApproveBpaasApplicationRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ApproveId != null) {
            this.ApproveId = new Long(source.ApproveId);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApproveId", this.ApproveId);
        this.setParamSimple(map, prefix + "Msg", this.Msg);

    }
}

