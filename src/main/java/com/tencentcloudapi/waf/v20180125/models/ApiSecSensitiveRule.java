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

public class ApiSecSensitiveRule extends AbstractModel {

    /**
    * 身份证号，唯一主键
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 表示OS系统内置，"custom"表示客户自定义
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 开关状态，0：表示关，1表示开
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 风险等级，100，200,300表示低中高三个等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 修改时间，默认0，表示没有进行修改
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 自定义规则部分
    */
    @SerializedName("CustomRule")
    @Expose
    private ApiSecCustomSensitiveRule CustomRule;

    /**
    * 是否泛化 0:不泛化，1:泛化
    */
    @SerializedName("IsPan")
    @Expose
    private Long IsPan;

    /**
     * Get 身份证号，唯一主键 
     * @return RuleName 身份证号，唯一主键
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 身份证号，唯一主键
     * @param RuleName 身份证号，唯一主键
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 表示OS系统内置，"custom"表示客户自定义 
     * @return Source 表示OS系统内置，"custom"表示客户自定义
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 表示OS系统内置，"custom"表示客户自定义
     * @param Source 表示OS系统内置，"custom"表示客户自定义
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 开关状态，0：表示关，1表示开 
     * @return Status 开关状态，0：表示关，1表示开
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态，0：表示关，1表示开
     * @param Status 开关状态，0：表示关，1表示开
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 风险等级，100，200,300表示低中高三个等级 
     * @return Level 风险等级，100，200,300表示低中高三个等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级，100，200,300表示低中高三个等级
     * @param Level 风险等级，100，200,300表示低中高三个等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 修改时间，默认0，表示没有进行修改 
     * @return Timestamp 修改时间，默认0，表示没有进行修改
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 修改时间，默认0，表示没有进行修改
     * @param Timestamp 修改时间，默认0，表示没有进行修改
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 自定义规则部分 
     * @return CustomRule 自定义规则部分
     */
    public ApiSecCustomSensitiveRule getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set 自定义规则部分
     * @param CustomRule 自定义规则部分
     */
    public void setCustomRule(ApiSecCustomSensitiveRule CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get 是否泛化 0:不泛化，1:泛化 
     * @return IsPan 是否泛化 0:不泛化，1:泛化
     */
    public Long getIsPan() {
        return this.IsPan;
    }

    /**
     * Set 是否泛化 0:不泛化，1:泛化
     * @param IsPan 是否泛化 0:不泛化，1:泛化
     */
    public void setIsPan(Long IsPan) {
        this.IsPan = IsPan;
    }

    public ApiSecSensitiveRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecSensitiveRule(ApiSecSensitiveRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.CustomRule != null) {
            this.CustomRule = new ApiSecCustomSensitiveRule(source.CustomRule);
        }
        if (source.IsPan != null) {
            this.IsPan = new Long(source.IsPan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamObj(map, prefix + "CustomRule.", this.CustomRule);
        this.setParamSimple(map, prefix + "IsPan", this.IsPan);

    }
}

