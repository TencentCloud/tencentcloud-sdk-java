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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiffIPWhitelist extends AbstractModel{

    /**
    * 最新IP白名单列表。
    */
    @SerializedName("LatestIPWhitelist")
    @Expose
    private IPWhitelist LatestIPWhitelist;

    /**
    * 最新IP白名单列表相比于当前IP白名单列表，新增部分。
    */
    @SerializedName("AddedIPWhitelist")
    @Expose
    private IPWhitelist AddedIPWhitelist;

    /**
    * 最新IP白名单列表相比于当前IP白名单列表，删减部分。
    */
    @SerializedName("RemovedIPWhitelist")
    @Expose
    private IPWhitelist RemovedIPWhitelist;

    /**
    * 最新IP白名单列表相比于当前IP白名单列表，不变部分。
    */
    @SerializedName("NoChangeIPWhitelist")
    @Expose
    private IPWhitelist NoChangeIPWhitelist;

    /**
     * Get 最新IP白名单列表。 
     * @return LatestIPWhitelist 最新IP白名单列表。
     */
    public IPWhitelist getLatestIPWhitelist() {
        return this.LatestIPWhitelist;
    }

    /**
     * Set 最新IP白名单列表。
     * @param LatestIPWhitelist 最新IP白名单列表。
     */
    public void setLatestIPWhitelist(IPWhitelist LatestIPWhitelist) {
        this.LatestIPWhitelist = LatestIPWhitelist;
    }

    /**
     * Get 最新IP白名单列表相比于当前IP白名单列表，新增部分。 
     * @return AddedIPWhitelist 最新IP白名单列表相比于当前IP白名单列表，新增部分。
     */
    public IPWhitelist getAddedIPWhitelist() {
        return this.AddedIPWhitelist;
    }

    /**
     * Set 最新IP白名单列表相比于当前IP白名单列表，新增部分。
     * @param AddedIPWhitelist 最新IP白名单列表相比于当前IP白名单列表，新增部分。
     */
    public void setAddedIPWhitelist(IPWhitelist AddedIPWhitelist) {
        this.AddedIPWhitelist = AddedIPWhitelist;
    }

    /**
     * Get 最新IP白名单列表相比于当前IP白名单列表，删减部分。 
     * @return RemovedIPWhitelist 最新IP白名单列表相比于当前IP白名单列表，删减部分。
     */
    public IPWhitelist getRemovedIPWhitelist() {
        return this.RemovedIPWhitelist;
    }

    /**
     * Set 最新IP白名单列表相比于当前IP白名单列表，删减部分。
     * @param RemovedIPWhitelist 最新IP白名单列表相比于当前IP白名单列表，删减部分。
     */
    public void setRemovedIPWhitelist(IPWhitelist RemovedIPWhitelist) {
        this.RemovedIPWhitelist = RemovedIPWhitelist;
    }

    /**
     * Get 最新IP白名单列表相比于当前IP白名单列表，不变部分。 
     * @return NoChangeIPWhitelist 最新IP白名单列表相比于当前IP白名单列表，不变部分。
     */
    public IPWhitelist getNoChangeIPWhitelist() {
        return this.NoChangeIPWhitelist;
    }

    /**
     * Set 最新IP白名单列表相比于当前IP白名单列表，不变部分。
     * @param NoChangeIPWhitelist 最新IP白名单列表相比于当前IP白名单列表，不变部分。
     */
    public void setNoChangeIPWhitelist(IPWhitelist NoChangeIPWhitelist) {
        this.NoChangeIPWhitelist = NoChangeIPWhitelist;
    }

    public DiffIPWhitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiffIPWhitelist(DiffIPWhitelist source) {
        if (source.LatestIPWhitelist != null) {
            this.LatestIPWhitelist = new IPWhitelist(source.LatestIPWhitelist);
        }
        if (source.AddedIPWhitelist != null) {
            this.AddedIPWhitelist = new IPWhitelist(source.AddedIPWhitelist);
        }
        if (source.RemovedIPWhitelist != null) {
            this.RemovedIPWhitelist = new IPWhitelist(source.RemovedIPWhitelist);
        }
        if (source.NoChangeIPWhitelist != null) {
            this.NoChangeIPWhitelist = new IPWhitelist(source.NoChangeIPWhitelist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LatestIPWhitelist.", this.LatestIPWhitelist);
        this.setParamObj(map, prefix + "AddedIPWhitelist.", this.AddedIPWhitelist);
        this.setParamObj(map, prefix + "RemovedIPWhitelist.", this.RemovedIPWhitelist);
        this.setParamObj(map, prefix + "NoChangeIPWhitelist.", this.NoChangeIPWhitelist);

    }
}

