/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCRObtainStatusRequest extends AbstractModel{

    /**
    * xxx
    */
    @SerializedName("TortId")
    @Expose
    private Long TortId;

    /**
    * xxx
    */
    @SerializedName("ObtainType")
    @Expose
    private Long ObtainType;

    /**
    * xxx
    */
    @SerializedName("ObtainDuration")
    @Expose
    private Long ObtainDuration;

    /**
    * xxx
    */
    @SerializedName("ObtainUrl")
    @Expose
    private String ObtainUrl;

    /**
     * Get xxx 
     * @return TortId xxx
     */
    public Long getTortId() {
        return this.TortId;
    }

    /**
     * Set xxx
     * @param TortId xxx
     */
    public void setTortId(Long TortId) {
        this.TortId = TortId;
    }

    /**
     * Get xxx 
     * @return ObtainType xxx
     */
    public Long getObtainType() {
        return this.ObtainType;
    }

    /**
     * Set xxx
     * @param ObtainType xxx
     */
    public void setObtainType(Long ObtainType) {
        this.ObtainType = ObtainType;
    }

    /**
     * Get xxx 
     * @return ObtainDuration xxx
     */
    public Long getObtainDuration() {
        return this.ObtainDuration;
    }

    /**
     * Set xxx
     * @param ObtainDuration xxx
     */
    public void setObtainDuration(Long ObtainDuration) {
        this.ObtainDuration = ObtainDuration;
    }

    /**
     * Get xxx 
     * @return ObtainUrl xxx
     */
    public String getObtainUrl() {
        return this.ObtainUrl;
    }

    /**
     * Set xxx
     * @param ObtainUrl xxx
     */
    public void setObtainUrl(String ObtainUrl) {
        this.ObtainUrl = ObtainUrl;
    }

    public ModifyCRObtainStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCRObtainStatusRequest(ModifyCRObtainStatusRequest source) {
        if (source.TortId != null) {
            this.TortId = new Long(source.TortId);
        }
        if (source.ObtainType != null) {
            this.ObtainType = new Long(source.ObtainType);
        }
        if (source.ObtainDuration != null) {
            this.ObtainDuration = new Long(source.ObtainDuration);
        }
        if (source.ObtainUrl != null) {
            this.ObtainUrl = new String(source.ObtainUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TortId", this.TortId);
        this.setParamSimple(map, prefix + "ObtainType", this.ObtainType);
        this.setParamSimple(map, prefix + "ObtainDuration", this.ObtainDuration);
        this.setParamSimple(map, prefix + "ObtainUrl", this.ObtainUrl);

    }
}

