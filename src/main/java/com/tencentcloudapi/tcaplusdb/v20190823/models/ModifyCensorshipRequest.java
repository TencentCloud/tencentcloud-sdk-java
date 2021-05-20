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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCensorshipRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群是否开启审核 0-关闭 1-开启
    */
    @SerializedName("Censorship")
    @Expose
    private Long Censorship;

    /**
    * 审批人uin列表
    */
    @SerializedName("Uins")
    @Expose
    private String [] Uins;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群是否开启审核 0-关闭 1-开启 
     * @return Censorship 集群是否开启审核 0-关闭 1-开启
     */
    public Long getCensorship() {
        return this.Censorship;
    }

    /**
     * Set 集群是否开启审核 0-关闭 1-开启
     * @param Censorship 集群是否开启审核 0-关闭 1-开启
     */
    public void setCensorship(Long Censorship) {
        this.Censorship = Censorship;
    }

    /**
     * Get 审批人uin列表 
     * @return Uins 审批人uin列表
     */
    public String [] getUins() {
        return this.Uins;
    }

    /**
     * Set 审批人uin列表
     * @param Uins 审批人uin列表
     */
    public void setUins(String [] Uins) {
        this.Uins = Uins;
    }

    public ModifyCensorshipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCensorshipRequest(ModifyCensorshipRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Censorship != null) {
            this.Censorship = new Long(source.Censorship);
        }
        if (source.Uins != null) {
            this.Uins = new String[source.Uins.length];
            for (int i = 0; i < source.Uins.length; i++) {
                this.Uins[i] = new String(source.Uins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Censorship", this.Censorship);
        this.setParamArraySimple(map, prefix + "Uins.", this.Uins);

    }
}

