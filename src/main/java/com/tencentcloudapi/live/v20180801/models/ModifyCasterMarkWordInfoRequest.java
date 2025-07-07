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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCasterMarkWordInfoRequest extends AbstractModel {

    /**
    * 导播台ID。
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * 修改的文本配置。
    */
    @SerializedName("MarkWordInfo")
    @Expose
    private CasterMarkWordInfo MarkWordInfo;

    /**
     * Get 导播台ID。 
     * @return CasterId 导播台ID。
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set 导播台ID。
     * @param CasterId 导播台ID。
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get 修改的文本配置。 
     * @return MarkWordInfo 修改的文本配置。
     */
    public CasterMarkWordInfo getMarkWordInfo() {
        return this.MarkWordInfo;
    }

    /**
     * Set 修改的文本配置。
     * @param MarkWordInfo 修改的文本配置。
     */
    public void setMarkWordInfo(CasterMarkWordInfo MarkWordInfo) {
        this.MarkWordInfo = MarkWordInfo;
    }

    public ModifyCasterMarkWordInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCasterMarkWordInfoRequest(ModifyCasterMarkWordInfoRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.MarkWordInfo != null) {
            this.MarkWordInfo = new CasterMarkWordInfo(source.MarkWordInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamObj(map, prefix + "MarkWordInfo.", this.MarkWordInfo);

    }
}

