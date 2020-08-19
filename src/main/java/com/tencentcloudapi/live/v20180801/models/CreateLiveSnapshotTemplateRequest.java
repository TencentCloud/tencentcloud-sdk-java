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

public class CreateLiveSnapshotTemplateRequest extends AbstractModel{

    /**
    * 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

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
    * Cos地区。
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
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
    * 是否开启鉴黄，0：不开启，1：开启。默认：0。
    */
    @SerializedName("PornFlag")
    @Expose
    private Long PornFlag;

    /**
    * Cos Bucket文件夹前缀。
如不传，实际按默认值
/{Year}-{Month}-{Day}
生效
    */
    @SerializedName("CosPrefix")
    @Expose
    private String CosPrefix;

    /**
    * Cos 文件名称。
如不传，实际按默认值
{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}
生效
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
     * Get 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。 
     * @return TemplateName 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
     * @param TemplateName 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
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
     * Get Cos地区。 
     * @return CosRegion Cos地区。
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set Cos地区。
     * @param CosRegion Cos地区。
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。 
     * @return Description 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
     * @param Description 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
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
     * Get 是否开启鉴黄，0：不开启，1：开启。默认：0。 
     * @return PornFlag 是否开启鉴黄，0：不开启，1：开启。默认：0。
     */
    public Long getPornFlag() {
        return this.PornFlag;
    }

    /**
     * Set 是否开启鉴黄，0：不开启，1：开启。默认：0。
     * @param PornFlag 是否开启鉴黄，0：不开启，1：开启。默认：0。
     */
    public void setPornFlag(Long PornFlag) {
        this.PornFlag = PornFlag;
    }

    /**
     * Get Cos Bucket文件夹前缀。
如不传，实际按默认值
/{Year}-{Month}-{Day}
生效 
     * @return CosPrefix Cos Bucket文件夹前缀。
如不传，实际按默认值
/{Year}-{Month}-{Day}
生效
     */
    public String getCosPrefix() {
        return this.CosPrefix;
    }

    /**
     * Set Cos Bucket文件夹前缀。
如不传，实际按默认值
/{Year}-{Month}-{Day}
生效
     * @param CosPrefix Cos Bucket文件夹前缀。
如不传，实际按默认值
/{Year}-{Month}-{Day}
生效
     */
    public void setCosPrefix(String CosPrefix) {
        this.CosPrefix = CosPrefix;
    }

    /**
     * Get Cos 文件名称。
如不传，实际按默认值
{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}
生效 
     * @return CosFileName Cos 文件名称。
如不传，实际按默认值
{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}
生效
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set Cos 文件名称。
如不传，实际按默认值
{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}
生效
     * @param CosFileName Cos 文件名称。
如不传，实际按默认值
{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}
生效
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "CosAppId", this.CosAppId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PornFlag", this.PornFlag);
        this.setParamSimple(map, prefix + "CosPrefix", this.CosPrefix);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

