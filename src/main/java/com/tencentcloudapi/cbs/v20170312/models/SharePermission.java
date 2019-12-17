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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharePermission extends AbstractModel{

    /**
    * 快照分享的时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 分享的账号Id
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * Get 快照分享的时间 
     * @return CreatedTime 快照分享的时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 快照分享的时间
     * @param CreatedTime 快照分享的时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 分享的账号Id 
     * @return AccountId 分享的账号Id
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 分享的账号Id
     * @param AccountId 分享的账号Id
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);

    }
}

