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

public class ModifyLiveSnapshotTemplateRequest extends AbstractModel{

    /**
    * 模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 模板名称。
长度上限：255字节。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 描述信息。
长度上限：1024字节。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 截图间隔，单位s，默认10s。
范围： 5s ~ 300s。
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Long SnapshotInterval;

    /**
    * 截图宽度。默认：0（原始宽）。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 截图高度。默认：0（原始高）。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 是否开启鉴黄，默认 0 。
0：不开启。
1：开启。
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
注：CosBucket参数值不能包含-[appid] 部分。
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
    * Cos Bucket文件夹前缀。
    */
    @SerializedName("CosPrefix")
    @Expose
    private String CosPrefix;

    /**
    * Cos 文件名称。
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
长度上限：255字节。 
     * @return TemplateName 模板名称。
长度上限：255字节。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
长度上限：255字节。
     * @param TemplateName 模板名称。
长度上限：255字节。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 描述信息。
长度上限：1024字节。 
     * @return Description 描述信息。
长度上限：1024字节。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
长度上限：1024字节。
     * @param Description 描述信息。
长度上限：1024字节。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 截图间隔，单位s，默认10s。
范围： 5s ~ 300s。 
     * @return SnapshotInterval 截图间隔，单位s，默认10s。
范围： 5s ~ 300s。
     */
    public Long getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set 截图间隔，单位s，默认10s。
范围： 5s ~ 300s。
     * @param SnapshotInterval 截图间隔，单位s，默认10s。
范围： 5s ~ 300s。
     */
    public void setSnapshotInterval(Long SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * Get 截图宽度。默认：0（原始宽）。 
     * @return Width 截图宽度。默认：0（原始宽）。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 截图宽度。默认：0（原始宽）。
     * @param Width 截图宽度。默认：0（原始宽）。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 截图高度。默认：0（原始高）。 
     * @return Height 截图高度。默认：0（原始高）。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 截图高度。默认：0（原始高）。
     * @param Height 截图高度。默认：0（原始高）。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 是否开启鉴黄，默认 0 。
0：不开启。
1：开启。 
     * @return PornFlag 是否开启鉴黄，默认 0 。
0：不开启。
1：开启。
     */
    public Long getPornFlag() {
        return this.PornFlag;
    }

    /**
     * Set 是否开启鉴黄，默认 0 。
0：不开启。
1：开启。
     * @param PornFlag 是否开启鉴黄，默认 0 。
0：不开启。
1：开启。
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
注：CosBucket参数值不能包含-[appid] 部分。 
     * @return CosBucket Cos Bucket名称。
注：CosBucket参数值不能包含-[appid] 部分。
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set Cos Bucket名称。
注：CosBucket参数值不能包含-[appid] 部分。
     * @param CosBucket Cos Bucket名称。
注：CosBucket参数值不能包含-[appid] 部分。
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
     * Get Cos Bucket文件夹前缀。 
     * @return CosPrefix Cos Bucket文件夹前缀。
     */
    public String getCosPrefix() {
        return this.CosPrefix;
    }

    /**
     * Set Cos Bucket文件夹前缀。
     * @param CosPrefix Cos Bucket文件夹前缀。
     */
    public void setCosPrefix(String CosPrefix) {
        this.CosPrefix = CosPrefix;
    }

    /**
     * Get Cos 文件名称。 
     * @return CosFileName Cos 文件名称。
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set Cos 文件名称。
     * @param CosFileName Cos 文件名称。
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PornFlag", this.PornFlag);
        this.setParamSimple(map, prefix + "CosAppId", this.CosAppId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "CosPrefix", this.CosPrefix);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

