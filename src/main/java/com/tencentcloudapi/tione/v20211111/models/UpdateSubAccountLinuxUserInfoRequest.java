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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSubAccountLinuxUserInfoRequest extends AbstractModel {

    /**
    * 子账号信息列表
    */
    @SerializedName("SubAccountList")
    @Expose
    private SubAccountInfo [] SubAccountList;

    /**
     * Get 子账号信息列表 
     * @return SubAccountList 子账号信息列表
     */
    public SubAccountInfo [] getSubAccountList() {
        return this.SubAccountList;
    }

    /**
     * Set 子账号信息列表
     * @param SubAccountList 子账号信息列表
     */
    public void setSubAccountList(SubAccountInfo [] SubAccountList) {
        this.SubAccountList = SubAccountList;
    }

    public UpdateSubAccountLinuxUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSubAccountLinuxUserInfoRequest(UpdateSubAccountLinuxUserInfoRequest source) {
        if (source.SubAccountList != null) {
            this.SubAccountList = new SubAccountInfo[source.SubAccountList.length];
            for (int i = 0; i < source.SubAccountList.length; i++) {
                this.SubAccountList[i] = new SubAccountInfo(source.SubAccountList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SubAccountList.", this.SubAccountList);

    }
}

