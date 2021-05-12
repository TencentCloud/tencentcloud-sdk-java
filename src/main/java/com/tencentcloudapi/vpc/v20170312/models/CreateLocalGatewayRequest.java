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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLocalGatewayRequest extends AbstractModel{

    /**
    * 本地网关名称
    */
    @SerializedName("LocalGatewayName")
    @Expose
    private String LocalGatewayName;

    /**
    * VPC实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * CDC实例ID
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get 本地网关名称 
     * @return LocalGatewayName 本地网关名称
     */
    public String getLocalGatewayName() {
        return this.LocalGatewayName;
    }

    /**
     * Set 本地网关名称
     * @param LocalGatewayName 本地网关名称
     */
    public void setLocalGatewayName(String LocalGatewayName) {
        this.LocalGatewayName = LocalGatewayName;
    }

    /**
     * Get VPC实例ID 
     * @return VpcId VPC实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID
     * @param VpcId VPC实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get CDC实例ID 
     * @return CdcId CDC实例ID
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC实例ID
     * @param CdcId CDC实例ID
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public CreateLocalGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLocalGatewayRequest(CreateLocalGatewayRequest source) {
        if (source.LocalGatewayName != null) {
            this.LocalGatewayName = new String(source.LocalGatewayName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalGatewayName", this.LocalGatewayName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

