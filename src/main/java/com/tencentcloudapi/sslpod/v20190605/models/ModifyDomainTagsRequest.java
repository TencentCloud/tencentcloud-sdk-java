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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainTagsRequest extends AbstractModel{

    /**
    * 账号下域名ID
    */
    @SerializedName("AccountDomainId")
    @Expose
    private Long AccountDomainId;

    /**
    * 更新后的tag，多个以逗号隔开
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
     * Get 账号下域名ID 
     * @return AccountDomainId 账号下域名ID
     */
    public Long getAccountDomainId() {
        return this.AccountDomainId;
    }

    /**
     * Set 账号下域名ID
     * @param AccountDomainId 账号下域名ID
     */
    public void setAccountDomainId(Long AccountDomainId) {
        this.AccountDomainId = AccountDomainId;
    }

    /**
     * Get 更新后的tag，多个以逗号隔开 
     * @return Tags 更新后的tag，多个以逗号隔开
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 更新后的tag，多个以逗号隔开
     * @param Tags 更新后的tag，多个以逗号隔开
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountDomainId", this.AccountDomainId);
        this.setParamSimple(map, prefix + "Tags", this.Tags);

    }
}

