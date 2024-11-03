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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiAsset extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 请求方法
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * api名称
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * 场景
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 数据标签
    */
    @SerializedName("Label")
    @Expose
    private String [] Label;

    /**
    * 过去7天是否活跃
    */
    @SerializedName("Active")
    @Expose
    private Boolean Active;

    /**
    * 最近更新时间
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * api发现时间
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * 资产状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 风险等级，100,200,300对应低中高
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 近30天调用量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否鉴权，1标识是，0表示否
    */
    @SerializedName("IsAuth")
    @Expose
    private Long IsAuth;

    /**
    * 如果添加了api入参检测规则，则此id返回值不为0
    */
    @SerializedName("ApiRequestRuleId")
    @Expose
    private Long ApiRequestRuleId;

    /**
    * 如果添加了api限流规则，则此id返回值不为0
    */
    @SerializedName("ApiLimitRuleId")
    @Expose
    private Long ApiLimitRuleId;

    /**
    * 对象接入和泛域名接入时，展示host列表
    */
    @SerializedName("HostList")
    @Expose
    private String [] HostList;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 请求方法 
     * @return Method 请求方法
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方法
     * @param Method 请求方法
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get api名称 
     * @return ApiName api名称
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set api名称
     * @param ApiName api名称
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 场景 
     * @return Scene 场景
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景
     * @param Scene 场景
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 数据标签 
     * @return Label 数据标签
     */
    public String [] getLabel() {
        return this.Label;
    }

    /**
     * Set 数据标签
     * @param Label 数据标签
     */
    public void setLabel(String [] Label) {
        this.Label = Label;
    }

    /**
     * Get 过去7天是否活跃 
     * @return Active 过去7天是否活跃
     */
    public Boolean getActive() {
        return this.Active;
    }

    /**
     * Set 过去7天是否活跃
     * @param Active 过去7天是否活跃
     */
    public void setActive(Boolean Active) {
        this.Active = Active;
    }

    /**
     * Get 最近更新时间 
     * @return Timestamp 最近更新时间
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 最近更新时间
     * @param Timestamp 最近更新时间
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get api发现时间 
     * @return InsertTime api发现时间
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set api发现时间
     * @param InsertTime api发现时间
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 资产状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略 
     * @return Mode 资产状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 资产状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
     * @param Mode 资产状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 风险等级，100,200,300对应低中高 
     * @return Level 风险等级，100,200,300对应低中高
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级，100,200,300对应低中高
     * @param Level 风险等级，100,200,300对应低中高
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 近30天调用量 
     * @return Count 近30天调用量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 近30天调用量
     * @param Count 近30天调用量
     */
    public void setCount(Long Count) {
        this.Count = Count;
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
     * Get 是否鉴权，1标识是，0表示否 
     * @return IsAuth 是否鉴权，1标识是，0表示否
     */
    public Long getIsAuth() {
        return this.IsAuth;
    }

    /**
     * Set 是否鉴权，1标识是，0表示否
     * @param IsAuth 是否鉴权，1标识是，0表示否
     */
    public void setIsAuth(Long IsAuth) {
        this.IsAuth = IsAuth;
    }

    /**
     * Get 如果添加了api入参检测规则，则此id返回值不为0 
     * @return ApiRequestRuleId 如果添加了api入参检测规则，则此id返回值不为0
     */
    public Long getApiRequestRuleId() {
        return this.ApiRequestRuleId;
    }

    /**
     * Set 如果添加了api入参检测规则，则此id返回值不为0
     * @param ApiRequestRuleId 如果添加了api入参检测规则，则此id返回值不为0
     */
    public void setApiRequestRuleId(Long ApiRequestRuleId) {
        this.ApiRequestRuleId = ApiRequestRuleId;
    }

    /**
     * Get 如果添加了api限流规则，则此id返回值不为0 
     * @return ApiLimitRuleId 如果添加了api限流规则，则此id返回值不为0
     */
    public Long getApiLimitRuleId() {
        return this.ApiLimitRuleId;
    }

    /**
     * Set 如果添加了api限流规则，则此id返回值不为0
     * @param ApiLimitRuleId 如果添加了api限流规则，则此id返回值不为0
     */
    public void setApiLimitRuleId(Long ApiLimitRuleId) {
        this.ApiLimitRuleId = ApiLimitRuleId;
    }

    /**
     * Get 对象接入和泛域名接入时，展示host列表 
     * @return HostList 对象接入和泛域名接入时，展示host列表
     */
    public String [] getHostList() {
        return this.HostList;
    }

    /**
     * Set 对象接入和泛域名接入时，展示host列表
     * @param HostList 对象接入和泛域名接入时，展示host列表
     */
    public void setHostList(String [] HostList) {
        this.HostList = HostList;
    }

    public ApiAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiAsset(ApiAsset source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Label != null) {
            this.Label = new String[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new String(source.Label[i]);
            }
        }
        if (source.Active != null) {
            this.Active = new Boolean(source.Active);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new Long(source.InsertTime);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsAuth != null) {
            this.IsAuth = new Long(source.IsAuth);
        }
        if (source.ApiRequestRuleId != null) {
            this.ApiRequestRuleId = new Long(source.ApiRequestRuleId);
        }
        if (source.ApiLimitRuleId != null) {
            this.ApiLimitRuleId = new Long(source.ApiLimitRuleId);
        }
        if (source.HostList != null) {
            this.HostList = new String[source.HostList.length];
            for (int i = 0; i < source.HostList.length; i++) {
                this.HostList[i] = new String(source.HostList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamArraySimple(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsAuth", this.IsAuth);
        this.setParamSimple(map, prefix + "ApiRequestRuleId", this.ApiRequestRuleId);
        this.setParamSimple(map, prefix + "ApiLimitRuleId", this.ApiLimitRuleId);
        this.setParamArraySimple(map, prefix + "HostList.", this.HostList);

    }
}

