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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorInfoItem extends AbstractModel{

    /**
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 解决方案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 错误日志信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
    * 文档提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HelpDoc")
    @Expose
    private String HelpDoc;

    /**
     * Get 错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 解决方案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Solution 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     * @param Solution 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get 错误日志信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorLog 错误日志信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set 错误日志信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorLog 错误日志信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get 文档提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HelpDoc 文档提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHelpDoc() {
        return this.HelpDoc;
    }

    /**
     * Set 文档提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param HelpDoc 文档提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHelpDoc(String HelpDoc) {
        this.HelpDoc = HelpDoc;
    }

    public ErrorInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorInfoItem(ErrorInfoItem source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.ErrorLog != null) {
            this.ErrorLog = new String(source.ErrorLog);
        }
        if (source.HelpDoc != null) {
            this.HelpDoc = new String(source.HelpDoc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "ErrorLog", this.ErrorLog);
        this.setParamSimple(map, prefix + "HelpDoc", this.HelpDoc);

    }
}

