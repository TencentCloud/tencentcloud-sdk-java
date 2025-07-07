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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortSpecification extends AbstractModel {

    /**
    * 端口名称
    */
    @SerializedName("InternationalName")
    @Expose
    private String InternationalName;

    /**
    * 端口规格（M）
    */
    @SerializedName("Specification")
    @Expose
    private Long Specification;

    /**
    * 端口类型：T-电口，X-光口
    */
    @SerializedName("PortType")
    @Expose
    private String PortType;

    /**
     * Get 端口名称 
     * @return InternationalName 端口名称
     */
    public String getInternationalName() {
        return this.InternationalName;
    }

    /**
     * Set 端口名称
     * @param InternationalName 端口名称
     */
    public void setInternationalName(String InternationalName) {
        this.InternationalName = InternationalName;
    }

    /**
     * Get 端口规格（M） 
     * @return Specification 端口规格（M）
     */
    public Long getSpecification() {
        return this.Specification;
    }

    /**
     * Set 端口规格（M）
     * @param Specification 端口规格（M）
     */
    public void setSpecification(Long Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 端口类型：T-电口，X-光口 
     * @return PortType 端口类型：T-电口，X-光口
     */
    public String getPortType() {
        return this.PortType;
    }

    /**
     * Set 端口类型：T-电口，X-光口
     * @param PortType 端口类型：T-电口，X-光口
     */
    public void setPortType(String PortType) {
        this.PortType = PortType;
    }

    public PortSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortSpecification(PortSpecification source) {
        if (source.InternationalName != null) {
            this.InternationalName = new String(source.InternationalName);
        }
        if (source.Specification != null) {
            this.Specification = new Long(source.Specification);
        }
        if (source.PortType != null) {
            this.PortType = new String(source.PortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternationalName", this.InternationalName);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "PortType", this.PortType);

    }
}

