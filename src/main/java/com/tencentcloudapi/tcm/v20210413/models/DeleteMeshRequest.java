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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMeshRequest extends AbstractModel{

    /**
    * 需要删除的MeshId
    */
    @SerializedName("MeshId")
    @Expose
    private String MeshId;

    /**
    * CLS组件是否被删除
    */
    @SerializedName("NeedDeleteCLS")
    @Expose
    private Boolean NeedDeleteCLS;

    /**
    * TMP组件是否被删除
    */
    @SerializedName("NeedDeleteTMP")
    @Expose
    private Boolean NeedDeleteTMP;

    /**
    * APM组件是否被删除
    */
    @SerializedName("NeedDeleteAPM")
    @Expose
    private Boolean NeedDeleteAPM;

    /**
    * Grafana组件是否被删除
    */
    @SerializedName("NeedDeleteGrafana")
    @Expose
    private Boolean NeedDeleteGrafana;

    /**
     * Get 需要删除的MeshId 
     * @return MeshId 需要删除的MeshId
     */
    public String getMeshId() {
        return this.MeshId;
    }

    /**
     * Set 需要删除的MeshId
     * @param MeshId 需要删除的MeshId
     */
    public void setMeshId(String MeshId) {
        this.MeshId = MeshId;
    }

    /**
     * Get CLS组件是否被删除 
     * @return NeedDeleteCLS CLS组件是否被删除
     */
    public Boolean getNeedDeleteCLS() {
        return this.NeedDeleteCLS;
    }

    /**
     * Set CLS组件是否被删除
     * @param NeedDeleteCLS CLS组件是否被删除
     */
    public void setNeedDeleteCLS(Boolean NeedDeleteCLS) {
        this.NeedDeleteCLS = NeedDeleteCLS;
    }

    /**
     * Get TMP组件是否被删除 
     * @return NeedDeleteTMP TMP组件是否被删除
     */
    public Boolean getNeedDeleteTMP() {
        return this.NeedDeleteTMP;
    }

    /**
     * Set TMP组件是否被删除
     * @param NeedDeleteTMP TMP组件是否被删除
     */
    public void setNeedDeleteTMP(Boolean NeedDeleteTMP) {
        this.NeedDeleteTMP = NeedDeleteTMP;
    }

    /**
     * Get APM组件是否被删除 
     * @return NeedDeleteAPM APM组件是否被删除
     */
    public Boolean getNeedDeleteAPM() {
        return this.NeedDeleteAPM;
    }

    /**
     * Set APM组件是否被删除
     * @param NeedDeleteAPM APM组件是否被删除
     */
    public void setNeedDeleteAPM(Boolean NeedDeleteAPM) {
        this.NeedDeleteAPM = NeedDeleteAPM;
    }

    /**
     * Get Grafana组件是否被删除 
     * @return NeedDeleteGrafana Grafana组件是否被删除
     */
    public Boolean getNeedDeleteGrafana() {
        return this.NeedDeleteGrafana;
    }

    /**
     * Set Grafana组件是否被删除
     * @param NeedDeleteGrafana Grafana组件是否被删除
     */
    public void setNeedDeleteGrafana(Boolean NeedDeleteGrafana) {
        this.NeedDeleteGrafana = NeedDeleteGrafana;
    }

    public DeleteMeshRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMeshRequest(DeleteMeshRequest source) {
        if (source.MeshId != null) {
            this.MeshId = new String(source.MeshId);
        }
        if (source.NeedDeleteCLS != null) {
            this.NeedDeleteCLS = new Boolean(source.NeedDeleteCLS);
        }
        if (source.NeedDeleteTMP != null) {
            this.NeedDeleteTMP = new Boolean(source.NeedDeleteTMP);
        }
        if (source.NeedDeleteAPM != null) {
            this.NeedDeleteAPM = new Boolean(source.NeedDeleteAPM);
        }
        if (source.NeedDeleteGrafana != null) {
            this.NeedDeleteGrafana = new Boolean(source.NeedDeleteGrafana);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MeshId", this.MeshId);
        this.setParamSimple(map, prefix + "NeedDeleteCLS", this.NeedDeleteCLS);
        this.setParamSimple(map, prefix + "NeedDeleteTMP", this.NeedDeleteTMP);
        this.setParamSimple(map, prefix + "NeedDeleteAPM", this.NeedDeleteAPM);
        this.setParamSimple(map, prefix + "NeedDeleteGrafana", this.NeedDeleteGrafana);

    }
}

