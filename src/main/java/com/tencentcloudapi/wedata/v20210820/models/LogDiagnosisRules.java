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

public class LogDiagnosisRules extends AbstractModel {

    /**
    * <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>errorCode</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * <p>createTime</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>lastUpdate</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * <p>owner</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>异常概要</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorTitle")
    @Expose
    private String ErrorTitle;

    /**
    * <p>异常关键字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorReason")
    @Expose
    private String ErrorReason;

    /**
    * <p>解决办法</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorSolution")
    @Expose
    private String ErrorSolution;

    /**
    * <p>展示顺序</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorOrder")
    @Expose
    private String ErrorOrder;

    /**
    * <p>例子</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorExample")
    @Expose
    private String ErrorExample;

    /**
    * <p>扩展说明</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtToolsUrl")
    @Expose
    private String ExtToolsUrl;

    /**
    * <p>异常级别</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorLevel")
    @Expose
    private String ErrorLevel;

    /**
    * <p>异常类型：用户/系统</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorTypeAggregation")
    @Expose
    private String ErrorTypeAggregation;

    /**
    * <p>异常系统类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorSystem")
    @Expose
    private String ErrorSystem;

    /**
    * <p>异常日志来源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorLogSystem")
    @Expose
    private String ErrorLogSystem;

    /**
     * Get <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>errorCode</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode <p>errorCode</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>errorCode</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode <p>errorCode</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>createTime</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>createTime</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>createTime</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>createTime</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>lastUpdate</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdate <p>lastUpdate</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set <p>lastUpdate</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdate <p>lastUpdate</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get <p>owner</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner <p>owner</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>owner</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner <p>owner</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>异常概要</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorTitle <p>异常概要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorTitle() {
        return this.ErrorTitle;
    }

    /**
     * Set <p>异常概要</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorTitle <p>异常概要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorTitle(String ErrorTitle) {
        this.ErrorTitle = ErrorTitle;
    }

    /**
     * Get <p>异常关键字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage <p>异常关键字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>异常关键字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage <p>异常关键字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorReason <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorReason() {
        return this.ErrorReason;
    }

    /**
     * Set <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorReason <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorReason(String ErrorReason) {
        this.ErrorReason = ErrorReason;
    }

    /**
     * Get <p>解决办法</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorSolution <p>解决办法</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorSolution() {
        return this.ErrorSolution;
    }

    /**
     * Set <p>解决办法</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorSolution <p>解决办法</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorSolution(String ErrorSolution) {
        this.ErrorSolution = ErrorSolution;
    }

    /**
     * Get <p>展示顺序</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorOrder <p>展示顺序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorOrder() {
        return this.ErrorOrder;
    }

    /**
     * Set <p>展示顺序</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorOrder <p>展示顺序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorOrder(String ErrorOrder) {
        this.ErrorOrder = ErrorOrder;
    }

    /**
     * Get <p>例子</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorExample <p>例子</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorExample() {
        return this.ErrorExample;
    }

    /**
     * Set <p>例子</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorExample <p>例子</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorExample(String ErrorExample) {
        this.ErrorExample = ErrorExample;
    }

    /**
     * Get <p>扩展说明</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtToolsUrl <p>扩展说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtToolsUrl() {
        return this.ExtToolsUrl;
    }

    /**
     * Set <p>扩展说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtToolsUrl <p>扩展说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtToolsUrl(String ExtToolsUrl) {
        this.ExtToolsUrl = ExtToolsUrl;
    }

    /**
     * Get <p>异常级别</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorLevel <p>异常级别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorLevel() {
        return this.ErrorLevel;
    }

    /**
     * Set <p>异常级别</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorLevel <p>异常级别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorLevel(String ErrorLevel) {
        this.ErrorLevel = ErrorLevel;
    }

    /**
     * Get <p>异常类型：用户/系统</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorTypeAggregation <p>异常类型：用户/系统</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorTypeAggregation() {
        return this.ErrorTypeAggregation;
    }

    /**
     * Set <p>异常类型：用户/系统</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorTypeAggregation <p>异常类型：用户/系统</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorTypeAggregation(String ErrorTypeAggregation) {
        this.ErrorTypeAggregation = ErrorTypeAggregation;
    }

    /**
     * Get <p>异常系统类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorSystem <p>异常系统类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorSystem() {
        return this.ErrorSystem;
    }

    /**
     * Set <p>异常系统类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorSystem <p>异常系统类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorSystem(String ErrorSystem) {
        this.ErrorSystem = ErrorSystem;
    }

    /**
     * Get <p>异常日志来源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorLogSystem <p>异常日志来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorLogSystem() {
        return this.ErrorLogSystem;
    }

    /**
     * Set <p>异常日志来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorLogSystem <p>异常日志来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorLogSystem(String ErrorLogSystem) {
        this.ErrorLogSystem = ErrorLogSystem;
    }

    public LogDiagnosisRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogDiagnosisRules(LogDiagnosisRules source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdate != null) {
            this.LastUpdate = new String(source.LastUpdate);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.ErrorTitle != null) {
            this.ErrorTitle = new String(source.ErrorTitle);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ErrorReason != null) {
            this.ErrorReason = new String(source.ErrorReason);
        }
        if (source.ErrorSolution != null) {
            this.ErrorSolution = new String(source.ErrorSolution);
        }
        if (source.ErrorOrder != null) {
            this.ErrorOrder = new String(source.ErrorOrder);
        }
        if (source.ErrorExample != null) {
            this.ErrorExample = new String(source.ErrorExample);
        }
        if (source.ExtToolsUrl != null) {
            this.ExtToolsUrl = new String(source.ExtToolsUrl);
        }
        if (source.ErrorLevel != null) {
            this.ErrorLevel = new String(source.ErrorLevel);
        }
        if (source.ErrorTypeAggregation != null) {
            this.ErrorTypeAggregation = new String(source.ErrorTypeAggregation);
        }
        if (source.ErrorSystem != null) {
            this.ErrorSystem = new String(source.ErrorSystem);
        }
        if (source.ErrorLogSystem != null) {
            this.ErrorLogSystem = new String(source.ErrorLogSystem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdate", this.LastUpdate);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "ErrorTitle", this.ErrorTitle);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ErrorReason", this.ErrorReason);
        this.setParamSimple(map, prefix + "ErrorSolution", this.ErrorSolution);
        this.setParamSimple(map, prefix + "ErrorOrder", this.ErrorOrder);
        this.setParamSimple(map, prefix + "ErrorExample", this.ErrorExample);
        this.setParamSimple(map, prefix + "ExtToolsUrl", this.ExtToolsUrl);
        this.setParamSimple(map, prefix + "ErrorLevel", this.ErrorLevel);
        this.setParamSimple(map, prefix + "ErrorTypeAggregation", this.ErrorTypeAggregation);
        this.setParamSimple(map, prefix + "ErrorSystem", this.ErrorSystem);
        this.setParamSimple(map, prefix + "ErrorLogSystem", this.ErrorLogSystem);

    }
}

