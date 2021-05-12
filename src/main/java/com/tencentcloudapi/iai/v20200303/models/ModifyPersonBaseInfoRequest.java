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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonBaseInfoRequest extends AbstractModel{

    /**
    * 人员ID，取值为创建人员接口中的PersonId
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
    * 需要修改的人员性别，1代表男性，2代表女性
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
     * Get 人员ID，取值为创建人员接口中的PersonId 
     * @return PersonId 人员ID，取值为创建人员接口中的PersonId
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID，取值为创建人员接口中的PersonId
     * @param PersonId 人员ID，取值为创建人员接口中的PersonId
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
     * Get 需要修改的人员性别，1代表男性，2代表女性 
     * @return Gender 需要修改的人员性别，1代表男性，2代表女性
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 需要修改的人员性别，1代表男性，2代表女性
     * @param Gender 需要修改的人员性别，1代表男性，2代表女性
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    public ModifyPersonBaseInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPersonBaseInfoRequest(ModifyPersonBaseInfoRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
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

