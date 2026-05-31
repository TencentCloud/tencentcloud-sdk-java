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

public class StorageOptionOverview extends AbstractModel {

    /**
    * <p>CFS存储选项概览信息列表。</p>
    */
    @SerializedName("CFSOptions")
    @Expose
    private CFSOptionOverview [] CFSOptions;

    /**
    * <p>GooseFS存储选项概览信息列表。</p>
    */
    @SerializedName("GooseFSOptions")
    @Expose
    private GooseFSOptionOverview [] GooseFSOptions;

    /**
    * <p>GooseFSx存储选项概览信息列表。</p>
    */
    @SerializedName("GooseFSxOptions")
    @Expose
    private GooseFSxOptionOverview [] GooseFSxOptions;

    /**
    * <p>COS存储选项概览信息列表。</p>
    */
    @SerializedName("CosOptions")
    @Expose
    private CosOptionOverview [] CosOptions;

    /**
     * Get <p>CFS存储选项概览信息列表。</p> 
     * @return CFSOptions <p>CFS存储选项概览信息列表。</p>
     */
    public CFSOptionOverview [] getCFSOptions() {
        return this.CFSOptions;
    }

    /**
     * Set <p>CFS存储选项概览信息列表。</p>
     * @param CFSOptions <p>CFS存储选项概览信息列表。</p>
     */
    public void setCFSOptions(CFSOptionOverview [] CFSOptions) {
        this.CFSOptions = CFSOptions;
    }

    /**
     * Get <p>GooseFS存储选项概览信息列表。</p> 
     * @return GooseFSOptions <p>GooseFS存储选项概览信息列表。</p>
     */
    public GooseFSOptionOverview [] getGooseFSOptions() {
        return this.GooseFSOptions;
    }

    /**
     * Set <p>GooseFS存储选项概览信息列表。</p>
     * @param GooseFSOptions <p>GooseFS存储选项概览信息列表。</p>
     */
    public void setGooseFSOptions(GooseFSOptionOverview [] GooseFSOptions) {
        this.GooseFSOptions = GooseFSOptions;
    }

    /**
     * Get <p>GooseFSx存储选项概览信息列表。</p> 
     * @return GooseFSxOptions <p>GooseFSx存储选项概览信息列表。</p>
     */
    public GooseFSxOptionOverview [] getGooseFSxOptions() {
        return this.GooseFSxOptions;
    }

    /**
     * Set <p>GooseFSx存储选项概览信息列表。</p>
     * @param GooseFSxOptions <p>GooseFSx存储选项概览信息列表。</p>
     */
    public void setGooseFSxOptions(GooseFSxOptionOverview [] GooseFSxOptions) {
        this.GooseFSxOptions = GooseFSxOptions;
    }

    /**
     * Get <p>COS存储选项概览信息列表。</p> 
     * @return CosOptions <p>COS存储选项概览信息列表。</p>
     */
    public CosOptionOverview [] getCosOptions() {
        return this.CosOptions;
    }

    /**
     * Set <p>COS存储选项概览信息列表。</p>
     * @param CosOptions <p>COS存储选项概览信息列表。</p>
     */
    public void setCosOptions(CosOptionOverview [] CosOptions) {
        this.CosOptions = CosOptions;
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
        if (source.GooseFSxOptions != null) {
            this.GooseFSxOptions = new GooseFSxOptionOverview[source.GooseFSxOptions.length];
            for (int i = 0; i < source.GooseFSxOptions.length; i++) {
                this.GooseFSxOptions[i] = new GooseFSxOptionOverview(source.GooseFSxOptions[i]);
            }
        }
        if (source.CosOptions != null) {
            this.CosOptions = new CosOptionOverview[source.CosOptions.length];
            for (int i = 0; i < source.CosOptions.length; i++) {
                this.CosOptions[i] = new CosOptionOverview(source.CosOptions[i]);
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

