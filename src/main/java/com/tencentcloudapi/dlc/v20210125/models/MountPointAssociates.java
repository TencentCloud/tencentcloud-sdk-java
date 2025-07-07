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

public class MountPointAssociates extends AbstractModel {

    /**
    * 桶Id
    */
    @SerializedName("BucketId")
    @Expose
    private String BucketId;

    /**
    * vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网地址
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 权限组Id
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
    * 权限规则Id
    */
    @SerializedName("AccessRuleId")
    @Expose
    private Long AccessRuleId;

    /**
     * Get 桶Id 
     * @return BucketId 桶Id
     */
    public String getBucketId() {
        return this.BucketId;
    }

    /**
     * Set 桶Id
     * @param BucketId 桶Id
     */
    public void setBucketId(String BucketId) {
        this.BucketId = BucketId;
    }

    /**
     * Get vpcId 
     * @return VpcId vpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId
     * @param VpcId vpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网地址 
     * @return VpcCidrBlock 子网地址
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set 子网地址
     * @param VpcCidrBlock 子网地址
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
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

    /**
     * Get 权限规则Id 
     * @return AccessRuleId 权限规则Id
     */
    public Long getAccessRuleId() {
        return this.AccessRuleId;
    }

    /**
     * Set 权限规则Id
     * @param AccessRuleId 权限规则Id
     */
    public void setAccessRuleId(Long AccessRuleId) {
        this.AccessRuleId = AccessRuleId;
    }

    public MountPointAssociates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountPointAssociates(MountPointAssociates source) {
        if (source.BucketId != null) {
            this.BucketId = new String(source.BucketId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.AccessGroupId != null) {
            this.AccessGroupId = new String(source.AccessGroupId);
        }
        if (source.AccessRuleId != null) {
            this.AccessRuleId = new Long(source.AccessRuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);
        this.setParamSimple(map, prefix + "AccessRuleId", this.AccessRuleId);

    }
}

