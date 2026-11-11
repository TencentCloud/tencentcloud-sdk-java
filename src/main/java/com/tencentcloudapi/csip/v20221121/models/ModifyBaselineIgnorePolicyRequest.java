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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBaselineIgnorePolicyRequest extends AbstractModel {

    /**
    * <p>检测项 ID，标识对哪个检测项设置忽略策略。</p>
    */
    @SerializedName("ItemID")
    @Expose
    private Long ItemID;

    /**
    * <p>忽略范围类型。</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul>
    */
    @SerializedName("ScopeType")
    @Expose
    private String ScopeType;

    /**
    * <p>备注信息。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>忽略策略记录 ID。新建时传 0，更新时传对应记录 ID。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>自选资产 ID 列表，PICK 时生效，传入 instance-id 或集群 ID。</p>
    */
    @SerializedName("ScopeIncludeList")
    @Expose
    private String [] ScopeIncludeList;

    /**
    * <p>剔除资产 ID 列表，ALL 时生效，传入 instance-id 或集群 ID。</p>
    */
    @SerializedName("ScopeExcludeList")
    @Expose
    private String [] ScopeExcludeList;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>检测项 ID，标识对哪个检测项设置忽略策略。</p> 
     * @return ItemID <p>检测项 ID，标识对哪个检测项设置忽略策略。</p>
     */
    public Long getItemID() {
        return this.ItemID;
    }

    /**
     * Set <p>检测项 ID，标识对哪个检测项设置忽略策略。</p>
     * @param ItemID <p>检测项 ID，标识对哪个检测项设置忽略策略。</p>
     */
    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * Get <p>忽略范围类型。</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul> 
     * @return ScopeType <p>忽略范围类型。</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul>
     */
    public String getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>忽略范围类型。</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul>
     * @param ScopeType <p>忽略范围类型。</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul>
     */
    public void setScopeType(String ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get <p>备注信息。</p> 
     * @return Remark <p>备注信息。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息。</p>
     * @param Remark <p>备注信息。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>忽略策略记录 ID。新建时传 0，更新时传对应记录 ID。</p> 
     * @return ID <p>忽略策略记录 ID。新建时传 0，更新时传对应记录 ID。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>忽略策略记录 ID。新建时传 0，更新时传对应记录 ID。</p>
     * @param ID <p>忽略策略记录 ID。新建时传 0，更新时传对应记录 ID。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>自选资产 ID 列表，PICK 时生效，传入 instance-id 或集群 ID。</p> 
     * @return ScopeIncludeList <p>自选资产 ID 列表，PICK 时生效，传入 instance-id 或集群 ID。</p>
     */
    public String [] getScopeIncludeList() {
        return this.ScopeIncludeList;
    }

    /**
     * Set <p>自选资产 ID 列表，PICK 时生效，传入 instance-id 或集群 ID。</p>
     * @param ScopeIncludeList <p>自选资产 ID 列表，PICK 时生效，传入 instance-id 或集群 ID。</p>
     */
    public void setScopeIncludeList(String [] ScopeIncludeList) {
        this.ScopeIncludeList = ScopeIncludeList;
    }

    /**
     * Get <p>剔除资产 ID 列表，ALL 时生效，传入 instance-id 或集群 ID。</p> 
     * @return ScopeExcludeList <p>剔除资产 ID 列表，ALL 时生效，传入 instance-id 或集群 ID。</p>
     */
    public String [] getScopeExcludeList() {
        return this.ScopeExcludeList;
    }

    /**
     * Set <p>剔除资产 ID 列表，ALL 时生效，传入 instance-id 或集群 ID。</p>
     * @param ScopeExcludeList <p>剔除资产 ID 列表，ALL 时生效，传入 instance-id 或集群 ID。</p>
     */
    public void setScopeExcludeList(String [] ScopeExcludeList) {
        this.ScopeExcludeList = ScopeExcludeList;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyBaselineIgnorePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselineIgnorePolicyRequest(ModifyBaselineIgnorePolicyRequest source) {
        if (source.ItemID != null) {
            this.ItemID = new Long(source.ItemID);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new String(source.ScopeType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ScopeIncludeList != null) {
            this.ScopeIncludeList = new String[source.ScopeIncludeList.length];
            for (int i = 0; i < source.ScopeIncludeList.length; i++) {
                this.ScopeIncludeList[i] = new String(source.ScopeIncludeList[i]);
            }
        }
        if (source.ScopeExcludeList != null) {
            this.ScopeExcludeList = new String[source.ScopeExcludeList.length];
            for (int i = 0; i < source.ScopeExcludeList.length; i++) {
                this.ScopeExcludeList[i] = new String(source.ScopeExcludeList[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "ScopeIncludeList.", this.ScopeIncludeList);
        this.setParamArraySimple(map, prefix + "ScopeExcludeList.", this.ScopeExcludeList);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

