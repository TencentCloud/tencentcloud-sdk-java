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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VLPlanResultSnapshotImageUrlInfo extends AbstractModel {

    /**
    * <p>分析结果 ID</p>
    */
    @SerializedName("VLPlanResultId")
    @Expose
    private String VLPlanResultId;

    /**
    * <p>源素材下载 URL（失败时为空）</p>
    */
    @SerializedName("SourceFileURL")
    @Expose
    private String SourceFileURL;

    /**
    * <p>URL 有效期（秒，失败时为 0）</p>
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * <p>错误信息（失败时有值）</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get <p>分析结果 ID</p> 
     * @return VLPlanResultId <p>分析结果 ID</p>
     */
    public String getVLPlanResultId() {
        return this.VLPlanResultId;
    }

    /**
     * Set <p>分析结果 ID</p>
     * @param VLPlanResultId <p>分析结果 ID</p>
     */
    public void setVLPlanResultId(String VLPlanResultId) {
        this.VLPlanResultId = VLPlanResultId;
    }

    /**
     * Get <p>源素材下载 URL（失败时为空）</p> 
     * @return SourceFileURL <p>源素材下载 URL（失败时为空）</p>
     */
    public String getSourceFileURL() {
        return this.SourceFileURL;
    }

    /**
     * Set <p>源素材下载 URL（失败时为空）</p>
     * @param SourceFileURL <p>源素材下载 URL（失败时为空）</p>
     */
    public void setSourceFileURL(String SourceFileURL) {
        this.SourceFileURL = SourceFileURL;
    }

    /**
     * Get <p>URL 有效期（秒，失败时为 0）</p> 
     * @return Expire <p>URL 有效期（秒，失败时为 0）</p>
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set <p>URL 有效期（秒，失败时为 0）</p>
     * @param Expire <p>URL 有效期（秒，失败时为 0）</p>
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get <p>错误信息（失败时有值）</p> 
     * @return ErrMsg <p>错误信息（失败时有值）</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>错误信息（失败时有值）</p>
     * @param ErrMsg <p>错误信息（失败时有值）</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public VLPlanResultSnapshotImageUrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VLPlanResultSnapshotImageUrlInfo(VLPlanResultSnapshotImageUrlInfo source) {
        if (source.VLPlanResultId != null) {
            this.VLPlanResultId = new String(source.VLPlanResultId);
        }
        if (source.SourceFileURL != null) {
            this.SourceFileURL = new String(source.SourceFileURL);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLPlanResultId", this.VLPlanResultId);
        this.setParamSimple(map, prefix + "SourceFileURL", this.SourceFileURL);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

