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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAclRuleRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ACL规则名
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * ACL规则匹配类型
    */
    @SerializedName("PatternType")
    @Expose
    private String PatternType;

    /**
    * 是否读取简略的ACL规则
    */
    @SerializedName("IsSimplified")
    @Expose
    private Boolean IsSimplified;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ACL规则名 
     * @return RuleName ACL规则名
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set ACL规则名
     * @param RuleName ACL规则名
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get ACL规则匹配类型 
     * @return PatternType ACL规则匹配类型
     */
    public String getPatternType() {
        return this.PatternType;
    }

    /**
     * Set ACL规则匹配类型
     * @param PatternType ACL规则匹配类型
     */
    public void setPatternType(String PatternType) {
        this.PatternType = PatternType;
    }

    /**
     * Get 是否读取简略的ACL规则 
     * @return IsSimplified 是否读取简略的ACL规则
     */
    public Boolean getIsSimplified() {
        return this.IsSimplified;
    }

    /**
     * Set 是否读取简略的ACL规则
     * @param IsSimplified 是否读取简略的ACL规则
     */
    public void setIsSimplified(Boolean IsSimplified) {
        this.IsSimplified = IsSimplified;
    }

    public DescribeAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAclRuleRequest(DescribeAclRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.PatternType != null) {
            this.PatternType = new String(source.PatternType);
        }
        if (source.IsSimplified != null) {
            this.IsSimplified = new Boolean(source.IsSimplified);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "PatternType", this.PatternType);
        this.setParamSimple(map, prefix + "IsSimplified", this.IsSimplified);

    }
}

