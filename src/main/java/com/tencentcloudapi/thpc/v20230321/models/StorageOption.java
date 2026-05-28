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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageOption extends AbstractModel {

    /**
    * <p>集群挂载CFS文件系统选项。</p>
    */
    @SerializedName("CFSOptions")
    @Expose
    private CFSOption [] CFSOptions;

    /**
    * <p>集群挂载GooseFS文件系统选项。</p>
    */
    @SerializedName("GooseFSOptions")
    @Expose
    private GooseFSOption [] GooseFSOptions;

    /**
    * <p>集群挂载GooseFSx文件系统选项。</p>
    */
    @SerializedName("GooseFSxOptions")
    @Expose
    private GooseFSxOption [] GooseFSxOptions;

    /**
    * <p>集群挂载COS文件系统选项。</p>
    */
    @SerializedName("CosOptions")
    @Expose
    private CosOption [] CosOptions;

    /**
     * Get <p>集群挂载CFS文件系统选项。</p> 
     * @return CFSOptions <p>集群挂载CFS文件系统选项。</p>
     */
    public CFSOption [] getCFSOptions() {
        return this.CFSOptions;
    }

    /**
     * Set <p>集群挂载CFS文件系统选项。</p>
     * @param CFSOptions <p>集群挂载CFS文件系统选项。</p>
     */
    public void setCFSOptions(CFSOption [] CFSOptions) {
        this.CFSOptions = CFSOptions;
    }

    /**
     * Get <p>集群挂载GooseFS文件系统选项。</p> 
     * @return GooseFSOptions <p>集群挂载GooseFS文件系统选项。</p>
     */
    public GooseFSOption [] getGooseFSOptions() {
        return this.GooseFSOptions;
    }

    /**
     * Set <p>集群挂载GooseFS文件系统选项。</p>
     * @param GooseFSOptions <p>集群挂载GooseFS文件系统选项。</p>
     */
    public void setGooseFSOptions(GooseFSOption [] GooseFSOptions) {
        this.GooseFSOptions = GooseFSOptions;
    }

    /**
     * Get <p>集群挂载GooseFSx文件系统选项。</p> 
     * @return GooseFSxOptions <p>集群挂载GooseFSx文件系统选项。</p>
     */
    public GooseFSxOption [] getGooseFSxOptions() {
        return this.GooseFSxOptions;
    }

    /**
     * Set <p>集群挂载GooseFSx文件系统选项。</p>
     * @param GooseFSxOptions <p>集群挂载GooseFSx文件系统选项。</p>
     */
    public void setGooseFSxOptions(GooseFSxOption [] GooseFSxOptions) {
        this.GooseFSxOptions = GooseFSxOptions;
    }

    /**
     * Get <p>集群挂载COS文件系统选项。</p> 
     * @return CosOptions <p>集群挂载COS文件系统选项。</p>
     */
    public CosOption [] getCosOptions() {
        return this.CosOptions;
    }

    /**
     * Set <p>集群挂载COS文件系统选项。</p>
     * @param CosOptions <p>集群挂载COS文件系统选项。</p>
     */
    public void setCosOptions(CosOption [] CosOptions) {
        this.CosOptions = CosOptions;
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
        if (source.GooseFSxOptions != null) {
            this.GooseFSxOptions = new GooseFSxOption[source.GooseFSxOptions.length];
            for (int i = 0; i < source.GooseFSxOptions.length; i++) {
                this.GooseFSxOptions[i] = new GooseFSxOption(source.GooseFSxOptions[i]);
            }
        }
        if (source.CosOptions != null) {
            this.CosOptions = new CosOption[source.CosOptions.length];
            for (int i = 0; i < source.CosOptions.length; i++) {
                this.CosOptions[i] = new CosOption(source.CosOptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CFSOptions.", this.CFSOptions);
        this.setParamArrayObj(map, prefix + "GooseFSOptions.", this.GooseFSOptions);
        this.setParamArrayObj(map, prefix + "GooseFSxOptions.", this.GooseFSxOptions);
        this.setParamArrayObj(map, prefix + "CosOptions.", this.CosOptions);

    }
}

