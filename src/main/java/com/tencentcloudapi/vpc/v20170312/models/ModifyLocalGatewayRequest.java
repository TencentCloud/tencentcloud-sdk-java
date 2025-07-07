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

public class ModifyLocalGatewayRequest extends AbstractModel {

    /**
    * 本地网关名称。
    */
    @SerializedName("LocalGatewayName")
    @Expose
    private String LocalGatewayName;

    /**
    * CDC实例ID。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * 本地网关实例ID。
    */
    @SerializedName("LocalGatewayId")
    @Expose
    private String LocalGatewayId;

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get 本地网关名称。 
     * @return LocalGatewayName 本地网关名称。
     */
    public String getLocalGatewayName() {
        return this.LocalGatewayName;
    }

    /**
     * Set 本地网关名称。
     * @param LocalGatewayName 本地网关名称。
     */
    public void setLocalGatewayName(String LocalGatewayName) {
        this.LocalGatewayName = LocalGatewayName;
    }

    /**
     * Get CDC实例ID。 
     * @return CdcId CDC实例ID。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC实例ID。
     * @param CdcId CDC实例ID。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get 本地网关实例ID。 
     * @return LocalGatewayId 本地网关实例ID。
     */
    public String getLocalGatewayId() {
        return this.LocalGatewayId;
    }

    /**
     * Set 本地网关实例ID。
     * @param LocalGatewayId 本地网关实例ID。
     */
    public void setLocalGatewayId(String LocalGatewayId) {
        this.LocalGatewayId = LocalGatewayId;
    }

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public ModifyLocalGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLocalGatewayRequest(ModifyLocalGatewayRequest source) {
        if (source.LocalGatewayName != null) {
            this.LocalGatewayName = new String(source.LocalGatewayName);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.LocalGatewayId != null) {
            this.LocalGatewayId = new String(source.LocalGatewayId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalGatewayName", this.LocalGatewayName);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "LocalGatewayId", this.LocalGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

