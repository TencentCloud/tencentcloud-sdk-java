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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkAclEntriesRequest extends AbstractModel {

    /**
    * 网络ACL实例ID。例如：acl-12345678。
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * 网络ACL规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。
    */
    @SerializedName("NetworkAclEntrySet")
    @Expose
    private NetworkAclEntrySet NetworkAclEntrySet;

    /**
    * 网络ACL五元组规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。
    */
    @SerializedName("NetworkAclQuintupleSet")
    @Expose
    private NetworkAclQuintupleEntries NetworkAclQuintupleSet;

    /**
    * 三元组的增量更新。该接口的默认语义为全量覆盖。当需要实现增量更新语义时，设置该参数为True。
    */
    @SerializedName("EnableUpdateAclEntries")
    @Expose
    private Boolean EnableUpdateAclEntries;

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
     * Get 网络ACL规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。 
     * @return NetworkAclEntrySet 网络ACL规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。
     */
    public NetworkAclEntrySet getNetworkAclEntrySet() {
        return this.NetworkAclEntrySet;
    }

    /**
     * Set 网络ACL规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。
     * @param NetworkAclEntrySet 网络ACL规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。
     */
    public void setNetworkAclEntrySet(NetworkAclEntrySet NetworkAclEntrySet) {
        this.NetworkAclEntrySet = NetworkAclEntrySet;
    }

    /**
     * Get 网络ACL五元组规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。 
     * @return NetworkAclQuintupleSet 网络ACL五元组规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。
     */
    public NetworkAclQuintupleEntries getNetworkAclQuintupleSet() {
        return this.NetworkAclQuintupleSet;
    }

    /**
     * Set 网络ACL五元组规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。
     * @param NetworkAclQuintupleSet 网络ACL五元组规则集。NetworkAclEntrySet和NetworkAclQuintupleSet只能输入一个。
     */
    public void setNetworkAclQuintupleSet(NetworkAclQuintupleEntries NetworkAclQuintupleSet) {
        this.NetworkAclQuintupleSet = NetworkAclQuintupleSet;
    }

    /**
     * Get 三元组的增量更新。该接口的默认语义为全量覆盖。当需要实现增量更新语义时，设置该参数为True。 
     * @return EnableUpdateAclEntries 三元组的增量更新。该接口的默认语义为全量覆盖。当需要实现增量更新语义时，设置该参数为True。
     */
    public Boolean getEnableUpdateAclEntries() {
        return this.EnableUpdateAclEntries;
    }

    /**
     * Set 三元组的增量更新。该接口的默认语义为全量覆盖。当需要实现增量更新语义时，设置该参数为True。
     * @param EnableUpdateAclEntries 三元组的增量更新。该接口的默认语义为全量覆盖。当需要实现增量更新语义时，设置该参数为True。
     */
    public void setEnableUpdateAclEntries(Boolean EnableUpdateAclEntries) {
        this.EnableUpdateAclEntries = EnableUpdateAclEntries;
    }

    public ModifyNetworkAclEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkAclEntriesRequest(ModifyNetworkAclEntriesRequest source) {
        if (source.NetworkAclId != null) {
            this.NetworkAclId = new String(source.NetworkAclId);
        }
        if (source.NetworkAclEntrySet != null) {
            this.NetworkAclEntrySet = new NetworkAclEntrySet(source.NetworkAclEntrySet);
        }
        if (source.NetworkAclQuintupleSet != null) {
            this.NetworkAclQuintupleSet = new NetworkAclQuintupleEntries(source.NetworkAclQuintupleSet);
        }
        if (source.EnableUpdateAclEntries != null) {
            this.EnableUpdateAclEntries = new Boolean(source.EnableUpdateAclEntries);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamObj(map, prefix + "NetworkAclEntrySet.", this.NetworkAclEntrySet);
        this.setParamObj(map, prefix + "NetworkAclQuintupleSet.", this.NetworkAclQuintupleSet);
        this.setParamSimple(map, prefix + "EnableUpdateAclEntries", this.EnableUpdateAclEntries);

    }
}

