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

public class BaselineIgnorePolicy extends AbstractModel {

    /**
    * <p>忽略策略记录 ID。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>检测项名称。</p>
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * <p>检测项所属分类名称。</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * <p>用户 AppID。</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>忽略范围类型</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul>
    */
    @SerializedName("ScopeType")
    @Expose
    private String ScopeType;

    /**
    * <p>自选资产 ID 列表，PICK时生效，存储 instance-id 或集群 ID。</p>
    */
    @SerializedName("ScopeIncludeList")
    @Expose
    private String [] ScopeIncludeList;

    /**
    * <p>剔除资产 ID 列表，ALL 时生效，存储 instance-id 或集群 ID。</p>
    */
    @SerializedName("ScopeExcludeList")
    @Expose
    private String [] ScopeExcludeList;

    /**
    * <p>备注信息。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近修改时间。</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>对应资产类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CLUSTER： 集群相关资产</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>检测项ID</p>
    */
    @SerializedName("ItemID")
    @Expose
    private Long ItemID;

    /**
     * Get <p>忽略策略记录 ID。</p> 
     * @return ID <p>忽略策略记录 ID。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>忽略策略记录 ID。</p>
     * @param ID <p>忽略策略记录 ID。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>检测项名称。</p> 
     * @return ItemName <p>检测项名称。</p>
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set <p>检测项名称。</p>
     * @param ItemName <p>检测项名称。</p>
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get <p>检测项所属分类名称。</p> 
     * @return CategoryName <p>检测项所属分类名称。</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>检测项所属分类名称。</p>
     * @param CategoryName <p>检测项所属分类名称。</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get <p>用户 AppID。</p> 
     * @return AppID <p>用户 AppID。</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>用户 AppID。</p>
     * @param AppID <p>用户 AppID。</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>忽略范围类型</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul> 
     * @return ScopeType <p>忽略范围类型</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul>
     */
    public String getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>忽略范围类型</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul>
     * @param ScopeType <p>忽略范围类型</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>PICK： 指定资产</li></ul>
     */
    public void setScopeType(String ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get <p>自选资产 ID 列表，PICK时生效，存储 instance-id 或集群 ID。</p> 
     * @return ScopeIncludeList <p>自选资产 ID 列表，PICK时生效，存储 instance-id 或集群 ID。</p>
     */
    public String [] getScopeIncludeList() {
        return this.ScopeIncludeList;
    }

    /**
     * Set <p>自选资产 ID 列表，PICK时生效，存储 instance-id 或集群 ID。</p>
     * @param ScopeIncludeList <p>自选资产 ID 列表，PICK时生效，存储 instance-id 或集群 ID。</p>
     */
    public void setScopeIncludeList(String [] ScopeIncludeList) {
        this.ScopeIncludeList = ScopeIncludeList;
    }

    /**
     * Get <p>剔除资产 ID 列表，ALL 时生效，存储 instance-id 或集群 ID。</p> 
     * @return ScopeExcludeList <p>剔除资产 ID 列表，ALL 时生效，存储 instance-id 或集群 ID。</p>
     */
    public String [] getScopeExcludeList() {
        return this.ScopeExcludeList;
    }

    /**
     * Set <p>剔除资产 ID 列表，ALL 时生效，存储 instance-id 或集群 ID。</p>
     * @param ScopeExcludeList <p>剔除资产 ID 列表，ALL 时生效，存储 instance-id 或集群 ID。</p>
     */
    public void setScopeExcludeList(String [] ScopeExcludeList) {
        this.ScopeExcludeList = ScopeExcludeList;
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
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近修改时间。</p> 
     * @return ModifyTime <p>最近修改时间。</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>最近修改时间。</p>
     * @param ModifyTime <p>最近修改时间。</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>对应资产类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CLUSTER： 集群相关资产</li></ul> 
     * @return AssetType <p>对应资产类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CLUSTER： 集群相关资产</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>对应资产类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CLUSTER： 集群相关资产</li></ul>
     * @param AssetType <p>对应资产类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CLUSTER： 集群相关资产</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>检测项ID</p> 
     * @return ItemID <p>检测项ID</p>
     */
    public Long getItemID() {
        return this.ItemID;
    }

    /**
     * Set <p>检测项ID</p>
     * @param ItemID <p>检测项ID</p>
     */
    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
    }

    public BaselineIgnorePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineIgnorePolicy(BaselineIgnorePolicy source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new String(source.ScopeType);
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
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ItemID != null) {
            this.ItemID = new Long(source.ItemID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamArraySimple(map, prefix + "ScopeIncludeList.", this.ScopeIncludeList);
        this.setParamArraySimple(map, prefix + "ScopeExcludeList.", this.ScopeExcludeList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);

    }
}

