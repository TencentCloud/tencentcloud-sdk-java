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

public class DescribeReplayMetaRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>回放id</p>
    */
    @SerializedName("ReplayId")
    @Expose
    private String ReplayId;

    /**
    * <p>会话id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>是否仅查询指定录制分片的轻量索引。默认false。为true时必须通过IndexSegmentIds指定1～16个分片ID，返回IndexEntries，不返回录制正文。</p>
    */
    @SerializedName("IndexOnly")
    @Expose
    private Boolean IndexOnly;

    /**
    * <p>待查询索引的录制分片ID列表。仅在IndexOnly为true时使用，包含1～16个非负且不重复的分片ID。ProbeMissingIndex为true时仅允许指定一个分片ID。</p>
    */
    @SerializedName("IndexSegmentIds")
    @Expose
    private Long [] IndexSegmentIds;

    /**
    * <p>是否在录制分片缺少索引时进行受限兼容探测。默认false。为true时必须同时设置IndexOnly为true，且IndexSegmentIds仅包含一个分片ID。</p>
    */
    @SerializedName("ProbeMissingIndex")
    @Expose
    private Boolean ProbeMissingIndex;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>回放id</p> 
     * @return ReplayId <p>回放id</p>
     */
    public String getReplayId() {
        return this.ReplayId;
    }

    /**
     * Set <p>回放id</p>
     * @param ReplayId <p>回放id</p>
     */
    public void setReplayId(String ReplayId) {
        this.ReplayId = ReplayId;
    }

    /**
     * Get <p>会话id</p> 
     * @return SessionId <p>会话id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话id</p>
     * @param SessionId <p>会话id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>是否仅查询指定录制分片的轻量索引。默认false。为true时必须通过IndexSegmentIds指定1～16个分片ID，返回IndexEntries，不返回录制正文。</p> 
     * @return IndexOnly <p>是否仅查询指定录制分片的轻量索引。默认false。为true时必须通过IndexSegmentIds指定1～16个分片ID，返回IndexEntries，不返回录制正文。</p>
     */
    public Boolean getIndexOnly() {
        return this.IndexOnly;
    }

    /**
     * Set <p>是否仅查询指定录制分片的轻量索引。默认false。为true时必须通过IndexSegmentIds指定1～16个分片ID，返回IndexEntries，不返回录制正文。</p>
     * @param IndexOnly <p>是否仅查询指定录制分片的轻量索引。默认false。为true时必须通过IndexSegmentIds指定1～16个分片ID，返回IndexEntries，不返回录制正文。</p>
     */
    public void setIndexOnly(Boolean IndexOnly) {
        this.IndexOnly = IndexOnly;
    }

    /**
     * Get <p>待查询索引的录制分片ID列表。仅在IndexOnly为true时使用，包含1～16个非负且不重复的分片ID。ProbeMissingIndex为true时仅允许指定一个分片ID。</p> 
     * @return IndexSegmentIds <p>待查询索引的录制分片ID列表。仅在IndexOnly为true时使用，包含1～16个非负且不重复的分片ID。ProbeMissingIndex为true时仅允许指定一个分片ID。</p>
     */
    public Long [] getIndexSegmentIds() {
        return this.IndexSegmentIds;
    }

    /**
     * Set <p>待查询索引的录制分片ID列表。仅在IndexOnly为true时使用，包含1～16个非负且不重复的分片ID。ProbeMissingIndex为true时仅允许指定一个分片ID。</p>
     * @param IndexSegmentIds <p>待查询索引的录制分片ID列表。仅在IndexOnly为true时使用，包含1～16个非负且不重复的分片ID。ProbeMissingIndex为true时仅允许指定一个分片ID。</p>
     */
    public void setIndexSegmentIds(Long [] IndexSegmentIds) {
        this.IndexSegmentIds = IndexSegmentIds;
    }

    /**
     * Get <p>是否在录制分片缺少索引时进行受限兼容探测。默认false。为true时必须同时设置IndexOnly为true，且IndexSegmentIds仅包含一个分片ID。</p> 
     * @return ProbeMissingIndex <p>是否在录制分片缺少索引时进行受限兼容探测。默认false。为true时必须同时设置IndexOnly为true，且IndexSegmentIds仅包含一个分片ID。</p>
     */
    public Boolean getProbeMissingIndex() {
        return this.ProbeMissingIndex;
    }

    /**
     * Set <p>是否在录制分片缺少索引时进行受限兼容探测。默认false。为true时必须同时设置IndexOnly为true，且IndexSegmentIds仅包含一个分片ID。</p>
     * @param ProbeMissingIndex <p>是否在录制分片缺少索引时进行受限兼容探测。默认false。为true时必须同时设置IndexOnly为true，且IndexSegmentIds仅包含一个分片ID。</p>
     */
    public void setProbeMissingIndex(Boolean ProbeMissingIndex) {
        this.ProbeMissingIndex = ProbeMissingIndex;
    }

    public DescribeReplayMetaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplayMetaRequest(DescribeReplayMetaRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ReplayId != null) {
            this.ReplayId = new String(source.ReplayId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.IndexOnly != null) {
            this.IndexOnly = new Boolean(source.IndexOnly);
        }
        if (source.IndexSegmentIds != null) {
            this.IndexSegmentIds = new Long[source.IndexSegmentIds.length];
            for (int i = 0; i < source.IndexSegmentIds.length; i++) {
                this.IndexSegmentIds[i] = new Long(source.IndexSegmentIds[i]);
            }
        }
        if (source.ProbeMissingIndex != null) {
            this.ProbeMissingIndex = new Boolean(source.ProbeMissingIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ReplayId", this.ReplayId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "IndexOnly", this.IndexOnly);
        this.setParamArraySimple(map, prefix + "IndexSegmentIds.", this.IndexSegmentIds);
        this.setParamSimple(map, prefix + "ProbeMissingIndex", this.ProbeMissingIndex);

    }
}

