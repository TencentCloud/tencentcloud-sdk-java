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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterCommonNamesRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 子账户列表，不可超出最大值50
    */
    @SerializedName("SubaccountUins")
    @Expose
    private String [] SubaccountUins;

    /**
    * 角色ID列表，不可超出最大值50
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

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
     * Get 子账户列表，不可超出最大值50 
     * @return SubaccountUins 子账户列表，不可超出最大值50
     */
    public String [] getSubaccountUins() {
        return this.SubaccountUins;
    }

    /**
     * Set 子账户列表，不可超出最大值50
     * @param SubaccountUins 子账户列表，不可超出最大值50
     */
    public void setSubaccountUins(String [] SubaccountUins) {
        this.SubaccountUins = SubaccountUins;
    }

    /**
     * Get 角色ID列表，不可超出最大值50 
     * @return RoleIds 角色ID列表，不可超出最大值50
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set 角色ID列表，不可超出最大值50
     * @param RoleIds 角色ID列表，不可超出最大值50
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    public DescribeClusterCommonNamesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterCommonNamesRequest(DescribeClusterCommonNamesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SubaccountUins != null) {
            this.SubaccountUins = new String[source.SubaccountUins.length];
            for (int i = 0; i < source.SubaccountUins.length; i++) {
                this.SubaccountUins[i] = new String(source.SubaccountUins[i]);
            }
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "SubaccountUins.", this.SubaccountUins);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);

    }
}

