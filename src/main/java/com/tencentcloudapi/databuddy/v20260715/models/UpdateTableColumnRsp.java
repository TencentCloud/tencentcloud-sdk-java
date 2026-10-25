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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTableColumnRsp extends AbstractModel {

    /**
    * 整体结果，true表示全部成功
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 失败的字段列表（部分成功场景），全部成功时为空
    */
    @SerializedName("FailedColumns")
    @Expose
    private ColumnErrorMessages [] FailedColumns;

    /**
     * Get 整体结果，true表示全部成功 
     * @return Result 整体结果，true表示全部成功
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 整体结果，true表示全部成功
     * @param Result 整体结果，true表示全部成功
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 失败的字段列表（部分成功场景），全部成功时为空 
     * @return FailedColumns 失败的字段列表（部分成功场景），全部成功时为空
     */
    public ColumnErrorMessages [] getFailedColumns() {
        return this.FailedColumns;
    }

    /**
     * Set 失败的字段列表（部分成功场景），全部成功时为空
     * @param FailedColumns 失败的字段列表（部分成功场景），全部成功时为空
     */
    public void setFailedColumns(ColumnErrorMessages [] FailedColumns) {
        this.FailedColumns = FailedColumns;
    }

    public UpdateTableColumnRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTableColumnRsp(UpdateTableColumnRsp source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.FailedColumns != null) {
            this.FailedColumns = new ColumnErrorMessages[source.FailedColumns.length];
            for (int i = 0; i < source.FailedColumns.length; i++) {
                this.FailedColumns[i] = new ColumnErrorMessages(source.FailedColumns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArrayObj(map, prefix + "FailedColumns.", this.FailedColumns);

    }
}

