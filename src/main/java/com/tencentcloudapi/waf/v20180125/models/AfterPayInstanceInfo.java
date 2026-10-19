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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AfterPayInstanceInfo extends AbstractModel {

    /**
    * <p>用户appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>实例唯一ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例对应资源ID，计费使用</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * <p>实例版本，后付费实例固定为 llm-sdk-waf</p>
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * <p>实例所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>付费模式，后付费实例为 0</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>实例过期时间</p>
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * <p>实例开始时间</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>计费项</p>
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * <p>自动续费标识。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>实例套餐版本</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>实例修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>域名数量上限</p>
    */
    @SerializedName("SubDomainLimit")
    @Expose
    private Long SubDomainLimit;

    /**
    * <p>主域名数量上限</p>
    */
    @SerializedName("MainDomainLimit")
    @Expose
    private Long MainDomainLimit;

    /**
    * <p>qps弹性计费上限</p>
    */
    @SerializedName("ElasticBilling")
    @Expose
    private Long ElasticBilling;

    /**
    * <p>攻击日志投递开关</p>
    */
    @SerializedName("AttackLogPost")
    @Expose
    private Long AttackLogPost;

    /**
    * <p>api安全是否购买</p>
    */
    @SerializedName("APISecurity")
    @Expose
    private Long APISecurity;

    /**
    * <p>是否api 安全试用</p>
    */
    @SerializedName("IsAPISecurityTrial")
    @Expose
    private Long IsAPISecurityTrial;

    /**
    * <p>实例延期释放标识</p>
    */
    @SerializedName("FreeDelayFlag")
    @Expose
    private Long FreeDelayFlag;

    /**
    * <p>1是基础2025版本；0不是</p>
    */
    @SerializedName("BasicFlag")
    @Expose
    private Long BasicFlag;

    /**
    * <p>大模型安全「后付费」资源信息，结构与内容与 DescribeInstances 的 InstanceDetail.LLMPkg 保持一致</p>
    */
    @SerializedName("LLMPkg")
    @Expose
    private LLMPkg LLMPkg;

    /**
    * <p>LLM实例当天4个计费模块token消耗量及近7天趋势（仅后付费llm-sdk-waf实例返回）</p>
    */
    @SerializedName("LLMTokenUsage")
    @Expose
    private LLMTokenUsage LLMTokenUsage;

    /**
     * Get <p>用户appid</p> 
     * @return AppId <p>用户appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户appid</p>
     * @param AppId <p>用户appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>实例唯一ID</p> 
     * @return InstanceId <p>实例唯一ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例唯一ID</p>
     * @param InstanceId <p>实例唯一ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例对应资源ID，计费使用</p> 
     * @return ResourceIds <p>实例对应资源ID，计费使用</p>
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>实例对应资源ID，计费使用</p>
     * @param ResourceIds <p>实例对应资源ID，计费使用</p>
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>实例版本，后付费实例固定为 llm-sdk-waf</p> 
     * @return Edition <p>实例版本，后付费实例固定为 llm-sdk-waf</p>
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set <p>实例版本，后付费实例固定为 llm-sdk-waf</p>
     * @param Edition <p>实例版本，后付费实例固定为 llm-sdk-waf</p>
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get <p>实例所属地域</p> 
     * @return Region <p>实例所属地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所属地域</p>
     * @param Region <p>实例所属地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>付费模式，后付费实例为 0</p> 
     * @return PayMode <p>付费模式，后付费实例为 0</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式，后付费实例为 0</p>
     * @param PayMode <p>付费模式，后付费实例为 0</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>实例过期时间</p> 
     * @return ValidTime <p>实例过期时间</p>
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set <p>实例过期时间</p>
     * @param ValidTime <p>实例过期时间</p>
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get <p>实例开始时间</p> 
     * @return BeginTime <p>实例开始时间</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>实例开始时间</p>
     * @param BeginTime <p>实例开始时间</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>计费项</p> 
     * @return BillingItem <p>计费项</p>
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set <p>计费项</p>
     * @param BillingItem <p>计费项</p>
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get <p>自动续费标识。<br>0：关闭<br>1：开启</p> 
     * @return RenewFlag <p>自动续费标识。<br>0：关闭<br>1：开启</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识。<br>0：关闭<br>1：开启</p>
     * @param RenewFlag <p>自动续费标识。<br>0：关闭<br>1：开启</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>实例套餐版本</p> 
     * @return Level <p>实例套餐版本</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>实例套餐版本</p>
     * @param Level <p>实例套餐版本</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>实例修改时间</p> 
     * @return ModifyTime <p>实例修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>实例修改时间</p>
     * @param ModifyTime <p>实例修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>域名数量上限</p> 
     * @return SubDomainLimit <p>域名数量上限</p>
     */
    public Long getSubDomainLimit() {
        return this.SubDomainLimit;
    }

    /**
     * Set <p>域名数量上限</p>
     * @param SubDomainLimit <p>域名数量上限</p>
     */
    public void setSubDomainLimit(Long SubDomainLimit) {
        this.SubDomainLimit = SubDomainLimit;
    }

    /**
     * Get <p>主域名数量上限</p> 
     * @return MainDomainLimit <p>主域名数量上限</p>
     */
    public Long getMainDomainLimit() {
        return this.MainDomainLimit;
    }

    /**
     * Set <p>主域名数量上限</p>
     * @param MainDomainLimit <p>主域名数量上限</p>
     */
    public void setMainDomainLimit(Long MainDomainLimit) {
        this.MainDomainLimit = MainDomainLimit;
    }

    /**
     * Get <p>qps弹性计费上限</p> 
     * @return ElasticBilling <p>qps弹性计费上限</p>
     */
    public Long getElasticBilling() {
        return this.ElasticBilling;
    }

    /**
     * Set <p>qps弹性计费上限</p>
     * @param ElasticBilling <p>qps弹性计费上限</p>
     */
    public void setElasticBilling(Long ElasticBilling) {
        this.ElasticBilling = ElasticBilling;
    }

    /**
     * Get <p>攻击日志投递开关</p> 
     * @return AttackLogPost <p>攻击日志投递开关</p>
     */
    public Long getAttackLogPost() {
        return this.AttackLogPost;
    }

    /**
     * Set <p>攻击日志投递开关</p>
     * @param AttackLogPost <p>攻击日志投递开关</p>
     */
    public void setAttackLogPost(Long AttackLogPost) {
        this.AttackLogPost = AttackLogPost;
    }

    /**
     * Get <p>api安全是否购买</p> 
     * @return APISecurity <p>api安全是否购买</p>
     */
    public Long getAPISecurity() {
        return this.APISecurity;
    }

    /**
     * Set <p>api安全是否购买</p>
     * @param APISecurity <p>api安全是否购买</p>
     */
    public void setAPISecurity(Long APISecurity) {
        this.APISecurity = APISecurity;
    }

    /**
     * Get <p>是否api 安全试用</p> 
     * @return IsAPISecurityTrial <p>是否api 安全试用</p>
     */
    public Long getIsAPISecurityTrial() {
        return this.IsAPISecurityTrial;
    }

    /**
     * Set <p>是否api 安全试用</p>
     * @param IsAPISecurityTrial <p>是否api 安全试用</p>
     */
    public void setIsAPISecurityTrial(Long IsAPISecurityTrial) {
        this.IsAPISecurityTrial = IsAPISecurityTrial;
    }

    /**
     * Get <p>实例延期释放标识</p> 
     * @return FreeDelayFlag <p>实例延期释放标识</p>
     */
    public Long getFreeDelayFlag() {
        return this.FreeDelayFlag;
    }

    /**
     * Set <p>实例延期释放标识</p>
     * @param FreeDelayFlag <p>实例延期释放标识</p>
     */
    public void setFreeDelayFlag(Long FreeDelayFlag) {
        this.FreeDelayFlag = FreeDelayFlag;
    }

    /**
     * Get <p>1是基础2025版本；0不是</p> 
     * @return BasicFlag <p>1是基础2025版本；0不是</p>
     */
    public Long getBasicFlag() {
        return this.BasicFlag;
    }

    /**
     * Set <p>1是基础2025版本；0不是</p>
     * @param BasicFlag <p>1是基础2025版本；0不是</p>
     */
    public void setBasicFlag(Long BasicFlag) {
        this.BasicFlag = BasicFlag;
    }

    /**
     * Get <p>大模型安全「后付费」资源信息，结构与内容与 DescribeInstances 的 InstanceDetail.LLMPkg 保持一致</p> 
     * @return LLMPkg <p>大模型安全「后付费」资源信息，结构与内容与 DescribeInstances 的 InstanceDetail.LLMPkg 保持一致</p>
     */
    public LLMPkg getLLMPkg() {
        return this.LLMPkg;
    }

    /**
     * Set <p>大模型安全「后付费」资源信息，结构与内容与 DescribeInstances 的 InstanceDetail.LLMPkg 保持一致</p>
     * @param LLMPkg <p>大模型安全「后付费」资源信息，结构与内容与 DescribeInstances 的 InstanceDetail.LLMPkg 保持一致</p>
     */
    public void setLLMPkg(LLMPkg LLMPkg) {
        this.LLMPkg = LLMPkg;
    }

    /**
     * Get <p>LLM实例当天4个计费模块token消耗量及近7天趋势（仅后付费llm-sdk-waf实例返回）</p> 
     * @return LLMTokenUsage <p>LLM实例当天4个计费模块token消耗量及近7天趋势（仅后付费llm-sdk-waf实例返回）</p>
     */
    public LLMTokenUsage getLLMTokenUsage() {
        return this.LLMTokenUsage;
    }

    /**
     * Set <p>LLM实例当天4个计费模块token消耗量及近7天趋势（仅后付费llm-sdk-waf实例返回）</p>
     * @param LLMTokenUsage <p>LLM实例当天4个计费模块token消耗量及近7天趋势（仅后付费llm-sdk-waf实例返回）</p>
     */
    public void setLLMTokenUsage(LLMTokenUsage LLMTokenUsage) {
        this.LLMTokenUsage = LLMTokenUsage;
    }

    public AfterPayInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AfterPayInstanceInfo(AfterPayInstanceInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new String(source.ValidTime);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.SubDomainLimit != null) {
            this.SubDomainLimit = new Long(source.SubDomainLimit);
        }
        if (source.MainDomainLimit != null) {
            this.MainDomainLimit = new Long(source.MainDomainLimit);
        }
        if (source.ElasticBilling != null) {
            this.ElasticBilling = new Long(source.ElasticBilling);
        }
        if (source.AttackLogPost != null) {
            this.AttackLogPost = new Long(source.AttackLogPost);
        }
        if (source.APISecurity != null) {
            this.APISecurity = new Long(source.APISecurity);
        }
        if (source.IsAPISecurityTrial != null) {
            this.IsAPISecurityTrial = new Long(source.IsAPISecurityTrial);
        }
        if (source.FreeDelayFlag != null) {
            this.FreeDelayFlag = new Long(source.FreeDelayFlag);
        }
        if (source.BasicFlag != null) {
            this.BasicFlag = new Long(source.BasicFlag);
        }
        if (source.LLMPkg != null) {
            this.LLMPkg = new LLMPkg(source.LLMPkg);
        }
        if (source.LLMTokenUsage != null) {
            this.LLMTokenUsage = new LLMTokenUsage(source.LLMTokenUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "SubDomainLimit", this.SubDomainLimit);
        this.setParamSimple(map, prefix + "MainDomainLimit", this.MainDomainLimit);
        this.setParamSimple(map, prefix + "ElasticBilling", this.ElasticBilling);
        this.setParamSimple(map, prefix + "AttackLogPost", this.AttackLogPost);
        this.setParamSimple(map, prefix + "APISecurity", this.APISecurity);
        this.setParamSimple(map, prefix + "IsAPISecurityTrial", this.IsAPISecurityTrial);
        this.setParamSimple(map, prefix + "FreeDelayFlag", this.FreeDelayFlag);
        this.setParamSimple(map, prefix + "BasicFlag", this.BasicFlag);
        this.setParamObj(map, prefix + "LLMPkg.", this.LLMPkg);
        this.setParamObj(map, prefix + "LLMTokenUsage.", this.LLMTokenUsage);

    }
}

