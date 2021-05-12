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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGroupDomainConfigRequest extends AbstractModel{

    /**
    * 通道组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 域名解析默认访问IP或域名。
    */
    @SerializedName("DefaultDnsIp")
    @Expose
    private String DefaultDnsIp;

    /**
    * 就近接入区域配置。
    */
    @SerializedName("AccessRegionList")
    @Expose
    private AccessRegionDomainConf [] AccessRegionList;

    /**
     * Get 通道组ID。 
     * @return GroupId 通道组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组ID。
     * @param GroupId 通道组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 域名解析默认访问IP或域名。 
     * @return DefaultDnsIp 域名解析默认访问IP或域名。
     */
    public String getDefaultDnsIp() {
        return this.DefaultDnsIp;
    }

    /**
     * Set 域名解析默认访问IP或域名。
     * @param DefaultDnsIp 域名解析默认访问IP或域名。
     */
    public void setDefaultDnsIp(String DefaultDnsIp) {
        this.DefaultDnsIp = DefaultDnsIp;
    }

    /**
     * Get 就近接入区域配置。 
     * @return AccessRegionList 就近接入区域配置。
     */
    public AccessRegionDomainConf [] getAccessRegionList() {
        return this.AccessRegionList;
    }

    /**
     * Set 就近接入区域配置。
     * @param AccessRegionList 就近接入区域配置。
     */
    public void setAccessRegionList(AccessRegionDomainConf [] AccessRegionList) {
        this.AccessRegionList = AccessRegionList;
    }

    public ModifyGroupDomainConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGroupDomainConfigRequest(ModifyGroupDomainConfigRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.DefaultDnsIp != null) {
            this.DefaultDnsIp = new String(source.DefaultDnsIp);
        }
        if (source.AccessRegionList != null) {
            this.AccessRegionList = new AccessRegionDomainConf[source.AccessRegionList.length];
            for (int i = 0; i < source.AccessRegionList.length; i++) {
                this.AccessRegionList[i] = new AccessRegionDomainConf(source.AccessRegionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DefaultDnsIp", this.DefaultDnsIp);
        this.setParamArrayObj(map, prefix + "AccessRegionList.", this.AccessRegionList);

    }
}

