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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomRule extends AbstractModel{

    /**
    * 码规则ID
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * 码规则名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 企业ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 商户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 码ID长度
    */
    @SerializedName("CodeLength")
    @Expose
    private Long CodeLength;

    /**
    * 规则状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 码段配置
    */
    @SerializedName("CodeParts")
    @Expose
    private CodePart [] CodeParts;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 码规则ID 
     * @return CustomId 码规则ID
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 码规则ID
     * @param CustomId 码规则ID
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get 码规则名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 码规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 码规则名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 码规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 企业ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpId 企业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpId 企业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 商户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantId 商户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantId 商户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 码ID长度 
     * @return CodeLength 码ID长度
     */
    public Long getCodeLength() {
        return this.CodeLength;
    }

    /**
     * Set 码ID长度
     * @param CodeLength 码ID长度
     */
    public void setCodeLength(Long CodeLength) {
        this.CodeLength = CodeLength;
    }

    /**
     * Get 规则状态 
     * @return Status 规则状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态
     * @param Status 规则状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 码段配置 
     * @return CodeParts 码段配置
     */
    public CodePart [] getCodeParts() {
        return this.CodeParts;
    }

    /**
     * Set 码段配置
     * @param CodeParts 码段配置
     */
    public void setCodeParts(CodePart [] CodeParts) {
        this.CodeParts = CodeParts;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CustomRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomRule(CustomRule source) {
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.CodeLength != null) {
            this.CodeLength = new Long(source.CodeLength);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CodeParts != null) {
            this.CodeParts = new CodePart[source.CodeParts.length];
            for (int i = 0; i < source.CodeParts.length; i++) {
                this.CodeParts[i] = new CodePart(source.CodeParts[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "CodeLength", this.CodeLength);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "CodeParts.", this.CodeParts);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

