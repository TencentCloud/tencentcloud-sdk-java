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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodLabel extends AbstractModel {

    /**
    * 标签键，支持大小写字母、数字、以及-_./，最多支持63个字符
    */
    @SerializedName("LabelKey")
    @Expose
    private String LabelKey;

    /**
    * 标签值，支持大小写字母、数字、以及-_./，最多支持63个字符
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
     * Get 标签键，支持大小写字母、数字、以及-_./，最多支持63个字符 
     * @return LabelKey 标签键，支持大小写字母、数字、以及-_./，最多支持63个字符
     */
    public String getLabelKey() {
        return this.LabelKey;
    }

    /**
     * Set 标签键，支持大小写字母、数字、以及-_./，最多支持63个字符
     * @param LabelKey 标签键，支持大小写字母、数字、以及-_./，最多支持63个字符
     */
    public void setLabelKey(String LabelKey) {
        this.LabelKey = LabelKey;
    }

    /**
     * Get 标签值，支持大小写字母、数字、以及-_./，最多支持63个字符 
     * @return LabelValue 标签值，支持大小写字母、数字、以及-_./，最多支持63个字符
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 标签值，支持大小写字母、数字、以及-_./，最多支持63个字符
     * @param LabelValue 标签值，支持大小写字母、数字、以及-_./，最多支持63个字符
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    public PodLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodLabel(PodLabel source) {
        if (source.LabelKey != null) {
            this.LabelKey = new String(source.LabelKey);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelKey", this.LabelKey);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);

    }
}

