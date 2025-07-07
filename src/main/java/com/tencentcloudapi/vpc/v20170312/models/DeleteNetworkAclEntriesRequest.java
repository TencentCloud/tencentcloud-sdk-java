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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNetworkAclEntriesRequest extends AbstractModel {

    /**
    * 三元组网络ACL实例ID。例如：acl-12345678。
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * 三元组网络ACL规则集。
    */
    @SerializedName("NetworkAclEntrySet")
    @Expose
    private NetworkAclEntrySet NetworkAclEntrySet;

    /**
     * Get 三元组网络ACL实例ID。例如：acl-12345678。 
     * @return NetworkAclId 三元组网络ACL实例ID。例如：acl-12345678。
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set 三元组网络ACL实例ID。例如：acl-12345678。
     * @param NetworkAclId 三元组网络ACL实例ID。例如：acl-12345678。
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get 三元组网络ACL规则集。 
     * @return NetworkAclEntrySet 三元组网络ACL规则集。
     */
    public NetworkAclEntrySet getNetworkAclEntrySet() {
        return this.NetworkAclEntrySet;
    }

    /**
     * Set 三元组网络ACL规则集。
     * @param NetworkAclEntrySet 三元组网络ACL规则集。
     */
    public void setNetworkAclEntrySet(NetworkAclEntrySet NetworkAclEntrySet) {
        this.NetworkAclEntrySet = NetworkAclEntrySet;
    }

    public DeleteNetworkAclEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNetworkAclEntriesRequest(DeleteNetworkAclEntriesRequest source) {
        if (source.NetworkAclId != null) {
            this.NetworkAclId = new String(source.NetworkAclId);
        }
        if (source.NetworkAclEntrySet != null) {
            this.NetworkAclEntrySet = new NetworkAclEntrySet(source.NetworkAclEntrySet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamObj(map, prefix + "NetworkAclEntrySet.", this.NetworkAclEntrySet);

    }
}

