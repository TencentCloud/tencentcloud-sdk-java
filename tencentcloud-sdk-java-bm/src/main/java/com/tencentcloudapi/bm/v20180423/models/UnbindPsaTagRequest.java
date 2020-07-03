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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindPsaTagRequest extends AbstractModel{

    /**
    * 预授权规则ID
    */
    @SerializedName("PsaId")
    @Expose
    private String PsaId;

    /**
    * 需要解绑的标签key
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 需要解绑的标签value
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get 预授权规则ID 
     * @return PsaId 预授权规则ID
     */
    public String getPsaId() {
        return this.PsaId;
    }

    /**
     * Set 预授权规则ID
     * @param PsaId 预授权规则ID
     */
    public void setPsaId(String PsaId) {
        this.PsaId = PsaId;
    }

    /**
     * Get 需要解绑的标签key 
     * @return TagKey 需要解绑的标签key
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 需要解绑的标签key
     * @param TagKey 需要解绑的标签key
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 需要解绑的标签value 
     * @return TagValue 需要解绑的标签value
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 需要解绑的标签value
     * @param TagValue 需要解绑的标签value
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PsaId", this.PsaId);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

