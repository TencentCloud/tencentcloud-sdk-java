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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LymphTotal extends AbstractModel {

    /**
    * 项目名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 转移数量
    */
    @SerializedName("TransferNum")
    @Expose
    private Long TransferNum;

    /**
    * 总数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 索引
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
    * 原文对应坐标
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
     * Get 项目名称 
     * @return Name 项目名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
     * @param Name 项目名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 转移数量 
     * @return TransferNum 转移数量
     */
    public Long getTransferNum() {
        return this.TransferNum;
    }

    /**
     * Set 转移数量
     * @param TransferNum 转移数量
     */
    public void setTransferNum(Long TransferNum) {
        this.TransferNum = TransferNum;
    }

    /**
     * Get 总数量 
     * @return Total 总数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数量
     * @param Total 总数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 原文 
     * @return Src 原文
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
     * @param Src 原文
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 索引 
     * @return Index 索引
     */
    public Long [] getIndex() {
        return this.Index;
    }

    /**
     * Set 索引
     * @param Index 索引
     */
    public void setIndex(Long [] Index) {
        this.Index = Index;
    }

    /**
     * Get 原文对应坐标 
     * @return Coords 原文对应坐标
     */
    public Coord [] getCoords() {
        return this.Coords;
    }

    /**
     * Set 原文对应坐标
     * @param Coords 原文对应坐标
     */
    public void setCoords(Coord [] Coords) {
        this.Coords = Coords;
    }

    public LymphTotal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LymphTotal(LymphTotal source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TransferNum != null) {
            this.TransferNum = new Long(source.TransferNum);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.Coords != null) {
            this.Coords = new Coord[source.Coords.length];
            for (int i = 0; i < source.Coords.length; i++) {
                this.Coords[i] = new Coord(source.Coords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TransferNum", this.TransferNum);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamArraySimple(map, prefix + "Index.", this.Index);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

