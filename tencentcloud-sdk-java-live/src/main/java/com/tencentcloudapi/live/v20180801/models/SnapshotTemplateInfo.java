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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotTemplateInfo extends AbstractModel{

    /**
    * 模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 模板名称。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 截图时间间隔，5-300秒。
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Long SnapshotInterval;

    /**
    * 截图宽度，范围：0-3000。 
0：原始宽度并适配原始比例。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 截图高度，范围：0-2000。
0：原始高度并适配原始比例。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 是否开启鉴黄，0：不开启，1：开启。
    */
    @SerializedName("PornFlag")
    @Expose
    private Long PornFlag;

    /**
    * Cos 应用 ID。
    */
    @SerializedName("CosAppId")
    @Expose
    private Long CosAppId;

    /**
    * Cos Bucket名称。
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * Cos 地域。
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 模板描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Cos Bucket文件夹前缀。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPrefix")
    @Expose
    private String CosPrefix;

    /**
    * Cos 文件名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
     * Get 模板 ID。 
     * @return TemplateId 模板 ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 ID。
     * @param TemplateId 模板 ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称。 
     * @return TemplateName 模板名称。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
     * @param TemplateName 模板名称。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 截图时间间隔，5-300秒。 
     * @return SnapshotInterval 截图时间间隔，5-300秒。
     */
    public Long getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set 截图时间间隔，5-300秒。
     * @param SnapshotInterval 截图时间间隔，5-300秒。
     */
    public void setSnapshotInterval(Long SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * Get 截图宽度，范围：0-3000。 
0：原始宽度并适配原始比例。 
     * @return Width 截图宽度，范围：0-3000。 
0：原始宽度并适配原始比例。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 截图宽度，范围：0-3000。 
0：原始宽度并适配原始比例。
     * @param Width 截图宽度，范围：0-3000。 
0：原始宽度并适配原始比例。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 截图高度，范围：0-2000。
0：原始高度并适配原始比例。 
     * @return Height 截图高度，范围：0-2000。
0：原始高度并适配原始比例。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 截图高度，范围：0-2000。
0：原始高度并适配原始比例。
     * @param Height 截图高度，范围：0-2000。
0：原始高度并适配原始比例。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 是否开启鉴黄，0：不开启，1：开启。 
     * @return PornFlag 是否开启鉴黄，0：不开启，1：开启。
     */
    public Long getPornFlag() {
        return this.PornFlag;
    }

    /**
     * Set 是否开启鉴黄，0：不开启，1：开启。
     * @param PornFlag 是否开启鉴黄，0：不开启，1：开启。
     */
    public void setPornFlag(Long PornFlag) {
        this.PornFlag = PornFlag;
    }

    /**
     * Get Cos 应用 ID。 
     * @return CosAppId Cos 应用 ID。
     */
    public Long getCosAppId() {
        return this.CosAppId;
    }

    /**
     * Set Cos 应用 ID。
     * @param CosAppId Cos 应用 ID。
     */
    public void setCosAppId(Long CosAppId) {
        this.CosAppId = CosAppId;
    }

    /**
     * Get Cos Bucket名称。 
     * @return CosBucket Cos Bucket名称。
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set Cos Bucket名称。
     * @param CosBucket Cos Bucket名称。
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get Cos 地域。 
     * @return CosRegion Cos 地域。
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set Cos 地域。
     * @param CosRegion Cos 地域。
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 模板描述。 
     * @return Description 模板描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板描述。
     * @param Description 模板描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Cos Bucket文件夹前缀。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPrefix Cos Bucket文件夹前缀。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosPrefix() {
        return this.CosPrefix;
    }

    /**
     * Set Cos Bucket文件夹前缀。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPrefix Cos Bucket文件夹前缀。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPrefix(String CosPrefix) {
        this.CosPrefix = CosPrefix;
    }

    /**
     * Get Cos 文件名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosFileName Cos 文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set Cos 文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosFileName Cos 文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PornFlag", this.PornFlag);
        this.setParamSimple(map, prefix + "CosAppId", this.CosAppId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CosPrefix", this.CosPrefix);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

