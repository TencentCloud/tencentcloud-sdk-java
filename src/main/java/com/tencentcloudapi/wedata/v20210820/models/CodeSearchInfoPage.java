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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeSearchInfoPage extends AbstractModel {

    /**
    * 分页数据
    */
    @SerializedName("Rows")
    @Expose
    private CodeSearchInfo [] Rows;

    /**
    * 总个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 分页数据 
     * @return Rows 分页数据
     */
    public CodeSearchInfo [] getRows() {
        return this.Rows;
    }

    /**
     * Set 分页数据
     * @param Rows 分页数据
     */
    public void setRows(CodeSearchInfo [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get 总个数 
     * @return TotalCount 总个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总个数
     * @param TotalCount 总个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public CodeSearchInfoPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeSearchInfoPage(CodeSearchInfoPage source) {
        if (source.Rows != null) {
            this.Rows = new CodeSearchInfo[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new CodeSearchInfo(source.Rows[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

