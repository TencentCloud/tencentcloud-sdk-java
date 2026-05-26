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

public class ApiSecSensitiveWhiteRule extends AbstractModel {

    /**
    * <p>白名单规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>加白对象配置</p>
    */
    @SerializedName("ApiNameOp")
    @Expose
    private ApiNameOp [] ApiNameOp;

    /**
    * <p>加白模式</p><p>枚举值：</p><ul><li>1： 对整个API加白</li><li>2： 对指定字段加白</li></ul>
    */
    @SerializedName("WhiteMode")
    @Expose
    private Long WhiteMode;

    /**
    * <p>加白字段配置列表</p>
    */
    @SerializedName("WhiteFields")
    @Expose
    private ApiSecSensitiveWhiteField [] WhiteFields;

    /**
    * <p>规则开关</p><p>枚举值：</p><ul><li>0： 关</li><li>1： 开</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>规则描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>修改时间</p><p>单位：s</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>白名单规则名称</p> 
     * @return RuleName <p>白名单规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>白名单规则名称</p>
     * @param RuleName <p>白名单规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>加白对象配置</p> 
     * @return ApiNameOp <p>加白对象配置</p>
     */
    public ApiNameOp [] getApiNameOp() {
        return this.ApiNameOp;
    }

    /**
     * Set <p>加白对象配置</p>
     * @param ApiNameOp <p>加白对象配置</p>
     */
    public void setApiNameOp(ApiNameOp [] ApiNameOp) {
        this.ApiNameOp = ApiNameOp;
    }

    /**
     * Get <p>加白模式</p><p>枚举值：</p><ul><li>1： 对整个API加白</li><li>2： 对指定字段加白</li></ul> 
     * @return WhiteMode <p>加白模式</p><p>枚举值：</p><ul><li>1： 对整个API加白</li><li>2： 对指定字段加白</li></ul>
     */
    public Long getWhiteMode() {
        return this.WhiteMode;
    }

    /**
     * Set <p>加白模式</p><p>枚举值：</p><ul><li>1： 对整个API加白</li><li>2： 对指定字段加白</li></ul>
     * @param WhiteMode <p>加白模式</p><p>枚举值：</p><ul><li>1： 对整个API加白</li><li>2： 对指定字段加白</li></ul>
     */
    public void setWhiteMode(Long WhiteMode) {
        this.WhiteMode = WhiteMode;
    }

    /**
     * Get <p>加白字段配置列表</p> 
     * @return WhiteFields <p>加白字段配置列表</p>
     */
    public ApiSecSensitiveWhiteField [] getWhiteFields() {
        return this.WhiteFields;
    }

    /**
     * Set <p>加白字段配置列表</p>
     * @param WhiteFields <p>加白字段配置列表</p>
     */
    public void setWhiteFields(ApiSecSensitiveWhiteField [] WhiteFields) {
        this.WhiteFields = WhiteFields;
    }

    /**
     * Get <p>规则开关</p><p>枚举值：</p><ul><li>0： 关</li><li>1： 开</li></ul> 
     * @return Status <p>规则开关</p><p>枚举值：</p><ul><li>0： 关</li><li>1： 开</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>规则开关</p><p>枚举值：</p><ul><li>0： 关</li><li>1： 开</li></ul>
     * @param Status <p>规则开关</p><p>枚举值：</p><ul><li>0： 关</li><li>1： 开</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>规则描述</p> 
     * @return Description <p>规则描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规则描述</p>
     * @param Description <p>规则描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>修改时间</p><p>单位：s</p> 
     * @return UpdateTime <p>修改时间</p><p>单位：s</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间</p><p>单位：s</p>
     * @param UpdateTime <p>修改时间</p><p>单位：s</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ApiSecSensitiveWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecSensitiveWhiteRule(ApiSecSensitiveWhiteRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ApiNameOp != null) {
            this.ApiNameOp = new ApiNameOp[source.ApiNameOp.length];
            for (int i = 0; i < source.ApiNameOp.length; i++) {
                this.ApiNameOp[i] = new ApiNameOp(source.ApiNameOp[i]);
            }
        }
        if (source.WhiteMode != null) {
            this.WhiteMode = new Long(source.WhiteMode);
        }
        if (source.WhiteFields != null) {
            this.WhiteFields = new ApiSecSensitiveWhiteField[source.WhiteFields.length];
            for (int i = 0; i < source.WhiteFields.length; i++) {
                this.WhiteFields[i] = new ApiSecSensitiveWhiteField(source.WhiteFields[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "ApiNameOp.", this.ApiNameOp);
        this.setParamSimple(map, prefix + "WhiteMode", this.WhiteMode);
        this.setParamArrayObj(map, prefix + "WhiteFields.", this.WhiteFields);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

