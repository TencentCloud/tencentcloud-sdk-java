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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneViralPersona extends AbstractModel {

    /**
    * <p>模特性别。male/female/any</p>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>年龄段。teenager/youth/middle_aged/senior</p>
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * <p>外观特征。caucasian/asian/latino/african/middle_eastern</p>
    */
    @SerializedName("Ethnicity")
    @Expose
    private String Ethnicity;

    /**
    * <p>体型。slim / standard / athletic / chubby</p>
    */
    @SerializedName("BodyType")
    @Expose
    private String BodyType;

    /**
     * Get <p>模特性别。male/female/any</p> 
     * @return Gender <p>模特性别。male/female/any</p>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>模特性别。male/female/any</p>
     * @param Gender <p>模特性别。male/female/any</p>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>年龄段。teenager/youth/middle_aged/senior</p> 
     * @return Age <p>年龄段。teenager/youth/middle_aged/senior</p>
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set <p>年龄段。teenager/youth/middle_aged/senior</p>
     * @param Age <p>年龄段。teenager/youth/middle_aged/senior</p>
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get <p>外观特征。caucasian/asian/latino/african/middle_eastern</p> 
     * @return Ethnicity <p>外观特征。caucasian/asian/latino/african/middle_eastern</p>
     */
    public String getEthnicity() {
        return this.Ethnicity;
    }

    /**
     * Set <p>外观特征。caucasian/asian/latino/african/middle_eastern</p>
     * @param Ethnicity <p>外观特征。caucasian/asian/latino/african/middle_eastern</p>
     */
    public void setEthnicity(String Ethnicity) {
        this.Ethnicity = Ethnicity;
    }

    /**
     * Get <p>体型。slim / standard / athletic / chubby</p> 
     * @return BodyType <p>体型。slim / standard / athletic / chubby</p>
     */
    public String getBodyType() {
        return this.BodyType;
    }

    /**
     * Set <p>体型。slim / standard / athletic / chubby</p>
     * @param BodyType <p>体型。slim / standard / athletic / chubby</p>
     */
    public void setBodyType(String BodyType) {
        this.BodyType = BodyType;
    }

    public CloneViralPersona() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralPersona(CloneViralPersona source) {
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Ethnicity != null) {
            this.Ethnicity = new String(source.Ethnicity);
        }
        if (source.BodyType != null) {
            this.BodyType = new String(source.BodyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Ethnicity", this.Ethnicity);
        this.setParamSimple(map, prefix + "BodyType", this.BodyType);

    }
}

