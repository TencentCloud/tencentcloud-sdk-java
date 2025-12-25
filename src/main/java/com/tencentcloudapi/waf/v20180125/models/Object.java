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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Object extends AbstractModel {

    /**
    * 对象id
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 成员appid
    */
    @SerializedName("MemberAppId")
    @Expose
    private Long MemberAppId;

    /**
    * 成员uin
    */
    @SerializedName("MemberUin")
    @Expose
    private String MemberUin;

    /**
    * 成员昵称
    */
    @SerializedName("MemberNickName")
    @Expose
    private String MemberNickName;

    /**
     * Get 对象id 
     * @return ObjectId 对象id
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 对象id
     * @param ObjectId 对象id
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 成员appid 
     * @return MemberAppId 成员appid
     */
    public Long getMemberAppId() {
        return this.MemberAppId;
    }

    /**
     * Set 成员appid
     * @param MemberAppId 成员appid
     */
    public void setMemberAppId(Long MemberAppId) {
        this.MemberAppId = MemberAppId;
    }

    /**
     * Get 成员uin 
     * @return MemberUin 成员uin
     */
    public String getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 成员uin
     * @param MemberUin 成员uin
     */
    public void setMemberUin(String MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get 成员昵称 
     * @return MemberNickName 成员昵称
     */
    public String getMemberNickName() {
        return this.MemberNickName;
    }

    /**
     * Set 成员昵称
     * @param MemberNickName 成员昵称
     */
    public void setMemberNickName(String MemberNickName) {
        this.MemberNickName = MemberNickName;
    }

    public Object() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Object(Object source) {
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.MemberAppId != null) {
            this.MemberAppId = new Long(source.MemberAppId);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new String(source.MemberUin);
        }
        if (source.MemberNickName != null) {
            this.MemberNickName = new String(source.MemberNickName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "MemberAppId", this.MemberAppId);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberNickName", this.MemberNickName);

    }
}

