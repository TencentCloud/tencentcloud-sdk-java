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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountResponse  extends AbstractModel{

    /**
    * 实例Id，透传入参。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名，透传入参。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 允许访问的 host，透传入参。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 透传入参。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Integer ReadOnly;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取实例Id，透传入参。
     * @return InstanceId 实例Id，透传入参。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例Id，透传入参。
     * @param InstanceId 实例Id，透传入参。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取用户名，透传入参。
     * @return UserName 用户名，透传入参。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置用户名，透传入参。
     * @param UserName 用户名，透传入参。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取允许访问的 host，透传入参。
     * @return Host 允许访问的 host，透传入参。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * 设置允许访问的 host，透传入参。
     * @param Host 允许访问的 host，透传入参。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * 获取透传入参。
     * @return ReadOnly 透传入参。
     */
    public Integer getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * 设置透传入参。
     * @param ReadOnly 透传入参。
     */
    public void setReadOnly(Integer ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

