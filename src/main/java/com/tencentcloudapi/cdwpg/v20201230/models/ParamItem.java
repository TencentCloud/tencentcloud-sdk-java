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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamItem extends AbstractModel {

    /**
    * 节点类型, cn/dn
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点名
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 参数个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 参数信息
    */
    @SerializedName("Details")
    @Expose
    private ParamDetail [] Details;

    /**
     * Get 节点类型, cn/dn 
     * @return NodeType 节点类型, cn/dn
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型, cn/dn
     * @param NodeType 节点类型, cn/dn
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点名 
     * @return NodeName 节点名
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名
     * @param NodeName 节点名
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 参数个数 
     * @return TotalCount 参数个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 参数个数
     * @param TotalCount 参数个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 参数信息 
     * @return Details 参数信息
     */
    public ParamDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 参数信息
     * @param Details 参数信息
     */
    public void setDetails(ParamDetail [] Details) {
        this.Details = Details;
    }

    public ParamItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamItem(ParamItem source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Details != null) {
            this.Details = new ParamDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new ParamDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

