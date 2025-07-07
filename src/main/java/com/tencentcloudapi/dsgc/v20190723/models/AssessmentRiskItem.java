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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessmentRiskItem extends AbstractModel {

    /**
    * 脆弱项id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 名称
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 脆弱性级别
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 风险类型
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 关联模板个数
    */
    @SerializedName("ReferTemplateCount")
    @Expose
    private Long ReferTemplateCount;

    /**
    * 支持的数据源
    */
    @SerializedName("SupportDataSource")
    @Expose
    private String [] SupportDataSource;

    /**
    * 风险面
    */
    @SerializedName("RiskSide")
    @Expose
    private String RiskSide;

    /**
    * 关联模板列表
    */
    @SerializedName("ReferTemplateList")
    @Expose
    private TemplateInfo [] ReferTemplateList;

    /**
     * Get 脆弱项id 
     * @return Id 脆弱项id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 脆弱项id
     * @param Id 脆弱项id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 名称 
     * @return RiskName 名称
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 名称
     * @param RiskName 名称
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 脆弱性级别 
     * @return Level 脆弱性级别
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 脆弱性级别
     * @param Level 脆弱性级别
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 说明 
     * @return Description 说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 说明
     * @param Description 说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 风险类型 
     * @return RiskType 风险类型
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型
     * @param RiskType 风险类型
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 关联模板个数 
     * @return ReferTemplateCount 关联模板个数
     */
    public Long getReferTemplateCount() {
        return this.ReferTemplateCount;
    }

    /**
     * Set 关联模板个数
     * @param ReferTemplateCount 关联模板个数
     */
    public void setReferTemplateCount(Long ReferTemplateCount) {
        this.ReferTemplateCount = ReferTemplateCount;
    }

    /**
     * Get 支持的数据源 
     * @return SupportDataSource 支持的数据源
     */
    public String [] getSupportDataSource() {
        return this.SupportDataSource;
    }

    /**
     * Set 支持的数据源
     * @param SupportDataSource 支持的数据源
     */
    public void setSupportDataSource(String [] SupportDataSource) {
        this.SupportDataSource = SupportDataSource;
    }

    /**
     * Get 风险面 
     * @return RiskSide 风险面
     */
    public String getRiskSide() {
        return this.RiskSide;
    }

    /**
     * Set 风险面
     * @param RiskSide 风险面
     */
    public void setRiskSide(String RiskSide) {
        this.RiskSide = RiskSide;
    }

    /**
     * Get 关联模板列表 
     * @return ReferTemplateList 关联模板列表
     */
    public TemplateInfo [] getReferTemplateList() {
        return this.ReferTemplateList;
    }

    /**
     * Set 关联模板列表
     * @param ReferTemplateList 关联模板列表
     */
    public void setReferTemplateList(TemplateInfo [] ReferTemplateList) {
        this.ReferTemplateList = ReferTemplateList;
    }

    public AssessmentRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessmentRiskItem(AssessmentRiskItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.ReferTemplateCount != null) {
            this.ReferTemplateCount = new Long(source.ReferTemplateCount);
        }
        if (source.SupportDataSource != null) {
            this.SupportDataSource = new String[source.SupportDataSource.length];
            for (int i = 0; i < source.SupportDataSource.length; i++) {
                this.SupportDataSource[i] = new String(source.SupportDataSource[i]);
            }
        }
        if (source.RiskSide != null) {
            this.RiskSide = new String(source.RiskSide);
        }
        if (source.ReferTemplateList != null) {
            this.ReferTemplateList = new TemplateInfo[source.ReferTemplateList.length];
            for (int i = 0; i < source.ReferTemplateList.length; i++) {
                this.ReferTemplateList[i] = new TemplateInfo(source.ReferTemplateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "ReferTemplateCount", this.ReferTemplateCount);
        this.setParamArraySimple(map, prefix + "SupportDataSource.", this.SupportDataSource);
        this.setParamSimple(map, prefix + "RiskSide", this.RiskSide);
        this.setParamArrayObj(map, prefix + "ReferTemplateList.", this.ReferTemplateList);

    }
}

