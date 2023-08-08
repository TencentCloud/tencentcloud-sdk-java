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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhereFilter extends AbstractModel{

    /**
    * 过滤的项
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤的值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 中台定义：
1等于 2大于 3小于 4大于等于 5小于等于 6不等于 9模糊匹配 13非模糊匹配 14按位与
精确匹配填 7 模糊匹配填9 兼容 中台定的结构

    */
    @SerializedName("OperatorType")
    @Expose
    private Long OperatorType;

    /**
     * Get 过滤的项 
     * @return Name 过滤的项
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤的项
     * @param Name 过滤的项
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤的值 
     * @return Values 过滤的值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤的值
     * @param Values 过滤的值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 中台定义：
1等于 2大于 3小于 4大于等于 5小于等于 6不等于 9模糊匹配 13非模糊匹配 14按位与
精确匹配填 7 模糊匹配填9 兼容 中台定的结构
 
     * @return OperatorType 中台定义：
1等于 2大于 3小于 4大于等于 5小于等于 6不等于 9模糊匹配 13非模糊匹配 14按位与
精确匹配填 7 模糊匹配填9 兼容 中台定的结构

     */
    public Long getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set 中台定义：
1等于 2大于 3小于 4大于等于 5小于等于 6不等于 9模糊匹配 13非模糊匹配 14按位与
精确匹配填 7 模糊匹配填9 兼容 中台定的结构

     * @param OperatorType 中台定义：
1等于 2大于 3小于 4大于等于 5小于等于 6不等于 9模糊匹配 13非模糊匹配 14按位与
精确匹配填 7 模糊匹配填9 兼容 中台定的结构

     */
    public void setOperatorType(Long OperatorType) {
        this.OperatorType = OperatorType;
    }

    public WhereFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhereFilter(WhereFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.OperatorType != null) {
            this.OperatorType = new Long(source.OperatorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "OperatorType", this.OperatorType);

    }
}

