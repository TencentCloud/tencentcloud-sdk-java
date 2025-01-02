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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Department extends AbstractModel {

    /**
    * 科室ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 科室名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 科室类型 0:门诊  1:住院  2:门诊+住院
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 门诊区开关 true:此科室对应的门诊区开启智能审方功能, false:此科室对应的门诊区关闭智能审方功能; 仅对scope为0/2的科室生效
    */
    @SerializedName("OutpatientOn")
    @Expose
    private Boolean OutpatientOn;

    /**
    * 住院区开关 true:此科室对应的住院区开启智能审方功能, false:此科室对应的住院区关闭智能审方功能; 仅对scope为1/2的科室生效
    */
    @SerializedName("InHospitalOn")
    @Expose
    private Boolean InHospitalOn;

    /**
     * Get 科室ID 
     * @return Id 科室ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 科室ID
     * @param Id 科室ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 科室名称 
     * @return Name 科室名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 科室名称
     * @param Name 科室名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 科室类型 0:门诊  1:住院  2:门诊+住院 
     * @return Scope 科室类型 0:门诊  1:住院  2:门诊+住院
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 科室类型 0:门诊  1:住院  2:门诊+住院
     * @param Scope 科室类型 0:门诊  1:住院  2:门诊+住院
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 门诊区开关 true:此科室对应的门诊区开启智能审方功能, false:此科室对应的门诊区关闭智能审方功能; 仅对scope为0/2的科室生效 
     * @return OutpatientOn 门诊区开关 true:此科室对应的门诊区开启智能审方功能, false:此科室对应的门诊区关闭智能审方功能; 仅对scope为0/2的科室生效
     */
    public Boolean getOutpatientOn() {
        return this.OutpatientOn;
    }

    /**
     * Set 门诊区开关 true:此科室对应的门诊区开启智能审方功能, false:此科室对应的门诊区关闭智能审方功能; 仅对scope为0/2的科室生效
     * @param OutpatientOn 门诊区开关 true:此科室对应的门诊区开启智能审方功能, false:此科室对应的门诊区关闭智能审方功能; 仅对scope为0/2的科室生效
     */
    public void setOutpatientOn(Boolean OutpatientOn) {
        this.OutpatientOn = OutpatientOn;
    }

    /**
     * Get 住院区开关 true:此科室对应的住院区开启智能审方功能, false:此科室对应的住院区关闭智能审方功能; 仅对scope为1/2的科室生效 
     * @return InHospitalOn 住院区开关 true:此科室对应的住院区开启智能审方功能, false:此科室对应的住院区关闭智能审方功能; 仅对scope为1/2的科室生效
     */
    public Boolean getInHospitalOn() {
        return this.InHospitalOn;
    }

    /**
     * Set 住院区开关 true:此科室对应的住院区开启智能审方功能, false:此科室对应的住院区关闭智能审方功能; 仅对scope为1/2的科室生效
     * @param InHospitalOn 住院区开关 true:此科室对应的住院区开启智能审方功能, false:此科室对应的住院区关闭智能审方功能; 仅对scope为1/2的科室生效
     */
    public void setInHospitalOn(Boolean InHospitalOn) {
        this.InHospitalOn = InHospitalOn;
    }

    public Department() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Department(Department source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.OutpatientOn != null) {
            this.OutpatientOn = new Boolean(source.OutpatientOn);
        }
        if (source.InHospitalOn != null) {
            this.InHospitalOn = new Boolean(source.InHospitalOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "OutpatientOn", this.OutpatientOn);
        this.setParamSimple(map, prefix + "InHospitalOn", this.InHospitalOn);

    }
}

