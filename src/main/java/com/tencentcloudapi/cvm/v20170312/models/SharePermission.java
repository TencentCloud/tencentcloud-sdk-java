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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharePermission extends AbstractModel {

    /**
    * 镜像分享时间。
按照 ISO8601 标准表示，并且使用 UTC 时间，格式为：YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 镜像分享的账户ID
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * Get 镜像分享时间。
按照 ISO8601 标准表示，并且使用 UTC 时间，格式为：YYYY-MM-DDThh:mm:ssZ。 
     * @return CreatedTime 镜像分享时间。
按照 ISO8601 标准表示，并且使用 UTC 时间，格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 镜像分享时间。
按照 ISO8601 标准表示，并且使用 UTC 时间，格式为：YYYY-MM-DDThh:mm:ssZ。
     * @param CreatedTime 镜像分享时间。
按照 ISO8601 标准表示，并且使用 UTC 时间，格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 镜像分享的账户ID 
     * @return AccountId 镜像分享的账户ID
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 镜像分享的账户ID
     * @param AccountId 镜像分享的账户ID
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public SharePermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharePermission(SharePermission source) {
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);

    }
}

