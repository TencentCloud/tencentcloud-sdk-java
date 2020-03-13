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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkAclAttributeRequest extends AbstractModel{

    /**
    * 网络ACL实例ID。例如：acl-12345678。
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * 网络ACL名称，最大长度不能超过60个字节。
    */
    @SerializedName("NetworkAclName")
    @Expose
    private String NetworkAclName;

    /**
     * Get 网络ACL实例ID。例如：acl-12345678。 
     * @return NetworkAclId 网络ACL实例ID。例如：acl-12345678。
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set 网络ACL实例ID。例如：acl-12345678。
     * @param NetworkAclId 网络ACL实例ID。例如：acl-12345678。
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get 网络ACL名称，最大长度不能超过60个字节。 
     * @return NetworkAclName 网络ACL名称，最大长度不能超过60个字节。
     */
    public String getNetworkAclName() {
        return this.NetworkAclName;
    }

    /**
     * Set 网络ACL名称，最大长度不能超过60个字节。
     * @param NetworkAclName 网络ACL名称，最大长度不能超过60个字节。
     */
    public void setNetworkAclName(String NetworkAclName) {
        this.NetworkAclName = NetworkAclName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamSimple(map, prefix + "NetworkAclName", this.NetworkAclName);

    }
}

