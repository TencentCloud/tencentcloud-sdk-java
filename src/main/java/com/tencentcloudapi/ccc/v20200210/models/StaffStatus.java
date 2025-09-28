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

public class StaffStatus extends AbstractModel {

    /**
    * 查询使用的游标，分页场景使用
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * 状态时间戳，Unix 秒级时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态关联的会话 Id
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 小休原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 座席邮箱
    */
    @SerializedName("StaffEmail")
    @Expose
    private String StaffEmail;

    /**
    * 座席工号
    */
    @SerializedName("StaffNo")
    @Expose
    private String StaffNo;

    /**
     * Get 查询使用的游标，分页场景使用 
     * @return Cursor 查询使用的游标，分页场景使用
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 查询使用的游标，分页场景使用
     * @param Cursor 查询使用的游标，分页场景使用
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get 状态时间戳，Unix 秒级时间戳 
     * @return Timestamp 状态时间戳，Unix 秒级时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 状态时间戳，Unix 秒级时间戳
     * @param Timestamp 状态时间戳，Unix 秒级时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线 
     * @return Status 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线
     * @param Status 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态关联的会话 Id 
     * @return SessionId 状态关联的会话 Id
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 状态关联的会话 Id
     * @param SessionId 状态关联的会话 Id
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 小休原因 
     * @return Reason 小休原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 小休原因
     * @param Reason 小休原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 座席邮箱 
     * @return StaffEmail 座席邮箱
     */
    public String getStaffEmail() {
        return this.StaffEmail;
    }

    /**
     * Set 座席邮箱
     * @param StaffEmail 座席邮箱
     */
    public void setStaffEmail(String StaffEmail) {
        this.StaffEmail = StaffEmail;
    }

    /**
     * Get 座席工号 
     * @return StaffNo 座席工号
     */
    public String getStaffNo() {
        return this.StaffNo;
    }

    /**
     * Set 座席工号
     * @param StaffNo 座席工号
     */
    public void setStaffNo(String StaffNo) {
        this.StaffNo = StaffNo;
    }

    public StaffStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffStatus(StaffStatus source) {
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.StaffEmail != null) {
            this.StaffEmail = new String(source.StaffEmail);
        }
        if (source.StaffNo != null) {
            this.StaffNo = new String(source.StaffNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "StaffEmail", this.StaffEmail);
        this.setParamSimple(map, prefix + "StaffNo", this.StaffNo);

    }
}

