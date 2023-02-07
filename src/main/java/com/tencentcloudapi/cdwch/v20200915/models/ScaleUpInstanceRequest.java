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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleUpInstanceRequest extends AbstractModel{

    /**
    * 实例唯一ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * clickhouse节点规格。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 是否滚动重启，false为不滚动重启，true为滚动重启
    */
    @SerializedName("ScaleUpEnableRolling")
    @Expose
    private Boolean ScaleUpEnableRolling;

    /**
     * Get 实例唯一ID 
     * @return InstanceId 实例唯一ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例唯一ID
     * @param InstanceId 实例唯一ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点 
     * @return Type 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点
     * @param Type 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get clickhouse节点规格。 
     * @return SpecName clickhouse节点规格。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set clickhouse节点规格。
     * @param SpecName clickhouse节点规格。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 是否滚动重启，false为不滚动重启，true为滚动重启 
     * @return ScaleUpEnableRolling 是否滚动重启，false为不滚动重启，true为滚动重启
     */
    public Boolean getScaleUpEnableRolling() {
        return this.ScaleUpEnableRolling;
    }

    /**
     * Set 是否滚动重启，false为不滚动重启，true为滚动重启
     * @param ScaleUpEnableRolling 是否滚动重启，false为不滚动重启，true为滚动重启
     */
    public void setScaleUpEnableRolling(Boolean ScaleUpEnableRolling) {
        this.ScaleUpEnableRolling = ScaleUpEnableRolling;
    }

    public ScaleUpInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleUpInstanceRequest(ScaleUpInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.ScaleUpEnableRolling != null) {
            this.ScaleUpEnableRolling = new Boolean(source.ScaleUpEnableRolling);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "ScaleUpEnableRolling", this.ScaleUpEnableRolling);

    }
}

