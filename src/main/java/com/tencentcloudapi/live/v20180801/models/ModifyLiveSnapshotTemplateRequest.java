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

public class ModifyLiveSnapshotTemplateRequest extends AbstractModel {

    /**
    * <p>模板 ID。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>Cos 应用 ID。<br><strong>注：此参数现在须必选。</strong></p>
    */
    @SerializedName("CosAppId")
    @Expose
    private Long CosAppId;

    /**
    * <p>Cos Bucket名称。<br>注：CosBucket参数值不能包含-[appid] 部分。<br><strong>注：此参数现在须必选。</strong></p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>Cos 地域。<br><strong>注：此参数现在须必选。</strong></p>
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * <p>模板名称。<br>长度上限：255字节。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>描述信息。<br>长度上限：1024字节。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>截图间隔，单位s，默认10s。<br>范围： 5s ~ 300s。</p>
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Long SnapshotInterval;

    /**
    * <p>截图宽度。默认：0（原始宽）。</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>截图高度。默认：0（原始高）。</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>是否开启鉴黄，默认 0 。<br>0：不开启。<br>1：开启。</p>
    */
    @SerializedName("PornFlag")
    @Expose
    private Long PornFlag;

    /**
    * <p>Cos Bucket文件夹前缀。</p>
    */
    @SerializedName("CosPrefix")
    @Expose
    private String CosPrefix;

    /**
    * <p>Cos 文件名称。</p>
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

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
     * Get <p>Cos 应用 ID。<br><strong>注：此参数现在须必选。</strong></p> 
     * @return CosAppId <p>Cos 应用 ID。<br><strong>注：此参数现在须必选。</strong></p>
     */
    public Long getCosAppId() {
        return this.CosAppId;
    }

    /**
     * Set <p>Cos 应用 ID。<br><strong>注：此参数现在须必选。</strong></p>
     * @param CosAppId <p>Cos 应用 ID。<br><strong>注：此参数现在须必选。</strong></p>
     */
    public void setCosAppId(Long CosAppId) {
        this.CosAppId = CosAppId;
    }

    /**
     * Get <p>Cos Bucket名称。<br>注：CosBucket参数值不能包含-[appid] 部分。<br><strong>注：此参数现在须必选。</strong></p> 
     * @return CosBucket <p>Cos Bucket名称。<br>注：CosBucket参数值不能包含-[appid] 部分。<br><strong>注：此参数现在须必选。</strong></p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>Cos Bucket名称。<br>注：CosBucket参数值不能包含-[appid] 部分。<br><strong>注：此参数现在须必选。</strong></p>
     * @param CosBucket <p>Cos Bucket名称。<br>注：CosBucket参数值不能包含-[appid] 部分。<br><strong>注：此参数现在须必选。</strong></p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>Cos 地域。<br><strong>注：此参数现在须必选。</strong></p> 
     * @return CosRegion <p>Cos 地域。<br><strong>注：此参数现在须必选。</strong></p>
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set <p>Cos 地域。<br><strong>注：此参数现在须必选。</strong></p>
     * @param CosRegion <p>Cos 地域。<br><strong>注：此参数现在须必选。</strong></p>
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get <p>模板名称。<br>长度上限：255字节。</p> 
     * @return TemplateName <p>模板名称。<br>长度上限：255字节。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称。<br>长度上限：255字节。</p>
     * @param TemplateName <p>模板名称。<br>长度上限：255字节。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>描述信息。<br>长度上限：1024字节。</p> 
     * @return Description <p>描述信息。<br>长度上限：1024字节。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息。<br>长度上限：1024字节。</p>
     * @param Description <p>描述信息。<br>长度上限：1024字节。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>截图间隔，单位s，默认10s。<br>范围： 5s ~ 300s。</p> 
     * @return SnapshotInterval <p>截图间隔，单位s，默认10s。<br>范围： 5s ~ 300s。</p>
     */
    public Long getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set <p>截图间隔，单位s，默认10s。<br>范围： 5s ~ 300s。</p>
     * @param SnapshotInterval <p>截图间隔，单位s，默认10s。<br>范围： 5s ~ 300s。</p>
     */
    public void setSnapshotInterval(Long SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * Get <p>截图宽度。默认：0（原始宽）。</p> 
     * @return Width <p>截图宽度。默认：0（原始宽）。</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>截图宽度。默认：0（原始宽）。</p>
     * @param Width <p>截图宽度。默认：0（原始宽）。</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>截图高度。默认：0（原始高）。</p> 
     * @return Height <p>截图高度。默认：0（原始高）。</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>截图高度。默认：0（原始高）。</p>
     * @param Height <p>截图高度。默认：0（原始高）。</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>是否开启鉴黄，默认 0 。<br>0：不开启。<br>1：开启。</p> 
     * @return PornFlag <p>是否开启鉴黄，默认 0 。<br>0：不开启。<br>1：开启。</p>
     */
    public Long getPornFlag() {
        return this.PornFlag;
    }

    /**
     * Set <p>是否开启鉴黄，默认 0 。<br>0：不开启。<br>1：开启。</p>
     * @param PornFlag <p>是否开启鉴黄，默认 0 。<br>0：不开启。<br>1：开启。</p>
     */
    public void setPornFlag(Long PornFlag) {
        this.PornFlag = PornFlag;
    }

    /**
     * Get <p>Cos Bucket文件夹前缀。</p> 
     * @return CosPrefix <p>Cos Bucket文件夹前缀。</p>
     */
    public String getCosPrefix() {
        return this.CosPrefix;
    }

    /**
     * Set <p>Cos Bucket文件夹前缀。</p>
     * @param CosPrefix <p>Cos Bucket文件夹前缀。</p>
     */
    public void setCosPrefix(String CosPrefix) {
        this.CosPrefix = CosPrefix;
    }

    /**
     * Get <p>Cos 文件名称。</p> 
     * @return CosFileName <p>Cos 文件名称。</p>
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set <p>Cos 文件名称。</p>
     * @param CosFileName <p>Cos 文件名称。</p>
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    public ModifyLiveSnapshotTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveSnapshotTemplateRequest(ModifyLiveSnapshotTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
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
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.CosPrefix != null) {
            this.CosPrefix = new String(source.CosPrefix);
        }
        if (source.CosFileName != null) {
            this.CosFileName = new String(source.CosFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "CosAppId", this.CosAppId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PornFlag", this.PornFlag);
        this.setParamSimple(map, prefix + "CosPrefix", this.CosPrefix);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

