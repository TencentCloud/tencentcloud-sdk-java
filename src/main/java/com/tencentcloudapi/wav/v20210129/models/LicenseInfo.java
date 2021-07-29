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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseInfo extends AbstractModel{

    /**
    * license编号
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * license版本；1-基础版，2-标准版，3-增值版
    */
    @SerializedName("LicenseEdition")
    @Expose
    private Long LicenseEdition;

    /**
    * 生效开始时间, 格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ResourceStartTime")
    @Expose
    private String ResourceStartTime;

    /**
    * 生效结束时间, 格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ResourceEndTime")
    @Expose
    private String ResourceEndTime;

    /**
    * 隔离截止时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolationDeadline")
    @Expose
    private String IsolationDeadline;

    /**
    * 资源计划销毁时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestroyTime")
    @Expose
    private String DestroyTime;

    /**
    * 资源状态，1.正常，2.隔离，3.销毁
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get license编号 
     * @return License license编号
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set license编号
     * @param License license编号
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get license版本；1-基础版，2-标准版，3-增值版 
     * @return LicenseEdition license版本；1-基础版，2-标准版，3-增值版
     */
    public Long getLicenseEdition() {
        return this.LicenseEdition;
    }

    /**
     * Set license版本；1-基础版，2-标准版，3-增值版
     * @param LicenseEdition license版本；1-基础版，2-标准版，3-增值版
     */
    public void setLicenseEdition(Long LicenseEdition) {
        this.LicenseEdition = LicenseEdition;
    }

    /**
     * Get 生效开始时间, 格式yyyy-MM-dd HH:mm:ss 
     * @return ResourceStartTime 生效开始时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public String getResourceStartTime() {
        return this.ResourceStartTime;
    }

    /**
     * Set 生效开始时间, 格式yyyy-MM-dd HH:mm:ss
     * @param ResourceStartTime 生效开始时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public void setResourceStartTime(String ResourceStartTime) {
        this.ResourceStartTime = ResourceStartTime;
    }

    /**
     * Get 生效结束时间, 格式yyyy-MM-dd HH:mm:ss 
     * @return ResourceEndTime 生效结束时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public String getResourceEndTime() {
        return this.ResourceEndTime;
    }

    /**
     * Set 生效结束时间, 格式yyyy-MM-dd HH:mm:ss
     * @param ResourceEndTime 生效结束时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public void setResourceEndTime(String ResourceEndTime) {
        this.ResourceEndTime = ResourceEndTime;
    }

    /**
     * Get 隔离截止时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolationDeadline 隔离截止时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolationDeadline() {
        return this.IsolationDeadline;
    }

    /**
     * Set 隔离截止时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolationDeadline 隔离截止时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolationDeadline(String IsolationDeadline) {
        this.IsolationDeadline = IsolationDeadline;
    }

    /**
     * Get 资源计划销毁时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestroyTime 资源计划销毁时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set 资源计划销毁时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestroyTime 资源计划销毁时间, 格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestroyTime(String DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get 资源状态，1.正常，2.隔离，3.销毁 
     * @return Status 资源状态，1.正常，2.隔离，3.销毁
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态，1.正常，2.隔离，3.销毁
     * @param Status 资源状态，1.正常，2.隔离，3.销毁
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public LicenseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseInfo(LicenseInfo source) {
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.LicenseEdition != null) {
            this.LicenseEdition = new Long(source.LicenseEdition);
        }
        if (source.ResourceStartTime != null) {
            this.ResourceStartTime = new String(source.ResourceStartTime);
        }
        if (source.ResourceEndTime != null) {
            this.ResourceEndTime = new String(source.ResourceEndTime);
        }
        if (source.IsolationDeadline != null) {
            this.IsolationDeadline = new String(source.IsolationDeadline);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new String(source.DestroyTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "LicenseEdition", this.LicenseEdition);
        this.setParamSimple(map, prefix + "ResourceStartTime", this.ResourceStartTime);
        this.setParamSimple(map, prefix + "ResourceEndTime", this.ResourceEndTime);
        this.setParamSimple(map, prefix + "IsolationDeadline", this.IsolationDeadline);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

