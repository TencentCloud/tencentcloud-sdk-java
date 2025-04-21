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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UCBEntryValue extends AbstractModel {

    /**
    * string类型值
    */
    @SerializedName("BasicValue")
    @Expose
    private String BasicValue;

    /**
    * 布尔类型值
    */
    @SerializedName("LogicValue")
    @Expose
    private Boolean LogicValue;

    /**
    * string数组类型值
    */
    @SerializedName("BelongValue")
    @Expose
    private String [] BelongValue;

    /**
    * 指示有效的字段
    */
    @SerializedName("ValidKey")
    @Expose
    private String ValidKey;

    /**
    * string数组类型值
    */
    @SerializedName("MultiValue")
    @Expose
    private String [] MultiValue;

    /**
     * Get string类型值 
     * @return BasicValue string类型值
     */
    public String getBasicValue() {
        return this.BasicValue;
    }

    /**
     * Set string类型值
     * @param BasicValue string类型值
     */
    public void setBasicValue(String BasicValue) {
        this.BasicValue = BasicValue;
    }

    /**
     * Get 布尔类型值 
     * @return LogicValue 布尔类型值
     */
    public Boolean getLogicValue() {
        return this.LogicValue;
    }

    /**
     * Set 布尔类型值
     * @param LogicValue 布尔类型值
     */
    public void setLogicValue(Boolean LogicValue) {
        this.LogicValue = LogicValue;
    }

    /**
     * Get string数组类型值 
     * @return BelongValue string数组类型值
     */
    public String [] getBelongValue() {
        return this.BelongValue;
    }

    /**
     * Set string数组类型值
     * @param BelongValue string数组类型值
     */
    public void setBelongValue(String [] BelongValue) {
        this.BelongValue = BelongValue;
    }

    /**
     * Get 指示有效的字段 
     * @return ValidKey 指示有效的字段
     */
    public String getValidKey() {
        return this.ValidKey;
    }

    /**
     * Set 指示有效的字段
     * @param ValidKey 指示有效的字段
     */
    public void setValidKey(String ValidKey) {
        this.ValidKey = ValidKey;
    }

    /**
     * Get string数组类型值 
     * @return MultiValue string数组类型值
     */
    public String [] getMultiValue() {
        return this.MultiValue;
    }

    /**
     * Set string数组类型值
     * @param MultiValue string数组类型值
     */
    public void setMultiValue(String [] MultiValue) {
        this.MultiValue = MultiValue;
    }

    public UCBEntryValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UCBEntryValue(UCBEntryValue source) {
        if (source.BasicValue != null) {
            this.BasicValue = new String(source.BasicValue);
        }
        if (source.LogicValue != null) {
            this.LogicValue = new Boolean(source.LogicValue);
        }
        if (source.BelongValue != null) {
            this.BelongValue = new String[source.BelongValue.length];
            for (int i = 0; i < source.BelongValue.length; i++) {
                this.BelongValue[i] = new String(source.BelongValue[i]);
            }
        }
        if (source.ValidKey != null) {
            this.ValidKey = new String(source.ValidKey);
        }
        if (source.MultiValue != null) {
            this.MultiValue = new String[source.MultiValue.length];
            for (int i = 0; i < source.MultiValue.length; i++) {
                this.MultiValue[i] = new String(source.MultiValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BasicValue", this.BasicValue);
        this.setParamSimple(map, prefix + "LogicValue", this.LogicValue);
        this.setParamArraySimple(map, prefix + "BelongValue.", this.BelongValue);
        this.setParamSimple(map, prefix + "ValidKey", this.ValidKey);
        this.setParamArraySimple(map, prefix + "MultiValue.", this.MultiValue);

    }
}

