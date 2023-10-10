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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineSnapshotRequest extends AbstractModel{

    /**
    * cvm id 集合
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * 查询快照类型0 最近一个 1所有
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 分页个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页步长
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get cvm id 集合 
     * @return Quuids cvm id 集合
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set cvm id 集合
     * @param Quuids cvm id 集合
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get 查询快照类型0 最近一个 1所有 
     * @return Type 查询快照类型0 最近一个 1所有
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 查询快照类型0 最近一个 1所有
     * @param Type 查询快照类型0 最近一个 1所有
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 分页个数 
     * @return Limit 分页个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数
     * @param Limit 分页个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页步长 
     * @return Offset 分页步长
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页步长
     * @param Offset 分页步长
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeMachineSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineSnapshotRequest(DescribeMachineSnapshotRequest source) {
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

