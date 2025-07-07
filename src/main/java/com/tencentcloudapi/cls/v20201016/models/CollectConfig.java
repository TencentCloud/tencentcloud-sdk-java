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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CollectConfig extends AbstractModel {

    /**
    * 指定采集类型的采集配置名称信息。
<li>当CollectInfo中Type为0：表示元数据配置，name为元数据名称。
目前支持"container_id"，"container_name"，"image_name"，"namespace"，"pod_uid"，"pod_name"，"pod_ip"。
</li>
<li>当CollectInfo中Type为1：指定pod label，name为指定pod label名称。</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 指定采集类型的采集配置名称信息。
<li>当CollectInfo中Type为0：表示元数据配置，name为元数据名称。
目前支持"container_id"，"container_name"，"image_name"，"namespace"，"pod_uid"，"pod_name"，"pod_ip"。
</li>
<li>当CollectInfo中Type为1：指定pod label，name为指定pod label名称。</li> 
     * @return Name 指定采集类型的采集配置名称信息。
<li>当CollectInfo中Type为0：表示元数据配置，name为元数据名称。
目前支持"container_id"，"container_name"，"image_name"，"namespace"，"pod_uid"，"pod_name"，"pod_ip"。
</li>
<li>当CollectInfo中Type为1：指定pod label，name为指定pod label名称。</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指定采集类型的采集配置名称信息。
<li>当CollectInfo中Type为0：表示元数据配置，name为元数据名称。
目前支持"container_id"，"container_name"，"image_name"，"namespace"，"pod_uid"，"pod_name"，"pod_ip"。
</li>
<li>当CollectInfo中Type为1：指定pod label，name为指定pod label名称。</li>
     * @param Name 指定采集类型的采集配置名称信息。
<li>当CollectInfo中Type为0：表示元数据配置，name为元数据名称。
目前支持"container_id"，"container_name"，"image_name"，"namespace"，"pod_uid"，"pod_name"，"pod_ip"。
</li>
<li>当CollectInfo中Type为1：指定pod label，name为指定pod label名称。</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CollectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CollectConfig(CollectConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

