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

public class CreateSecurityGroupMappingRequest extends AbstractModel {

    /**
    * 生产端实例绑定的安全组ID
    */
    @SerializedName("SrcSecurityGroupId")
    @Expose
    private String SrcSecurityGroupId;

    /**
    * 容灾端实例绑定的安全组ID
    */
    @SerializedName("TargetSecurityGroupId")
    @Expose
    private String TargetSecurityGroupId;

    /**
    * 安全组映射所属的站点对ID。
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
     * Get 生产端实例绑定的安全组ID 
     * @return SrcSecurityGroupId 生产端实例绑定的安全组ID
     */
    public String getSrcSecurityGroupId() {
        return this.SrcSecurityGroupId;
    }

    /**
     * Set 生产端实例绑定的安全组ID
     * @param SrcSecurityGroupId 生产端实例绑定的安全组ID
     */
    public void setSrcSecurityGroupId(String SrcSecurityGroupId) {
        this.SrcSecurityGroupId = SrcSecurityGroupId;
    }

    /**
     * Get 容灾端实例绑定的安全组ID 
     * @return TargetSecurityGroupId 容灾端实例绑定的安全组ID
     */
    public String getTargetSecurityGroupId() {
        return this.TargetSecurityGroupId;
    }

    /**
     * Set 容灾端实例绑定的安全组ID
     * @param TargetSecurityGroupId 容灾端实例绑定的安全组ID
     */
    public void setTargetSecurityGroupId(String TargetSecurityGroupId) {
        this.TargetSecurityGroupId = TargetSecurityGroupId;
    }

    /**
     * Get 安全组映射所属的站点对ID。 
     * @return SitePairId 安全组映射所属的站点对ID。
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 安全组映射所属的站点对ID。
     * @param SitePairId 安全组映射所属的站点对ID。
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    public CreateSecurityGroupMappingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityGroupMappingRequest(CreateSecurityGroupMappingRequest source) {
        if (source.SrcSecurityGroupId != null) {
            this.SrcSecurityGroupId = new String(source.SrcSecurityGroupId);
        }
        if (source.TargetSecurityGroupId != null) {
            this.TargetSecurityGroupId = new String(source.TargetSecurityGroupId);
        }
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcSecurityGroupId", this.SrcSecurityGroupId);
        this.setParamSimple(map, prefix + "TargetSecurityGroupId", this.TargetSecurityGroupId);
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);

    }
}

