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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GooseFSConfig extends AbstractModel {

    /**
    * <p>goosefs集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>goosefs命名空间名称</p>
    */
    @SerializedName("GooseFSPath")
    @Expose
    private String GooseFSPath;

    /**
    * <p>主从节点信息</p>
    */
    @SerializedName("MasterAddresses")
    @Expose
    private String [] MasterAddresses;

    /**
     * Get <p>goosefs集群id</p> 
     * @return ClusterId <p>goosefs集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>goosefs集群id</p>
     * @param ClusterId <p>goosefs集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>goosefs命名空间名称</p> 
     * @return GooseFSPath <p>goosefs命名空间名称</p>
     */
    public String getGooseFSPath() {
        return this.GooseFSPath;
    }

    /**
     * Set <p>goosefs命名空间名称</p>
     * @param GooseFSPath <p>goosefs命名空间名称</p>
     */
    public void setGooseFSPath(String GooseFSPath) {
        this.GooseFSPath = GooseFSPath;
    }

    /**
     * Get <p>主从节点信息</p> 
     * @return MasterAddresses <p>主从节点信息</p>
     */
    public String [] getMasterAddresses() {
        return this.MasterAddresses;
    }

    /**
     * Set <p>主从节点信息</p>
     * @param MasterAddresses <p>主从节点信息</p>
     */
    public void setMasterAddresses(String [] MasterAddresses) {
        this.MasterAddresses = MasterAddresses;
    }

    public GooseFSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GooseFSConfig(GooseFSConfig source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GooseFSPath != null) {
            this.GooseFSPath = new String(source.GooseFSPath);
        }
        if (source.MasterAddresses != null) {
            this.MasterAddresses = new String[source.MasterAddresses.length];
            for (int i = 0; i < source.MasterAddresses.length; i++) {
                this.MasterAddresses[i] = new String(source.MasterAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GooseFSPath", this.GooseFSPath);
        this.setParamArraySimple(map, prefix + "MasterAddresses.", this.MasterAddresses);

    }
}

