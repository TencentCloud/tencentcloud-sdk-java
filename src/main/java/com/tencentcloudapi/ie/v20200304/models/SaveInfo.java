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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveInfo extends AbstractModel{

    /**
    * 存储类型，可选值： 
1：CosInfo。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Cos形式存储信息，当Type等于1时必选。
    */
    @SerializedName("CosInfo")
    @Expose
    private CosInfo CosInfo;

    /**
    * 存储信息ID标记，用于多个输出场景。部分任务支持多输出时，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 存储类型，可选值： 
1：CosInfo。 
     * @return Type 存储类型，可选值： 
1：CosInfo。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 存储类型，可选值： 
1：CosInfo。
     * @param Type 存储类型，可选值： 
1：CosInfo。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Cos形式存储信息，当Type等于1时必选。 
     * @return CosInfo Cos形式存储信息，当Type等于1时必选。
     */
    public CosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set Cos形式存储信息，当Type等于1时必选。
     * @param CosInfo Cos形式存储信息，当Type等于1时必选。
     */
    public void setCosInfo(CosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    /**
     * Get 存储信息ID标记，用于多个输出场景。部分任务支持多输出时，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。 
     * @return Id 存储信息ID标记，用于多个输出场景。部分任务支持多输出时，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 存储信息ID标记，用于多个输出场景。部分任务支持多输出时，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。
     * @param Id 存储信息ID标记，用于多个输出场景。部分任务支持多输出时，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public SaveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveInfo(SaveInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CosInfo != null) {
            this.CosInfo = new CosInfo(source.CosInfo);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

