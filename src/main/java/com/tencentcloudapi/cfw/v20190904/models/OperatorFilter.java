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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperatorFilter extends AbstractModel {

    /**
    * 过滤字段
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 匹配的值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 操作类型：
1：等于 field = value
2：大于 field > value
3：小于 field < value
4：大于等于 field >= value
5：小于等于 field <= value
6：不等于 field <> value
7：IN field IN (value1, value2...)
8：NOT IN field NOT IN (value1, value2...)
9：模糊匹配 field LIKE value
13：非模糊匹配 field NOT LIKE value
14：按位与 field & value = value
15：between and field between value1 and value2
    */
    @SerializedName("OperatorType")
    @Expose
    private Long OperatorType;

    /**
     * Get 过滤字段 
     * @return Name 过滤字段
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤字段
     * @param Name 过滤字段
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 匹配的值 
     * @return Values 匹配的值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 匹配的值
     * @param Values 匹配的值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 操作类型：
1：等于 field = value
2：大于 field > value
3：小于 field < value
4：大于等于 field >= value
5：小于等于 field <= value
6：不等于 field <> value
7：IN field IN (value1, value2...)
8：NOT IN field NOT IN (value1, value2...)
9：模糊匹配 field LIKE value
13：非模糊匹配 field NOT LIKE value
14：按位与 field & value = value
15：between and field between value1 and value2 
     * @return OperatorType 操作类型：
1：等于 field = value
2：大于 field > value
3：小于 field < value
4：大于等于 field >= value
5：小于等于 field <= value
6：不等于 field <> value
7：IN field IN (value1, value2...)
8：NOT IN field NOT IN (value1, value2...)
9：模糊匹配 field LIKE value
13：非模糊匹配 field NOT LIKE value
14：按位与 field & value = value
15：between and field between value1 and value2
     */
    public Long getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set 操作类型：
1：等于 field = value
2：大于 field > value
3：小于 field < value
4：大于等于 field >= value
5：小于等于 field <= value
6：不等于 field <> value
7：IN field IN (value1, value2...)
8：NOT IN field NOT IN (value1, value2...)
9：模糊匹配 field LIKE value
13：非模糊匹配 field NOT LIKE value
14：按位与 field & value = value
15：between and field between value1 and value2
     * @param OperatorType 操作类型：
1：等于 field = value
2：大于 field > value
3：小于 field < value
4：大于等于 field >= value
5：小于等于 field <= value
6：不等于 field <> value
7：IN field IN (value1, value2...)
8：NOT IN field NOT IN (value1, value2...)
9：模糊匹配 field LIKE value
13：非模糊匹配 field NOT LIKE value
14：按位与 field & value = value
15：between and field between value1 and value2
     */
    public void setOperatorType(Long OperatorType) {
        this.OperatorType = OperatorType;
    }

    public OperatorFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperatorFilter(OperatorFilter source) {
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

