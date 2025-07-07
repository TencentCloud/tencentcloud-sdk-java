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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupStatisticsInfo extends AbstractModel {

    /**
    * 通道组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 通道组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 通道组下通道列表
    */
    @SerializedName("ProxySet")
    @Expose
    private ProxySimpleInfo [] ProxySet;

    /**
     * Get 通道组ID 
     * @return GroupId 通道组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组ID
     * @param GroupId 通道组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 通道组名称 
     * @return GroupName 通道组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 通道组名称
     * @param GroupName 通道组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 通道组下通道列表 
     * @return ProxySet 通道组下通道列表
     */
    public ProxySimpleInfo [] getProxySet() {
        return this.ProxySet;
    }

    /**
     * Set 通道组下通道列表
     * @param ProxySet 通道组下通道列表
     */
    public void setProxySet(ProxySimpleInfo [] ProxySet) {
        this.ProxySet = ProxySet;
    }

    public GroupStatisticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupStatisticsInfo(GroupStatisticsInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ProxySet != null) {
            this.ProxySet = new ProxySimpleInfo[source.ProxySet.length];
            for (int i = 0; i < source.ProxySet.length; i++) {
                this.ProxySet[i] = new ProxySimpleInfo(source.ProxySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "ProxySet.", this.ProxySet);

    }
}

