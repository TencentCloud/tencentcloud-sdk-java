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
package com.tencentcloudapi.thpc.v20211109.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageOption extends AbstractModel{

    /**
    * 集群挂载CFS文件系统选项
    */
    @SerializedName("CFSOptions")
    @Expose
    private CFSOption [] CFSOptions;

    /**
    * 集群挂在GooseFS文件系统选项
    */
    @SerializedName("GooseFSOptions")
    @Expose
    private GooseFSOption [] GooseFSOptions;

    /**
     * Get 集群挂载CFS文件系统选项 
     * @return CFSOptions 集群挂载CFS文件系统选项
     */
    public CFSOption [] getCFSOptions() {
        return this.CFSOptions;
    }

    /**
     * Set 集群挂载CFS文件系统选项
     * @param CFSOptions 集群挂载CFS文件系统选项
     */
    public void setCFSOptions(CFSOption [] CFSOptions) {
        this.CFSOptions = CFSOptions;
    }

    /**
     * Get 集群挂在GooseFS文件系统选项 
     * @return GooseFSOptions 集群挂在GooseFS文件系统选项
     */
    public GooseFSOption [] getGooseFSOptions() {
        return this.GooseFSOptions;
    }

    /**
     * Set 集群挂在GooseFS文件系统选项
     * @param GooseFSOptions 集群挂在GooseFS文件系统选项
     */
    public void setGooseFSOptions(GooseFSOption [] GooseFSOptions) {
        this.GooseFSOptions = GooseFSOptions;
    }

    public StorageOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageOption(StorageOption source) {
        if (source.CFSOptions != null) {
            this.CFSOptions = new CFSOption[source.CFSOptions.length];
            for (int i = 0; i < source.CFSOptions.length; i++) {
                this.CFSOptions[i] = new CFSOption(source.CFSOptions[i]);
            }
        }
        if (source.GooseFSOptions != null) {
            this.GooseFSOptions = new GooseFSOption[source.GooseFSOptions.length];
            for (int i = 0; i < source.GooseFSOptions.length; i++) {
                this.GooseFSOptions[i] = new GooseFSOption(source.GooseFSOptions[i]);
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

