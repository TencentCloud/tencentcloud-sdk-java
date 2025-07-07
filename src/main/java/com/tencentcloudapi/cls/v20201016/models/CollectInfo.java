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

public class CollectInfo extends AbstractModel {

    /**
    * 采集类型，必填字段。
<li>0：元数据配置。</li>
<li>1：指定Pod Label。</li>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 指定采集类型的采集配置信息。
<li>当Type为0时，CollectConfigs不允许为空。</li>
<li>当Type为1时，CollectConfigs为空时，表示选择所有Pod Label；否则CollectConfigs为指定Pod Label。</li>
    */
    @SerializedName("CollectConfigs")
    @Expose
    private CollectConfig [] CollectConfigs;

    /**
     * Get 采集类型，必填字段。
<li>0：元数据配置。</li>
<li>1：指定Pod Label。</li> 
     * @return Type 采集类型，必填字段。
<li>0：元数据配置。</li>
<li>1：指定Pod Label。</li>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 采集类型，必填字段。
<li>0：元数据配置。</li>
<li>1：指定Pod Label。</li>
     * @param Type 采集类型，必填字段。
<li>0：元数据配置。</li>
<li>1：指定Pod Label。</li>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 指定采集类型的采集配置信息。
<li>当Type为0时，CollectConfigs不允许为空。</li>
<li>当Type为1时，CollectConfigs为空时，表示选择所有Pod Label；否则CollectConfigs为指定Pod Label。</li> 
     * @return CollectConfigs 指定采集类型的采集配置信息。
<li>当Type为0时，CollectConfigs不允许为空。</li>
<li>当Type为1时，CollectConfigs为空时，表示选择所有Pod Label；否则CollectConfigs为指定Pod Label。</li>
     */
    public CollectConfig [] getCollectConfigs() {
        return this.CollectConfigs;
    }

    /**
     * Set 指定采集类型的采集配置信息。
<li>当Type为0时，CollectConfigs不允许为空。</li>
<li>当Type为1时，CollectConfigs为空时，表示选择所有Pod Label；否则CollectConfigs为指定Pod Label。</li>
     * @param CollectConfigs 指定采集类型的采集配置信息。
<li>当Type为0时，CollectConfigs不允许为空。</li>
<li>当Type为1时，CollectConfigs为空时，表示选择所有Pod Label；否则CollectConfigs为指定Pod Label。</li>
     */
    public void setCollectConfigs(CollectConfig [] CollectConfigs) {
        this.CollectConfigs = CollectConfigs;
    }

    public CollectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CollectInfo(CollectInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CollectConfigs != null) {
            this.CollectConfigs = new CollectConfig[source.CollectConfigs.length];
            for (int i = 0; i < source.CollectConfigs.length; i++) {
                this.CollectConfigs[i] = new CollectConfig(source.CollectConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "CollectConfigs.", this.CollectConfigs);

    }
}

