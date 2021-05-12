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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckConfigDetail extends AbstractModel{

    /**
    * 检查项Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 检查项名称
    */
    @SerializedName("CheckName")
    @Expose
    private String CheckName;

    /**
    * 检查项内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 检查项处置方案
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 检查项帮助文档
    */
    @SerializedName("Doc")
    @Expose
    private String Doc;

    /**
    * 未通过总数
    */
    @SerializedName("ErrorCount")
    @Expose
    private Long ErrorCount;

    /**
    * 是否通过检查
    */
    @SerializedName("IsPass")
    @Expose
    private Long IsPass;

    /**
    * 通过检查项
    */
    @SerializedName("SafeCount")
    @Expose
    private Long SafeCount;

    /**
    * 忽略检查项
    */
    @SerializedName("IgnoreCount")
    @Expose
    private Long IgnoreCount;

    /**
    * 风险检查项
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 检查项英文
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * 检查项类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * res_count
    */
    @SerializedName("ResCount")
    @Expose
    private Long ResCount;

    /**
    * 是否忽略
    */
    @SerializedName("IsIgnore")
    @Expose
    private Long IsIgnore;

    /**
     * Get 检查项Id 
     * @return Id 检查项Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 检查项Id
     * @param Id 检查项Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 检查项名称 
     * @return CheckName 检查项名称
     */
    public String getCheckName() {
        return this.CheckName;
    }

    /**
     * Set 检查项名称
     * @param CheckName 检查项名称
     */
    public void setCheckName(String CheckName) {
        this.CheckName = CheckName;
    }

    /**
     * Get 检查项内容 
     * @return Content 检查项内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 检查项内容
     * @param Content 检查项内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 检查项处置方案 
     * @return Method 检查项处置方案
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 检查项处置方案
     * @param Method 检查项处置方案
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 检查项帮助文档 
     * @return Doc 检查项帮助文档
     */
    public String getDoc() {
        return this.Doc;
    }

    /**
     * Set 检查项帮助文档
     * @param Doc 检查项帮助文档
     */
    public void setDoc(String Doc) {
        this.Doc = Doc;
    }

    /**
     * Get 未通过总数 
     * @return ErrorCount 未通过总数
     */
    public Long getErrorCount() {
        return this.ErrorCount;
    }

    /**
     * Set 未通过总数
     * @param ErrorCount 未通过总数
     */
    public void setErrorCount(Long ErrorCount) {
        this.ErrorCount = ErrorCount;
    }

    /**
     * Get 是否通过检查 
     * @return IsPass 是否通过检查
     */
    public Long getIsPass() {
        return this.IsPass;
    }

    /**
     * Set 是否通过检查
     * @param IsPass 是否通过检查
     */
    public void setIsPass(Long IsPass) {
        this.IsPass = IsPass;
    }

    /**
     * Get 通过检查项 
     * @return SafeCount 通过检查项
     */
    public Long getSafeCount() {
        return this.SafeCount;
    }

    /**
     * Set 通过检查项
     * @param SafeCount 通过检查项
     */
    public void setSafeCount(Long SafeCount) {
        this.SafeCount = SafeCount;
    }

    /**
     * Get 忽略检查项 
     * @return IgnoreCount 忽略检查项
     */
    public Long getIgnoreCount() {
        return this.IgnoreCount;
    }

    /**
     * Set 忽略检查项
     * @param IgnoreCount 忽略检查项
     */
    public void setIgnoreCount(Long IgnoreCount) {
        this.IgnoreCount = IgnoreCount;
    }

    /**
     * Get 风险检查项 
     * @return RiskCount 风险检查项
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险检查项
     * @param RiskCount 风险检查项
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 检查项英文 
     * @return NameEn 检查项英文
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set 检查项英文
     * @param NameEn 检查项英文
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get 检查项类型 
     * @return AssetType 检查项类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 检查项类型
     * @param AssetType 检查项类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get res_count 
     * @return ResCount res_count
     */
    public Long getResCount() {
        return this.ResCount;
    }

    /**
     * Set res_count
     * @param ResCount res_count
     */
    public void setResCount(Long ResCount) {
        this.ResCount = ResCount;
    }

    /**
     * Get 是否忽略 
     * @return IsIgnore 是否忽略
     */
    public Long getIsIgnore() {
        return this.IsIgnore;
    }

    /**
     * Set 是否忽略
     * @param IsIgnore 是否忽略
     */
    public void setIsIgnore(Long IsIgnore) {
        this.IsIgnore = IsIgnore;
    }

    public CheckConfigDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckConfigDetail(CheckConfigDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CheckName != null) {
            this.CheckName = new String(source.CheckName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Doc != null) {
            this.Doc = new String(source.Doc);
        }
        if (source.ErrorCount != null) {
            this.ErrorCount = new Long(source.ErrorCount);
        }
        if (source.IsPass != null) {
            this.IsPass = new Long(source.IsPass);
        }
        if (source.SafeCount != null) {
            this.SafeCount = new Long(source.SafeCount);
        }
        if (source.IgnoreCount != null) {
            this.IgnoreCount = new Long(source.IgnoreCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ResCount != null) {
            this.ResCount = new Long(source.ResCount);
        }
        if (source.IsIgnore != null) {
            this.IsIgnore = new Long(source.IsIgnore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CheckName", this.CheckName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Doc", this.Doc);
        this.setParamSimple(map, prefix + "ErrorCount", this.ErrorCount);
        this.setParamSimple(map, prefix + "IsPass", this.IsPass);
        this.setParamSimple(map, prefix + "SafeCount", this.SafeCount);
        this.setParamSimple(map, prefix + "IgnoreCount", this.IgnoreCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ResCount", this.ResCount);
        this.setParamSimple(map, prefix + "IsIgnore", this.IsIgnore);

    }
}

