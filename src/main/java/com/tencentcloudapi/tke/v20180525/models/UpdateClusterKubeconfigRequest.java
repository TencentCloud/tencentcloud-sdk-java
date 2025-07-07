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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateClusterKubeconfigRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 子账户Uin列表，传空默认为调用此接口的SubUin
    */
    @SerializedName("SubAccounts")
    @Expose
    private String [] SubAccounts;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 子账户Uin列表，传空默认为调用此接口的SubUin 
     * @return SubAccounts 子账户Uin列表，传空默认为调用此接口的SubUin
     */
    public String [] getSubAccounts() {
        return this.SubAccounts;
    }

    /**
     * Set 子账户Uin列表，传空默认为调用此接口的SubUin
     * @param SubAccounts 子账户Uin列表，传空默认为调用此接口的SubUin
     */
    public void setSubAccounts(String [] SubAccounts) {
        this.SubAccounts = SubAccounts;
    }

    public UpdateClusterKubeconfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateClusterKubeconfigRequest(UpdateClusterKubeconfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SubAccounts != null) {
            this.SubAccounts = new String[source.SubAccounts.length];
            for (int i = 0; i < source.SubAccounts.length; i++) {
                this.SubAccounts[i] = new String(source.SubAccounts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "SubAccounts.", this.SubAccounts);

    }
}

