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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteScanUserRequest extends AbstractModel {

    /**
    * 应用ID，登录控制台 - 服务管理创建应用得到的AppID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 需要删除送检的用户号。示例：1234
(若UserId不填，则UserIdString必填；两者选其一；两者都填以UserIdString为准)
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 需要删除送检的用户号，长度不超过1024字符。示例："1234"(若UserIdString不填，则UserId必填；两者选其一；两者都填以UserIdString为准)
    */
    @SerializedName("UserIdString")
    @Expose
    private String UserIdString;

    /**
     * Get 应用ID，登录控制台 - 服务管理创建应用得到的AppID 
     * @return BizId 应用ID，登录控制台 - 服务管理创建应用得到的AppID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID，登录控制台 - 服务管理创建应用得到的AppID
     * @param BizId 应用ID，登录控制台 - 服务管理创建应用得到的AppID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 需要删除送检的用户号。示例：1234
(若UserId不填，则UserIdString必填；两者选其一；两者都填以UserIdString为准) 
     * @return UserId 需要删除送检的用户号。示例：1234
(若UserId不填，则UserIdString必填；两者选其一；两者都填以UserIdString为准)
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 需要删除送检的用户号。示例：1234
(若UserId不填，则UserIdString必填；两者选其一；两者都填以UserIdString为准)
     * @param UserId 需要删除送检的用户号。示例：1234
(若UserId不填，则UserIdString必填；两者选其一；两者都填以UserIdString为准)
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 需要删除送检的用户号，长度不超过1024字符。示例："1234"(若UserIdString不填，则UserId必填；两者选其一；两者都填以UserIdString为准) 
     * @return UserIdString 需要删除送检的用户号，长度不超过1024字符。示例："1234"(若UserIdString不填，则UserId必填；两者选其一；两者都填以UserIdString为准)
     */
    public String getUserIdString() {
        return this.UserIdString;
    }

    /**
     * Set 需要删除送检的用户号，长度不超过1024字符。示例："1234"(若UserIdString不填，则UserId必填；两者选其一；两者都填以UserIdString为准)
     * @param UserIdString 需要删除送检的用户号，长度不超过1024字符。示例："1234"(若UserIdString不填，则UserId必填；两者选其一；两者都填以UserIdString为准)
     */
    public void setUserIdString(String UserIdString) {
        this.UserIdString = UserIdString;
    }

    public DeleteScanUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScanUserRequest(DeleteScanUserRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.UserIdString != null) {
            this.UserIdString = new String(source.UserIdString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserIdString", this.UserIdString);

    }
}

