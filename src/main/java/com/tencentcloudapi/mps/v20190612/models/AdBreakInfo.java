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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdBreakInfo extends AbstractModel {

    /**
    * SourceLocationId。
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * VodSourceName。
    */
    @SerializedName("VodSourceName")
    @Expose
    private String VodSourceName;

    /**
    * Offset。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * MessageType，分SpliceInsert和TimeSignal。
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
    * TimeSignalConf。
    */
    @SerializedName("TimeSignalConf")
    @Expose
    private TimeSignalInfo TimeSignalConf;

    /**
    * SpliceInsertConf。
    */
    @SerializedName("SpliceInsertConf")
    @Expose
    private SpliceInsertInfo SpliceInsertConf;

    /**
    * Metadatas。
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
    * SourceLocationName。
    */
    @SerializedName("SourceLocationName")
    @Expose
    private String SourceLocationName;

    /**
     * Get SourceLocationId。 
     * @return SourceLocationId SourceLocationId。
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set SourceLocationId。
     * @param SourceLocationId SourceLocationId。
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get VodSourceName。 
     * @return VodSourceName VodSourceName。
     */
    public String getVodSourceName() {
        return this.VodSourceName;
    }

    /**
     * Set VodSourceName。
     * @param VodSourceName VodSourceName。
     */
    public void setVodSourceName(String VodSourceName) {
        this.VodSourceName = VodSourceName;
    }

    /**
     * Get Offset。 
     * @return Offset Offset。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset。
     * @param Offset Offset。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get MessageType，分SpliceInsert和TimeSignal。 
     * @return MessageType MessageType，分SpliceInsert和TimeSignal。
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set MessageType，分SpliceInsert和TimeSignal。
     * @param MessageType MessageType，分SpliceInsert和TimeSignal。
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Get TimeSignalConf。 
     * @return TimeSignalConf TimeSignalConf。
     */
    public TimeSignalInfo getTimeSignalConf() {
        return this.TimeSignalConf;
    }

    /**
     * Set TimeSignalConf。
     * @param TimeSignalConf TimeSignalConf。
     */
    public void setTimeSignalConf(TimeSignalInfo TimeSignalConf) {
        this.TimeSignalConf = TimeSignalConf;
    }

    /**
     * Get SpliceInsertConf。 
     * @return SpliceInsertConf SpliceInsertConf。
     */
    public SpliceInsertInfo getSpliceInsertConf() {
        return this.SpliceInsertConf;
    }

    /**
     * Set SpliceInsertConf。
     * @param SpliceInsertConf SpliceInsertConf。
     */
    public void setSpliceInsertConf(SpliceInsertInfo SpliceInsertConf) {
        this.SpliceInsertConf = SpliceInsertConf;
    }

    /**
     * Get Metadatas。 
     * @return Metadatas Metadatas。
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set Metadatas。
     * @param Metadatas Metadatas。
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    /**
     * Get SourceLocationName。 
     * @return SourceLocationName SourceLocationName。
     */
    public String getSourceLocationName() {
        return this.SourceLocationName;
    }

    /**
     * Set SourceLocationName。
     * @param SourceLocationName SourceLocationName。
     */
    public void setSourceLocationName(String SourceLocationName) {
        this.SourceLocationName = SourceLocationName;
    }

    public AdBreakInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdBreakInfo(AdBreakInfo source) {
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.VodSourceName != null) {
            this.VodSourceName = new String(source.VodSourceName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.MessageType != null) {
            this.MessageType = new String(source.MessageType);
        }
        if (source.TimeSignalConf != null) {
            this.TimeSignalConf = new TimeSignalInfo(source.TimeSignalConf);
        }
        if (source.SpliceInsertConf != null) {
            this.SpliceInsertConf = new SpliceInsertInfo(source.SpliceInsertConf);
        }
        if (source.Metadatas != null) {
            this.Metadatas = new Metadata[source.Metadatas.length];
            for (int i = 0; i < source.Metadatas.length; i++) {
                this.Metadatas[i] = new Metadata(source.Metadatas[i]);
            }
        }
        if (source.SourceLocationName != null) {
            this.SourceLocationName = new String(source.SourceLocationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "VodSourceName", this.VodSourceName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);
        this.setParamObj(map, prefix + "TimeSignalConf.", this.TimeSignalConf);
        this.setParamObj(map, prefix + "SpliceInsertConf.", this.SpliceInsertConf);
        this.setParamArrayObj(map, prefix + "Metadatas.", this.Metadatas);
        this.setParamSimple(map, prefix + "SourceLocationName", this.SourceLocationName);

    }
}

