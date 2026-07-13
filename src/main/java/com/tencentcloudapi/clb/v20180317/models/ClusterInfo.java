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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfo extends AbstractModel {

    /**
    * <p>独占集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群类型</p><p>枚举值：</p><ul><li>Public： 公有云集群</li><li>Exclusive： 独占集群</li></ul><p>默认值：Public</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>独占集群ID</p> 
     * @return ClusterId <p>独占集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>独占集群ID</p>
     * @param ClusterId <p>独占集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群类型</p><p>枚举值：</p><ul><li>Public： 公有云集群</li><li>Exclusive： 独占集群</li></ul><p>默认值：Public</p> 
     * @return Type <p>集群类型</p><p>枚举值：</p><ul><li>Public： 公有云集群</li><li>Exclusive： 独占集群</li></ul><p>默认值：Public</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>集群类型</p><p>枚举值：</p><ul><li>Public： 公有云集群</li><li>Exclusive： 独占集群</li></ul><p>默认值：Public</p>
     * @param Type <p>集群类型</p><p>枚举值：</p><ul><li>Public： 公有云集群</li><li>Exclusive： 独占集群</li></ul><p>默认值：Public</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public ClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfo(ClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

