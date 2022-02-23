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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEdgeUnitApplicationYamlRequest extends AbstractModel{

    /**
    * 单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * base64后的Yaml配置
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * 基本信息
    */
    @SerializedName("BasicInfo")
    @Expose
    private ApplicationBasicInfo BasicInfo;

    /**
     * Get 单元ID 
     * @return EdgeUnitId 单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set 单元ID
     * @param EdgeUnitId 单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get base64后的Yaml配置 
     * @return Yaml base64后的Yaml配置
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set base64后的Yaml配置
     * @param Yaml base64后的Yaml配置
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Get 基本信息 
     * @return BasicInfo 基本信息
     */
    public ApplicationBasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set 基本信息
     * @param BasicInfo 基本信息
     */
    public void setBasicInfo(ApplicationBasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    public CreateEdgeUnitApplicationYamlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdgeUnitApplicationYamlRequest(CreateEdgeUnitApplicationYamlRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
        if (source.BasicInfo != null) {
            this.BasicInfo = new ApplicationBasicInfo(source.BasicInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamObj(map, prefix + "BasicInfo.", this.BasicInfo);

    }
}

