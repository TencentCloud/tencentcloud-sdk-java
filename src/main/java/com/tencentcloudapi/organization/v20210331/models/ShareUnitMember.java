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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareUnitMember extends AbstractModel {

    /**
    * 共享成员Uin。
    */
    @SerializedName("ShareMemberUin")
    @Expose
    private Long ShareMemberUin;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 共享成员Uin。 
     * @return ShareMemberUin 共享成员Uin。
     */
    public Long getShareMemberUin() {
        return this.ShareMemberUin;
    }

    /**
     * Set 共享成员Uin。
     * @param ShareMemberUin 共享成员Uin。
     */
    public void setShareMemberUin(Long ShareMemberUin) {
        this.ShareMemberUin = ShareMemberUin;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ShareUnitMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareUnitMember(ShareUnitMember source) {
        if (source.ShareMemberUin != null) {
            this.ShareMemberUin = new Long(source.ShareMemberUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShareMemberUin", this.ShareMemberUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

