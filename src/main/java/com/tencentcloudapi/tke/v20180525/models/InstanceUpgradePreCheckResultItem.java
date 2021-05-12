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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceUpgradePreCheckResultItem extends AbstractModel{

    /**
    * 工作负载的命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 工作负载类型
    */
    @SerializedName("WorkLoadKind")
    @Expose
    private String WorkLoadKind;

    /**
    * 工作负载名称
    */
    @SerializedName("WorkLoadName")
    @Expose
    private String WorkLoadName;

    /**
    * 驱逐节点前工作负载running的pod数目
    */
    @SerializedName("Before")
    @Expose
    private Long Before;

    /**
    * 驱逐节点后工作负载running的pod数目
    */
    @SerializedName("After")
    @Expose
    private Long After;

    /**
    * 工作负载在本节点上的pod列表
    */
    @SerializedName("Pods")
    @Expose
    private String [] Pods;

    /**
     * Get 工作负载的命名空间 
     * @return Namespace 工作负载的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 工作负载的命名空间
     * @param Namespace 工作负载的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 工作负载类型 
     * @return WorkLoadKind 工作负载类型
     */
    public String getWorkLoadKind() {
        return this.WorkLoadKind;
    }

    /**
     * Set 工作负载类型
     * @param WorkLoadKind 工作负载类型
     */
    public void setWorkLoadKind(String WorkLoadKind) {
        this.WorkLoadKind = WorkLoadKind;
    }

    /**
     * Get 工作负载名称 
     * @return WorkLoadName 工作负载名称
     */
    public String getWorkLoadName() {
        return this.WorkLoadName;
    }

    /**
     * Set 工作负载名称
     * @param WorkLoadName 工作负载名称
     */
    public void setWorkLoadName(String WorkLoadName) {
        this.WorkLoadName = WorkLoadName;
    }

    /**
     * Get 驱逐节点前工作负载running的pod数目 
     * @return Before 驱逐节点前工作负载running的pod数目
     */
    public Long getBefore() {
        return this.Before;
    }

    /**
     * Set 驱逐节点前工作负载running的pod数目
     * @param Before 驱逐节点前工作负载running的pod数目
     */
    public void setBefore(Long Before) {
        this.Before = Before;
    }

    /**
     * Get 驱逐节点后工作负载running的pod数目 
     * @return After 驱逐节点后工作负载running的pod数目
     */
    public Long getAfter() {
        return this.After;
    }

    /**
     * Set 驱逐节点后工作负载running的pod数目
     * @param After 驱逐节点后工作负载running的pod数目
     */
    public void setAfter(Long After) {
        this.After = After;
    }

    /**
     * Get 工作负载在本节点上的pod列表 
     * @return Pods 工作负载在本节点上的pod列表
     */
    public String [] getPods() {
        return this.Pods;
    }

    /**
     * Set 工作负载在本节点上的pod列表
     * @param Pods 工作负载在本节点上的pod列表
     */
    public void setPods(String [] Pods) {
        this.Pods = Pods;
    }

    public InstanceUpgradePreCheckResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceUpgradePreCheckResultItem(InstanceUpgradePreCheckResultItem source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.WorkLoadKind != null) {
            this.WorkLoadKind = new String(source.WorkLoadKind);
        }
        if (source.WorkLoadName != null) {
            this.WorkLoadName = new String(source.WorkLoadName);
        }
        if (source.Before != null) {
            this.Before = new Long(source.Before);
        }
        if (source.After != null) {
            this.After = new Long(source.After);
        }
        if (source.Pods != null) {
            this.Pods = new String[source.Pods.length];
            for (int i = 0; i < source.Pods.length; i++) {
                this.Pods[i] = new String(source.Pods[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "WorkLoadKind", this.WorkLoadKind);
        this.setParamSimple(map, prefix + "WorkLoadName", this.WorkLoadName);
        this.setParamSimple(map, prefix + "Before", this.Before);
        this.setParamSimple(map, prefix + "After", this.After);
        this.setParamArraySimple(map, prefix + "Pods.", this.Pods);

    }
}

