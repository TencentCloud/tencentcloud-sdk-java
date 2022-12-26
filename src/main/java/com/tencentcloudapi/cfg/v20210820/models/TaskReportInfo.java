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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskReportInfo extends AbstractModel{

    /**
    * 0--未开始，1--正在导出，2--导出成功，3--导出失败
    */
    @SerializedName("Stage")
    @Expose
    private Long Stage;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 有效期截止时间
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * 是否有效
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * 演练报告cos文件地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * 演练报告导出日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
     * Get 0--未开始，1--正在导出，2--导出成功，3--导出失败 
     * @return Stage 0--未开始，1--正在导出，2--导出成功，3--导出失败
     */
    public Long getStage() {
        return this.Stage;
    }

    /**
     * Set 0--未开始，1--正在导出，2--导出成功，3--导出失败
     * @param Stage 0--未开始，1--正在导出，2--导出成功，3--导出失败
     */
    public void setStage(Long Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 有效期截止时间 
     * @return ExpirationTime 有效期截止时间
     */
    public String getExpirationTime() {
        return this.ExpirationTime;
    }

    /**
     * Set 有效期截止时间
     * @param ExpirationTime 有效期截止时间
     */
    public void setExpirationTime(String ExpirationTime) {
        this.ExpirationTime = ExpirationTime;
    }

    /**
     * Get 是否有效 
     * @return Expired 是否有效
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set 是否有效
     * @param Expired 是否有效
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
    }

    /**
     * Get 演练报告cos文件地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosUrl 演练报告cos文件地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set 演练报告cos文件地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosUrl 演练报告cos文件地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get 演练报告导出日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Log 演练报告导出日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 演练报告导出日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param Log 演练报告导出日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    public TaskReportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskReportInfo(TaskReportInfo source) {
        if (source.Stage != null) {
            this.Stage = new Long(source.Stage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpirationTime != null) {
            this.ExpirationTime = new String(source.ExpirationTime);
        }
        if (source.Expired != null) {
            this.Expired = new Boolean(source.Expired);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpirationTime", this.ExpirationTime);
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "Log", this.Log);

    }
}

