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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNamespacesRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitID")
    @Expose
    private Long EdgeUnitID;

    /**
    * 边缘节点名称模糊搜索串
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

    /**
     * Get IECP边缘单元ID 
     * @return EdgeUnitID IECP边缘单元ID
     */
    public Long getEdgeUnitID() {
        return this.EdgeUnitID;
    }

    /**
     * Set IECP边缘单元ID
     * @param EdgeUnitID IECP边缘单元ID
     */
    public void setEdgeUnitID(Long EdgeUnitID) {
        this.EdgeUnitID = EdgeUnitID;
    }

    /**
     * Get 边缘节点名称模糊搜索串 
     * @return NamePattern 边缘节点名称模糊搜索串
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set 边缘节点名称模糊搜索串
     * @param NamePattern 边缘节点名称模糊搜索串
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
    }

    public DescribeNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNamespacesRequest(DescribeNamespacesRequest source) {
        if (source.EdgeUnitID != null) {
            this.EdgeUnitID = new Long(source.EdgeUnitID);
        }
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitID", this.EdgeUnitID);
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);

    }
}

