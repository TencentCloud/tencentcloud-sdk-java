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

public class VulWhitelist extends AbstractModel {

    /**
    * <p>id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>漏洞名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>所属账号</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>资产列表</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>策略开关（0-关闭, 1-开启）</p>
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选排除资产</li></ul>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>补丁KB id</p>
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

    /**
    * <p>漏洞Id</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
     * Get <p>id</p> 
     * @return Id <p>id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
     * @param Id <p>id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>漏洞名称</p> 
     * @return Name <p>漏洞名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>漏洞名称</p>
     * @param Name <p>漏洞名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>所属账号</p> 
     * @return AppId <p>所属账号</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>所属账号</p>
     * @param AppId <p>所属账号</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>资产列表</p> 
     * @return AssetList <p>资产列表</p>
     */
    public String [] getAssetList() {
        return this.AssetList;
    }

    /**
     * Set <p>资产列表</p>
     * @param AssetList <p>资产列表</p>
     */
    public void setAssetList(String [] AssetList) {
        this.AssetList = AssetList;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>策略开关（0-关闭, 1-开启）</p> 
     * @return Switch <p>策略开关（0-关闭, 1-开启）</p>
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>策略开关（0-关闭, 1-开启）</p>
     * @param Switch <p>策略开关（0-关闭, 1-开启）</p>
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选排除资产</li></ul> 
     * @return AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选排除资产</li></ul>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选排除资产</li></ul>
     * @param AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选排除资产</li></ul>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>补丁KB id</p> 
     * @return KBId <p>补丁KB id</p>
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set <p>补丁KB id</p>
     * @param KBId <p>补丁KB id</p>
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
    }

    /**
     * Get <p>漏洞Id</p> 
     * @return VulId <p>漏洞Id</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>漏洞Id</p>
     * @param VulId <p>漏洞Id</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    public VulWhitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulWhitelist(VulWhitelist source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AssetList != null) {
            this.AssetList = new String[source.AssetList.length];
            for (int i = 0; i < source.AssetList.length; i++) {
                this.AssetList[i] = new String(source.AssetList[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Switch != null) {
            this.Switch = new Long(source.Switch);
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamSimple(map, prefix + "KBId", this.KBId);
        this.setParamSimple(map, prefix + "VulId", this.VulId);

    }
}

