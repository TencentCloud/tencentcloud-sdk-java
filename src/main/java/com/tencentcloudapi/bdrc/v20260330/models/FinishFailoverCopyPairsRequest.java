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

public class FinishFailoverCopyPairsRequest extends AbstractModel {

    /**
    * <p>复制对ID列表。长度范围 [1, 50]。当 CopyPairType=INSTANCE 时传 CVM 复制对ID，否则传云盘/CFS 复制对ID。</p>
    */
    @SerializedName("CopyPairIds")
    @Expose
    private String [] CopyPairIds;

    /**
    * <p>要完成切换的复制对类型。枚举值：DISK / INSTANCE / CFS。</p>
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
     * Get <p>复制对ID列表。长度范围 [1, 50]。当 CopyPairType=INSTANCE 时传 CVM 复制对ID，否则传云盘/CFS 复制对ID。</p> 
     * @return CopyPairIds <p>复制对ID列表。长度范围 [1, 50]。当 CopyPairType=INSTANCE 时传 CVM 复制对ID，否则传云盘/CFS 复制对ID。</p>
     */
    public String [] getCopyPairIds() {
        return this.CopyPairIds;
    }

    /**
     * Set <p>复制对ID列表。长度范围 [1, 50]。当 CopyPairType=INSTANCE 时传 CVM 复制对ID，否则传云盘/CFS 复制对ID。</p>
     * @param CopyPairIds <p>复制对ID列表。长度范围 [1, 50]。当 CopyPairType=INSTANCE 时传 CVM 复制对ID，否则传云盘/CFS 复制对ID。</p>
     */
    public void setCopyPairIds(String [] CopyPairIds) {
        this.CopyPairIds = CopyPairIds;
    }

    /**
     * Get <p>要完成切换的复制对类型。枚举值：DISK / INSTANCE / CFS。</p> 
     * @return CopyPairType <p>要完成切换的复制对类型。枚举值：DISK / INSTANCE / CFS。</p>
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set <p>要完成切换的复制对类型。枚举值：DISK / INSTANCE / CFS。</p>
     * @param CopyPairType <p>要完成切换的复制对类型。枚举值：DISK / INSTANCE / CFS。</p>
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    public FinishFailoverCopyPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FinishFailoverCopyPairsRequest(FinishFailoverCopyPairsRequest source) {
        if (source.CopyPairIds != null) {
            this.CopyPairIds = new String[source.CopyPairIds.length];
            for (int i = 0; i < source.CopyPairIds.length; i++) {
                this.CopyPairIds[i] = new String(source.CopyPairIds[i]);
            }
        }
        if (source.CopyPairType != null) {
            this.CopyPairType = new String(source.CopyPairType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CopyPairIds.", this.CopyPairIds);
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);

    }
}

