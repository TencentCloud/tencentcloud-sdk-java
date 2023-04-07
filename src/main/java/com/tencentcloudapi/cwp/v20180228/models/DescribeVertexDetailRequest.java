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

public class DescribeVertexDetailRequest extends AbstractModel{

    /**
    * 点id列表
    */
    @SerializedName("VertexIds")
    @Expose
    private String [] VertexIds;

    /**
    * 事件id
    */
    @SerializedName("IncidentId")
    @Expose
    private String IncidentId;

    /**
    * 事件所在表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get 点id列表 
     * @return VertexIds 点id列表
     */
    public String [] getVertexIds() {
        return this.VertexIds;
    }

    /**
     * Set 点id列表
     * @param VertexIds 点id列表
     */
    public void setVertexIds(String [] VertexIds) {
        this.VertexIds = VertexIds;
    }

    /**
     * Get 事件id 
     * @return IncidentId 事件id
     */
    public String getIncidentId() {
        return this.IncidentId;
    }

    /**
     * Set 事件id
     * @param IncidentId 事件id
     */
    public void setIncidentId(String IncidentId) {
        this.IncidentId = IncidentId;
    }

    /**
     * Get 事件所在表名 
     * @return TableName 事件所在表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 事件所在表名
     * @param TableName 事件所在表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeVertexDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVertexDetailRequest(DescribeVertexDetailRequest source) {
        if (source.VertexIds != null) {
            this.VertexIds = new String[source.VertexIds.length];
            for (int i = 0; i < source.VertexIds.length; i++) {
                this.VertexIds[i] = new String(source.VertexIds[i]);
            }
        }
        if (source.IncidentId != null) {
            this.IncidentId = new String(source.IncidentId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VertexIds.", this.VertexIds);
        this.setParamSimple(map, prefix + "IncidentId", this.IncidentId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

