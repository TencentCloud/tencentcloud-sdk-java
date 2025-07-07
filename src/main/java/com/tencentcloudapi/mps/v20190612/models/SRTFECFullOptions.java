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

public class SRTFECFullOptions extends AbstractModel {

    /**
    * 是否开启 FEC
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * FEC 数据包 Layout 列数量. 取值范围>0
    */
    @SerializedName("Cols")
    @Expose
    private Long Cols;

    /**
    * FEC 数据包 Layout 行数量. 取值范围 >=2 或者 <=-2
    */
    @SerializedName("Rows")
    @Expose
    private Long Rows;

    /**
    * FEC 开启的情况下，ARQ的策略。取值 "always", "onreq", "never"
    */
    @SerializedName("ARQ")
    @Expose
    private String ARQ;

    /**
    * FEC 数据包 Layout 组织形式，取值 "even", "staircase" 
    */
    @SerializedName("Layout")
    @Expose
    private String Layout;

    /**
     * Get 是否开启 FEC 
     * @return Enable 是否开启 FEC
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启 FEC
     * @param Enable 是否开启 FEC
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get FEC 数据包 Layout 列数量. 取值范围>0 
     * @return Cols FEC 数据包 Layout 列数量. 取值范围>0
     */
    public Long getCols() {
        return this.Cols;
    }

    /**
     * Set FEC 数据包 Layout 列数量. 取值范围>0
     * @param Cols FEC 数据包 Layout 列数量. 取值范围>0
     */
    public void setCols(Long Cols) {
        this.Cols = Cols;
    }

    /**
     * Get FEC 数据包 Layout 行数量. 取值范围 >=2 或者 <=-2 
     * @return Rows FEC 数据包 Layout 行数量. 取值范围 >=2 或者 <=-2
     */
    public Long getRows() {
        return this.Rows;
    }

    /**
     * Set FEC 数据包 Layout 行数量. 取值范围 >=2 或者 <=-2
     * @param Rows FEC 数据包 Layout 行数量. 取值范围 >=2 或者 <=-2
     */
    public void setRows(Long Rows) {
        this.Rows = Rows;
    }

    /**
     * Get FEC 开启的情况下，ARQ的策略。取值 "always", "onreq", "never" 
     * @return ARQ FEC 开启的情况下，ARQ的策略。取值 "always", "onreq", "never"
     */
    public String getARQ() {
        return this.ARQ;
    }

    /**
     * Set FEC 开启的情况下，ARQ的策略。取值 "always", "onreq", "never"
     * @param ARQ FEC 开启的情况下，ARQ的策略。取值 "always", "onreq", "never"
     */
    public void setARQ(String ARQ) {
        this.ARQ = ARQ;
    }

    /**
     * Get FEC 数据包 Layout 组织形式，取值 "even", "staircase"  
     * @return Layout FEC 数据包 Layout 组织形式，取值 "even", "staircase" 
     */
    public String getLayout() {
        return this.Layout;
    }

    /**
     * Set FEC 数据包 Layout 组织形式，取值 "even", "staircase" 
     * @param Layout FEC 数据包 Layout 组织形式，取值 "even", "staircase" 
     */
    public void setLayout(String Layout) {
        this.Layout = Layout;
    }

    public SRTFECFullOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SRTFECFullOptions(SRTFECFullOptions source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Cols != null) {
            this.Cols = new Long(source.Cols);
        }
        if (source.Rows != null) {
            this.Rows = new Long(source.Rows);
        }
        if (source.ARQ != null) {
            this.ARQ = new String(source.ARQ);
        }
        if (source.Layout != null) {
            this.Layout = new String(source.Layout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Cols", this.Cols);
        this.setParamSimple(map, prefix + "Rows", this.Rows);
        this.setParamSimple(map, prefix + "ARQ", this.ARQ);
        this.setParamSimple(map, prefix + "Layout", this.Layout);

    }
}

