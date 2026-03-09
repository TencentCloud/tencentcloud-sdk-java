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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveRecordInfo extends AbstractModel {

    /**
    * <p>直播录制域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>直播录制Path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>直播录制流 ID。</p>
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * <p>录制起始时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("RecordStartTime")
    @Expose
    private String RecordStartTime;

    /**
    * <p>录制结束时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("RecordEndTime")
    @Expose
    private String RecordEndTime;

    /**
     * Get <p>直播录制域名</p> 
     * @return Domain <p>直播录制域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>直播录制域名</p>
     * @param Domain <p>直播录制域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>直播录制Path</p> 
     * @return Path <p>直播录制Path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>直播录制Path</p>
     * @param Path <p>直播录制Path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>直播录制流 ID。</p> 
     * @return StreamId <p>直播录制流 ID。</p>
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set <p>直播录制流 ID。</p>
     * @param StreamId <p>直播录制流 ID。</p>
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get <p>录制起始时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return RecordStartTime <p>录制起始时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getRecordStartTime() {
        return this.RecordStartTime;
    }

    /**
     * Set <p>录制起始时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param RecordStartTime <p>录制起始时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setRecordStartTime(String RecordStartTime) {
        this.RecordStartTime = RecordStartTime;
    }

    /**
     * Get <p>录制结束时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return RecordEndTime <p>录制结束时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getRecordEndTime() {
        return this.RecordEndTime;
    }

    /**
     * Set <p>录制结束时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param RecordEndTime <p>录制结束时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setRecordEndTime(String RecordEndTime) {
        this.RecordEndTime = RecordEndTime;
    }

    public LiveRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordInfo(LiveRecordInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.RecordStartTime != null) {
            this.RecordStartTime = new String(source.RecordStartTime);
        }
        if (source.RecordEndTime != null) {
            this.RecordEndTime = new String(source.RecordEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "RecordStartTime", this.RecordStartTime);
        this.setParamSimple(map, prefix + "RecordEndTime", this.RecordEndTime);

    }
}

