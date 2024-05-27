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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTWeCallPkgListRequest extends AbstractModel {

    /**
    * appId
    */
    @SerializedName("MiniProgramAppId")
    @Expose
    private String MiniProgramAppId;

    /**
    * 类型
    */
    @SerializedName("PkgType")
    @Expose
    private Long [] PkgType;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数据大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get appId 
     * @return MiniProgramAppId appId
     */
    public String getMiniProgramAppId() {
        return this.MiniProgramAppId;
    }

    /**
     * Set appId
     * @param MiniProgramAppId appId
     */
    public void setMiniProgramAppId(String MiniProgramAppId) {
        this.MiniProgramAppId = MiniProgramAppId;
    }

    /**
     * Get 类型 
     * @return PkgType 类型
     */
    public Long [] getPkgType() {
        return this.PkgType;
    }

    /**
     * Set 类型
     * @param PkgType 类型
     */
    public void setPkgType(Long [] PkgType) {
        this.PkgType = PkgType;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数据大小 
     * @return Limit 每页数据大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数据大小
     * @param Limit 每页数据大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public GetTWeCallPkgListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTWeCallPkgListRequest(GetTWeCallPkgListRequest source) {
        if (source.MiniProgramAppId != null) {
            this.MiniProgramAppId = new String(source.MiniProgramAppId);
        }
        if (source.PkgType != null) {
            this.PkgType = new Long[source.PkgType.length];
            for (int i = 0; i < source.PkgType.length; i++) {
                this.PkgType[i] = new Long(source.PkgType[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniProgramAppId", this.MiniProgramAppId);
        this.setParamArraySimple(map, prefix + "PkgType.", this.PkgType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

