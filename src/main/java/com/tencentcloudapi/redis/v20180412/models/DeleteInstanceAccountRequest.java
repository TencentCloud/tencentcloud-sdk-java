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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInstanceAccountRequest extends AbstractModel {

    /**
    * 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 子账号名称。请登录[Redis控制台](https://console.cloud.tencent.com/redis)，切换至**账号管理**页面获取。具体信息，请参见[管理账号](https://cloud.tencent.com/document/product/239/36710)。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
     * Get 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 子账号名称。请登录[Redis控制台](https://console.cloud.tencent.com/redis)，切换至**账号管理**页面获取。具体信息，请参见[管理账号](https://cloud.tencent.com/document/product/239/36710)。 
     * @return AccountName 子账号名称。请登录[Redis控制台](https://console.cloud.tencent.com/redis)，切换至**账号管理**页面获取。具体信息，请参见[管理账号](https://cloud.tencent.com/document/product/239/36710)。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 子账号名称。请登录[Redis控制台](https://console.cloud.tencent.com/redis)，切换至**账号管理**页面获取。具体信息，请参见[管理账号](https://cloud.tencent.com/document/product/239/36710)。
     * @param AccountName 子账号名称。请登录[Redis控制台](https://console.cloud.tencent.com/redis)，切换至**账号管理**页面获取。具体信息，请参见[管理账号](https://cloud.tencent.com/document/product/239/36710)。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public DeleteInstanceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteInstanceAccountRequest(DeleteInstanceAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);

    }
}

