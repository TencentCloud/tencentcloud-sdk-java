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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClueInfoDetail extends AbstractModel{

    /**
    * 线索id，线索唯一识别编码
    */
    @SerializedName("ClueId")
    @Expose
    private String ClueId;

    /**
    * 接待客户经销商顾问所属组织id,多个组织使用逗号分割
    */
    @SerializedName("DealerId")
    @Expose
    private String DealerId;

    /**
    * 线索获取时间，用户添加企业微信时间，单位是秒
    */
    @SerializedName("EnquireTime")
    @Expose
    private Long EnquireTime;

    /**
    * 客户在微信生态中唯一识别码
    */
    @SerializedName("UnionId")
    @Expose
    private String UnionId;

    /**
    * 微信昵称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 联系方式
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 车系编号
    */
    @SerializedName("SeriesCode")
    @Expose
    private String SeriesCode;

    /**
    * 车型编号
    */
    @SerializedName("ModelCode")
    @Expose
    private String ModelCode;

    /**
    * 省份编号
    */
    @SerializedName("ProvinceCode")
    @Expose
    private String ProvinceCode;

    /**
    * 城市编号
    */
    @SerializedName("CityCode")
    @Expose
    private String CityCode;

    /**
    * 顾问名称
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
    * 顾问电话
    */
    @SerializedName("SalesPhone")
    @Expose
    private String SalesPhone;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 标签
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
     * Get 线索id，线索唯一识别编码 
     * @return ClueId 线索id，线索唯一识别编码
     */
    public String getClueId() {
        return this.ClueId;
    }

    /**
     * Set 线索id，线索唯一识别编码
     * @param ClueId 线索id，线索唯一识别编码
     */
    public void setClueId(String ClueId) {
        this.ClueId = ClueId;
    }

    /**
     * Get 接待客户经销商顾问所属组织id,多个组织使用逗号分割 
     * @return DealerId 接待客户经销商顾问所属组织id,多个组织使用逗号分割
     */
    public String getDealerId() {
        return this.DealerId;
    }

    /**
     * Set 接待客户经销商顾问所属组织id,多个组织使用逗号分割
     * @param DealerId 接待客户经销商顾问所属组织id,多个组织使用逗号分割
     */
    public void setDealerId(String DealerId) {
        this.DealerId = DealerId;
    }

    /**
     * Get 线索获取时间，用户添加企业微信时间，单位是秒 
     * @return EnquireTime 线索获取时间，用户添加企业微信时间，单位是秒
     */
    public Long getEnquireTime() {
        return this.EnquireTime;
    }

    /**
     * Set 线索获取时间，用户添加企业微信时间，单位是秒
     * @param EnquireTime 线索获取时间，用户添加企业微信时间，单位是秒
     */
    public void setEnquireTime(Long EnquireTime) {
        this.EnquireTime = EnquireTime;
    }

    /**
     * Get 客户在微信生态中唯一识别码 
     * @return UnionId 客户在微信生态中唯一识别码
     */
    public String getUnionId() {
        return this.UnionId;
    }

    /**
     * Set 客户在微信生态中唯一识别码
     * @param UnionId 客户在微信生态中唯一识别码
     */
    public void setUnionId(String UnionId) {
        this.UnionId = UnionId;
    }

    /**
     * Get 微信昵称 
     * @return Name 微信昵称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 微信昵称
     * @param Name 微信昵称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 联系方式 
     * @return Phone 联系方式
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 联系方式
     * @param Phone 联系方式
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 车系编号 
     * @return SeriesCode 车系编号
     */
    public String getSeriesCode() {
        return this.SeriesCode;
    }

    /**
     * Set 车系编号
     * @param SeriesCode 车系编号
     */
    public void setSeriesCode(String SeriesCode) {
        this.SeriesCode = SeriesCode;
    }

    /**
     * Get 车型编号 
     * @return ModelCode 车型编号
     */
    public String getModelCode() {
        return this.ModelCode;
    }

    /**
     * Set 车型编号
     * @param ModelCode 车型编号
     */
    public void setModelCode(String ModelCode) {
        this.ModelCode = ModelCode;
    }

    /**
     * Get 省份编号 
     * @return ProvinceCode 省份编号
     */
    public String getProvinceCode() {
        return this.ProvinceCode;
    }

    /**
     * Set 省份编号
     * @param ProvinceCode 省份编号
     */
    public void setProvinceCode(String ProvinceCode) {
        this.ProvinceCode = ProvinceCode;
    }

    /**
     * Get 城市编号 
     * @return CityCode 城市编号
     */
    public String getCityCode() {
        return this.CityCode;
    }

    /**
     * Set 城市编号
     * @param CityCode 城市编号
     */
    public void setCityCode(String CityCode) {
        this.CityCode = CityCode;
    }

    /**
     * Get 顾问名称 
     * @return SalesName 顾问名称
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 顾问名称
     * @param SalesName 顾问名称
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Get 顾问电话 
     * @return SalesPhone 顾问电话
     */
    public String getSalesPhone() {
        return this.SalesPhone;
    }

    /**
     * Set 顾问电话
     * @param SalesPhone 顾问电话
     */
    public void setSalesPhone(String SalesPhone) {
        this.SalesPhone = SalesPhone;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 标签 
     * @return TagList 标签
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签
     * @param TagList 标签
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    public ClueInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClueInfoDetail(ClueInfoDetail source) {
        if (source.ClueId != null) {
            this.ClueId = new String(source.ClueId);
        }
        if (source.DealerId != null) {
            this.DealerId = new String(source.DealerId);
        }
        if (source.EnquireTime != null) {
            this.EnquireTime = new Long(source.EnquireTime);
        }
        if (source.UnionId != null) {
            this.UnionId = new String(source.UnionId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.SeriesCode != null) {
            this.SeriesCode = new String(source.SeriesCode);
        }
        if (source.ModelCode != null) {
            this.ModelCode = new String(source.ModelCode);
        }
        if (source.ProvinceCode != null) {
            this.ProvinceCode = new String(source.ProvinceCode);
        }
        if (source.CityCode != null) {
            this.CityCode = new String(source.CityCode);
        }
        if (source.SalesName != null) {
            this.SalesName = new String(source.SalesName);
        }
        if (source.SalesPhone != null) {
            this.SalesPhone = new String(source.SalesPhone);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClueId", this.ClueId);
        this.setParamSimple(map, prefix + "DealerId", this.DealerId);
        this.setParamSimple(map, prefix + "EnquireTime", this.EnquireTime);
        this.setParamSimple(map, prefix + "UnionId", this.UnionId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "SeriesCode", this.SeriesCode);
        this.setParamSimple(map, prefix + "ModelCode", this.ModelCode);
        this.setParamSimple(map, prefix + "ProvinceCode", this.ProvinceCode);
        this.setParamSimple(map, prefix + "CityCode", this.CityCode);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);
        this.setParamSimple(map, prefix + "SalesPhone", this.SalesPhone);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);

    }
}

