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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConditionInfo extends AbstractModel {

    /**
    * 条件属性，目前只支持VpcID
    */
    @SerializedName("Attributes")
    @Expose
    private String Attributes;

    /**
    * 条件规则，1:等于，2:不等于
    */
    @SerializedName("Rule")
    @Expose
    private Long Rule;

    /**
    * 对应条件属性的值
    */
    @SerializedName("ConditionValue")
    @Expose
    private String ConditionValue;

    /**
     * Get 条件属性，目前只支持VpcID 
     * @return Attributes 条件属性，目前只支持VpcID
     */
    public String getAttributes() {
        return this.Attributes;
    }

    /**
     * Set 条件属性，目前只支持VpcID
     * @param Attributes 条件属性，目前只支持VpcID
     */
    public void setAttributes(String Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get 条件规则，1:等于，2:不等于 
     * @return Rule 条件规则，1:等于，2:不等于
     */
    public Long getRule() {
        return this.Rule;
    }

    /**
     * Set 条件规则，1:等于，2:不等于
     * @param Rule 条件规则，1:等于，2:不等于
     */
    public void setRule(Long Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 对应条件属性的值 
     * @return ConditionValue 对应条件属性的值
     */
    public String getConditionValue() {
        return this.ConditionValue;
    }

    /**
     * Set 对应条件属性的值
     * @param ConditionValue 对应条件属性的值
     */
    public void setConditionValue(String ConditionValue) {
        this.ConditionValue = ConditionValue;
    }

    public ConditionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConditionInfo(ConditionInfo source) {
        if (source.Attributes != null) {
            this.Attributes = new String(source.Attributes);
        }
        if (source.Rule != null) {
            this.Rule = new Long(source.Rule);
        }
        if (source.ConditionValue != null) {
            this.ConditionValue = new String(source.ConditionValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Attributes", this.Attributes);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "ConditionValue", this.ConditionValue);

    }
}

