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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Subject extends AbstractModel {

    /**
    * 主体类型
    */
    @SerializedName("SubjectType")
    @Expose
    private String SubjectType;

    /**
    * 主体列表
    */
    @SerializedName("SubjectValues")
    @Expose
    private String [] SubjectValues;

    /**
     * Get 主体类型 
     * @return SubjectType 主体类型
     */
    public String getSubjectType() {
        return this.SubjectType;
    }

    /**
     * Set 主体类型
     * @param SubjectType 主体类型
     */
    public void setSubjectType(String SubjectType) {
        this.SubjectType = SubjectType;
    }

    /**
     * Get 主体列表 
     * @return SubjectValues 主体列表
     */
    public String [] getSubjectValues() {
        return this.SubjectValues;
    }

    /**
     * Set 主体列表
     * @param SubjectValues 主体列表
     */
    public void setSubjectValues(String [] SubjectValues) {
        this.SubjectValues = SubjectValues;
    }

    public Subject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Subject(Subject source) {
        if (source.SubjectType != null) {
            this.SubjectType = new String(source.SubjectType);
        }
        if (source.SubjectValues != null) {
            this.SubjectValues = new String[source.SubjectValues.length];
            for (int i = 0; i < source.SubjectValues.length; i++) {
                this.SubjectValues[i] = new String(source.SubjectValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubjectType", this.SubjectType);
        this.setParamArraySimple(map, prefix + "SubjectValues.", this.SubjectValues);

    }
}

