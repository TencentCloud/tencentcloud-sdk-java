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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryUserFilter extends AbstractModel{

    /**
    * 属性key
    */
    @SerializedName("PropertyKey")
    @Expose
    private String PropertyKey;

    /**
    * 属性value
    */
    @SerializedName("PropertyValue")
    @Expose
    private String PropertyValue;

    /**
    * 逻辑值，等于true，不等于false
    */
    @SerializedName("Logic")
    @Expose
    private Boolean Logic;

    /**
    * 操作逻辑符（支持> < = >= <=  != between）
    */
    @SerializedName("OperateLogic")
    @Expose
    private String OperateLogic;

    /**
     * Get 属性key 
     * @return PropertyKey 属性key
     */
    public String getPropertyKey() {
        return this.PropertyKey;
    }

    /**
     * Set 属性key
     * @param PropertyKey 属性key
     */
    public void setPropertyKey(String PropertyKey) {
        this.PropertyKey = PropertyKey;
    }

    /**
     * Get 属性value 
     * @return PropertyValue 属性value
     */
    public String getPropertyValue() {
        return this.PropertyValue;
    }

    /**
     * Set 属性value
     * @param PropertyValue 属性value
     */
    public void setPropertyValue(String PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

    /**
     * Get 逻辑值，等于true，不等于false 
     * @return Logic 逻辑值，等于true，不等于false
     */
    public Boolean getLogic() {
        return this.Logic;
    }

    /**
     * Set 逻辑值，等于true，不等于false
     * @param Logic 逻辑值，等于true，不等于false
     */
    public void setLogic(Boolean Logic) {
        this.Logic = Logic;
    }

    /**
     * Get 操作逻辑符（支持> < = >= <=  != between） 
     * @return OperateLogic 操作逻辑符（支持> < = >= <=  != between）
     */
    public String getOperateLogic() {
        return this.OperateLogic;
    }

    /**
     * Set 操作逻辑符（支持> < = >= <=  != between）
     * @param OperateLogic 操作逻辑符（支持> < = >= <=  != between）
     */
    public void setOperateLogic(String OperateLogic) {
        this.OperateLogic = OperateLogic;
    }

    public QueryUserFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryUserFilter(QueryUserFilter source) {
        if (source.PropertyKey != null) {
            this.PropertyKey = new String(source.PropertyKey);
        }
        if (source.PropertyValue != null) {
            this.PropertyValue = new String(source.PropertyValue);
        }
        if (source.Logic != null) {
            this.Logic = new Boolean(source.Logic);
        }
        if (source.OperateLogic != null) {
            this.OperateLogic = new String(source.OperateLogic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropertyKey", this.PropertyKey);
        this.setParamSimple(map, prefix + "PropertyValue", this.PropertyValue);
        this.setParamSimple(map, prefix + "Logic", this.Logic);
        this.setParamSimple(map, prefix + "OperateLogic", this.OperateLogic);

    }
}

