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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecurityGroupMappingRequest extends AbstractModel {

    /**
    * 要删除安全组映射所属的站点对ID
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 要删除的安全组映射ID列表
    */
    @SerializedName("SecurityGroupMappingIds")
    @Expose
    private String [] SecurityGroupMappingIds;

    /**
     * Get 要删除安全组映射所属的站点对ID 
     * @return SitePairId 要删除安全组映射所属的站点对ID
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 要删除安全组映射所属的站点对ID
     * @param SitePairId 要删除安全组映射所属的站点对ID
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 要删除的安全组映射ID列表 
     * @return SecurityGroupMappingIds 要删除的安全组映射ID列表
     */
    public String [] getSecurityGroupMappingIds() {
        return this.SecurityGroupMappingIds;
    }

    /**
     * Set 要删除的安全组映射ID列表
     * @param SecurityGroupMappingIds 要删除的安全组映射ID列表
     */
    public void setSecurityGroupMappingIds(String [] SecurityGroupMappingIds) {
        this.SecurityGroupMappingIds = SecurityGroupMappingIds;
    }

    public DeleteSecurityGroupMappingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecurityGroupMappingRequest(DeleteSecurityGroupMappingRequest source) {
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.SecurityGroupMappingIds != null) {
            this.SecurityGroupMappingIds = new String[source.SecurityGroupMappingIds.length];
            for (int i = 0; i < source.SecurityGroupMappingIds.length; i++) {
                this.SecurityGroupMappingIds[i] = new String(source.SecurityGroupMappingIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamArraySimple(map, prefix + "SecurityGroupMappingIds.", this.SecurityGroupMappingIds);

    }
}

