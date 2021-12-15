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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccountGroupRequest extends AbstractModel{

    /**
    * 账号组ID数组。
    */
    @SerializedName("AccountGroupIdList")
    @Expose
    private String [] AccountGroupIdList;

    /**
     * Get 账号组ID数组。 
     * @return AccountGroupIdList 账号组ID数组。
     */
    public String [] getAccountGroupIdList() {
        return this.AccountGroupIdList;
    }

    /**
     * Set 账号组ID数组。
     * @param AccountGroupIdList 账号组ID数组。
     */
    public void setAccountGroupIdList(String [] AccountGroupIdList) {
        this.AccountGroupIdList = AccountGroupIdList;
    }

    public DeleteAccountGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccountGroupRequest(DeleteAccountGroupRequest source) {
        if (source.AccountGroupIdList != null) {
            this.AccountGroupIdList = new String[source.AccountGroupIdList.length];
            for (int i = 0; i < source.AccountGroupIdList.length; i++) {
                this.AccountGroupIdList[i] = new String(source.AccountGroupIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AccountGroupIdList.", this.AccountGroupIdList);

    }
}

