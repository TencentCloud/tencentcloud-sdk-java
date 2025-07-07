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

public class ModifyReserveIpAddressRequest extends AbstractModel {

    /**
    * VPC唯一 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 内网保留IP唯一ID。
    */
    @SerializedName("ReserveIpId")
    @Expose
    private String ReserveIpId;

    /**
    * 内网保留 IP名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 内网保留 IP描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get VPC唯一 ID。 
     * @return VpcId VPC唯一 ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC唯一 ID。
     * @param VpcId VPC唯一 ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 内网保留IP唯一ID。 
     * @return ReserveIpId 内网保留IP唯一ID。
     */
    public String getReserveIpId() {
        return this.ReserveIpId;
    }

    /**
     * Set 内网保留IP唯一ID。
     * @param ReserveIpId 内网保留IP唯一ID。
     */
    public void setReserveIpId(String ReserveIpId) {
        this.ReserveIpId = ReserveIpId;
    }

    /**
     * Get 内网保留 IP名称。 
     * @return Name 内网保留 IP名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 内网保留 IP名称。
     * @param Name 内网保留 IP名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 内网保留 IP描述。 
     * @return Description 内网保留 IP描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 内网保留 IP描述。
     * @param Description 内网保留 IP描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyReserveIpAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReserveIpAddressRequest(ModifyReserveIpAddressRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ReserveIpId != null) {
            this.ReserveIpId = new String(source.ReserveIpId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ReserveIpId", this.ReserveIpId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

