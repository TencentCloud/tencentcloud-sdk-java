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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayerVersionInfo extends AbstractModel {

    /**
    * 版本适用的运行时
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
    * 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/115197#.E5.B1.82.EF.BC.88Layer.EF.BC.89.E7.8A.B6.E6.80.81)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Stamp
    */
    @SerializedName("Stamp")
    @Expose
    private String Stamp;

    /**
    * 返回层绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 版本适用的运行时 
     * @return CompatibleRuntimes 版本适用的运行时
     */
    public String [] getCompatibleRuntimes() {
        return this.CompatibleRuntimes;
    }

    /**
     * Set 版本适用的运行时
     * @param CompatibleRuntimes 版本适用的运行时
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
     * @return Description 版本描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本描述
     * @param Description 版本描述
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
     * Get 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/115197#.E5.B1.82.EF.BC.88Layer.EF.BC.89.E7.8A.B6.E6.80.81) 
     * @return Status 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/115197#.E5.B1.82.EF.BC.88Layer.EF.BC.89.E7.8A.B6.E6.80.81)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/115197#.E5.B1.82.EF.BC.88Layer.EF.BC.89.E7.8A.B6.E6.80.81)
     * @param Status 层的具体版本当前状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/115197#.E5.B1.82.EF.BC.88Layer.EF.BC.89.E7.8A.B6.E6.80.81)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Stamp 
     * @return Stamp Stamp
     */
    public String getStamp() {
        return this.Stamp;
    }

    /**
     * Set Stamp
     * @param Stamp Stamp
     */
    public void setStamp(String Stamp) {
        this.Stamp = Stamp;
    }

    /**
     * Get 返回层绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 返回层绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 返回层绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 返回层绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public LayerVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LayerVersionInfo(LayerVersionInfo source) {
        if (source.CompatibleRuntimes != null) {
            this.CompatibleRuntimes = new String[source.CompatibleRuntimes.length];
            for (int i = 0; i < source.CompatibleRuntimes.length; i++) {
                this.CompatibleRuntimes[i] = new String(source.CompatibleRuntimes[i]);
            }
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LicenseInfo != null) {
            this.LicenseInfo = new String(source.LicenseInfo);
        }
        if (source.LayerVersion != null) {
            this.LayerVersion = new Long(source.LayerVersion);
        }
        if (source.LayerName != null) {
            this.LayerName = new String(source.LayerName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Stamp != null) {
            this.Stamp = new String(source.Stamp);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "Stamp", this.Stamp);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

