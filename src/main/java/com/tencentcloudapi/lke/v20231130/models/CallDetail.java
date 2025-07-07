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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallDetail extends AbstractModel {

    /**
    * 关联ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 调用时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallTime")
    @Expose
    private String CallTime;

    /**
    * 总token消耗
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTokenUsage")
    @Expose
    private Float TotalTokenUsage;

    /**
    * 输入token消耗
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputTokenUsage")
    @Expose
    private Float InputTokenUsage;

    /**
    * 输出token消耗
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputTokenUsage")
    @Expose
    private Float OutputTokenUsage;

    /**
    * 搜索服务调用次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchUsage")
    @Expose
    private Long SearchUsage;

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 调用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallType")
    @Expose
    private String CallType;

    /**
    * 账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UinAccount")
    @Expose
    private String UinAccount;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 总消耗页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageUsage")
    @Expose
    private Long PageUsage;

    /**
    * 筛选子场景
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubScene")
    @Expose
    private String SubScene;

    /**
    * 账单明细对应的自定义tag
    */
    @SerializedName("BillingTag")
    @Expose
    private String BillingTag;

    /**
     * Get 关联ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 关联ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 关联ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 关联ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 调用时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallTime 调用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallTime() {
        return this.CallTime;
    }

    /**
     * Set 调用时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallTime 调用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallTime(String CallTime) {
        this.CallTime = CallTime;
    }

    /**
     * Get 总token消耗
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTokenUsage 总token消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalTokenUsage() {
        return this.TotalTokenUsage;
    }

    /**
     * Set 总token消耗
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTokenUsage 总token消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTokenUsage(Float TotalTokenUsage) {
        this.TotalTokenUsage = TotalTokenUsage;
    }

    /**
     * Get 输入token消耗
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputTokenUsage 输入token消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInputTokenUsage() {
        return this.InputTokenUsage;
    }

    /**
     * Set 输入token消耗
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputTokenUsage 输入token消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputTokenUsage(Float InputTokenUsage) {
        this.InputTokenUsage = InputTokenUsage;
    }

    /**
     * Get 输出token消耗
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputTokenUsage 输出token消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOutputTokenUsage() {
        return this.OutputTokenUsage;
    }

    /**
     * Set 输出token消耗
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputTokenUsage 输出token消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputTokenUsage(Float OutputTokenUsage) {
        this.OutputTokenUsage = OutputTokenUsage;
    }

    /**
     * Get 搜索服务调用次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchUsage 搜索服务调用次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSearchUsage() {
        return this.SearchUsage;
    }

    /**
     * Set 搜索服务调用次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchUsage 搜索服务调用次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchUsage(Long SearchUsage) {
        this.SearchUsage = SearchUsage;
    }

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 调用类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallType 调用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallType() {
        return this.CallType;
    }

    /**
     * Set 调用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallType 调用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallType(String CallType) {
        this.CallType = CallType;
    }

    /**
     * Get 账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UinAccount 账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUinAccount() {
        return this.UinAccount;
    }

    /**
     * Set 账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param UinAccount 账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUinAccount(String UinAccount) {
        this.UinAccount = UinAccount;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 总消耗页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageUsage 总消耗页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageUsage() {
        return this.PageUsage;
    }

    /**
     * Set 总消耗页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageUsage 总消耗页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageUsage(Long PageUsage) {
        this.PageUsage = PageUsage;
    }

    /**
     * Get 筛选子场景
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubScene 筛选子场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubScene() {
        return this.SubScene;
    }

    /**
     * Set 筛选子场景
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubScene 筛选子场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubScene(String SubScene) {
        this.SubScene = SubScene;
    }

    /**
     * Get 账单明细对应的自定义tag 
     * @return BillingTag 账单明细对应的自定义tag
     */
    public String getBillingTag() {
        return this.BillingTag;
    }

    /**
     * Set 账单明细对应的自定义tag
     * @param BillingTag 账单明细对应的自定义tag
     */
    public void setBillingTag(String BillingTag) {
        this.BillingTag = BillingTag;
    }

    public CallDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallDetail(CallDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CallTime != null) {
            this.CallTime = new String(source.CallTime);
        }
        if (source.TotalTokenUsage != null) {
            this.TotalTokenUsage = new Float(source.TotalTokenUsage);
        }
        if (source.InputTokenUsage != null) {
            this.InputTokenUsage = new Float(source.InputTokenUsage);
        }
        if (source.OutputTokenUsage != null) {
            this.OutputTokenUsage = new Float(source.OutputTokenUsage);
        }
        if (source.SearchUsage != null) {
            this.SearchUsage = new Long(source.SearchUsage);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.CallType != null) {
            this.CallType = new String(source.CallType);
        }
        if (source.UinAccount != null) {
            this.UinAccount = new String(source.UinAccount);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.PageUsage != null) {
            this.PageUsage = new Long(source.PageUsage);
        }
        if (source.SubScene != null) {
            this.SubScene = new String(source.SubScene);
        }
        if (source.BillingTag != null) {
            this.BillingTag = new String(source.BillingTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CallTime", this.CallTime);
        this.setParamSimple(map, prefix + "TotalTokenUsage", this.TotalTokenUsage);
        this.setParamSimple(map, prefix + "InputTokenUsage", this.InputTokenUsage);
        this.setParamSimple(map, prefix + "OutputTokenUsage", this.OutputTokenUsage);
        this.setParamSimple(map, prefix + "SearchUsage", this.SearchUsage);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "UinAccount", this.UinAccount);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PageUsage", this.PageUsage);
        this.setParamSimple(map, prefix + "SubScene", this.SubScene);
        this.setParamSimple(map, prefix + "BillingTag", this.BillingTag);

    }
}

