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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleInstanceRelation extends AbstractModel{

    /**
    * 资源实例的IP
    */
    @SerializedName("EipList")
    @Expose
    private String [] EipList;

    /**
    * 资源实例的ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资源实例的Cname
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
     * Get 资源实例的IP 
     * @return EipList 资源实例的IP
     */
    public String [] getEipList() {
        return this.EipList;
    }

    /**
     * Set 资源实例的IP
     * @param EipList 资源实例的IP
     */
    public void setEipList(String [] EipList) {
        this.EipList = EipList;
    }

    /**
     * Get 资源实例的ID 
     * @return InstanceId 资源实例的ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例的ID
     * @param InstanceId 资源实例的ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资源实例的Cname 
     * @return Cname 资源实例的Cname
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 资源实例的Cname
     * @param Cname 资源实例的Cname
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public RuleInstanceRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInstanceRelation(RuleInstanceRelation source) {
        if (source.EipList != null) {
            this.EipList = new String[source.EipList.length];
            for (int i = 0; i < source.EipList.length; i++) {
                this.EipList[i] = new String(source.EipList[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EipList.", this.EipList);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cname", this.Cname);

    }
}

