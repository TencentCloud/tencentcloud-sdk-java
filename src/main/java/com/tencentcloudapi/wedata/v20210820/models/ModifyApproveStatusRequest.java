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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApproveStatusRequest extends AbstractModel {

    /**
    * 审批单ids
    */
    @SerializedName("ApproveIds")
    @Expose
    private String [] ApproveIds;

    /**
    * 审批备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 审批单ids 
     * @return ApproveIds 审批单ids
     */
    public String [] getApproveIds() {
        return this.ApproveIds;
    }

    /**
     * Set 审批单ids
     * @param ApproveIds 审批单ids
     */
    public void setApproveIds(String [] ApproveIds) {
        this.ApproveIds = ApproveIds;
    }

    /**
     * Get 审批备注 
     * @return Remark 审批备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 审批备注
     * @param Remark 审批备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyApproveStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApproveStatusRequest(ModifyApproveStatusRequest source) {
        if (source.ApproveIds != null) {
            this.ApproveIds = new String[source.ApproveIds.length];
            for (int i = 0; i < source.ApproveIds.length; i++) {
                this.ApproveIds[i] = new String(source.ApproveIds[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApproveIds.", this.ApproveIds);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

