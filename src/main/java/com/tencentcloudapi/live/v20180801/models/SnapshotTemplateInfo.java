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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotTemplateInfo extends AbstractModel {

    /**
    * <p>模板 ID。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>模板名称。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>截图时间间隔，5-300秒。</p>
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Long SnapshotInterval;

    /**
    * <p>截图宽度，范围：0-3000。<br>0：原始宽度并适配原始比例。</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>截图高度，范围：0-2000。<br>0：原始高度并适配原始比例。</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>是否开启鉴黄，0：不开启，1：开启。</p>
    */
    @SerializedName("PornFlag")
    @Expose
    private Long PornFlag;

    /**
    * <p>Cos 应用 ID。</p>
    */
    @SerializedName("CosAppId")
    @Expose
    private Long CosAppId;

    /**
    * <p>Cos Bucket名称。</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>Cos 地域。</p>
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * <p>模板描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Cos Bucket文件夹前缀。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPrefix")
    @Expose
    private String CosPrefix;

    /**
    * <p>Cos 文件名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
    * <p>第三方存储时账号的SecretId</p>
    */
    @SerializedName("CosSecretId")
    @Expose
    private String CosSecretId;

    /**
    * <p>第三方存储时，账号的SecretKey</p><p>当查询时，该值返回为<code>******</code></p>
    */
    @SerializedName("CosSecretKey")
    @Expose
    private String CosSecretKey;

    /**
     * Get <p>模板 ID。</p> 
     * @return TemplateId <p>模板 ID。</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板 ID。</p>
     * @param TemplateId <p>模板 ID。</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>模板名称。</p> 
     * @return TemplateName <p>模板名称。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称。</p>
     * @param TemplateName <p>模板名称。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>截图时间间隔，5-300秒。</p> 
     * @return SnapshotInterval <p>截图时间间隔，5-300秒。</p>
     */
    public Long getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set <p>截图时间间隔，5-300秒。</p>
     * @param SnapshotInterval <p>截图时间间隔，5-300秒。</p>
     */
    public void setSnapshotInterval(Long SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * Get <p>截图宽度，范围：0-3000。<br>0：原始宽度并适配原始比例。</p> 
     * @return Width <p>截图宽度，范围：0-3000。<br>0：原始宽度并适配原始比例。</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>截图宽度，范围：0-3000。<br>0：原始宽度并适配原始比例。</p>
     * @param Width <p>截图宽度，范围：0-3000。<br>0：原始宽度并适配原始比例。</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>截图高度，范围：0-2000。<br>0：原始高度并适配原始比例。</p> 
     * @return Height <p>截图高度，范围：0-2000。<br>0：原始高度并适配原始比例。</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>截图高度，范围：0-2000。<br>0：原始高度并适配原始比例。</p>
     * @param Height <p>截图高度，范围：0-2000。<br>0：原始高度并适配原始比例。</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>是否开启鉴黄，0：不开启，1：开启。</p> 
     * @return PornFlag <p>是否开启鉴黄，0：不开启，1：开启。</p>
     */
    public Long getPornFlag() {
        return this.PornFlag;
    }

    /**
     * Set <p>是否开启鉴黄，0：不开启，1：开启。</p>
     * @param PornFlag <p>是否开启鉴黄，0：不开启，1：开启。</p>
     */
    public void setPornFlag(Long PornFlag) {
        this.PornFlag = PornFlag;
    }

    /**
     * Get <p>Cos 应用 ID。</p> 
     * @return CosAppId <p>Cos 应用 ID。</p>
     */
    public Long getCosAppId() {
        return this.CosAppId;
    }

    /**
     * Set <p>Cos 应用 ID。</p>
     * @param CosAppId <p>Cos 应用 ID。</p>
     */
    public void setCosAppId(Long CosAppId) {
        this.CosAppId = CosAppId;
    }

    /**
     * Get <p>Cos Bucket名称。</p> 
     * @return CosBucket <p>Cos Bucket名称。</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>Cos Bucket名称。</p>
     * @param CosBucket <p>Cos Bucket名称。</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>Cos 地域。</p> 
     * @return CosRegion <p>Cos 地域。</p>
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set <p>Cos 地域。</p>
     * @param CosRegion <p>Cos 地域。</p>
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get <p>模板描述。</p> 
     * @return Description <p>模板描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模板描述。</p>
     * @param Description <p>模板描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Cos Bucket文件夹前缀。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPrefix <p>Cos Bucket文件夹前缀。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosPrefix() {
        return this.CosPrefix;
    }

    /**
     * Set <p>Cos Bucket文件夹前缀。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPrefix <p>Cos Bucket文件夹前缀。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPrefix(String CosPrefix) {
        this.CosPrefix = CosPrefix;
    }

    /**
     * Get <p>Cos 文件名称。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosFileName <p>Cos 文件名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set <p>Cos 文件名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosFileName <p>Cos 文件名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    /**
     * Get <p>第三方存储时账号的SecretId</p> 
     * @return CosSecretId <p>第三方存储时账号的SecretId</p>
     */
    public String getCosSecretId() {
        return this.CosSecretId;
    }

    /**
     * Set <p>第三方存储时账号的SecretId</p>
     * @param CosSecretId <p>第三方存储时账号的SecretId</p>
     */
    public void setCosSecretId(String CosSecretId) {
        this.CosSecretId = CosSecretId;
    }

    /**
     * Get <p>第三方存储时，账号的SecretKey</p><p>当查询时，该值返回为<code>******</code></p> 
     * @return CosSecretKey <p>第三方存储时，账号的SecretKey</p><p>当查询时，该值返回为<code>******</code></p>
     */
    public String getCosSecretKey() {
        return this.CosSecretKey;
    }

    /**
     * Set <p>第三方存储时，账号的SecretKey</p><p>当查询时，该值返回为<code>******</code></p>
     * @param CosSecretKey <p>第三方存储时，账号的SecretKey</p><p>当查询时，该值返回为<code>******</code></p>
     */
    public void setCosSecretKey(String CosSecretKey) {
        this.CosSecretKey = CosSecretKey;
    }

    public SnapshotTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotTemplateInfo(SnapshotTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.SnapshotInterval != null) {
            this.SnapshotInterval = new Long(source.SnapshotInterval);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.PornFlag != null) {
            this.PornFlag = new Long(source.PornFlag);
        }
        if (source.CosAppId != null) {
            this.CosAppId = new Long(source.CosAppId);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CosPrefix != null) {
            this.CosPrefix = new String(source.CosPrefix);
        }
        if (source.CosFileName != null) {
            this.CosFileName = new String(source.CosFileName);
        }
        if (source.CosSecretId != null) {
            this.CosSecretId = new String(source.CosSecretId);
        }
        if (source.CosSecretKey != null) {
            this.CosSecretKey = new String(source.CosSecretKey);
        }
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
        this.setParamSimple(map, prefix + "CosSecretId", this.CosSecretId);
        this.setParamSimple(map, prefix + "CosSecretKey", this.CosSecretKey);

    }
}

