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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorInfo extends AbstractModel {

    /**
    * 错误说明字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorTip")
    @Expose
    private String ErrorTip;

    /**
    * 原始异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 错误等级字段
ERROR
WARN
INFO
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorLevel")
    @Expose
    private String ErrorLevel;

    /**
    * 指引文档链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocLink")
    @Expose
    private String DocLink;

    /**
    * 快速指引说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FAQ")
    @Expose
    private String FAQ;

    /**
    * 预留字段1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedField")
    @Expose
    private String ReservedField;

    /**
     * Get 错误说明字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorTip 错误说明字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorTip() {
        return this.ErrorTip;
    }

    /**
     * Set 错误说明字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorTip 错误说明字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorTip(String ErrorTip) {
        this.ErrorTip = ErrorTip;
    }

    /**
     * Get 原始异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 原始异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 原始异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 原始异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 错误等级字段
ERROR
WARN
INFO
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorLevel 错误等级字段
ERROR
WARN
INFO
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorLevel() {
        return this.ErrorLevel;
    }

    /**
     * Set 错误等级字段
ERROR
WARN
INFO
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorLevel 错误等级字段
ERROR
WARN
INFO
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorLevel(String ErrorLevel) {
        this.ErrorLevel = ErrorLevel;
    }

    /**
     * Get 指引文档链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocLink 指引文档链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocLink() {
        return this.DocLink;
    }

    /**
     * Set 指引文档链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocLink 指引文档链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocLink(String DocLink) {
        this.DocLink = DocLink;
    }

    /**
     * Get 快速指引说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FAQ 快速指引说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFAQ() {
        return this.FAQ;
    }

    /**
     * Set 快速指引说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param FAQ 快速指引说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFAQ(String FAQ) {
        this.FAQ = FAQ;
    }

    /**
     * Get 预留字段1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedField 预留字段1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReservedField() {
        return this.ReservedField;
    }

    /**
     * Set 预留字段1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedField 预留字段1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedField(String ReservedField) {
        this.ReservedField = ReservedField;
    }

    public ErrorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorInfo(ErrorInfo source) {
        if (source.ErrorTip != null) {
            this.ErrorTip = new String(source.ErrorTip);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ErrorLevel != null) {
            this.ErrorLevel = new String(source.ErrorLevel);
        }
        if (source.DocLink != null) {
            this.DocLink = new String(source.DocLink);
        }
        if (source.FAQ != null) {
            this.FAQ = new String(source.FAQ);
        }
        if (source.ReservedField != null) {
            this.ReservedField = new String(source.ReservedField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorTip", this.ErrorTip);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ErrorLevel", this.ErrorLevel);
        this.setParamSimple(map, prefix + "DocLink", this.DocLink);
        this.setParamSimple(map, prefix + "FAQ", this.FAQ);
        this.setParamSimple(map, prefix + "ReservedField", this.ReservedField);

    }
}

