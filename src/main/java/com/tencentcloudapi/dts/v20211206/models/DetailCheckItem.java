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

public class DetailCheckItem extends AbstractModel{

    /**
    * 检查项的名称，如：源实例权限检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckItemName")
    @Expose
    private String CheckItemName;

    /**
    * 检查项详细内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * pass(通过)，failed(失败), warning(校验有警告，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * 检查项失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * 解决方案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 运行报错日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorLog")
    @Expose
    private String [] ErrorLog;

    /**
    * 详细帮助的文档链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HelpDoc")
    @Expose
    private String [] HelpDoc;

    /**
    * 跳过风险文案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkipInfo")
    @Expose
    private String SkipInfo;

    /**
     * Get 检查项的名称，如：源实例权限检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckItemName 检查项的名称，如：源实例权限检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckItemName() {
        return this.CheckItemName;
    }

    /**
     * Set 检查项的名称，如：源实例权限检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckItemName 检查项的名称，如：源实例权限检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckItemName(String CheckItemName) {
        this.CheckItemName = CheckItemName;
    }

    /**
     * Get 检查项详细内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 检查项详细内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 检查项详细内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 检查项详细内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get pass(通过)，failed(失败), warning(校验有警告，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckResult pass(通过)，failed(失败), warning(校验有警告，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set pass(通过)，failed(失败), warning(校验有警告，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckResult pass(通过)，failed(失败), warning(校验有警告，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get 检查项失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureReason 检查项失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 检查项失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureReason 检查项失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
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
     * Get 运行报错日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorLog 运行报错日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set 运行报错日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorLog 运行报错日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorLog(String [] ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get 详细帮助的文档链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HelpDoc 详细帮助的文档链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHelpDoc() {
        return this.HelpDoc;
    }

    /**
     * Set 详细帮助的文档链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param HelpDoc 详细帮助的文档链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHelpDoc(String [] HelpDoc) {
        this.HelpDoc = HelpDoc;
    }

    /**
     * Get 跳过风险文案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkipInfo 跳过风险文案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSkipInfo() {
        return this.SkipInfo;
    }

    /**
     * Set 跳过风险文案
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkipInfo 跳过风险文案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkipInfo(String SkipInfo) {
        this.SkipInfo = SkipInfo;
    }

    public DetailCheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailCheckItem(DetailCheckItem source) {
        if (source.CheckItemName != null) {
            this.CheckItemName = new String(source.CheckItemName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new String(source.CheckResult);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.ErrorLog != null) {
            this.ErrorLog = new String[source.ErrorLog.length];
            for (int i = 0; i < source.ErrorLog.length; i++) {
                this.ErrorLog[i] = new String(source.ErrorLog[i]);
            }
        }
        if (source.HelpDoc != null) {
            this.HelpDoc = new String[source.HelpDoc.length];
            for (int i = 0; i < source.HelpDoc.length; i++) {
                this.HelpDoc[i] = new String(source.HelpDoc[i]);
            }
        }
        if (source.SkipInfo != null) {
            this.SkipInfo = new String(source.SkipInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckItemName", this.CheckItemName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamArraySimple(map, prefix + "ErrorLog.", this.ErrorLog);
        this.setParamArraySimple(map, prefix + "HelpDoc.", this.HelpDoc);
        this.setParamSimple(map, prefix + "SkipInfo", this.SkipInfo);

    }
}

