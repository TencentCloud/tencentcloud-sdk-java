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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobLogErrorTip extends AbstractModel {

    /**
    * 执行日志错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 对应sql的行下标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineNum")
    @Expose
    private Long LineNum;

    /**
    * 对应sql的列下标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnNum")
    @Expose
    private Long ColumnNum;

    /**
     * Get 执行日志错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 执行日志错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 执行日志错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 执行日志错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 对应sql的行下标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineNum 对应sql的行下标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLineNum() {
        return this.LineNum;
    }

    /**
     * Set 对应sql的行下标
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineNum 对应sql的行下标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineNum(Long LineNum) {
        this.LineNum = LineNum;
    }

    /**
     * Get 对应sql的列下标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnNum 对应sql的列下标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColumnNum() {
        return this.ColumnNum;
    }

    /**
     * Set 对应sql的列下标
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnNum 对应sql的列下标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnNum(Long ColumnNum) {
        this.ColumnNum = ColumnNum;
    }

    public JobLogErrorTip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobLogErrorTip(JobLogErrorTip source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.LineNum != null) {
            this.LineNum = new Long(source.LineNum);
        }
        if (source.ColumnNum != null) {
            this.ColumnNum = new Long(source.ColumnNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "LineNum", this.LineNum);
        this.setParamSimple(map, prefix + "ColumnNum", this.ColumnNum);

    }
}

