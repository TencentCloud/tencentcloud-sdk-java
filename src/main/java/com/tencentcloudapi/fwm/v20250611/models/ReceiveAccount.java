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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiveAccount extends AbstractModel {

    /**
    * 租户 uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 租户名称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 0=账号uin，1=账号组
    */
    @SerializedName("ReceiverType")
    @Expose
    private Long ReceiverType;

    /**
    * 只有ReceiverType 是 1 时 才返回账号列表
    */
    @SerializedName("Members")
    @Expose
    private MemberInfo [] Members;

    /**
     * Get 租户 uin 
     * @return Uin 租户 uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 租户 uin
     * @param Uin 租户 uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 租户名称 
     * @return Nickname 租户名称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 租户名称
     * @param Nickname 租户名称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 0=账号uin，1=账号组 
     * @return ReceiverType 0=账号uin，1=账号组
     */
    public Long getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 0=账号uin，1=账号组
     * @param ReceiverType 0=账号uin，1=账号组
     */
    public void setReceiverType(Long ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get 只有ReceiverType 是 1 时 才返回账号列表 
     * @return Members 只有ReceiverType 是 1 时 才返回账号列表
     */
    public MemberInfo [] getMembers() {
        return this.Members;
    }

    /**
     * Set 只有ReceiverType 是 1 时 才返回账号列表
     * @param Members 只有ReceiverType 是 1 时 才返回账号列表
     */
    public void setMembers(MemberInfo [] Members) {
        this.Members = Members;
    }

    public ReceiveAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiveAccount(ReceiveAccount source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new Long(source.ReceiverType);
        }
        if (source.Members != null) {
            this.Members = new MemberInfo[source.Members.length];
            for (int i = 0; i < source.Members.length; i++) {
                this.Members[i] = new MemberInfo(source.Members[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArrayObj(map, prefix + "Members.", this.Members);

    }
}

