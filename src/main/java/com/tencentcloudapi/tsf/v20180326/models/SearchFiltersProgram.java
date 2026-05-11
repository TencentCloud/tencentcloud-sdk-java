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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchFiltersProgram extends AbstractModel {

    /**
    * <p>数据集ID</p>
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * <p>数据集名称</p>
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
     * Get <p>数据集ID</p> 
     * @return ProgramId <p>数据集ID</p>
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set <p>数据集ID</p>
     * @param ProgramId <p>数据集ID</p>
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get <p>数据集名称</p> 
     * @return ProgramName <p>数据集名称</p>
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set <p>数据集名称</p>
     * @param ProgramName <p>数据集名称</p>
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    public SearchFiltersProgram() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFiltersProgram(SearchFiltersProgram source) {
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);

    }
}

