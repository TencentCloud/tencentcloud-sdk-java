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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SymbolicatedView extends AbstractModel {

    /**
    * <p>符号化版本</p>
    */
    @SerializedName("SymbolicationVersion")
    @Expose
    private Long SymbolicationVersion;

    /**
    * <p>符号化时间</p>
    */
    @SerializedName("SymbolicatedAt")
    @Expose
    private String SymbolicatedAt;

    /**
    * <p>状态：success / missing / skipped</p>
    */
    @SerializedName("SymbolicationStatus")
    @Expose
    private String SymbolicationStatus;

    /**
    * <p>跳过原因</p>
    */
    @SerializedName("SymbolicationSkipReason")
    @Expose
    private String SymbolicationSkipReason;

    /**
    * <p>来源</p>
    */
    @SerializedName("SymbolicationSource")
    @Expose
    private String SymbolicationSource;

    /**
    * <p>release</p>
    */
    @SerializedName("SymbolicationRelease")
    @Expose
    private String SymbolicationRelease;

    /**
    * <p>dist</p>
    */
    @SerializedName("SymbolicationDist")
    @Expose
    private String SymbolicationDist;

    /**
    * <p>耗时毫秒</p>
    */
    @SerializedName("SymbolicationDurationMs")
    @Expose
    private Long SymbolicationDurationMs;

    /**
    * <p>Symbolicator 请求 ID</p>
    */
    @SerializedName("SymbolicatorRequestId")
    @Expose
    private String SymbolicatorRequestId;

    /**
    * <p>翻译后堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Frames")
    @Expose
    private EventFrame [] Frames;

    /**
     * Get <p>符号化版本</p> 
     * @return SymbolicationVersion <p>符号化版本</p>
     */
    public Long getSymbolicationVersion() {
        return this.SymbolicationVersion;
    }

    /**
     * Set <p>符号化版本</p>
     * @param SymbolicationVersion <p>符号化版本</p>
     */
    public void setSymbolicationVersion(Long SymbolicationVersion) {
        this.SymbolicationVersion = SymbolicationVersion;
    }

    /**
     * Get <p>符号化时间</p> 
     * @return SymbolicatedAt <p>符号化时间</p>
     */
    public String getSymbolicatedAt() {
        return this.SymbolicatedAt;
    }

    /**
     * Set <p>符号化时间</p>
     * @param SymbolicatedAt <p>符号化时间</p>
     */
    public void setSymbolicatedAt(String SymbolicatedAt) {
        this.SymbolicatedAt = SymbolicatedAt;
    }

    /**
     * Get <p>状态：success / missing / skipped</p> 
     * @return SymbolicationStatus <p>状态：success / missing / skipped</p>
     */
    public String getSymbolicationStatus() {
        return this.SymbolicationStatus;
    }

    /**
     * Set <p>状态：success / missing / skipped</p>
     * @param SymbolicationStatus <p>状态：success / missing / skipped</p>
     */
    public void setSymbolicationStatus(String SymbolicationStatus) {
        this.SymbolicationStatus = SymbolicationStatus;
    }

    /**
     * Get <p>跳过原因</p> 
     * @return SymbolicationSkipReason <p>跳过原因</p>
     */
    public String getSymbolicationSkipReason() {
        return this.SymbolicationSkipReason;
    }

    /**
     * Set <p>跳过原因</p>
     * @param SymbolicationSkipReason <p>跳过原因</p>
     */
    public void setSymbolicationSkipReason(String SymbolicationSkipReason) {
        this.SymbolicationSkipReason = SymbolicationSkipReason;
    }

    /**
     * Get <p>来源</p> 
     * @return SymbolicationSource <p>来源</p>
     */
    public String getSymbolicationSource() {
        return this.SymbolicationSource;
    }

    /**
     * Set <p>来源</p>
     * @param SymbolicationSource <p>来源</p>
     */
    public void setSymbolicationSource(String SymbolicationSource) {
        this.SymbolicationSource = SymbolicationSource;
    }

    /**
     * Get <p>release</p> 
     * @return SymbolicationRelease <p>release</p>
     */
    public String getSymbolicationRelease() {
        return this.SymbolicationRelease;
    }

    /**
     * Set <p>release</p>
     * @param SymbolicationRelease <p>release</p>
     */
    public void setSymbolicationRelease(String SymbolicationRelease) {
        this.SymbolicationRelease = SymbolicationRelease;
    }

    /**
     * Get <p>dist</p> 
     * @return SymbolicationDist <p>dist</p>
     */
    public String getSymbolicationDist() {
        return this.SymbolicationDist;
    }

    /**
     * Set <p>dist</p>
     * @param SymbolicationDist <p>dist</p>
     */
    public void setSymbolicationDist(String SymbolicationDist) {
        this.SymbolicationDist = SymbolicationDist;
    }

    /**
     * Get <p>耗时毫秒</p> 
     * @return SymbolicationDurationMs <p>耗时毫秒</p>
     */
    public Long getSymbolicationDurationMs() {
        return this.SymbolicationDurationMs;
    }

    /**
     * Set <p>耗时毫秒</p>
     * @param SymbolicationDurationMs <p>耗时毫秒</p>
     */
    public void setSymbolicationDurationMs(Long SymbolicationDurationMs) {
        this.SymbolicationDurationMs = SymbolicationDurationMs;
    }

    /**
     * Get <p>Symbolicator 请求 ID</p> 
     * @return SymbolicatorRequestId <p>Symbolicator 请求 ID</p>
     */
    public String getSymbolicatorRequestId() {
        return this.SymbolicatorRequestId;
    }

    /**
     * Set <p>Symbolicator 请求 ID</p>
     * @param SymbolicatorRequestId <p>Symbolicator 请求 ID</p>
     */
    public void setSymbolicatorRequestId(String SymbolicatorRequestId) {
        this.SymbolicatorRequestId = SymbolicatorRequestId;
    }

    /**
     * Get <p>翻译后堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Frames <p>翻译后堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventFrame [] getFrames() {
        return this.Frames;
    }

    /**
     * Set <p>翻译后堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Frames <p>翻译后堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrames(EventFrame [] Frames) {
        this.Frames = Frames;
    }

    public SymbolicatedView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SymbolicatedView(SymbolicatedView source) {
        if (source.SymbolicationVersion != null) {
            this.SymbolicationVersion = new Long(source.SymbolicationVersion);
        }
        if (source.SymbolicatedAt != null) {
            this.SymbolicatedAt = new String(source.SymbolicatedAt);
        }
        if (source.SymbolicationStatus != null) {
            this.SymbolicationStatus = new String(source.SymbolicationStatus);
        }
        if (source.SymbolicationSkipReason != null) {
            this.SymbolicationSkipReason = new String(source.SymbolicationSkipReason);
        }
        if (source.SymbolicationSource != null) {
            this.SymbolicationSource = new String(source.SymbolicationSource);
        }
        if (source.SymbolicationRelease != null) {
            this.SymbolicationRelease = new String(source.SymbolicationRelease);
        }
        if (source.SymbolicationDist != null) {
            this.SymbolicationDist = new String(source.SymbolicationDist);
        }
        if (source.SymbolicationDurationMs != null) {
            this.SymbolicationDurationMs = new Long(source.SymbolicationDurationMs);
        }
        if (source.SymbolicatorRequestId != null) {
            this.SymbolicatorRequestId = new String(source.SymbolicatorRequestId);
        }
        if (source.Frames != null) {
            this.Frames = new EventFrame[source.Frames.length];
            for (int i = 0; i < source.Frames.length; i++) {
                this.Frames[i] = new EventFrame(source.Frames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SymbolicationVersion", this.SymbolicationVersion);
        this.setParamSimple(map, prefix + "SymbolicatedAt", this.SymbolicatedAt);
        this.setParamSimple(map, prefix + "SymbolicationStatus", this.SymbolicationStatus);
        this.setParamSimple(map, prefix + "SymbolicationSkipReason", this.SymbolicationSkipReason);
        this.setParamSimple(map, prefix + "SymbolicationSource", this.SymbolicationSource);
        this.setParamSimple(map, prefix + "SymbolicationRelease", this.SymbolicationRelease);
        this.setParamSimple(map, prefix + "SymbolicationDist", this.SymbolicationDist);
        this.setParamSimple(map, prefix + "SymbolicationDurationMs", this.SymbolicationDurationMs);
        this.setParamSimple(map, prefix + "SymbolicatorRequestId", this.SymbolicatorRequestId);
        this.setParamArrayObj(map, prefix + "Frames.", this.Frames);

    }
}

