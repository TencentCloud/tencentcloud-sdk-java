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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceAttrResult extends AbstractModel{

    /**
    * 年龄
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
     * Get 年龄 
     * @return Age 年龄
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 年龄
     * @param Age 年龄
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 性别 
     * @return Sex 性别
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
     * @param Sex 性别
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Sex", this.Sex);

    }
}

