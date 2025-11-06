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

public class SetStaffStatusRspItem extends AbstractModel {

    /**
    * 座席账号
    */
    @SerializedName("StaffUserId")
    @Expose
    private String StaffUserId;

    /**
    * 错误码，参考协议整体错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 错误信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 当前状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前状态如果是小休，这里是原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 之前状态
    */
    @SerializedName("PreviousStatus")
    @Expose
    private String PreviousStatus;

    /**
    * 之前状态如果是小休，这里是原因
    */
    @SerializedName("PreviousReason")
    @Expose
    private String PreviousReason;

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
     * Get 错误码，参考协议整体错误码 
     * @return ErrorCode 错误码，参考协议整体错误码
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误码，参考协议整体错误码
     * @param ErrorCode 错误码，参考协议整体错误码
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 错误信息 
     * @return ErrorMessage 错误信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息
     * @param ErrorMessage 错误信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 当前状态 
     * @return Status 当前状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前状态
     * @param Status 当前状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前状态如果是小休，这里是原因 
     * @return Reason 当前状态如果是小休，这里是原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 当前状态如果是小休，这里是原因
     * @param Reason 当前状态如果是小休，这里是原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 之前状态 
     * @return PreviousStatus 之前状态
     */
    public String getPreviousStatus() {
        return this.PreviousStatus;
    }

    /**
     * Set 之前状态
     * @param PreviousStatus 之前状态
     */
    public void setPreviousStatus(String PreviousStatus) {
        this.PreviousStatus = PreviousStatus;
    }

    /**
     * Get 之前状态如果是小休，这里是原因 
     * @return PreviousReason 之前状态如果是小休，这里是原因
     */
    public String getPreviousReason() {
        return this.PreviousReason;
    }

    /**
     * Set 之前状态如果是小休，这里是原因
     * @param PreviousReason 之前状态如果是小休，这里是原因
     */
    public void setPreviousReason(String PreviousReason) {
        this.PreviousReason = PreviousReason;
    }

    public SetStaffStatusRspItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetStaffStatusRspItem(SetStaffStatusRspItem source) {
        if (source.StaffUserId != null) {
            this.StaffUserId = new String(source.StaffUserId);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.PreviousStatus != null) {
            this.PreviousStatus = new String(source.PreviousStatus);
        }
        if (source.PreviousReason != null) {
            this.PreviousReason = new String(source.PreviousReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StaffUserId", this.StaffUserId);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "PreviousStatus", this.PreviousStatus);
        this.setParamSimple(map, prefix + "PreviousReason", this.PreviousReason);

    }
}

