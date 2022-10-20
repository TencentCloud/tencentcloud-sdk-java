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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkClusterNamespaceLabelInfo extends AbstractModel{

    /**
    * 网络空间标签
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * 网络空间名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 网络空间标签 
     * @return Labels 网络空间标签
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set 网络空间标签
     * @param Labels 网络空间标签
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 网络空间名字 
     * @return Name 网络空间名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网络空间名字
     * @param Name 网络空间名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public NetworkClusterNamespaceLabelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkClusterNamespaceLabelInfo(NetworkClusterNamespaceLabelInfo source) {
        if (source.Labels != null) {
            this.Labels = new String(source.Labels);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Labels", this.Labels);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

