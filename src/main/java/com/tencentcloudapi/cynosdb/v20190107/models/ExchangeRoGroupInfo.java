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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExchangeRoGroupInfo extends AbstractModel {

    /**
    * 源RO组信息
    */
    @SerializedName("SrcRoGroupInfo")
    @Expose
    private RollbackRoGroupInfo SrcRoGroupInfo;

    /**
    * 目标RO组信息
    */
    @SerializedName("DstRoGroupInfo")
    @Expose
    private RollbackRoGroupInfo DstRoGroupInfo;

    /**
     * Get 源RO组信息 
     * @return SrcRoGroupInfo 源RO组信息
     */
    public RollbackRoGroupInfo getSrcRoGroupInfo() {
        return this.SrcRoGroupInfo;
    }

    /**
     * Set 源RO组信息
     * @param SrcRoGroupInfo 源RO组信息
     */
    public void setSrcRoGroupInfo(RollbackRoGroupInfo SrcRoGroupInfo) {
        this.SrcRoGroupInfo = SrcRoGroupInfo;
    }

    /**
     * Get 目标RO组信息 
     * @return DstRoGroupInfo 目标RO组信息
     */
    public RollbackRoGroupInfo getDstRoGroupInfo() {
        return this.DstRoGroupInfo;
    }

    /**
     * Set 目标RO组信息
     * @param DstRoGroupInfo 目标RO组信息
     */
    public void setDstRoGroupInfo(RollbackRoGroupInfo DstRoGroupInfo) {
        this.DstRoGroupInfo = DstRoGroupInfo;
    }

    public ExchangeRoGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExchangeRoGroupInfo(ExchangeRoGroupInfo source) {
        if (source.SrcRoGroupInfo != null) {
            this.SrcRoGroupInfo = new RollbackRoGroupInfo(source.SrcRoGroupInfo);
        }
        if (source.DstRoGroupInfo != null) {
            this.DstRoGroupInfo = new RollbackRoGroupInfo(source.DstRoGroupInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SrcRoGroupInfo.", this.SrcRoGroupInfo);
        this.setParamObj(map, prefix + "DstRoGroupInfo.", this.DstRoGroupInfo);

    }
}

