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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VPCOption extends AbstractModel {

    /**
    * 私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络）
    */
    @SerializedName("VPCId")
    @Expose
    private String VPCId;

    /**
    * 子网ID（SubnetId和SubnetZone&SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&SubnetCIDRBlock，则创建新的子网）
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网可用区。
    */
    @SerializedName("SubnetZone")
    @Expose
    private String SubnetZone;

    /**
    * 私有网络CIDR。
    */
    @SerializedName("VPCCIDRBlock")
    @Expose
    private String VPCCIDRBlock;

    /**
    * 子网CIDR。
    */
    @SerializedName("SubnetCIDRBlock")
    @Expose
    private String SubnetCIDRBlock;

    /**
     * Get 私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络） 
     * @return VPCId 私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络）
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * Set 私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络）
     * @param VPCId 私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络）
     */
    public void setVPCId(String VPCId) {
        this.VPCId = VPCId;
    }

    /**
     * Get 子网ID（SubnetId和SubnetZone&SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&SubnetCIDRBlock，则创建新的子网） 
     * @return SubnetId 子网ID（SubnetId和SubnetZone&SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&SubnetCIDRBlock，则创建新的子网）
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID（SubnetId和SubnetZone&SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&SubnetCIDRBlock，则创建新的子网）
     * @param SubnetId 子网ID（SubnetId和SubnetZone&SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&SubnetCIDRBlock，则创建新的子网）
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网可用区。 
     * @return SubnetZone 子网可用区。
     */
    public String getSubnetZone() {
        return this.SubnetZone;
    }

    /**
     * Set 子网可用区。
     * @param SubnetZone 子网可用区。
     */
    public void setSubnetZone(String SubnetZone) {
        this.SubnetZone = SubnetZone;
    }

    /**
     * Get 私有网络CIDR。 
     * @return VPCCIDRBlock 私有网络CIDR。
     */
    public String getVPCCIDRBlock() {
        return this.VPCCIDRBlock;
    }

    /**
     * Set 私有网络CIDR。
     * @param VPCCIDRBlock 私有网络CIDR。
     */
    public void setVPCCIDRBlock(String VPCCIDRBlock) {
        this.VPCCIDRBlock = VPCCIDRBlock;
    }

    /**
     * Get 子网CIDR。 
     * @return SubnetCIDRBlock 子网CIDR。
     */
    public String getSubnetCIDRBlock() {
        return this.SubnetCIDRBlock;
    }

    /**
     * Set 子网CIDR。
     * @param SubnetCIDRBlock 子网CIDR。
     */
    public void setSubnetCIDRBlock(String SubnetCIDRBlock) {
        this.SubnetCIDRBlock = SubnetCIDRBlock;
    }

    public VPCOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPCOption(VPCOption source) {
        if (source.VPCId != null) {
            this.VPCId = new String(source.VPCId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetZone != null) {
            this.SubnetZone = new String(source.SubnetZone);
        }
        if (source.VPCCIDRBlock != null) {
            this.VPCCIDRBlock = new String(source.VPCCIDRBlock);
        }
        if (source.SubnetCIDRBlock != null) {
            this.SubnetCIDRBlock = new String(source.SubnetCIDRBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VPCId", this.VPCId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetZone", this.SubnetZone);
        this.setParamSimple(map, prefix + "VPCCIDRBlock", this.VPCCIDRBlock);
        this.setParamSimple(map, prefix + "SubnetCIDRBlock", this.SubnetCIDRBlock);

    }
}

