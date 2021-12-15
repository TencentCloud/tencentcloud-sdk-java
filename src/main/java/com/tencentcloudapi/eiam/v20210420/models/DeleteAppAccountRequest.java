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

public class DeleteAppAccountRequest extends AbstractModel{

    /**
    * 账号ID数组。
    */
    @SerializedName("AccountIdList")
    @Expose
    private String [] AccountIdList;

    /**
     * Get 账号ID数组。 
     * @return AccountIdList 账号ID数组。
     */
    public String [] getAccountIdList() {
        return this.AccountIdList;
    }

    /**
     * Set 账号ID数组。
     * @param AccountIdList 账号ID数组。
     */
    public void setAccountIdList(String [] AccountIdList) {
        this.AccountIdList = AccountIdList;
    }

    public DeleteAppAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAppAccountRequest(DeleteAppAccountRequest source) {
        if (source.AccountIdList != null) {
            this.AccountIdList = new String[source.AccountIdList.length];
            for (int i = 0; i < source.AccountIdList.length; i++) {
                this.AccountIdList[i] = new String(source.AccountIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AccountIdList.", this.AccountIdList);

    }
}

