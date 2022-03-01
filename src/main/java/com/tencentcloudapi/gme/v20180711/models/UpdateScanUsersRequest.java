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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateScanUsersRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 字符串用户号，逗号分隔
    */
    @SerializedName("UserIdString")
    @Expose
    private String UserIdString;

    /**
    * 正则表达式用户号，["^6.*"]6开头的用户号
    */
    @SerializedName("UserIdRegex")
    @Expose
    private String [] UserIdRegex;

    /**
     * Get 应用ID 
     * @return BizId 应用ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID
     * @param BizId 应用ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 字符串用户号，逗号分隔 
     * @return UserIdString 字符串用户号，逗号分隔
     */
    public String getUserIdString() {
        return this.UserIdString;
    }

    /**
     * Set 字符串用户号，逗号分隔
     * @param UserIdString 字符串用户号，逗号分隔
     */
    public void setUserIdString(String UserIdString) {
        this.UserIdString = UserIdString;
    }

    /**
     * Get 正则表达式用户号，["^6.*"]6开头的用户号 
     * @return UserIdRegex 正则表达式用户号，["^6.*"]6开头的用户号
     */
    public String [] getUserIdRegex() {
        return this.UserIdRegex;
    }

    /**
     * Set 正则表达式用户号，["^6.*"]6开头的用户号
     * @param UserIdRegex 正则表达式用户号，["^6.*"]6开头的用户号
     */
    public void setUserIdRegex(String [] UserIdRegex) {
        this.UserIdRegex = UserIdRegex;
    }

    public UpdateScanUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateScanUsersRequest(UpdateScanUsersRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.UserIdString != null) {
            this.UserIdString = new String(source.UserIdString);
        }
        if (source.UserIdRegex != null) {
            this.UserIdRegex = new String[source.UserIdRegex.length];
            for (int i = 0; i < source.UserIdRegex.length; i++) {
                this.UserIdRegex[i] = new String(source.UserIdRegex[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "UserIdString", this.UserIdString);
        this.setParamArraySimple(map, prefix + "UserIdRegex.", this.UserIdRegex);

    }
}

