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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleStatisticsItem extends AbstractModel {

    /**
    * <p>名称</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>统计信息</p>
    */
    @SerializedName("Count")
    @Expose
    private String Count;

    /**
     * Get <p>名称</p> 
     * @return Text <p>名称</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>名称</p>
     * @param Text <p>名称</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>值</p> 
     * @return Value <p>值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>值</p>
     * @param Value <p>值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>统计信息</p> 
     * @return Count <p>统计信息</p>
     */
    public String getCount() {
        return this.Count;
    }

    /**
     * Set <p>统计信息</p>
     * @param Count <p>统计信息</p>
     */
    public void setCount(String Count) {
        this.Count = Count;
    }

    public RuleStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleStatisticsItem(RuleStatisticsItem source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Count != null) {
            this.Count = new String(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

