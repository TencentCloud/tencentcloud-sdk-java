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

public class DescribeReplayDataRequest extends AbstractModel {

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
    * <p>session id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>segment id</p>
    */
    @SerializedName("SegmentId")
    @Expose
    private Long SegmentId;

    /**
    * <p>单个录制分片解压后的最大允许字节数</p><p>取值范围：[1, 8388608]</p><p>单位：字节（Byte）</p>
    */
    @SerializedName("MaxDecodedBytes")
    @Expose
    private Long MaxDecodedBytes;

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
     * Get <p>session id</p> 
     * @return SessionId <p>session id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>session id</p>
     * @param SessionId <p>session id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>segment id</p> 
     * @return SegmentId <p>segment id</p>
     */
    public Long getSegmentId() {
        return this.SegmentId;
    }

    /**
     * Set <p>segment id</p>
     * @param SegmentId <p>segment id</p>
     */
    public void setSegmentId(Long SegmentId) {
        this.SegmentId = SegmentId;
    }

    /**
     * Get <p>单个录制分片解压后的最大允许字节数</p><p>取值范围：[1, 8388608]</p><p>单位：字节（Byte）</p> 
     * @return MaxDecodedBytes <p>单个录制分片解压后的最大允许字节数</p><p>取值范围：[1, 8388608]</p><p>单位：字节（Byte）</p>
     */
    public Long getMaxDecodedBytes() {
        return this.MaxDecodedBytes;
    }

    /**
     * Set <p>单个录制分片解压后的最大允许字节数</p><p>取值范围：[1, 8388608]</p><p>单位：字节（Byte）</p>
     * @param MaxDecodedBytes <p>单个录制分片解压后的最大允许字节数</p><p>取值范围：[1, 8388608]</p><p>单位：字节（Byte）</p>
     */
    public void setMaxDecodedBytes(Long MaxDecodedBytes) {
        this.MaxDecodedBytes = MaxDecodedBytes;
    }

    public DescribeReplayDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplayDataRequest(DescribeReplayDataRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ReplayId != null) {
            this.ReplayId = new String(source.ReplayId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SegmentId != null) {
            this.SegmentId = new Long(source.SegmentId);
        }
        if (source.MaxDecodedBytes != null) {
            this.MaxDecodedBytes = new Long(source.MaxDecodedBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ReplayId", this.ReplayId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SegmentId", this.SegmentId);
        this.setParamSimple(map, prefix + "MaxDecodedBytes", this.MaxDecodedBytes);

    }
}

