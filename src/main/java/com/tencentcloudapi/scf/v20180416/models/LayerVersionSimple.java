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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayerVersionSimple extends AbstractModel{

    /**
    * 绑定的层名称。解绑层需传递空字符串。
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * 绑定或解绑层的版本号。解绑函数版本关联的最后一个层版本时，LayerVersion 填 0。
    */
    @SerializedName("LayerVersion")
    @Expose
    private Long LayerVersion;

    /**
     * Get 绑定的层名称。解绑层需传递空字符串。 
     * @return LayerName 绑定的层名称。解绑层需传递空字符串。
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set 绑定的层名称。解绑层需传递空字符串。
     * @param LayerName 绑定的层名称。解绑层需传递空字符串。
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get 绑定或解绑层的版本号。解绑函数版本关联的最后一个层版本时，LayerVersion 填 0。 
     * @return LayerVersion 绑定或解绑层的版本号。解绑函数版本关联的最后一个层版本时，LayerVersion 填 0。
     */
    public Long getLayerVersion() {
        return this.LayerVersion;
    }

    /**
     * Set 绑定或解绑层的版本号。解绑函数版本关联的最后一个层版本时，LayerVersion 填 0。
     * @param LayerVersion 绑定或解绑层的版本号。解绑函数版本关联的最后一个层版本时，LayerVersion 填 0。
     */
    public void setLayerVersion(Long LayerVersion) {
        this.LayerVersion = LayerVersion;
    }

    public LayerVersionSimple() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LayerVersionSimple(LayerVersionSimple source) {
        if (source.LayerName != null) {
            this.LayerName = new String(source.LayerName);
        }
        if (source.LayerVersion != null) {
            this.LayerVersion = new Long(source.LayerVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamSimple(map, prefix + "LayerVersion", this.LayerVersion);

    }
}

