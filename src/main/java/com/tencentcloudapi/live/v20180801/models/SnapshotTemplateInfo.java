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
    * 模板Id。
    */
    @SerializedName("TemplateId")
    @Expose
    private Integer TemplateId;

    /**
    * 模板名称。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 截图时间间隔。5-300秒。
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Integer SnapshotInterval;

    /**
    * 截图宽度。0-3000 0原始宽度并适配原始比例
    */
    @SerializedName("Width")
    @Expose
    private Integer Width;

    /**
    * 截图高度。0-2000 0原始高度并适配原始比例
    */
    @SerializedName("Height")
    @Expose
    private Integer Height;

    /**
    * 是否开启鉴黄，0：不开启，1：开启。
    */
    @SerializedName("PornFlag")
    @Expose
    private Integer PornFlag;

    /**
    * Cos AppId。
    */
    @SerializedName("CosAppId")
    @Expose
    private Integer CosAppId;

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
    * 模板描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 模板Id。 
     * @return TemplateId 模板Id。
     */
    public Integer getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板Id。
     * @param TemplateId 模板Id。
     */
    public void setTemplateId(Integer TemplateId) {
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
     * Get 截图时间间隔。5-300秒。 
     * @return SnapshotInterval 截图时间间隔。5-300秒。
     */
    public Integer getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set 截图时间间隔。5-300秒。
     * @param SnapshotInterval 截图时间间隔。5-300秒。
     */
    public void setSnapshotInterval(Integer SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * Get 截图宽度。0-3000 0原始宽度并适配原始比例 
     * @return Width 截图宽度。0-3000 0原始宽度并适配原始比例
     */
    public Integer getWidth() {
        return this.Width;
    }

    /**
     * Set 截图宽度。0-3000 0原始宽度并适配原始比例
     * @param Width 截图宽度。0-3000 0原始宽度并适配原始比例
     */
    public void setWidth(Integer Width) {
        this.Width = Width;
    }

    /**
     * Get 截图高度。0-2000 0原始高度并适配原始比例 
     * @return Height 截图高度。0-2000 0原始高度并适配原始比例
     */
    public Integer getHeight() {
        return this.Height;
    }

    /**
     * Set 截图高度。0-2000 0原始高度并适配原始比例
     * @param Height 截图高度。0-2000 0原始高度并适配原始比例
     */
    public void setHeight(Integer Height) {
        this.Height = Height;
    }

    /**
     * Get 是否开启鉴黄，0：不开启，1：开启。 
     * @return PornFlag 是否开启鉴黄，0：不开启，1：开启。
     */
    public Integer getPornFlag() {
        return this.PornFlag;
    }

    /**
     * Set 是否开启鉴黄，0：不开启，1：开启。
     * @param PornFlag 是否开启鉴黄，0：不开启，1：开启。
     */
    public void setPornFlag(Integer PornFlag) {
        this.PornFlag = PornFlag;
    }

    /**
     * Get Cos AppId。 
     * @return CosAppId Cos AppId。
     */
    public Integer getCosAppId() {
        return this.CosAppId;
    }

    /**
     * Set Cos AppId。
     * @param CosAppId Cos AppId。
     */
    public void setCosAppId(Integer CosAppId) {
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
     * Get 模板描述 
     * @return Description 模板描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板描述
     * @param Description 模板描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    }
}

