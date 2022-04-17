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

public class SocCheckResult extends AbstractModel{

    /**
    * 检查项的uuid
    */
    @SerializedName("CheckId")
    @Expose
    private String CheckId;

    /**
    * 配置要求
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检查项的类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 检查对象
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 策略名
    */
    @SerializedName("PloyName")
    @Expose
    private String PloyName;

    /**
    * 策略id
    */
    @SerializedName("PloyId")
    @Expose
    private Long PloyId;

    /**
    * 正常,低危,中危,高危
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 不符合数
    */
    @SerializedName("FailAssetNum")
    @Expose
    private Long FailAssetNum;

    /**
    * 总数
    */
    @SerializedName("TotalAssetNum")
    @Expose
    private Long TotalAssetNum;

    /**
    * 处置建议url链接
    */
    @SerializedName("DealUrl")
    @Expose
    private String DealUrl;

    /**
     * Get 检查项的uuid 
     * @return CheckId 检查项的uuid
     */
    public String getCheckId() {
        return this.CheckId;
    }

    /**
     * Set 检查项的uuid
     * @param CheckId 检查项的uuid
     */
    public void setCheckId(String CheckId) {
        this.CheckId = CheckId;
    }

    /**
     * Get 配置要求 
     * @return Name 配置要求
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置要求
     * @param Name 配置要求
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检查项的类型 
     * @return Type 检查项的类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 检查项的类型
     * @param Type 检查项的类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 检查对象 
     * @return AssetType 检查对象
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 检查对象
     * @param AssetType 检查对象
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 策略名 
     * @return PloyName 策略名
     */
    public String getPloyName() {
        return this.PloyName;
    }

    /**
     * Set 策略名
     * @param PloyName 策略名
     */
    public void setPloyName(String PloyName) {
        this.PloyName = PloyName;
    }

    /**
     * Get 策略id 
     * @return PloyId 策略id
     */
    public Long getPloyId() {
        return this.PloyId;
    }

    /**
     * Set 策略id
     * @param PloyId 策略id
     */
    public void setPloyId(Long PloyId) {
        this.PloyId = PloyId;
    }

    /**
     * Get 正常,低危,中危,高危 
     * @return Result 正常,低危,中危,高危
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 正常,低危,中危,高危
     * @param Result 正常,低危,中危,高危
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 不符合数 
     * @return FailAssetNum 不符合数
     */
    public Long getFailAssetNum() {
        return this.FailAssetNum;
    }

    /**
     * Set 不符合数
     * @param FailAssetNum 不符合数
     */
    public void setFailAssetNum(Long FailAssetNum) {
        this.FailAssetNum = FailAssetNum;
    }

    /**
     * Get 总数 
     * @return TotalAssetNum 总数
     */
    public Long getTotalAssetNum() {
        return this.TotalAssetNum;
    }

    /**
     * Set 总数
     * @param TotalAssetNum 总数
     */
    public void setTotalAssetNum(Long TotalAssetNum) {
        this.TotalAssetNum = TotalAssetNum;
    }

    /**
     * Get 处置建议url链接 
     * @return DealUrl 处置建议url链接
     */
    public String getDealUrl() {
        return this.DealUrl;
    }

    /**
     * Set 处置建议url链接
     * @param DealUrl 处置建议url链接
     */
    public void setDealUrl(String DealUrl) {
        this.DealUrl = DealUrl;
    }

    public SocCheckResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SocCheckResult(SocCheckResult source) {
        if (source.CheckId != null) {
            this.CheckId = new String(source.CheckId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.PloyName != null) {
            this.PloyName = new String(source.PloyName);
        }
        if (source.PloyId != null) {
            this.PloyId = new Long(source.PloyId);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.FailAssetNum != null) {
            this.FailAssetNum = new Long(source.FailAssetNum);
        }
        if (source.TotalAssetNum != null) {
            this.TotalAssetNum = new Long(source.TotalAssetNum);
        }
        if (source.DealUrl != null) {
            this.DealUrl = new String(source.DealUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckId", this.CheckId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "PloyName", this.PloyName);
        this.setParamSimple(map, prefix + "PloyId", this.PloyId);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "FailAssetNum", this.FailAssetNum);
        this.setParamSimple(map, prefix + "TotalAssetNum", this.TotalAssetNum);
        this.setParamSimple(map, prefix + "DealUrl", this.DealUrl);

    }
}

