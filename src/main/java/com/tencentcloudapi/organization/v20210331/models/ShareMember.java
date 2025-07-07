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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareMember extends AbstractModel {

    /**
    * 共享成员Uin。
    */
    @SerializedName("ShareMemberUin")
    @Expose
    private Long ShareMemberUin;

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

    public ShareMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareMember(ShareMember source) {
        if (source.ShareMemberUin != null) {
            this.ShareMemberUin = new Long(source.ShareMemberUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShareMemberUin", this.ShareMemberUin);

    }
}

