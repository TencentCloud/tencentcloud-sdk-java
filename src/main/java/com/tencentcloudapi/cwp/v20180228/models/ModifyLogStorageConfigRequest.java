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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLogStorageConfigRequest extends AbstractModel{

    /**
    * 是否修改有效期
    */
    @SerializedName("IsModifyPeriod")
    @Expose
    private Boolean IsModifyPeriod;

    /**
    * 存储类型，string数组
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 日志存储天数，3640表示不限
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get 是否修改有效期 
     * @return IsModifyPeriod 是否修改有效期
     */
    public Boolean getIsModifyPeriod() {
        return this.IsModifyPeriod;
    }

    /**
     * Set 是否修改有效期
     * @param IsModifyPeriod 是否修改有效期
     */
    public void setIsModifyPeriod(Boolean IsModifyPeriod) {
        this.IsModifyPeriod = IsModifyPeriod;
    }

    /**
     * Get 存储类型，string数组 
     * @return Type 存储类型，string数组
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 存储类型，string数组
     * @param Type 存储类型，string数组
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 日志存储天数，3640表示不限 
     * @return Period 日志存储天数，3640表示不限
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 日志存储天数，3640表示不限
     * @param Period 日志存储天数，3640表示不限
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public ModifyLogStorageConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogStorageConfigRequest(ModifyLogStorageConfigRequest source) {
        if (source.IsModifyPeriod != null) {
            this.IsModifyPeriod = new Boolean(source.IsModifyPeriod);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsModifyPeriod", this.IsModifyPeriod);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

