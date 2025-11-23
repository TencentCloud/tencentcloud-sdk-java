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

public class ApiSecPrivilegeRule extends AbstractModel {

    /**
    * 规则名称，不可重复
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 1:开，0:关
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 最多输入20个api
    */
    @SerializedName("ApiName")
    @Expose
    private String [] ApiName;

    /**
    * 鉴权位置
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 鉴权参数列表
    */
    @SerializedName("ParameterList")
    @Expose
    private String [] ParameterList;

    /**
    * 更新时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 规则来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 带有匹配方式的api列表
    */
    @SerializedName("ApiNameOp")
    @Expose
    private ApiNameOp [] ApiNameOp;

    /**
    * 应用对象取值，1表示手动填写，2表示从api资产中获取
    */
    @SerializedName("Option")
    @Expose
    private Long Option;

    /**
     * Get 规则名称，不可重复 
     * @return RuleName 规则名称，不可重复
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称，不可重复
     * @param RuleName 规则名称，不可重复
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 1:开，0:关 
     * @return Status 1:开，0:关
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1:开，0:关
     * @param Status 1:开，0:关
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 最多输入20个api 
     * @return ApiName 最多输入20个api
     */
    public String [] getApiName() {
        return this.ApiName;
    }

    /**
     * Set 最多输入20个api
     * @param ApiName 最多输入20个api
     */
    public void setApiName(String [] ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 鉴权位置 
     * @return Position 鉴权位置
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 鉴权位置
     * @param Position 鉴权位置
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 鉴权参数列表 
     * @return ParameterList 鉴权参数列表
     */
    public String [] getParameterList() {
        return this.ParameterList;
    }

    /**
     * Set 鉴权参数列表
     * @param ParameterList 鉴权参数列表
     */
    public void setParameterList(String [] ParameterList) {
        this.ParameterList = ParameterList;
    }

    /**
     * Get 更新时间戳 
     * @return UpdateTime 更新时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳
     * @param UpdateTime 更新时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 规则来源 
     * @return Source 规则来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 规则来源
     * @param Source 规则来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 带有匹配方式的api列表 
     * @return ApiNameOp 带有匹配方式的api列表
     */
    public ApiNameOp [] getApiNameOp() {
        return this.ApiNameOp;
    }

    /**
     * Set 带有匹配方式的api列表
     * @param ApiNameOp 带有匹配方式的api列表
     */
    public void setApiNameOp(ApiNameOp [] ApiNameOp) {
        this.ApiNameOp = ApiNameOp;
    }

    /**
     * Get 应用对象取值，1表示手动填写，2表示从api资产中获取 
     * @return Option 应用对象取值，1表示手动填写，2表示从api资产中获取
     */
    public Long getOption() {
        return this.Option;
    }

    /**
     * Set 应用对象取值，1表示手动填写，2表示从api资产中获取
     * @param Option 应用对象取值，1表示手动填写，2表示从api资产中获取
     */
    public void setOption(Long Option) {
        this.Option = Option;
    }

    public ApiSecPrivilegeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecPrivilegeRule(ApiSecPrivilegeRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ApiName != null) {
            this.ApiName = new String[source.ApiName.length];
            for (int i = 0; i < source.ApiName.length; i++) {
                this.ApiName[i] = new String(source.ApiName[i]);
            }
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.ParameterList != null) {
            this.ParameterList = new String[source.ParameterList.length];
            for (int i = 0; i < source.ParameterList.length; i++) {
                this.ParameterList[i] = new String(source.ParameterList[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ApiNameOp != null) {
            this.ApiNameOp = new ApiNameOp[source.ApiNameOp.length];
            for (int i = 0; i < source.ApiNameOp.length; i++) {
                this.ApiNameOp[i] = new ApiNameOp(source.ApiNameOp[i]);
            }
        }
        if (source.Option != null) {
            this.Option = new Long(source.Option);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ApiName.", this.ApiName);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamArraySimple(map, prefix + "ParameterList.", this.ParameterList);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArrayObj(map, prefix + "ApiNameOp.", this.ApiNameOp);
        this.setParamSimple(map, prefix + "Option", this.Option);

    }
}

