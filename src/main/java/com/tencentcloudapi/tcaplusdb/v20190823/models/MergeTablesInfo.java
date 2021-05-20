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

public class MergeTablesInfo extends AbstractModel{

    /**
    * 合服的表格信息
    */
    @SerializedName("MergeTables")
    @Expose
    private CompareTablesInfo MergeTables;

    /**
    * 是否检查索引
    */
    @SerializedName("CheckIndex")
    @Expose
    private Boolean CheckIndex;

    /**
     * Get 合服的表格信息 
     * @return MergeTables 合服的表格信息
     */
    public CompareTablesInfo getMergeTables() {
        return this.MergeTables;
    }

    /**
     * Set 合服的表格信息
     * @param MergeTables 合服的表格信息
     */
    public void setMergeTables(CompareTablesInfo MergeTables) {
        this.MergeTables = MergeTables;
    }

    /**
     * Get 是否检查索引 
     * @return CheckIndex 是否检查索引
     */
    public Boolean getCheckIndex() {
        return this.CheckIndex;
    }

    /**
     * Set 是否检查索引
     * @param CheckIndex 是否检查索引
     */
    public void setCheckIndex(Boolean CheckIndex) {
        this.CheckIndex = CheckIndex;
    }

    public MergeTablesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MergeTablesInfo(MergeTablesInfo source) {
        if (source.MergeTables != null) {
            this.MergeTables = new CompareTablesInfo(source.MergeTables);
        }
        if (source.CheckIndex != null) {
            this.CheckIndex = new Boolean(source.CheckIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MergeTables.", this.MergeTables);
        this.setParamSimple(map, prefix + "CheckIndex", this.CheckIndex);

    }
}

