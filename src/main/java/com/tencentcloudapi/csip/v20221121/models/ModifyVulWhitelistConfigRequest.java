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

public class ModifyVulWhitelistConfigRequest extends AbstractModel {

    /**
    * <p>id列表</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选剔除资产</li></ul>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>资产列表（Quuid列表）</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
     * Get <p>id列表</p> 
     * @return Id <p>id列表</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>id列表</p>
     * @param Id <p>id列表</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选剔除资产</li></ul> 
     * @return AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选剔除资产</li></ul>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选剔除资产</li></ul>
     * @param AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>0： 全部资产</li><li>1： 自选资产</li><li>2： 全选剔除资产</li></ul>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>资产列表（Quuid列表）</p> 
     * @return AssetList <p>资产列表（Quuid列表）</p>
     */
    public String [] getAssetList() {
        return this.AssetList;
    }

    /**
     * Set <p>资产列表（Quuid列表）</p>
     * @param AssetList <p>资产列表（Quuid列表）</p>
     */
    public void setAssetList(String [] AssetList) {
        this.AssetList = AssetList;
    }

    public ModifyVulWhitelistConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVulWhitelistConfigRequest(ModifyVulWhitelistConfigRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
        if (source.AssetList != null) {
            this.AssetList = new String[source.AssetList.length];
            for (int i = 0; i < source.AssetList.length; i++) {
                this.AssetList[i] = new String(source.AssetList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);

    }
}

