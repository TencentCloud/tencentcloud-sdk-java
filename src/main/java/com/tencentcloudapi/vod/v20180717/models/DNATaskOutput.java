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

public class DNATaskOutput extends AbstractModel {

    /**
    * <p>命中的参考媒资 FileId。</p>
    */
    @SerializedName("RefFileId")
    @Expose
    private String RefFileId;

    /**
    * <p>查询媒资命中片段起始时间。</p><p>单位：秒</p>
    */
    @SerializedName("QueryStartSec")
    @Expose
    private Float QueryStartSec;

    /**
    * <p>查询媒资命中片段结束时间。</p><p>单位：秒</p>
    */
    @SerializedName("QueryEndSec")
    @Expose
    private Float QueryEndSec;

    /**
    * <p>参考媒资对应片段起始时间。</p><p>单位：秒</p>
    */
    @SerializedName("RefStartSec")
    @Expose
    private Float RefStartSec;

    /**
    * <p>参考媒资对应片段结束时间。</p><p>单位：秒</p>
    */
    @SerializedName("RefEndSec")
    @Expose
    private Float RefEndSec;

    /**
    * <p>匹配置信度。</p><p>取值范围：[0, 1]</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>变速比（1.0 表示原速，非 1 表示加速或者减速）。</p>
    */
    @SerializedName("SpeedRatio")
    @Expose
    private Float SpeedRatio;

    /**
     * Get <p>命中的参考媒资 FileId。</p> 
     * @return RefFileId <p>命中的参考媒资 FileId。</p>
     */
    public String getRefFileId() {
        return this.RefFileId;
    }

    /**
     * Set <p>命中的参考媒资 FileId。</p>
     * @param RefFileId <p>命中的参考媒资 FileId。</p>
     */
    public void setRefFileId(String RefFileId) {
        this.RefFileId = RefFileId;
    }

    /**
     * Get <p>查询媒资命中片段起始时间。</p><p>单位：秒</p> 
     * @return QueryStartSec <p>查询媒资命中片段起始时间。</p><p>单位：秒</p>
     */
    public Float getQueryStartSec() {
        return this.QueryStartSec;
    }

    /**
     * Set <p>查询媒资命中片段起始时间。</p><p>单位：秒</p>
     * @param QueryStartSec <p>查询媒资命中片段起始时间。</p><p>单位：秒</p>
     */
    public void setQueryStartSec(Float QueryStartSec) {
        this.QueryStartSec = QueryStartSec;
    }

    /**
     * Get <p>查询媒资命中片段结束时间。</p><p>单位：秒</p> 
     * @return QueryEndSec <p>查询媒资命中片段结束时间。</p><p>单位：秒</p>
     */
    public Float getQueryEndSec() {
        return this.QueryEndSec;
    }

    /**
     * Set <p>查询媒资命中片段结束时间。</p><p>单位：秒</p>
     * @param QueryEndSec <p>查询媒资命中片段结束时间。</p><p>单位：秒</p>
     */
    public void setQueryEndSec(Float QueryEndSec) {
        this.QueryEndSec = QueryEndSec;
    }

    /**
     * Get <p>参考媒资对应片段起始时间。</p><p>单位：秒</p> 
     * @return RefStartSec <p>参考媒资对应片段起始时间。</p><p>单位：秒</p>
     */
    public Float getRefStartSec() {
        return this.RefStartSec;
    }

    /**
     * Set <p>参考媒资对应片段起始时间。</p><p>单位：秒</p>
     * @param RefStartSec <p>参考媒资对应片段起始时间。</p><p>单位：秒</p>
     */
    public void setRefStartSec(Float RefStartSec) {
        this.RefStartSec = RefStartSec;
    }

    /**
     * Get <p>参考媒资对应片段结束时间。</p><p>单位：秒</p> 
     * @return RefEndSec <p>参考媒资对应片段结束时间。</p><p>单位：秒</p>
     */
    public Float getRefEndSec() {
        return this.RefEndSec;
    }

    /**
     * Set <p>参考媒资对应片段结束时间。</p><p>单位：秒</p>
     * @param RefEndSec <p>参考媒资对应片段结束时间。</p><p>单位：秒</p>
     */
    public void setRefEndSec(Float RefEndSec) {
        this.RefEndSec = RefEndSec;
    }

    /**
     * Get <p>匹配置信度。</p><p>取值范围：[0, 1]</p> 
     * @return Confidence <p>匹配置信度。</p><p>取值范围：[0, 1]</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>匹配置信度。</p><p>取值范围：[0, 1]</p>
     * @param Confidence <p>匹配置信度。</p><p>取值范围：[0, 1]</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>变速比（1.0 表示原速，非 1 表示加速或者减速）。</p> 
     * @return SpeedRatio <p>变速比（1.0 表示原速，非 1 表示加速或者减速）。</p>
     */
    public Float getSpeedRatio() {
        return this.SpeedRatio;
    }

    /**
     * Set <p>变速比（1.0 表示原速，非 1 表示加速或者减速）。</p>
     * @param SpeedRatio <p>变速比（1.0 表示原速，非 1 表示加速或者减速）。</p>
     */
    public void setSpeedRatio(Float SpeedRatio) {
        this.SpeedRatio = SpeedRatio;
    }

    public DNATaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNATaskOutput(DNATaskOutput source) {
        if (source.RefFileId != null) {
            this.RefFileId = new String(source.RefFileId);
        }
        if (source.QueryStartSec != null) {
            this.QueryStartSec = new Float(source.QueryStartSec);
        }
        if (source.QueryEndSec != null) {
            this.QueryEndSec = new Float(source.QueryEndSec);
        }
        if (source.RefStartSec != null) {
            this.RefStartSec = new Float(source.RefStartSec);
        }
        if (source.RefEndSec != null) {
            this.RefEndSec = new Float(source.RefEndSec);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.SpeedRatio != null) {
            this.SpeedRatio = new Float(source.SpeedRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RefFileId", this.RefFileId);
        this.setParamSimple(map, prefix + "QueryStartSec", this.QueryStartSec);
        this.setParamSimple(map, prefix + "QueryEndSec", this.QueryEndSec);
        this.setParamSimple(map, prefix + "RefStartSec", this.RefStartSec);
        this.setParamSimple(map, prefix + "RefEndSec", this.RefEndSec);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "SpeedRatio", this.SpeedRatio);

    }
}

