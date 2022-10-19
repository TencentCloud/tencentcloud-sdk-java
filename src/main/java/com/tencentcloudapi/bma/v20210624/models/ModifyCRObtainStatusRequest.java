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
    * 侵权ID
    */
    @SerializedName("TortId")
    @Expose
    private Long TortId;

    /**
    * 取证类型：1-网页取证 2-过程取证(暂不提供)
    */
    @SerializedName("ObtainType")
    @Expose
    private Long ObtainType;

    /**
    * 过程取证的取证时长，单位分钟，范围0-120
    */
    @SerializedName("ObtainDuration")
    @Expose
    private Long ObtainDuration;

    /**
    * 取证结果回调地址
    */
    @SerializedName("ObtainUrl")
    @Expose
    private String ObtainUrl;

    /**
     * Get 侵权ID 
     * @return TortId 侵权ID
     */
    public Long getTortId() {
        return this.TortId;
    }

    /**
     * Set 侵权ID
     * @param TortId 侵权ID
     */
    public void setTortId(Long TortId) {
        this.TortId = TortId;
    }

    /**
     * Get 取证类型：1-网页取证 2-过程取证(暂不提供) 
     * @return ObtainType 取证类型：1-网页取证 2-过程取证(暂不提供)
     */
    public Long getObtainType() {
        return this.ObtainType;
    }

    /**
     * Set 取证类型：1-网页取证 2-过程取证(暂不提供)
     * @param ObtainType 取证类型：1-网页取证 2-过程取证(暂不提供)
     */
    public void setObtainType(Long ObtainType) {
        this.ObtainType = ObtainType;
    }

    /**
     * Get 过程取证的取证时长，单位分钟，范围0-120 
     * @return ObtainDuration 过程取证的取证时长，单位分钟，范围0-120
     */
    public Long getObtainDuration() {
        return this.ObtainDuration;
    }

    /**
     * Set 过程取证的取证时长，单位分钟，范围0-120
     * @param ObtainDuration 过程取证的取证时长，单位分钟，范围0-120
     */
    public void setObtainDuration(Long ObtainDuration) {
        this.ObtainDuration = ObtainDuration;
    }

    /**
     * Get 取证结果回调地址 
     * @return ObtainUrl 取证结果回调地址
     */
    public String getObtainUrl() {
        return this.ObtainUrl;
    }

    /**
     * Set 取证结果回调地址
     * @param ObtainUrl 取证结果回调地址
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

