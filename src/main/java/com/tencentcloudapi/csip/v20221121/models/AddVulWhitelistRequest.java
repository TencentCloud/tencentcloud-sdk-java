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

public class AddVulWhitelistRequest extends AbstractModel {

    /**
    * <p>漏洞ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long [] VulId;

    /**
    * <p>补丁ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private Long [] KbId;

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
    * <p>资产列表</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
     * Get <p>漏洞ID</p> 
     * @return VulId <p>漏洞ID</p>
     */
    public Long [] getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>漏洞ID</p>
     * @param VulId <p>漏洞ID</p>
     */
    public void setVulId(Long [] VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>补丁ID</p> 
     * @return KbId <p>补丁ID</p>
     */
    public Long [] getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>补丁ID</p>
     * @param KbId <p>补丁ID</p>
     */
    public void setKbId(Long [] KbId) {
        this.KbId = KbId;
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

    public AddVulWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddVulWhitelistRequest(AddVulWhitelistRequest source) {
        if (source.VulId != null) {
            this.VulId = new Long[source.VulId.length];
            for (int i = 0; i < source.VulId.length; i++) {
                this.VulId[i] = new Long(source.VulId[i]);
            }
        }
        if (source.KbId != null) {
            this.KbId = new Long[source.KbId.length];
            for (int i = 0; i < source.KbId.length; i++) {
                this.KbId[i] = new Long(source.KbId[i]);
            }
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
        this.setParamArraySimple(map, prefix + "VulId.", this.VulId);
        this.setParamArraySimple(map, prefix + "KbId.", this.KbId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);

    }
}

