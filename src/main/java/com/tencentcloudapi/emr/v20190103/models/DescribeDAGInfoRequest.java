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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDAGInfoRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * DAG类型，目前只支持STARROCKS
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 查询ID列表,最大长度为1
    */
    @SerializedName("IDList")
    @Expose
    private String [] IDList;

    /**
     * Get 集群ID 
     * @return InstanceID 集群ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 集群ID
     * @param InstanceID 集群ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get DAG类型，目前只支持STARROCKS 
     * @return Type DAG类型，目前只支持STARROCKS
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set DAG类型，目前只支持STARROCKS
     * @param Type DAG类型，目前只支持STARROCKS
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 查询ID列表,最大长度为1 
     * @return IDList 查询ID列表,最大长度为1
     */
    public String [] getIDList() {
        return this.IDList;
    }

    /**
     * Set 查询ID列表,最大长度为1
     * @param IDList 查询ID列表,最大长度为1
     */
    public void setIDList(String [] IDList) {
        this.IDList = IDList;
    }

    public DescribeDAGInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDAGInfoRequest(DescribeDAGInfoRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IDList != null) {
            this.IDList = new String[source.IDList.length];
            for (int i = 0; i < source.IDList.length; i++) {
                this.IDList[i] = new String(source.IDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "IDList.", this.IDList);

    }
}

