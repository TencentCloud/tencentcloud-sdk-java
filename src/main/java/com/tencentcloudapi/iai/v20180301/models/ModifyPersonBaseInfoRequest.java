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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonBaseInfoRequest extends AbstractModel{

    /**
    * 人员ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 需要修改的人员名称
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 需要修改的人员性别
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
     * Get 人员ID 
     * @return PersonId 人员ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID
     * @param PersonId 人员ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 需要修改的人员名称 
     * @return PersonName 需要修改的人员名称
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 需要修改的人员名称
     * @param PersonName 需要修改的人员名称
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 需要修改的人员性别 
     * @return Gender 需要修改的人员性别
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 需要修改的人员性别
     * @param Gender 需要修改的人员性别
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "Gender", this.Gender);

    }
}

