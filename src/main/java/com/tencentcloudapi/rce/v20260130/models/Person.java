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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Person extends AbstractModel {

    /**
    * <p>姓名全称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>性别</p>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>出生日期</p><p>参数格式：YYYY-MM-DD</p>
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * <p>学历</p>
    */
    @SerializedName("Degree")
    @Expose
    private String Degree;

    /**
    * <p>职业</p>
    */
    @SerializedName("Occupation")
    @Expose
    private String Occupation;

    /**
     * Get <p>姓名全称</p> 
     * @return Name <p>姓名全称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名全称</p>
     * @param Name <p>姓名全称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>性别</p> 
     * @return Gender <p>性别</p>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>性别</p>
     * @param Gender <p>性别</p>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>出生日期</p><p>参数格式：YYYY-MM-DD</p> 
     * @return Birthday <p>出生日期</p><p>参数格式：YYYY-MM-DD</p>
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set <p>出生日期</p><p>参数格式：YYYY-MM-DD</p>
     * @param Birthday <p>出生日期</p><p>参数格式：YYYY-MM-DD</p>
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get <p>学历</p> 
     * @return Degree <p>学历</p>
     */
    public String getDegree() {
        return this.Degree;
    }

    /**
     * Set <p>学历</p>
     * @param Degree <p>学历</p>
     */
    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    /**
     * Get <p>职业</p> 
     * @return Occupation <p>职业</p>
     */
    public String getOccupation() {
        return this.Occupation;
    }

    /**
     * Set <p>职业</p>
     * @param Occupation <p>职业</p>
     */
    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public Person() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Person(Person source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Degree != null) {
            this.Degree = new String(source.Degree);
        }
        if (source.Occupation != null) {
            this.Occupation = new String(source.Occupation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Degree", this.Degree);
        this.setParamSimple(map, prefix + "Occupation", this.Occupation);

    }
}

