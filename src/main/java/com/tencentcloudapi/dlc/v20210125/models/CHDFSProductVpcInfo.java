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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CHDFSProductVpcInfo extends AbstractModel {

    /**
    * vpc id

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * vpc子网信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private VpcCidrBlock [] VpcCidrBlock;

    /**
    * 规则Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 权限组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
     * Get vpc id

注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc id

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id

注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc id

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName vpc名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName vpc名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get vpc子网信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcCidrBlock vpc子网信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcCidrBlock [] getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set vpc子网信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcCidrBlock vpc子网信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcCidrBlock(VpcCidrBlock [] VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 规则Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 权限组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessGroupId 权限组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * Set 权限组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessGroupId 权限组Id
注意：此字段可能返回 null，表示取不到有效值。
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

