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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunFailoverCopyPairsRequest extends AbstractModel {

    /**
    * <p>复制对ID列表</p>
    */
    @SerializedName("CopyPairIds")
    @Expose
    private String [] CopyPairIds;

    /**
    * <p>复制对类型，枚举值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul>
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
    * <p>切换类型，支持WAIT和NOW</p>
    */
    @SerializedName("FailoverType")
    @Expose
    private String FailoverType;

    /**
    * <p>故障切换成功后是否自动关机生产端实例，默认为true</p>
    */
    @SerializedName("StopSourceInstance")
    @Expose
    private Boolean StopSourceInstance;

    /**
     * Get <p>复制对ID列表</p> 
     * @return CopyPairIds <p>复制对ID列表</p>
     */
    public String [] getCopyPairIds() {
        return this.CopyPairIds;
    }

    /**
     * Set <p>复制对ID列表</p>
     * @param CopyPairIds <p>复制对ID列表</p>
     */
    public void setCopyPairIds(String [] CopyPairIds) {
        this.CopyPairIds = CopyPairIds;
    }

    /**
     * Get <p>复制对类型，枚举值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul> 
     * @return CopyPairType <p>复制对类型，枚举值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul>
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set <p>复制对类型，枚举值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul>
     * @param CopyPairType <p>复制对类型，枚举值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul>
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    /**
     * Get <p>切换类型，支持WAIT和NOW</p> 
     * @return FailoverType <p>切换类型，支持WAIT和NOW</p>
     */
    public String getFailoverType() {
        return this.FailoverType;
    }

    /**
     * Set <p>切换类型，支持WAIT和NOW</p>
     * @param FailoverType <p>切换类型，支持WAIT和NOW</p>
     */
    public void setFailoverType(String FailoverType) {
        this.FailoverType = FailoverType;
    }

    /**
     * Get <p>故障切换成功后是否自动关机生产端实例，默认为true</p> 
     * @return StopSourceInstance <p>故障切换成功后是否自动关机生产端实例，默认为true</p>
     */
    public Boolean getStopSourceInstance() {
        return this.StopSourceInstance;
    }

    /**
     * Set <p>故障切换成功后是否自动关机生产端实例，默认为true</p>
     * @param StopSourceInstance <p>故障切换成功后是否自动关机生产端实例，默认为true</p>
     */
    public void setStopSourceInstance(Boolean StopSourceInstance) {
        this.StopSourceInstance = StopSourceInstance;
    }

    public RunFailoverCopyPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunFailoverCopyPairsRequest(RunFailoverCopyPairsRequest source) {
        if (source.CopyPairIds != null) {
            this.CopyPairIds = new String[source.CopyPairIds.length];
            for (int i = 0; i < source.CopyPairIds.length; i++) {
                this.CopyPairIds[i] = new String(source.CopyPairIds[i]);
            }
        }
        if (source.CopyPairType != null) {
            this.CopyPairType = new String(source.CopyPairType);
        }
        if (source.FailoverType != null) {
            this.FailoverType = new String(source.FailoverType);
        }
        if (source.StopSourceInstance != null) {
            this.StopSourceInstance = new Boolean(source.StopSourceInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CopyPairIds.", this.CopyPairIds);
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);
        this.setParamSimple(map, prefix + "FailoverType", this.FailoverType);
        this.setParamSimple(map, prefix + "StopSourceInstance", this.StopSourceInstance);

    }
}

