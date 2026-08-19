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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Inviter extends AbstractModel {

    /**
    * <p>邀请人ID</p>
    */
    @SerializedName("InviterUserId")
    @Expose
    private String InviterUserId;

    /**
    * <p>邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
    */
    @SerializedName("InviterPhone")
    @Expose
    private String InviterPhone;

    /**
    * <p>邀请码</p>
    */
    @SerializedName("InviteCode")
    @Expose
    private String InviteCode;

    /**
    * <p>邀请渠道</p>
    */
    @SerializedName("InviteChannel")
    @Expose
    private String InviteChannel;

    /**
     * Get <p>邀请人ID</p> 
     * @return InviterUserId <p>邀请人ID</p>
     */
    public String getInviterUserId() {
        return this.InviterUserId;
    }

    /**
     * Set <p>邀请人ID</p>
     * @param InviterUserId <p>邀请人ID</p>
     */
    public void setInviterUserId(String InviterUserId) {
        this.InviterUserId = InviterUserId;
    }

    /**
     * Get <p>邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p> 
     * @return InviterPhone <p>邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public String getInviterPhone() {
        return this.InviterPhone;
    }

    /**
     * Set <p>邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     * @param InviterPhone <p>邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public void setInviterPhone(String InviterPhone) {
        this.InviterPhone = InviterPhone;
    }

    /**
     * Get <p>邀请码</p> 
     * @return InviteCode <p>邀请码</p>
     */
    public String getInviteCode() {
        return this.InviteCode;
    }

    /**
     * Set <p>邀请码</p>
     * @param InviteCode <p>邀请码</p>
     */
    public void setInviteCode(String InviteCode) {
        this.InviteCode = InviteCode;
    }

    /**
     * Get <p>邀请渠道</p> 
     * @return InviteChannel <p>邀请渠道</p>
     */
    public String getInviteChannel() {
        return this.InviteChannel;
    }

    /**
     * Set <p>邀请渠道</p>
     * @param InviteChannel <p>邀请渠道</p>
     */
    public void setInviteChannel(String InviteChannel) {
        this.InviteChannel = InviteChannel;
    }

    public Inviter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Inviter(Inviter source) {
        if (source.InviterUserId != null) {
            this.InviterUserId = new String(source.InviterUserId);
        }
        if (source.InviterPhone != null) {
            this.InviterPhone = new String(source.InviterPhone);
        }
        if (source.InviteCode != null) {
            this.InviteCode = new String(source.InviteCode);
        }
        if (source.InviteChannel != null) {
            this.InviteChannel = new String(source.InviteChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InviterUserId", this.InviterUserId);
        this.setParamSimple(map, prefix + "InviterPhone", this.InviterPhone);
        this.setParamSimple(map, prefix + "InviteCode", this.InviteCode);
        this.setParamSimple(map, prefix + "InviteChannel", this.InviteChannel);

    }
}

