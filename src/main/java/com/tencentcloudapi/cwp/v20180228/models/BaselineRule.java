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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineRule extends AbstractModel{

    /**
    * 规则名称,长度不超过128英文字符
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则类型 [0:系统|1:自定义]
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 规则分类
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 规则描述
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * 主机数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 适配项ID列表
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
    * [0:所有专业版旗舰版|1:hostID|2:ip]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private Long AssetType;

    /**
    * 主机Id集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * 主机IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIps")
    @Expose
    private String [] HostIps;

    /**
     * Get 规则名称,长度不超过128英文字符 
     * @return RuleName 规则名称,长度不超过128英文字符
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称,长度不超过128英文字符
     * @param RuleName 规则名称,长度不超过128英文字符
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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
     * Get 规则类型 [0:系统|1:自定义] 
     * @return RuleType 规则类型 [0:系统|1:自定义]
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型 [0:系统|1:自定义]
     * @param RuleType 规则类型 [0:系统|1:自定义]
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则分类 
     * @return CategoryId 规则分类
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 规则分类
     * @param CategoryId 规则分类
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 规则描述 
     * @return RuleDesc 规则描述
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set 规则描述
     * @param RuleDesc 规则描述
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get 主机数 
     * @return HostCount 主机数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 主机数
     * @param HostCount 主机数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 适配项ID列表 
     * @return Items 适配项ID列表
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set 适配项ID列表
     * @param Items 适配项ID列表
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
    }

    /**
     * Get [0:所有专业版旗舰版|1:hostID|2:ip]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType [0:所有专业版旗舰版|1:hostID|2:ip]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetType() {
        return this.AssetType;
    }

    /**
     * Set [0:所有专业版旗舰版|1:hostID|2:ip]
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType [0:所有专业版旗舰版|1:hostID|2:ip]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(Long AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 主机Id集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIds 主机Id集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set 主机Id集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIds 主机Id集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get 主机IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIps 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHostIps() {
        return this.HostIps;
    }

    /**
     * Set 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIps 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIps(String [] HostIps) {
        this.HostIps = HostIps;
    }

    public BaselineRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRule(BaselineRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.Items != null) {
            this.Items = new Item[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Item(source.Items[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new Long(source.AssetType);
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.HostIps != null) {
            this.HostIps = new String[source.HostIps.length];
            for (int i = 0; i < source.HostIps.length; i++) {
                this.HostIps[i] = new String(source.HostIps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "HostIps.", this.HostIps);

    }
}

