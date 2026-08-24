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
    * 复制对ID列表
    */
    @SerializedName("CopyPairIds")
    @Expose
    private String [] CopyPairIds;

    /**
    * 复制对类型，枚举值：DISK / INSTANCE / CFS。
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
    * 切换类型，支持WAIT和NOW
    */
    @SerializedName("FailoverType")
    @Expose
    private String FailoverType;

    /**
     * Get 复制对ID列表 
     * @return CopyPairIds 复制对ID列表
     */
    public String [] getCopyPairIds() {
        return this.CopyPairIds;
    }

    /**
     * Set 复制对ID列表
     * @param CopyPairIds 复制对ID列表
     */
    public void setCopyPairIds(String [] CopyPairIds) {
        this.CopyPairIds = CopyPairIds;
    }

    /**
     * Get 复制对类型，枚举值：DISK / INSTANCE / CFS。 
     * @return CopyPairType 复制对类型，枚举值：DISK / INSTANCE / CFS。
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set 复制对类型，枚举值：DISK / INSTANCE / CFS。
     * @param CopyPairType 复制对类型，枚举值：DISK / INSTANCE / CFS。
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    /**
     * Get 切换类型，支持WAIT和NOW 
     * @return FailoverType 切换类型，支持WAIT和NOW
     */
    public String getFailoverType() {
        return this.FailoverType;
    }

    /**
     * Set 切换类型，支持WAIT和NOW
     * @param FailoverType 切换类型，支持WAIT和NOW
     */
    public void setFailoverType(String FailoverType) {
        this.FailoverType = FailoverType;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CopyPairIds.", this.CopyPairIds);
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);
        this.setParamSimple(map, prefix + "FailoverType", this.FailoverType);

    }
}

