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

public class CreateDisasterRecoveryVpcMappingRequest extends AbstractModel {

    /**
    * 源端VPC ID
    */
    @SerializedName("SourceVpcId")
    @Expose
    private String SourceVpcId;

    /**
    * 源端子网ID
    */
    @SerializedName("SourceSubnetId")
    @Expose
    private String SourceSubnetId;

    /**
    * 目标端VPC ID
    */
    @SerializedName("TargetVpcId")
    @Expose
    private String TargetVpcId;

    /**
    * 目标端子网ID
    */
    @SerializedName("TargetSubnetId")
    @Expose
    private String TargetSubnetId;

    /**
    * 站点对ID
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
     * Get 源端VPC ID 
     * @return SourceVpcId 源端VPC ID
     */
    public String getSourceVpcId() {
        return this.SourceVpcId;
    }

    /**
     * Set 源端VPC ID
     * @param SourceVpcId 源端VPC ID
     */
    public void setSourceVpcId(String SourceVpcId) {
        this.SourceVpcId = SourceVpcId;
    }

    /**
     * Get 源端子网ID 
     * @return SourceSubnetId 源端子网ID
     */
    public String getSourceSubnetId() {
        return this.SourceSubnetId;
    }

    /**
     * Set 源端子网ID
     * @param SourceSubnetId 源端子网ID
     */
    public void setSourceSubnetId(String SourceSubnetId) {
        this.SourceSubnetId = SourceSubnetId;
    }

    /**
     * Get 目标端VPC ID 
     * @return TargetVpcId 目标端VPC ID
     */
    public String getTargetVpcId() {
        return this.TargetVpcId;
    }

    /**
     * Set 目标端VPC ID
     * @param TargetVpcId 目标端VPC ID
     */
    public void setTargetVpcId(String TargetVpcId) {
        this.TargetVpcId = TargetVpcId;
    }

    /**
     * Get 目标端子网ID 
     * @return TargetSubnetId 目标端子网ID
     */
    public String getTargetSubnetId() {
        return this.TargetSubnetId;
    }

    /**
     * Set 目标端子网ID
     * @param TargetSubnetId 目标端子网ID
     */
    public void setTargetSubnetId(String TargetSubnetId) {
        this.TargetSubnetId = TargetSubnetId;
    }

    /**
     * Get 站点对ID 
     * @return SitePairId 站点对ID
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 站点对ID
     * @param SitePairId 站点对ID
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    public CreateDisasterRecoveryVpcMappingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisasterRecoveryVpcMappingRequest(CreateDisasterRecoveryVpcMappingRequest source) {
        if (source.SourceVpcId != null) {
            this.SourceVpcId = new String(source.SourceVpcId);
        }
        if (source.SourceSubnetId != null) {
            this.SourceSubnetId = new String(source.SourceSubnetId);
        }
        if (source.TargetVpcId != null) {
            this.TargetVpcId = new String(source.TargetVpcId);
        }
        if (source.TargetSubnetId != null) {
            this.TargetSubnetId = new String(source.TargetSubnetId);
        }
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceVpcId", this.SourceVpcId);
        this.setParamSimple(map, prefix + "SourceSubnetId", this.SourceSubnetId);
        this.setParamSimple(map, prefix + "TargetVpcId", this.TargetVpcId);
        this.setParamSimple(map, prefix + "TargetSubnetId", this.TargetSubnetId);
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);

    }
}

