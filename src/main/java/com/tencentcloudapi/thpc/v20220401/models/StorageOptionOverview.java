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
package com.tencentcloudapi.thpc.v20220401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageOptionOverview extends AbstractModel{

    /**
    * CFS存储选项概览信息列表。
    */
    @SerializedName("CFSOptions")
    @Expose
    private CFSOptionOverview [] CFSOptions;

    /**
    * GooseFS存储选项概览信息列表。
    */
    @SerializedName("GooseFSOptions")
    @Expose
    private GooseFSOptionOverview [] GooseFSOptions;

    /**
     * Get CFS存储选项概览信息列表。 
     * @return CFSOptions CFS存储选项概览信息列表。
     */
    public CFSOptionOverview [] getCFSOptions() {
        return this.CFSOptions;
    }

    /**
     * Set CFS存储选项概览信息列表。
     * @param CFSOptions CFS存储选项概览信息列表。
     */
    public void setCFSOptions(CFSOptionOverview [] CFSOptions) {
        this.CFSOptions = CFSOptions;
    }

    /**
     * Get GooseFS存储选项概览信息列表。 
     * @return GooseFSOptions GooseFS存储选项概览信息列表。
     */
    public GooseFSOptionOverview [] getGooseFSOptions() {
        return this.GooseFSOptions;
    }

    /**
     * Set GooseFS存储选项概览信息列表。
     * @param GooseFSOptions GooseFS存储选项概览信息列表。
     */
    public void setGooseFSOptions(GooseFSOptionOverview [] GooseFSOptions) {
        this.GooseFSOptions = GooseFSOptions;
    }

    public StorageOptionOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageOptionOverview(StorageOptionOverview source) {
        if (source.CFSOptions != null) {
            this.CFSOptions = new CFSOptionOverview[source.CFSOptions.length];
            for (int i = 0; i < source.CFSOptions.length; i++) {
                this.CFSOptions[i] = new CFSOptionOverview(source.CFSOptions[i]);
            }
        }
        if (source.GooseFSOptions != null) {
            this.GooseFSOptions = new GooseFSOptionOverview[source.GooseFSOptions.length];
            for (int i = 0; i < source.GooseFSOptions.length; i++) {
                this.GooseFSOptions[i] = new GooseFSOptionOverview(source.GooseFSOptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CFSOptions.", this.CFSOptions);
        this.setParamArrayObj(map, prefix + "GooseFSOptions.", this.GooseFSOptions);

    }
}

