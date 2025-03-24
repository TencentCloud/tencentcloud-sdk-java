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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLengthLimitCondition extends AbstractModel {

    /**
    * 匹配条件的参数名称，取值有：
<li>body_depth：请求正文包部分的检测深度。</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 匹配条件的参数值，取值与 Name 成对使用。
当 Name 值为 body_depth 时， Values 只支持传入单个值，取值有：
<li>10KB；</li>
<li>64KB；</li>
<li>128KB。</li>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 匹配条件的参数名称，取值有：
<li>body_depth：请求正文包部分的检测深度。</li> 
     * @return Name 匹配条件的参数名称，取值有：
<li>body_depth：请求正文包部分的检测深度。</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 匹配条件的参数名称，取值有：
<li>body_depth：请求正文包部分的检测深度。</li>
     * @param Name 匹配条件的参数名称，取值有：
<li>body_depth：请求正文包部分的检测深度。</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 匹配条件的参数值，取值与 Name 成对使用。
当 Name 值为 body_depth 时， Values 只支持传入单个值，取值有：
<li>10KB；</li>
<li>64KB；</li>
<li>128KB。</li> 
     * @return Values 匹配条件的参数值，取值与 Name 成对使用。
当 Name 值为 body_depth 时， Values 只支持传入单个值，取值有：
<li>10KB；</li>
<li>64KB；</li>
<li>128KB。</li>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 匹配条件的参数值，取值与 Name 成对使用。
当 Name 值为 body_depth 时， Values 只支持传入单个值，取值有：
<li>10KB；</li>
<li>64KB；</li>
<li>128KB。</li>
     * @param Values 匹配条件的参数值，取值与 Name 成对使用。
当 Name 值为 body_depth 时， Values 只支持传入单个值，取值有：
<li>10KB；</li>
<li>64KB；</li>
<li>128KB。</li>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public DetectLengthLimitCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectLengthLimitCondition(DetectLengthLimitCondition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

