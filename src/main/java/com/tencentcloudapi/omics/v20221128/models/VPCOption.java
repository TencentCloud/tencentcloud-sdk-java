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
    * <p>私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络）</p>
    */
    @SerializedName("VPCId")
    @Expose
    private String VPCId;

    /**
    * <p>子网ID（SubnetId和SubnetZone&amp;SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&amp;SubnetCIDRBlock，则创建新的子网）</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>子网可用区。</p>
    */
    @SerializedName("SubnetZone")
    @Expose
    private String SubnetZone;

    /**
    * <p>私有网络CIDR。</p>
    */
    @SerializedName("VPCCIDRBlock")
    @Expose
    private String VPCCIDRBlock;

    /**
    * <p>子网CIDR。</p>
    */
    @SerializedName("SubnetCIDRBlock")
    @Expose
    private String SubnetCIDRBlock;

    /**
     * Get <p>私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络）</p> 
     * @return VPCId <p>私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络）</p>
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * Set <p>私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络）</p>
     * @param VPCId <p>私有网络ID（VPCId和VPCCIDRBlock必选其一。若使用VPCId，则使用现用私有网络；若使用VPCCIDRBlock，则创建新的私有网络）</p>
     */
    public void setVPCId(String VPCId) {
        this.VPCId = VPCId;
    }

    /**
     * Get <p>子网ID（SubnetId和SubnetZone&amp;SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&amp;SubnetCIDRBlock，则创建新的子网）</p> 
     * @return SubnetId <p>子网ID（SubnetId和SubnetZone&amp;SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&amp;SubnetCIDRBlock，则创建新的子网）</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID（SubnetId和SubnetZone&amp;SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&amp;SubnetCIDRBlock，则创建新的子网）</p>
     * @param SubnetId <p>子网ID（SubnetId和SubnetZone&amp;SubnetCIDRBlock必选其一。若使用SubnetId，则使用现用子网；若使用SubnetZone&amp;SubnetCIDRBlock，则创建新的子网）</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>子网可用区。</p> 
     * @return SubnetZone <p>子网可用区。</p>
     */
    public String getSubnetZone() {
        return this.SubnetZone;
    }

    /**
     * Set <p>子网可用区。</p>
     * @param SubnetZone <p>子网可用区。</p>
     */
    public void setSubnetZone(String SubnetZone) {
        this.SubnetZone = SubnetZone;
    }

    /**
     * Get <p>私有网络CIDR。</p> 
     * @return VPCCIDRBlock <p>私有网络CIDR。</p>
     */
    public String getVPCCIDRBlock() {
        return this.VPCCIDRBlock;
    }

    /**
     * Set <p>私有网络CIDR。</p>
     * @param VPCCIDRBlock <p>私有网络CIDR。</p>
     */
    public void setVPCCIDRBlock(String VPCCIDRBlock) {
        this.VPCCIDRBlock = VPCCIDRBlock;
    }

    /**
     * Get <p>子网CIDR。</p> 
     * @return SubnetCIDRBlock <p>子网CIDR。</p>
     */
    public String getSubnetCIDRBlock() {
        return this.SubnetCIDRBlock;
    }

    /**
     * Set <p>子网CIDR。</p>
     * @param SubnetCIDRBlock <p>子网CIDR。</p>
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

