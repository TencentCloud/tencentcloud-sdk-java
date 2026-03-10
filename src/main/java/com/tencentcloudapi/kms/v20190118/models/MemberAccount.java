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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberAccount extends AbstractModel {

    /**
    * 成员账号appid

    */
    @SerializedName("MemberAppId")
    @Expose
    private Long MemberAppId;

    /**
    * 成员账号uin
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
     * Get 成员账号appid
 
     * @return MemberAppId 成员账号appid

     */
    public Long getMemberAppId() {
        return this.MemberAppId;
    }

    /**
     * Set 成员账号appid

     * @param MemberAppId 成员账号appid

     */
    public void setMemberAppId(Long MemberAppId) {
        this.MemberAppId = MemberAppId;
    }

    /**
     * Get 成员账号uin 
     * @return MemberUin 成员账号uin
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 成员账号uin
     * @param MemberUin 成员账号uin
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    public MemberAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberAccount(MemberAccount source) {
        if (source.MemberAppId != null) {
            this.MemberAppId = new Long(source.MemberAppId);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberAppId", this.MemberAppId);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);

    }
}

