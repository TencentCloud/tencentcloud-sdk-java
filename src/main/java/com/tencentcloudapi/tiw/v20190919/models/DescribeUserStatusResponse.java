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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserStatusResponse extends AbstractModel{

    /**
    * 客户的AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 是否开通过白板（试用或正式）

0: 从未开通过白板服务
1: 已经开通过白板服务
    */
    @SerializedName("IsTiwUser")
    @Expose
    private Long IsTiwUser;

    /**
    * 是否开通过互动课堂（试用或正式）
    */
    @SerializedName("IsSaaSUser")
    @Expose
    private Long IsSaaSUser;

    /**
    * 是否使用白板的课后录制
    */
    @SerializedName("IsTiwOfflineRecordUser")
    @Expose
    private Long IsTiwOfflineRecordUser;

    /**
    * 用户是否实名认证
    */
    @SerializedName("IsAuthenticated")
    @Expose
    private Long IsAuthenticated;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 客户的AppId 
     * @return AppId 客户的AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 客户的AppId
     * @param AppId 客户的AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 是否开通过白板（试用或正式）

0: 从未开通过白板服务
1: 已经开通过白板服务 
     * @return IsTiwUser 是否开通过白板（试用或正式）

0: 从未开通过白板服务
1: 已经开通过白板服务
     */
    public Long getIsTiwUser() {
        return this.IsTiwUser;
    }

    /**
     * Set 是否开通过白板（试用或正式）

0: 从未开通过白板服务
1: 已经开通过白板服务
     * @param IsTiwUser 是否开通过白板（试用或正式）

0: 从未开通过白板服务
1: 已经开通过白板服务
     */
    public void setIsTiwUser(Long IsTiwUser) {
        this.IsTiwUser = IsTiwUser;
    }

    /**
     * Get 是否开通过互动课堂（试用或正式） 
     * @return IsSaaSUser 是否开通过互动课堂（试用或正式）
     */
    public Long getIsSaaSUser() {
        return this.IsSaaSUser;
    }

    /**
     * Set 是否开通过互动课堂（试用或正式）
     * @param IsSaaSUser 是否开通过互动课堂（试用或正式）
     */
    public void setIsSaaSUser(Long IsSaaSUser) {
        this.IsSaaSUser = IsSaaSUser;
    }

    /**
     * Get 是否使用白板的课后录制 
     * @return IsTiwOfflineRecordUser 是否使用白板的课后录制
     */
    public Long getIsTiwOfflineRecordUser() {
        return this.IsTiwOfflineRecordUser;
    }

    /**
     * Set 是否使用白板的课后录制
     * @param IsTiwOfflineRecordUser 是否使用白板的课后录制
     */
    public void setIsTiwOfflineRecordUser(Long IsTiwOfflineRecordUser) {
        this.IsTiwOfflineRecordUser = IsTiwOfflineRecordUser;
    }

    /**
     * Get 用户是否实名认证 
     * @return IsAuthenticated 用户是否实名认证
     */
    public Long getIsAuthenticated() {
        return this.IsAuthenticated;
    }

    /**
     * Set 用户是否实名认证
     * @param IsAuthenticated 用户是否实名认证
     */
    public void setIsAuthenticated(Long IsAuthenticated) {
        this.IsAuthenticated = IsAuthenticated;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeUserStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserStatusResponse(DescribeUserStatusResponse source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.IsTiwUser != null) {
            this.IsTiwUser = new Long(source.IsTiwUser);
        }
        if (source.IsSaaSUser != null) {
            this.IsSaaSUser = new Long(source.IsSaaSUser);
        }
        if (source.IsTiwOfflineRecordUser != null) {
            this.IsTiwOfflineRecordUser = new Long(source.IsTiwOfflineRecordUser);
        }
        if (source.IsAuthenticated != null) {
            this.IsAuthenticated = new Long(source.IsAuthenticated);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IsTiwUser", this.IsTiwUser);
        this.setParamSimple(map, prefix + "IsSaaSUser", this.IsSaaSUser);
        this.setParamSimple(map, prefix + "IsTiwOfflineRecordUser", this.IsTiwOfflineRecordUser);
        this.setParamSimple(map, prefix + "IsAuthenticated", this.IsAuthenticated);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

