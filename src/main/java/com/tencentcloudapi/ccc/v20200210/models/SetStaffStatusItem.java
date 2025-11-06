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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetStaffStatusItem extends AbstractModel {

    /**
    * 座席账号
    */
    @SerializedName("StaffUserId")
    @Expose
    private String StaffUserId;

    /**
    * 状态，free 示闲 notReady 示忙 rest 小休	
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 如果设置小休状态，这里是原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 座席账号 
     * @return StaffUserId 座席账号
     */
    public String getStaffUserId() {
        return this.StaffUserId;
    }

    /**
     * Set 座席账号
     * @param StaffUserId 座席账号
     */
    public void setStaffUserId(String StaffUserId) {
        this.StaffUserId = StaffUserId;
    }

    /**
     * Get 状态，free 示闲 notReady 示忙 rest 小休	 
     * @return Status 状态，free 示闲 notReady 示忙 rest 小休	
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，free 示闲 notReady 示忙 rest 小休	
     * @param Status 状态，free 示闲 notReady 示忙 rest 小休	
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 如果设置小休状态，这里是原因 
     * @return Reason 如果设置小休状态，这里是原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 如果设置小休状态，这里是原因
     * @param Reason 如果设置小休状态，这里是原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public SetStaffStatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetStaffStatusItem(SetStaffStatusItem source) {
        if (source.StaffUserId != null) {
            this.StaffUserId = new String(source.StaffUserId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StaffUserId", this.StaffUserId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

