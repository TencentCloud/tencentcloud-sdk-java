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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForbidSendMsgRequest extends AbstractModel {

    /**
    * 低代码互动课堂的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 课堂ID
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 需要禁言的用户账号，最多支持500个账号
    */
    @SerializedName("MembersAccount")
    @Expose
    private String [] MembersAccount;

    /**
    * 需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。
    */
    @SerializedName("MuteTime")
    @Expose
    private Long MuteTime;

    /**
     * Get 低代码互动课堂的SdkAppId。 
     * @return SdkAppId 低代码互动课堂的SdkAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId。
     * @param SdkAppId 低代码互动课堂的SdkAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 课堂ID 
     * @return RoomId 课堂ID
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 课堂ID
     * @param RoomId 课堂ID
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 需要禁言的用户账号，最多支持500个账号 
     * @return MembersAccount 需要禁言的用户账号，最多支持500个账号
     */
    public String [] getMembersAccount() {
        return this.MembersAccount;
    }

    /**
     * Set 需要禁言的用户账号，最多支持500个账号
     * @param MembersAccount 需要禁言的用户账号，最多支持500个账号
     */
    public void setMembersAccount(String [] MembersAccount) {
        this.MembersAccount = MembersAccount;
    }

    /**
     * Get 需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。 
     * @return MuteTime 需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。
     */
    public Long getMuteTime() {
        return this.MuteTime;
    }

    /**
     * Set 需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。
     * @param MuteTime 需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。
     */
    public void setMuteTime(Long MuteTime) {
        this.MuteTime = MuteTime;
    }

    public ForbidSendMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForbidSendMsgRequest(ForbidSendMsgRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.MembersAccount != null) {
            this.MembersAccount = new String[source.MembersAccount.length];
            for (int i = 0; i < source.MembersAccount.length; i++) {
                this.MembersAccount[i] = new String(source.MembersAccount[i]);
            }
        }
        if (source.MuteTime != null) {
            this.MuteTime = new Long(source.MuteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArraySimple(map, prefix + "MembersAccount.", this.MembersAccount);
        this.setParamSimple(map, prefix + "MuteTime", this.MuteTime);

    }
}

