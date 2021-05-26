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
package com.tencentcloudapi.eis.v20200715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEisConnectorsRequest extends AbstractModel{

    /**
    * 连接器名称,非必输，如输入则按照输入值模糊匹配
    */
    @SerializedName("ConnectorName")
    @Expose
    private String ConnectorName;

    /**
    * 分页参数,数据偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数,每页显示的条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 连接器名称,非必输，如输入则按照输入值模糊匹配 
     * @return ConnectorName 连接器名称,非必输，如输入则按照输入值模糊匹配
     */
    public String getConnectorName() {
        return this.ConnectorName;
    }

    /**
     * Set 连接器名称,非必输，如输入则按照输入值模糊匹配
     * @param ConnectorName 连接器名称,非必输，如输入则按照输入值模糊匹配
     */
    public void setConnectorName(String ConnectorName) {
        this.ConnectorName = ConnectorName;
    }

    /**
     * Get 分页参数,数据偏移量 
     * @return Offset 分页参数,数据偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数,数据偏移量
     * @param Offset 分页参数,数据偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数,每页显示的条数 
     * @return Limit 分页参数,每页显示的条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数,每页显示的条数
     * @param Limit 分页参数,每页显示的条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListEisConnectorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEisConnectorsRequest(ListEisConnectorsRequest source) {
        if (source.ConnectorName != null) {
            this.ConnectorName = new String(source.ConnectorName);
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
        this.setParamSimple(map, prefix + "ConnectorName", this.ConnectorName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

