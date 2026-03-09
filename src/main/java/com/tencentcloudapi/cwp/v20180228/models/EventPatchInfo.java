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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventPatchInfo extends AbstractModel {

    /**
    * 补丁名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 补丁编号
    */
    @SerializedName("KbNo")
    @Expose
    private String KbNo;

    /**
    * 披露时间
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 影响主机数量
    */
    @SerializedName("EffectHostCount")
    @Expose
    private Long EffectHostCount;

    /**
    * 关联的漏洞数
    */
    @SerializedName("RelateVulCount")
    @Expose
    private Long RelateVulCount;

    /**
    * 关联的漏洞编号数组
    */
    @SerializedName("RelateVulList")
    @Expose
    private String [] RelateVulList;

    /**
    * 是否为最新披露，0否，1是，默认为否
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * 最后扫描时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 0待处理,1忽略,3修复
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 安装该kb的前置条件，一般为其他kb，且可能有多个，kb之间用", "分隔
    */
    @SerializedName("KbPreCondition")
    @Expose
    private String KbPreCondition;

    /**
    * 该kb关联的windows product名称
    */
    @SerializedName("RelatedProduct")
    @Expose
    private String RelatedProduct;

    /**
    * 补丁id
    */
    @SerializedName("KbId")
    @Expose
    private Long KbId;

    /**
    * 相关kb事件的id集合
    */
    @SerializedName("Ids")
    @Expose
    private String Ids;

    /**
     * Get 补丁名 
     * @return Name 补丁名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 补丁名
     * @param Name 补丁名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 补丁编号 
     * @return KbNo 补丁编号
     */
    public String getKbNo() {
        return this.KbNo;
    }

    /**
     * Set 补丁编号
     * @param KbNo 补丁编号
     */
    public void setKbNo(String KbNo) {
        this.KbNo = KbNo;
    }

    /**
     * Get 披露时间 
     * @return PublishTime 披露时间
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 披露时间
     * @param PublishTime 披露时间
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 影响主机数量 
     * @return EffectHostCount 影响主机数量
     */
    public Long getEffectHostCount() {
        return this.EffectHostCount;
    }

    /**
     * Set 影响主机数量
     * @param EffectHostCount 影响主机数量
     */
    public void setEffectHostCount(Long EffectHostCount) {
        this.EffectHostCount = EffectHostCount;
    }

    /**
     * Get 关联的漏洞数 
     * @return RelateVulCount 关联的漏洞数
     */
    public Long getRelateVulCount() {
        return this.RelateVulCount;
    }

    /**
     * Set 关联的漏洞数
     * @param RelateVulCount 关联的漏洞数
     */
    public void setRelateVulCount(Long RelateVulCount) {
        this.RelateVulCount = RelateVulCount;
    }

    /**
     * Get 关联的漏洞编号数组 
     * @return RelateVulList 关联的漏洞编号数组
     */
    public String [] getRelateVulList() {
        return this.RelateVulList;
    }

    /**
     * Set 关联的漏洞编号数组
     * @param RelateVulList 关联的漏洞编号数组
     */
    public void setRelateVulList(String [] RelateVulList) {
        this.RelateVulList = RelateVulList;
    }

    /**
     * Get 是否为最新披露，0否，1是，默认为否 
     * @return IsNew 是否为最新披露，0否，1是，默认为否
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set 是否为最新披露，0否，1是，默认为否
     * @param IsNew 是否为最新披露，0否，1是，默认为否
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get 最后扫描时间 
     * @return LastScanTime 最后扫描时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最后扫描时间
     * @param LastScanTime 最后扫描时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 0待处理,1忽略,3修复 
     * @return Status 0待处理,1忽略,3修复
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0待处理,1忽略,3修复
     * @param Status 0待处理,1忽略,3修复
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 安装该kb的前置条件，一般为其他kb，且可能有多个，kb之间用", "分隔 
     * @return KbPreCondition 安装该kb的前置条件，一般为其他kb，且可能有多个，kb之间用", "分隔
     */
    public String getKbPreCondition() {
        return this.KbPreCondition;
    }

    /**
     * Set 安装该kb的前置条件，一般为其他kb，且可能有多个，kb之间用", "分隔
     * @param KbPreCondition 安装该kb的前置条件，一般为其他kb，且可能有多个，kb之间用", "分隔
     */
    public void setKbPreCondition(String KbPreCondition) {
        this.KbPreCondition = KbPreCondition;
    }

    /**
     * Get 该kb关联的windows product名称 
     * @return RelatedProduct 该kb关联的windows product名称
     */
    public String getRelatedProduct() {
        return this.RelatedProduct;
    }

    /**
     * Set 该kb关联的windows product名称
     * @param RelatedProduct 该kb关联的windows product名称
     */
    public void setRelatedProduct(String RelatedProduct) {
        this.RelatedProduct = RelatedProduct;
    }

    /**
     * Get 补丁id 
     * @return KbId 补丁id
     */
    public Long getKbId() {
        return this.KbId;
    }

    /**
     * Set 补丁id
     * @param KbId 补丁id
     */
    public void setKbId(Long KbId) {
        this.KbId = KbId;
    }

    /**
     * Get 相关kb事件的id集合 
     * @return Ids 相关kb事件的id集合
     */
    public String getIds() {
        return this.Ids;
    }

    /**
     * Set 相关kb事件的id集合
     * @param Ids 相关kb事件的id集合
     */
    public void setIds(String Ids) {
        this.Ids = Ids;
    }

    public EventPatchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventPatchInfo(EventPatchInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.KbNo != null) {
            this.KbNo = new String(source.KbNo);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.EffectHostCount != null) {
            this.EffectHostCount = new Long(source.EffectHostCount);
        }
        if (source.RelateVulCount != null) {
            this.RelateVulCount = new Long(source.RelateVulCount);
        }
        if (source.RelateVulList != null) {
            this.RelateVulList = new String[source.RelateVulList.length];
            for (int i = 0; i < source.RelateVulList.length; i++) {
                this.RelateVulList[i] = new String(source.RelateVulList[i]);
            }
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.KbPreCondition != null) {
            this.KbPreCondition = new String(source.KbPreCondition);
        }
        if (source.RelatedProduct != null) {
            this.RelatedProduct = new String(source.RelatedProduct);
        }
        if (source.KbId != null) {
            this.KbId = new Long(source.KbId);
        }
        if (source.Ids != null) {
            this.Ids = new String(source.Ids);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KbNo", this.KbNo);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "EffectHostCount", this.EffectHostCount);
        this.setParamSimple(map, prefix + "RelateVulCount", this.RelateVulCount);
        this.setParamArraySimple(map, prefix + "RelateVulList.", this.RelateVulList);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "KbPreCondition", this.KbPreCondition);
        this.setParamSimple(map, prefix + "RelatedProduct", this.RelatedProduct);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "Ids", this.Ids);

    }
}

