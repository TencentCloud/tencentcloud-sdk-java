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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayerVersionInfo extends AbstractModel{

    /**
    * 版本适用的运行时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompatibleRuntimes")
    @Expose
    private String [] CompatibleRuntimes;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 版本描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 许可证信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicenseInfo")
    @Expose
    private String LicenseInfo;

    /**
    * 版本号
    */
    @SerializedName("LayerVersion")
    @Expose
    private Long LayerVersion;

    /**
    * 层名称
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.B1.82.EF.BC.88layer.EF.BC.89.E7.8A.B6.E6.80.81)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 版本适用的运行时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompatibleRuntimes 版本适用的运行时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCompatibleRuntimes() {
        return this.CompatibleRuntimes;
    }

    /**
     * Set 版本适用的运行时
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompatibleRuntimes 版本适用的运行时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompatibleRuntimes(String [] CompatibleRuntimes) {
        this.CompatibleRuntimes = CompatibleRuntimes;
    }

    /**
     * Get 创建时间 
     * @return AddTime 创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
     * @param AddTime 创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 版本描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 版本描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 版本描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 许可证信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicenseInfo 许可证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLicenseInfo() {
        return this.LicenseInfo;
    }

    /**
     * Set 许可证信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicenseInfo 许可证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenseInfo(String LicenseInfo) {
        this.LicenseInfo = LicenseInfo;
    }

    /**
     * Get 版本号 
     * @return LayerVersion 版本号
     */
    public Long getLayerVersion() {
        return this.LayerVersion;
    }

    /**
     * Set 版本号
     * @param LayerVersion 版本号
     */
    public void setLayerVersion(Long LayerVersion) {
        this.LayerVersion = LayerVersion;
    }

    /**
     * Get 层名称 
     * @return LayerName 层名称
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set 层名称
     * @param LayerName 层名称
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.B1.82.EF.BC.88layer.EF.BC.89.E7.8A.B6.E6.80.81) 
     * @return Status 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.B1.82.EF.BC.88layer.EF.BC.89.E7.8A.B6.E6.80.81)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.B1.82.EF.BC.88layer.EF.BC.89.E7.8A.B6.E6.80.81)
     * @param Status 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.B1.82.EF.BC.88layer.EF.BC.89.E7.8A.B6.E6.80.81)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CompatibleRuntimes.", this.CompatibleRuntimes);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LicenseInfo", this.LicenseInfo);
        this.setParamSimple(map, prefix + "LayerVersion", this.LayerVersion);
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

