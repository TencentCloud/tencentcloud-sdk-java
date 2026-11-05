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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionTargetInfo extends AbstractModel {

    /**
    * <p>targetID</p>
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * <p>targetType</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>target名称</p>
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * <p>资源名称</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>最后活跃时间</p><p>参数格式：2026-11-05 14:30:00</p>
    */
    @SerializedName("LastInteractionTime")
    @Expose
    private String LastInteractionTime;

    /**
    * <p>上下文</p>
    */
    @SerializedName("SurfaceContext")
    @Expose
    private SurfaceContext SurfaceContext;

    /**
    * <p>是否保存</p>
    */
    @SerializedName("Saved")
    @Expose
    private Boolean Saved;

    /**
    * <p>保存时间</p>
    */
    @SerializedName("SavedAt")
    @Expose
    private String SavedAt;

    /**
    * <p>是否删除</p>
    */
    @SerializedName("Deleted")
    @Expose
    private Boolean Deleted;

    /**
     * Get <p>targetID</p> 
     * @return TargetId <p>targetID</p>
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set <p>targetID</p>
     * @param TargetId <p>targetID</p>
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get <p>targetType</p> 
     * @return TargetType <p>targetType</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>targetType</p>
     * @param TargetType <p>targetType</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>target名称</p> 
     * @return TargetName <p>target名称</p>
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set <p>target名称</p>
     * @param TargetName <p>target名称</p>
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get <p>资源名称</p> 
     * @return Source <p>资源名称</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>资源名称</p>
     * @param Source <p>资源名称</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>最后活跃时间</p><p>参数格式：2026-11-05 14:30:00</p> 
     * @return LastInteractionTime <p>最后活跃时间</p><p>参数格式：2026-11-05 14:30:00</p>
     */
    public String getLastInteractionTime() {
        return this.LastInteractionTime;
    }

    /**
     * Set <p>最后活跃时间</p><p>参数格式：2026-11-05 14:30:00</p>
     * @param LastInteractionTime <p>最后活跃时间</p><p>参数格式：2026-11-05 14:30:00</p>
     */
    public void setLastInteractionTime(String LastInteractionTime) {
        this.LastInteractionTime = LastInteractionTime;
    }

    /**
     * Get <p>上下文</p> 
     * @return SurfaceContext <p>上下文</p>
     */
    public SurfaceContext getSurfaceContext() {
        return this.SurfaceContext;
    }

    /**
     * Set <p>上下文</p>
     * @param SurfaceContext <p>上下文</p>
     */
    public void setSurfaceContext(SurfaceContext SurfaceContext) {
        this.SurfaceContext = SurfaceContext;
    }

    /**
     * Get <p>是否保存</p> 
     * @return Saved <p>是否保存</p>
     */
    public Boolean getSaved() {
        return this.Saved;
    }

    /**
     * Set <p>是否保存</p>
     * @param Saved <p>是否保存</p>
     */
    public void setSaved(Boolean Saved) {
        this.Saved = Saved;
    }

    /**
     * Get <p>保存时间</p> 
     * @return SavedAt <p>保存时间</p>
     */
    public String getSavedAt() {
        return this.SavedAt;
    }

    /**
     * Set <p>保存时间</p>
     * @param SavedAt <p>保存时间</p>
     */
    public void setSavedAt(String SavedAt) {
        this.SavedAt = SavedAt;
    }

    /**
     * Get <p>是否删除</p> 
     * @return Deleted <p>是否删除</p>
     */
    public Boolean getDeleted() {
        return this.Deleted;
    }

    /**
     * Set <p>是否删除</p>
     * @param Deleted <p>是否删除</p>
     */
    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    public SessionTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionTargetInfo(SessionTargetInfo source) {
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.LastInteractionTime != null) {
            this.LastInteractionTime = new String(source.LastInteractionTime);
        }
        if (source.SurfaceContext != null) {
            this.SurfaceContext = new SurfaceContext(source.SurfaceContext);
        }
        if (source.Saved != null) {
            this.Saved = new Boolean(source.Saved);
        }
        if (source.SavedAt != null) {
            this.SavedAt = new String(source.SavedAt);
        }
        if (source.Deleted != null) {
            this.Deleted = new Boolean(source.Deleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "LastInteractionTime", this.LastInteractionTime);
        this.setParamObj(map, prefix + "SurfaceContext.", this.SurfaceContext);
        this.setParamSimple(map, prefix + "Saved", this.Saved);
        this.setParamSimple(map, prefix + "SavedAt", this.SavedAt);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);

    }
}

