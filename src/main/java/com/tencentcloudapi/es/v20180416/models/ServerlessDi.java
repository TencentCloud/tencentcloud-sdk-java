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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessDi extends AbstractModel {

    /**
    * 数据链路采集源类型，如cvm_collector、tke_collector
    */
    @SerializedName("DiSourceType")
    @Expose
    private String DiSourceType;

    /**
    * cvm数据源
    */
    @SerializedName("DiSourceCvm")
    @Expose
    private DiSourceCvm DiSourceCvm;

    /**
    * tke数据源
    */
    @SerializedName("DiSourceTke")
    @Expose
    private DiSourceTke DiSourceTke;

    /**
     * Get 数据链路采集源类型，如cvm_collector、tke_collector 
     * @return DiSourceType 数据链路采集源类型，如cvm_collector、tke_collector
     */
    public String getDiSourceType() {
        return this.DiSourceType;
    }

    /**
     * Set 数据链路采集源类型，如cvm_collector、tke_collector
     * @param DiSourceType 数据链路采集源类型，如cvm_collector、tke_collector
     */
    public void setDiSourceType(String DiSourceType) {
        this.DiSourceType = DiSourceType;
    }

    /**
     * Get cvm数据源 
     * @return DiSourceCvm cvm数据源
     */
    public DiSourceCvm getDiSourceCvm() {
        return this.DiSourceCvm;
    }

    /**
     * Set cvm数据源
     * @param DiSourceCvm cvm数据源
     */
    public void setDiSourceCvm(DiSourceCvm DiSourceCvm) {
        this.DiSourceCvm = DiSourceCvm;
    }

    /**
     * Get tke数据源 
     * @return DiSourceTke tke数据源
     */
    public DiSourceTke getDiSourceTke() {
        return this.DiSourceTke;
    }

    /**
     * Set tke数据源
     * @param DiSourceTke tke数据源
     */
    public void setDiSourceTke(DiSourceTke DiSourceTke) {
        this.DiSourceTke = DiSourceTke;
    }

    public ServerlessDi() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessDi(ServerlessDi source) {
        if (source.DiSourceType != null) {
            this.DiSourceType = new String(source.DiSourceType);
        }
        if (source.DiSourceCvm != null) {
            this.DiSourceCvm = new DiSourceCvm(source.DiSourceCvm);
        }
        if (source.DiSourceTke != null) {
            this.DiSourceTke = new DiSourceTke(source.DiSourceTke);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiSourceType", this.DiSourceType);
        this.setParamObj(map, prefix + "DiSourceCvm.", this.DiSourceCvm);
        this.setParamObj(map, prefix + "DiSourceTke.", this.DiSourceTke);

    }
}

