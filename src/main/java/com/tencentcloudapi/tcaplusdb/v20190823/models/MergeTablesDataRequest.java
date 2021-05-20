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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MergeTablesDataRequest extends AbstractModel{

    /**
    * 选取的表格
    */
    @SerializedName("SelectedTables")
    @Expose
    private MergeTablesInfo [] SelectedTables;

    /**
    * true只做对比，false既对比又执行
    */
    @SerializedName("IsOnlyCompare")
    @Expose
    private Boolean IsOnlyCompare;

    /**
     * Get 选取的表格 
     * @return SelectedTables 选取的表格
     */
    public MergeTablesInfo [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set 选取的表格
     * @param SelectedTables 选取的表格
     */
    public void setSelectedTables(MergeTablesInfo [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * Get true只做对比，false既对比又执行 
     * @return IsOnlyCompare true只做对比，false既对比又执行
     */
    public Boolean getIsOnlyCompare() {
        return this.IsOnlyCompare;
    }

    /**
     * Set true只做对比，false既对比又执行
     * @param IsOnlyCompare true只做对比，false既对比又执行
     */
    public void setIsOnlyCompare(Boolean IsOnlyCompare) {
        this.IsOnlyCompare = IsOnlyCompare;
    }

    public MergeTablesDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MergeTablesDataRequest(MergeTablesDataRequest source) {
        if (source.SelectedTables != null) {
            this.SelectedTables = new MergeTablesInfo[source.SelectedTables.length];
            for (int i = 0; i < source.SelectedTables.length; i++) {
                this.SelectedTables[i] = new MergeTablesInfo(source.SelectedTables[i]);
            }
        }
        if (source.IsOnlyCompare != null) {
            this.IsOnlyCompare = new Boolean(source.IsOnlyCompare);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamSimple(map, prefix + "IsOnlyCompare", this.IsOnlyCompare);

    }
}

