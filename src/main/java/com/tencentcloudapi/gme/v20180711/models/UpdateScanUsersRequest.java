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
    * 需要送检的所有用户号。多个用户号之间用","分隔。示例："0001,0002,0003"
    */
    @SerializedName("UserIdString")
    @Expose
    private String UserIdString;

    /**
    * 符合此正则表达式规则的用户号将被送检。示例：["^6.*"] 表示所有以6开头的用户号将被送检
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
     * Get 需要送检的所有用户号。多个用户号之间用","分隔。示例："0001,0002,0003" 
     * @return UserIdString 需要送检的所有用户号。多个用户号之间用","分隔。示例："0001,0002,0003"
     */
    public String getUserIdString() {
        return this.UserIdString;
    }

    /**
     * Set 需要送检的所有用户号。多个用户号之间用","分隔。示例："0001,0002,0003"
     * @param UserIdString 需要送检的所有用户号。多个用户号之间用","分隔。示例："0001,0002,0003"
     */
    public void setUserIdString(String UserIdString) {
        this.UserIdString = UserIdString;
    }

    /**
     * Get 符合此正则表达式规则的用户号将被送检。示例：["^6.*"] 表示所有以6开头的用户号将被送检 
     * @return UserIdRegex 符合此正则表达式规则的用户号将被送检。示例：["^6.*"] 表示所有以6开头的用户号将被送检
     */
    public String [] getUserIdRegex() {
        return this.UserIdRegex;
    }

    /**
     * Set 符合此正则表达式规则的用户号将被送检。示例：["^6.*"] 表示所有以6开头的用户号将被送检
     * @param UserIdRegex 符合此正则表达式规则的用户号将被送检。示例：["^6.*"] 表示所有以6开头的用户号将被送检
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

