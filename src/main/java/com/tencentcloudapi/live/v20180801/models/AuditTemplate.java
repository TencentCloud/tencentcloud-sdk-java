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

public class AuditTemplate extends AbstractModel {

    /**
    * <p>模板 ID 。<br>CreateAuditTemplate 时，此参数不传或传 0 。</p><p>ModifyAuditTemplate 时，此参数必传。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>模板名称。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>描述信息。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Cos Bucket名称。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>Cos 地域。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * <p>Cos 完整文件名（包括前缀）。CreateAuditTemplate 必填。</p>
    */
    @SerializedName("CosFilePath")
    @Expose
    private String CosFilePath;

    /**
    * <p>是否启用图片审核。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("AuditImage")
    @Expose
    private Boolean AuditImage;

    /**
    * <p>是否启用音频审核。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("AuditAudio")
    @Expose
    private Boolean AuditAudio;

    /**
    * <p>截图间隔，1-60秒。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Long SnapshotInterval;

    /**
    * <p>音频间隔，1-60秒。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("AudioInterval")
    @Expose
    private Long AudioInterval;

    /**
    * <p>是否开启 Cos 容灾。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("EnableFailoverCos")
    @Expose
    private Boolean EnableFailoverCos;

    /**
    * <p>容灾 Cos Bucket 。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("FailoverCosBucket")
    @Expose
    private String FailoverCosBucket;

    /**
    * <p>容灾 Cos 地域。<br>CreateAuditTemplate 必填。</p>
    */
    @SerializedName("FailoverCosRegion")
    @Expose
    private String FailoverCosRegion;

    /**
    * <p>场景策略配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneInfos")
    @Expose
    private CMSSceneDetail [] SceneInfos;

    /**
    * <p>1：表示启用音频文本识别。0 ：不启用。默认 0 。</p>
    */
    @SerializedName("AuditText")
    @Expose
    private Long AuditText;

    /**
     * Get <p>模板 ID 。<br>CreateAuditTemplate 时，此参数不传或传 0 。</p><p>ModifyAuditTemplate 时，此参数必传。</p> 
     * @return TemplateId <p>模板 ID 。<br>CreateAuditTemplate 时，此参数不传或传 0 。</p><p>ModifyAuditTemplate 时，此参数必传。</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板 ID 。<br>CreateAuditTemplate 时，此参数不传或传 0 。</p><p>ModifyAuditTemplate 时，此参数必传。</p>
     * @param TemplateId <p>模板 ID 。<br>CreateAuditTemplate 时，此参数不传或传 0 。</p><p>ModifyAuditTemplate 时，此参数必传。</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>模板名称。<br>CreateAuditTemplate 必填。</p> 
     * @return TemplateName <p>模板名称。<br>CreateAuditTemplate 必填。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称。<br>CreateAuditTemplate 必填。</p>
     * @param TemplateName <p>模板名称。<br>CreateAuditTemplate 必填。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>描述信息。<br>CreateAuditTemplate 必填。</p> 
     * @return Description <p>描述信息。<br>CreateAuditTemplate 必填。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息。<br>CreateAuditTemplate 必填。</p>
     * @param Description <p>描述信息。<br>CreateAuditTemplate 必填。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Cos Bucket名称。<br>CreateAuditTemplate 必填。</p> 
     * @return CosBucket <p>Cos Bucket名称。<br>CreateAuditTemplate 必填。</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>Cos Bucket名称。<br>CreateAuditTemplate 必填。</p>
     * @param CosBucket <p>Cos Bucket名称。<br>CreateAuditTemplate 必填。</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>Cos 地域。<br>CreateAuditTemplate 必填。</p> 
     * @return CosRegion <p>Cos 地域。<br>CreateAuditTemplate 必填。</p>
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set <p>Cos 地域。<br>CreateAuditTemplate 必填。</p>
     * @param CosRegion <p>Cos 地域。<br>CreateAuditTemplate 必填。</p>
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get <p>Cos 完整文件名（包括前缀）。CreateAuditTemplate 必填。</p> 
     * @return CosFilePath <p>Cos 完整文件名（包括前缀）。CreateAuditTemplate 必填。</p>
     */
    public String getCosFilePath() {
        return this.CosFilePath;
    }

    /**
     * Set <p>Cos 完整文件名（包括前缀）。CreateAuditTemplate 必填。</p>
     * @param CosFilePath <p>Cos 完整文件名（包括前缀）。CreateAuditTemplate 必填。</p>
     */
    public void setCosFilePath(String CosFilePath) {
        this.CosFilePath = CosFilePath;
    }

    /**
     * Get <p>是否启用图片审核。<br>CreateAuditTemplate 必填。</p> 
     * @return AuditImage <p>是否启用图片审核。<br>CreateAuditTemplate 必填。</p>
     */
    public Boolean getAuditImage() {
        return this.AuditImage;
    }

    /**
     * Set <p>是否启用图片审核。<br>CreateAuditTemplate 必填。</p>
     * @param AuditImage <p>是否启用图片审核。<br>CreateAuditTemplate 必填。</p>
     */
    public void setAuditImage(Boolean AuditImage) {
        this.AuditImage = AuditImage;
    }

    /**
     * Get <p>是否启用音频审核。<br>CreateAuditTemplate 必填。</p> 
     * @return AuditAudio <p>是否启用音频审核。<br>CreateAuditTemplate 必填。</p>
     */
    public Boolean getAuditAudio() {
        return this.AuditAudio;
    }

    /**
     * Set <p>是否启用音频审核。<br>CreateAuditTemplate 必填。</p>
     * @param AuditAudio <p>是否启用音频审核。<br>CreateAuditTemplate 必填。</p>
     */
    public void setAuditAudio(Boolean AuditAudio) {
        this.AuditAudio = AuditAudio;
    }

    /**
     * Get <p>截图间隔，1-60秒。<br>CreateAuditTemplate 必填。</p> 
     * @return SnapshotInterval <p>截图间隔，1-60秒。<br>CreateAuditTemplate 必填。</p>
     */
    public Long getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set <p>截图间隔，1-60秒。<br>CreateAuditTemplate 必填。</p>
     * @param SnapshotInterval <p>截图间隔，1-60秒。<br>CreateAuditTemplate 必填。</p>
     */
    public void setSnapshotInterval(Long SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * Get <p>音频间隔，1-60秒。<br>CreateAuditTemplate 必填。</p> 
     * @return AudioInterval <p>音频间隔，1-60秒。<br>CreateAuditTemplate 必填。</p>
     */
    public Long getAudioInterval() {
        return this.AudioInterval;
    }

    /**
     * Set <p>音频间隔，1-60秒。<br>CreateAuditTemplate 必填。</p>
     * @param AudioInterval <p>音频间隔，1-60秒。<br>CreateAuditTemplate 必填。</p>
     */
    public void setAudioInterval(Long AudioInterval) {
        this.AudioInterval = AudioInterval;
    }

    /**
     * Get <p>是否开启 Cos 容灾。<br>CreateAuditTemplate 必填。</p> 
     * @return EnableFailoverCos <p>是否开启 Cos 容灾。<br>CreateAuditTemplate 必填。</p>
     */
    public Boolean getEnableFailoverCos() {
        return this.EnableFailoverCos;
    }

    /**
     * Set <p>是否开启 Cos 容灾。<br>CreateAuditTemplate 必填。</p>
     * @param EnableFailoverCos <p>是否开启 Cos 容灾。<br>CreateAuditTemplate 必填。</p>
     */
    public void setEnableFailoverCos(Boolean EnableFailoverCos) {
        this.EnableFailoverCos = EnableFailoverCos;
    }

    /**
     * Get <p>容灾 Cos Bucket 。<br>CreateAuditTemplate 必填。</p> 
     * @return FailoverCosBucket <p>容灾 Cos Bucket 。<br>CreateAuditTemplate 必填。</p>
     */
    public String getFailoverCosBucket() {
        return this.FailoverCosBucket;
    }

    /**
     * Set <p>容灾 Cos Bucket 。<br>CreateAuditTemplate 必填。</p>
     * @param FailoverCosBucket <p>容灾 Cos Bucket 。<br>CreateAuditTemplate 必填。</p>
     */
    public void setFailoverCosBucket(String FailoverCosBucket) {
        this.FailoverCosBucket = FailoverCosBucket;
    }

    /**
     * Get <p>容灾 Cos 地域。<br>CreateAuditTemplate 必填。</p> 
     * @return FailoverCosRegion <p>容灾 Cos 地域。<br>CreateAuditTemplate 必填。</p>
     */
    public String getFailoverCosRegion() {
        return this.FailoverCosRegion;
    }

    /**
     * Set <p>容灾 Cos 地域。<br>CreateAuditTemplate 必填。</p>
     * @param FailoverCosRegion <p>容灾 Cos 地域。<br>CreateAuditTemplate 必填。</p>
     */
    public void setFailoverCosRegion(String FailoverCosRegion) {
        this.FailoverCosRegion = FailoverCosRegion;
    }

    /**
     * Get <p>场景策略配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneInfos <p>场景策略配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CMSSceneDetail [] getSceneInfos() {
        return this.SceneInfos;
    }

    /**
     * Set <p>场景策略配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneInfos <p>场景策略配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneInfos(CMSSceneDetail [] SceneInfos) {
        this.SceneInfos = SceneInfos;
    }

    /**
     * Get <p>1：表示启用音频文本识别。0 ：不启用。默认 0 。</p> 
     * @return AuditText <p>1：表示启用音频文本识别。0 ：不启用。默认 0 。</p>
     */
    public Long getAuditText() {
        return this.AuditText;
    }

    /**
     * Set <p>1：表示启用音频文本识别。0 ：不启用。默认 0 。</p>
     * @param AuditText <p>1：表示启用音频文本识别。0 ：不启用。默认 0 。</p>
     */
    public void setAuditText(Long AuditText) {
        this.AuditText = AuditText;
    }

    public AuditTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditTemplate(AuditTemplate source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.CosFilePath != null) {
            this.CosFilePath = new String(source.CosFilePath);
        }
        if (source.AuditImage != null) {
            this.AuditImage = new Boolean(source.AuditImage);
        }
        if (source.AuditAudio != null) {
            this.AuditAudio = new Boolean(source.AuditAudio);
        }
        if (source.SnapshotInterval != null) {
            this.SnapshotInterval = new Long(source.SnapshotInterval);
        }
        if (source.AudioInterval != null) {
            this.AudioInterval = new Long(source.AudioInterval);
        }
        if (source.EnableFailoverCos != null) {
            this.EnableFailoverCos = new Boolean(source.EnableFailoverCos);
        }
        if (source.FailoverCosBucket != null) {
            this.FailoverCosBucket = new String(source.FailoverCosBucket);
        }
        if (source.FailoverCosRegion != null) {
            this.FailoverCosRegion = new String(source.FailoverCosRegion);
        }
        if (source.SceneInfos != null) {
            this.SceneInfos = new CMSSceneDetail[source.SceneInfos.length];
            for (int i = 0; i < source.SceneInfos.length; i++) {
                this.SceneInfos[i] = new CMSSceneDetail(source.SceneInfos[i]);
            }
        }
        if (source.AuditText != null) {
            this.AuditText = new Long(source.AuditText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "CosFilePath", this.CosFilePath);
        this.setParamSimple(map, prefix + "AuditImage", this.AuditImage);
        this.setParamSimple(map, prefix + "AuditAudio", this.AuditAudio);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "AudioInterval", this.AudioInterval);
        this.setParamSimple(map, prefix + "EnableFailoverCos", this.EnableFailoverCos);
        this.setParamSimple(map, prefix + "FailoverCosBucket", this.FailoverCosBucket);
        this.setParamSimple(map, prefix + "FailoverCosRegion", this.FailoverCosRegion);
        this.setParamArrayObj(map, prefix + "SceneInfos.", this.SceneInfos);
        this.setParamSimple(map, prefix + "AuditText", this.AuditText);

    }
}

