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
package com.tencentcloudapi.iottid.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePermissionResponse extends AbstractModel{

    /**
    * 企业用户
    */
    @SerializedName("EnterpriseUser")
    @Expose
    private Boolean EnterpriseUser;

    /**
    * 下载控制台权限
    */
    @SerializedName("DownloadPermission")
    @Expose
    private String DownloadPermission;

    /**
    * 使用控制台权限
    */
    @SerializedName("UsePermission")
    @Expose
    private String UsePermission;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 企业用户 
     * @return EnterpriseUser 企业用户
     */
    public Boolean getEnterpriseUser() {
        return this.EnterpriseUser;
    }

    /**
     * Set 企业用户
     * @param EnterpriseUser 企业用户
     */
    public void setEnterpriseUser(Boolean EnterpriseUser) {
        this.EnterpriseUser = EnterpriseUser;
    }

    /**
     * Get 下载控制台权限 
     * @return DownloadPermission 下载控制台权限
     */
    public String getDownloadPermission() {
        return this.DownloadPermission;
    }

    /**
     * Set 下载控制台权限
     * @param DownloadPermission 下载控制台权限
     */
    public void setDownloadPermission(String DownloadPermission) {
        this.DownloadPermission = DownloadPermission;
    }

    /**
     * Get 使用控制台权限 
     * @return UsePermission 使用控制台权限
     */
    public String getUsePermission() {
        return this.UsePermission;
    }

    /**
     * Set 使用控制台权限
     * @param UsePermission 使用控制台权限
     */
    public void setUsePermission(String UsePermission) {
        this.UsePermission = UsePermission;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnterpriseUser", this.EnterpriseUser);
        this.setParamSimple(map, prefix + "DownloadPermission", this.DownloadPermission);
        this.setParamSimple(map, prefix + "UsePermission", this.UsePermission);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

