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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CHDFSProductVpcInfo extends AbstractModel {

    /**
    * vpc id

    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * vpc子网信息列表
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private VpcCidrBlock [] VpcCidrBlock;

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 权限组Id
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
     * Get vpc id
 
     * @return VpcId vpc id

     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id

     * @param VpcId vpc id

     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc名称 
     * @return VpcName vpc名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc名称
     * @param VpcName vpc名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get vpc子网信息列表 
     * @return VpcCidrBlock vpc子网信息列表
     */
    public VpcCidrBlock [] getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set vpc子网信息列表
     * @param VpcCidrBlock vpc子网信息列表
     */
    public void setVpcCidrBlock(VpcCidrBlock [] VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 权限组Id 
     * @return AccessGroupId 权限组Id
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * Set 权限组Id
     * @param AccessGroupId 权限组Id
     */
    public void setAccessGroupId(String AccessGroupId) {
        this.AccessGroupId = AccessGroupId;
    }

    public CHDFSProductVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CHDFSProductVpcInfo(CHDFSProductVpcInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new VpcCidrBlock[source.VpcCidrBlock.length];
            for (int i = 0; i < source.VpcCidrBlock.length; i++) {
                this.VpcCidrBlock[i] = new VpcCidrBlock(source.VpcCidrBlock[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.AccessGroupId != null) {
            this.AccessGroupId = new String(source.AccessGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamArrayObj(map, prefix + "VpcCidrBlock.", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);

    }
}

