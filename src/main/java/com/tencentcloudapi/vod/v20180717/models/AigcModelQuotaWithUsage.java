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

public class AigcModelQuotaWithUsage extends AbstractModel {

    /**
    * <p>模型名称。</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型版本。</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>任务的配额数。</p><p>单位：张/秒。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li></ul>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li></ul>
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
     * Get <p>模型名称。</p> 
     * @return ModelName <p>模型名称。</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。</p>
     * @param ModelName <p>模型名称。</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型版本。</p> 
     * @return ModelVersion <p>模型版本。</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本。</p>
     * @param ModelVersion <p>模型版本。</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>任务的配额数。</p><p>单位：张/秒。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li></ul> 
     * @return QuotaLimit <p>任务的配额数。</p><p>单位：张/秒。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li></ul>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>任务的配额数。</p><p>单位：张/秒。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li></ul>
     * @param QuotaLimit <p>任务的配额数。</p><p>单位：张/秒。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li></ul>
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li></ul> 
     * @return Usage <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li></ul>
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li></ul>
     * @param Usage <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li></ul>
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    public AigcModelQuotaWithUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcModelQuotaWithUsage(AigcModelQuotaWithUsage source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

