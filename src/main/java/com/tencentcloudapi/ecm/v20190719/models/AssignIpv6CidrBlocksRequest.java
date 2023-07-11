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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignIpv6CidrBlocksRequest extends AbstractModel{

    /**
    * `VPC`实例`ID`，形如：`vpc-f49l6u0z`。	
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	
    */
    @SerializedName("ISPTypes")
    @Expose
    private ISPTypeItem [] ISPTypes;

    /**
    * ECM地域。
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
     * Get `VPC`实例`ID`，形如：`vpc-f49l6u0z`。	 
     * @return VpcId `VPC`实例`ID`，形如：`vpc-f49l6u0z`。	
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `VPC`实例`ID`，形如：`vpc-f49l6u0z`。	
     * @param VpcId `VPC`实例`ID`，形如：`vpc-f49l6u0z`。	
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	 
     * @return ISPTypes 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	
     */
    public ISPTypeItem [] getISPTypes() {
        return this.ISPTypes;
    }

    /**
     * Set 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	
     * @param ISPTypes 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	
     */
    public void setISPTypes(ISPTypeItem [] ISPTypes) {
        this.ISPTypes = ISPTypes;
    }

    /**
     * Get ECM地域。 
     * @return EcmRegion ECM地域。
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM地域。
     * @param EcmRegion ECM地域。
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    public AssignIpv6CidrBlocksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignIpv6CidrBlocksRequest(AssignIpv6CidrBlocksRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ISPTypes != null) {
            this.ISPTypes = new ISPTypeItem[source.ISPTypes.length];
            for (int i = 0; i < source.ISPTypes.length; i++) {
                this.ISPTypes[i] = new ISPTypeItem(source.ISPTypes[i]);
            }
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "ISPTypes.", this.ISPTypes);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);

    }
}

