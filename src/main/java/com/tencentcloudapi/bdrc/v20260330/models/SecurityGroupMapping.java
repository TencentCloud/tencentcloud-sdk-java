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

public class SecurityGroupMapping extends AbstractModel {

    /**
    * 安全组映射ID
    */
    @SerializedName("SecurityGroupMappingId")
    @Expose
    private String SecurityGroupMappingId;

    /**
    * 安全组映射所属的站点对ID
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 生产端安全组ID
    */
    @SerializedName("SourceSecurityGroupId")
    @Expose
    private String SourceSecurityGroupId;

    /**
    * 容灾端安全组ID
    */
    @SerializedName("TargetSecurityGroupId")
    @Expose
    private String TargetSecurityGroupId;

    /**
    * 安全组映射的生命状态；NORMAL:正常。
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
     * Get 安全组映射ID 
     * @return SecurityGroupMappingId 安全组映射ID
     */
    public String getSecurityGroupMappingId() {
        return this.SecurityGroupMappingId;
    }

    /**
     * Set 安全组映射ID
     * @param SecurityGroupMappingId 安全组映射ID
     */
    public void setSecurityGroupMappingId(String SecurityGroupMappingId) {
        this.SecurityGroupMappingId = SecurityGroupMappingId;
    }

    /**
     * Get 安全组映射所属的站点对ID 
     * @return SitePairId 安全组映射所属的站点对ID
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 安全组映射所属的站点对ID
     * @param SitePairId 安全组映射所属的站点对ID
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 生产端安全组ID 
     * @return SourceSecurityGroupId 生产端安全组ID
     */
    public String getSourceSecurityGroupId() {
        return this.SourceSecurityGroupId;
    }

    /**
     * Set 生产端安全组ID
     * @param SourceSecurityGroupId 生产端安全组ID
     */
    public void setSourceSecurityGroupId(String SourceSecurityGroupId) {
        this.SourceSecurityGroupId = SourceSecurityGroupId;
    }

    /**
     * Get 容灾端安全组ID 
     * @return TargetSecurityGroupId 容灾端安全组ID
     */
    public String getTargetSecurityGroupId() {
        return this.TargetSecurityGroupId;
    }

    /**
     * Set 容灾端安全组ID
     * @param TargetSecurityGroupId 容灾端安全组ID
     */
    public void setTargetSecurityGroupId(String TargetSecurityGroupId) {
        this.TargetSecurityGroupId = TargetSecurityGroupId;
    }

    /**
     * Get 安全组映射的生命状态；NORMAL:正常。 
     * @return LifeState 安全组映射的生命状态；NORMAL:正常。
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 安全组映射的生命状态；NORMAL:正常。
     * @param LifeState 安全组映射的生命状态；NORMAL:正常。
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    public SecurityGroupMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupMapping(SecurityGroupMapping source) {
        if (source.SecurityGroupMappingId != null) {
            this.SecurityGroupMappingId = new String(source.SecurityGroupMappingId);
        }
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.SourceSecurityGroupId != null) {
            this.SourceSecurityGroupId = new String(source.SourceSecurityGroupId);
        }
        if (source.TargetSecurityGroupId != null) {
            this.TargetSecurityGroupId = new String(source.TargetSecurityGroupId);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupMappingId", this.SecurityGroupMappingId);
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamSimple(map, prefix + "SourceSecurityGroupId", this.SourceSecurityGroupId);
        this.setParamSimple(map, prefix + "TargetSecurityGroupId", this.TargetSecurityGroupId);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);

    }
}

