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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecExtra extends AbstractModel {

    /**
    * 要删除的shards
    */
    @SerializedName("DelShards")
    @Expose
    private String DelShards;

    /**
    * 要删除的节点uip
    */
    @SerializedName("DelHosts")
    @Expose
    private String DelHosts;

    /**
     * Get 要删除的shards 
     * @return DelShards 要删除的shards
     * @deprecated
     */
    @Deprecated
    public String getDelShards() {
        return this.DelShards;
    }

    /**
     * Set 要删除的shards
     * @param DelShards 要删除的shards
     * @deprecated
     */
    @Deprecated
    public void setDelShards(String DelShards) {
        this.DelShards = DelShards;
    }

    /**
     * Get 要删除的节点uip 
     * @return DelHosts 要删除的节点uip
     */
    public String getDelHosts() {
        return this.DelHosts;
    }

    /**
     * Set 要删除的节点uip
     * @param DelHosts 要删除的节点uip
     */
    public void setDelHosts(String DelHosts) {
        this.DelHosts = DelHosts;
    }

    public SpecExtra() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecExtra(SpecExtra source) {
        if (source.DelShards != null) {
            this.DelShards = new String(source.DelShards);
        }
        if (source.DelHosts != null) {
            this.DelHosts = new String(source.DelHosts);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DelShards", this.DelShards);
        this.setParamSimple(map, prefix + "DelHosts", this.DelHosts);

    }
}

