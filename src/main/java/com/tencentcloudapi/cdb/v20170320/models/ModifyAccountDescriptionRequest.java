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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountDescriptionRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云数据库账号。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * 数据库账号的备注信息。最多支持输入255个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云数据库账号。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。 
     * @return Accounts 云数据库账号。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set 云数据库账号。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
     * @param Accounts 云数据库账号。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get 数据库账号的备注信息。最多支持输入255个字符。 
     * @return Description 数据库账号的备注信息。最多支持输入255个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据库账号的备注信息。最多支持输入255个字符。
     * @param Description 数据库账号的备注信息。最多支持输入255个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyAccountDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountDescriptionRequest(ModifyAccountDescriptionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Accounts != null) {
            this.Accounts = new Account[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new Account(source.Accounts[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

